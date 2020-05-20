package p337m.p338f0.p341e;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p337m.C6224a;
import p337m.C6243d0;
import p337m.p338f0.C6250b;
import p337m.p338f0.p340d.C6259a;
import p337m.p338f0.p340d.C6261c;
import p337m.p338f0.p340d.C6262d;
import p337m.p338f0.p341e.C6273e.C6275b;
import p337m.p338f0.p345i.C6380h;

/* renamed from: m.f0.e.h */
public final class C6282h {

    /* renamed from: a */
    private final long f15542a;

    /* renamed from: b */
    private final C6261c f15543b;

    /* renamed from: c */
    private final C6284b f15544c;

    /* renamed from: d */
    private final ArrayDeque<C6277f> f15545d = new ArrayDeque<>();

    /* renamed from: e */
    private final int f15546e;

    /* renamed from: m.f0.e.h$a */
    public static final class C6283a {
        private C6283a() {
        }

        public /* synthetic */ C6283a(C5938g gVar) {
            this();
        }
    }

    /* renamed from: m.f0.e.h$b */
    public static final class C6284b extends C6259a {

        /* renamed from: e */
        final /* synthetic */ C6282h f15547e;

        C6284b(C6282h hVar, String str) {
            this.f15547e = hVar;
            super(str, false, 2, null);
        }

        /* renamed from: e */
        public long mo16112e() {
            return this.f15547e.mo16222a(System.nanoTime());
        }
    }

    static {
        new C6283a(null);
    }

