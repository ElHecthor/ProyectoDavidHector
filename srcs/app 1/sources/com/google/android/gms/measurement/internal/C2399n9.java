package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.p051p.C2175c;
import com.google.android.gms.common.util.C2190e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p071f.p088e.C3162a;
import p147g.p156d.p157a.p167b.p173d.p180g.C3909a1;
import p147g.p156d.p157a.p167b.p173d.p180g.C3909a1.C3910a;
import p147g.p156d.p157a.p167b.p173d.p180g.C3941c1;
import p147g.p156d.p157a.p167b.p173d.p180g.C3941c1.C3942a;
import p147g.p156d.p157a.p167b.p173d.p180g.C3953ca;
import p147g.p156d.p157a.p167b.p173d.p180g.C4012g1;
import p147g.p156d.p157a.p167b.p173d.p180g.C4012g1.C4013a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4157pa;
import p147g.p156d.p157a.p167b.p173d.p180g.C4194s0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4;
import p147g.p156d.p157a.p167b.p173d.p180g.C4289y0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4289y0.C4290a;

/* renamed from: com.google.android.gms.measurement.internal.n9 */
public class C2399n9 implements C2240a6 {

    /* renamed from: x */
    private static volatile C2399n9 f6726x;

    /* renamed from: a */
    private C2506x4 f6727a;

    /* renamed from: b */
    private C2310g4 f6728b;

    /* renamed from: c */
    private C2257c f6729c;

    /* renamed from: d */
    private C2346j4 f6730d;

    /* renamed from: e */
    private C2351j9 f6731e;

    /* renamed from: f */
    private C2292ea f6732f;

    /* renamed from: g */
    private final C2445r9 f6733g;

    /* renamed from: h */
    private C2385m7 f6734h;

    /* renamed from: i */
    private final C2263c5 f6735i;

    /* renamed from: j */
    private boolean f6736j;

    /* renamed from: k */
    private boolean f6737k;

    /* renamed from: l */
    private long f6738l;

    /* renamed from: m */
    private List<Runnable> f6739m;

    /* renamed from: n */
    private int f6740n;

    /* renamed from: o */
    private int f6741o;

    /* renamed from: p */
    private boolean f6742p;

    /* renamed from: q */
    private boolean f6743q;

    /* renamed from: r */
    private boolean f6744r;

    /* renamed from: s */
    private FileLock f6745s;

    /* renamed from: t */
    private FileChannel f6746t;

    /* renamed from: u */
    private List<Long> f6747u;

    /* renamed from: v */
    private List<Long> f6748v;

    /* renamed from: w */
    private long f6749w;

    /* renamed from: com.google.android.gms.measurement.internal.n9$a */
    class C2400a implements C2281e {

        /* renamed from: a */
        C3941c1 f6750a;

        /* renamed from: b */
        List<Long> f6751b;

        /* renamed from: c */
        List<C4289y0> f6752c;

        /* renamed from: d */
        private long f6753d;

        private C2400a(C2399n9 n9Var) {
        }

        /* synthetic */ C2400a(C2399n9 n9Var, C2387m9 m9Var) {
            this(n9Var);
        }

        /* renamed from: a */
        private static long m9714a(C4289y0 y0Var) {
            return ((y0Var.mo12914t() / 1000) / 60) / 60;
        }

        /* renamed from: a */
        public final void mo7240a(C3941c1 c1Var) {
            C2148s.m8834a(c1Var);
            this.f6750a = c1Var;
        }

        /* renamed from: a */
        public final boolean mo7241a(long j, C4289y0 y0Var) {
            C2148s.m8834a(y0Var);
            if (this.f6752c == null) {
                this.f6752c = new ArrayList();
            }
            if (this.f6751b == null) {
                this.f6751b = new ArrayList();
            }
            if (this.f6752c.size() > 0 && m9714a((C4289y0) this.f6752c.get(0)) != m9714a(y0Var)) {
                return false;
            }
            long j2 = this.f6753d + ((long) y0Var.mo12434j());
            if (j2 >= ((long) Math.max(0, ((Integer) C2457t.f6922i.mo7587a(null)).intValue()))) {
                return false;
            }
            this.f6753d = j2;
            this.f6752c.add(y0Var);
            this.f6751b.add(Long.valueOf(j));
            return this.f6752c.size() < Math.max(1, ((Integer) C2457t.f6924j.mo7587a(null)).intValue());
        }
    }

    private C2399n9(C2456s9 s9Var) {
        this(s9Var, null);
    }

    private C2399n9(C2456s9 s9Var, C2263c5 c5Var) {
        this.f6736j = false;
        C2148s.m8834a(s9Var);
        this.f6735i = C2263c5.m9228a(s9Var.f6861a, null, null);
        this.f6749w = -1;
        C2445r9 r9Var = new C2445r9(this);
        r9Var.mo7460s();
        this.f6733g = r9Var;
        C2310g4 g4Var = new C2310g4(this);
        g4Var.mo7460s();
        this.f6728b = g4Var;
        C2506x4 x4Var = new C2506x4(this);
        x4Var.mo7460s();
        this.f6727a = x4Var;
        this.f6735i.mo7097i().mo7841a((Runnable) new C2387m9(this, s9Var));
    }

