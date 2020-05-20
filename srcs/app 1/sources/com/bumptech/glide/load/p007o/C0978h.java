package com.bumptech.glide.load.p007o;

import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.C0836e;
import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0876l;
import com.bumptech.glide.load.C0877m;
import com.bumptech.glide.load.p005n.C0881d;
import com.bumptech.glide.load.p005n.C0883e;
import com.bumptech.glide.load.p007o.C0975f.C0976a;
import com.bumptech.glide.load.p007o.p009b0.C0940a;
import com.bumptech.glide.load.p013q.p014d.C1163n;
import com.bumptech.glide.p029t.C1305f;
import com.bumptech.glide.p029t.p030l.C1312a.C1318f;
import com.bumptech.glide.p029t.p030l.C1320b;
import com.bumptech.glide.p029t.p030l.C1321c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p071f.p097h.p107l.C3318e;

/* renamed from: com.bumptech.glide.load.o.h */
class C0978h<R> implements C0976a, Runnable, Comparable<C0978h<?>>, C1318f {

    /* renamed from: A */
    private Object f3580A;

    /* renamed from: B */
    private Thread f3581B;

    /* renamed from: C */
    private C0869g f3582C;

    /* renamed from: D */
    private C0869g f3583D;

    /* renamed from: E */
    private Object f3584E;

    /* renamed from: F */
    private C0856a f3585F;

    /* renamed from: G */
    private C0881d<?> f3586G;

    /* renamed from: H */
    private volatile C0975f f3587H;

    /* renamed from: I */
    private volatile boolean f3588I;

    /* renamed from: J */
    private volatile boolean f3589J;

    /* renamed from: f */
    private final C0977g<R> f3590f = new C0977g<>();

    /* renamed from: g */
    private final List<Throwable> f3591g = new ArrayList();

    /* renamed from: h */
    private final C1321c f3592h = C1321c.m6194b();

    /* renamed from: i */
    private final C0983e f3593i;

    /* renamed from: j */
    private final C3318e<C0978h<?>> f3594j;

    /* renamed from: k */
    private final C0982d<?> f3595k = new C0982d<>();

    /* renamed from: l */
    private final C0984f f3596l = new C0984f();

    /* renamed from: m */
    private C0836e f3597m;

    /* renamed from: n */
    private C0869g f3598n;

    /* renamed from: o */
    private C0838g f3599o;

    /* renamed from: p */
    private C1009n f3600p;

    /* renamed from: q */
    private int f3601q;

    /* renamed from: r */
    private int f3602r;

    /* renamed from: s */
    private C0989j f3603s;

    /* renamed from: t */
    private C0873i f3604t;

    /* renamed from: u */
    private C0980b<R> f3605u;

    /* renamed from: v */
    private int f3606v;

    /* renamed from: w */
    private C0986h f3607w;

    /* renamed from: x */
    private C0985g f3608x;

    /* renamed from: y */
    private long f3609y;

    /* renamed from: z */
    private boolean f3610z;

    /* renamed from: com.bumptech.glide.load.o.h$a */
    static /* synthetic */ class C0979a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3611a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3612b;