    public C6282h(C6262d dVar, int i, long j, TimeUnit timeUnit) {
        C5942k.m22327b(dVar, "taskRunner");
        C5942k.m22327b(timeUnit, "timeUnit");
        this.f15546e = i;
        this.f15542a = timeUnit.toNanos(j);
        this.f15543b = dVar.mo16131c();
        StringBuilder sb = new StringBuilder();
        sb.append(C6250b.f15422h);
        sb.append(" ConnectionPool");
        this.f15544c = new C6284b(this, sb.toString());
        if (!(j > 0)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("keepAliveDuration <= 0: ");
            sb2.append(j);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
    }

    /* renamed from: a */
    private final int m23640a(C6277f fVar, long j) {
        List c = fVar.mo16210c();
        int i = 0;
        while (i < c.size()) {
            Reference reference = (Reference) c.get(i);
            if (reference.get() != null) {
                i++;
            } else if (reference != null) {
                C6275b bVar = (C6275b) reference;
                StringBuilder sb = new StringBuilder();
                sb.append("A connection to ");
                sb.append(fVar.mo16219l().mo16085a().mo16005k());
                sb.append(" was leaked. ");
                sb.append("Did you forget to close a response body?");
                C6380h.f15831c.mo16477a().mo16447a(sb.toString(), bVar.mo16194a());
                c.remove(i);
                fVar.mo16209b(true);
                if (c.isEmpty()) {
                    fVar.mo16200a(j - this.f15542a);
                    return 0;
                }
            } else {
                throw new C5809q("null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
            }
        }
        return c.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0068, code lost:
        if (r6 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        p337m.p338f0.C6250b.m23458a(r6.mo16220m());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0073, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0074, code lost:
        p308k.p323z.p325d.C5942k.m22323a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0077, code lost:
        throw null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo16222a(long r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.ArrayDeque<m.f0.e.f> r0 = r11.f15545d     // Catch:{ all -> 0x0078 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0078 }
            r1 = 0
            r2 = 0
            r3 = -9223372036854775808
            r6 = r1
            r4 = r3
            r3 = 0
        L_0x000e:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0078 }
            if (r7 == 0) goto L_0x0037
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0078 }
            m.f0.e.f r7 = (p337m.p338f0.p341e.C6277f) r7     // Catch:{ all -> 0x0078 }
            java.lang.String r8 = "connection"
            p308k.p323z.p325d.C5942k.m22324a(r7, r8)     // Catch:{ all -> 0x0078 }
            int r8 = r11.m23640a(r7, r12)     // Catch:{ all -> 0x0078 }
            if (r8 <= 0) goto L_0x0028
            int r3 = r3 + 1
            goto L_0x000e
        L_0x0028:
            int r2 = r2 + 1
            long r8 = r7.mo16211d()     // Catch:{ all -> 0x0078 }
            long r8 = r12 - r8
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x000e
            r6 = r7
            r4 = r8
            goto L_0x000e
        L_0x0037:
            long r12 = r11.f15542a     // Catch:{ all -> 0x0078 }
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0053
            int r12 = r11.f15546e     // Catch:{ all -> 0x0078 }
            if (r2 <= r12) goto L_0x0042
            goto L_0x0053
        L_0x0042:
            if (r2 <= 0) goto L_0x0049
            long r12 = r11.f15542a     // Catch:{ all -> 0x0078 }
            long r12 = r12 - r4
            monitor-exit(r11)
            return r12
        L_0x0049:
            if (r3 <= 0) goto L_0x004f
            long r12 = r11.f15542a     // Catch:{ all -> 0x0078 }
            monitor-exit(r11)
            return r12
        L_0x004f:
            r12 = -1
            monitor-exit(r11)
            return r12
        L_0x0053:
            java.util.ArrayDeque<m.f0.e.f> r12 = r11.f15545d     // Catch:{ all -> 0x0078 }
            r12.remove(r6)     // Catch:{ all -> 0x0078 }
            java.util.ArrayDeque<m.f0.e.f> r12 = r11.f15545d     // Catch:{ all -> 0x0078 }
            boolean r12 = r12.isEmpty()     // Catch:{ all -> 0x0078 }
            if (r12 == 0) goto L_0x0065
            m.f0.d.c r12 = r11.f15543b     // Catch:{ all -> 0x0078 }
            r12.mo16114a()     // Catch:{ all -> 0x0078 }
        L_0x0065:
            k.t r12 = p308k.C5812t.f14872a     // Catch:{ all -> 0x0078 }
            monitor-exit(r11)
            if (r6 == 0) goto L_0x0074
            java.net.Socket r12 = r6.mo16220m()
            p337m.p338f0.C6250b.m23458a(r12)
            r12 = 0
            return r12
        L_0x0074:
            p308k.p323z.p325d.C5942k.m22323a()
            throw r1
        L_0x0078:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p341e.C6282h.mo16222a(long):long");
    }

    /* renamed from: a */
    public final boolean mo16223a(C6224a aVar, C6273e eVar, List<C6243d0> list, boolean z) {
        C5942k.m22327b(aVar, "address");
        C5942k.m22327b(eVar, "call");
        if (!C6250b.f15421g || Thread.holdsLock(this)) {
            Iterator it = this.f15545d.iterator();
            while (it.hasNext()) {
                C6277f fVar = (C6277f) it.next();
                if ((!z || fVar.mo16216i()) && fVar.mo16205a(aVar, list)) {
                    C5942k.m22324a((Object) fVar, "connection");
                    eVar.mo16174a(fVar);
                    return true;
                }
            }
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public final boolean mo16224a(C6277f fVar) {
        C5942k.m22327b(fVar, "connection");
        if (C6250b.f15421g && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        } else if (fVar.mo16212e() || this.f15546e == 0) {
            this.f15545d.remove(fVar);
            if (this.f15545d.isEmpty()) {
                this.f15543b.mo16114a();
            }
            return true;
        } else {
            C6261c.m23503a(this.f15543b, this.f15544c, 0, 2, null);
            return false;
        }
    }

    /* renamed from: b */
    public final void mo16225b(C6277f fVar) {
        C5942k.m22327b(fVar, "connection");
        if (!C6250b.f15421g || Thread.holdsLock(this)) {
            this.f15545d.add(fVar);
            C6261c.m23503a(this.f15543b, this.f15544c, 0, 2, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }
}
