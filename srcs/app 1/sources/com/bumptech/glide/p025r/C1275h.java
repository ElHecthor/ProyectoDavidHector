package com.bumptech.glide.p025r;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C0836e;
import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.p007o.C0995k;
import com.bumptech.glide.load.p007o.C0995k.C1001d;
import com.bumptech.glide.load.p007o.C1013q;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p013q.p016f.C1185a;
import com.bumptech.glide.p025r.p026j.C1284g;
import com.bumptech.glide.p025r.p026j.C1285h;
import com.bumptech.glide.p025r.p027k.C1293c;
import com.bumptech.glide.p029t.C1305f;
import com.bumptech.glide.p029t.C1310k;
import com.bumptech.glide.p029t.p030l.C1321c;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.r.h */
public final class C1275h<R> implements C1269c, C1284g, C1274g {

    /* renamed from: D */
    private static final boolean f4223D = Log.isLoggable("Request", 2);

    /* renamed from: A */
    private int f4224A;

    /* renamed from: B */
    private boolean f4225B;

    /* renamed from: C */
    private RuntimeException f4226C;

    /* renamed from: a */
    private final String f4227a;

    /* renamed from: b */
    private final C1321c f4228b;

    /* renamed from: c */
    private final Object f4229c;

    /* renamed from: d */
    private final C1272e<R> f4230d;

    /* renamed from: e */
    private final C1270d f4231e;

    /* renamed from: f */
    private final Context f4232f;

    /* renamed from: g */
    private final C0836e f4233g;

    /* renamed from: h */
    private final Object f4234h;

    /* renamed from: i */
    private final Class<R> f4235i;

    /* renamed from: j */
    private final C1267a<?> f4236j;

    /* renamed from: k */
    private final int f4237k;

    /* renamed from: l */
    private final int f4238l;

    /* renamed from: m */
    private final C0838g f4239m;

    /* renamed from: n */
    private final C1285h<R> f4240n;

    /* renamed from: o */
    private final List<C1272e<R>> f4241o;

    /* renamed from: p */
    private final C1293c<? super R> f4242p;

    /* renamed from: q */
    private final Executor f4243q;

    /* renamed from: r */
    private C1020v<R> f4244r;

    /* renamed from: s */
    private C1001d f4245s;

    /* renamed from: t */
    private long f4246t;

    /* renamed from: u */
    private volatile C0995k f4247u;

    /* renamed from: v */
    private C1276a f4248v;

    /* renamed from: w */
    private Drawable f4249w;

    /* renamed from: x */
    private Drawable f4250x;

    /* renamed from: y */
    private Drawable f4251y;

    /* renamed from: z */
    private int f4252z;