        /* renamed from: c */
        static final /* synthetic */ int[] f3613c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                com.bumptech.glide.load.c[] r0 = com.bumptech.glide.load.C0858c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3613c = r0
                r1 = 1
                com.bumptech.glide.load.c r2 = com.bumptech.glide.load.C0858c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3613c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.load.c r3 = com.bumptech.glide.load.C0858c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bumptech.glide.load.o.h$h[] r2 = com.bumptech.glide.load.p007o.C0978h.C0986h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f3612b = r2
                com.bumptech.glide.load.o.h$h r3 = com.bumptech.glide.load.p007o.C0978h.C0986h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f3612b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bumptech.glide.load.o.h$h r3 = com.bumptech.glide.load.p007o.C0978h.C0986h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f3612b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bumptech.glide.load.o.h$h r4 = com.bumptech.glide.load.p007o.C0978h.C0986h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f3612b     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bumptech.glide.load.o.h$h r4 = com.bumptech.glide.load.p007o.C0978h.C0986h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f3612b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bumptech.glide.load.o.h$h r4 = com.bumptech.glide.load.p007o.C0978h.C0986h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                com.bumptech.glide.load.o.h$g[] r3 = com.bumptech.glide.load.p007o.C0978h.C0985g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f3611a = r3
                com.bumptech.glide.load.o.h$g r4 = com.bumptech.glide.load.p007o.C0978h.C0985g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f3611a     // Catch:{ NoSuchFieldError -> 0x0074 }
                com.bumptech.glide.load.o.h$g r3 = com.bumptech.glide.load.p007o.C0978h.C0985g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f3611a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.bumptech.glide.load.o.h$g r1 = com.bumptech.glide.load.p007o.C0978h.C0985g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p007o.C0978h.C0979a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.o.h$b */
    interface C0980b<R> {
        /* renamed from: a */
        void mo4825a(C0978h<?> hVar);

        /* renamed from: a */
        void mo4826a(C1013q qVar);

        /* renamed from: a */
        void mo4827a(C1020v<R> vVar, C0856a aVar);
    }

    /* renamed from: com.bumptech.glide.load.o.h$c */
    private final class C0981c<Z> implements C0988a<Z> {

        /* renamed from: a */
        private final C0856a f3614a;

        C0981c(C0856a aVar) {
            this.f3614a = aVar;
        }

