package p337m.p338f0.p341e;

import java.io.IOException;
import p308k.p323z.p325d.C5942k;
import p337m.C6224a;
import p337m.C6243d0;
import p337m.C6434p;
import p337m.C6448t;
import p337m.C6462x;
import p337m.p338f0.C6250b;
import p337m.p338f0.p341e.C6287k.C6289b;
import p337m.p338f0.p342f.C6295d;
import p337m.p338f0.p342f.C6299g;
import p337m.p338f0.p344h.C6314a;
import p337m.p338f0.p344h.C6315b;
import p337m.p338f0.p344h.C6362n;

/* renamed from: m.f0.e.d */
public final class C6272d {

    /* renamed from: a */
    private C6289b f15487a;

    /* renamed from: b */
    private C6287k f15488b;

    /* renamed from: c */
    private C6277f f15489c;

    /* renamed from: d */
    private int f15490d;

    /* renamed from: e */
    private int f15491e;

    /* renamed from: f */
    private int f15492f;

    /* renamed from: g */
    private C6243d0 f15493g;

    /* renamed from: h */
    private final C6282h f15494h;

    /* renamed from: i */
    private final C6224a f15495i;

    /* renamed from: j */
    private final C6273e f15496j;

    /* renamed from: k */
    private final C6434p f15497k;

