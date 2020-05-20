package p147g.p156d.p157a.p167b.p183f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.p050o.C2170a;
import com.google.android.gms.common.util.C2199n;
import com.google.android.gms.common.util.C2201p;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: g.d.a.b.f.a */
public class C4336a {

    /* renamed from: l */
    private static ScheduledExecutorService f11499l;

    /* renamed from: a */
    private final Object f11500a;

    /* renamed from: b */
    private final WakeLock f11501b;

    /* renamed from: c */
    private WorkSource f11502c;

    /* renamed from: d */
    private final int f11503d;

    /* renamed from: e */
    private final String f11504e;

    /* renamed from: f */
    private final String f11505f;

    /* renamed from: g */
    private final Context f11506g;

    /* renamed from: h */
    private boolean f11507h;

    /* renamed from: i */
    private final Map<String, Integer[]> f11508i;

    /* renamed from: j */
    private int f11509j;

    /* renamed from: k */
    private AtomicInteger f11510k;

    static {
        new C4337b();
    }

    public C4336a(Context context, int i, String str) {
        this(context, i, str, null, context == null ? null : context.getPackageName());
    }

    private C4336a(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, null, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private C4336a(Context context, int i, String str, String str2, String str3, String str4) {
        this.f11500a = this;
        this.f11507h = true;
        this.f11508i = new HashMap();
        Collections.synchronizedSet(new HashSet());
        this.f11510k = new AtomicInteger(0);
        C2148s.m8835a(context, (Object) "WakeLock: context must not be null");
        C2148s.m8836a(str, (Object) "WakeLock: wakeLockName must not be empty");
        this.f11503d = i;
        this.f11505f = null;
        this.f11506g = context.getApplicationContext();
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String str5 = "*gcore*:";
            String valueOf = String.valueOf(str);
            this.f11504e = valueOf.length() != 0 ? str5.concat(valueOf) : new String(str5);
        } else {
            this.f11504e = str;
        }
        this.f11501b = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (C2201p.m9021a(context)) {
            if (C2199n.m9012a(str3)) {
                str3 = context.getPackageName();
            }
            WorkSource a = C2201p.m9016a(context, str3);
            this.f11502c = a;
            if (a != null && C2201p.m9021a(this.f11506g)) {
                WorkSource workSource = this.f11502c;
                if (workSource != null) {
                    workSource.add(a);
                } else {
                    this.f11502c = a;
                }
                try {
                    this.f11501b.setWorkSource(this.f11502c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (f11499l == null) {
            f11499l = C2170a.m8926a().mo6956a();
        }
    }

    /* renamed from: a */
    private final String m17698a(String str) {
        return this.f11507h ? !TextUtils.isEmpty(str) ? str : this.f11505f : this.f11505f;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17699a(int i) {
        if (this.f11501b.isHeld()) {
            try {
                this.f11501b.release();
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.f11504e).concat(" was already released!"), e);
                } else {
                    throw e;
                }
            }
            this.f11501b.isHeld();
        }
    }

    /* renamed from: b */
    private final List<String> m17701b() {
        return C2201p.m9019a(this.f11502c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r1 != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r12.f11509j == 1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        com.google.android.gms.common.stats.C2182d.m8960a().mo6979a(r12.f11506g, com.google.android.gms.common.stats.C2181c.m8957a(r12.f11501b, r6), 8, r12.f11504e, r6, null, r12.f11503d, m17701b());
        r12.f11509j--;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12996a() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.f11510k
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L_0x0019
            java.lang.String r0 = r12.f11504e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = " release without a matched acquire!"
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "WakeLock"
            android.util.Log.e(r1, r0)
        L_0x0019:
            r0 = 0
            java.lang.String r6 = r12.m17698a(r0)
            java.lang.Object r0 = r12.f11500a
            monitor-enter(r0)
            boolean r1 = r12.f11507h     // Catch:{ all -> 0x007e }
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L_0x0052
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f11508i     // Catch:{ all -> 0x007e }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x007e }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0033
        L_0x0031:
            r1 = 0
            goto L_0x0050
        L_0x0033:
            r2 = r1[r11]     // Catch:{ all -> 0x007e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x007e }
            if (r2 != r10) goto L_0x0042
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f11508i     // Catch:{ all -> 0x007e }
            r1.remove(r6)     // Catch:{ all -> 0x007e }
            r1 = 1
            goto L_0x0050
        L_0x0042:
            r2 = r1[r11]     // Catch:{ all -> 0x007e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x007e }
            int r2 = r2 - r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x007e }
            r1[r11] = r2     // Catch:{ all -> 0x007e }
            goto L_0x0031
        L_0x0050:
            if (r1 != 0) goto L_0x005a
        L_0x0052:
            boolean r1 = r12.f11507h     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0079
            int r1 = r12.f11509j     // Catch:{ all -> 0x007e }
            if (r1 != r10) goto L_0x0079
        L_0x005a:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.C2182d.m8960a()     // Catch:{ all -> 0x007e }
            android.content.Context r2 = r12.f11506g     // Catch:{ all -> 0x007e }
            android.os.PowerManager$WakeLock r3 = r12.f11501b     // Catch:{ all -> 0x007e }
            java.lang.String r3 = com.google.android.gms.common.stats.C2181c.m8957a(r3, r6)     // Catch:{ all -> 0x007e }
            r4 = 8
            java.lang.String r5 = r12.f11504e     // Catch:{ all -> 0x007e }
            r7 = 0
            int r8 = r12.f11503d     // Catch:{ all -> 0x007e }
            java.util.List r9 = r12.m17701b()     // Catch:{ all -> 0x007e }
            r1.mo6979a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x007e }
            int r1 = r12.f11509j     // Catch:{ all -> 0x007e }
            int r1 = r1 - r10
            r12.f11509j = r1     // Catch:{ all -> 0x007e }
        L_0x0079:
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            r12.m17699a(r11)
            return
        L_0x007e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p167b.p183f.C4336a.mo12996a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r2 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r13.f11509j == 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        com.google.android.gms.common.stats.C2182d.m8960a().mo6980a(r13.f11506g, com.google.android.gms.common.stats.C2181c.m8957a(r13.f11501b, r6), 7, r13.f11504e, r6, null, r13.f11503d, m17701b(), r14);
        r13.f11509j++;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12997a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.f11510k
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.m17698a(r0)
            java.lang.Object r0 = r13.f11500a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f11508i     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0096 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            int r1 = r13.f11509j     // Catch:{ all -> 0x0096 }
            if (r1 <= 0) goto L_0x0029
        L_0x001a:
            android.os.PowerManager$WakeLock r1 = r13.f11501b     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isHeld()     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0029
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f11508i     // Catch:{ all -> 0x0096 }
            r1.clear()     // Catch:{ all -> 0x0096 }
            r13.f11509j = r2     // Catch:{ all -> 0x0096 }
        L_0x0029:
            boolean r1 = r13.f11507h     // Catch:{ all -> 0x0096 }
            r12 = 1
            if (r1 == 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f11508i     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0096 }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0047
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f11508i     // Catch:{ all -> 0x0096 }
            java.lang.Integer[] r3 = new java.lang.Integer[r12]     // Catch:{ all -> 0x0096 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0096 }
            r3[r2] = r4     // Catch:{ all -> 0x0096 }
            r1.put(r6, r3)     // Catch:{ all -> 0x0096 }
            r2 = 1
            goto L_0x0054
        L_0x0047:
            r3 = r1[r2]     // Catch:{ all -> 0x0096 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0096 }
            int r3 = r3 + r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0096 }
            r1[r2] = r3     // Catch:{ all -> 0x0096 }
        L_0x0054:
            if (r2 != 0) goto L_0x005e
        L_0x0056:
            boolean r1 = r13.f11507h     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x007d
            int r1 = r13.f11509j     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x007d
        L_0x005e:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.C2182d.m8960a()     // Catch:{ all -> 0x0096 }
            android.content.Context r2 = r13.f11506g     // Catch:{ all -> 0x0096 }
            android.os.PowerManager$WakeLock r3 = r13.f11501b     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = com.google.android.gms.common.stats.C2181c.m8957a(r3, r6)     // Catch:{ all -> 0x0096 }
            r4 = 7
            java.lang.String r5 = r13.f11504e     // Catch:{ all -> 0x0096 }
            r7 = 0
            int r8 = r13.f11503d     // Catch:{ all -> 0x0096 }
            java.util.List r9 = r13.m17701b()     // Catch:{ all -> 0x0096 }
            r10 = r14
            r1.mo6980a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0096 }
            int r1 = r13.f11509j     // Catch:{ all -> 0x0096 }
            int r1 = r1 + r12
            r13.f11509j = r1     // Catch:{ all -> 0x0096 }
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            android.os.PowerManager$WakeLock r0 = r13.f11501b
            r0.acquire()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0095
            java.util.concurrent.ScheduledExecutorService r0 = f11499l
            g.d.a.b.f.c r1 = new g.d.a.b.f.c
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L_0x0095:
            return
        L_0x0096:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p167b.p183f.C4336a.mo12997a(long):void");
    }

    /* renamed from: a */
    public void mo12998a(boolean z) {
        this.f11501b.setReferenceCounted(z);
        this.f11507h = z;
    }
}