        /* renamed from: a */
        public C1020v<Z> mo4828a(C1020v<Z> vVar) {
            return C0978h.this.mo4819a(this.f3614a, vVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.h$d */
    private static class C0982d<Z> {

        /* renamed from: a */
        private C0869g f3616a;

        /* renamed from: b */
        private C0876l<Z> f3617b;

        /* renamed from: c */
        private C1018u<Z> f3618c;

        C0982d() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4829a() {
            this.f3616a = null;
            this.f3617b = null;
            this.f3618c = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <X> void mo4830a(C0869g gVar, C0876l<X> lVar, C1018u<X> uVar) {
            this.f3616a = gVar;
            this.f3617b = lVar;
            this.f3618c = uVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4831a(C0983e eVar, C0873i iVar) {
            C1320b.m6191a("DecodeJob.encode");
            try {
                eVar.mo4833a().mo4739a(this.f3616a, new C0974e(this.f3617b, this.f3618c, iVar));
            } finally {
                this.f3618c.mo4908a();
                C1320b.m6190a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4832b() {
            return this.f3618c != null;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.h$e */
    interface C0983e {
        /* renamed from: a */
        C0940a mo4833a();
    }

    /* renamed from: com.bumptech.glide.load.o.h$f */
    private static class C0984f {

        /* renamed from: a */
        private boolean f3619a;

        /* renamed from: b */
        private boolean f3620b;

        /* renamed from: c */
        private boolean f3621c;

        C0984f() {
        }

        /* renamed from: b */
        private boolean m4953b(boolean z) {
            return (this.f3621c || z || this.f3620b) && this.f3619a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized boolean mo4834a() {
            this.f3620b = true;
            return m4953b(false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized boolean mo4835a(boolean z) {
            this.f3619a = true;
            return m4953b(z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public synchronized boolean mo4836b() {
            this.f3621c = true;
            return m4953b(false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public synchronized void mo4837c() {
            this.f3620b = false;
            this.f3619a = false;
            this.f3621c = false;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.h$g */
    private enum C0985g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: com.bumptech.glide.load.o.h$h */
    private enum C0986h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    C0978h(C0983e eVar, C3318e<C0978h<?>> eVar2) {
        this.f3593i = eVar;
        this.f3594j = eVar2;
    }

    /* renamed from: a */
    private C0873i m4915a(C0856a aVar) {
        C0873i iVar = this.f3604t;
        if (VERSION.SDK_INT < 26) {
            return iVar;
        }
        boolean z = aVar == C0856a.RESOURCE_DISK_CACHE || this.f3590f.mo4816o();
        Boolean bool = (Boolean) iVar.mo4628a(C1163n.f3939i);
        if (bool != null && (!bool.booleanValue() || z)) {
            return iVar;
        }
        C0873i iVar2 = new C0873i();
        iVar2.mo4629a(this.f3604t);
        iVar2.mo4627a(C1163n.f3939i, Boolean.valueOf(z));
        return iVar2;
    }

    /* renamed from: a */
    private C0986h m4916a(C0986h hVar) {
        int i = C0979a.f3612b[hVar.ordinal()];
        if (i == 1) {
            return this.f3603s.mo4840a() ? C0986h.DATA_CACHE : m4916a(C0986h.DATA_CACHE);
        } else if (i == 2) {
            return this.f3610z ? C0986h.FINISHED : C0986h.SOURCE;
        } else if (i == 3 || i == 4) {
            return C0986h.FINISHED;
        } else {
            if (i == 5) {
                return this.f3603s.mo4843b() ? C0986h.RESOURCE_CACHE : m4916a(C0986h.RESOURCE_CACHE);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized stage: ");
            sb.append(hVar);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private <Data> C1020v<R> m4917a(C0881d<?> dVar, Data data, C0856a aVar) {
        if (data == null) {
            dVar.mo4567b();
            return null;
        }
        try {
            long a = C1305f.m6136a();
            C1020v<R> a2 = m4918a(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Decoded result ");
                sb.append(a2);
                m4921a(sb.toString(), a);
            }
            return a2;
        } finally {
            dVar.mo4567b();
        }
    }

    /* renamed from: a */
    private <Data> C1020v<R> m4918a(Data data, C0856a aVar) {
        return m4919a(data, aVar, this.f3590f.mo4795a(data.getClass()));
    }

    /* renamed from: a */
    private <Data, ResourceType> C1020v<R> m4919a(Data data, C0856a aVar, C1017t<Data, ResourceType, R> tVar) {
        C0873i a = m4915a(aVar);
        C0883e b = this.f3597m.mo4541f().mo4557b(data);
        try {
            return tVar.mo4906a(b, a, this.f3601q, this.f3602r, new C0981c(aVar));
        } finally {
            b.mo4648b();
        }
    }

    /* renamed from: a */
    private void m4920a(C1020v<R> vVar, C0856a aVar) {
        m4933s();
        this.f3605u.mo4827a(vVar, aVar);
    }

    /* renamed from: a */
    private void m4921a(String str, long j) {
        m4922a(str, j, (String) null);
    }

    /* renamed from: a */
    private void m4922a(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C1305f.m6135a(j));
        sb.append(", load key: ");
        sb.append(this.f3600p);
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", ");
            sb2.append(str2);
            str3 = sb2.toString();
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.bumptech.glide.load.o.v] */
    /* JADX WARNING: type inference failed for: r3v7, types: [com.bumptech.glide.load.o.u] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4923b(com.bumptech.glide.load.p007o.C1020v<R> r3, com.bumptech.glide.load.C0856a r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.bumptech.glide.load.p007o.C1015r
            if (r0 == 0) goto L_0x000a
            r0 = r3
            com.bumptech.glide.load.o.r r0 = (com.bumptech.glide.load.p007o.C1015r) r0
            r0.mo4902a()
        L_0x000a:
            r0 = 0
            com.bumptech.glide.load.o.h$d<?> r1 = r2.f3595k
            boolean r1 = r1.mo4832b()
            if (r1 == 0) goto L_0x0018
            com.bumptech.glide.load.o.u r3 = com.bumptech.glide.load.p007o.C1018u.m5063b(r3)
            r0 = r3
        L_0x0018:
            r2.m4920a(r3, r4)
            com.bumptech.glide.load.o.h$h r3 = com.bumptech.glide.load.p007o.C0978h.C0986h.ENCODE
            r2.f3607w = r3
            com.bumptech.glide.load.o.h$d<?> r3 = r2.f3595k     // Catch:{ all -> 0x0039 }
            boolean r3 = r3.mo4832b()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x0030
            com.bumptech.glide.load.o.h$d<?> r3 = r2.f3595k     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.load.o.h$e r4 = r2.f3593i     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.load.i r1 = r2.f3604t     // Catch:{ all -> 0x0039 }
            r3.mo4831a(r4, r1)     // Catch:{ all -> 0x0039 }
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.mo4908a()
        L_0x0035:
            r2.m4928n()
            return
        L_0x0039:
            r3 = move-exception
            if (r0 == 0) goto L_0x003f
            r0.mo4908a()
        L_0x003f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p007o.C0978h.m4923b(com.bumptech.glide.load.o.v, com.bumptech.glide.load.a):void");
    }

    /* renamed from: j */
    private void m4924j() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f3609y;
            StringBuilder sb = new StringBuilder();
            sb.append("data: ");
            sb.append(this.f3584E);
            sb.append(", cache key: ");
            sb.append(this.f3582C);
            sb.append(", fetcher: ");
            sb.append(this.f3586G);
            m4922a("Retrieved data", j, sb.toString());
        }
        C1020v vVar = null;
        try {
            vVar = m4917a(this.f3586G, (Data) this.f3584E, this.f3585F);
        } catch (C1013q e) {
            e.mo4889a(this.f3583D, this.f3585F);
            this.f3591g.add(e);
        }
        if (vVar != null) {
            m4923b(vVar, this.f3585F);
        } else {
            m4931q();
        }
    }

    /* renamed from: k */
    private int m4925k() {
        return this.f3599o.ordinal();
    }

    /* renamed from: l */
    private C0975f m4926l() {
        int i = C0979a.f3612b[this.f3607w.ordinal()];
        if (i == 1) {
            return new C1021w(this.f3590f, this);
        }
        if (i == 2) {
            return new C0962c(this.f3590f, this);
        }
        if (i == 3) {
            return new C1025z(this.f3590f, this);
        }
        if (i == 4) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized stage: ");
        sb.append(this.f3607w);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: m */
    private void m4927m() {
        m4933s();
        this.f3605u.mo4826a(new C1013q("Failed to load resource", (List<Throwable>) new ArrayList<Throwable>(this.f3591g)));
        m4929o();
    }

    /* renamed from: n */
    private void m4928n() {
        if (this.f3596l.mo4834a()) {
            m4930p();
        }
    }

    /* renamed from: o */
    private void m4929o() {
        if (this.f3596l.mo4836b()) {
            m4930p();
        }
    }

    /* renamed from: p */
    private void m4930p() {
        this.f3596l.mo4837c();
        this.f3595k.mo4829a();
        this.f3590f.mo4797a();
        this.f3588I = false;
        this.f3597m = null;
        this.f3598n = null;
        this.f3604t = null;
        this.f3599o = null;
        this.f3600p = null;
        this.f3605u = null;
        this.f3607w = null;
        this.f3587H = null;
        this.f3581B = null;
        this.f3582C = null;
        this.f3584E = null;
        this.f3585F = null;
        this.f3586G = null;
        this.f3609y = 0;
        this.f3589J = false;
        this.f3580A = null;
        this.f3591g.clear();
        this.f3594j.mo5388a(this);
    }

    /* renamed from: q */
    private void m4931q() {
        this.f3581B = Thread.currentThread();
        this.f3609y = C1305f.m6136a();
        boolean z = false;
        while (!this.f3589J && this.f3587H != null) {
            z = this.f3587H.mo4766a();
            if (z) {
                break;
            }
            this.f3607w = m4916a(this.f3607w);
            this.f3587H = m4926l();
            if (this.f3607w == C0986h.SOURCE) {
                mo4792f();
                return;
            }
        }
        if ((this.f3607w == C0986h.FINISHED || this.f3589J) && !z) {
            m4927m();
        }
    }

    /* renamed from: r */
    private void m4932r() {
        int i = C0979a.f3611a[this.f3608x.ordinal()];
        if (i == 1) {
            this.f3607w = m4916a(C0986h.INITIALIZE);
            this.f3587H = m4926l();
        } else if (i != 2) {
            if (i == 3) {
                m4924j();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized run reason: ");
            sb.append(this.f3608x);
            throw new IllegalStateException(sb.toString());
        }
        m4931q();
    }

    /* renamed from: s */
    private void m4933s() {
        Throwable th;
        this.f3592h.mo5389a();
        if (this.f3588I) {
            if (this.f3591g.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f3591g;
                th = (Throwable) list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f3588I = true;
    }

    /* renamed from: a */
    public int compareTo(C0978h<?> hVar) {
        int k = m4925k() - hVar.m4925k();
        return k == 0 ? this.f3606v - hVar.f3606v : k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0978h<R> mo4818a(C0836e eVar, Object obj, C1009n nVar, C0869g gVar, int i, int i2, Class<?> cls, Class<R> cls2, C0838g gVar2, C0989j jVar, Map<Class<?>, C0877m<?>> map, boolean z, boolean z2, boolean z3, C0873i iVar, C0980b<R> bVar, int i3) {
        this.f3590f.mo4798a(eVar, obj, gVar, i, i2, jVar, cls, cls2, gVar2, iVar, map, z, z2, this.f3593i);
        this.f3597m = eVar;
        this.f3598n = gVar;
        this.f3599o = gVar2;
        this.f3600p = nVar;
        this.f3601q = i;
        this.f3602r = i2;
        this.f3603s = jVar;
        this.f3610z = z3;
        this.f3604t = iVar;
        this.f3605u = bVar;
        this.f3606v = i3;
        this.f3608x = C0985g.INITIALIZE;
        this.f3580A = obj;
        return this;
    }

    /* JADX WARNING: type inference failed for: r12v5, types: [com.bumptech.glide.load.g] */
    /* JADX WARNING: type inference failed for: r12v6, types: [com.bumptech.glide.load.o.d] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> com.bumptech.glide.load.p007o.C1020v<Z> mo4819a(com.bumptech.glide.load.C0856a r12, com.bumptech.glide.load.p007o.C1020v<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.C0856a.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.bumptech.glide.load.o.g<R> r0 = r11.f3590f
            com.bumptech.glide.load.m r0 = r0.mo4800b(r8)
            com.bumptech.glide.e r2 = r11.f3597m
            int r3 = r11.f3601q
            int r4 = r11.f3602r
            com.bumptech.glide.load.o.v r2 = r0.mo4634a(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.mo4882d()
        L_0x002b:
            com.bumptech.glide.load.o.g<R> r13 = r11.f3590f
            boolean r13 = r13.mo4802b(r0)
            if (r13 == 0) goto L_0x0040
            com.bumptech.glide.load.o.g<R> r13 = r11.f3590f
            com.bumptech.glide.load.l r1 = r13.mo4794a(r0)
            com.bumptech.glide.load.i r13 = r11.f3604t
            com.bumptech.glide.load.c r13 = r1.mo4633a(r13)
            goto L_0x0042
        L_0x0040:
            com.bumptech.glide.load.c r13 = com.bumptech.glide.load.C0858c.NONE
        L_0x0042:
            r10 = r1
            com.bumptech.glide.load.o.g<R> r1 = r11.f3590f
            com.bumptech.glide.load.g r2 = r11.f3582C
            boolean r1 = r1.mo4799a(r2)
            r2 = 1
            r1 = r1 ^ r2
            com.bumptech.glide.load.o.j r3 = r11.f3603s
            boolean r12 = r3.mo4842a(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = com.bumptech.glide.load.p007o.C0978h.C0979a.f3613c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            com.bumptech.glide.load.o.x r12 = new com.bumptech.glide.load.o.x
            com.bumptech.glide.load.o.g<R> r13 = r11.f3590f
            com.bumptech.glide.load.o.a0.b r2 = r13.mo4801b()
            com.bumptech.glide.load.g r3 = r11.f3582C
            com.bumptech.glide.load.g r4 = r11.f3598n
            int r5 = r11.f3601q
            int r6 = r11.f3602r
            com.bumptech.glide.load.i r9 = r11.f3604t
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            com.bumptech.glide.load.o.d r12 = new com.bumptech.glide.load.o.d
            com.bumptech.glide.load.g r13 = r11.f3582C
            com.bumptech.glide.load.g r1 = r11.f3598n
            r12.<init>(r13, r1)
        L_0x009b:
            com.bumptech.glide.load.o.u r0 = com.bumptech.glide.load.p007o.C1018u.m5063b(r0)
            com.bumptech.glide.load.o.h$d<?> r13 = r11.f3595k
            r13.mo4830a(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.bumptech.glide.i$d r12 = new com.bumptech.glide.i$d
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p007o.C0978h.mo4819a(com.bumptech.glide.load.a, com.bumptech.glide.load.o.v):com.bumptech.glide.load.o.v");
    }

    /* renamed from: a */
    public void mo4790a(C0869g gVar, Exception exc, C0881d<?> dVar, C0856a aVar) {
        dVar.mo4567b();
        C1013q qVar = new C1013q("Fetching data failed", (Throwable) exc);
        qVar.mo4890a(gVar, aVar, dVar.mo4563a());
        this.f3591g.add(qVar);
        if (Thread.currentThread() != this.f3581B) {
            this.f3608x = C0985g.SWITCH_TO_SOURCE_SERVICE;
            this.f3605u.mo4825a(this);
            return;
        }
        m4931q();
    }

    /* renamed from: a */
    public void mo4791a(C0869g gVar, Object obj, C0881d<?> dVar, C0856a aVar, C0869g gVar2) {
        this.f3582C = gVar;
        this.f3584E = obj;
        this.f3586G = dVar;
        this.f3585F = aVar;
        this.f3583D = gVar2;
        if (Thread.currentThread() != this.f3581B) {
            this.f3608x = C0985g.DECODE_DATA;
            this.f3605u.mo4825a(this);
            return;
        }
        C1320b.m6191a("DecodeJob.decodeFromRetrievedData");
        try {
            m4924j();
        } finally {
            C1320b.m6190a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4820a(boolean z) {
        if (this.f3596l.mo4835a(z)) {
            m4930p();
        }
    }

    /* renamed from: f */
    public void mo4792f() {
        this.f3608x = C0985g.SWITCH_TO_SOURCE_SERVICE;
        this.f3605u.mo4825a(this);
    }

    /* renamed from: g */
    public C1321c mo4765g() {
        return this.f3592h;
    }

    /* renamed from: h */
    public void mo4822h() {
        this.f3589J = true;
        C0975f fVar = this.f3587H;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo4823i() {
        C0986h a = m4916a(C0986h.INITIALIZE);
        return a == C0986h.RESOURCE_CACHE || a == C0986h.DATA_CACHE;
    }

    public void run() {
        String str = "DecodeJob";
        C1320b.m6192a("DecodeJob#run(model=%s)", this.f3580A);
        C0881d<?> dVar = this.f3586G;
        try {
            if (this.f3589J) {
                m4927m();
                if (dVar != null) {
                    dVar.mo4567b();
                }
                C1320b.m6190a();
                return;
            }
            m4932r();
            if (dVar != null) {
                dVar.mo4567b();
            }
            C1320b.m6190a();
        } catch (C0939b e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo4567b();
            }
            C1320b.m6190a();
            throw th;
        }
    }
}