    /* renamed from: A */
    private final boolean m9650A() {
        m9675y();
        mo7557p();
        return mo7551e().mo7145E() || !TextUtils.isEmpty(mo7551e().mo7184w());
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018e  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9651B() {
        /*
            r21 = this;
            r0 = r21
            r21.m9675y()
            r21.mo7557p()
            long r1 = r0.f6738l
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            com.google.android.gms.measurement.internal.c5 r1 = r0.f6735i
            com.google.android.gms.common.util.e r1 = r1.mo7095g()
            long r1 = r1.mo6989c()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.f6738l
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            com.google.android.gms.measurement.internal.c5 r1 = r0.f6735i
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo7098j()
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7810B()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.mo7089a(r3, r2)
            com.google.android.gms.measurement.internal.j4 r1 = r21.m9673w()
            r1.mo7405b()
            com.google.android.gms.measurement.internal.j9 r1 = r21.m9674x()
            r1.mo7449u()
            return
        L_0x004b:
            r0.f6738l = r3
        L_0x004d:
            com.google.android.gms.measurement.internal.c5 r1 = r0.f6735i
            boolean r1 = r1.mo7209m()
            if (r1 == 0) goto L_0x0239
            boolean r1 = r21.m9650A()
            if (r1 != 0) goto L_0x005d
            goto L_0x0239
        L_0x005d:
            com.google.android.gms.measurement.internal.c5 r1 = r0.f6735i
            com.google.android.gms.common.util.e r1 = r1.mo7095g()
            long r1 = r1.mo6988b()
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C2457t.f6862A
            r6 = 0
            java.lang.Object r5 = r5.mo7587a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.c r5 = r21.mo7551e()
            boolean r5 = r5.mo7146F()
            if (r5 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.c r5 = r21.mo7551e()
            boolean r5 = r5.mo7141A()
            if (r5 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r5 = 0
            goto L_0x0090
        L_0x008f:
            r5 = 1
        L_0x0090:
            if (r5 == 0) goto L_0x00b0
            com.google.android.gms.measurement.internal.c5 r10 = r0.f6735i
            com.google.android.gms.measurement.internal.b r10 = r10.mo7211o()
            java.lang.String r10 = r10.mo7127t()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00ad
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ad
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C2457t.f6948v
            goto L_0x00b2
        L_0x00ad:
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C2457t.f6946u
            goto L_0x00b2
        L_0x00b0:
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C2457t.f6944t
        L_0x00b2:
            java.lang.Object r10 = r10.mo7587a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            com.google.android.gms.measurement.internal.c5 r12 = r0.f6735i
            com.google.android.gms.measurement.internal.l4 r12 = r12.mo7212p()
            com.google.android.gms.measurement.internal.p4 r12 = r12.f6622e
            long r12 = r12.mo7570a()
            com.google.android.gms.measurement.internal.c5 r14 = r0.f6735i
            com.google.android.gms.measurement.internal.l4 r14 = r14.mo7212p()
            com.google.android.gms.measurement.internal.p4 r14 = r14.f6623f
            long r14 = r14.mo7570a()
            com.google.android.gms.measurement.internal.c r16 = r21.mo7551e()
            r17 = r10
            long r9 = r16.mo7143C()
            com.google.android.gms.measurement.internal.c r11 = r21.mo7551e()
            r19 = r7
            long r6 = r11.mo7144D()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00f7
        L_0x00f4:
            r10 = r3
            goto L_0x016c
        L_0x00f7:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x011d
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x011d
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x011d:
            com.google.android.gms.measurement.internal.r9 r5 = r21.mo7554m()
            r12 = r17
            boolean r5 = r5.mo7613a(r8, r12)
            if (r5 != 0) goto L_0x012b
            long r10 = r8 + r12
        L_0x012b:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x016c
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x016c
            r5 = 0
        L_0x0134:
            r6 = 20
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C2457t.f6866C
            r8 = 0
            java.lang.Object r7 = r7.mo7587a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r9 = 0
            int r7 = java.lang.Math.max(r9, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x00f4
            r6 = 1
            long r6 = r6 << r5
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r12 = com.google.android.gms.measurement.internal.C2457t.f6864B
            java.lang.Object r12 = r12.mo7587a(r8)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r10 = r10 + r12
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0169
            goto L_0x016c
        L_0x0169:
            int r5 = r5 + 1
            goto L_0x0134
        L_0x016c:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x018e
            com.google.android.gms.measurement.internal.c5 r1 = r0.f6735i
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo7098j()
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7810B()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo7088a(r2)
            com.google.android.gms.measurement.internal.j4 r1 = r21.m9673w()
            r1.mo7405b()
            com.google.android.gms.measurement.internal.j9 r1 = r21.m9674x()
            r1.mo7449u()
            return
        L_0x018e:
            com.google.android.gms.measurement.internal.g4 r1 = r21.mo7549d()
            boolean r1 = r1.mo7355u()
            if (r1 != 0) goto L_0x01b6
            com.google.android.gms.measurement.internal.c5 r1 = r0.f6735i
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo7098j()
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7810B()
            java.lang.String r2 = "No network"
            r1.mo7088a(r2)
            com.google.android.gms.measurement.internal.j4 r1 = r21.m9673w()
            r1.mo7404a()
            com.google.android.gms.measurement.internal.j9 r1 = r21.m9674x()
            r1.mo7449u()
            return
        L_0x01b6:
            com.google.android.gms.measurement.internal.c5 r1 = r0.f6735i
            com.google.android.gms.measurement.internal.l4 r1 = r1.mo7212p()
            com.google.android.gms.measurement.internal.p4 r1 = r1.f6624g
            long r1 = r1.mo7570a()
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C2457t.f6940r
            r6 = 0
            java.lang.Object r5 = r5.mo7587a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.r9 r7 = r21.mo7554m()
            boolean r7 = r7.mo7613a(r1, r5)
            if (r7 != 0) goto L_0x01e2
            long r1 = r1 + r5
            long r10 = java.lang.Math.max(r10, r1)
        L_0x01e2:
            com.google.android.gms.measurement.internal.j4 r1 = r21.m9673w()
            r1.mo7405b()
            com.google.android.gms.measurement.internal.c5 r1 = r0.f6735i
            com.google.android.gms.common.util.e r1 = r1.mo7095g()
            long r1 = r1.mo6988b()
            long r10 = r10 - r1
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x021e
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r1 = com.google.android.gms.measurement.internal.C2457t.f6950w
            r2 = 0
            java.lang.Object r1 = r1.mo7587a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r10 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.c5 r1 = r0.f6735i
            com.google.android.gms.measurement.internal.l4 r1 = r1.mo7212p()
            com.google.android.gms.measurement.internal.p4 r1 = r1.f6622e
            com.google.android.gms.measurement.internal.c5 r2 = r0.f6735i
            com.google.android.gms.common.util.e r2 = r2.mo7095g()
            long r2 = r2.mo6988b()
            r1.mo7571a(r2)
        L_0x021e:
            com.google.android.gms.measurement.internal.c5 r1 = r0.f6735i
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo7098j()
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7810B()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.mo7089a(r3, r2)
            com.google.android.gms.measurement.internal.j9 r1 = r21.m9674x()
            r1.mo7448a(r10)
            return
        L_0x0239:
            com.google.android.gms.measurement.internal.c5 r1 = r0.f6735i
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo7098j()
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7810B()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo7088a(r2)
            com.google.android.gms.measurement.internal.j4 r1 = r21.m9673w()
            r1.mo7405b()
            com.google.android.gms.measurement.internal.j9 r1 = r21.m9674x()
            r1.mo7449u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2399n9.m9651B():void");
    }

    /* renamed from: a */
    private final int m9652a(FileChannel fileChannel) {
        m9675y();
        int i = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f6735i.mo7098j().mo7815t().mo7088a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.f6735i.mo7098j().mo7818w().mo7089a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            i = allocate.getInt();
            return i;
        } catch (IOException e) {
            this.f6735i.mo7098j().mo7815t().mo7089a("Failed to read from channel", e);
        }
    }

    /* renamed from: a */
    private final C2244aa m9653a(String str) {
        String str2 = str;
        C2299f5 b = mo7551e().mo7166b(str2);
        if (b == null || TextUtils.isEmpty(b.mo7342u())) {
            this.f6735i.mo7098j().mo7809A().mo7089a("No app data available; dropping", str2);
            return null;
        }
        Boolean b2 = m9666b(b);
        if (b2 == null || b2.booleanValue()) {
            C2244aa aaVar = new C2244aa(str, b.mo7332n(), b.mo7342u(), b.mo7343v(), b.mo7344w(), b.mo7345x(), b.mo7346y(), (String) null, b.mo7283A(), false, b.mo7339r(), b.mo7312f(), 0, 0, b.mo7317g(), b.mo7320h(), false, b.mo7334o(), b.mo7321i(), b.mo7347z(), b.mo7324j(), (!C4157pa.m16931b() || !this.f6735i.mo7211o().mo7116e(str2, C2457t.f6937p0)) ? null : b.mo7336p());
            return aaVar;
        }
        this.f6735i.mo7098j().mo7815t().mo7089a("App version does not match; dropping. appId", C2516y3.m10125a(str));
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.measurement.internal.C2299f5 m9654a(com.google.android.gms.measurement.internal.C2244aa r9, com.google.android.gms.measurement.internal.C2299f5 r10, java.lang.String r11) {
        /*
            r8 = this;
            r0 = 1
            if (r10 != 0) goto L_0x001e
            com.google.android.gms.measurement.internal.f5 r10 = new com.google.android.gms.measurement.internal.f5
            com.google.android.gms.measurement.internal.c5 r1 = r8.f6735i
            java.lang.String r2 = r9.f6243f
            r10.<init>(r1, r2)
            com.google.android.gms.measurement.internal.c5 r1 = r8.f6735i
            com.google.android.gms.measurement.internal.v9 r1 = r1.mo7218v()
            java.lang.String r1 = r1.mo7714w()
            r10.mo7294a(r1)
            r10.mo7311e(r11)
        L_0x001c:
            r11 = 1
            goto L_0x003a
        L_0x001e:
            java.lang.String r1 = r10.mo7338q()
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x0039
            r10.mo7311e(r11)
            com.google.android.gms.measurement.internal.c5 r11 = r8.f6735i
            com.google.android.gms.measurement.internal.v9 r11 = r11.mo7218v()
            java.lang.String r11 = r11.mo7714w()
            r10.mo7294a(r11)
            goto L_0x001c
        L_0x0039:
            r11 = 0
        L_0x003a:
            java.lang.String r1 = r9.f6244g
            java.lang.String r2 = r10.mo7332n()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x004c
            java.lang.String r11 = r9.f6244g
            r10.mo7300b(r11)
            r11 = 1
        L_0x004c:
            java.lang.String r1 = r9.f6260w
            java.lang.String r2 = r10.mo7334o()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x005e
            java.lang.String r11 = r9.f6260w
            r10.mo7304c(r11)
            r11 = 1
        L_0x005e:
            boolean r1 = p147g.p156d.p157a.p167b.p173d.p180g.C4157pa.m16931b()
            if (r1 == 0) goto L_0x0088
            com.google.android.gms.measurement.internal.c5 r1 = r8.f6735i
            com.google.android.gms.measurement.internal.b r1 = r1.mo7211o()
            java.lang.String r2 = r10.mo7328l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C2457t.f6937p0
            boolean r1 = r1.mo7116e(r2, r3)
            if (r1 == 0) goto L_0x0088
            java.lang.String r1 = r9.f6242A
            java.lang.String r2 = r10.mo7336p()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0088
            java.lang.String r11 = r9.f6242A
            r10.mo7308d(r11)
            r11 = 1
        L_0x0088:
            java.lang.String r1 = r9.f6253p
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00a2
            java.lang.String r1 = r9.f6253p
            java.lang.String r2 = r10.mo7339r()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00a2
            java.lang.String r11 = r9.f6253p
            r10.mo7314f(r11)
            r11 = 1
        L_0x00a2:
            long r1 = r9.f6247j
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00b8
            long r5 = r10.mo7345x()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b8
            long r1 = r9.f6247j
            r10.mo7307d(r1)
            r11 = 1
        L_0x00b8:
            java.lang.String r1 = r9.f6245h
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00d2
            java.lang.String r1 = r9.f6245h
            java.lang.String r2 = r10.mo7342u()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00d2
            java.lang.String r11 = r9.f6245h
            r10.mo7316g(r11)
            r11 = 1
        L_0x00d2:
            long r1 = r9.f6252o
            long r5 = r10.mo7343v()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00e2
            long r1 = r9.f6252o
            r10.mo7303c(r1)
            r11 = 1
        L_0x00e2:
            java.lang.String r1 = r9.f6246i
            if (r1 == 0) goto L_0x00f6
            java.lang.String r2 = r10.mo7344w()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00f6
            java.lang.String r11 = r9.f6246i
            r10.mo7319h(r11)
            r11 = 1
        L_0x00f6:
            long r1 = r9.f6248k
            long r5 = r10.mo7346y()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0106
            long r1 = r9.f6248k
            r10.mo7310e(r1)
            r11 = 1
        L_0x0106:
            boolean r1 = r9.f6250m
            boolean r2 = r10.mo7283A()
            if (r1 == r2) goto L_0x0114
            boolean r11 = r9.f6250m
            r10.mo7296a(r11)
            r11 = 1
        L_0x0114:
            java.lang.String r1 = r9.f6249l
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x012e
            java.lang.String r1 = r9.f6249l
            java.lang.String r2 = r10.mo7306d()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x012e
            java.lang.String r11 = r9.f6249l
            r10.mo7323i(r11)
            r11 = 1
        L_0x012e:
            com.google.android.gms.measurement.internal.c5 r1 = r8.f6735i
            com.google.android.gms.measurement.internal.b r1 = r1.mo7211o()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C2457t.f6889N0
            boolean r1 = r1.mo7108a(r2)
            if (r1 != 0) goto L_0x014c
            long r1 = r9.f6254q
            long r5 = r10.mo7312f()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x014c
            long r1 = r9.f6254q
            r10.mo7337p(r1)
            r11 = 1
        L_0x014c:
            boolean r1 = r9.f6257t
            boolean r2 = r10.mo7317g()
            if (r1 == r2) goto L_0x015a
            boolean r11 = r9.f6257t
            r10.mo7301b(r11)
            r11 = 1
        L_0x015a:
            boolean r1 = r9.f6258u
            boolean r2 = r10.mo7320h()
            if (r1 == r2) goto L_0x0168
            boolean r11 = r9.f6258u
            r10.mo7305c(r11)
            r11 = 1
        L_0x0168:
            java.lang.Boolean r1 = r9.f6261x
            java.lang.Boolean r2 = r10.mo7321i()
            if (r1 == r2) goto L_0x0176
            java.lang.Boolean r11 = r9.f6261x
            r10.mo7293a(r11)
            r11 = 1
        L_0x0176:
            long r1 = r9.f6262y
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018a
            long r3 = r10.mo7347z()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018a
            long r1 = r9.f6262y
            r10.mo7313f(r1)
            goto L_0x018b
        L_0x018a:
            r0 = r11
        L_0x018b:
            if (r0 == 0) goto L_0x0194
            com.google.android.gms.measurement.internal.c r9 = r8.mo7551e()
            r9.mo7157a(r10)
        L_0x0194:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2399n9.m9654a(com.google.android.gms.measurement.internal.aa, com.google.android.gms.measurement.internal.f5, java.lang.String):com.google.android.gms.measurement.internal.f5");
    }

    /* renamed from: a */
    public static C2399n9 m9655a(Context context) {
        C2148s.m8834a(context);
        C2148s.m8834a(context.getApplicationContext());
        if (f6726x == null) {
            synchronized (C2399n9.class) {
                if (f6726x == null) {
                    f6726x = new C2399n9(new C2456s9(context));
                }
            }
        }
        return f6726x;
    }

    /* renamed from: a */
    private final void m9656a(C2299f5 f5Var) {
        Map map;
        m9675y();
        if (!C4157pa.m16931b() || !this.f6735i.mo7211o().mo7116e(f5Var.mo7328l(), C2457t.f6937p0)) {
            if (TextUtils.isEmpty(f5Var.mo7332n()) && TextUtils.isEmpty(f5Var.mo7334o())) {
                mo7540a(f5Var.mo7328l(), 204, null, null, null);
                return;
            }
        } else if (TextUtils.isEmpty(f5Var.mo7332n()) && TextUtils.isEmpty(f5Var.mo7336p()) && TextUtils.isEmpty(f5Var.mo7334o())) {
            mo7540a(f5Var.mo7328l(), 204, null, null, null);
            return;
        }
        String a = this.f6735i.mo7211o().mo7106a(f5Var);
        try {
            URL url = new URL(a);
            this.f6735i.mo7098j().mo7810B().mo7089a("Fetching remote configuration", f5Var.mo7328l());
            C4194s0 a2 = mo7548c().mo7730a(f5Var.mo7328l());
            String b = mo7548c().mo7732b(f5Var.mo7328l());
            if (a2 == null || TextUtils.isEmpty(b)) {
                map = null;
            } else {
                C3162a aVar = new C3162a();
                aVar.put("If-Modified-Since", b);
                map = aVar;
            }
            this.f6742p = true;
            C2310g4 d = mo7549d();
            String l = f5Var.mo7328l();
            C2412o9 o9Var = new C2412o9(this);
            d.mo7274c();
            d.mo7459r();
            C2148s.m8834a(url);
            C2148s.m8834a(o9Var);
            C2528z4 i = d.mo7097i();
            C2358k4 k4Var = new C2358k4(d, l, url, null, map, o9Var);
            i.mo7843b((Runnable) k4Var);
        } catch (MalformedURLException unused) {
            this.f6735i.mo7098j().mo7815t().mo7090a("Failed to parse config URL. Not fetching. appId", C2516y3.m10125a(f5Var.mo7328l()), a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9658a(C2456s9 s9Var) {
        this.f6735i.mo7097i().mo7274c();
        C2257c cVar = new C2257c(this);
        cVar.mo7460s();
        this.f6729c = cVar;
        this.f6735i.mo7211o().mo7107a((C2269d) this.f6727a);
        C2292ea eaVar = new C2292ea(this);
        eaVar.mo7460s();
        this.f6732f = eaVar;
        C2385m7 m7Var = new C2385m7(this);
        m7Var.mo7460s();
        this.f6734h = m7Var;
        C2351j9 j9Var = new C2351j9(this);
        j9Var.mo7460s();
        this.f6731e = j9Var;
        this.f6730d = new C2346j4(this);
        if (this.f6740n != this.f6741o) {
            this.f6735i.mo7098j().mo7815t().mo7090a("Not all upload components initialized", Integer.valueOf(this.f6740n), Integer.valueOf(this.f6741o));
        }
        this.f6736j = true;
    }

    /* renamed from: a */
    private static void m9659a(C3942a aVar) {
        aVar.mo12195b(Long.MAX_VALUE);
        aVar.mo12201c(Long.MIN_VALUE);
        for (int i = 0; i < aVar.mo12231p(); i++) {
            C4289y0 b = aVar.mo12199b(i);
            if (b.mo12914t() < aVar.mo12236t()) {
                aVar.mo12195b(b.mo12914t());
            }
            if (b.mo12914t() > aVar.mo12237u()) {
                aVar.mo12201c(b.mo12914t());
            }
        }
    }

    /* renamed from: a */
    private final void m9660a(C3942a aVar, long j, boolean z) {
        String str = z ? "_se" : "_lte";
        C2500w9 c = mo7551e().mo7170c(aVar.mo12240x(), str);
        C2500w9 w9Var = (c == null || c.f7062e == null) ? new C2500w9(aVar.mo12240x(), "auto", str, this.f6735i.mo7095g().mo6988b(), Long.valueOf(j)) : new C2500w9(aVar.mo12240x(), "auto", str, this.f6735i.mo7095g().mo6988b(), Long.valueOf(((Long) c.f7062e).longValue() + j));
        C4013a y = C4012g1.m16402y();
        y.mo12478a(str);
        y.mo12477a(this.f6735i.mo7095g().mo6988b());
        y.mo12479b(((Long) w9Var.f7062e).longValue());
        C4012g1 g1Var = (C4012g1) ((C4214t4) y.mo12346f());
        boolean z2 = false;
        int a = C2445r9.m9769a(aVar, str);
        if (a >= 0) {
            aVar.mo12185a(a, g1Var);
            z2 = true;
        }
        if (!z2) {
            aVar.mo12189a(g1Var);
        }
        if (j > 0) {
            mo7551e().mo7163a(w9Var);
            this.f6735i.mo7098j().mo7810B().mo7090a("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", w9Var.f7062e);
        }
    }

    /* renamed from: a */
    private static void m9661a(C4290a aVar, int i, String str) {
        List a = aVar.mo12927a();
        int i2 = 0;
        while (true) {
            String str2 = "_err";
            if (i2 >= a.size()) {
                C3910a z = C3909a1.m15685z();
                z.mo12071a(str2);
                z.mo12068a(Long.valueOf((long) i).longValue());
                C3909a1 a1Var = (C3909a1) ((C4214t4) z.mo12346f());
                C3910a z2 = C3909a1.m15685z();
                z2.mo12071a("_ev");
                z2.mo12072b(str);
                C3909a1 a1Var2 = (C3909a1) ((C4214t4) z2.mo12346f());
                aVar.mo12924a(a1Var);
                aVar.mo12924a(a1Var2);
                return;
            } else if (!str2.equals(((C3909a1) a.get(i2)).mo12057q())) {
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m9662a(C4290a aVar, String str) {
        List a = aVar.mo12927a();
        for (int i = 0; i < a.size(); i++) {
            if (str.equals(((C3909a1) a.get(i)).mo12057q())) {
                aVar.mo12928b(i);
                return;
            }
        }
    }

    /* renamed from: a */
    private final boolean m9663a(int i, FileChannel fileChannel) {
        m9675y();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f6735i.mo7098j().mo7815t().mo7088a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            if (this.f6735i.mo7211o().mo7108a(C2457t.f6863A0) && VERSION.SDK_INT <= 19) {
                fileChannel.position(0);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f6735i.mo7098j().mo7815t().mo7089a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.f6735i.mo7098j().mo7815t().mo7089a("Failed to write to channel", e);
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m9664a(C4290a aVar, C4290a aVar2) {
        C2148s.m8841a("_e".equals(aVar.mo12932r()));
        mo7554m();
        C3909a1 b = C2445r9.m9783b((C4289y0) ((C4214t4) aVar.mo12346f()), "_sc");
        String str = null;
        Object s = b == null ? null : b.mo12059s();
        mo7554m();
        C3909a1 b2 = C2445r9.m9783b((C4289y0) ((C4214t4) aVar2.mo12346f()), "_pc");
        if (b2 != null) {
            str = b2.mo12059s();
        }
        if (str == null || !str.equals(s)) {
            return false;
        }
        m9669b(aVar, aVar2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r5 != null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0217, code lost:
        if (r5 == null) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023b, code lost:
        if (r5 != null) goto L_0x0084;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0243 A[Catch:{ SQLiteException -> 0x0ee8, all -> 0x0f23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0251 A[Catch:{ SQLiteException -> 0x0ee8, all -> 0x0f23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x038d A[Catch:{ SQLiteException -> 0x0ee8, all -> 0x0f23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0398 A[Catch:{ SQLiteException -> 0x0ee8, all -> 0x0f23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0399 A[Catch:{ SQLiteException -> 0x0ee8, all -> 0x0f23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0587 A[Catch:{ SQLiteException -> 0x0ee8, all -> 0x0f23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x065e A[Catch:{ SQLiteException -> 0x0ee8, all -> 0x0f23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x07f9 A[Catch:{ SQLiteException -> 0x0ee8, all -> 0x0f23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0815 A[Catch:{ SQLiteException -> 0x0ee8, all -> 0x0f23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x082f A[Catch:{ SQLiteException -> 0x0ee8, all -> 0x0f23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0b69 A[Catch:{ SQLiteException -> 0x0ee8, all -> 0x0f23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0b7c A[Catch:{ SQLiteException -> 0x0ee8, all -> 0x0f23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0b7f A[Catch:{ SQLiteException -> 0x0ee8, all -> 0x0f23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0ba3 A[SYNTHETIC, Splitter:B:434:0x0ba3] */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x0f0b A[SYNTHETIC, Splitter:B:548:0x0f0b] */
    /* JADX WARNING: Removed duplicated region for block: B:555:0x0f1f A[SYNTHETIC, Splitter:B:555:0x0f1f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m9665a(java.lang.String r44, long r45) {
        /*
            r43 = this;
            r1 = r43
            java.lang.String r2 = "_npa"
            java.lang.String r3 = ""
            com.google.android.gms.measurement.internal.c r4 = r43.mo7551e()
            r4.mo7186y()
            com.google.android.gms.measurement.internal.n9$a r4 = new com.google.android.gms.measurement.internal.n9$a     // Catch:{ all -> 0x0f23 }
            r5 = 0
            r4.<init>(r1, r5)     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.c r6 = r43.mo7551e()     // Catch:{ all -> 0x0f23 }
            long r7 = r1.f6749w     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.common.internal.C2148s.m8834a(r4)     // Catch:{ all -> 0x0f23 }
            r6.mo7274c()     // Catch:{ all -> 0x0f23 }
            r6.mo7459r()     // Catch:{ all -> 0x0f23 }
            r10 = -1
            r12 = 2
            r13 = 0
            r14 = 1
            android.database.sqlite.SQLiteDatabase r15 = r6.mo7183v()     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            boolean r16 = android.text.TextUtils.isEmpty(r5)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            if (r16 == 0) goto L_0x0095
            int r16 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r16 == 0) goto L_0x0049
            java.lang.String[] r9 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0044 }
            java.lang.String r17 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0044 }
            r9[r13] = r17     // Catch:{ SQLiteException -> 0x0044 }
            java.lang.String r17 = java.lang.String.valueOf(r45)     // Catch:{ SQLiteException -> 0x0044 }
            r9[r14] = r17     // Catch:{ SQLiteException -> 0x0044 }
            goto L_0x0051
        L_0x0044:
            r0 = move-exception
            r7 = r0
            r9 = r5
            goto L_0x022a
        L_0x0049:
            java.lang.String[] r9 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r17 = java.lang.String.valueOf(r45)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            r9[r13] = r17     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
        L_0x0051:
            if (r16 == 0) goto L_0x0058
            java.lang.String r16 = "rowid <= ? and "
            r45 = r16
            goto L_0x005a
        L_0x0058:
            r45 = r3
        L_0x005a:
            int r5 = r45.length()     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            int r5 = r5 + 148
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            r12.<init>(r5)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r5 = "select app_id, metadata_fingerprint from raw_events where "
            r12.append(r5)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            r5 = r45
            r12.append(r5)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r12.append(r5)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r5 = r12.toString()     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            android.database.Cursor r5 = r15.rawQuery(r5, r9)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            boolean r9 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x021e }
            if (r9 != 0) goto L_0x0089
            if (r5 == 0) goto L_0x023f
        L_0x0084:
            r5.close()     // Catch:{ all -> 0x0f23 }
            goto L_0x023f
        L_0x0089:
            java.lang.String r9 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x021e }
            java.lang.String r12 = r5.getString(r14)     // Catch:{ SQLiteException -> 0x021b }
            r5.close()     // Catch:{ SQLiteException -> 0x021b }
            goto L_0x00e2
        L_0x0095:
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x00a6
            r9 = 2
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            r9 = 0
            r12[r13] = r9     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            r12[r14] = r9     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            goto L_0x00ab
        L_0x00a6:
            r9 = 0
            java.lang.String[] r12 = new java.lang.String[]{r9}     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
        L_0x00ab:
            if (r5 == 0) goto L_0x00b0
            java.lang.String r5 = " and rowid <= ?"
            goto L_0x00b1
        L_0x00b0:
            r5 = r3
        L_0x00b1:
            int r9 = r5.length()     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            int r9 = r9 + 84
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            r10.<init>(r9)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r9 = "select metadata_fingerprint from raw_events where app_id = ?"
            r10.append(r9)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            r10.append(r5)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r5 = " order by rowid limit 1;"
            r10.append(r5)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            java.lang.String r5 = r10.toString()     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            android.database.Cursor r5 = r15.rawQuery(r5, r12)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0221 }
            boolean r9 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x021e }
            if (r9 != 0) goto L_0x00da
            if (r5 == 0) goto L_0x023f
            goto L_0x0084
        L_0x00da:
            java.lang.String r12 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x021e }
            r5.close()     // Catch:{ SQLiteException -> 0x021e }
            r9 = 0
        L_0x00e2:
            java.lang.String r16 = "raw_events_metadata"
            java.lang.String r10 = "metadata"
            java.lang.String[] r17 = new java.lang.String[]{r10}     // Catch:{ SQLiteException -> 0x021b }
            java.lang.String r18 = "app_id = ? and metadata_fingerprint = ?"
            r10 = 2
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x021b }
            r11[r13] = r9     // Catch:{ SQLiteException -> 0x021b }
            r11[r14] = r12     // Catch:{ SQLiteException -> 0x021b }
            r20 = 0
            r21 = 0
            java.lang.String r22 = "rowid"
            java.lang.String r23 = "2"
            r10 = r15
            r15 = r10
            r19 = r11
            android.database.Cursor r5 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x021b }
            boolean r11 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x021b }
            if (r11 != 0) goto L_0x011e
            com.google.android.gms.measurement.internal.y3 r7 = r6.mo7098j()     // Catch:{ SQLiteException -> 0x021b }
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7815t()     // Catch:{ SQLiteException -> 0x021b }
            java.lang.String r8 = "Raw event metadata record is missing. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r9)     // Catch:{ SQLiteException -> 0x021b }
            r7.mo7089a(r8, r10)     // Catch:{ SQLiteException -> 0x021b }
            if (r5 == 0) goto L_0x023f
            goto L_0x0084
        L_0x011e:
            byte[] r11 = r5.getBlob(r13)     // Catch:{ SQLiteException -> 0x021b }
            g.d.a.b.d.g.c1$a r15 = p147g.p156d.p157a.p167b.p173d.p180g.C3941c1.m15877s0()     // Catch:{ IOException -> 0x0204 }
            com.google.android.gms.measurement.internal.C2445r9.m9770a(r15, r11)     // Catch:{ IOException -> 0x0204 }
            g.d.a.b.d.g.c1$a r15 = (p147g.p156d.p157a.p167b.p173d.p180g.C3941c1.C3942a) r15     // Catch:{ IOException -> 0x0204 }
            g.d.a.b.d.g.e6 r11 = r15.mo12346f()     // Catch:{ IOException -> 0x0204 }
            g.d.a.b.d.g.t4 r11 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r11     // Catch:{ IOException -> 0x0204 }
            g.d.a.b.d.g.c1 r11 = (p147g.p156d.p157a.p167b.p173d.p180g.C3941c1) r11     // Catch:{ IOException -> 0x0204 }
            boolean r15 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x021b }
            if (r15 == 0) goto L_0x014a
            com.google.android.gms.measurement.internal.y3 r15 = r6.mo7098j()     // Catch:{ SQLiteException -> 0x021b }
            com.google.android.gms.measurement.internal.a4 r15 = r15.mo7818w()     // Catch:{ SQLiteException -> 0x021b }
            java.lang.String r14 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r9)     // Catch:{ SQLiteException -> 0x021b }
            r15.mo7089a(r14, r13)     // Catch:{ SQLiteException -> 0x021b }
        L_0x014a:
            r5.close()     // Catch:{ SQLiteException -> 0x021b }
            r4.mo7240a(r11)     // Catch:{ SQLiteException -> 0x021b }
            r13 = -1
            int r11 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x016d
            java.lang.String r11 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x021b }
            r13 = 0
            r14[r13] = r9     // Catch:{ SQLiteException -> 0x021b }
            r13 = 1
            r14[r13] = r12     // Catch:{ SQLiteException -> 0x021b }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x021b }
            r8 = 2
            r14[r8] = r7     // Catch:{ SQLiteException -> 0x021b }
            r18 = r11
            r19 = r14
            goto L_0x017c
        L_0x016d:
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r8 = 2
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x021b }
            r8 = 0
            r11[r8] = r9     // Catch:{ SQLiteException -> 0x021b }
            r8 = 1
            r11[r8] = r12     // Catch:{ SQLiteException -> 0x021b }
            r18 = r7
            r19 = r11
        L_0x017c:
            java.lang.String r16 = "raw_events"
            java.lang.String r7 = "rowid"
            java.lang.String r8 = "name"
            java.lang.String r11 = "timestamp"
            java.lang.String r12 = "data"
            java.lang.String[] r17 = new java.lang.String[]{r7, r8, r11, r12}     // Catch:{ SQLiteException -> 0x021b }
            r20 = 0
            r21 = 0
            java.lang.String r22 = "rowid"
            r23 = 0
            r15 = r10
            android.database.Cursor r5 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x021b }
            boolean r7 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x021b }
            if (r7 != 0) goto L_0x01b2
            com.google.android.gms.measurement.internal.y3 r7 = r6.mo7098j()     // Catch:{ SQLiteException -> 0x021b }
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7818w()     // Catch:{ SQLiteException -> 0x021b }
            java.lang.String r8 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r9)     // Catch:{ SQLiteException -> 0x021b }
            r7.mo7089a(r8, r10)     // Catch:{ SQLiteException -> 0x021b }
            if (r5 == 0) goto L_0x023f
            goto L_0x0084
        L_0x01b2:
            r7 = 0
            long r10 = r5.getLong(r7)     // Catch:{ SQLiteException -> 0x021b }
            r7 = 3
            byte[] r8 = r5.getBlob(r7)     // Catch:{ SQLiteException -> 0x021b }
            g.d.a.b.d.g.y0$a r7 = p147g.p156d.p157a.p167b.p173d.p180g.C4289y0.m17570y()     // Catch:{ IOException -> 0x01e7 }
            com.google.android.gms.measurement.internal.C2445r9.m9770a(r7, r8)     // Catch:{ IOException -> 0x01e7 }
            g.d.a.b.d.g.y0$a r7 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0.C4290a) r7     // Catch:{ IOException -> 0x01e7 }
            r8 = 1
            java.lang.String r12 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x021b }
            r7.mo12926a(r12)     // Catch:{ SQLiteException -> 0x021b }
            r8 = 2
            long r12 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x021b }
            r7.mo12922a(r12)     // Catch:{ SQLiteException -> 0x021b }
            g.d.a.b.d.g.e6 r7 = r7.mo12346f()     // Catch:{ SQLiteException -> 0x021b }
            g.d.a.b.d.g.t4 r7 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r7     // Catch:{ SQLiteException -> 0x021b }
            g.d.a.b.d.g.y0 r7 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r7     // Catch:{ SQLiteException -> 0x021b }
            boolean r7 = r4.mo7241a(r10, r7)     // Catch:{ SQLiteException -> 0x021b }
            if (r7 != 0) goto L_0x01fa
            if (r5 == 0) goto L_0x023f
            goto L_0x0084
        L_0x01e7:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.y3 r8 = r6.mo7098j()     // Catch:{ SQLiteException -> 0x021b }
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo7815t()     // Catch:{ SQLiteException -> 0x021b }
            java.lang.String r10 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r9)     // Catch:{ SQLiteException -> 0x021b }
            r8.mo7090a(r10, r11, r7)     // Catch:{ SQLiteException -> 0x021b }
        L_0x01fa:
            boolean r7 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x021b }
            if (r7 != 0) goto L_0x01b2
            if (r5 == 0) goto L_0x023f
            goto L_0x0084
        L_0x0204:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.y3 r8 = r6.mo7098j()     // Catch:{ SQLiteException -> 0x021b }
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo7815t()     // Catch:{ SQLiteException -> 0x021b }
            java.lang.String r10 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r9)     // Catch:{ SQLiteException -> 0x021b }
            r8.mo7090a(r10, r11, r7)     // Catch:{ SQLiteException -> 0x021b }
            if (r5 == 0) goto L_0x023f
            goto L_0x0084
        L_0x021b:
            r0 = move-exception
            r7 = r0
            goto L_0x022a
        L_0x021e:
            r0 = move-exception
            r7 = r0
            goto L_0x0229
        L_0x0221:
            r0 = move-exception
            r2 = r0
            r5 = 0
            goto L_0x0f1d
        L_0x0226:
            r0 = move-exception
            r7 = r0
            r5 = 0
        L_0x0229:
            r9 = 0
        L_0x022a:
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo7098j()     // Catch:{ all -> 0x0f1b }
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7815t()     // Catch:{ all -> 0x0f1b }
            java.lang.String r8 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r9)     // Catch:{ all -> 0x0f1b }
            r6.mo7090a(r8, r9, r7)     // Catch:{ all -> 0x0f1b }
            if (r5 == 0) goto L_0x023f
            goto L_0x0084
        L_0x023f:
            java.util.List<g.d.a.b.d.g.y0> r5 = r4.f6752c     // Catch:{ all -> 0x0f23 }
            if (r5 == 0) goto L_0x024e
            java.util.List<g.d.a.b.d.g.y0> r5 = r4.f6752c     // Catch:{ all -> 0x0f23 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0f23 }
            if (r5 == 0) goto L_0x024c
            goto L_0x024e
        L_0x024c:
            r5 = 0
            goto L_0x024f
        L_0x024e:
            r5 = 1
        L_0x024f:
            if (r5 != 0) goto L_0x0f0b
            g.d.a.b.d.g.c1 r5 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4$b r5 = r5.mo12813l()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1$a r5 = (p147g.p156d.p157a.p167b.p173d.p180g.C3941c1.C3942a) r5     // Catch:{ all -> 0x0f23 }
            r5.mo12233q()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.c5 r6 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.b r6 = r6.mo7211o()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r7 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r7 = r7.mo12168p0()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.C2457t.f6901V     // Catch:{ all -> 0x0f23 }
            boolean r6 = r6.mo7116e(r7, r8)     // Catch:{ all -> 0x0f23 }
            r7 = -1
            r8 = -1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0277:
            java.util.List<g.d.a.b.d.g.y0> r9 = r4.f6752c     // Catch:{ all -> 0x0f23 }
            int r9 = r9.size()     // Catch:{ all -> 0x0f23 }
            r18 = r3
            java.lang.String r3 = "_fr"
            r19 = r13
            java.lang.String r13 = "_et"
            r20 = r2
            java.lang.String r2 = "_e"
            r21 = r14
            r22 = r15
            if (r12 >= r9) goto L_0x0888
            java.util.List<g.d.a.b.d.g.y0> r9 = r4.f6752c     // Catch:{ all -> 0x0f23 }
            java.lang.Object r9 = r9.get(r12)     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0 r9 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r9     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4$b r9 = r9.mo12813l()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0$a r9 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0.C4290a) r9     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.x4 r14 = r43.mo7548c()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r15 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r15 = r15.mo12168p0()     // Catch:{ all -> 0x0f23 }
            r16 = r12
            java.lang.String r12 = r9.mo12932r()     // Catch:{ all -> 0x0f23 }
            boolean r12 = r14.mo7733b(r15, r12)     // Catch:{ all -> 0x0f23 }
            java.lang.String r14 = "_err"
            if (r12 == 0) goto L_0x0332
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7818w()     // Catch:{ all -> 0x0f23 }
            java.lang.String r3 = "Dropping blacklisted raw event. appId"
            g.d.a.b.d.g.c1 r12 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r12 = r12.mo12168p0()     // Catch:{ all -> 0x0f23 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r12)     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.c5 r13 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.w3 r13 = r13.mo7219w()     // Catch:{ all -> 0x0f23 }
            java.lang.String r15 = r9.mo12932r()     // Catch:{ all -> 0x0f23 }
            java.lang.String r13 = r13.mo7718a(r15)     // Catch:{ all -> 0x0f23 }
            r2.mo7090a(r3, r12, r13)     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.x4 r2 = r43.mo7548c()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r3 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r3 = r3.mo12168p0()     // Catch:{ all -> 0x0f23 }
            boolean r2 = r2.mo7740g(r3)     // Catch:{ all -> 0x0f23 }
            if (r2 != 0) goto L_0x02ff
            com.google.android.gms.measurement.internal.x4 r2 = r43.mo7548c()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r3 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r3 = r3.mo12168p0()     // Catch:{ all -> 0x0f23 }
            boolean r2 = r2.mo7741h(r3)     // Catch:{ all -> 0x0f23 }
            if (r2 == 0) goto L_0x02fd
            goto L_0x02ff
        L_0x02fd:
            r2 = 0
            goto L_0x0300
        L_0x02ff:
            r2 = 1
        L_0x0300:
            if (r2 != 0) goto L_0x0325
            java.lang.String r2 = r9.mo12932r()     // Catch:{ all -> 0x0f23 }
            boolean r2 = r14.equals(r2)     // Catch:{ all -> 0x0f23 }
            if (r2 != 0) goto L_0x0325
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.v9 r24 = r2.mo7218v()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r2 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r25 = r2.mo12168p0()     // Catch:{ all -> 0x0f23 }
            r26 = 11
            java.lang.String r27 = "_ev"
            java.lang.String r28 = r9.mo12932r()     // Catch:{ all -> 0x0f23 }
            r29 = 0
            r24.mo7698a(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0f23 }
        L_0x0325:
            r26 = r6
            r12 = r16
            r13 = r19
            r14 = r21
            r15 = r22
            r6 = r5
            goto L_0x087d
        L_0x0332:
            com.google.android.gms.measurement.internal.x4 r12 = r43.mo7548c()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r15 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r15 = r15.mo12168p0()     // Catch:{ all -> 0x0f23 }
            r26 = r6
            java.lang.String r6 = r9.mo12932r()     // Catch:{ all -> 0x0f23 }
            boolean r6 = r12.mo7735c(r15, r6)     // Catch:{ all -> 0x0f23 }
            java.lang.String r12 = "_c"
            if (r6 != 0) goto L_0x03a4
            r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            java.lang.String r15 = r9.mo12932r()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.common.internal.C2148s.m8844b(r15)     // Catch:{ all -> 0x0f23 }
            r27 = r7
            int r7 = r15.hashCode()     // Catch:{ all -> 0x0f23 }
            r28 = r10
            r10 = 94660(0x171c4, float:1.32647E-40)
            if (r7 == r10) goto L_0x0380
            r10 = 95025(0x17331, float:1.33158E-40)
            if (r7 == r10) goto L_0x0376
            r10 = 95027(0x17333, float:1.33161E-40)
            if (r7 == r10) goto L_0x036c
            goto L_0x038a
        L_0x036c:
            java.lang.String r7 = "_ui"
            boolean r7 = r15.equals(r7)     // Catch:{ all -> 0x0f23 }
            if (r7 == 0) goto L_0x038a
            r7 = 1
            goto L_0x038b
        L_0x0376:
            java.lang.String r7 = "_ug"
            boolean r7 = r15.equals(r7)     // Catch:{ all -> 0x0f23 }
            if (r7 == 0) goto L_0x038a
            r7 = 2
            goto L_0x038b
        L_0x0380:
            java.lang.String r7 = "_in"
            boolean r7 = r15.equals(r7)     // Catch:{ all -> 0x0f23 }
            if (r7 == 0) goto L_0x038a
            r7 = 0
            goto L_0x038b
        L_0x038a:
            r7 = -1
        L_0x038b:
            if (r7 == 0) goto L_0x0395
            r10 = 1
            if (r7 == r10) goto L_0x0395
            r10 = 2
            if (r7 == r10) goto L_0x0395
            r7 = 0
            goto L_0x0396
        L_0x0395:
            r7 = 1
        L_0x0396:
            if (r7 == 0) goto L_0x0399
            goto L_0x03a8
        L_0x0399:
            r30 = r5
            r31 = r8
            r10 = r11
            r29 = r13
            r13 = r2
            r11 = r3
            goto L_0x0585
        L_0x03a4:
            r27 = r7
            r28 = r10
        L_0x03a8:
            r29 = r13
            r7 = 0
            r10 = 0
            r15 = 0
        L_0x03ad:
            int r13 = r9.mo12930p()     // Catch:{ all -> 0x0f23 }
            r30 = r5
            java.lang.String r5 = "_r"
            if (r15 >= r13) goto L_0x0417
            g.d.a.b.d.g.a1 r13 = r9.mo12919a(r15)     // Catch:{ all -> 0x0f23 }
            java.lang.String r13 = r13.mo12057q()     // Catch:{ all -> 0x0f23 }
            boolean r13 = r12.equals(r13)     // Catch:{ all -> 0x0f23 }
            if (r13 == 0) goto L_0x03e3
            g.d.a.b.d.g.a1 r5 = r9.mo12919a(r15)     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4$b r5 = r5.mo12813l()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1$a r5 = (p147g.p156d.p157a.p167b.p173d.p180g.C3909a1.C3910a) r5     // Catch:{ all -> 0x0f23 }
            r13 = r8
            r7 = 1
            r5.mo12068a(r7)     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.e6 r5 = r5.mo12346f()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4 r5 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r5     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1 r5 = (p147g.p156d.p157a.p167b.p173d.p180g.C3909a1) r5     // Catch:{ all -> 0x0f23 }
            r9.mo12921a(r15, r5)     // Catch:{ all -> 0x0f23 }
            r8 = r11
            r7 = 1
            goto L_0x0410
        L_0x03e3:
            r13 = r8
            g.d.a.b.d.g.a1 r8 = r9.mo12919a(r15)     // Catch:{ all -> 0x0f23 }
            java.lang.String r8 = r8.mo12057q()     // Catch:{ all -> 0x0f23 }
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0f23 }
            if (r5 == 0) goto L_0x040f
            g.d.a.b.d.g.a1 r5 = r9.mo12919a(r15)     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4$b r5 = r5.mo12813l()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1$a r5 = (p147g.p156d.p157a.p167b.p173d.p180g.C3909a1.C3910a) r5     // Catch:{ all -> 0x0f23 }
            r8 = r11
            r10 = 1
            r5.mo12068a(r10)     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.e6 r5 = r5.mo12346f()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4 r5 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r5     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1 r5 = (p147g.p156d.p157a.p167b.p173d.p180g.C3909a1) r5     // Catch:{ all -> 0x0f23 }
            r9.mo12921a(r15, r5)     // Catch:{ all -> 0x0f23 }
            r10 = 1
            goto L_0x0410
        L_0x040f:
            r8 = r11
        L_0x0410:
            int r15 = r15 + 1
            r11 = r8
            r8 = r13
            r5 = r30
            goto L_0x03ad
        L_0x0417:
            r13 = r8
            r8 = r11
            if (r7 != 0) goto L_0x044e
            if (r6 == 0) goto L_0x044e
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7810B()     // Catch:{ all -> 0x0f23 }
            java.lang.String r11 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.c5 r15 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.w3 r15 = r15.mo7219w()     // Catch:{ all -> 0x0f23 }
            r31 = r13
            java.lang.String r13 = r9.mo12932r()     // Catch:{ all -> 0x0f23 }
            java.lang.String r13 = r15.mo7718a(r13)     // Catch:{ all -> 0x0f23 }
            r7.mo7089a(r11, r13)     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1$a r7 = p147g.p156d.p157a.p167b.p173d.p180g.C3909a1.m15685z()     // Catch:{ all -> 0x0f23 }
            r7.mo12071a(r12)     // Catch:{ all -> 0x0f23 }
            r13 = r2
            r11 = r3
            r2 = 1
            r7.mo12068a(r2)     // Catch:{ all -> 0x0f23 }
            r9.mo12923a(r7)     // Catch:{ all -> 0x0f23 }
            goto L_0x0452
        L_0x044e:
            r11 = r3
            r31 = r13
            r13 = r2
        L_0x0452:
            if (r10 != 0) goto L_0x0482
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7810B()     // Catch:{ all -> 0x0f23 }
            java.lang.String r3 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo7219w()     // Catch:{ all -> 0x0f23 }
            java.lang.String r10 = r9.mo12932r()     // Catch:{ all -> 0x0f23 }
            java.lang.String r7 = r7.mo7718a(r10)     // Catch:{ all -> 0x0f23 }
            r2.mo7089a(r3, r7)     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1$a r2 = p147g.p156d.p157a.p167b.p173d.p180g.C3909a1.m15685z()     // Catch:{ all -> 0x0f23 }
            r2.mo12071a(r5)     // Catch:{ all -> 0x0f23 }
            r3 = r8
            r7 = 1
            r2.mo12068a(r7)     // Catch:{ all -> 0x0f23 }
            r9.mo12923a(r2)     // Catch:{ all -> 0x0f23 }
            goto L_0x0483
        L_0x0482:
            r3 = r8
        L_0x0483:
            com.google.android.gms.measurement.internal.c r32 = r43.mo7551e()     // Catch:{ all -> 0x0f23 }
            long r33 = r43.m9676z()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r2 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r35 = r2.mo12168p0()     // Catch:{ all -> 0x0f23 }
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 1
            com.google.android.gms.measurement.internal.f r2 = r32.mo7150a(r33, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0f23 }
            long r7 = r2.f6398e     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.b r2 = r2.mo7211o()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r10 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r10 = r10.mo12168p0()     // Catch:{ all -> 0x0f23 }
            int r2 = r2.mo7109b(r10)     // Catch:{ all -> 0x0f23 }
            r10 = r3
            long r2 = (long) r2     // Catch:{ all -> 0x0f23 }
            int r15 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x04bb
            m9662a(r9, r5)     // Catch:{ all -> 0x0f23 }
            goto L_0x04bd
        L_0x04bb:
            r19 = 1
        L_0x04bd:
            java.lang.String r2 = r9.mo12932r()     // Catch:{ all -> 0x0f23 }
            boolean r2 = com.google.android.gms.measurement.internal.C2489v9.m10028e(r2)     // Catch:{ all -> 0x0f23 }
            if (r2 == 0) goto L_0x0585
            if (r6 == 0) goto L_0x0585
            com.google.android.gms.measurement.internal.c r32 = r43.mo7551e()     // Catch:{ all -> 0x0f23 }
            long r33 = r43.m9676z()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r2 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r35 = r2.mo12168p0()     // Catch:{ all -> 0x0f23 }
            r36 = 0
            r37 = 0
            r38 = 1
            r39 = 0
            r40 = 0
            com.google.android.gms.measurement.internal.f r2 = r32.mo7150a(r33, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0f23 }
            long r2 = r2.f6396c     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.c5 r5 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.b r5 = r5.mo7211o()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r7 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r7 = r7.mo12168p0()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C2457t.f6932n     // Catch:{ all -> 0x0f23 }
            int r5 = r5.mo7110b(r7, r8)     // Catch:{ all -> 0x0f23 }
            long r7 = (long) r5     // Catch:{ all -> 0x0f23 }
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0585
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7818w()     // Catch:{ all -> 0x0f23 }
            java.lang.String r3 = "Too many conversions. Not logging as conversion. appId"
            g.d.a.b.d.g.c1 r5 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r5 = r5.mo12168p0()     // Catch:{ all -> 0x0f23 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r5)     // Catch:{ all -> 0x0f23 }
            r2.mo7089a(r3, r5)     // Catch:{ all -> 0x0f23 }
            r2 = -1
            r3 = 0
            r5 = 0
            r7 = 0
        L_0x051b:
            int r8 = r9.mo12930p()     // Catch:{ all -> 0x0f23 }
            if (r7 >= r8) goto L_0x0546
            g.d.a.b.d.g.a1 r8 = r9.mo12919a(r7)     // Catch:{ all -> 0x0f23 }
            java.lang.String r15 = r8.mo12057q()     // Catch:{ all -> 0x0f23 }
            boolean r15 = r12.equals(r15)     // Catch:{ all -> 0x0f23 }
            if (r15 == 0) goto L_0x0538
            g.d.a.b.d.g.t4$b r2 = r8.mo12813l()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1$a r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C3909a1.C3910a) r2     // Catch:{ all -> 0x0f23 }
            r3 = r2
            r2 = r7
            goto L_0x0543
        L_0x0538:
            java.lang.String r8 = r8.mo12057q()     // Catch:{ all -> 0x0f23 }
            boolean r8 = r14.equals(r8)     // Catch:{ all -> 0x0f23 }
            if (r8 == 0) goto L_0x0543
            r5 = 1
        L_0x0543:
            int r7 = r7 + 1
            goto L_0x051b
        L_0x0546:
            if (r5 == 0) goto L_0x054e
            if (r3 == 0) goto L_0x054e
            r9.mo12928b(r2)     // Catch:{ all -> 0x0f23 }
            goto L_0x0585
        L_0x054e:
            if (r3 == 0) goto L_0x056c
            java.lang.Object r3 = r3.clone()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4$b r3 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b) r3     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1$a r3 = (p147g.p156d.p157a.p167b.p173d.p180g.C3909a1.C3910a) r3     // Catch:{ all -> 0x0f23 }
            r3.mo12071a(r14)     // Catch:{ all -> 0x0f23 }
            r7 = 10
            r3.mo12068a(r7)     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.e6 r3 = r3.mo12346f()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4 r3 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r3     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1 r3 = (p147g.p156d.p157a.p167b.p173d.p180g.C3909a1) r3     // Catch:{ all -> 0x0f23 }
            r9.mo12921a(r2, r3)     // Catch:{ all -> 0x0f23 }
            goto L_0x0585
        L_0x056c:
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7815t()     // Catch:{ all -> 0x0f23 }
            java.lang.String r3 = "Did not find conversion parameter. appId"
            g.d.a.b.d.g.c1 r5 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r5 = r5.mo12168p0()     // Catch:{ all -> 0x0f23 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r5)     // Catch:{ all -> 0x0f23 }
            r2.mo7089a(r3, r5)     // Catch:{ all -> 0x0f23 }
        L_0x0585:
            if (r6 == 0) goto L_0x0648
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0f23 }
            java.util.List r3 = r9.mo12927a()     // Catch:{ all -> 0x0f23 }
            r2.<init>(r3)     // Catch:{ all -> 0x0f23 }
            r3 = 0
            r5 = -1
            r6 = -1
        L_0x0593:
            int r7 = r2.size()     // Catch:{ all -> 0x0f23 }
            java.lang.String r8 = "currency"
            java.lang.String r14 = "value"
            if (r3 >= r7) goto L_0x05c3
            java.lang.Object r7 = r2.get(r3)     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1 r7 = (p147g.p156d.p157a.p167b.p173d.p180g.C3909a1) r7     // Catch:{ all -> 0x0f23 }
            java.lang.String r7 = r7.mo12057q()     // Catch:{ all -> 0x0f23 }
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x0f23 }
            if (r7 == 0) goto L_0x05af
            r5 = r3
            goto L_0x05c0
        L_0x05af:
            java.lang.Object r7 = r2.get(r3)     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1 r7 = (p147g.p156d.p157a.p167b.p173d.p180g.C3909a1) r7     // Catch:{ all -> 0x0f23 }
            java.lang.String r7 = r7.mo12057q()     // Catch:{ all -> 0x0f23 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0f23 }
            if (r7 == 0) goto L_0x05c0
            r6 = r3
        L_0x05c0:
            int r3 = r3 + 1
            goto L_0x0593
        L_0x05c3:
            r3 = -1
            if (r5 == r3) goto L_0x0649
            java.lang.Object r3 = r2.get(r5)     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1 r3 = (p147g.p156d.p157a.p167b.p173d.p180g.C3909a1) r3     // Catch:{ all -> 0x0f23 }
            boolean r3 = r3.mo12060t()     // Catch:{ all -> 0x0f23 }
            if (r3 != 0) goto L_0x05f9
            java.lang.Object r3 = r2.get(r5)     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1 r3 = (p147g.p156d.p157a.p167b.p173d.p180g.C3909a1) r3     // Catch:{ all -> 0x0f23 }
            boolean r3 = r3.mo12062v()     // Catch:{ all -> 0x0f23 }
            if (r3 != 0) goto L_0x05f9
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7820y()     // Catch:{ all -> 0x0f23 }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.mo7088a(r3)     // Catch:{ all -> 0x0f23 }
            r9.mo12928b(r5)     // Catch:{ all -> 0x0f23 }
            m9662a(r9, r12)     // Catch:{ all -> 0x0f23 }
            r2 = 18
            m9661a(r9, r2, r14)     // Catch:{ all -> 0x0f23 }
            goto L_0x0648
        L_0x05f9:
            r3 = -1
            if (r6 != r3) goto L_0x05ff
            r2 = 1
            r7 = 3
            goto L_0x062b
        L_0x05ff:
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1 r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C3909a1) r2     // Catch:{ all -> 0x0f23 }
            java.lang.String r2 = r2.mo12059s()     // Catch:{ all -> 0x0f23 }
            int r6 = r2.length()     // Catch:{ all -> 0x0f23 }
            r7 = 3
            if (r6 == r7) goto L_0x0612
        L_0x0610:
            r2 = 1
            goto L_0x062b
        L_0x0612:
            r6 = 0
        L_0x0613:
            int r14 = r2.length()     // Catch:{ all -> 0x0f23 }
            if (r6 >= r14) goto L_0x062a
            int r14 = r2.codePointAt(r6)     // Catch:{ all -> 0x0f23 }
            boolean r15 = java.lang.Character.isLetter(r14)     // Catch:{ all -> 0x0f23 }
            if (r15 != 0) goto L_0x0624
            goto L_0x0610
        L_0x0624:
            int r14 = java.lang.Character.charCount(r14)     // Catch:{ all -> 0x0f23 }
            int r6 = r6 + r14
            goto L_0x0613
        L_0x062a:
            r2 = 0
        L_0x062b:
            if (r2 == 0) goto L_0x064a
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7820y()     // Catch:{ all -> 0x0f23 }
            java.lang.String r6 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo7088a(r6)     // Catch:{ all -> 0x0f23 }
            r9.mo12928b(r5)     // Catch:{ all -> 0x0f23 }
            m9662a(r9, r12)     // Catch:{ all -> 0x0f23 }
            r2 = 19
            m9661a(r9, r2, r8)     // Catch:{ all -> 0x0f23 }
            goto L_0x064a
        L_0x0648:
            r3 = -1
        L_0x0649:
            r7 = 3
        L_0x064a:
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.b r2 = r2.mo7211o()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r5 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r5 = r5.mo12168p0()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C2457t.f6900U     // Catch:{ all -> 0x0f23 }
            boolean r2 = r2.mo7116e(r5, r6)     // Catch:{ all -> 0x0f23 }
            if (r2 == 0) goto L_0x07f9
            java.lang.String r2 = r9.mo12932r()     // Catch:{ all -> 0x0f23 }
            r5 = r13
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0f23 }
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x06c4
            r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.e6 r2 = r9.mo12346f()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4 r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r2     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0 r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r2     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1 r2 = com.google.android.gms.measurement.internal.C2445r9.m9783b(r2, r11)     // Catch:{ all -> 0x0f23 }
            if (r2 != 0) goto L_0x06ba
            if (r10 == 0) goto L_0x06ae
            long r14 = r10.mo12933s()     // Catch:{ all -> 0x0f23 }
            long r24 = r9.mo12933s()     // Catch:{ all -> 0x0f23 }
            long r14 = r14 - r24
            long r14 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x0f23 }
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x06ae
            java.lang.Object r2 = r10.clone()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4$b r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b) r2     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0$a r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0.C4290a) r2     // Catch:{ all -> 0x0f23 }
            boolean r6 = r1.m9664a(r9, r2)     // Catch:{ all -> 0x0f23 }
            if (r6 == 0) goto L_0x06ae
            r6 = r30
            r8 = r31
            r6.mo12186a(r8, r2)     // Catch:{ all -> 0x0f23 }
            r7 = r27
            r14 = r29
        L_0x06a9:
            r10 = 0
        L_0x06aa:
            r28 = 0
            goto L_0x0803
        L_0x06ae:
            r6 = r30
            r8 = r31
            r28 = r9
            r7 = r21
            r14 = r29
            goto L_0x0803
        L_0x06ba:
            r6 = r30
            r8 = r31
            r11 = r27
            r14 = r29
            goto L_0x0802
        L_0x06c4:
            r6 = r30
            r8 = r31
            java.lang.String r2 = "_vs"
            java.lang.String r11 = r9.mo12932r()     // Catch:{ all -> 0x0f23 }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0f23 }
            if (r2 == 0) goto L_0x071c
            r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.e6 r2 = r9.mo12346f()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4 r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r2     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0 r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r2     // Catch:{ all -> 0x0f23 }
            r14 = r29
            g.d.a.b.d.g.a1 r2 = com.google.android.gms.measurement.internal.C2445r9.m9783b(r2, r14)     // Catch:{ all -> 0x0f23 }
            if (r2 != 0) goto L_0x0718
            if (r28 == 0) goto L_0x0710
            long r10 = r28.mo12933s()     // Catch:{ all -> 0x0f23 }
            long r24 = r9.mo12933s()     // Catch:{ all -> 0x0f23 }
            long r10 = r10 - r24
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0f23 }
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x0710
            java.lang.Object r2 = r28.clone()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4$b r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b) r2     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0$a r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0.C4290a) r2     // Catch:{ all -> 0x0f23 }
            boolean r10 = r1.m9664a(r2, r9)     // Catch:{ all -> 0x0f23 }
            if (r10 == 0) goto L_0x0710
            r11 = r27
            r6.mo12186a(r11, r2)     // Catch:{ all -> 0x0f23 }
            r7 = r11
            goto L_0x06a9
        L_0x0710:
            r11 = r27
            r10 = r9
            r7 = r11
            r8 = r21
            goto L_0x0803
        L_0x0718:
            r11 = r27
            goto L_0x0802
        L_0x071c:
            r11 = r27
            r14 = r29
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.b r2 = r2.mo7211o()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r12 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r12 = r12.mo12168p0()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C2457t.f6945t0     // Catch:{ all -> 0x0f23 }
            boolean r2 = r2.mo7116e(r12, r13)     // Catch:{ all -> 0x0f23 }
            if (r2 == 0) goto L_0x0802
            java.lang.String r2 = "_ab"
            java.lang.String r12 = r9.mo12932r()     // Catch:{ all -> 0x0f23 }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x0f23 }
            if (r2 == 0) goto L_0x0802
            r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.e6 r2 = r9.mo12346f()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4 r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r2     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0 r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r2     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1 r2 = com.google.android.gms.measurement.internal.C2445r9.m9783b(r2, r14)     // Catch:{ all -> 0x0f23 }
            if (r2 != 0) goto L_0x0802
            if (r28 == 0) goto L_0x0802
            long r12 = r28.mo12933s()     // Catch:{ all -> 0x0f23 }
            long r24 = r9.mo12933s()     // Catch:{ all -> 0x0f23 }
            long r12 = r12 - r24
            long r12 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x0f23 }
            r24 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r2 > 0) goto L_0x0802
            java.lang.Object r2 = r28.clone()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4$b r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b) r2     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0$a r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0.C4290a) r2     // Catch:{ all -> 0x0f23 }
            r1.m9669b(r2, r9)     // Catch:{ all -> 0x0f23 }
            java.lang.String r12 = r2.mo12932r()     // Catch:{ all -> 0x0f23 }
            boolean r12 = r5.equals(r12)     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.common.internal.C2148s.m8841a(r12)     // Catch:{ all -> 0x0f23 }
            r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.e6 r12 = r2.mo12346f()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4 r12 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r12     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0 r12 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r12     // Catch:{ all -> 0x0f23 }
            java.lang.String r13 = "_sn"
            g.d.a.b.d.g.a1 r12 = com.google.android.gms.measurement.internal.C2445r9.m9783b(r12, r13)     // Catch:{ all -> 0x0f23 }
            r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.e6 r13 = r2.mo12346f()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4 r13 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r13     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0 r13 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r13     // Catch:{ all -> 0x0f23 }
            java.lang.String r15 = "_sc"
            g.d.a.b.d.g.a1 r13 = com.google.android.gms.measurement.internal.C2445r9.m9783b(r13, r15)     // Catch:{ all -> 0x0f23 }
            r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.e6 r15 = r2.mo12346f()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4 r15 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r15     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0 r15 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r15     // Catch:{ all -> 0x0f23 }
            java.lang.String r3 = "_si"
            g.d.a.b.d.g.a1 r3 = com.google.android.gms.measurement.internal.C2445r9.m9783b(r15, r3)     // Catch:{ all -> 0x0f23 }
            if (r12 == 0) goto L_0x07b7
            java.lang.String r12 = r12.mo12059s()     // Catch:{ all -> 0x0f23 }
            goto L_0x07b9
        L_0x07b7:
            r12 = r18
        L_0x07b9:
            boolean r15 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0f23 }
            if (r15 != 0) goto L_0x07c8
            com.google.android.gms.measurement.internal.r9 r15 = r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            java.lang.String r7 = "_sn"
            r15.mo7612a(r9, r7, r12)     // Catch:{ all -> 0x0f23 }
        L_0x07c8:
            if (r13 == 0) goto L_0x07cf
            java.lang.String r7 = r13.mo12059s()     // Catch:{ all -> 0x0f23 }
            goto L_0x07d1
        L_0x07cf:
            r7 = r18
        L_0x07d1:
            boolean r12 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0f23 }
            if (r12 != 0) goto L_0x07e0
            com.google.android.gms.measurement.internal.r9 r12 = r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            java.lang.String r13 = "_sc"
            r12.mo7612a(r9, r13, r7)     // Catch:{ all -> 0x0f23 }
        L_0x07e0:
            if (r3 == 0) goto L_0x07f3
            com.google.android.gms.measurement.internal.r9 r7 = r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            java.lang.String r12 = "_si"
            long r24 = r3.mo12061u()     // Catch:{ all -> 0x0f23 }
            java.lang.Long r3 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x0f23 }
            r7.mo7612a(r9, r12, r3)     // Catch:{ all -> 0x0f23 }
        L_0x07f3:
            r6.mo12186a(r11, r2)     // Catch:{ all -> 0x0f23 }
            r7 = r11
            goto L_0x06aa
        L_0x07f9:
            r5 = r13
            r11 = r27
            r14 = r29
            r6 = r30
            r8 = r31
        L_0x0802:
            r7 = r11
        L_0x0803:
            if (r26 != 0) goto L_0x0861
            java.lang.String r2 = r9.mo12932r()     // Catch:{ all -> 0x0f23 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0f23 }
            if (r2 == 0) goto L_0x0861
            int r2 = r9.mo12930p()     // Catch:{ all -> 0x0f23 }
            if (r2 != 0) goto L_0x082f
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7818w()     // Catch:{ all -> 0x0f23 }
            java.lang.String r3 = "Engagement event does not contain any parameters. appId"
            g.d.a.b.d.g.c1 r5 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r5 = r5.mo12168p0()     // Catch:{ all -> 0x0f23 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r5)     // Catch:{ all -> 0x0f23 }
        L_0x082b:
            r2.mo7089a(r3, r5)     // Catch:{ all -> 0x0f23 }
            goto L_0x0861
        L_0x082f:
            com.google.android.gms.measurement.internal.r9 r2 = r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.e6 r3 = r9.mo12346f()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4 r3 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r3     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0 r3 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r3     // Catch:{ all -> 0x0f23 }
            java.lang.Object r2 = r2.mo7605a(r3, r14)     // Catch:{ all -> 0x0f23 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0f23 }
            if (r2 != 0) goto L_0x085a
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7818w()     // Catch:{ all -> 0x0f23 }
            java.lang.String r3 = "Engagement event does not include duration. appId"
            g.d.a.b.d.g.c1 r5 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r5 = r5.mo12168p0()     // Catch:{ all -> 0x0f23 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r5)     // Catch:{ all -> 0x0f23 }
            goto L_0x082b
        L_0x085a:
            long r2 = r2.longValue()     // Catch:{ all -> 0x0f23 }
            long r2 = r22 + r2
            goto L_0x0863
        L_0x0861:
            r2 = r22
        L_0x0863:
            java.util.List<g.d.a.b.d.g.y0> r5 = r4.f6752c     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.e6 r11 = r9.mo12346f()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4 r11 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r11     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0 r11 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r11     // Catch:{ all -> 0x0f23 }
            r12 = r16
            r5.set(r12, r11)     // Catch:{ all -> 0x0f23 }
            int r14 = r21 + 1
            r6.mo12190a(r9)     // Catch:{ all -> 0x0f23 }
            r15 = r2
            r11 = r10
            r13 = r19
            r10 = r28
        L_0x087d:
            int r12 = r12 + 1
            r5 = r6
            r3 = r18
            r2 = r20
            r6 = r26
            goto L_0x0277
        L_0x0888:
            r11 = r3
            r26 = r6
            r14 = r13
            r6 = r5
            r5 = r2
            if (r26 == 0) goto L_0x08e5
            r2 = r21
            r15 = r22
            r3 = 0
        L_0x0895:
            if (r3 >= r2) goto L_0x08e3
            g.d.a.b.d.g.y0 r7 = r6.mo12199b(r3)     // Catch:{ all -> 0x0f23 }
            java.lang.String r8 = r7.mo12912r()     // Catch:{ all -> 0x0f23 }
            boolean r8 = r5.equals(r8)     // Catch:{ all -> 0x0f23 }
            if (r8 == 0) goto L_0x08b6
            r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1 r8 = com.google.android.gms.measurement.internal.C2445r9.m9783b(r7, r11)     // Catch:{ all -> 0x0f23 }
            if (r8 == 0) goto L_0x08b6
            r6.mo12200c(r3)     // Catch:{ all -> 0x0f23 }
            int r2 = r2 + -1
            int r3 = r3 + -1
            goto L_0x08e0
        L_0x08b6:
            r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1 r7 = com.google.android.gms.measurement.internal.C2445r9.m9783b(r7, r14)     // Catch:{ all -> 0x0f23 }
            if (r7 == 0) goto L_0x08e0
            boolean r8 = r7.mo12060t()     // Catch:{ all -> 0x0f23 }
            if (r8 == 0) goto L_0x08ce
            long r7 = r7.mo12061u()     // Catch:{ all -> 0x0f23 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0f23 }
            goto L_0x08cf
        L_0x08ce:
            r7 = 0
        L_0x08cf:
            if (r7 == 0) goto L_0x08e0
            long r8 = r7.longValue()     // Catch:{ all -> 0x0f23 }
            r12 = 0
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x08e0
            long r7 = r7.longValue()     // Catch:{ all -> 0x0f23 }
            long r15 = r15 + r7
        L_0x08e0:
            r7 = 1
            int r3 = r3 + r7
            goto L_0x0895
        L_0x08e3:
            r2 = r15
            goto L_0x08e7
        L_0x08e5:
            r2 = r22
        L_0x08e7:
            r5 = 0
            r1.m9660a(r6, r2, r5)     // Catch:{ all -> 0x0f23 }
            java.util.List r5 = r6.mo12194a()     // Catch:{ all -> 0x0f23 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0f23 }
        L_0x08f3:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x0f23 }
            if (r7 == 0) goto L_0x090d
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0 r7 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r7     // Catch:{ all -> 0x0f23 }
            java.lang.String r8 = "_s"
            java.lang.String r7 = r7.mo12912r()     // Catch:{ all -> 0x0f23 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0f23 }
            if (r7 == 0) goto L_0x08f3
            r5 = 1
            goto L_0x090e
        L_0x090d:
            r5 = 0
        L_0x090e:
            java.lang.String r7 = "_se"
            if (r5 == 0) goto L_0x091d
            com.google.android.gms.measurement.internal.c r5 = r43.mo7551e()     // Catch:{ all -> 0x0f23 }
            java.lang.String r8 = r6.mo12240x()     // Catch:{ all -> 0x0f23 }
            r5.mo7168b(r8, r7)     // Catch:{ all -> 0x0f23 }
        L_0x091d:
            java.lang.String r5 = "_sid"
            int r5 = com.google.android.gms.measurement.internal.C2445r9.m9769a(r6, r5)     // Catch:{ all -> 0x0f23 }
            if (r5 < 0) goto L_0x0927
            r5 = 1
            goto L_0x0928
        L_0x0927:
            r5 = 0
        L_0x0928:
            if (r5 == 0) goto L_0x092f
            r5 = 1
            r1.m9660a(r6, r2, r5)     // Catch:{ all -> 0x0f23 }
            goto L_0x0951
        L_0x092f:
            int r2 = com.google.android.gms.measurement.internal.C2445r9.m9769a(r6, r7)     // Catch:{ all -> 0x0f23 }
            if (r2 < 0) goto L_0x0951
            r6.mo12207e(r2)     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7815t()     // Catch:{ all -> 0x0f23 }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            g.d.a.b.d.g.c1 r5 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r5 = r5.mo12168p0()     // Catch:{ all -> 0x0f23 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r5)     // Catch:{ all -> 0x0f23 }
            r2.mo7089a(r3, r5)     // Catch:{ all -> 0x0f23 }
        L_0x0951:
            com.google.android.gms.measurement.internal.r9 r2 = r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.y3 r3 = r2.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7810B()     // Catch:{ all -> 0x0f23 }
            java.lang.String r5 = "Checking account type status for ad personalization signals"
            r3.mo7088a(r5)     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.x4 r3 = r2.mo7494p()     // Catch:{ all -> 0x0f23 }
            java.lang.String r5 = r6.mo12240x()     // Catch:{ all -> 0x0f23 }
            boolean r3 = r3.mo7738e(r5)     // Catch:{ all -> 0x0f23 }
            if (r3 == 0) goto L_0x09df
            com.google.android.gms.measurement.internal.c r3 = r2.mo7493o()     // Catch:{ all -> 0x0f23 }
            java.lang.String r5 = r6.mo12240x()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.f5 r3 = r3.mo7166b(r5)     // Catch:{ all -> 0x0f23 }
            if (r3 == 0) goto L_0x09df
            boolean r3 = r3.mo7317g()     // Catch:{ all -> 0x0f23 }
            if (r3 == 0) goto L_0x09df
            com.google.android.gms.measurement.internal.l r3 = r2.mo7823d()     // Catch:{ all -> 0x0f23 }
            boolean r3 = r3.mo7467x()     // Catch:{ all -> 0x0f23 }
            if (r3 == 0) goto L_0x09df
            com.google.android.gms.measurement.internal.y3 r3 = r2.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7809A()     // Catch:{ all -> 0x0f23 }
            java.lang.String r5 = "Turning off ad personalization due to account type"
            r3.mo7088a(r5)     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.g1$a r3 = p147g.p156d.p157a.p167b.p173d.p180g.C4012g1.m16402y()     // Catch:{ all -> 0x0f23 }
            r5 = r20
            r3.mo12478a(r5)     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.l r2 = r2.mo7823d()     // Catch:{ all -> 0x0f23 }
            long r7 = r2.mo7465v()     // Catch:{ all -> 0x0f23 }
            r3.mo12477a(r7)     // Catch:{ all -> 0x0f23 }
            r7 = 1
            r3.mo12479b(r7)     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.e6 r2 = r3.mo12346f()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4 r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r2     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.g1 r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4012g1) r2     // Catch:{ all -> 0x0f23 }
            r3 = 0
        L_0x09bd:
            int r7 = r6.mo12235s()     // Catch:{ all -> 0x0f23 }
            if (r3 >= r7) goto L_0x09d9
            g.d.a.b.d.g.g1 r7 = r6.mo12206d(r3)     // Catch:{ all -> 0x0f23 }
            java.lang.String r7 = r7.mo12468r()     // Catch:{ all -> 0x0f23 }
            boolean r7 = r5.equals(r7)     // Catch:{ all -> 0x0f23 }
            if (r7 == 0) goto L_0x09d6
            r6.mo12185a(r3, r2)     // Catch:{ all -> 0x0f23 }
            r3 = 1
            goto L_0x09da
        L_0x09d6:
            int r3 = r3 + 1
            goto L_0x09bd
        L_0x09d9:
            r3 = 0
        L_0x09da:
            if (r3 != 0) goto L_0x09df
            r6.mo12189a(r2)     // Catch:{ all -> 0x0f23 }
        L_0x09df:
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.b r2 = r2.mo7211o()     // Catch:{ all -> 0x0f23 }
            java.lang.String r3 = r6.mo12240x()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C2457t.f6935o0     // Catch:{ all -> 0x0f23 }
            boolean r2 = r2.mo7116e(r3, r5)     // Catch:{ all -> 0x0f23 }
            if (r2 == 0) goto L_0x09f4
            m9659a(r6)     // Catch:{ all -> 0x0f23 }
        L_0x09f4:
            r6.mo12181A()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.ea r7 = r43.mo7552k()     // Catch:{ all -> 0x0f23 }
            java.lang.String r8 = r6.mo12240x()     // Catch:{ all -> 0x0f23 }
            java.util.List r9 = r6.mo12194a()     // Catch:{ all -> 0x0f23 }
            java.util.List r10 = r6.mo12234r()     // Catch:{ all -> 0x0f23 }
            long r2 = r6.mo12236t()     // Catch:{ all -> 0x0f23 }
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0f23 }
            long r2 = r6.mo12237u()     // Catch:{ all -> 0x0f23 }
            java.lang.Long r12 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0f23 }
            java.util.List r2 = r7.mo7272a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0f23 }
            r6.mo12196b(r2)     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.b r2 = r2.mo7211o()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r3 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r3 = r3.mo12168p0()     // Catch:{ all -> 0x0f23 }
            boolean r2 = r2.mo7118g(r3)     // Catch:{ all -> 0x0f23 }
            if (r2 == 0) goto L_0x0d63
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0d5e }
            r2.<init>()     // Catch:{ all -> 0x0d5e }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0d5e }
            r3.<init>()     // Catch:{ all -> 0x0d5e }
            com.google.android.gms.measurement.internal.c5 r5 = r1.f6735i     // Catch:{ all -> 0x0d5e }
            com.google.android.gms.measurement.internal.v9 r5 = r5.mo7218v()     // Catch:{ all -> 0x0d5e }
            java.security.SecureRandom r5 = r5.mo7712u()     // Catch:{ all -> 0x0d5e }
            r7 = 0
        L_0x0a45:
            int r8 = r6.mo12231p()     // Catch:{ all -> 0x0d5e }
            if (r7 >= r8) goto L_0x0d29
            g.d.a.b.d.g.y0 r8 = r6.mo12199b(r7)     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.t4$b r8 = r8.mo12813l()     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.y0$a r8 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0.C4290a) r8     // Catch:{ all -> 0x0d5e }
            java.lang.String r9 = r8.mo12932r()     // Catch:{ all -> 0x0d5e }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0d5e }
            java.lang.String r10 = "_sr"
            if (r9 == 0) goto L_0x0ad9
            com.google.android.gms.measurement.internal.r9 r9 = r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.e6 r11 = r8.mo12346f()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4 r11 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r11     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0 r11 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r11     // Catch:{ all -> 0x0f23 }
            java.lang.String r12 = "_en"
            java.lang.Object r9 = r9.mo7605a(r11, r12)     // Catch:{ all -> 0x0f23 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0f23 }
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.n r11 = (com.google.android.gms.measurement.internal.C2389n) r11     // Catch:{ all -> 0x0f23 }
            if (r11 != 0) goto L_0x0a90
            com.google.android.gms.measurement.internal.c r11 = r43.mo7551e()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r12 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r12 = r12.mo12168p0()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.n r11 = r11.mo7151a(r12, r9)     // Catch:{ all -> 0x0f23 }
            r2.put(r9, r11)     // Catch:{ all -> 0x0f23 }
        L_0x0a90:
            java.lang.Long r9 = r11.f6699i     // Catch:{ all -> 0x0f23 }
            if (r9 != 0) goto L_0x0acf
            java.lang.Long r9 = r11.f6700j     // Catch:{ all -> 0x0f23 }
            long r12 = r9.longValue()     // Catch:{ all -> 0x0f23 }
            r14 = 1
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0aa9
            com.google.android.gms.measurement.internal.r9 r9 = r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            java.lang.Long r12 = r11.f6700j     // Catch:{ all -> 0x0f23 }
            r9.mo7612a(r8, r10, r12)     // Catch:{ all -> 0x0f23 }
        L_0x0aa9:
            java.lang.Boolean r9 = r11.f6701k     // Catch:{ all -> 0x0f23 }
            if (r9 == 0) goto L_0x0ac4
            java.lang.Boolean r9 = r11.f6701k     // Catch:{ all -> 0x0f23 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0f23 }
            if (r9 == 0) goto L_0x0ac4
            com.google.android.gms.measurement.internal.r9 r9 = r43.mo7554m()     // Catch:{ all -> 0x0f23 }
            java.lang.String r10 = "_efs"
            r11 = 1
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0f23 }
            r9.mo7612a(r8, r10, r13)     // Catch:{ all -> 0x0f23 }
        L_0x0ac4:
            g.d.a.b.d.g.e6 r9 = r8.mo12346f()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4 r9 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r9     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0 r9 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r9     // Catch:{ all -> 0x0f23 }
            r3.add(r9)     // Catch:{ all -> 0x0f23 }
        L_0x0acf:
            r6.mo12186a(r7, r8)     // Catch:{ all -> 0x0f23 }
        L_0x0ad2:
            r44 = r4
            r15 = r5
            r5 = r6
            r1 = r7
            goto L_0x0d1f
        L_0x0ad9:
            com.google.android.gms.measurement.internal.x4 r9 = r43.mo7548c()     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.c1 r11 = r4.f6750a     // Catch:{ all -> 0x0d5e }
            java.lang.String r11 = r11.mo12168p0()     // Catch:{ all -> 0x0d5e }
            long r11 = r9.mo7739f(r11)     // Catch:{ all -> 0x0d5e }
            com.google.android.gms.measurement.internal.c5 r9 = r1.f6735i     // Catch:{ all -> 0x0d5e }
            r9.mo7218v()     // Catch:{ all -> 0x0d5e }
            long r13 = r8.mo12933s()     // Catch:{ all -> 0x0d5e }
            long r13 = com.google.android.gms.measurement.internal.C2489v9.m10003a(r13, r11)     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.e6 r9 = r8.mo12346f()     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.t4 r9 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r9     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.y0 r9 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r9     // Catch:{ all -> 0x0d5e }
            java.lang.String r15 = "_dbg"
            r20 = r11
            r16 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0d5e }
            boolean r12 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0d5e }
            if (r12 != 0) goto L_0x0b66
            if (r11 != 0) goto L_0x0b0f
            goto L_0x0b66
        L_0x0b0f:
            java.util.List r9 = r9.mo12909a()     // Catch:{ all -> 0x0f23 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0f23 }
        L_0x0b17:
            boolean r12 = r9.hasNext()     // Catch:{ all -> 0x0f23 }
            if (r12 == 0) goto L_0x0b66
            java.lang.Object r12 = r9.next()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.a1 r12 = (p147g.p156d.p157a.p167b.p173d.p180g.C3909a1) r12     // Catch:{ all -> 0x0f23 }
            r44 = r9
            java.lang.String r9 = r12.mo12057q()     // Catch:{ all -> 0x0f23 }
            boolean r9 = r15.equals(r9)     // Catch:{ all -> 0x0f23 }
            if (r9 == 0) goto L_0x0b63
            boolean r9 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0f23 }
            if (r9 == 0) goto L_0x0b41
            long r15 = r12.mo12061u()     // Catch:{ all -> 0x0f23 }
            java.lang.Long r9 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0f23 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0f23 }
            if (r9 != 0) goto L_0x0b61
        L_0x0b41:
            boolean r9 = r11 instanceof java.lang.String     // Catch:{ all -> 0x0f23 }
            if (r9 == 0) goto L_0x0b4f
            java.lang.String r9 = r12.mo12059s()     // Catch:{ all -> 0x0f23 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0f23 }
            if (r9 != 0) goto L_0x0b61
        L_0x0b4f:
            boolean r9 = r11 instanceof java.lang.Double     // Catch:{ all -> 0x0f23 }
            if (r9 == 0) goto L_0x0b66
            double r15 = r12.mo12063w()     // Catch:{ all -> 0x0f23 }
            java.lang.Double r9 = java.lang.Double.valueOf(r15)     // Catch:{ all -> 0x0f23 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0f23 }
            if (r9 == 0) goto L_0x0b66
        L_0x0b61:
            r9 = 1
            goto L_0x0b67
        L_0x0b63:
            r9 = r44
            goto L_0x0b17
        L_0x0b66:
            r9 = 0
        L_0x0b67:
            if (r9 != 0) goto L_0x0b7c
            com.google.android.gms.measurement.internal.x4 r9 = r43.mo7548c()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r11 = r4.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r11 = r11.mo12168p0()     // Catch:{ all -> 0x0f23 }
            java.lang.String r12 = r8.mo12932r()     // Catch:{ all -> 0x0f23 }
            int r9 = r9.mo7736d(r11, r12)     // Catch:{ all -> 0x0f23 }
            goto L_0x0b7d
        L_0x0b7c:
            r9 = 1
        L_0x0b7d:
            if (r9 > 0) goto L_0x0ba3
            com.google.android.gms.measurement.internal.c5 r10 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.y3 r10 = r10.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r10 = r10.mo7818w()     // Catch:{ all -> 0x0f23 }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r8.mo12932r()     // Catch:{ all -> 0x0f23 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0f23 }
            r10.mo7090a(r11, r12, r9)     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.e6 r9 = r8.mo12346f()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4 r9 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r9     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.y0 r9 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r9     // Catch:{ all -> 0x0f23 }
            r3.add(r9)     // Catch:{ all -> 0x0f23 }
            goto L_0x0acf
        L_0x0ba3:
            java.lang.String r11 = r8.mo12932r()     // Catch:{ all -> 0x0d5e }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0d5e }
            com.google.android.gms.measurement.internal.n r11 = (com.google.android.gms.measurement.internal.C2389n) r11     // Catch:{ all -> 0x0d5e }
            if (r11 != 0) goto L_0x0c01
            com.google.android.gms.measurement.internal.c r11 = r43.mo7551e()     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.c1 r12 = r4.f6750a     // Catch:{ all -> 0x0d5e }
            java.lang.String r12 = r12.mo12168p0()     // Catch:{ all -> 0x0d5e }
            java.lang.String r15 = r8.mo12932r()     // Catch:{ all -> 0x0d5e }
            com.google.android.gms.measurement.internal.n r11 = r11.mo7151a(r12, r15)     // Catch:{ all -> 0x0d5e }
            if (r11 != 0) goto L_0x0c01
            com.google.android.gms.measurement.internal.c5 r11 = r1.f6735i     // Catch:{ all -> 0x0d5e }
            com.google.android.gms.measurement.internal.y3 r11 = r11.mo7098j()     // Catch:{ all -> 0x0d5e }
            com.google.android.gms.measurement.internal.a4 r11 = r11.mo7818w()     // Catch:{ all -> 0x0d5e }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            g.d.a.b.d.g.c1 r15 = r4.f6750a     // Catch:{ all -> 0x0d5e }
            java.lang.String r15 = r15.mo12168p0()     // Catch:{ all -> 0x0d5e }
            java.lang.String r1 = r8.mo12932r()     // Catch:{ all -> 0x0d5e }
            r11.mo7090a(r12, r15, r1)     // Catch:{ all -> 0x0d5e }
            com.google.android.gms.measurement.internal.n r11 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.c1 r1 = r4.f6750a     // Catch:{ all -> 0x0d5e }
            java.lang.String r27 = r1.mo12168p0()     // Catch:{ all -> 0x0d5e }
            java.lang.String r28 = r8.mo12932r()     // Catch:{ all -> 0x0d5e }
            r29 = 1
            r31 = 1
            r33 = 1
            long r35 = r8.mo12933s()     // Catch:{ all -> 0x0d5e }
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r26 = r11
            r26.<init>(r27, r28, r29, r31, r33, r35, r37, r39, r40, r41, r42)     // Catch:{ all -> 0x0d5e }
        L_0x0c01:
            com.google.android.gms.measurement.internal.r9 r1 = r43.mo7554m()     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.e6 r12 = r8.mo12346f()     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.t4 r12 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r12     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.y0 r12 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r12     // Catch:{ all -> 0x0d5e }
            java.lang.String r15 = "_eid"
            java.lang.Object r1 = r1.mo7605a(r12, r15)     // Catch:{ all -> 0x0d5e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0d5e }
            if (r1 == 0) goto L_0x0c19
            r12 = 1
            goto L_0x0c1a
        L_0x0c19:
            r12 = 0
        L_0x0c1a:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0d5e }
            r15 = 1
            if (r9 != r15) goto L_0x0c4f
            g.d.a.b.d.g.e6 r1 = r8.mo12346f()     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.t4 r1 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r1     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.y0 r1 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r1     // Catch:{ all -> 0x0d5e }
            r3.add(r1)     // Catch:{ all -> 0x0d5e }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0d5e }
            if (r1 == 0) goto L_0x0c4a
            java.lang.Long r1 = r11.f6699i     // Catch:{ all -> 0x0d5e }
            if (r1 != 0) goto L_0x0c3e
            java.lang.Long r1 = r11.f6700j     // Catch:{ all -> 0x0d5e }
            if (r1 != 0) goto L_0x0c3e
            java.lang.Boolean r1 = r11.f6701k     // Catch:{ all -> 0x0d5e }
            if (r1 == 0) goto L_0x0c4a
        L_0x0c3e:
            r1 = 0
            com.google.android.gms.measurement.internal.n r9 = r11.mo7515a(r1, r1, r1)     // Catch:{ all -> 0x0d5e }
            java.lang.String r1 = r8.mo12932r()     // Catch:{ all -> 0x0d5e }
            r2.put(r1, r9)     // Catch:{ all -> 0x0d5e }
        L_0x0c4a:
            r6.mo12186a(r7, r8)     // Catch:{ all -> 0x0d5e }
            goto L_0x0ad2
        L_0x0c4f:
            int r15 = r5.nextInt(r9)     // Catch:{ all -> 0x0d5e }
            if (r15 != 0) goto L_0x0c91
            com.google.android.gms.measurement.internal.r9 r1 = r43.mo7554m()     // Catch:{ all -> 0x0d5e }
            r44 = r4
            r15 = r5
            long r4 = (long) r9     // Catch:{ all -> 0x0d5e }
            java.lang.Long r9 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d5e }
            r1.mo7612a(r8, r10, r9)     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.e6 r1 = r8.mo12346f()     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.t4 r1 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r1     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.y0 r1 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r1     // Catch:{ all -> 0x0d5e }
            r3.add(r1)     // Catch:{ all -> 0x0d5e }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0d5e }
            if (r1 == 0) goto L_0x0c7e
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d5e }
            r4 = 0
            com.google.android.gms.measurement.internal.n r11 = r11.mo7515a(r4, r1, r4)     // Catch:{ all -> 0x0d5e }
        L_0x0c7e:
            java.lang.String r1 = r8.mo12932r()     // Catch:{ all -> 0x0d5e }
            long r4 = r8.mo12933s()     // Catch:{ all -> 0x0d5e }
            com.google.android.gms.measurement.internal.n r4 = r11.mo7514a(r4, r13)     // Catch:{ all -> 0x0d5e }
            r2.put(r1, r4)     // Catch:{ all -> 0x0d5e }
            r5 = r6
            r1 = r7
            goto L_0x0d1c
        L_0x0c91:
            r44 = r4
            r15 = r5
            java.lang.Long r4 = r11.f6698h     // Catch:{ all -> 0x0d5e }
            if (r4 == 0) goto L_0x0ca3
            java.lang.Long r4 = r11.f6698h     // Catch:{ all -> 0x0d5e }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0d5e }
            r30 = r6
            r16 = r7
            goto L_0x0cb8
        L_0x0ca3:
            r4 = r43
            com.google.android.gms.measurement.internal.c5 r5 = r4.f6735i     // Catch:{ all -> 0x0d5e }
            r5.mo7218v()     // Catch:{ all -> 0x0d5e }
            long r4 = r8.mo12934t()     // Catch:{ all -> 0x0d5e }
            r30 = r6
            r16 = r7
            r6 = r20
            long r4 = com.google.android.gms.measurement.internal.C2489v9.m10003a(r4, r6)     // Catch:{ all -> 0x0d5e }
        L_0x0cb8:
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0d06
            com.google.android.gms.measurement.internal.r9 r1 = r43.mo7554m()     // Catch:{ all -> 0x0d5e }
            java.lang.String r4 = "_efs"
            r5 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d5e }
            r1.mo7612a(r8, r4, r7)     // Catch:{ all -> 0x0d5e }
            com.google.android.gms.measurement.internal.r9 r1 = r43.mo7554m()     // Catch:{ all -> 0x0d5e }
            long r5 = (long) r9     // Catch:{ all -> 0x0d5e }
            java.lang.Long r4 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d5e }
            r1.mo7612a(r8, r10, r4)     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.e6 r1 = r8.mo12346f()     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.t4 r1 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r1     // Catch:{ all -> 0x0d5e }
            g.d.a.b.d.g.y0 r1 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r1     // Catch:{ all -> 0x0d5e }
            r3.add(r1)     // Catch:{ all -> 0x0d5e }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0d5e }
            if (r1 == 0) goto L_0x0cf6
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d5e }
            r4 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0d5e }
            r4 = 0
            com.google.android.gms.measurement.internal.n r11 = r11.mo7515a(r4, r1, r5)     // Catch:{ all -> 0x0d5e }
        L_0x0cf6:
            java.lang.String r1 = r8.mo12932r()     // Catch:{ all -> 0x0d5e }
            long r4 = r8.mo12933s()     // Catch:{ all -> 0x0d5e }
            com.google.android.gms.measurement.internal.n r4 = r11.mo7514a(r4, r13)     // Catch:{ all -> 0x0d5e }
            r2.put(r1, r4)     // Catch:{ all -> 0x0d5e }
            goto L_0x0d18
        L_0x0d06:
            boolean r4 = r12.booleanValue()     // Catch:{ all -> 0x0d5e }
            if (r4 == 0) goto L_0x0d18
            java.lang.String r4 = r8.mo12932r()     // Catch:{ all -> 0x0d5e }
            r5 = 0
            com.google.android.gms.measurement.internal.n r1 = r11.mo7515a(r1, r5, r5)     // Catch:{ all -> 0x0d5e }
            r2.put(r4, r1)     // Catch:{ all -> 0x0d5e }
        L_0x0d18:
            r1 = r16
            r5 = r30
        L_0x0d1c:
            r5.mo12186a(r1, r8)     // Catch:{ all -> 0x0d5e }
        L_0x0d1f:
            int r7 = r1 + 1
            r1 = r43
            r4 = r44
            r6 = r5
            r5 = r15
            goto L_0x0a45
        L_0x0d29:
            r44 = r4
            r5 = r6
            int r1 = r3.size()     // Catch:{ all -> 0x0d5e }
            int r4 = r5.mo12231p()     // Catch:{ all -> 0x0d5e }
            if (r1 >= r4) goto L_0x0d3c
            r5.mo12233q()     // Catch:{ all -> 0x0d5e }
            r5.mo12191a(r3)     // Catch:{ all -> 0x0d5e }
        L_0x0d3c:
            java.util.Set r1 = r2.entrySet()     // Catch:{ all -> 0x0d5e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0d5e }
        L_0x0d44:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0d5e }
            if (r2 == 0) goto L_0x0d66
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0d5e }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0d5e }
            com.google.android.gms.measurement.internal.c r3 = r43.mo7551e()     // Catch:{ all -> 0x0d5e }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0d5e }
            com.google.android.gms.measurement.internal.n r2 = (com.google.android.gms.measurement.internal.C2389n) r2     // Catch:{ all -> 0x0d5e }
            r3.mo7158a(r2)     // Catch:{ all -> 0x0d5e }
            goto L_0x0d44
        L_0x0d5e:
            r0 = move-exception
            r1 = r43
            goto L_0x0f24
        L_0x0d63:
            r44 = r4
            r5 = r6
        L_0x0d66:
            r1 = r43
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.b r2 = r2.mo7211o()     // Catch:{ all -> 0x0f23 }
            java.lang.String r3 = r5.mo12240x()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C2457t.f6935o0     // Catch:{ all -> 0x0f23 }
            boolean r2 = r2.mo7116e(r3, r4)     // Catch:{ all -> 0x0f23 }
            if (r2 != 0) goto L_0x0d7d
            m9659a(r5)     // Catch:{ all -> 0x0f23 }
        L_0x0d7d:
            r2 = r44
            g.d.a.b.d.g.c1 r3 = r2.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r3 = r3.mo12168p0()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.c r4 = r43.mo7551e()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.f5 r4 = r4.mo7166b(r3)     // Catch:{ all -> 0x0f23 }
            if (r4 != 0) goto L_0x0da9
            com.google.android.gms.measurement.internal.c5 r4 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r4 = r4.mo7815t()     // Catch:{ all -> 0x0f23 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            g.d.a.b.d.g.c1 r7 = r2.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r7 = r7.mo12168p0()     // Catch:{ all -> 0x0f23 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r7)     // Catch:{ all -> 0x0f23 }
            r4.mo7089a(r6, r7)     // Catch:{ all -> 0x0f23 }
            goto L_0x0e04
        L_0x0da9:
            int r6 = r5.mo12231p()     // Catch:{ all -> 0x0f23 }
            if (r6 <= 0) goto L_0x0e04
            long r6 = r4.mo7341t()     // Catch:{ all -> 0x0f23 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0dbd
            r5.mo12208e(r6)     // Catch:{ all -> 0x0f23 }
            goto L_0x0dc0
        L_0x0dbd:
            r5.mo12239w()     // Catch:{ all -> 0x0f23 }
        L_0x0dc0:
            long r8 = r4.mo7340s()     // Catch:{ all -> 0x0f23 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0dcb
            goto L_0x0dcc
        L_0x0dcb:
            r6 = r8
        L_0x0dcc:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0dd4
            r5.mo12204d(r6)     // Catch:{ all -> 0x0f23 }
            goto L_0x0dd7
        L_0x0dd4:
            r5.mo12238v()     // Catch:{ all -> 0x0f23 }
        L_0x0dd7:
            r4.mo7287E()     // Catch:{ all -> 0x0f23 }
            long r6 = r4.mo7284B()     // Catch:{ all -> 0x0f23 }
            int r7 = (int) r6     // Catch:{ all -> 0x0f23 }
            r5.mo12213g(r7)     // Catch:{ all -> 0x0f23 }
            long r6 = r5.mo12236t()     // Catch:{ all -> 0x0f23 }
            r4.mo7292a(r6)     // Catch:{ all -> 0x0f23 }
            long r6 = r5.mo12237u()     // Catch:{ all -> 0x0f23 }
            r4.mo7299b(r6)     // Catch:{ all -> 0x0f23 }
            java.lang.String r6 = r4.mo7309e()     // Catch:{ all -> 0x0f23 }
            if (r6 == 0) goto L_0x0dfa
            r5.mo12223j(r6)     // Catch:{ all -> 0x0f23 }
            goto L_0x0dfd
        L_0x0dfa:
            r5.mo12241y()     // Catch:{ all -> 0x0f23 }
        L_0x0dfd:
            com.google.android.gms.measurement.internal.c r6 = r43.mo7551e()     // Catch:{ all -> 0x0f23 }
            r6.mo7157a(r4)     // Catch:{ all -> 0x0f23 }
        L_0x0e04:
            int r4 = r5.mo12231p()     // Catch:{ all -> 0x0f23 }
            if (r4 <= 0) goto L_0x0e6a
            com.google.android.gms.measurement.internal.c5 r4 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            r4.mo7094f()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.x4 r4 = r43.mo7548c()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r6 = r2.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r6 = r6.mo12168p0()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.s0 r4 = r4.mo7730a(r6)     // Catch:{ all -> 0x0f23 }
            if (r4 == 0) goto L_0x0e2e
            boolean r6 = r4.mo12761a()     // Catch:{ all -> 0x0f23 }
            if (r6 != 0) goto L_0x0e26
            goto L_0x0e2e
        L_0x0e26:
            long r6 = r4.mo12763q()     // Catch:{ all -> 0x0f23 }
            r5.mo12220i(r6)     // Catch:{ all -> 0x0f23 }
            goto L_0x0e59
        L_0x0e2e:
            g.d.a.b.d.g.c1 r4 = r2.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r4 = r4.mo12124C()     // Catch:{ all -> 0x0f23 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0f23 }
            if (r4 == 0) goto L_0x0e40
            r6 = -1
            r5.mo12220i(r6)     // Catch:{ all -> 0x0f23 }
            goto L_0x0e59
        L_0x0e40:
            com.google.android.gms.measurement.internal.c5 r4 = r1.f6735i     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r4 = r4.mo7818w()     // Catch:{ all -> 0x0f23 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            g.d.a.b.d.g.c1 r7 = r2.f6750a     // Catch:{ all -> 0x0f23 }
            java.lang.String r7 = r7.mo12168p0()     // Catch:{ all -> 0x0f23 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r7)     // Catch:{ all -> 0x0f23 }
            r4.mo7089a(r6, r7)     // Catch:{ all -> 0x0f23 }
        L_0x0e59:
            com.google.android.gms.measurement.internal.c r4 = r43.mo7551e()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.e6 r5 = r5.mo12346f()     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.t4 r5 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r5     // Catch:{ all -> 0x0f23 }
            g.d.a.b.d.g.c1 r5 = (p147g.p156d.p157a.p167b.p173d.p180g.C3941c1) r5     // Catch:{ all -> 0x0f23 }
            r13 = r19
            r4.mo7164a(r5, r13)     // Catch:{ all -> 0x0f23 }
        L_0x0e6a:
            com.google.android.gms.measurement.internal.c r4 = r43.mo7551e()     // Catch:{ all -> 0x0f23 }
            java.util.List<java.lang.Long> r2 = r2.f6751b     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.common.internal.C2148s.m8834a(r2)     // Catch:{ all -> 0x0f23 }
            r4.mo7274c()     // Catch:{ all -> 0x0f23 }
            r4.mo7459r()     // Catch:{ all -> 0x0f23 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0f23 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0f23 }
            r6 = 0
        L_0x0e81:
            int r7 = r2.size()     // Catch:{ all -> 0x0f23 }
            if (r6 >= r7) goto L_0x0e9e
            if (r6 == 0) goto L_0x0e8e
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0f23 }
        L_0x0e8e:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0f23 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0f23 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0f23 }
            r5.append(r7)     // Catch:{ all -> 0x0f23 }
            int r6 = r6 + 1
            goto L_0x0e81
        L_0x0e9e:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0f23 }
            android.database.sqlite.SQLiteDatabase r6 = r4.mo7183v()     // Catch:{ all -> 0x0f23 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0f23 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0f23 }
            int r6 = r2.size()     // Catch:{ all -> 0x0f23 }
            if (r5 == r6) goto L_0x0ed1
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r4 = r4.mo7815t()     // Catch:{ all -> 0x0f23 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0f23 }
            int r2 = r2.size()     // Catch:{ all -> 0x0f23 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0f23 }
            r4.mo7090a(r6, r5, r2)     // Catch:{ all -> 0x0f23 }
        L_0x0ed1:
            com.google.android.gms.measurement.internal.c r2 = r43.mo7551e()     // Catch:{ all -> 0x0f23 }
            android.database.sqlite.SQLiteDatabase r4 = r2.mo7183v()     // Catch:{ all -> 0x0f23 }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0ee8 }
            r7 = 0
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x0ee8 }
            r7 = 1
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x0ee8 }
            r4.execSQL(r5, r6)     // Catch:{ SQLiteException -> 0x0ee8 }
            goto L_0x0efb
        L_0x0ee8:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo7098j()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7815t()     // Catch:{ all -> 0x0f23 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r3)     // Catch:{ all -> 0x0f23 }
            r2.mo7090a(r5, r3, r4)     // Catch:{ all -> 0x0f23 }
        L_0x0efb:
            com.google.android.gms.measurement.internal.c r2 = r43.mo7551e()     // Catch:{ all -> 0x0f23 }
            r2.mo7182u()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.c r2 = r43.mo7551e()
            r2.mo7187z()
            r2 = 1
            return r2
        L_0x0f0b:
            com.google.android.gms.measurement.internal.c r2 = r43.mo7551e()     // Catch:{ all -> 0x0f23 }
            r2.mo7182u()     // Catch:{ all -> 0x0f23 }
            com.google.android.gms.measurement.internal.c r2 = r43.mo7551e()
            r2.mo7187z()
            r2 = 0
            return r2
        L_0x0f1b:
            r0 = move-exception
            r2 = r0
        L_0x0f1d:
            if (r5 == 0) goto L_0x0f22
            r5.close()     // Catch:{ all -> 0x0f23 }
        L_0x0f22:
            throw r2     // Catch:{ all -> 0x0f23 }
        L_0x0f23:
            r0 = move-exception
        L_0x0f24:
            r2 = r0
            com.google.android.gms.measurement.internal.c r3 = r43.mo7551e()
            r3.mo7187z()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2399n9.m9665a(java.lang.String, long):boolean");
    }

    /* renamed from: b */
    private final Boolean m9666b(C2299f5 f5Var) {
        try {
            if (f5Var.mo7343v() != -2147483648L) {
                if (f5Var.mo7343v() == ((long) C2175c.m8939a(this.f6735i.mo7096h()).mo6964b(f5Var.mo7328l(), 0).versionCode)) {
                    return Boolean.valueOf(true);
                }
            } else {
                String str = C2175c.m8939a(this.f6735i.mo7096h()).mo6964b(f5Var.mo7328l(), 0).versionName;
                if (f5Var.mo7342u() != null && f5Var.mo7342u().equals(str)) {
                    return Boolean.valueOf(true);
                }
            }
            return Boolean.valueOf(false);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static void m9667b(C2363k9 k9Var) {
        if (k9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!k9Var.mo7458q()) {
            String valueOf = String.valueOf(k9Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:287:0x095c, code lost:
        r11 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0393 A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03ca A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03f0 A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0443 A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x072d A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0747 A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0762 A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x07af A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x07c9 A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x082e A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x083b A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0855 A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x08d4 A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x08e5 A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x08fd A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0944 A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x099e A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x022f A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0237 A[Catch:{ SQLiteException -> 0x035b, all -> 0x09ed }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9668b(com.google.android.gms.measurement.internal.C2435r r30, com.google.android.gms.measurement.internal.C2244aa r31) {
        /*
            r29 = this;
            r1 = r29
            r2 = r30
            r3 = r31
            java.lang.String r4 = "_sno"
            com.google.android.gms.common.internal.C2148s.m8834a(r31)
            java.lang.String r5 = r3.f6243f
            com.google.android.gms.common.internal.C2148s.m8844b(r5)
            long r5 = java.lang.System.nanoTime()
            r29.m9675y()
            r29.mo7557p()
            java.lang.String r15 = r3.f6243f
            r29.mo7554m()
            boolean r7 = com.google.android.gms.measurement.internal.C2445r9.m9780a(r30, r31)
            if (r7 != 0) goto L_0x0026
            return
        L_0x0026:
            boolean r7 = r3.f6250m
            if (r7 != 0) goto L_0x002e
            r1.mo7547c(r3)
            return
        L_0x002e:
            com.google.android.gms.measurement.internal.x4 r7 = r29.mo7548c()
            java.lang.String r8 = r2.f6817f
            boolean r7 = r7.mo7733b(r15, r8)
            java.lang.String r14 = "_err"
            r13 = 0
            if (r7 == 0) goto L_0x00d9
            com.google.android.gms.measurement.internal.c5 r3 = r1.f6735i
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo7098j()
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7818w()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r15)
            com.google.android.gms.measurement.internal.c5 r5 = r1.f6735i
            com.google.android.gms.measurement.internal.w3 r5 = r5.mo7219w()
            java.lang.String r6 = r2.f6817f
            java.lang.String r5 = r5.mo7718a(r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.mo7090a(r6, r4, r5)
            com.google.android.gms.measurement.internal.x4 r3 = r29.mo7548c()
            boolean r3 = r3.mo7740g(r15)
            if (r3 != 0) goto L_0x0073
            com.google.android.gms.measurement.internal.x4 r3 = r29.mo7548c()
            boolean r3 = r3.mo7741h(r15)
            if (r3 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r3 = 0
            goto L_0x0074
        L_0x0073:
            r3 = 1
        L_0x0074:
            if (r3 != 0) goto L_0x008f
            java.lang.String r4 = r2.f6817f
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.c5 r4 = r1.f6735i
            com.google.android.gms.measurement.internal.v9 r7 = r4.mo7218v()
            r9 = 11
            java.lang.String r11 = r2.f6817f
            r12 = 0
            java.lang.String r10 = "_ev"
            r8 = r15
            r7.mo7698a(r8, r9, r10, r11, r12)
        L_0x008f:
            if (r3 == 0) goto L_0x00d8
            com.google.android.gms.measurement.internal.c r2 = r29.mo7551e()
            com.google.android.gms.measurement.internal.f5 r2 = r2.mo7166b(r15)
            if (r2 == 0) goto L_0x00d8
            long r3 = r2.mo7286D()
            long r5 = r2.mo7285C()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.c5 r5 = r1.f6735i
            com.google.android.gms.common.util.e r5 = r5.mo7095g()
            long r5 = r5.mo6988b()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C2457t.f6956z
            java.lang.Object r5 = r5.mo7587a(r13)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d8
            com.google.android.gms.measurement.internal.c5 r3 = r1.f6735i
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo7098j()
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7809A()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.mo7088a(r4)
            r1.m9656a(r2)
        L_0x00d8:
            return
        L_0x00d9:
            boolean r7 = p147g.p156d.p157a.p167b.p173d.p180g.C4298y8.m17628b()
            if (r7 == 0) goto L_0x01ba
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i
            com.google.android.gms.measurement.internal.b r7 = r7.mo7211o()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.C2457t.f6885L0
            boolean r7 = r7.mo7108a(r8)
            if (r7 == 0) goto L_0x01ba
            com.google.android.gms.measurement.internal.c4 r7 = new com.google.android.gms.measurement.internal.c4
            java.lang.String r8 = r2.f6817f
            java.lang.String r9 = r2.f6819h
            com.google.android.gms.measurement.internal.m r10 = r2.f6818g
            android.os.Bundle r19 = r10.mo7499b()
            long r11 = r2.f6820i
            r16 = r7
            r17 = r8
            r18 = r9
            r20 = r11
            r16.<init>(r17, r18, r19, r20)
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i
            com.google.android.gms.measurement.internal.v9 r2 = r2.mo7218v()
            com.google.android.gms.measurement.internal.c5 r8 = r1.f6735i
            com.google.android.gms.measurement.internal.b r8 = r8.mo7211o()
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r9 = com.google.android.gms.measurement.internal.C2457t.f6878I
            r10 = 25
            r11 = 100
            int r8 = r8.mo7104a(r15, r9, r10, r11)
            java.util.TreeSet r9 = new java.util.TreeSet
            android.os.Bundle r10 = r7.f6309d
            java.util.Set r10 = r10.keySet()
            r9.<init>(r10)
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
        L_0x012c:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0199
            java.lang.Object r11 = r9.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = com.google.android.gms.measurement.internal.C2489v9.m10028e(r11)
            if (r12 == 0) goto L_0x018b
            int r10 = r10 + 1
            if (r10 <= r8) goto L_0x018b
            r12 = 48
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r12)
            java.lang.String r12 = "Event can't contain more than "
            r13.append(r12)
            r13.append(r8)
            java.lang.String r12 = " params"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.google.android.gms.measurement.internal.y3 r13 = r2.mo7098j()
            com.google.android.gms.measurement.internal.a4 r13 = r13.mo7817v()
            r30 = r8
            com.google.android.gms.measurement.internal.w3 r8 = r2.mo7824e()
            r17 = r9
            java.lang.String r9 = r7.f6306a
            java.lang.String r8 = r8.mo7718a(r9)
            com.google.android.gms.measurement.internal.w3 r9 = r2.mo7824e()
            r18 = r2
            android.os.Bundle r2 = r7.f6309d
            java.lang.String r2 = r9.mo7716a(r2)
            r13.mo7090a(r12, r8, r2)
            android.os.Bundle r2 = r7.f6309d
            r8 = 5
            com.google.android.gms.measurement.internal.C2489v9.m10023b(r2, r8)
            android.os.Bundle r2 = r7.f6309d
            r2.remove(r11)
            goto L_0x0191
        L_0x018b:
            r18 = r2
            r30 = r8
            r17 = r9
        L_0x0191:
            r8 = r30
            r9 = r17
            r2 = r18
            r13 = 0
            goto L_0x012c
        L_0x0199:
            com.google.android.gms.measurement.internal.r r2 = new com.google.android.gms.measurement.internal.r
            java.lang.String r8 = r7.f6306a
            com.google.android.gms.measurement.internal.m r9 = new com.google.android.gms.measurement.internal.m
            android.os.Bundle r10 = new android.os.Bundle
            android.os.Bundle r11 = r7.f6309d
            r10.<init>(r11)
            r9.<init>(r10)
            java.lang.String r10 = r7.f6307b
            long r11 = r7.f6308c
            r22 = r2
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r22.<init>(r23, r24, r25, r26)
        L_0x01ba:
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo7098j()
            r8 = 2
            boolean r7 = r7.mo7814a(r8)
            if (r7 == 0) goto L_0x01e0
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo7098j()
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7810B()
            com.google.android.gms.measurement.internal.c5 r9 = r1.f6735i
            com.google.android.gms.measurement.internal.w3 r9 = r9.mo7219w()
            java.lang.String r9 = r9.mo7717a(r2)
            java.lang.String r10 = "Logging event"
            r7.mo7089a(r10, r9)
        L_0x01e0:
            com.google.android.gms.measurement.internal.c r7 = r29.mo7551e()
            r7.mo7186y()
            r1.mo7547c(r3)     // Catch:{ all -> 0x09ed }
            boolean r7 = p147g.p156d.p157a.p167b.p173d.p180g.C3988e9.m16328b()     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x0200
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.b r7 = r7.mo7211o()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C2457t.f6883K0     // Catch:{ all -> 0x09ed }
            boolean r7 = r7.mo7108a(r9)     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x0200
            r7 = 1
            goto L_0x0201
        L_0x0200:
            r7 = 0
        L_0x0201:
            java.lang.String r9 = "ecommerce_purchase"
            java.lang.String r10 = r2.f6817f     // Catch:{ all -> 0x09ed }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x09ed }
            java.lang.String r10 = "refund"
            if (r9 != 0) goto L_0x0224
            if (r7 == 0) goto L_0x0222
            java.lang.String r7 = "purchase"
            java.lang.String r9 = r2.f6817f     // Catch:{ all -> 0x09ed }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x09ed }
            if (r7 != 0) goto L_0x0224
            java.lang.String r7 = r2.f6817f     // Catch:{ all -> 0x09ed }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x0222
            goto L_0x0224
        L_0x0222:
            r7 = 0
            goto L_0x0225
        L_0x0224:
            r7 = 1
        L_0x0225:
            java.lang.String r9 = "_iap"
            java.lang.String r11 = r2.f6817f     // Catch:{ all -> 0x09ed }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x09ed }
            if (r9 != 0) goto L_0x0234
            if (r7 == 0) goto L_0x0232
            goto L_0x0234
        L_0x0232:
            r9 = 0
            goto L_0x0235
        L_0x0234:
            r9 = 1
        L_0x0235:
            if (r9 == 0) goto L_0x03d9
            com.google.android.gms.measurement.internal.m r9 = r2.f6818g     // Catch:{ all -> 0x09ed }
            java.lang.String r11 = "currency"
            java.lang.String r9 = r9.mo7502d(r11)     // Catch:{ all -> 0x09ed }
            java.lang.String r11 = "value"
            if (r7 == 0) goto L_0x02b2
            com.google.android.gms.measurement.internal.m r7 = r2.f6818g     // Catch:{ all -> 0x09ed }
            java.lang.Double r7 = r7.mo7501c(r11)     // Catch:{ all -> 0x09ed }
            double r12 = r7.doubleValue()     // Catch:{ all -> 0x09ed }
            r17 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r12 = r12 * r17
            r19 = 0
            int r7 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r7 != 0) goto L_0x0267
            com.google.android.gms.measurement.internal.m r7 = r2.f6818g     // Catch:{ all -> 0x09ed }
            java.lang.Long r7 = r7.mo7500b(r11)     // Catch:{ all -> 0x09ed }
            long r11 = r7.longValue()     // Catch:{ all -> 0x09ed }
            double r11 = (double) r11     // Catch:{ all -> 0x09ed }
            double r12 = r11 * r17
        L_0x0267:
            r17 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r7 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r7 > 0) goto L_0x0295
            r17 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r7 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r7 < 0) goto L_0x0295
            long r11 = java.lang.Math.round(r12)     // Catch:{ all -> 0x09ed }
            boolean r7 = p147g.p156d.p157a.p167b.p173d.p180g.C3988e9.m16328b()     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x02bc
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.b r7 = r7.mo7211o()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C2457t.f6883K0     // Catch:{ all -> 0x09ed }
            boolean r7 = r7.mo7108a(r13)     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x02bc
            java.lang.String r7 = r2.f6817f     // Catch:{ all -> 0x09ed }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x02bc
            long r11 = -r11
            goto L_0x02bc
        L_0x0295:
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo7098j()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7818w()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = "Data lost. Currency value is too big. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r15)     // Catch:{ all -> 0x09ed }
            java.lang.Double r10 = java.lang.Double.valueOf(r12)     // Catch:{ all -> 0x09ed }
            r7.mo7090a(r8, r9, r10)     // Catch:{ all -> 0x09ed }
            r22 = r5
            r5 = 0
            r11 = 0
            goto L_0x03c8
        L_0x02b2:
            com.google.android.gms.measurement.internal.m r7 = r2.f6818g     // Catch:{ all -> 0x09ed }
            java.lang.Long r7 = r7.mo7500b(r11)     // Catch:{ all -> 0x09ed }
            long r11 = r7.longValue()     // Catch:{ all -> 0x09ed }
        L_0x02bc:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x09ed }
            if (r7 != 0) goto L_0x03c4
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x09ed }
            java.lang.String r7 = r9.toUpperCase(r7)     // Catch:{ all -> 0x09ed }
            java.lang.String r9 = "[A-Z]{3}"
            boolean r9 = r7.matches(r9)     // Catch:{ all -> 0x09ed }
            if (r9 == 0) goto L_0x03c4
            java.lang.String r9 = "_ltv_"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x09ed }
            int r10 = r7.length()     // Catch:{ all -> 0x09ed }
            if (r10 == 0) goto L_0x02e1
            java.lang.String r7 = r9.concat(r7)     // Catch:{ all -> 0x09ed }
            goto L_0x02e6
        L_0x02e1:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x09ed }
            r7.<init>(r9)     // Catch:{ all -> 0x09ed }
        L_0x02e6:
            r10 = r7
            com.google.android.gms.measurement.internal.c r7 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.w9 r7 = r7.mo7170c(r15, r10)     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x0322
            java.lang.Object r9 = r7.f7062e     // Catch:{ all -> 0x09ed }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x09ed }
            if (r9 != 0) goto L_0x02f8
            goto L_0x0322
        L_0x02f8:
            java.lang.Object r7 = r7.f7062e     // Catch:{ all -> 0x09ed }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x09ed }
            long r7 = r7.longValue()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.w9 r17 = new com.google.android.gms.measurement.internal.w9     // Catch:{ all -> 0x09ed }
            java.lang.String r9 = r2.f6819h     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r13 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.common.util.e r13 = r13.mo7095g()     // Catch:{ all -> 0x09ed }
            long r18 = r13.mo6988b()     // Catch:{ all -> 0x09ed }
            long r7 = r7 + r11
            java.lang.Long r13 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x09ed }
            r7 = r17
            r8 = r15
            r22 = r5
            r5 = 0
            r6 = 1
            r11 = r18
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x09ed }
        L_0x031f:
            r6 = r17
            goto L_0x0389
        L_0x0322:
            r22 = r5
            r5 = 0
            r6 = 1
            com.google.android.gms.measurement.internal.c r7 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r9 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.b r9 = r9.mo7211o()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r13 = com.google.android.gms.measurement.internal.C2457t.f6870E     // Catch:{ all -> 0x09ed }
            int r9 = r9.mo7110b(r15, r13)     // Catch:{ all -> 0x09ed }
            int r9 = r9 - r6
            com.google.android.gms.common.internal.C2148s.m8844b(r15)     // Catch:{ all -> 0x09ed }
            r7.mo7274c()     // Catch:{ all -> 0x09ed }
            r7.mo7459r()     // Catch:{ all -> 0x09ed }
            android.database.sqlite.SQLiteDatabase r13 = r7.mo7183v()     // Catch:{ SQLiteException -> 0x035b }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x035b }
            r6[r5] = r15     // Catch:{ SQLiteException -> 0x035b }
            r16 = 1
            r6[r16] = r15     // Catch:{ SQLiteException -> 0x035b }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x035b }
            r16 = 2
            r6[r16] = r9     // Catch:{ SQLiteException -> 0x035b }
            r13.execSQL(r8, r6)     // Catch:{ SQLiteException -> 0x035b }
            goto L_0x036e
        L_0x035b:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo7098j()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7815t()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = "Error pruning currencies. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r15)     // Catch:{ all -> 0x09ed }
            r7.mo7090a(r8, r9, r6)     // Catch:{ all -> 0x09ed }
        L_0x036e:
            com.google.android.gms.measurement.internal.w9 r17 = new com.google.android.gms.measurement.internal.w9     // Catch:{ all -> 0x09ed }
            java.lang.String r9 = r2.f6819h     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r6 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.common.util.e r6 = r6.mo7095g()     // Catch:{ all -> 0x09ed }
            long r18 = r6.mo6988b()     // Catch:{ all -> 0x09ed }
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x09ed }
            r7 = r17
            r8 = r15
            r11 = r18
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x09ed }
            goto L_0x031f
        L_0x0389:
            com.google.android.gms.measurement.internal.c r7 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            boolean r7 = r7.mo7163a(r6)     // Catch:{ all -> 0x09ed }
            if (r7 != 0) goto L_0x03c7
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo7098j()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7815t()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r15)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r10 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.w3 r10 = r10.mo7219w()     // Catch:{ all -> 0x09ed }
            java.lang.String r11 = r6.f7060c     // Catch:{ all -> 0x09ed }
            java.lang.String r10 = r10.mo7720c(r11)     // Catch:{ all -> 0x09ed }
            java.lang.Object r6 = r6.f7062e     // Catch:{ all -> 0x09ed }
            r7.mo7091a(r8, r9, r10, r6)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r6 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.v9 r7 = r6.mo7218v()     // Catch:{ all -> 0x09ed }
            r9 = 9
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r15
            r7.mo7698a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x09ed }
            goto L_0x03c7
        L_0x03c4:
            r22 = r5
            r5 = 0
        L_0x03c7:
            r11 = 1
        L_0x03c8:
            if (r11 != 0) goto L_0x03dc
            com.google.android.gms.measurement.internal.c r2 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            r2.mo7182u()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c r2 = r29.mo7551e()
            r2.mo7187z()
            return
        L_0x03d9:
            r22 = r5
            r5 = 0
        L_0x03dc:
            java.lang.String r6 = r2.f6817f     // Catch:{ all -> 0x09ed }
            boolean r6 = com.google.android.gms.measurement.internal.C2489v9.m10028e(r6)     // Catch:{ all -> 0x09ed }
            java.lang.String r7 = r2.f6817f     // Catch:{ all -> 0x09ed }
            boolean r18 = r14.equals(r7)     // Catch:{ all -> 0x09ed }
            boolean r7 = p147g.p156d.p157a.p167b.p173d.p180g.C3988e9.m16328b()     // Catch:{ all -> 0x09ed }
            r19 = 1
            if (r7 == 0) goto L_0x040f
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.b r7 = r7.mo7211o()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = r3.f6243f     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C2457t.f6875G0     // Catch:{ all -> 0x09ed }
            boolean r7 = r7.mo7116e(r8, r9)     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x040f
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            r7.mo7218v()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.m r7 = r2.f6818g     // Catch:{ all -> 0x09ed }
            long r7 = com.google.android.gms.measurement.internal.C2489v9.m10004a(r7)     // Catch:{ all -> 0x09ed }
            long r7 = r7 + r19
            r11 = r7
            goto L_0x0411
        L_0x040f:
            r11 = r19
        L_0x0411:
            com.google.android.gms.measurement.internal.c r7 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            long r8 = r29.m9676z()     // Catch:{ all -> 0x09ed }
            r13 = 1
            r16 = 0
            r17 = 0
            r10 = r15
            r14 = r6
            r30 = r15
            r15 = r16
            r16 = r18
            com.google.android.gms.measurement.internal.f r7 = r7.mo7149a(r8, r10, r11, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x09ed }
            long r8 = r7.f6395b     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.C2457t.f6926k     // Catch:{ all -> 0x09ed }
            r14 = 0
            java.lang.Object r10 = r10.mo7587a(r14)     // Catch:{ all -> 0x09ed }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x09ed }
            int r10 = r10.intValue()     // Catch:{ all -> 0x09ed }
            long r10 = (long) r10     // Catch:{ all -> 0x09ed }
            long r8 = r8 - r10
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            int r15 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x0470
            long r8 = r8 % r10
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x0461
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo7098j()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7815t()     // Catch:{ all -> 0x09ed }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r30)     // Catch:{ all -> 0x09ed }
            long r5 = r7.f6395b     // Catch:{ all -> 0x09ed }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x09ed }
            r2.mo7090a(r3, r4, r5)     // Catch:{ all -> 0x09ed }
        L_0x0461:
            com.google.android.gms.measurement.internal.c r2 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            r2.mo7182u()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c r2 = r29.mo7551e()
            r2.mo7187z()
            return
        L_0x0470:
            if (r6 == 0) goto L_0x04c5
            long r8 = r7.f6394a     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.C2457t.f6930m     // Catch:{ all -> 0x09ed }
            java.lang.Object r15 = r15.mo7587a(r14)     // Catch:{ all -> 0x09ed }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ all -> 0x09ed }
            int r15 = r15.intValue()     // Catch:{ all -> 0x09ed }
            long r14 = (long) r15     // Catch:{ all -> 0x09ed }
            long r8 = r8 - r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x04c5
            long r8 = r8 % r10
            int r3 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x04a4
            com.google.android.gms.measurement.internal.c5 r3 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo7098j()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7815t()     // Catch:{ all -> 0x09ed }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r30)     // Catch:{ all -> 0x09ed }
            long r6 = r7.f6394a     // Catch:{ all -> 0x09ed }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x09ed }
            r3.mo7090a(r4, r5, r6)     // Catch:{ all -> 0x09ed }
        L_0x04a4:
            com.google.android.gms.measurement.internal.c5 r3 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.v9 r7 = r3.mo7218v()     // Catch:{ all -> 0x09ed }
            r9 = 16
            java.lang.String r10 = "_ev"
            java.lang.String r11 = r2.f6817f     // Catch:{ all -> 0x09ed }
            r12 = 0
            r8 = r30
            r7.mo7698a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c r2 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            r2.mo7182u()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c r2 = r29.mo7551e()
            r2.mo7187z()
            return
        L_0x04c5:
            if (r18 == 0) goto L_0x0514
            long r8 = r7.f6397d     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r10 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.b r10 = r10.mo7211o()     // Catch:{ all -> 0x09ed }
            java.lang.String r11 = r3.f6243f     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.C2457t.f6928l     // Catch:{ all -> 0x09ed }
            int r10 = r10.mo7110b(r11, r14)     // Catch:{ all -> 0x09ed }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x09ed }
            int r10 = java.lang.Math.max(r5, r10)     // Catch:{ all -> 0x09ed }
            long r10 = (long) r10     // Catch:{ all -> 0x09ed }
            long r8 = r8 - r10
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0514
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x0505
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo7098j()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7815t()     // Catch:{ all -> 0x09ed }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r30)     // Catch:{ all -> 0x09ed }
            long r5 = r7.f6397d     // Catch:{ all -> 0x09ed }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x09ed }
            r2.mo7090a(r3, r4, r5)     // Catch:{ all -> 0x09ed }
        L_0x0505:
            com.google.android.gms.measurement.internal.c r2 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            r2.mo7182u()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c r2 = r29.mo7551e()
            r2.mo7187z()
            return
        L_0x0514:
            com.google.android.gms.measurement.internal.m r7 = r2.f6818g     // Catch:{ all -> 0x09ed }
            android.os.Bundle r14 = r7.mo7499b()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.v9 r7 = r7.mo7218v()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = "_o"
            java.lang.String r9 = r2.f6819h     // Catch:{ all -> 0x09ed }
            r7.mo7690a(r14, r8, r9)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.v9 r7 = r7.mo7218v()     // Catch:{ all -> 0x09ed }
            r15 = r30
            boolean r7 = r7.mo7710d(r15)     // Catch:{ all -> 0x09ed }
            java.lang.String r11 = "_r"
            if (r7 == 0) goto L_0x0553
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.v9 r7 = r7.mo7218v()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = "_dbg"
            java.lang.Long r9 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x09ed }
            r7.mo7690a(r14, r8, r9)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.v9 r7 = r7.mo7218v()     // Catch:{ all -> 0x09ed }
            java.lang.Long r8 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x09ed }
            r7.mo7690a(r14, r11, r8)     // Catch:{ all -> 0x09ed }
        L_0x0553:
            java.lang.String r7 = "_s"
            java.lang.String r8 = r2.f6817f     // Catch:{ all -> 0x09ed }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x057a
            com.google.android.gms.measurement.internal.c r7 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = r3.f6243f     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.w9 r7 = r7.mo7170c(r8, r4)     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x057a
            java.lang.Object r8 = r7.f7062e     // Catch:{ all -> 0x09ed }
            boolean r8 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x09ed }
            if (r8 == 0) goto L_0x057a
            com.google.android.gms.measurement.internal.c5 r8 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.v9 r8 = r8.mo7218v()     // Catch:{ all -> 0x09ed }
            java.lang.Object r7 = r7.f7062e     // Catch:{ all -> 0x09ed }
            r8.mo7690a(r14, r4, r7)     // Catch:{ all -> 0x09ed }
        L_0x057a:
            com.google.android.gms.measurement.internal.c r4 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            long r7 = r4.mo7169c(r15)     // Catch:{ all -> 0x09ed }
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x059d
            com.google.android.gms.measurement.internal.c5 r4 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo7098j()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.a4 r4 = r4.mo7818w()     // Catch:{ all -> 0x09ed }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r15)     // Catch:{ all -> 0x09ed }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x09ed }
            r4.mo7090a(r9, r10, r7)     // Catch:{ all -> 0x09ed }
        L_0x059d:
            com.google.android.gms.measurement.internal.k r4 = new com.google.android.gms.measurement.internal.k     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r8 = r1.f6735i     // Catch:{ all -> 0x09ed }
            java.lang.String r9 = r2.f6819h     // Catch:{ all -> 0x09ed }
            java.lang.String r10 = r2.f6817f     // Catch:{ all -> 0x09ed }
            long r12 = r2.f6820i     // Catch:{ all -> 0x09ed }
            r18 = 0
            r7 = r4
            r2 = r10
            r10 = r15
            r5 = r11
            r11 = r2
            r16 = r14
            r2 = r15
            r28 = 0
            r14 = r18
            r7.<init>(r8, r9, r10, r11, r12, r14, r16)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c r7 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = r4.f6573b     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.n r7 = r7.mo7151a(r2, r8)     // Catch:{ all -> 0x09ed }
            if (r7 != 0) goto L_0x063b
            com.google.android.gms.measurement.internal.c r7 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            long r7 = r7.mo7179h(r2)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r9 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.b r9 = r9.mo7211o()     // Catch:{ all -> 0x09ed }
            int r9 = r9.mo7103a(r2)     // Catch:{ all -> 0x09ed }
            long r9 = (long) r9     // Catch:{ all -> 0x09ed }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0621
            if (r6 == 0) goto L_0x0621
            com.google.android.gms.measurement.internal.c5 r3 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo7098j()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7815t()     // Catch:{ all -> 0x09ed }
            java.lang.String r5 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r2)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo7219w()     // Catch:{ all -> 0x09ed }
            java.lang.String r4 = r4.f6573b     // Catch:{ all -> 0x09ed }
            java.lang.String r4 = r7.mo7718a(r4)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.b r7 = r7.mo7211o()     // Catch:{ all -> 0x09ed }
            int r7 = r7.mo7103a(r2)     // Catch:{ all -> 0x09ed }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x09ed }
            r3.mo7091a(r5, r6, r4, r7)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r3 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.v9 r7 = r3.mo7218v()     // Catch:{ all -> 0x09ed }
            r9 = 8
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r2
            r7.mo7698a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c r2 = r29.mo7551e()
            r2.mo7187z()
            return
        L_0x0621:
            com.google.android.gms.measurement.internal.n r6 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x09ed }
            java.lang.String r9 = r4.f6573b     // Catch:{ all -> 0x09ed }
            r10 = 0
            r12 = 0
            long r14 = r4.f6575d     // Catch:{ all -> 0x09ed }
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r7 = r6
            r8 = r2
            r7.<init>(r8, r9, r10, r12, r14, r16, r18, r19, r20, r21)     // Catch:{ all -> 0x09ed }
            goto L_0x0649
        L_0x063b:
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i     // Catch:{ all -> 0x09ed }
            long r8 = r7.f6696f     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.k r4 = r4.mo7450a(r2, r8)     // Catch:{ all -> 0x09ed }
            long r8 = r4.f6575d     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.n r6 = r7.mo7513a(r8)     // Catch:{ all -> 0x09ed }
        L_0x0649:
            com.google.android.gms.measurement.internal.c r2 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            r2.mo7158a(r6)     // Catch:{ all -> 0x09ed }
            r29.m9675y()     // Catch:{ all -> 0x09ed }
            r29.mo7557p()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.common.internal.C2148s.m8834a(r4)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.common.internal.C2148s.m8834a(r31)     // Catch:{ all -> 0x09ed }
            java.lang.String r2 = r4.f6572a     // Catch:{ all -> 0x09ed }
            com.google.android.gms.common.internal.C2148s.m8844b(r2)     // Catch:{ all -> 0x09ed }
            java.lang.String r2 = r4.f6572a     // Catch:{ all -> 0x09ed }
            java.lang.String r6 = r3.f6243f     // Catch:{ all -> 0x09ed }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.common.internal.C2148s.m8841a(r2)     // Catch:{ all -> 0x09ed }
            g.d.a.b.d.g.c1$a r2 = p147g.p156d.p157a.p167b.p173d.p180g.C3941c1.m15877s0()     // Catch:{ all -> 0x09ed }
            r6 = 1
            r2.mo12184a(r6)     // Catch:{ all -> 0x09ed }
            java.lang.String r7 = "android"
            r2.mo12192a(r7)     // Catch:{ all -> 0x09ed }
            java.lang.String r7 = r3.f6243f     // Catch:{ all -> 0x09ed }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09ed }
            if (r7 != 0) goto L_0x0686
            java.lang.String r7 = r3.f6243f     // Catch:{ all -> 0x09ed }
            r2.mo12212f(r7)     // Catch:{ all -> 0x09ed }
        L_0x0686:
            java.lang.String r7 = r3.f6246i     // Catch:{ all -> 0x09ed }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09ed }
            if (r7 != 0) goto L_0x0693
            java.lang.String r7 = r3.f6246i     // Catch:{ all -> 0x09ed }
            r2.mo12209e(r7)     // Catch:{ all -> 0x09ed }
        L_0x0693:
            java.lang.String r7 = r3.f6245h     // Catch:{ all -> 0x09ed }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09ed }
            if (r7 != 0) goto L_0x06a0
            java.lang.String r7 = r3.f6245h     // Catch:{ all -> 0x09ed }
            r2.mo12215g(r7)     // Catch:{ all -> 0x09ed }
        L_0x06a0:
            long r7 = r3.f6252o     // Catch:{ all -> 0x09ed }
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x06af
            long r7 = r3.f6252o     // Catch:{ all -> 0x09ed }
            int r8 = (int) r7     // Catch:{ all -> 0x09ed }
            r2.mo12216h(r8)     // Catch:{ all -> 0x09ed }
        L_0x06af:
            long r7 = r3.f6247j     // Catch:{ all -> 0x09ed }
            r2.mo12211f(r7)     // Catch:{ all -> 0x09ed }
            java.lang.String r7 = r3.f6244g     // Catch:{ all -> 0x09ed }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09ed }
            if (r7 != 0) goto L_0x06c1
            java.lang.String r7 = r3.f6244g     // Catch:{ all -> 0x09ed }
            r2.mo12225k(r7)     // Catch:{ all -> 0x09ed }
        L_0x06c1:
            boolean r7 = p147g.p156d.p157a.p167b.p173d.p180g.C4157pa.m16931b()     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x0710
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.b r7 = r7.mo7211o()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = r3.f6243f     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C2457t.f6937p0     // Catch:{ all -> 0x09ed }
            boolean r7 = r7.mo7116e(r8, r9)     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x0710
            java.lang.String r7 = r2.mo12242z()     // Catch:{ all -> 0x09ed }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x06ee
            java.lang.String r7 = r3.f6242A     // Catch:{ all -> 0x09ed }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09ed }
            if (r7 != 0) goto L_0x06ee
            java.lang.String r7 = r3.f6242A     // Catch:{ all -> 0x09ed }
            r2.mo12232p(r7)     // Catch:{ all -> 0x09ed }
        L_0x06ee:
            java.lang.String r7 = r2.mo12242z()     // Catch:{ all -> 0x09ed }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x0725
            java.lang.String r7 = r2.mo12183C()     // Catch:{ all -> 0x09ed }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x0725
            java.lang.String r7 = r3.f6260w     // Catch:{ all -> 0x09ed }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09ed }
            if (r7 != 0) goto L_0x0725
            java.lang.String r7 = r3.f6260w     // Catch:{ all -> 0x09ed }
        L_0x070c:
            r2.mo12230o(r7)     // Catch:{ all -> 0x09ed }
            goto L_0x0725
        L_0x0710:
            java.lang.String r7 = r2.mo12242z()     // Catch:{ all -> 0x09ed }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x0725
            java.lang.String r7 = r3.f6260w     // Catch:{ all -> 0x09ed }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09ed }
            if (r7 != 0) goto L_0x0725
            java.lang.String r7 = r3.f6260w     // Catch:{ all -> 0x09ed }
            goto L_0x070c
        L_0x0725:
            long r7 = r3.f6248k     // Catch:{ all -> 0x09ed }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0732
            long r7 = r3.f6248k     // Catch:{ all -> 0x09ed }
            r2.mo12217h(r7)     // Catch:{ all -> 0x09ed }
        L_0x0732:
            long r7 = r3.f6262y     // Catch:{ all -> 0x09ed }
            r2.mo12224k(r7)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.b r7 = r7.mo7211o()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = r3.f6243f     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C2457t.f6903X     // Catch:{ all -> 0x09ed }
            boolean r7 = r7.mo7116e(r8, r11)     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x0754
            com.google.android.gms.measurement.internal.r9 r7 = r29.mo7554m()     // Catch:{ all -> 0x09ed }
            java.util.List r7 = r7.mo7616u()     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x0754
            r2.mo12202c(r7)     // Catch:{ all -> 0x09ed }
        L_0x0754:
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.l4 r7 = r7.mo7212p()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = r3.f6243f     // Catch:{ all -> 0x09ed }
            android.util.Pair r7 = r7.mo7469a(r8)     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x0787
            java.lang.Object r8 = r7.first     // Catch:{ all -> 0x09ed }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x09ed }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x09ed }
            if (r8 != 0) goto L_0x0787
            boolean r8 = r3.f6257t     // Catch:{ all -> 0x09ed }
            if (r8 == 0) goto L_0x07e9
            java.lang.Object r8 = r7.first     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x09ed }
            r2.mo12218h(r8)     // Catch:{ all -> 0x09ed }
            java.lang.Object r8 = r7.second     // Catch:{ all -> 0x09ed }
            if (r8 == 0) goto L_0x07e9
            java.lang.Object r7 = r7.second     // Catch:{ all -> 0x09ed }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x09ed }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x09ed }
            r2.mo12193a(r7)     // Catch:{ all -> 0x09ed }
            goto L_0x07e9
        L_0x0787:
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.l r7 = r7.mo7195F()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r8 = r1.f6735i     // Catch:{ all -> 0x09ed }
            android.content.Context r8 = r8.mo7096h()     // Catch:{ all -> 0x09ed }
            boolean r7 = r7.mo7462a(r8)     // Catch:{ all -> 0x09ed }
            if (r7 != 0) goto L_0x07e9
            boolean r7 = r3.f6258u     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x07e9
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            android.content.Context r7 = r7.mo7096h()     // Catch:{ all -> 0x09ed }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = "android_id"
            java.lang.String r7 = android.provider.Settings.Secure.getString(r7, r8)     // Catch:{ all -> 0x09ed }
            if (r7 != 0) goto L_0x07c9
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo7098j()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7818w()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = "null secure ID. appId"
            java.lang.String r11 = r2.mo12240x()     // Catch:{ all -> 0x09ed }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r11)     // Catch:{ all -> 0x09ed }
            r7.mo7089a(r8, r11)     // Catch:{ all -> 0x09ed }
            java.lang.String r7 = "null"
            goto L_0x07e6
        L_0x07c9:
            boolean r8 = r7.isEmpty()     // Catch:{ all -> 0x09ed }
            if (r8 == 0) goto L_0x07e6
            com.google.android.gms.measurement.internal.c5 r8 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.y3 r8 = r8.mo7098j()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo7818w()     // Catch:{ all -> 0x09ed }
            java.lang.String r11 = "empty secure ID. appId"
            java.lang.String r12 = r2.mo12240x()     // Catch:{ all -> 0x09ed }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r12)     // Catch:{ all -> 0x09ed }
            r8.mo7089a(r11, r12)     // Catch:{ all -> 0x09ed }
        L_0x07e6:
            r2.mo12228m(r7)     // Catch:{ all -> 0x09ed }
        L_0x07e9:
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.l r7 = r7.mo7195F()     // Catch:{ all -> 0x09ed }
            r7.mo7742o()     // Catch:{ all -> 0x09ed }
            java.lang.String r7 = android.os.Build.MODEL     // Catch:{ all -> 0x09ed }
            r2.mo12203c(r7)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.l r7 = r7.mo7195F()     // Catch:{ all -> 0x09ed }
            r7.mo7742o()     // Catch:{ all -> 0x09ed }
            java.lang.String r7 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x09ed }
            r2.mo12197b(r7)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.l r7 = r7.mo7195F()     // Catch:{ all -> 0x09ed }
            long r7 = r7.mo7463t()     // Catch:{ all -> 0x09ed }
            int r8 = (int) r7     // Catch:{ all -> 0x09ed }
            r2.mo12210f(r8)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.l r7 = r7.mo7195F()     // Catch:{ all -> 0x09ed }
            java.lang.String r7 = r7.mo7464u()     // Catch:{ all -> 0x09ed }
            r2.mo12205d(r7)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.b r7 = r7.mo7211o()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.C2457t.f6889N0     // Catch:{ all -> 0x09ed }
            boolean r7 = r7.mo7108a(r8)     // Catch:{ all -> 0x09ed }
            if (r7 != 0) goto L_0x0833
            long r7 = r3.f6254q     // Catch:{ all -> 0x09ed }
            r2.mo12222j(r7)     // Catch:{ all -> 0x09ed }
        L_0x0833:
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x09ed }
            boolean r7 = r7.mo7204c()     // Catch:{ all -> 0x09ed }
            if (r7 == 0) goto L_0x0849
            r2.mo12240x()     // Catch:{ all -> 0x09ed }
            boolean r7 = android.text.TextUtils.isEmpty(r28)     // Catch:{ all -> 0x09ed }
            if (r7 != 0) goto L_0x0849
            r7 = r28
            r2.mo12229n(r7)     // Catch:{ all -> 0x09ed }
        L_0x0849:
            com.google.android.gms.measurement.internal.c r7 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = r3.f6243f     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.f5 r7 = r7.mo7166b(r8)     // Catch:{ all -> 0x09ed }
            if (r7 != 0) goto L_0x08ca
            com.google.android.gms.measurement.internal.f5 r7 = new com.google.android.gms.measurement.internal.f5     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r8 = r1.f6735i     // Catch:{ all -> 0x09ed }
            java.lang.String r11 = r3.f6243f     // Catch:{ all -> 0x09ed }
            r7.<init>(r8, r11)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r8 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.v9 r8 = r8.mo7218v()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = r8.mo7714w()     // Catch:{ all -> 0x09ed }
            r7.mo7294a(r8)     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = r3.f6253p     // Catch:{ all -> 0x09ed }
            r7.mo7314f(r8)     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = r3.f6244g     // Catch:{ all -> 0x09ed }
            r7.mo7300b(r8)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r8 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.l4 r8 = r8.mo7212p()     // Catch:{ all -> 0x09ed }
            java.lang.String r11 = r3.f6243f     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = r8.mo7472b(r11)     // Catch:{ all -> 0x09ed }
            r7.mo7311e(r8)     // Catch:{ all -> 0x09ed }
            r7.mo7315g(r9)     // Catch:{ all -> 0x09ed }
            r7.mo7292a(r9)     // Catch:{ all -> 0x09ed }
            r7.mo7299b(r9)     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = r3.f6245h     // Catch:{ all -> 0x09ed }
            r7.mo7316g(r8)     // Catch:{ all -> 0x09ed }
            long r11 = r3.f6252o     // Catch:{ all -> 0x09ed }
            r7.mo7303c(r11)     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = r3.f6246i     // Catch:{ all -> 0x09ed }
            r7.mo7319h(r8)     // Catch:{ all -> 0x09ed }
            long r11 = r3.f6247j     // Catch:{ all -> 0x09ed }
            r7.mo7307d(r11)     // Catch:{ all -> 0x09ed }
            long r11 = r3.f6248k     // Catch:{ all -> 0x09ed }
            r7.mo7310e(r11)     // Catch:{ all -> 0x09ed }
            boolean r8 = r3.f6250m     // Catch:{ all -> 0x09ed }
            r7.mo7296a(r8)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r8 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.b r8 = r8.mo7211o()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C2457t.f6889N0     // Catch:{ all -> 0x09ed }
            boolean r8 = r8.mo7108a(r11)     // Catch:{ all -> 0x09ed }
            if (r8 != 0) goto L_0x08be
            long r11 = r3.f6254q     // Catch:{ all -> 0x09ed }
            r7.mo7337p(r11)     // Catch:{ all -> 0x09ed }
        L_0x08be:
            long r11 = r3.f6262y     // Catch:{ all -> 0x09ed }
            r7.mo7313f(r11)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c r8 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            r8.mo7157a(r7)     // Catch:{ all -> 0x09ed }
        L_0x08ca:
            java.lang.String r8 = r7.mo7330m()     // Catch:{ all -> 0x09ed }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x09ed }
            if (r8 != 0) goto L_0x08db
            java.lang.String r8 = r7.mo7330m()     // Catch:{ all -> 0x09ed }
            r2.mo12221i(r8)     // Catch:{ all -> 0x09ed }
        L_0x08db:
            java.lang.String r8 = r7.mo7339r()     // Catch:{ all -> 0x09ed }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x09ed }
            if (r8 != 0) goto L_0x08ec
            java.lang.String r7 = r7.mo7339r()     // Catch:{ all -> 0x09ed }
            r2.mo12227l(r7)     // Catch:{ all -> 0x09ed }
        L_0x08ec:
            com.google.android.gms.measurement.internal.c r7 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            java.lang.String r3 = r3.f6243f     // Catch:{ all -> 0x09ed }
            java.util.List r3 = r7.mo7153a(r3)     // Catch:{ all -> 0x09ed }
            r11 = 0
        L_0x08f7:
            int r7 = r3.size()     // Catch:{ all -> 0x09ed }
            if (r11 >= r7) goto L_0x092c
            g.d.a.b.d.g.g1$a r7 = p147g.p156d.p157a.p167b.p173d.p180g.C4012g1.m16402y()     // Catch:{ all -> 0x09ed }
            java.lang.Object r8 = r3.get(r11)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.w9 r8 = (com.google.android.gms.measurement.internal.C2500w9) r8     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = r8.f7060c     // Catch:{ all -> 0x09ed }
            r7.mo12478a(r8)     // Catch:{ all -> 0x09ed }
            java.lang.Object r8 = r3.get(r11)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.w9 r8 = (com.google.android.gms.measurement.internal.C2500w9) r8     // Catch:{ all -> 0x09ed }
            long r12 = r8.f7061d     // Catch:{ all -> 0x09ed }
            r7.mo12477a(r12)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.r9 r8 = r29.mo7554m()     // Catch:{ all -> 0x09ed }
            java.lang.Object r12 = r3.get(r11)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.w9 r12 = (com.google.android.gms.measurement.internal.C2500w9) r12     // Catch:{ all -> 0x09ed }
            java.lang.Object r12 = r12.f7062e     // Catch:{ all -> 0x09ed }
            r8.mo7611a(r7, r12)     // Catch:{ all -> 0x09ed }
            r2.mo12188a(r7)     // Catch:{ all -> 0x09ed }
            int r11 = r11 + 1
            goto L_0x08f7
        L_0x092c:
            com.google.android.gms.measurement.internal.c r3 = r29.mo7551e()     // Catch:{ IOException -> 0x09a1 }
            g.d.a.b.d.g.e6 r7 = r2.mo12346f()     // Catch:{ IOException -> 0x09a1 }
            g.d.a.b.d.g.t4 r7 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r7     // Catch:{ IOException -> 0x09a1 }
            g.d.a.b.d.g.c1 r7 = (p147g.p156d.p157a.p167b.p173d.p180g.C3941c1) r7     // Catch:{ IOException -> 0x09a1 }
            long r2 = r3.mo7147a(r7)     // Catch:{ IOException -> 0x09a1 }
            com.google.android.gms.measurement.internal.c r7 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.m r8 = r4.f6577f     // Catch:{ all -> 0x09ed }
            if (r8 == 0) goto L_0x0997
            com.google.android.gms.measurement.internal.m r8 = r4.f6577f     // Catch:{ all -> 0x09ed }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x09ed }
        L_0x094a:
            boolean r11 = r8.hasNext()     // Catch:{ all -> 0x09ed }
            if (r11 == 0) goto L_0x095e
            java.lang.Object r11 = r8.next()     // Catch:{ all -> 0x09ed }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x09ed }
            boolean r11 = r5.equals(r11)     // Catch:{ all -> 0x09ed }
            if (r11 == 0) goto L_0x094a
        L_0x095c:
            r11 = 1
            goto L_0x0998
        L_0x095e:
            com.google.android.gms.measurement.internal.x4 r5 = r29.mo7548c()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = r4.f6572a     // Catch:{ all -> 0x09ed }
            java.lang.String r11 = r4.f6573b     // Catch:{ all -> 0x09ed }
            boolean r5 = r5.mo7735c(r8, r11)     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c r11 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            long r12 = r29.m9676z()     // Catch:{ all -> 0x09ed }
            java.lang.String r14 = r4.f6572a     // Catch:{ all -> 0x09ed }
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.google.android.gms.measurement.internal.f r8 = r11.mo7150a(r12, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x09ed }
            if (r5 == 0) goto L_0x0997
            long r11 = r8.f6398e     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c5 r5 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.b r5 = r5.mo7211o()     // Catch:{ all -> 0x09ed }
            java.lang.String r8 = r4.f6572a     // Catch:{ all -> 0x09ed }
            int r5 = r5.mo7109b(r8)     // Catch:{ all -> 0x09ed }
            long r13 = (long) r5     // Catch:{ all -> 0x09ed }
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0997
            goto L_0x095c
        L_0x0997:
            r11 = 0
        L_0x0998:
            boolean r2 = r7.mo7161a(r4, r2, r11)     // Catch:{ all -> 0x09ed }
            if (r2 == 0) goto L_0x09ba
            r1.f6738l = r9     // Catch:{ all -> 0x09ed }
            goto L_0x09ba
        L_0x09a1:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.c5 r4 = r1.f6735i     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo7098j()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.a4 r4 = r4.mo7815t()     // Catch:{ all -> 0x09ed }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.mo12240x()     // Catch:{ all -> 0x09ed }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r2)     // Catch:{ all -> 0x09ed }
            r4.mo7090a(r5, r2, r3)     // Catch:{ all -> 0x09ed }
        L_0x09ba:
            com.google.android.gms.measurement.internal.c r2 = r29.mo7551e()     // Catch:{ all -> 0x09ed }
            r2.mo7182u()     // Catch:{ all -> 0x09ed }
            com.google.android.gms.measurement.internal.c r2 = r29.mo7551e()
            r2.mo7187z()
            r29.m9651B()
            com.google.android.gms.measurement.internal.c5 r2 = r1.f6735i
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo7098j()
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7810B()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r22
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo7089a(r4, r3)
            return
        L_0x09ed:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.c r3 = r29.mo7551e()
            r3.mo7187z()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2399n9.m9668b(com.google.android.gms.measurement.internal.r, com.google.android.gms.measurement.internal.aa):void");
    }

    /* renamed from: b */
    private final void m9669b(C4290a aVar, C4290a aVar2) {
        C2148s.m8841a("_e".equals(aVar.mo12932r()));
        mo7554m();
        String str = "_et";
        C3909a1 b = C2445r9.m9783b((C4289y0) ((C4214t4) aVar.mo12346f()), str);
        if (b.mo12060t() && b.mo12061u() > 0) {
            long u = b.mo12061u();
            mo7554m();
            C3909a1 b2 = C2445r9.m9783b((C4289y0) ((C4214t4) aVar2.mo12346f()), str);
            if (b2 != null && b2.mo12061u() > 0) {
                u += b2.mo12061u();
            }
            mo7554m().mo7612a(aVar2, str, (Object) Long.valueOf(u));
            mo7554m().mo7612a(aVar, "_fr", (Object) Long.valueOf(1));
        }
    }

    /* renamed from: e */
    private final boolean m9670e(C2244aa aaVar) {
        return (!C4157pa.m16931b() || !this.f6735i.mo7211o().mo7116e(aaVar.f6243f, C2457t.f6937p0)) ? !TextUtils.isEmpty(aaVar.f6244g) || !TextUtils.isEmpty(aaVar.f6260w) : !TextUtils.isEmpty(aaVar.f6244g) || !TextUtils.isEmpty(aaVar.f6242A) || !TextUtils.isEmpty(aaVar.f6260w);
    }

    /* renamed from: u */
    private final void m9671u() {
        m9675y();
        if (this.f6742p || this.f6743q || this.f6744r) {
            this.f6735i.mo7098j().mo7810B().mo7091a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f6742p), Boolean.valueOf(this.f6743q), Boolean.valueOf(this.f6744r));
            return;
        }
        this.f6735i.mo7098j().mo7810B().mo7088a("Stopping uploading service(s)");
        List<Runnable> list = this.f6739m;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.f6739m.clear();
        }
    }

    /* renamed from: v */
    private final boolean m9672v() {
        String str;
        C2238a4 a4Var;
        m9675y();
        String str2 = "Storage concurrent access okay";
        if (this.f6735i.mo7211o().mo7108a(C2457t.f6933n0)) {
            FileLock fileLock = this.f6745s;
            if (fileLock != null && fileLock.isValid()) {
                this.f6735i.mo7098j().mo7810B().mo7088a(str2);
                return true;
            }
        }
        try {
            FileChannel channel = new RandomAccessFile(new File(this.f6735i.mo7096h().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f6746t = channel;
            FileLock tryLock = channel.tryLock();
            this.f6745s = tryLock;
            if (tryLock != null) {
                this.f6735i.mo7098j().mo7810B().mo7088a(str2);
                return true;
            }
            this.f6735i.mo7098j().mo7815t().mo7088a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            e = e;
            a4Var = this.f6735i.mo7098j().mo7815t();
            str = "Failed to acquire storage lock";
            a4Var.mo7089a(str, e);
            return false;
        } catch (IOException e2) {
            e = e2;
            a4Var = this.f6735i.mo7098j().mo7815t();
            str = "Failed to access storage lock file";
            a4Var.mo7089a(str, e);
            return false;
        } catch (OverlappingFileLockException e3) {
            e = e3;
            a4Var = this.f6735i.mo7098j().mo7818w();
            str = "Storage lock already acquired";
            a4Var.mo7089a(str, e);
            return false;
        }
    }

    /* renamed from: w */
    private final C2346j4 m9673w() {
        C2346j4 j4Var = this.f6730d;
        if (j4Var != null) {
            return j4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: x */
    private final C2351j9 m9674x() {
        m9667b((C2363k9) this.f6731e);
        return this.f6731e;
    }

    /* renamed from: y */
    private final void m9675y() {
        this.f6735i.mo7097i().mo7274c();
    }

    /* renamed from: z */
    private final long m9676z() {
        long b = this.f6735i.mo7095g().mo6988b();
        C2370l4 p = this.f6735i.mo7212p();
        p.mo7742o();
        p.mo7274c();
        long a = p.f6626i.mo7570a();
        if (a == 0) {
            a = 1 + ((long) p.mo7825k().mo7712u().nextInt(86400000));
            p.f6626i.mo7571a(a);
        }
        return ((((b + a) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7530a() {
        this.f6735i.mo7097i().mo7274c();
        mo7551e().mo7142B();
        if (this.f6735i.mo7212p().f6622e.mo7570a() == 0) {
            this.f6735i.mo7212p().f6622e.mo7571a(this.f6735i.mo7095g().mo6988b());
        }
        m9651B();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7531a(int i, Throwable th, byte[] bArr, String str) {
        C2257c e;
        m9675y();
        mo7557p();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f6743q = false;
                m9671u();
                throw th2;
            }
        }
        List<Long> list = this.f6747u;
        this.f6747u = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.f6735i.mo7212p().f6622e.mo7571a(this.f6735i.mo7095g().mo6988b());
                this.f6735i.mo7212p().f6623f.mo7571a(0);
                m9651B();
                this.f6735i.mo7098j().mo7810B().mo7090a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                mo7551e().mo7186y();
                try {
                    for (Long l : list) {
                        try {
                            e = mo7551e();
                            long longValue = l.longValue();
                            e.mo7274c();
                            e.mo7459r();
                            if (e.mo7183v().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e2) {
                            e.mo7098j().mo7815t().mo7089a("Failed to delete a bundle in a queue table", e2);
                            throw e2;
                        } catch (SQLiteException e3) {
                            if (this.f6748v == null || !this.f6748v.contains(l)) {
                                throw e3;
                            }
                        }
                    }
                    mo7551e().mo7182u();
                    mo7551e().mo7187z();
                    this.f6748v = null;
                    if (!mo7549d().mo7355u() || !m9650A()) {
                        this.f6749w = -1;
                        m9651B();
                    } else {
                        mo7558q();
                    }
                    this.f6738l = 0;
                } catch (Throwable th3) {
                    mo7551e().mo7187z();
                    throw th3;
                }
            } catch (SQLiteException e4) {
                this.f6735i.mo7098j().mo7815t().mo7089a("Database error while trying to delete uploaded bundles", e4);
                this.f6738l = this.f6735i.mo7095g().mo6989c();
                this.f6735i.mo7098j().mo7810B().mo7089a("Disable upload, time", Long.valueOf(this.f6738l));
            }
        } else {
            this.f6735i.mo7098j().mo7810B().mo7090a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f6735i.mo7212p().f6623f.mo7571a(this.f6735i.mo7095g().mo6988b());
            if (i != 503) {
                if (i != 429) {
                    z = false;
                }
            }
            if (z) {
                this.f6735i.mo7212p().f6624g.mo7571a(this.f6735i.mo7095g().mo6988b());
            }
            mo7551e().mo7160a(list);
            m9651B();
        }
        this.f6743q = false;
        m9671u();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7532a(C2244aa aaVar) {
        String str = "app_id=?";
        if (this.f6747u != null) {
            ArrayList arrayList = new ArrayList();
            this.f6748v = arrayList;
            arrayList.addAll(this.f6747u);
        }
        C2257c e = mo7551e();
        String str2 = aaVar.f6243f;
        C2148s.m8844b(str2);
        e.mo7274c();
        e.mo7459r();
        try {
            SQLiteDatabase v = e.mo7183v();
            String[] strArr = {str2};
            int delete = v.delete("apps", str, strArr) + 0 + v.delete("events", str, strArr) + v.delete("user_attributes", str, strArr) + v.delete("conditional_properties", str, strArr) + v.delete("raw_events", str, strArr) + v.delete("raw_events_metadata", str, strArr) + v.delete("queue", str, strArr) + v.delete("audience_filter_values", str, strArr) + v.delete("main_event_params", str, strArr);
            if (delete > 0) {
                e.mo7098j().mo7810B().mo7090a("Reset analytics data. app, records", str2, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            e.mo7098j().mo7815t().mo7090a("Error resetting analytics data. appId, error", C2516y3.m10125a(str2), e2);
        }
        if (aaVar.f6250m) {
            mo7543b(aaVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7533a(C2363k9 k9Var) {
        this.f6740n++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7534a(C2388ma maVar) {
        C2244aa a = m9653a(maVar.f6680f);
        if (a != null) {
            mo7535a(maVar, a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7535a(C2388ma maVar, C2244aa aaVar) {
        C2238a4 t;
        String str;
        Object a;
        String c;
        Object a2;
        C2238a4 t2;
        String str2;
        Object a3;
        String c2;
        Object obj;
        C2148s.m8834a(maVar);
        C2148s.m8844b(maVar.f6680f);
        C2148s.m8834a(maVar.f6681g);
        C2148s.m8834a(maVar.f6682h);
        C2148s.m8844b(maVar.f6682h.f6998g);
        m9675y();
        mo7557p();
        if (m9670e(aaVar)) {
            if (!aaVar.f6250m) {
                mo7547c(aaVar);
                return;
            }
            C2388ma maVar2 = new C2388ma(maVar);
            boolean z = false;
            maVar2.f6684j = false;
            mo7551e().mo7186y();
            try {
                C2388ma d = mo7551e().mo7171d(maVar2.f6680f, maVar2.f6682h.f6998g);
                if (d != null && !d.f6681g.equals(maVar2.f6681g)) {
                    this.f6735i.mo7098j().mo7818w().mo7091a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f6735i.mo7219w().mo7720c(maVar2.f6682h.f6998g), maVar2.f6681g, d.f6681g);
                }
                if (d != null && d.f6684j) {
                    maVar2.f6681g = d.f6681g;
                    maVar2.f6683i = d.f6683i;
                    maVar2.f6687m = d.f6687m;
                    maVar2.f6685k = d.f6685k;
                    maVar2.f6688n = d.f6688n;
                    maVar2.f6684j = d.f6684j;
                    C2478u9 u9Var = new C2478u9(maVar2.f6682h.f6998g, d.f6682h.f6999h, maVar2.f6682h.mo7665a(), d.f6682h.f7002k);
                    maVar2.f6682h = u9Var;
                } else if (TextUtils.isEmpty(maVar2.f6685k)) {
                    C2478u9 u9Var2 = new C2478u9(maVar2.f6682h.f6998g, maVar2.f6683i, maVar2.f6682h.mo7665a(), maVar2.f6682h.f7002k);
                    maVar2.f6682h = u9Var2;
                    maVar2.f6684j = true;
                    z = true;
                }
                if (maVar2.f6684j) {
                    C2478u9 u9Var3 = maVar2.f6682h;
                    C2500w9 w9Var = new C2500w9(maVar2.f6680f, maVar2.f6681g, u9Var3.f6998g, u9Var3.f6999h, u9Var3.mo7665a());
                    if (mo7551e().mo7163a(w9Var)) {
                        t2 = this.f6735i.mo7098j().mo7809A();
                        str2 = "User property updated immediately";
                        a3 = maVar2.f6680f;
                        c2 = this.f6735i.mo7219w().mo7720c(w9Var.f7060c);
                        obj = w9Var.f7062e;
                    } else {
                        t2 = this.f6735i.mo7098j().mo7815t();
                        str2 = "(2)Too many active user properties, ignoring";
                        a3 = C2516y3.m10125a(maVar2.f6680f);
                        c2 = this.f6735i.mo7219w().mo7720c(w9Var.f7060c);
                        obj = w9Var.f7062e;
                    }
                    t2.mo7091a(str2, a3, c2, obj);
                    if (z && maVar2.f6688n != null) {
                        m9668b(new C2435r(maVar2.f6688n, maVar2.f6683i), aaVar);
                    }
                }
                if (mo7551e().mo7162a(maVar2)) {
                    t = this.f6735i.mo7098j().mo7809A();
                    str = "Conditional property added";
                    a = maVar2.f6680f;
                    c = this.f6735i.mo7219w().mo7720c(maVar2.f6682h.f6998g);
                    a2 = maVar2.f6682h.mo7665a();
                } else {
                    t = this.f6735i.mo7098j().mo7815t();
                    str = "Too many conditional properties, ignoring";
                    a = C2516y3.m10125a(maVar2.f6680f);
                    c = this.f6735i.mo7219w().mo7720c(maVar2.f6682h.f6998g);
                    a2 = maVar2.f6682h.mo7665a();
                }
                t.mo7091a(str, a, c, a2);
                mo7551e().mo7182u();
            } finally {
                mo7551e().mo7187z();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7536a(C2435r rVar, C2244aa aaVar) {
        List<C2388ma> list;
        List<C2388ma> list2;
        List<C2388ma> list3;
        C2238a4 t;
        String str;
        Object a;
        String c;
        Object obj;
        C2435r rVar2 = rVar;
        C2244aa aaVar2 = aaVar;
        C2148s.m8834a(aaVar);
        C2148s.m8844b(aaVar2.f6243f);
        m9675y();
        mo7557p();
        String str2 = aaVar2.f6243f;
        long j = rVar2.f6820i;
        mo7554m();
        if (C2445r9.m9780a(rVar, aaVar)) {
            if (!aaVar2.f6250m) {
                mo7547c(aaVar2);
                return;
            }
            if (this.f6735i.mo7211o().mo7116e(str2, C2457t.f6913d0)) {
                List<String> list4 = aaVar2.f6263z;
                if (list4 != null) {
                    if (list4.contains(rVar2.f6817f)) {
                        Bundle b = rVar2.f6818g.mo7499b();
                        b.putLong("ga_safelisted", 1);
                        C2435r rVar3 = new C2435r(rVar2.f6817f, new C2377m(b), rVar2.f6819h, rVar2.f6820i);
                        rVar2 = rVar3;
                    } else {
                        this.f6735i.mo7098j().mo7809A().mo7091a("Dropping non-safelisted event. appId, event name, origin", str2, rVar2.f6817f, rVar2.f6819h);
                        return;
                    }
                }
            }
            mo7551e().mo7186y();
            try {
                C2257c e = mo7551e();
                C2148s.m8844b(str2);
                e.mo7274c();
                e.mo7459r();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    e.mo7098j().mo7818w().mo7090a("Invalid time querying timed out conditional properties", C2516y3.m10125a(str2), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = e.mo7156a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (C2388ma maVar : list) {
                    if (maVar != null) {
                        this.f6735i.mo7098j().mo7810B().mo7091a("User property timed out", maVar.f6680f, this.f6735i.mo7219w().mo7720c(maVar.f6682h.f6998g), maVar.f6682h.mo7665a());
                        if (maVar.f6686l != null) {
                            m9668b(new C2435r(maVar.f6686l, j), aaVar2);
                        }
                        mo7551e().mo7173e(str2, maVar.f6682h.f6998g);
                    }
                }
                C2257c e2 = mo7551e();
                C2148s.m8844b(str2);
                e2.mo7274c();
                e2.mo7459r();
                if (i < 0) {
                    e2.mo7098j().mo7818w().mo7090a("Invalid time querying expired conditional properties", C2516y3.m10125a(str2), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = e2.mo7156a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (C2388ma maVar2 : list2) {
                    if (maVar2 != null) {
                        this.f6735i.mo7098j().mo7810B().mo7091a("User property expired", maVar2.f6680f, this.f6735i.mo7219w().mo7720c(maVar2.f6682h.f6998g), maVar2.f6682h.mo7665a());
                        mo7551e().mo7168b(str2, maVar2.f6682h.f6998g);
                        if (maVar2.f6690p != null) {
                            arrayList.add(maVar2.f6690p);
                        }
                        mo7551e().mo7173e(str2, maVar2.f6682h.f6998g);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    m9668b(new C2435r((C2435r) obj2, j), aaVar2);
                }
                C2257c e3 = mo7551e();
                String str3 = rVar2.f6817f;
                C2148s.m8844b(str2);
                C2148s.m8844b(str3);
                e3.mo7274c();
                e3.mo7459r();
                if (i < 0) {
                    e3.mo7098j().mo7818w().mo7091a("Invalid time querying triggered conditional properties", C2516y3.m10125a(str2), e3.mo7824e().mo7718a(str3), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = e3.mo7156a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (C2388ma maVar3 : list3) {
                    if (maVar3 != null) {
                        C2478u9 u9Var = maVar3.f6682h;
                        C2500w9 w9Var = r4;
                        C2500w9 w9Var2 = new C2500w9(maVar3.f6680f, maVar3.f6681g, u9Var.f6998g, j, u9Var.mo7665a());
                        if (mo7551e().mo7163a(w9Var)) {
                            t = this.f6735i.mo7098j().mo7810B();
                            str = "User property triggered";
                            a = maVar3.f6680f;
                            c = this.f6735i.mo7219w().mo7720c(w9Var.f7060c);
                            obj = w9Var.f7062e;
                        } else {
                            t = this.f6735i.mo7098j().mo7815t();
                            str = "Too many active user properties, ignoring";
                            a = C2516y3.m10125a(maVar3.f6680f);
                            c = this.f6735i.mo7219w().mo7720c(w9Var.f7060c);
                            obj = w9Var.f7062e;
                        }
                        t.mo7091a(str, a, c, obj);
                        if (maVar3.f6688n != null) {
                            arrayList2.add(maVar3.f6688n);
                        }
                        maVar3.f6682h = new C2478u9(w9Var);
                        maVar3.f6684j = true;
                        mo7551e().mo7162a(maVar3);
                    }
                }
                m9668b(rVar2, aaVar2);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    m9668b(new C2435r((C2435r) obj3, j), aaVar2);
                }
                mo7551e().mo7182u();
            } finally {
                mo7551e().mo7187z();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7537a(C2435r rVar, String str) {
        C2435r rVar2 = rVar;
        C2299f5 b = mo7551e().mo7166b(str);
        if (b == null || TextUtils.isEmpty(b.mo7342u())) {
            this.f6735i.mo7098j().mo7809A().mo7089a("No app data available; dropping event", str);
            return;
        }
        Boolean b2 = m9666b(b);
        if (b2 == null) {
            if (!"_ui".equals(rVar2.f6817f)) {
                this.f6735i.mo7098j().mo7818w().mo7089a("Could not find package. appId", C2516y3.m10125a(str));
            }
        } else if (!b2.booleanValue()) {
            this.f6735i.mo7098j().mo7815t().mo7089a("App version does not match; dropping event. appId", C2516y3.m10125a(str));
            return;
        }
        C2244aa aaVar = r2;
        C2244aa aaVar2 = new C2244aa(str, b.mo7332n(), b.mo7342u(), b.mo7343v(), b.mo7344w(), b.mo7345x(), b.mo7346y(), (String) null, b.mo7283A(), false, b.mo7339r(), b.mo7312f(), 0, 0, b.mo7317g(), b.mo7320h(), false, b.mo7334o(), b.mo7321i(), b.mo7347z(), b.mo7324j(), (!C4157pa.m16931b() || !this.f6735i.mo7211o().mo7116e(b.mo7328l(), C2457t.f6937p0)) ? null : b.mo7336p());
        mo7536a(rVar2, aaVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7538a(C2478u9 u9Var, C2244aa aaVar) {
        m9675y();
        mo7557p();
        if (m9670e(aaVar)) {
            if (!aaVar.f6250m) {
                mo7547c(aaVar);
                return;
            }
            int b = this.f6735i.mo7218v().mo7705b(u9Var.f6998g);
            C2263c5 c5Var = this.f6735i;
            if (b != 0) {
                c5Var.mo7218v();
                String a = C2489v9.m10008a(u9Var.f6998g, 24, true);
                String str = u9Var.f6998g;
                this.f6735i.mo7218v().mo7698a(aaVar.f6243f, b, "_ev", a, str != null ? str.length() : 0);
                return;
            }
            int b2 = c5Var.mo7218v().mo7706b(u9Var.f6998g, u9Var.mo7665a());
            if (b2 != 0) {
                this.f6735i.mo7218v();
                String a2 = C2489v9.m10008a(u9Var.f6998g, 24, true);
                Object a3 = u9Var.mo7665a();
                this.f6735i.mo7218v().mo7698a(aaVar.f6243f, b2, "_ev", a2, (a3 == null || (!(a3 instanceof String) && !(a3 instanceof CharSequence))) ? 0 : String.valueOf(a3).length());
                return;
            }
            Object c = this.f6735i.mo7218v().mo7708c(u9Var.f6998g, u9Var.mo7665a());
            if (c != null) {
                if ("_sid".equals(u9Var.f6998g)) {
                    long j = u9Var.f6999h;
                    String str2 = u9Var.f7002k;
                    long j2 = 0;
                    C2500w9 c2 = mo7551e().mo7170c(aaVar.f6243f, "_sno");
                    if (c2 != null) {
                        Object obj = c2.f7062e;
                        if (obj instanceof Long) {
                            j2 = ((Long) obj).longValue();
                            C2478u9 u9Var2 = new C2478u9("_sno", j, Long.valueOf(j2 + 1), str2);
                            mo7538a(u9Var2, aaVar);
                        }
                    }
                    if (c2 != null) {
                        this.f6735i.mo7098j().mo7818w().mo7089a("Retrieved last session number from database does not contain a valid (long) value", c2.f7062e);
                    }
                    C2389n a4 = mo7551e().mo7151a(aaVar.f6243f, "_s");
                    if (a4 != null) {
                        j2 = a4.f6693c;
                        this.f6735i.mo7098j().mo7810B().mo7089a("Backfill the session number. Last used session number", Long.valueOf(j2));
                    }
                    C2478u9 u9Var22 = new C2478u9("_sno", j, Long.valueOf(j2 + 1), str2);
                    mo7538a(u9Var22, aaVar);
                }
                C2500w9 w9Var = new C2500w9(aaVar.f6243f, u9Var.f7002k, u9Var.f6998g, u9Var.f6999h, c);
                this.f6735i.mo7098j().mo7810B().mo7090a("Setting user property", this.f6735i.mo7219w().mo7720c(w9Var.f7060c), c);
                mo7551e().mo7186y();
                try {
                    mo7547c(aaVar);
                    boolean a5 = mo7551e().mo7163a(w9Var);
                    mo7551e().mo7182u();
                    if (!a5) {
                        this.f6735i.mo7098j().mo7815t().mo7090a("Too many unique user properties are set. Ignoring user property", this.f6735i.mo7219w().mo7720c(w9Var.f7060c), w9Var.f7062e);
                        this.f6735i.mo7218v().mo7698a(aaVar.f6243f, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    mo7551e().mo7187z();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7539a(Runnable runnable) {
        m9675y();
        if (this.f6739m == null) {
            this.f6739m = new ArrayList();
        }
        this.f6739m.add(runnable);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0132 A[Catch:{ all -> 0x0179, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142 A[Catch:{ all -> 0x0179, all -> 0x0182 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7540a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.m9675y()
            r6.mo7557p()
            com.google.android.gms.common.internal.C2148s.m8844b(r7)
            r0 = 0
            if (r10 != 0) goto L_0x000e
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0182 }
        L_0x000e:
            com.google.android.gms.measurement.internal.c5 r1 = r6.f6735i     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo7098j()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7810B()     // Catch:{ all -> 0x0182 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x0182 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0182 }
            r1.mo7089a(r2, r3)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.c r1 = r6.mo7551e()     // Catch:{ all -> 0x0182 }
            r1.mo7186y()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.c r1 = r6.mo7551e()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.f5 r1 = r1.mo7166b(r7)     // Catch:{ all -> 0x0179 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x003e
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x003e
            if (r8 != r3) goto L_0x0042
        L_0x003e:
            if (r9 != 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.c5 r8 = r6.f6735i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.y3 r8 = r8.mo7098j()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo7818w()     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r7)     // Catch:{ all -> 0x0179 }
            r8.mo7089a(r9, r7)     // Catch:{ all -> 0x0179 }
            goto L_0x016d
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ca
            if (r8 != r5) goto L_0x0061
            goto L_0x00ca
        L_0x0061:
            com.google.android.gms.measurement.internal.c5 r10 = r6.f6735i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r10 = r10.mo7095g()     // Catch:{ all -> 0x0179 }
            long r10 = r10.mo6988b()     // Catch:{ all -> 0x0179 }
            r1.mo7322i(r10)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c r10 = r6.mo7551e()     // Catch:{ all -> 0x0179 }
            r10.mo7157a(r1)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c5 r10 = r6.f6735i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.y3 r10 = r10.mo7098j()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.a4 r10 = r10.mo7810B()     // Catch:{ all -> 0x0179 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0179 }
            r10.mo7090a(r11, r1, r9)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.x4 r9 = r6.mo7548c()     // Catch:{ all -> 0x0179 }
            r9.mo7734c(r7)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c5 r7 = r6.f6735i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.l4 r7 = r7.mo7212p()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.p4 r7 = r7.f6623f     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c5 r9 = r6.f6735i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r9 = r9.mo7095g()     // Catch:{ all -> 0x0179 }
            long r9 = r9.mo6988b()     // Catch:{ all -> 0x0179 }
            r7.mo7571a(r9)     // Catch:{ all -> 0x0179 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00ae
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            if (r4 == 0) goto L_0x00c5
            com.google.android.gms.measurement.internal.c5 r7 = r6.f6735i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.l4 r7 = r7.mo7212p()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.p4 r7 = r7.f6624g     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c5 r8 = r6.f6735i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r8 = r8.mo7095g()     // Catch:{ all -> 0x0179 }
            long r8 = r8.mo6988b()     // Catch:{ all -> 0x0179 }
            r7.mo7571a(r8)     // Catch:{ all -> 0x0179 }
        L_0x00c5:
            r6.m9651B()     // Catch:{ all -> 0x0179 }
            goto L_0x016d
        L_0x00ca:
            r9 = 0
            if (r11 == 0) goto L_0x00d6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x0179 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0179 }
            goto L_0x00d7
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            if (r11 == 0) goto L_0x00e6
            int r2 = r11.size()     // Catch:{ all -> 0x0179 }
            if (r2 <= 0) goto L_0x00e6
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0179 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0179 }
            goto L_0x00e7
        L_0x00e6:
            r11 = r9
        L_0x00e7:
            if (r8 == r5) goto L_0x0103
            if (r8 != r3) goto L_0x00ec
            goto L_0x0103
        L_0x00ec:
            com.google.android.gms.measurement.internal.x4 r9 = r6.mo7548c()     // Catch:{ all -> 0x0179 }
            boolean r9 = r9.mo7731a(r7, r10, r11)     // Catch:{ all -> 0x0179 }
            if (r9 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.c r7 = r6.mo7551e()     // Catch:{ all -> 0x0182 }
        L_0x00fa:
            r7.mo7187z()     // Catch:{ all -> 0x0182 }
            r6.f6742p = r0
            r6.m9671u()
            return
        L_0x0103:
            com.google.android.gms.measurement.internal.x4 r11 = r6.mo7548c()     // Catch:{ all -> 0x0179 }
            g.d.a.b.d.g.s0 r11 = r11.mo7730a(r7)     // Catch:{ all -> 0x0179 }
            if (r11 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.x4 r11 = r6.mo7548c()     // Catch:{ all -> 0x0179 }
            boolean r9 = r11.mo7731a(r7, r9, r9)     // Catch:{ all -> 0x0179 }
            if (r9 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.c r7 = r6.mo7551e()     // Catch:{ all -> 0x0182 }
            goto L_0x00fa
        L_0x011c:
            com.google.android.gms.measurement.internal.c5 r9 = r6.f6735i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r9 = r9.mo7095g()     // Catch:{ all -> 0x0179 }
            long r2 = r9.mo6988b()     // Catch:{ all -> 0x0179 }
            r1.mo7318h(r2)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c r9 = r6.mo7551e()     // Catch:{ all -> 0x0179 }
            r9.mo7157a(r1)     // Catch:{ all -> 0x0179 }
            if (r8 != r5) goto L_0x0142
            com.google.android.gms.measurement.internal.c5 r8 = r6.f6735i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.y3 r8 = r8.mo7098j()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo7820y()     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.mo7089a(r9, r7)     // Catch:{ all -> 0x0179 }
            goto L_0x015a
        L_0x0142:
            com.google.android.gms.measurement.internal.c5 r7 = r6.f6735i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo7098j()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7810B()     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0179 }
            int r10 = r10.length     // Catch:{ all -> 0x0179 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0179 }
            r7.mo7090a(r9, r8, r10)     // Catch:{ all -> 0x0179 }
        L_0x015a:
            com.google.android.gms.measurement.internal.g4 r7 = r6.mo7549d()     // Catch:{ all -> 0x0179 }
            boolean r7 = r7.mo7355u()     // Catch:{ all -> 0x0179 }
            if (r7 == 0) goto L_0x00c5
            boolean r7 = r6.m9650A()     // Catch:{ all -> 0x0179 }
            if (r7 == 0) goto L_0x00c5
            r6.mo7558q()     // Catch:{ all -> 0x0179 }
        L_0x016d:
            com.google.android.gms.measurement.internal.c r7 = r6.mo7551e()     // Catch:{ all -> 0x0179 }
            r7.mo7182u()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c r7 = r6.mo7551e()     // Catch:{ all -> 0x0182 }
            goto L_0x00fa
        L_0x0179:
            r7 = move-exception
            com.google.android.gms.measurement.internal.c r8 = r6.mo7551e()     // Catch:{ all -> 0x0182 }
            r8.mo7187z()     // Catch:{ all -> 0x0182 }
            throw r7     // Catch:{ all -> 0x0182 }
        L_0x0182:
            r7 = move-exception
            r6.f6742p = r0
            r6.m9671u()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2399n9.mo7540a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7541a(boolean z) {
        m9651B();
    }

    /* renamed from: b */
    public final C2245b mo7542b() {
        return this.f6735i.mo7211o();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x044e A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0484 A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011b A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01cb A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0205 A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0228 A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x022e A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x023b A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x024a A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7543b(com.google.android.gms.measurement.internal.C2244aa r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r21.m9675y()
            r21.mo7557p()
            com.google.android.gms.common.internal.C2148s.m8834a(r22)
            java.lang.String r7 = r2.f6243f
            com.google.android.gms.common.internal.C2148s.m8844b(r7)
            boolean r7 = r21.m9670e(r22)
            if (r7 != 0) goto L_0x0023
            return
        L_0x0023:
            com.google.android.gms.measurement.internal.c r7 = r21.mo7551e()
            java.lang.String r8 = r2.f6243f
            com.google.android.gms.measurement.internal.f5 r7 = r7.mo7166b(r8)
            r8 = 0
            if (r7 == 0) goto L_0x0056
            java.lang.String r10 = r7.mo7332n()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0056
            java.lang.String r10 = r2.f6244g
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0056
            r7.mo7318h(r8)
            com.google.android.gms.measurement.internal.c r10 = r21.mo7551e()
            r10.mo7157a(r7)
            com.google.android.gms.measurement.internal.x4 r7 = r21.mo7548c()
            java.lang.String r10 = r2.f6243f
            r7.mo7737d(r10)
        L_0x0056:
            boolean r7 = r2.f6250m
            if (r7 != 0) goto L_0x005e
            r21.mo7547c(r22)
            return
        L_0x005e:
            long r10 = r2.f6255r
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x006e
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i
            com.google.android.gms.common.util.e r7 = r7.mo7095g()
            long r10 = r7.mo6988b()
        L_0x006e:
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i
            com.google.android.gms.measurement.internal.l r7 = r7.mo7195F()
            r7.mo7466w()
            int r7 = r2.f6256s
            r15 = 1
            if (r7 == 0) goto L_0x0098
            if (r7 == r15) goto L_0x0098
            com.google.android.gms.measurement.internal.c5 r12 = r1.f6735i
            com.google.android.gms.measurement.internal.y3 r12 = r12.mo7098j()
            com.google.android.gms.measurement.internal.a4 r12 = r12.mo7818w()
            java.lang.String r13 = r2.f6243f
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r13)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r14 = "Incorrect app type, assuming installed app. appId, appType"
            r12.mo7090a(r14, r13, r7)
            r7 = 0
        L_0x0098:
            com.google.android.gms.measurement.internal.c r12 = r21.mo7551e()
            r12.mo7186y()
            com.google.android.gms.measurement.internal.c r12 = r21.mo7551e()     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = r2.f6243f     // Catch:{ all -> 0x04ae }
            java.lang.String r14 = "_npa"
            com.google.android.gms.measurement.internal.w9 r14 = r12.mo7170c(r13, r14)     // Catch:{ all -> 0x04ae }
            if (r14 == 0) goto L_0x00bc
            java.lang.String r12 = "auto"
            java.lang.String r13 = r14.f7059b     // Catch:{ all -> 0x04ae }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x04ae }
            if (r12 == 0) goto L_0x00b8
            goto L_0x00bc
        L_0x00b8:
            r18 = r3
            r3 = 1
            goto L_0x010f
        L_0x00bc:
            java.lang.Boolean r12 = r2.f6261x     // Catch:{ all -> 0x04ae }
            if (r12 == 0) goto L_0x00f9
            com.google.android.gms.measurement.internal.u9 r13 = new com.google.android.gms.measurement.internal.u9     // Catch:{ all -> 0x04ae }
            java.lang.String r18 = "_npa"
            java.lang.Boolean r12 = r2.f6261x     // Catch:{ all -> 0x04ae }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x04ae }
            if (r12 == 0) goto L_0x00cf
            r19 = 1
            goto L_0x00d1
        L_0x00cf:
            r19 = r8
        L_0x00d1:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x04ae }
            java.lang.String r20 = "auto"
            r8 = 1
            r12 = r13
            r8 = r13
            r13 = r18
            r18 = r3
            r9 = r14
            r3 = 1
            r14 = r10
            r16 = r19
            r17 = r20
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04ae }
            if (r9 == 0) goto L_0x00f5
            java.lang.Object r9 = r9.f7062e     // Catch:{ all -> 0x04ae }
            java.lang.Long r12 = r8.f7000i     // Catch:{ all -> 0x04ae }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x04ae }
            if (r9 != 0) goto L_0x010f
        L_0x00f5:
            r1.mo7538a(r8, r2)     // Catch:{ all -> 0x04ae }
            goto L_0x010f
        L_0x00f9:
            r18 = r3
            r9 = r14
            r3 = 1
            if (r9 == 0) goto L_0x010f
            com.google.android.gms.measurement.internal.u9 r8 = new com.google.android.gms.measurement.internal.u9     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "_npa"
            r16 = 0
            java.lang.String r17 = "auto"
            r12 = r8
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04ae }
            r1.mo7546b(r8, r2)     // Catch:{ all -> 0x04ae }
        L_0x010f:
            com.google.android.gms.measurement.internal.c r8 = r21.mo7551e()     // Catch:{ all -> 0x04ae }
            java.lang.String r9 = r2.f6243f     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.f5 r8 = r8.mo7166b(r9)     // Catch:{ all -> 0x04ae }
            if (r8 == 0) goto L_0x01c9
            com.google.android.gms.measurement.internal.c5 r12 = r1.f6735i     // Catch:{ all -> 0x04ae }
            r12.mo7218v()     // Catch:{ all -> 0x04ae }
            java.lang.String r12 = r2.f6244g     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = r8.mo7332n()     // Catch:{ all -> 0x04ae }
            java.lang.String r14 = r2.f6260w     // Catch:{ all -> 0x04ae }
            java.lang.String r15 = r8.mo7334o()     // Catch:{ all -> 0x04ae }
            boolean r12 = com.google.android.gms.measurement.internal.C2489v9.m10016a(r12, r13, r14, r15)     // Catch:{ all -> 0x04ae }
            if (r12 == 0) goto L_0x01c9
            com.google.android.gms.measurement.internal.c5 r12 = r1.f6735i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.y3 r12 = r12.mo7098j()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.a4 r12 = r12.mo7818w()     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r14 = r8.mo7328l()     // Catch:{ all -> 0x04ae }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r14)     // Catch:{ all -> 0x04ae }
            r12.mo7089a(r13, r14)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.c r12 = r21.mo7551e()     // Catch:{ all -> 0x04ae }
            java.lang.String r8 = r8.mo7328l()     // Catch:{ all -> 0x04ae }
            r12.mo7459r()     // Catch:{ all -> 0x04ae }
            r12.mo7274c()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.common.internal.C2148s.m8844b(r8)     // Catch:{ all -> 0x04ae }
            android.database.sqlite.SQLiteDatabase r13 = r12.mo7183v()     // Catch:{ SQLiteException -> 0x01b6 }
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x01b6 }
            r15 = 0
            r14[r15] = r8     // Catch:{ SQLiteException -> 0x01b6 }
            java.lang.String r9 = "events"
            int r9 = r13.delete(r9, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "user_attributes"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "apps"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "audience_filter_values"
            int r0 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r0
            if (r9 <= 0) goto L_0x01c8
            com.google.android.gms.measurement.internal.y3 r0 = r12.mo7098j()     // Catch:{ SQLiteException -> 0x01b6 }
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7810B()     // Catch:{ SQLiteException -> 0x01b6 }
            java.lang.String r13 = "Deleted application data. app, records"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ SQLiteException -> 0x01b6 }
            r0.mo7090a(r13, r8, r9)     // Catch:{ SQLiteException -> 0x01b6 }
            goto L_0x01c8
        L_0x01b6:
            r0 = move-exception
            com.google.android.gms.measurement.internal.y3 r9 = r12.mo7098j()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.a4 r9 = r9.mo7815t()     // Catch:{ all -> 0x04ae }
            java.lang.String r12 = "Error deleting application data. appId, error"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r8)     // Catch:{ all -> 0x04ae }
            r9.mo7090a(r12, r8, r0)     // Catch:{ all -> 0x04ae }
        L_0x01c8:
            r8 = 0
        L_0x01c9:
            if (r8 == 0) goto L_0x0228
            long r12 = r8.mo7343v()     // Catch:{ all -> 0x04ae }
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x01e3
            long r12 = r8.mo7343v()     // Catch:{ all -> 0x04ae }
            r9 = r4
            long r3 = r2.f6252o     // Catch:{ all -> 0x04ae }
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x01e4
            r0 = 1
            goto L_0x01e5
        L_0x01e3:
            r9 = r4
        L_0x01e4:
            r0 = 0
        L_0x01e5:
            long r3 = r8.mo7343v()     // Catch:{ all -> 0x04ae }
            int r12 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x0201
            java.lang.String r3 = r8.mo7342u()     // Catch:{ all -> 0x04ae }
            if (r3 == 0) goto L_0x0201
            java.lang.String r3 = r8.mo7342u()     // Catch:{ all -> 0x04ae }
            java.lang.String r4 = r2.f6245h     // Catch:{ all -> 0x04ae }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x04ae }
            if (r3 != 0) goto L_0x0201
            r14 = 1
            goto L_0x0202
        L_0x0201:
            r14 = 0
        L_0x0202:
            r0 = r0 | r14
            if (r0 == 0) goto L_0x0229
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04ae }
            r0.<init>()     // Catch:{ all -> 0x04ae }
            java.lang.String r3 = "_pv"
            java.lang.String r4 = r8.mo7342u()     // Catch:{ all -> 0x04ae }
            r0.putString(r3, r4)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.r r3 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "_au"
            com.google.android.gms.measurement.internal.m r14 = new com.google.android.gms.measurement.internal.m     // Catch:{ all -> 0x04ae }
            r14.<init>(r0)     // Catch:{ all -> 0x04ae }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04ae }
            r1.mo7536a(r3, r2)     // Catch:{ all -> 0x04ae }
            goto L_0x0229
        L_0x0228:
            r9 = r4
        L_0x0229:
            r21.mo7547c(r22)     // Catch:{ all -> 0x04ae }
            if (r7 != 0) goto L_0x023b
            com.google.android.gms.measurement.internal.c r0 = r21.mo7551e()     // Catch:{ all -> 0x04ae }
            java.lang.String r3 = r2.f6243f     // Catch:{ all -> 0x04ae }
            java.lang.String r4 = "_f"
        L_0x0236:
            com.google.android.gms.measurement.internal.n r0 = r0.mo7151a(r3, r4)     // Catch:{ all -> 0x04ae }
            goto L_0x0248
        L_0x023b:
            r3 = 1
            if (r7 != r3) goto L_0x0247
            com.google.android.gms.measurement.internal.c r0 = r21.mo7551e()     // Catch:{ all -> 0x04ae }
            java.lang.String r3 = r2.f6243f     // Catch:{ all -> 0x04ae }
            java.lang.String r4 = "_v"
            goto L_0x0236
        L_0x0247:
            r0 = 0
        L_0x0248:
            if (r0 != 0) goto L_0x0484
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r12 = r10 / r3
            r14 = 1
            long r12 = r12 + r14
            long r12 = r12 * r3
            java.lang.String r0 = "_dac"
            java.lang.String r3 = "_r"
            java.lang.String r4 = "_c"
            java.lang.String r8 = "_et"
            if (r7 != 0) goto L_0x03e4
            com.google.android.gms.measurement.internal.u9 r7 = new com.google.android.gms.measurement.internal.u9     // Catch:{ all -> 0x04ae }
            java.lang.String r14 = "_fot"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04ae }
            java.lang.String r17 = "auto"
            r12 = r7
            r13 = r14
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04ae }
            r1.mo7538a(r7, r2)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.b r7 = r7.mo7211o()     // Catch:{ all -> 0x04ae }
            java.lang.String r12 = r2.f6244g     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C2457t.f6898S     // Catch:{ all -> 0x04ae }
            boolean r7 = r7.mo7116e(r12, r13)     // Catch:{ all -> 0x04ae }
            if (r7 == 0) goto L_0x028f
            r21.m9675y()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.u4 r7 = r7.mo7215s()     // Catch:{ all -> 0x04ae }
            java.lang.String r12 = r2.f6243f     // Catch:{ all -> 0x04ae }
            r7.mo7660a(r12)     // Catch:{ all -> 0x04ae }
        L_0x028f:
            r21.m9675y()     // Catch:{ all -> 0x04ae }
            r21.mo7557p()     // Catch:{ all -> 0x04ae }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x04ae }
            r7.<init>()     // Catch:{ all -> 0x04ae }
            r12 = 1
            r7.putLong(r4, r12)     // Catch:{ all -> 0x04ae }
            r7.putLong(r3, r12)     // Catch:{ all -> 0x04ae }
            r3 = 0
            r7.putLong(r6, r3)     // Catch:{ all -> 0x04ae }
            r7.putLong(r5, r3)     // Catch:{ all -> 0x04ae }
            r7.putLong(r9, r3)     // Catch:{ all -> 0x04ae }
            r14 = r18
            r7.putLong(r14, r3)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.c5 r3 = r1.f6735i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.b r3 = r3.mo7211o()     // Catch:{ all -> 0x04ae }
            java.lang.String r4 = r2.f6243f     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C2457t.f6900U     // Catch:{ all -> 0x04ae }
            boolean r3 = r3.mo7116e(r4, r12)     // Catch:{ all -> 0x04ae }
            if (r3 == 0) goto L_0x02c8
            r3 = 1
            r7.putLong(r8, r3)     // Catch:{ all -> 0x04ae }
            goto L_0x02ca
        L_0x02c8:
            r3 = 1
        L_0x02ca:
            boolean r12 = r2.f6259v     // Catch:{ all -> 0x04ae }
            if (r12 == 0) goto L_0x02d1
            r7.putLong(r0, r3)     // Catch:{ all -> 0x04ae }
        L_0x02d1:
            com.google.android.gms.measurement.internal.c r0 = r21.mo7551e()     // Catch:{ all -> 0x04ae }
            java.lang.String r3 = r2.f6243f     // Catch:{ all -> 0x04ae }
            com.google.android.gms.common.internal.C2148s.m8844b(r3)     // Catch:{ all -> 0x04ae }
            r0.mo7274c()     // Catch:{ all -> 0x04ae }
            r0.mo7459r()     // Catch:{ all -> 0x04ae }
            java.lang.String r4 = "first_open_count"
            long r3 = r0.mo7180h(r3, r4)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.c5 r0 = r1.f6735i     // Catch:{ all -> 0x04ae }
            android.content.Context r0 = r0.mo7096h()     // Catch:{ all -> 0x04ae }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x04ae }
            if (r0 != 0) goto L_0x030b
            com.google.android.gms.measurement.internal.c5 r0 = r1.f6735i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo7098j()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7815t()     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r9 = r2.f6243f     // Catch:{ all -> 0x04ae }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r9)     // Catch:{ all -> 0x04ae }
            r0.mo7089a(r6, r9)     // Catch:{ all -> 0x04ae }
        L_0x0307:
            r12 = 0
            goto L_0x03c8
        L_0x030b:
            com.google.android.gms.measurement.internal.c5 r0 = r1.f6735i     // Catch:{ NameNotFoundException -> 0x031d }
            android.content.Context r0 = r0.mo7096h()     // Catch:{ NameNotFoundException -> 0x031d }
            com.google.android.gms.common.p.b r0 = com.google.android.gms.common.p051p.C2175c.m8939a(r0)     // Catch:{ NameNotFoundException -> 0x031d }
            java.lang.String r12 = r2.f6243f     // Catch:{ NameNotFoundException -> 0x031d }
            r13 = 0
            android.content.pm.PackageInfo r0 = r0.mo6964b(r12, r13)     // Catch:{ NameNotFoundException -> 0x031d }
            goto L_0x0334
        L_0x031d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c5 r12 = r1.f6735i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.y3 r12 = r12.mo7098j()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.a4 r12 = r12.mo7815t()     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r15 = r2.f6243f     // Catch:{ all -> 0x04ae }
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r15)     // Catch:{ all -> 0x04ae }
            r12.mo7090a(r13, r15, r0)     // Catch:{ all -> 0x04ae }
            r0 = 0
        L_0x0334:
            if (r0 == 0) goto L_0x0384
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04ae }
            r15 = 0
            int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x0384
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04ae }
            r18 = r14
            long r14 = r0.lastUpdateTime     // Catch:{ all -> 0x04ae }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0367
            com.google.android.gms.measurement.internal.c5 r0 = r1.f6735i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.b r0 = r0.mo7211o()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C2457t.f6947u0     // Catch:{ all -> 0x04ae }
            boolean r0 = r0.mo7108a(r12)     // Catch:{ all -> 0x04ae }
            if (r0 == 0) goto L_0x0362
            r12 = 0
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0365
            r12 = 1
        L_0x035e:
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04ae }
            goto L_0x0365
        L_0x0362:
            r12 = 1
            goto L_0x035e
        L_0x0365:
            r14 = 0
            goto L_0x0368
        L_0x0367:
            r14 = 1
        L_0x0368:
            com.google.android.gms.measurement.internal.u9 r0 = new com.google.android.gms.measurement.internal.u9     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "_fi"
            if (r14 == 0) goto L_0x0371
            r14 = 1
            goto L_0x0373
        L_0x0371:
            r14 = 0
        L_0x0373:
            java.lang.Long r16 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x04ae }
            java.lang.String r17 = "auto"
            r12 = r0
            r6 = r18
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04ae }
            r1.mo7538a(r0, r2)     // Catch:{ all -> 0x04ae }
            goto L_0x0385
        L_0x0384:
            r6 = r14
        L_0x0385:
            com.google.android.gms.measurement.internal.c5 r0 = r1.f6735i     // Catch:{ NameNotFoundException -> 0x0397 }
            android.content.Context r0 = r0.mo7096h()     // Catch:{ NameNotFoundException -> 0x0397 }
            com.google.android.gms.common.p.b r0 = com.google.android.gms.common.p051p.C2175c.m8939a(r0)     // Catch:{ NameNotFoundException -> 0x0397 }
            java.lang.String r12 = r2.f6243f     // Catch:{ NameNotFoundException -> 0x0397 }
            r13 = 0
            android.content.pm.ApplicationInfo r0 = r0.mo6959a(r12, r13)     // Catch:{ NameNotFoundException -> 0x0397 }
            goto L_0x03ae
        L_0x0397:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c5 r12 = r1.f6735i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.y3 r12 = r12.mo7098j()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.a4 r12 = r12.mo7815t()     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r14 = r2.f6243f     // Catch:{ all -> 0x04ae }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r14)     // Catch:{ all -> 0x04ae }
            r12.mo7090a(r13, r14, r0)     // Catch:{ all -> 0x04ae }
            r0 = 0
        L_0x03ae:
            if (r0 == 0) goto L_0x0307
            int r12 = r0.flags     // Catch:{ all -> 0x04ae }
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L_0x03bb
            r12 = 1
            r7.putLong(r9, r12)     // Catch:{ all -> 0x04ae }
        L_0x03bb:
            int r0 = r0.flags     // Catch:{ all -> 0x04ae }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0307
            r12 = 1
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04ae }
            goto L_0x0307
        L_0x03c8:
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x03cf
            r7.putLong(r5, r3)     // Catch:{ all -> 0x04ae }
        L_0x03cf:
            com.google.android.gms.measurement.internal.r r0 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "_f"
            com.google.android.gms.measurement.internal.m r14 = new com.google.android.gms.measurement.internal.m     // Catch:{ all -> 0x04ae }
            r14.<init>(r7)     // Catch:{ all -> 0x04ae }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04ae }
        L_0x03e0:
            r1.mo7536a(r0, r2)     // Catch:{ all -> 0x04ae }
            goto L_0x043e
        L_0x03e4:
            r5 = 1
            if (r7 != r5) goto L_0x043e
            com.google.android.gms.measurement.internal.u9 r5 = new com.google.android.gms.measurement.internal.u9     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = "_fvt"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04ae }
            java.lang.String r17 = "auto"
            r12 = r5
            r13 = r6
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04ae }
            r1.mo7538a(r5, r2)     // Catch:{ all -> 0x04ae }
            r21.m9675y()     // Catch:{ all -> 0x04ae }
            r21.mo7557p()     // Catch:{ all -> 0x04ae }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x04ae }
            r5.<init>()     // Catch:{ all -> 0x04ae }
            r6 = 1
            r5.putLong(r4, r6)     // Catch:{ all -> 0x04ae }
            r5.putLong(r3, r6)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.c5 r3 = r1.f6735i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.b r3 = r3.mo7211o()     // Catch:{ all -> 0x04ae }
            java.lang.String r4 = r2.f6243f     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C2457t.f6900U     // Catch:{ all -> 0x04ae }
            boolean r3 = r3.mo7116e(r4, r6)     // Catch:{ all -> 0x04ae }
            if (r3 == 0) goto L_0x0423
            r3 = 1
            r5.putLong(r8, r3)     // Catch:{ all -> 0x04ae }
            goto L_0x0425
        L_0x0423:
            r3 = 1
        L_0x0425:
            boolean r6 = r2.f6259v     // Catch:{ all -> 0x04ae }
            if (r6 == 0) goto L_0x042c
            r5.putLong(r0, r3)     // Catch:{ all -> 0x04ae }
        L_0x042c:
            com.google.android.gms.measurement.internal.r r0 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "_v"
            com.google.android.gms.measurement.internal.m r14 = new com.google.android.gms.measurement.internal.m     // Catch:{ all -> 0x04ae }
            r14.<init>(r5)     // Catch:{ all -> 0x04ae }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04ae }
            goto L_0x03e0
        L_0x043e:
            com.google.android.gms.measurement.internal.c5 r0 = r1.f6735i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.b r0 = r0.mo7211o()     // Catch:{ all -> 0x04ae }
            java.lang.String r3 = r2.f6243f     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C2457t.f6901V     // Catch:{ all -> 0x04ae }
            boolean r0 = r0.mo7116e(r3, r4)     // Catch:{ all -> 0x04ae }
            if (r0 != 0) goto L_0x049f
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04ae }
            r0.<init>()     // Catch:{ all -> 0x04ae }
            r3 = 1
            r0.putLong(r8, r3)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.c5 r3 = r1.f6735i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.b r3 = r3.mo7211o()     // Catch:{ all -> 0x04ae }
            java.lang.String r4 = r2.f6243f     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C2457t.f6900U     // Catch:{ all -> 0x04ae }
            boolean r3 = r3.mo7116e(r4, r5)     // Catch:{ all -> 0x04ae }
            if (r3 == 0) goto L_0x046f
            java.lang.String r3 = "_fr"
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x04ae }
        L_0x046f:
            com.google.android.gms.measurement.internal.r r3 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "_e"
            com.google.android.gms.measurement.internal.m r14 = new com.google.android.gms.measurement.internal.m     // Catch:{ all -> 0x04ae }
            r14.<init>(r0)     // Catch:{ all -> 0x04ae }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04ae }
        L_0x0480:
            r1.mo7536a(r3, r2)     // Catch:{ all -> 0x04ae }
            goto L_0x049f
        L_0x0484:
            boolean r0 = r2.f6251n     // Catch:{ all -> 0x04ae }
            if (r0 == 0) goto L_0x049f
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04ae }
            r0.<init>()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.r r3 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "_cd"
            com.google.android.gms.measurement.internal.m r14 = new com.google.android.gms.measurement.internal.m     // Catch:{ all -> 0x04ae }
            r14.<init>(r0)     // Catch:{ all -> 0x04ae }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04ae }
            goto L_0x0480
        L_0x049f:
            com.google.android.gms.measurement.internal.c r0 = r21.mo7551e()     // Catch:{ all -> 0x04ae }
            r0.mo7182u()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.c r0 = r21.mo7551e()
            r0.mo7187z()
            return
        L_0x04ae:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c r2 = r21.mo7551e()
            r2.mo7187z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2399n9.mo7543b(com.google.android.gms.measurement.internal.aa):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo7544b(C2388ma maVar) {
        C2244aa a = m9653a(maVar.f6680f);
        if (a != null) {
            mo7545b(maVar, a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo7545b(C2388ma maVar, C2244aa aaVar) {
        C2148s.m8834a(maVar);
        C2148s.m8844b(maVar.f6680f);
        C2148s.m8834a(maVar.f6682h);
        C2148s.m8844b(maVar.f6682h.f6998g);
        m9675y();
        mo7557p();
        if (m9670e(aaVar)) {
            if (!aaVar.f6250m) {
                mo7547c(aaVar);
                return;
            }
            mo7551e().mo7186y();
            try {
                mo7547c(aaVar);
                C2388ma d = mo7551e().mo7171d(maVar.f6680f, maVar.f6682h.f6998g);
                if (d != null) {
                    this.f6735i.mo7098j().mo7809A().mo7090a("Removing conditional user property", maVar.f6680f, this.f6735i.mo7219w().mo7720c(maVar.f6682h.f6998g));
                    mo7551e().mo7173e(maVar.f6680f, maVar.f6682h.f6998g);
                    if (d.f6684j) {
                        mo7551e().mo7168b(maVar.f6680f, maVar.f6682h.f6998g);
                    }
                    if (maVar.f6690p != null) {
                        Bundle bundle = null;
                        if (maVar.f6690p.f6818g != null) {
                            bundle = maVar.f6690p.f6818g.mo7499b();
                        }
                        Bundle bundle2 = bundle;
                        m9668b(this.f6735i.mo7218v().mo7685a(maVar.f6680f, maVar.f6690p.f6817f, bundle2, d.f6681g, maVar.f6690p.f6820i, true, false), aaVar);
                    }
                } else {
                    this.f6735i.mo7098j().mo7818w().mo7090a("Conditional user property doesn't exist", C2516y3.m10125a(maVar.f6680f), this.f6735i.mo7219w().mo7720c(maVar.f6682h.f6998g));
                }
                mo7551e().mo7182u();
            } finally {
                mo7551e().mo7187z();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo7546b(C2478u9 u9Var, C2244aa aaVar) {
        m9675y();
        mo7557p();
        if (m9670e(aaVar)) {
            if (!aaVar.f6250m) {
                mo7547c(aaVar);
                return;
            }
            if (!"_npa".equals(u9Var.f6998g) || aaVar.f6261x == null) {
                this.f6735i.mo7098j().mo7809A().mo7089a("Removing user property", this.f6735i.mo7219w().mo7720c(u9Var.f6998g));
                mo7551e().mo7186y();
                try {
                    mo7547c(aaVar);
                    mo7551e().mo7168b(aaVar.f6243f, u9Var.f6998g);
                    mo7551e().mo7182u();
                    this.f6735i.mo7098j().mo7809A().mo7089a("User property removed", this.f6735i.mo7219w().mo7720c(u9Var.f6998g));
                } finally {
                    mo7551e().mo7187z();
                }
            } else {
                this.f6735i.mo7098j().mo7809A().mo7088a("Falling back to manifest metadata value for ad personalization");
                C2478u9 u9Var2 = new C2478u9("_npa", this.f6735i.mo7095g().mo6988b(), Long.valueOf(aaVar.f6261x.booleanValue() ? 1 : 0), "auto");
                mo7538a(u9Var2, aaVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C2299f5 mo7547c(C2244aa aaVar) {
        m9675y();
        mo7557p();
        C2148s.m8834a(aaVar);
        C2148s.m8844b(aaVar.f6243f);
        C2299f5 b = mo7551e().mo7166b(aaVar.f6243f);
        String b2 = this.f6735i.mo7212p().mo7472b(aaVar.f6243f);
        if (!C3953ca.m16130b() || !this.f6735i.mo7211o().mo7108a(C2457t.f6949v0)) {
            return m9654a(aaVar, b, b2);
        }
        if (b == null) {
            b = new C2299f5(this.f6735i, aaVar.f6243f);
            b.mo7294a(this.f6735i.mo7218v().mo7714w());
            b.mo7311e(b2);
        } else if (!b2.equals(b.mo7338q())) {
            b.mo7311e(b2);
            b.mo7294a(this.f6735i.mo7218v().mo7714w());
        }
        b.mo7300b(aaVar.f6244g);
        b.mo7304c(aaVar.f6260w);
        if (C4157pa.m16931b() && this.f6735i.mo7211o().mo7116e(b.mo7328l(), C2457t.f6937p0)) {
            b.mo7308d(aaVar.f6242A);
        }
        if (!TextUtils.isEmpty(aaVar.f6253p)) {
            b.mo7314f(aaVar.f6253p);
        }
        long j = aaVar.f6247j;
        if (j != 0) {
            b.mo7307d(j);
        }
        if (!TextUtils.isEmpty(aaVar.f6245h)) {
            b.mo7316g(aaVar.f6245h);
        }
        b.mo7303c(aaVar.f6252o);
        String str = aaVar.f6246i;
        if (str != null) {
            b.mo7319h(str);
        }
        b.mo7310e(aaVar.f6248k);
        b.mo7296a(aaVar.f6250m);
        if (!TextUtils.isEmpty(aaVar.f6249l)) {
            b.mo7323i(aaVar.f6249l);
        }
        if (!this.f6735i.mo7211o().mo7108a(C2457t.f6889N0)) {
            b.mo7337p(aaVar.f6254q);
        }
        b.mo7301b(aaVar.f6257t);
        b.mo7305c(aaVar.f6258u);
        b.mo7293a(aaVar.f6261x);
        b.mo7313f(aaVar.f6262y);
        if (b.mo7297a()) {
            mo7551e().mo7157a(b);
        }
        return b;
    }

    /* renamed from: c */
    public final C2506x4 mo7548c() {
        m9667b((C2363k9) this.f6727a);
        return this.f6727a;
    }

    /* renamed from: d */
    public final C2310g4 mo7549d() {
        m9667b((C2363k9) this.f6728b);
        return this.f6728b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo7550d(C2244aa aaVar) {
        try {
            return (String) this.f6735i.mo7097i().mo7840a((Callable<V>) new C2434q9<V>(this, aaVar)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f6735i.mo7098j().mo7815t().mo7090a("Failed to get app instance id. appId", C2516y3.m10125a(aaVar.f6243f), e);
            return null;
        }
    }

    /* renamed from: e */
    public final C2257c mo7551e() {
        m9667b((C2363k9) this.f6729c);
        return this.f6729c;
    }

    /* renamed from: f */
    public final C2352ja mo7094f() {
        return this.f6735i.mo7094f();
    }

    /* renamed from: g */
    public final C2190e mo7095g() {
        return this.f6735i.mo7095g();
    }

    /* renamed from: h */
    public final Context mo7096h() {
        return this.f6735i.mo7096h();
    }

    /* renamed from: i */
    public final C2528z4 mo7097i() {
        return this.f6735i.mo7097i();
    }

    /* renamed from: j */
    public final C2516y3 mo7098j() {
        return this.f6735i.mo7098j();
    }

    /* renamed from: k */
    public final C2292ea mo7552k() {
        m9667b((C2363k9) this.f6732f);
        return this.f6732f;
    }

    /* renamed from: l */
    public final C2385m7 mo7553l() {
        m9667b((C2363k9) this.f6734h);
        return this.f6734h;
    }

    /* renamed from: m */
    public final C2445r9 mo7554m() {
        m9667b((C2363k9) this.f6733g);
        return this.f6733g;
    }

    /* renamed from: n */
    public final C2494w3 mo7555n() {
        return this.f6735i.mo7219w();
    }

    /* renamed from: o */
    public final C2489v9 mo7556o() {
        return this.f6735i.mo7218v();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final void mo7557p() {
        if (!this.f6736j) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:83|84) */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r1.f6735i.mo7098j().mo7815t().mo7090a("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C2516y3.m10125a(r5), r9);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x02b0 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7558q() {
        /*
            r17 = this;
            r1 = r17
            r17.m9675y()
            r17.mo7557p()
            r0 = 1
            r1.f6744r = r0
            r2 = 0
            com.google.android.gms.measurement.internal.c5 r3 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            r3.mo7094f()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.c5 r3 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.t7 r3 = r3.mo7194E()     // Catch:{ all -> 0x02e9 }
            java.lang.Boolean r3 = r3.mo7633G()     // Catch:{ all -> 0x02e9 }
            if (r3 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.c5 r0 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo7098j()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7818w()     // Catch:{ all -> 0x02e9 }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
        L_0x0029:
            r0.mo7088a(r3)     // Catch:{ all -> 0x02e9 }
        L_0x002c:
            r1.f6744r = r2
            r17.m9671u()
            return
        L_0x0032:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x02e9 }
            if (r3 == 0) goto L_0x0045
            com.google.android.gms.measurement.internal.c5 r0 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo7098j()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7815t()     // Catch:{ all -> 0x02e9 }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            goto L_0x0029
        L_0x0045:
            long r3 = r1.f6738l     // Catch:{ all -> 0x02e9 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0051
        L_0x004d:
            r17.m9651B()     // Catch:{ all -> 0x02e9 }
            goto L_0x002c
        L_0x0051:
            r17.m9675y()     // Catch:{ all -> 0x02e9 }
            java.util.List<java.lang.Long> r3 = r1.f6747u     // Catch:{ all -> 0x02e9 }
            if (r3 == 0) goto L_0x005a
            r3 = 1
            goto L_0x005b
        L_0x005a:
            r3 = 0
        L_0x005b:
            if (r3 == 0) goto L_0x006a
            com.google.android.gms.measurement.internal.c5 r0 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo7098j()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7810B()     // Catch:{ all -> 0x02e9 }
            java.lang.String r3 = "Uploading requested multiple times"
            goto L_0x0029
        L_0x006a:
            com.google.android.gms.measurement.internal.g4 r3 = r17.mo7549d()     // Catch:{ all -> 0x02e9 }
            boolean r3 = r3.mo7355u()     // Catch:{ all -> 0x02e9 }
            if (r3 != 0) goto L_0x0084
            com.google.android.gms.measurement.internal.c5 r0 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo7098j()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7810B()     // Catch:{ all -> 0x02e9 }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.mo7088a(r3)     // Catch:{ all -> 0x02e9 }
            goto L_0x004d
        L_0x0084:
            com.google.android.gms.measurement.internal.c5 r3 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.common.util.e r3 = r3.mo7095g()     // Catch:{ all -> 0x02e9 }
            long r3 = r3.mo6988b()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.b r7 = r7.mo7211o()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C2457t.f6894Q     // Catch:{ all -> 0x02e9 }
            r9 = 0
            int r7 = r7.mo7110b(r9, r8)     // Catch:{ all -> 0x02e9 }
            long r10 = com.google.android.gms.measurement.internal.C2245b.m9111x()     // Catch:{ all -> 0x02e9 }
            long r10 = r3 - r10
            r8 = 0
        L_0x00a2:
            if (r8 >= r7) goto L_0x00ad
            boolean r12 = r1.m9665a(r9, r10)     // Catch:{ all -> 0x02e9 }
            if (r12 == 0) goto L_0x00ad
            int r8 = r8 + 1
            goto L_0x00a2
        L_0x00ad:
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.l4 r7 = r7.mo7212p()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.p4 r7 = r7.f6622e     // Catch:{ all -> 0x02e9 }
            long r7 = r7.mo7570a()     // Catch:{ all -> 0x02e9 }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.c5 r5 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo7098j()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7809A()     // Catch:{ all -> 0x02e9 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r3 - r7
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x02e9 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x02e9 }
            r5.mo7089a(r6, r7)     // Catch:{ all -> 0x02e9 }
        L_0x00d6:
            com.google.android.gms.measurement.internal.c r5 = r17.mo7551e()     // Catch:{ all -> 0x02e9 }
            java.lang.String r5 = r5.mo7184w()     // Catch:{ all -> 0x02e9 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x02e9 }
            r7 = -1
            if (r6 != 0) goto L_0x02c5
            long r10 = r1.f6749w     // Catch:{ all -> 0x02e9 }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00f6
            com.google.android.gms.measurement.internal.c r6 = r17.mo7551e()     // Catch:{ all -> 0x02e9 }
            long r6 = r6.mo7185x()     // Catch:{ all -> 0x02e9 }
            r1.f6749w = r6     // Catch:{ all -> 0x02e9 }
        L_0x00f6:
            com.google.android.gms.measurement.internal.c5 r6 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.b r6 = r6.mo7211o()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C2457t.f6918g     // Catch:{ all -> 0x02e9 }
            int r6 = r6.mo7110b(r5, r7)     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.c5 r7 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.b r7 = r7.mo7211o()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C2457t.f6920h     // Catch:{ all -> 0x02e9 }
            int r7 = r7.mo7110b(r5, r8)     // Catch:{ all -> 0x02e9 }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.c r8 = r17.mo7551e()     // Catch:{ all -> 0x02e9 }
            java.util.List r6 = r8.mo7154a(r5, r6, r7)     // Catch:{ all -> 0x02e9 }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x02e9 }
            if (r7 != 0) goto L_0x002c
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x02e9 }
        L_0x0124:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x02e9 }
            if (r8 == 0) goto L_0x0143
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x02e9 }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x02e9 }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x02e9 }
            g.d.a.b.d.g.c1 r8 = (p147g.p156d.p157a.p167b.p173d.p180g.C3941c1) r8     // Catch:{ all -> 0x02e9 }
            java.lang.String r10 = r8.mo12174t()     // Catch:{ all -> 0x02e9 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x02e9 }
            if (r10 != 0) goto L_0x0124
            java.lang.String r7 = r8.mo12174t()     // Catch:{ all -> 0x02e9 }
            goto L_0x0144
        L_0x0143:
            r7 = r9
        L_0x0144:
            if (r7 == 0) goto L_0x0173
            r8 = 0
        L_0x0147:
            int r10 = r6.size()     // Catch:{ all -> 0x02e9 }
            if (r8 >= r10) goto L_0x0173
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x02e9 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x02e9 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x02e9 }
            g.d.a.b.d.g.c1 r10 = (p147g.p156d.p157a.p167b.p173d.p180g.C3941c1) r10     // Catch:{ all -> 0x02e9 }
            java.lang.String r11 = r10.mo12174t()     // Catch:{ all -> 0x02e9 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x02e9 }
            if (r11 != 0) goto L_0x0170
            java.lang.String r10 = r10.mo12174t()     // Catch:{ all -> 0x02e9 }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x02e9 }
            if (r10 != 0) goto L_0x0170
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x02e9 }
            goto L_0x0173
        L_0x0170:
            int r8 = r8 + 1
            goto L_0x0147
        L_0x0173:
            g.d.a.b.d.g.b1$a r7 = p147g.p156d.p157a.p167b.p173d.p180g.C3925b1.m15743q()     // Catch:{ all -> 0x02e9 }
            int r8 = r6.size()     // Catch:{ all -> 0x02e9 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x02e9 }
            int r11 = r6.size()     // Catch:{ all -> 0x02e9 }
            r10.<init>(r11)     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.c5 r11 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.b r11 = r11.mo7211o()     // Catch:{ all -> 0x02e9 }
            boolean r11 = r11.mo7117f(r5)     // Catch:{ all -> 0x02e9 }
            r12 = 0
        L_0x018f:
            if (r12 >= r8) goto L_0x01f6
            java.lang.Object r13 = r6.get(r12)     // Catch:{ all -> 0x02e9 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x02e9 }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x02e9 }
            g.d.a.b.d.g.c1 r13 = (p147g.p156d.p157a.p167b.p173d.p180g.C3941c1) r13     // Catch:{ all -> 0x02e9 }
            g.d.a.b.d.g.t4$b r13 = r13.mo12813l()     // Catch:{ all -> 0x02e9 }
            g.d.a.b.d.g.c1$a r13 = (p147g.p156d.p157a.p167b.p173d.p180g.C3941c1.C3942a) r13     // Catch:{ all -> 0x02e9 }
            java.lang.Object r14 = r6.get(r12)     // Catch:{ all -> 0x02e9 }
            android.util.Pair r14 = (android.util.Pair) r14     // Catch:{ all -> 0x02e9 }
            java.lang.Object r14 = r14.second     // Catch:{ all -> 0x02e9 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x02e9 }
            r10.add(r14)     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.c5 r14 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.b r14 = r14.mo7211o()     // Catch:{ all -> 0x02e9 }
            long r14 = r14.mo7122o()     // Catch:{ all -> 0x02e9 }
            r13.mo12214g(r14)     // Catch:{ all -> 0x02e9 }
            r13.mo12187a(r3)     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.c5 r14 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            r14.mo7094f()     // Catch:{ all -> 0x02e9 }
            r13.mo12198b(r2)     // Catch:{ all -> 0x02e9 }
            if (r11 != 0) goto L_0x01cb
            r13.mo12182B()     // Catch:{ all -> 0x02e9 }
        L_0x01cb:
            com.google.android.gms.measurement.internal.c5 r14 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.b r14 = r14.mo7211o()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C2457t.f6905Z     // Catch:{ all -> 0x02e9 }
            boolean r14 = r14.mo7116e(r5, r15)     // Catch:{ all -> 0x02e9 }
            if (r14 == 0) goto L_0x01f0
            g.d.a.b.d.g.e6 r14 = r13.mo12346f()     // Catch:{ all -> 0x02e9 }
            g.d.a.b.d.g.t4 r14 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r14     // Catch:{ all -> 0x02e9 }
            g.d.a.b.d.g.c1 r14 = (p147g.p156d.p157a.p167b.p173d.p180g.C3941c1) r14     // Catch:{ all -> 0x02e9 }
            byte[] r14 = r14.mo12245g()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.r9 r15 = r17.mo7554m()     // Catch:{ all -> 0x02e9 }
            long r14 = r15.mo7603a(r14)     // Catch:{ all -> 0x02e9 }
            r13.mo12226l(r14)     // Catch:{ all -> 0x02e9 }
        L_0x01f0:
            r7.mo12104a(r13)     // Catch:{ all -> 0x02e9 }
            int r12 = r12 + 1
            goto L_0x018f
        L_0x01f6:
            com.google.android.gms.measurement.internal.c5 r6 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo7098j()     // Catch:{ all -> 0x02e9 }
            r11 = 2
            boolean r6 = r6.mo7814a(r11)     // Catch:{ all -> 0x02e9 }
            if (r6 == 0) goto L_0x0214
            com.google.android.gms.measurement.internal.r9 r6 = r17.mo7554m()     // Catch:{ all -> 0x02e9 }
            g.d.a.b.d.g.e6 r11 = r7.mo12346f()     // Catch:{ all -> 0x02e9 }
            g.d.a.b.d.g.t4 r11 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r11     // Catch:{ all -> 0x02e9 }
            g.d.a.b.d.g.b1 r11 = (p147g.p156d.p157a.p167b.p173d.p180g.C3925b1) r11     // Catch:{ all -> 0x02e9 }
            java.lang.String r6 = r6.mo7606a(r11)     // Catch:{ all -> 0x02e9 }
            goto L_0x0215
        L_0x0214:
            r6 = r9
        L_0x0215:
            r17.mo7554m()     // Catch:{ all -> 0x02e9 }
            g.d.a.b.d.g.e6 r11 = r7.mo12346f()     // Catch:{ all -> 0x02e9 }
            g.d.a.b.d.g.t4 r11 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r11     // Catch:{ all -> 0x02e9 }
            g.d.a.b.d.g.b1 r11 = (p147g.p156d.p157a.p167b.p173d.p180g.C3925b1) r11     // Catch:{ all -> 0x02e9 }
            byte[] r14 = r11.mo12245g()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.r3<java.lang.String> r11 = com.google.android.gms.measurement.internal.C2457t.f6938q     // Catch:{ all -> 0x02e9 }
            java.lang.Object r9 = r11.mo7587a(r9)     // Catch:{ all -> 0x02e9 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x02e9 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x02b0 }
            r13.<init>(r9)     // Catch:{ MalformedURLException -> 0x02b0 }
            boolean r11 = r10.isEmpty()     // Catch:{ MalformedURLException -> 0x02b0 }
            if (r11 != 0) goto L_0x0239
            r11 = 1
            goto L_0x023a
        L_0x0239:
            r11 = 0
        L_0x023a:
            com.google.android.gms.common.internal.C2148s.m8841a(r11)     // Catch:{ MalformedURLException -> 0x02b0 }
            java.util.List<java.lang.Long> r11 = r1.f6747u     // Catch:{ MalformedURLException -> 0x02b0 }
            if (r11 == 0) goto L_0x0251
            com.google.android.gms.measurement.internal.c5 r10 = r1.f6735i     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.y3 r10 = r10.mo7098j()     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.a4 r10 = r10.mo7815t()     // Catch:{ MalformedURLException -> 0x02b0 }
            java.lang.String r11 = "Set uploading progress before finishing the previous upload"
            r10.mo7088a(r11)     // Catch:{ MalformedURLException -> 0x02b0 }
            goto L_0x0258
        L_0x0251:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x02b0 }
            r11.<init>(r10)     // Catch:{ MalformedURLException -> 0x02b0 }
            r1.f6747u = r11     // Catch:{ MalformedURLException -> 0x02b0 }
        L_0x0258:
            com.google.android.gms.measurement.internal.c5 r10 = r1.f6735i     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.l4 r10 = r10.mo7212p()     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.p4 r10 = r10.f6623f     // Catch:{ MalformedURLException -> 0x02b0 }
            r10.mo7571a(r3)     // Catch:{ MalformedURLException -> 0x02b0 }
            java.lang.String r3 = "?"
            if (r8 <= 0) goto L_0x026f
            g.d.a.b.d.g.c1 r3 = r7.mo12105a(r2)     // Catch:{ MalformedURLException -> 0x02b0 }
            java.lang.String r3 = r3.mo12168p0()     // Catch:{ MalformedURLException -> 0x02b0 }
        L_0x026f:
            com.google.android.gms.measurement.internal.c5 r4 = r1.f6735i     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo7098j()     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.a4 r4 = r4.mo7810B()     // Catch:{ MalformedURLException -> 0x02b0 }
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch:{ MalformedURLException -> 0x02b0 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x02b0 }
            r4.mo7091a(r7, r3, r8, r6)     // Catch:{ MalformedURLException -> 0x02b0 }
            r1.f6743q = r0     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.g4 r11 = r17.mo7549d()     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.p9 r0 = new com.google.android.gms.measurement.internal.p9     // Catch:{ MalformedURLException -> 0x02b0 }
            r0.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x02b0 }
            r11.mo7274c()     // Catch:{ MalformedURLException -> 0x02b0 }
            r11.mo7459r()     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.common.internal.C2148s.m8834a(r13)     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.common.internal.C2148s.m8834a(r14)     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.common.internal.C2148s.m8834a(r0)     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.z4 r3 = r11.mo7097i()     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.k4 r4 = new com.google.android.gms.measurement.internal.k4     // Catch:{ MalformedURLException -> 0x02b0 }
            r15 = 0
            r10 = r4
            r12 = r5
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x02b0 }
            r3.mo7843b(r4)     // Catch:{ MalformedURLException -> 0x02b0 }
            goto L_0x002c
        L_0x02b0:
            com.google.android.gms.measurement.internal.c5 r0 = r1.f6735i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo7098j()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7815t()     // Catch:{ all -> 0x02e9 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r5)     // Catch:{ all -> 0x02e9 }
            r0.mo7090a(r3, r4, r9)     // Catch:{ all -> 0x02e9 }
            goto L_0x002c
        L_0x02c5:
            r1.f6749w = r7     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.c r0 = r17.mo7551e()     // Catch:{ all -> 0x02e9 }
            long r5 = com.google.android.gms.measurement.internal.C2245b.m9111x()     // Catch:{ all -> 0x02e9 }
            long r3 = r3 - r5
            java.lang.String r0 = r0.mo7152a(r3)     // Catch:{ all -> 0x02e9 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02e9 }
            if (r3 != 0) goto L_0x002c
            com.google.android.gms.measurement.internal.c r3 = r17.mo7551e()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.f5 r0 = r3.mo7166b(r0)     // Catch:{ all -> 0x02e9 }
            if (r0 == 0) goto L_0x002c
            r1.m9656a(r0)     // Catch:{ all -> 0x02e9 }
            goto L_0x002c
        L_0x02e9:
            r0 = move-exception
            r1.f6744r = r2
            r17.m9671u()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2399n9.mo7558q():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final void mo7559r() {
        String str;
        C2238a4 a4Var;
        Integer num;
        Integer num2;
        m9675y();
        mo7557p();
        if (!this.f6737k) {
            this.f6737k = true;
            if (m9672v()) {
                int a = m9652a(this.f6746t);
                int F = this.f6735i.mo7196G().mo7671F();
                m9675y();
                if (a > F) {
                    a4Var = this.f6735i.mo7098j().mo7815t();
                    num2 = Integer.valueOf(a);
                    num = Integer.valueOf(F);
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (a >= F) {
                    return;
                } else {
                    if (m9663a(F, this.f6746t)) {
                        a4Var = this.f6735i.mo7098j().mo7810B();
                        num2 = Integer.valueOf(a);
                        num = Integer.valueOf(F);
                        str = "Storage version upgraded. Previous, current version";
                    } else {
                        a4Var = this.f6735i.mo7098j().mo7815t();
                        num2 = Integer.valueOf(a);
                        num = Integer.valueOf(F);
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                a4Var.mo7090a(str, num2, num);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final void mo7560s() {
        this.f6741o++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final C2263c5 mo7561t() {
        return this.f6735i;
    }
}