    public C6272d(C6282h hVar, C6224a aVar, C6273e eVar, C6434p pVar) {
        C5942k.m22327b(hVar, "connectionPool");
        C5942k.m22327b(aVar, "address");
        C5942k.m22327b(eVar, "call");
        C5942k.m22327b(pVar, "eventListener");
        this.f15494h = hVar;
        this.f15495i = aVar;
        this.f15496j = eVar;
        this.f15497k = pVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00bd, code lost:
        if (r0.mo16236b() == false) goto L_0x00c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00eb A[SYNTHETIC, Splitter:B:64:0x00eb] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x013c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p337m.p338f0.p341e.C6277f m23562a(int r19, int r20, int r21, int r22, boolean r23) {
        /*
            r18 = this;
            r1 = r18
            k.z.d.r r0 = new k.z.d.r
            r0.<init>()
            m.f0.e.h r2 = r1.f15494h
            monitor-enter(r2)
            m.f0.e.e r3 = r1.f15496j     // Catch:{ all -> 0x01f9 }
            boolean r3 = r3.mo16096i()     // Catch:{ all -> 0x01f9 }
            if (r3 != 0) goto L_0x01f1
            m.f0.e.e r3 = r1.f15496j     // Catch:{ all -> 0x01f9 }
            m.f0.e.f r3 = r3.mo16178c()     // Catch:{ all -> 0x01f9 }
            r0.f14947f = r3     // Catch:{ all -> 0x01f9 }
            r4 = 0
            if (r3 == 0) goto L_0x003c
            boolean r5 = r3.mo16212e()     // Catch:{ all -> 0x01f9 }
            if (r5 != 0) goto L_0x0035
            m.d0 r3 = r3.mo16219l()     // Catch:{ all -> 0x01f9 }
            m.a r3 = r3.mo16085a()     // Catch:{ all -> 0x01f9 }
            m.t r3 = r3.mo16005k()     // Catch:{ all -> 0x01f9 }
            boolean r3 = r1.mo16168a(r3)     // Catch:{ all -> 0x01f9 }
            if (r3 != 0) goto L_0x003c
        L_0x0035:
            m.f0.e.e r3 = r1.f15496j     // Catch:{ all -> 0x01f9 }
            java.net.Socket r3 = r3.mo16185n()     // Catch:{ all -> 0x01f9 }
            goto L_0x003d
        L_0x003c:
            r3 = r4
        L_0x003d:
            m.f0.e.e r5 = r1.f15496j     // Catch:{ all -> 0x01f9 }
            m.f0.e.f r5 = r5.mo16178c()     // Catch:{ all -> 0x01f9 }
            if (r5 == 0) goto L_0x004e
            m.f0.e.e r5 = r1.f15496j     // Catch:{ all -> 0x01f9 }
            m.f0.e.f r5 = r5.mo16178c()     // Catch:{ all -> 0x01f9 }
            r0.f14947f = r4     // Catch:{ all -> 0x01f9 }
            goto L_0x004f
        L_0x004e:
            r5 = r4
        L_0x004f:
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L_0x0077
            r1.f15490d = r7     // Catch:{ all -> 0x01f9 }
            r1.f15491e = r7     // Catch:{ all -> 0x01f9 }
            r1.f15492f = r7     // Catch:{ all -> 0x01f9 }
            m.f0.e.h r8 = r1.f15494h     // Catch:{ all -> 0x01f9 }
            m.a r9 = r1.f15495i     // Catch:{ all -> 0x01f9 }
            m.f0.e.e r10 = r1.f15496j     // Catch:{ all -> 0x01f9 }
            boolean r8 = r8.mo16223a(r9, r10, r4, r7)     // Catch:{ all -> 0x01f9 }
            if (r8 == 0) goto L_0x006e
            m.f0.e.e r5 = r1.f15496j     // Catch:{ all -> 0x01f9 }
            m.f0.e.f r5 = r5.mo16178c()     // Catch:{ all -> 0x01f9 }
            r8 = r4
            r9 = 1
            goto L_0x0079
        L_0x006e:
            m.d0 r8 = r1.f15493g     // Catch:{ all -> 0x01f9 }
            if (r8 == 0) goto L_0x0077
            m.d0 r8 = r1.f15493g     // Catch:{ all -> 0x01f9 }
            r1.f15493g = r4     // Catch:{ all -> 0x01f9 }
            goto L_0x0078
        L_0x0077:
            r8 = r4
        L_0x0078:
            r9 = 0
        L_0x0079:
            k.t r10 = p308k.C5812t.f14872a     // Catch:{ all -> 0x01f9 }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0081
            p337m.p338f0.C6250b.m23458a(r3)
        L_0x0081:
            T r0 = r0.f14947f
            r2 = r0
            m.f0.e.f r2 = (p337m.p338f0.p341e.C6277f) r2
            if (r2 == 0) goto L_0x0098
            m.p r2 = r1.f15497k
            m.f0.e.e r3 = r1.f15496j
            m.f0.e.f r0 = (p337m.p338f0.p341e.C6277f) r0
            if (r0 == 0) goto L_0x0094
            r2.mo16583b(r3, r0)
            goto L_0x0098
        L_0x0094:
            p308k.p323z.p325d.C5942k.m22323a()
            throw r4
        L_0x0098:
            if (r9 == 0) goto L_0x00a8
            m.p r0 = r1.f15497k
            m.f0.e.e r2 = r1.f15496j
            if (r5 == 0) goto L_0x00a4
            r0.mo16575a(r2, r5)
            goto L_0x00a8
        L_0x00a4:
            p308k.p323z.p325d.C5942k.m22323a()
            throw r4
        L_0x00a8:
            if (r5 == 0) goto L_0x00b1
            if (r5 == 0) goto L_0x00ad
            return r5
        L_0x00ad:
            p308k.p323z.p325d.C5942k.m22323a()
            throw r4
        L_0x00b1:
            if (r8 != 0) goto L_0x00e7
            m.f0.e.k$b r0 = r1.f15487a
            if (r0 == 0) goto L_0x00c4
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r0.mo16236b()
            if (r0 != 0) goto L_0x00e7
            goto L_0x00c4
        L_0x00c0:
            p308k.p323z.p325d.C5942k.m22323a()
            throw r4
        L_0x00c4:
            m.f0.e.k r0 = r1.f15488b
            if (r0 != 0) goto L_0x00df
            m.f0.e.k r0 = new m.f0.e.k
            m.a r2 = r1.f15495i
            m.f0.e.e r3 = r1.f15496j
            m.x r3 = r3.mo16177b()
            m.f0.e.i r3 = r3.mo16702t()
            m.f0.e.e r10 = r1.f15496j
            m.p r11 = r1.f15497k
            r0.<init>(r2, r3, r10, r11)
            r1.f15488b = r0
        L_0x00df:
            m.f0.e.k$b r0 = r0.mo16233b()
            r1.f15487a = r0
            r0 = 1
            goto L_0x00e8
        L_0x00e7:
            r0 = 0
        L_0x00e8:
            m.f0.e.h r2 = r1.f15494h
            monitor-enter(r2)
            m.f0.e.e r3 = r1.f15496j     // Catch:{ all -> 0x01ee }
            boolean r3 = r3.mo16096i()     // Catch:{ all -> 0x01ee }
            if (r3 != 0) goto L_0x01e6
            if (r0 == 0) goto L_0x0115
            m.f0.e.k$b r0 = r1.f15487a     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x0111
            java.util.List r0 = r0.mo16235a()     // Catch:{ all -> 0x01ee }
            m.f0.e.h r3 = r1.f15494h     // Catch:{ all -> 0x01ee }
            m.a r10 = r1.f15495i     // Catch:{ all -> 0x01ee }
            m.f0.e.e r11 = r1.f15496j     // Catch:{ all -> 0x01ee }
            boolean r3 = r3.mo16223a(r10, r11, r0, r7)     // Catch:{ all -> 0x01ee }
            if (r3 == 0) goto L_0x0116
            m.f0.e.e r3 = r1.f15496j     // Catch:{ all -> 0x01ee }
            m.f0.e.f r5 = r3.mo16178c()     // Catch:{ all -> 0x01ee }
            r9 = 1
            goto L_0x0116
        L_0x0111:
            p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x01ee }
            throw r4
        L_0x0115:
            r0 = r4
        L_0x0116:
            if (r9 != 0) goto L_0x0137
            if (r8 != 0) goto L_0x0127
            m.f0.e.k$b r3 = r1.f15487a     // Catch:{ all -> 0x01ee }
            if (r3 == 0) goto L_0x0123
            m.d0 r8 = r3.mo16237c()     // Catch:{ all -> 0x01ee }
            goto L_0x0127
        L_0x0123:
            p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x01ee }
            throw r4
        L_0x0127:
            m.f0.e.f r5 = new m.f0.e.f     // Catch:{ all -> 0x01ee }
            m.f0.e.h r3 = r1.f15494h     // Catch:{ all -> 0x01ee }
            if (r8 == 0) goto L_0x0133
            r5.<init>(r3, r8)     // Catch:{ all -> 0x01ee }
            r1.f15489c = r5     // Catch:{ all -> 0x01ee }
            goto L_0x0137
        L_0x0133:
            p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x01ee }
            throw r4
        L_0x0137:
            k.t r3 = p308k.C5812t.f14872a     // Catch:{ all -> 0x01ee }
            monitor-exit(r2)
            if (r9 == 0) goto L_0x0150
            m.p r0 = r1.f15497k
            m.f0.e.e r2 = r1.f15496j
            if (r5 == 0) goto L_0x014c
            r0.mo16575a(r2, r5)
            if (r5 == 0) goto L_0x0148
            return r5
        L_0x0148:
            p308k.p323z.p325d.C5942k.m22323a()
            throw r4
        L_0x014c:
            p308k.p323z.p325d.C5942k.m22323a()
            throw r4
        L_0x0150:
            if (r5 == 0) goto L_0x01e2
            m.f0.e.e r2 = r1.f15496j
            m.p r3 = r1.f15497k
            r10 = r5
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r15 = r23
            r16 = r2
            r17 = r3
            r10.mo16199a(r11, r12, r13, r14, r15, r16, r17)
            m.f0.e.e r2 = r1.f15496j
            m.x r2 = r2.mo16177b()
            m.f0.e.i r2 = r2.mo16702t()
            if (r5 == 0) goto L_0x01de
            m.d0 r3 = r5.mo16219l()
            r2.mo16226a(r3)
            m.f0.e.h r2 = r1.f15494h
            monitor-enter(r2)
            r1.f15489c = r4     // Catch:{ all -> 0x01db }
            m.f0.e.h r3 = r1.f15494h     // Catch:{ all -> 0x01db }
            m.a r7 = r1.f15495i     // Catch:{ all -> 0x01db }
            m.f0.e.e r9 = r1.f15496j     // Catch:{ all -> 0x01db }
            boolean r0 = r3.mo16223a(r7, r9, r0, r6)     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x01a8
            if (r5 == 0) goto L_0x01a4
            r5.mo16209b(r6)     // Catch:{ all -> 0x01db }
            if (r5 == 0) goto L_0x01a0
            java.net.Socket r0 = r5.mo16220m()     // Catch:{ all -> 0x01db }
            m.f0.e.e r3 = r1.f15496j     // Catch:{ all -> 0x01db }
            m.f0.e.f r5 = r3.mo16178c()     // Catch:{ all -> 0x01db }
            r1.f15493g = r8     // Catch:{ all -> 0x01db }
            goto L_0x01b7
        L_0x01a0:
            p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x01db }
            throw r4
        L_0x01a4:
            p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x01db }
            throw r4
        L_0x01a8:
            m.f0.e.h r0 = r1.f15494h     // Catch:{ all -> 0x01db }
            if (r5 == 0) goto L_0x01d7
            r0.mo16225b(r5)     // Catch:{ all -> 0x01db }
            m.f0.e.e r0 = r1.f15496j     // Catch:{ all -> 0x01db }
            if (r5 == 0) goto L_0x01d3
            r0.mo16174a(r5)     // Catch:{ all -> 0x01db }
            r0 = r4
        L_0x01b7:
            k.t r3 = p308k.C5812t.f14872a     // Catch:{ all -> 0x01db }
            monitor-exit(r2)
            if (r0 == 0) goto L_0x01bf
            p337m.p338f0.C6250b.m23458a(r0)
        L_0x01bf:
            m.p r0 = r1.f15497k
            m.f0.e.e r2 = r1.f15496j
            if (r5 == 0) goto L_0x01cf
            r0.mo16575a(r2, r5)
            if (r5 == 0) goto L_0x01cb
            return r5
        L_0x01cb:
            p308k.p323z.p325d.C5942k.m22323a()
            throw r4
        L_0x01cf:
            p308k.p323z.p325d.C5942k.m22323a()
            throw r4
        L_0x01d3:
            p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x01db }
            throw r4
        L_0x01d7:
            p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x01db }
            throw r4
        L_0x01db:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01de:
            p308k.p323z.p325d.C5942k.m22323a()
            throw r4
        L_0x01e2:
            p308k.p323z.p325d.C5942k.m22323a()
            throw r4
        L_0x01e6:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01ee }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x01ee }
            throw r0     // Catch:{ all -> 0x01ee }
        L_0x01ee:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01f1:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01f9 }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x01f9 }
            throw r0     // Catch:{ all -> 0x01f9 }
        L_0x01f9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p341e.C6272d.m23562a(int, int, int, int, boolean):m.f0.e.f");
    }

    /* renamed from: a */
    private final C6277f m23563a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        while (true) {
            C6277f a = m23562a(i, i2, i3, i4, z);
            if (a.mo16207a(z2)) {
                return a;
            }
            a.mo16218k();
        }
    }

    /* renamed from: d */
    private final boolean m23564d() {
        if (this.f15490d > 1 || this.f15491e > 1 || this.f15492f > 0) {
            return false;
        }
        C6277f c = this.f15496j.mo16178c();
        return c != null && c.mo16213f() == 0 && C6250b.m23463a(c.mo16219l().mo16085a().mo16005k(), this.f15495i.mo16005k());
    }

    /* renamed from: a */
    public final C6277f mo16165a() {
        C6282h hVar = this.f15494h;
        if (!C6250b.f15421g || Thread.holdsLock(hVar)) {
            return this.f15489c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(hVar);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public final C6295d mo16166a(C6462x xVar, C6299g gVar) {
        C5942k.m22327b(xVar, "client");
        C5942k.m22327b(gVar, "chain");
        try {
            return m23563a(gVar.mo16255c(), gVar.mo16257e(), gVar.mo16260h(), xVar.mo16706x(), xVar.mo16684D(), !C5942k.m22326a((Object) gVar.mo16258f().mo16754f(), (Object) "GET")).mo16196a(xVar, gVar);
        } catch (C6286j e) {
            mo16167a(e.mo16231b());
            throw e;
        } catch (IOException e2) {
            mo16167a(e2);
            throw new C6286j(e2);
        }
    }

    /* renamed from: a */
    public final void mo16167a(IOException iOException) {
        C5942k.m22327b(iOException, "e");
        C6282h hVar = this.f15494h;
        if (!C6250b.f15421g || !Thread.holdsLock(hVar)) {
            synchronized (this.f15494h) {
                this.f15493g = null;
                if ((iOException instanceof C6362n) && ((C6362n) iOException).f15797f == C6315b.REFUSED_STREAM) {
                    this.f15490d++;
                } else if (iOException instanceof C6314a) {
                    this.f15491e++;
                } else {
                    this.f15492f++;
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(hVar);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public final boolean mo16168a(C6448t tVar) {
        C5942k.m22327b(tVar, "url");
        C6448t k = this.f15495i.mo16005k();
        return tVar.mo16634k() == k.mo16634k() && C5942k.m22326a((Object) tVar.mo16629g(), (Object) k.mo16629g());
    }

    /* renamed from: b */
    public final C6224a mo16169b() {
        return this.f15495i;
    }

    /* renamed from: c */
    public final boolean mo16170c() {
        synchronized (this.f15494h) {
            if (this.f15490d == 0 && this.f15491e == 0 && this.f15492f == 0) {
                return false;
            }
            if (this.f15493g != null) {
                return true;
            }
            if (m23564d()) {
                C6277f c = this.f15496j.mo16178c();
                if (c != null) {
                    this.f15493g = c.mo16219l();
                    return true;
                }
                C5942k.m22323a();
                throw null;
            }
            C6289b bVar = this.f15487a;
            if (bVar != null && bVar.mo16236b()) {
                return true;
            }
            C6287k kVar = this.f15488b;
            if (kVar == null) {
                return true;
            }
            boolean a = kVar.mo16232a();
            return a;
        }
    }
}