    /* renamed from: com.bumptech.glide.r.h$a */
    private enum C1276a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private C1275h(Context context, C0836e eVar, Object obj, Object obj2, Class<R> cls, C1267a<?> aVar, int i, int i2, C0838g gVar, C1285h<R> hVar, C1272e<R> eVar2, List<C1272e<R>> list, C1270d dVar, C0995k kVar, C1293c<? super R> cVar, Executor executor) {
        this.f4227a = f4223D ? String.valueOf(super.hashCode()) : null;
        this.f4228b = C1321c.m6194b();
        this.f4229c = obj;
        this.f4232f = context;
        this.f4233g = eVar;
        this.f4234h = obj2;
        this.f4235i = cls;
        this.f4236j = aVar;
        this.f4237k = i;
        this.f4238l = i2;
        this.f4239m = gVar;
        this.f4240n = hVar;
        this.f4230d = eVar2;
        this.f4241o = list;
        this.f4231e = dVar;
        this.f4247u = kVar;
        this.f4242p = cVar;
        this.f4243q = executor;
        this.f4248v = C1276a.PENDING;
        if (this.f4226C == null && eVar.mo4542g()) {
            this.f4226C = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: a */
    private static int m6006a(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* renamed from: a */
    private Drawable m6007a(int i) {
        return C1185a.m5575a((Context) this.f4233g, i, this.f4236j.mo5291x() != null ? this.f4236j.mo5291x() : this.f4232f.getTheme());
    }

    /* renamed from: a */
    public static <R> C1275h<R> m6008a(Context context, C0836e eVar, Object obj, Object obj2, Class<R> cls, C1267a<?> aVar, int i, int i2, C0838g gVar, C1285h<R> hVar, C1272e<R> eVar2, List<C1272e<R>> list, C1270d dVar, C0995k kVar, C1293c<? super R> cVar, Executor executor) {
        C1275h hVar2 = new C1275h(context, eVar, obj, obj2, cls, aVar, i, i2, gVar, hVar, eVar2, list, dVar, kVar, cVar, executor);
        return hVar2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m6009a(C1013q qVar, int i) {
        boolean z;
        this.f4228b.mo5389a();
        synchronized (this.f4229c) {
            qVar.mo4891a((Exception) this.f4226C);
            int e = this.f4233g.mo4540e();
            if (e <= i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Load failed for ");
                sb.append(this.f4234h);
                sb.append(" with size [");
                sb.append(this.f4252z);
                sb.append("x");
                sb.append(this.f4224A);
                sb.append("]");
                Log.w("Glide", sb.toString(), qVar);
                if (e <= 4) {
                    qVar.mo4892a("Glide");
                }
            }
            this.f4245s = null;
            this.f4248v = C1276a.FAILED;
            boolean z2 = true;
            this.f4225B = true;
            try {
                if (this.f4241o != null) {
                    z = false;
                    for (C1272e a : this.f4241o) {
                        z |= a.mo5310a(qVar, this.f4234h, this.f4240n, m6020o());
                    }
                } else {
                    z = false;
                }
                if (this.f4230d == null || !this.f4230d.mo5310a(qVar, this.f4234h, this.f4240n, m6020o())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    m6023r();
                }
                this.f4225B = false;
                m6021p();
            } catch (Throwable th) {
                this.f4225B = false;
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ab A[Catch:{ all -> 0x00bc }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6010a(com.bumptech.glide.load.p007o.C1020v<R> r11, R r12, com.bumptech.glide.load.C0856a r13) {
        /*
            r10 = this;
            boolean r6 = r10.m6020o()
            com.bumptech.glide.r.h$a r0 = com.bumptech.glide.p025r.C1275h.C1276a.COMPLETE
            r10.f4248v = r0
            r10.f4244r = r11
            com.bumptech.glide.e r11 = r10.f4233g
            int r11 = r11.mo4540e()
            r0 = 3
            if (r11 > r0) goto L_0x006a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Finished loading "
            r11.append(r0)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            java.lang.String r0 = " from "
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = " for "
            r11.append(r0)
            java.lang.Object r0 = r10.f4234h
            r11.append(r0)
            java.lang.String r0 = " with size ["
            r11.append(r0)
            int r0 = r10.f4252z
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.f4224A
            r11.append(r0)
            java.lang.String r0 = "] in "
            r11.append(r0)
            long r0 = r10.f4246t
            double r0 = com.bumptech.glide.p029t.C1305f.m6135a(r0)
            r11.append(r0)
            java.lang.String r0 = " ms"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r11)
        L_0x006a:
            r11 = 1
            r10.f4225B = r11
            r7 = 0
            java.util.List<com.bumptech.glide.r.e<R>> r0 = r10.f4241o     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0092
            java.util.List<com.bumptech.glide.r.e<R>> r0 = r10.f4241o     // Catch:{ all -> 0x00bc }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00bc }
            r9 = 0
        L_0x0079:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00bc }
            com.bumptech.glide.r.e r0 = (com.bumptech.glide.p025r.C1272e) r0     // Catch:{ all -> 0x00bc }
            java.lang.Object r2 = r10.f4234h     // Catch:{ all -> 0x00bc }
            com.bumptech.glide.r.j.h<R> r3 = r10.f4240n     // Catch:{ all -> 0x00bc }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.mo5311a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00bc }
            r9 = r9 | r0
            goto L_0x0079
        L_0x0092:
            r9 = 0
        L_0x0093:
            com.bumptech.glide.r.e<R> r0 = r10.f4230d     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00a7
            com.bumptech.glide.r.e<R> r0 = r10.f4230d     // Catch:{ all -> 0x00bc }
            java.lang.Object r2 = r10.f4234h     // Catch:{ all -> 0x00bc }
            com.bumptech.glide.r.j.h<R> r3 = r10.f4240n     // Catch:{ all -> 0x00bc }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.mo5311a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r11 = 0
        L_0x00a8:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00b6
            com.bumptech.glide.r.k.c<? super R> r11 = r10.f4242p     // Catch:{ all -> 0x00bc }
            com.bumptech.glide.r.k.b r11 = r11.mo5335a(r13, r6)     // Catch:{ all -> 0x00bc }
            com.bumptech.glide.r.j.h<R> r13 = r10.f4240n     // Catch:{ all -> 0x00bc }
            r13.mo5128a(r12, r11)     // Catch:{ all -> 0x00bc }
        L_0x00b6:
            r10.f4225B = r7
            r10.m6022q()
            return
        L_0x00bc:
            r11 = move-exception
            r10.f4225B = r7
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p025r.C1275h.m6010a(com.bumptech.glide.load.o.v, java.lang.Object, com.bumptech.glide.load.a):void");
    }

    /* renamed from: a */
    private void m6011a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f4227a);
        Log.v("Request", sb.toString());
    }

    /* renamed from: g */
    private void m6012g() {
        if (this.f4225B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: h */
    private boolean m6013h() {
        C1270d dVar = this.f4231e;
        return dVar == null || dVar.mo5307f(this);
    }

    /* renamed from: i */
    private boolean m6014i() {
        C1270d dVar = this.f4231e;
        return dVar == null || dVar.mo5300c(this);
    }

    /* renamed from: j */
    private boolean m6015j() {
        C1270d dVar = this.f4231e;
        return dVar == null || dVar.mo5303d(this);
    }

    /* renamed from: k */
    private void m6016k() {
        m6012g();
        this.f4228b.mo5389a();
        this.f4240n.mo5322a((C1284g) this);
        C1001d dVar = this.f4245s;
        if (dVar != null) {
            dVar.mo4851a();
            this.f4245s = null;
        }
    }

    /* renamed from: l */
    private Drawable m6017l() {
        if (this.f4249w == null) {
            Drawable j = this.f4236j.mo5278j();
            this.f4249w = j;
            if (j == null && this.f4236j.mo5275e() > 0) {
                this.f4249w = m6007a(this.f4236j.mo5275e());
            }
        }
        return this.f4249w;
    }

    /* renamed from: m */
    private Drawable m6018m() {
        if (this.f4251y == null) {
            Drawable k = this.f4236j.mo5279k();
            this.f4251y = k;
            if (k == null && this.f4236j.mo5280l() > 0) {
                this.f4251y = m6007a(this.f4236j.mo5280l());
            }
        }
        return this.f4251y;
    }

    /* renamed from: n */
    private Drawable m6019n() {
        if (this.f4250x == null) {
            Drawable r = this.f4236j.mo5285r();
            this.f4250x = r;
            if (r == null && this.f4236j.mo5286s() > 0) {
                this.f4250x = m6007a(this.f4236j.mo5286s());
            }
        }
        return this.f4250x;
    }

    /* renamed from: o */
    private boolean m6020o() {
        C1270d dVar = this.f4231e;
        return dVar == null || !dVar.mo5297b().mo5296a();
    }

    /* renamed from: p */
    private void m6021p() {
        C1270d dVar = this.f4231e;
        if (dVar != null) {
            dVar.mo5294a(this);
        }
    }

    /* renamed from: q */
    private void m6022q() {
        C1270d dVar = this.f4231e;
        if (dVar != null) {
            dVar.mo5305e(this);
        }
    }

    /* renamed from: r */
    private void m6023r() {
        if (m6014i()) {
            Drawable drawable = null;
            if (this.f4234h == null) {
                drawable = m6018m();
            }
            if (drawable == null) {
                drawable = m6017l();
            }
            if (drawable == null) {
                drawable = m6019n();
            }
            this.f4240n.mo5317a(drawable);
        }
    }

    /* renamed from: a */
    public void mo5315a(int i, int i2) {
        Object obj;
        this.f4228b.mo5389a();
        Object obj2 = this.f4229c;
        synchronized (obj2) {
            try {
                if (f4223D) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got onSizeReady in ");
                    sb.append(C1305f.m6135a(this.f4246t));
                    m6011a(sb.toString());
                }
                if (this.f4248v == C1276a.WAITING_FOR_SIZE) {
                    this.f4248v = C1276a.RUNNING;
                    float w = this.f4236j.mo5290w();
                    this.f4252z = m6006a(i, w);
                    this.f4224A = m6006a(i2, w);
                    if (f4223D) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("finished setup for calling load in ");
                        sb2.append(C1305f.m6135a(this.f4246t));
                        m6011a(sb2.toString());
                    }
                    obj = obj2;
                    try {
                        this.f4245s = this.f4247u.mo4844a(this.f4233g, this.f4234h, this.f4236j.mo5289v(), this.f4252z, this.f4224A, this.f4236j.mo5288u(), this.f4235i, this.f4239m, this.f4236j.mo5274d(), this.f4236j.mo5292y(), this.f4236j.mo5249F(), this.f4236j.mo5247D(), this.f4236j.mo5282o(), this.f4236j.mo5245B(), this.f4236j.mo5244A(), this.f4236j.mo5293z(), this.f4236j.mo5281n(), this, this.f4243q);
                        if (this.f4248v != C1276a.RUNNING) {
                            this.f4245s = null;
                        }
                        if (f4223D) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("finished onSizeReady in ");
                            sb3.append(C1305f.m6135a(this.f4246t));
                            m6011a(sb3.toString());
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void mo5312a(C1013q qVar) {
        m6009a(qVar, 5);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r6 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r5.f4247u.mo4848b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        if (r6 == null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ac, code lost:
        r5.f4247u.mo4848b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b1, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5313a(com.bumptech.glide.load.p007o.C1020v<?> r6, com.bumptech.glide.load.C0856a r7) {
        /*
            r5 = this;
            com.bumptech.glide.t.l.c r0 = r5.f4228b
            r0.mo5389a()
            r0 = 0
            java.lang.Object r1 = r5.f4229c     // Catch:{ all -> 0x00b9 }
            monitor-enter(r1)     // Catch:{ all -> 0x00b9 }
            r5.f4245s = r0     // Catch:{ all -> 0x00b6 }
            if (r6 != 0) goto L_0x002f
            com.bumptech.glide.load.o.q r6 = new com.bumptech.glide.load.o.q     // Catch:{ all -> 0x00b6 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            r7.<init>()     // Catch:{ all -> 0x00b6 }
            java.lang.String r2 = "Expected to receive a Resource<R> with an object of "
            r7.append(r2)     // Catch:{ all -> 0x00b6 }
            java.lang.Class<R> r2 = r5.f4235i     // Catch:{ all -> 0x00b6 }
            r7.append(r2)     // Catch:{ all -> 0x00b6 }
            java.lang.String r2 = " inside, but instead got null."
            r7.append(r2)     // Catch:{ all -> 0x00b6 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00b6 }
            r6.<init>(r7)     // Catch:{ all -> 0x00b6 }
            r5.mo5312a(r6)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b6 }
            return
        L_0x002f:
            java.lang.Object r2 = r6.get()     // Catch:{ all -> 0x00b6 }
            if (r2 == 0) goto L_0x005c
            java.lang.Class<R> r3 = r5.f4235i     // Catch:{ all -> 0x00b6 }
            java.lang.Class r4 = r2.getClass()     // Catch:{ all -> 0x00b6 }
            boolean r3 = r3.isAssignableFrom(r4)     // Catch:{ all -> 0x00b6 }
            if (r3 != 0) goto L_0x0042
            goto L_0x005c
        L_0x0042:
            boolean r3 = r5.m6015j()     // Catch:{ all -> 0x00b6 }
            if (r3 != 0) goto L_0x0057
            r5.f4244r = r0     // Catch:{ all -> 0x00b2 }
            com.bumptech.glide.r.h$a r7 = com.bumptech.glide.p025r.C1275h.C1276a.COMPLETE     // Catch:{ all -> 0x00b2 }
            r5.f4248v = r7     // Catch:{ all -> 0x00b2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x0056
            com.bumptech.glide.load.o.k r7 = r5.f4247u
            r7.mo4848b(r6)
        L_0x0056:
            return
        L_0x0057:
            r5.m6010a(r6, r2, r7)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b6 }
            return
        L_0x005c:
            r5.f4244r = r0     // Catch:{ all -> 0x00b2 }
            com.bumptech.glide.load.o.q r7 = new com.bumptech.glide.load.o.q     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r0.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = "Expected to receive an object of "
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.Class<R> r3 = r5.f4235i     // Catch:{ all -> 0x00b2 }
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = " but instead got "
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x007b
            java.lang.Class r3 = r2.getClass()     // Catch:{ all -> 0x00b2 }
            goto L_0x007d
        L_0x007b:
            java.lang.String r3 = ""
        L_0x007d:
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = "{"
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            r0.append(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = "} inside Resource{"
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            r0.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = "}."
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x009a
            java.lang.String r2 = ""
            goto L_0x009c
        L_0x009a:
            java.lang.String r2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x009c:
            r0.append(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b2 }
            r7.<init>(r0)     // Catch:{ all -> 0x00b2 }
            r5.mo5312a(r7)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x00b1
            com.bumptech.glide.load.o.k r7 = r5.f4247u
            r7.mo4848b(r6)
        L_0x00b1:
            return
        L_0x00b2:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto L_0x00b7
        L_0x00b6:
            r6 = move-exception
        L_0x00b7:
            monitor-exit(r1)     // Catch:{ all -> 0x00b6 }
            throw r6     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r6 = move-exception
            if (r0 == 0) goto L_0x00c1
            com.bumptech.glide.load.o.k r7 = r5.f4247u
            r7.mo4848b(r0)
        L_0x00c1:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p025r.C1275h.mo5313a(com.bumptech.glide.load.o.v, com.bumptech.glide.load.a):void");
    }

    /* renamed from: a */
    public boolean mo5296a() {
        boolean z;
        synchronized (this.f4229c) {
            z = this.f4248v == C1276a.COMPLETE;
        }
        return z;
    }

    /* renamed from: b */
    public Object mo5314b() {
        this.f4228b.mo5389a();
        return this.f4229c;
    }

    /* renamed from: b */
    public boolean mo5298b(C1269c cVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        C1267a<?> aVar;
        C0838g gVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        C1267a<?> aVar2;
        C0838g gVar2;
        int size2;
        C1269c cVar2 = cVar;
        if (!(cVar2 instanceof C1275h)) {
            return false;
        }
        synchronized (this.f4229c) {
            i = this.f4237k;
            i2 = this.f4238l;
            obj = this.f4234h;
            cls = this.f4235i;
            aVar = this.f4236j;
            gVar = this.f4239m;
            size = this.f4241o != null ? this.f4241o.size() : 0;
        }
        C1275h hVar = (C1275h) cVar2;
        synchronized (hVar.f4229c) {
            i3 = hVar.f4237k;
            i4 = hVar.f4238l;
            obj2 = hVar.f4234h;
            cls2 = hVar.f4235i;
            aVar2 = hVar.f4236j;
            gVar2 = hVar.f4239m;
            size2 = hVar.f4241o != null ? hVar.f4241o.size() : 0;
        }
        return i == i3 && i2 == i4 && C1310k.m6167a(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && gVar == gVar2 && size == size2;
    }

    /* renamed from: c */
    public boolean mo5299c() {
        boolean z;
        synchronized (this.f4229c) {
            z = this.f4248v == C1276a.CLEARED;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r2 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r4.f4247u.mo4848b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4229c
            monitor-enter(r0)
            r4.m6012g()     // Catch:{ all -> 0x003c }
            com.bumptech.glide.t.l.c r1 = r4.f4228b     // Catch:{ all -> 0x003c }
            r1.mo5389a()     // Catch:{ all -> 0x003c }
            com.bumptech.glide.r.h$a r1 = r4.f4248v     // Catch:{ all -> 0x003c }
            com.bumptech.glide.r.h$a r2 = com.bumptech.glide.p025r.C1275h.C1276a.CLEARED     // Catch:{ all -> 0x003c }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x0013:
            r4.m6016k()     // Catch:{ all -> 0x003c }
            com.bumptech.glide.load.o.v<R> r1 = r4.f4244r     // Catch:{ all -> 0x003c }
            r2 = 0
            if (r1 == 0) goto L_0x0020
            com.bumptech.glide.load.o.v<R> r1 = r4.f4244r     // Catch:{ all -> 0x003c }
            r4.f4244r = r2     // Catch:{ all -> 0x003c }
            r2 = r1
        L_0x0020:
            boolean r1 = r4.m6013h()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x002f
            com.bumptech.glide.r.j.h<R> r1 = r4.f4240n     // Catch:{ all -> 0x003c }
            android.graphics.drawable.Drawable r3 = r4.m6019n()     // Catch:{ all -> 0x003c }
            r1.mo5129c(r3)     // Catch:{ all -> 0x003c }
        L_0x002f:
            com.bumptech.glide.r.h$a r1 = com.bumptech.glide.p025r.C1275h.C1276a.CLEARED     // Catch:{ all -> 0x003c }
            r4.f4248v = r1     // Catch:{ all -> 0x003c }
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x003b
            com.bumptech.glide.load.o.k r0 = r4.f4247u
            r0.mo4848b(r2)
        L_0x003b:
            return
        L_0x003c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p025r.C1275h.clear():void");
    }

    /* renamed from: d */
    public void mo5302d() {
        synchronized (this.f4229c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5304e() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4229c
            monitor-enter(r0)
            r4.m6012g()     // Catch:{ all -> 0x00af }
            com.bumptech.glide.t.l.c r1 = r4.f4228b     // Catch:{ all -> 0x00af }
            r1.mo5389a()     // Catch:{ all -> 0x00af }
            long r1 = com.bumptech.glide.p029t.C1305f.m6136a()     // Catch:{ all -> 0x00af }
            r4.f4246t = r1     // Catch:{ all -> 0x00af }
            java.lang.Object r1 = r4.f4234h     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x003c
            int r1 = r4.f4237k     // Catch:{ all -> 0x00af }
            int r2 = r4.f4238l     // Catch:{ all -> 0x00af }
            boolean r1 = com.bumptech.glide.p029t.C1310k.m6170b(r1, r2)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0027
            int r1 = r4.f4237k     // Catch:{ all -> 0x00af }
            r4.f4252z = r1     // Catch:{ all -> 0x00af }
            int r1 = r4.f4238l     // Catch:{ all -> 0x00af }
            r4.f4224A = r1     // Catch:{ all -> 0x00af }
        L_0x0027:
            android.graphics.drawable.Drawable r1 = r4.m6018m()     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x002f
            r1 = 5
            goto L_0x0030
        L_0x002f:
            r1 = 3
        L_0x0030:
            com.bumptech.glide.load.o.q r2 = new com.bumptech.glide.load.o.q     // Catch:{ all -> 0x00af }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00af }
            r4.m6009a(r2, r1)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x003c:
            com.bumptech.glide.r.h$a r1 = r4.f4248v     // Catch:{ all -> 0x00af }
            com.bumptech.glide.r.h$a r2 = com.bumptech.glide.p025r.C1275h.C1276a.RUNNING     // Catch:{ all -> 0x00af }
            if (r1 == r2) goto L_0x00a7
            com.bumptech.glide.r.h$a r1 = r4.f4248v     // Catch:{ all -> 0x00af }
            com.bumptech.glide.r.h$a r2 = com.bumptech.glide.p025r.C1275h.C1276a.COMPLETE     // Catch:{ all -> 0x00af }
            if (r1 != r2) goto L_0x0051
            com.bumptech.glide.load.o.v<R> r1 = r4.f4244r     // Catch:{ all -> 0x00af }
            com.bumptech.glide.load.a r2 = com.bumptech.glide.load.C0856a.MEMORY_CACHE     // Catch:{ all -> 0x00af }
            r4.mo5313a(r1, r2)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x0051:
            com.bumptech.glide.r.h$a r1 = com.bumptech.glide.p025r.C1275h.C1276a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00af }
            r4.f4248v = r1     // Catch:{ all -> 0x00af }
            int r1 = r4.f4237k     // Catch:{ all -> 0x00af }
            int r2 = r4.f4238l     // Catch:{ all -> 0x00af }
            boolean r1 = com.bumptech.glide.p029t.C1310k.m6170b(r1, r2)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0067
            int r1 = r4.f4237k     // Catch:{ all -> 0x00af }
            int r2 = r4.f4238l     // Catch:{ all -> 0x00af }
            r4.mo5315a(r1, r2)     // Catch:{ all -> 0x00af }
            goto L_0x006c
        L_0x0067:
            com.bumptech.glide.r.j.h<R> r1 = r4.f4240n     // Catch:{ all -> 0x00af }
            r1.mo5323b(r4)     // Catch:{ all -> 0x00af }
        L_0x006c:
            com.bumptech.glide.r.h$a r1 = r4.f4248v     // Catch:{ all -> 0x00af }
            com.bumptech.glide.r.h$a r2 = com.bumptech.glide.p025r.C1275h.C1276a.RUNNING     // Catch:{ all -> 0x00af }
            if (r1 == r2) goto L_0x0078
            com.bumptech.glide.r.h$a r1 = r4.f4248v     // Catch:{ all -> 0x00af }
            com.bumptech.glide.r.h$a r2 = com.bumptech.glide.p025r.C1275h.C1276a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00af }
            if (r1 != r2) goto L_0x0087
        L_0x0078:
            boolean r1 = r4.m6014i()     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0087
            com.bumptech.glide.r.j.h<R> r1 = r4.f4240n     // Catch:{ all -> 0x00af }
            android.graphics.drawable.Drawable r2 = r4.m6019n()     // Catch:{ all -> 0x00af }
            r1.mo5318b(r2)     // Catch:{ all -> 0x00af }
        L_0x0087:
            boolean r1 = f4223D     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x00a5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r1.<init>()     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00af }
            long r2 = r4.f4246t     // Catch:{ all -> 0x00af }
            double r2 = com.bumptech.glide.p029t.C1305f.m6135a(r2)     // Catch:{ all -> 0x00af }
            r1.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00af }
            r4.m6011a(r1)     // Catch:{ all -> 0x00af }
        L_0x00a5:
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x00a7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00af }
            throw r1     // Catch:{ all -> 0x00af }
        L_0x00af:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p025r.C1275h.mo5304e():void");
    }

    /* renamed from: f */
    public boolean mo5306f() {
        boolean z;
        synchronized (this.f4229c) {
            z = this.f4248v == C1276a.COMPLETE;
        }
        return z;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f4229c) {
            if (this.f4248v != C1276a.RUNNING) {
                if (this.f4248v != C1276a.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }
}
