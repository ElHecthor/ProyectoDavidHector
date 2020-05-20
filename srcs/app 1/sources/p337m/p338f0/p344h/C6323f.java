package p337m.p338f0.p344h;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5948q;
import p308k.p323z.p325d.C5949r;
import p337m.p338f0.C6250b;
import p337m.p338f0.p340d.C6259a;
import p337m.p338f0.p340d.C6261c;
import p337m.p338f0.p340d.C6262d;
import p337m.p338f0.p344h.C6344h.C6347c;
import p337m.p338f0.p345i.C6380h;
import p350n.C6480e;
import p350n.C6483f;
import p350n.C6484g;
import p350n.C6485h;

/* renamed from: m.f0.h.f */
public final class C6323f implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: H */
    public static final C6360m f15657H;

    /* renamed from: I */
    public static final C6326c f15658I = new C6326c(null);

    /* renamed from: A */
    private long f15659A;

    /* renamed from: B */
    private long f15660B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public long f15661C;

    /* renamed from: D */
    private final Socket f15662D;

    /* renamed from: E */
    private final C6353j f15663E;

    /* renamed from: F */
    private final C6330e f15664F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final Set<Integer> f15665G;

    /* renamed from: f */
    private final boolean f15666f;

    /* renamed from: g */
    private final C6327d f15667g;

    /* renamed from: h */
    private final Map<Integer, C6348i> f15668h = new LinkedHashMap();

    /* renamed from: i */
    private final String f15669i;

    /* renamed from: j */
    private int f15670j;

    /* renamed from: k */
    private int f15671k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f15672l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C6262d f15673m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C6261c f15674n;

    /* renamed from: o */
    private final C6261c f15675o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C6261c f15676p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C6357l f15677q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public long f15678r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public long f15679s;

    /* renamed from: t */
    private long f15680t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public long f15681u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public long f15682v;

    /* renamed from: w */
    private long f15683w;

    /* renamed from: x */
    private final C6360m f15684x;

    /* renamed from: y */
    private C6360m f15685y;

    /* renamed from: z */
    private long f15686z;

    /* renamed from: m.f0.h.f$a */
    public static final class C6324a extends C6259a {

        /* renamed from: e */
        final /* synthetic */ C6323f f15687e;

        /* renamed from: f */
        final /* synthetic */ long f15688f;

        public C6324a(String str, String str2, C6323f fVar, long j) {
            this.f15687e = fVar;
            this.f15688f = j;
            super(str2, false, 2, null);
        }

        /* renamed from: e */
        public long mo16112e() {
            boolean z;
            synchronized (this.f15687e) {
                if (this.f15687e.f15679s < this.f15687e.f15678r) {
                    z = true;
                } else {
                    C6323f fVar = this.f15687e;
                    fVar.f15678r = fVar.f15678r + 1;
                    z = false;
                }
            }
            C6323f fVar2 = this.f15687e;
            if (z) {
                fVar2.m23787a((IOException) null);
                return -1;
            }
            fVar2.mo16306a(false, 1, 0);
            return this.f15688f;
        }
    }

    /* renamed from: m.f0.h.f$b */
    public static final class C6325b {

        /* renamed from: a */
        public Socket f15689a;

        /* renamed from: b */
        public String f15690b;

        /* renamed from: c */
        public C6484g f15691c;

        /* renamed from: d */
        public C6483f f15692d;

        /* renamed from: e */
        private C6327d f15693e = C6327d.f15698a;

        /* renamed from: f */
        private C6357l f15694f = C6357l.f15794a;

        /* renamed from: g */
        private int f15695g;

        /* renamed from: h */
        private boolean f15696h;

        /* renamed from: i */
        private final C6262d f15697i;

        public C6325b(boolean z, C6262d dVar) {
            C5942k.m22327b(dVar, "taskRunner");
            this.f15696h = z;
            this.f15697i = dVar;
        }

        /* renamed from: a */
        public final C6325b mo16327a(int i) {
            this.f15695g = i;
            return this;
        }

        /* renamed from: a */
        public final C6325b mo16328a(Socket socket, String str, C6484g gVar, C6483f fVar) {
            StringBuilder sb;
            C5942k.m22327b(socket, "socket");
            C5942k.m22327b(str, "peerName");
            C5942k.m22327b(gVar, "source");
            C5942k.m22327b(fVar, "sink");
            this.f15689a = socket;
            if (this.f15696h) {
                sb = new StringBuilder();
                sb.append(C6250b.f15422h);
                sb.append(' ');
            } else {
                sb = new StringBuilder();
                sb.append("MockWebServer ");
            }
            sb.append(str);
            this.f15690b = sb.toString();
            this.f15691c = gVar;
            this.f15692d = fVar;
            return this;
        }

        /* renamed from: a */
        public final C6325b mo16329a(C6327d dVar) {
            C5942k.m22327b(dVar, "listener");
            this.f15693e = dVar;
            return this;
        }

        /* renamed from: a */
        public final C6323f mo16330a() {
            return new C6323f(this);
        }

        /* renamed from: b */
        public final boolean mo16331b() {
            return this.f15696h;
        }

        /* renamed from: c */
        public final String mo16332c() {
            String str = this.f15690b;
            if (str != null) {
                return str;
            }
            C5942k.m22329c("connectionName");
            throw null;
        }

        /* renamed from: d */
        public final C6327d mo16333d() {
            return this.f15693e;
        }

        /* renamed from: e */
        public final int mo16334e() {
            return this.f15695g;
        }

        /* renamed from: f */
        public final C6357l mo16335f() {
            return this.f15694f;
        }

        /* renamed from: g */
        public final C6483f mo16336g() {
            C6483f fVar = this.f15692d;
            if (fVar != null) {
                return fVar;
            }
            C5942k.m22329c("sink");
            throw null;
        }

        /* renamed from: h */
        public final Socket mo16337h() {
            Socket socket = this.f15689a;
            if (socket != null) {
                return socket;
            }
            C5942k.m22329c("socket");
            throw null;
        }

        /* renamed from: i */
        public final C6484g mo16338i() {
            C6484g gVar = this.f15691c;
            if (gVar != null) {
                return gVar;
            }
            C5942k.m22329c("source");
            throw null;
        }

        /* renamed from: j */
        public final C6262d mo16339j() {
            return this.f15697i;
        }
    }

    /* renamed from: m.f0.h.f$c */
    public static final class C6326c {
        private C6326c() {
        }

        public /* synthetic */ C6326c(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6360m mo16340a() {
            return C6323f.f15657H;
        }
    }

    /* renamed from: m.f0.h.f$d */
    public static abstract class C6327d {

        /* renamed from: a */
        public static final C6327d f15698a = new C6328a();

        /* renamed from: m.f0.h.f$d$a */
        public static final class C6328a extends C6327d {
            C6328a() {
            }

            /* renamed from: a */
            public void mo16203a(C6348i iVar) {
                C5942k.m22327b(iVar, "stream");
                iVar.mo16369a(C6315b.REFUSED_STREAM, (IOException) null);
            }
        }

        /* renamed from: m.f0.h.f$d$b */
        public static final class C6329b {
            private C6329b() {
            }

            public /* synthetic */ C6329b(C5938g gVar) {
                this();
            }
        }

        static {
            new C6329b(null);
        }

        /* renamed from: a */
        public void mo16202a(C6323f fVar, C6360m mVar) {
            C5942k.m22327b(fVar, "connection");
            C5942k.m22327b(mVar, "settings");
        }

        /* renamed from: a */
        public abstract void mo16203a(C6348i iVar);
    }

    /* renamed from: m.f0.h.f$e */
    public final class C6330e implements Runnable, C6347c {

        /* renamed from: f */
        private final C6344h f15699f;

        /* renamed from: g */
        final /* synthetic */ C6323f f15700g;

        /* renamed from: m.f0.h.f$e$a */
        public static final class C6331a extends C6259a {

            /* renamed from: e */
            final /* synthetic */ C6330e f15701e;

            /* renamed from: f */
            final /* synthetic */ C5949r f15702f;

            public C6331a(String str, boolean z, String str2, boolean z2, C6330e eVar, boolean z3, C5949r rVar, C6360m mVar, C5948q qVar, C5949r rVar2) {
                this.f15701e = eVar;
                this.f15702f = rVar;
                super(str2, z2);
            }

            /* renamed from: e */
            public long mo16112e() {
                this.f15701e.f15700g.mo16318g().mo16202a(this.f15701e.f15700g, (C6360m) this.f15702f.f14947f);
                return -1;
            }
        }

        /* renamed from: m.f0.h.f$e$b */
        public static final class C6332b extends C6259a {

            /* renamed from: e */
            final /* synthetic */ C6348i f15703e;

            /* renamed from: f */
            final /* synthetic */ C6330e f15704f;

            public C6332b(String str, boolean z, String str2, boolean z2, C6348i iVar, C6330e eVar, C6348i iVar2, int i, List list, boolean z3) {
                this.f15703e = iVar;
                this.f15704f = eVar;
                super(str2, z2);
            }

            /* renamed from: e */
            public long mo16112e() {
                try {
                    this.f15704f.f15700g.mo16318g().mo16203a(this.f15703e);
                } catch (IOException e) {
                    C6380h a = C6380h.f15831c.mo16477a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Http2Connection.Listener failure for ");
                    sb.append(this.f15704f.f15700g.mo16313d());
                    a.mo16440a(sb.toString(), 4, (Throwable) e);
                    try {
                        this.f15703e.mo16369a(C6315b.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
                return -1;
            }
        }

        /* renamed from: m.f0.h.f$e$c */
        public static final class C6333c extends C6259a {

            /* renamed from: e */
            final /* synthetic */ C6330e f15705e;

            /* renamed from: f */
            final /* synthetic */ int f15706f;

            /* renamed from: g */
            final /* synthetic */ int f15707g;

            public C6333c(String str, boolean z, String str2, boolean z2, C6330e eVar, int i, int i2) {
                this.f15705e = eVar;
                this.f15706f = i;
                this.f15707g = i2;
                super(str2, z2);
            }

            /* renamed from: e */
            public long mo16112e() {
                this.f15705e.f15700g.mo16306a(true, this.f15706f, this.f15707g);
                return -1;
            }
        }

        /* renamed from: m.f0.h.f$e$d */
        public static final class C6334d extends C6259a {

            /* renamed from: e */
            final /* synthetic */ C6330e f15708e;

            /* renamed from: f */
            final /* synthetic */ boolean f15709f;

            /* renamed from: g */
            final /* synthetic */ C6360m f15710g;

            public C6334d(String str, boolean z, String str2, boolean z2, C6330e eVar, boolean z3, C6360m mVar) {
                this.f15708e = eVar;
                this.f15709f = z3;
                this.f15710g = mVar;
                super(str2, z2);
            }

            /* renamed from: e */
            public long mo16112e() {
                this.f15708e.mo16351b(this.f15709f, this.f15710g);
                return -1;
            }
        }

        public C6330e(C6323f fVar, C6344h hVar) {
            C5942k.m22327b(hVar, "reader");
            this.f15700g = fVar;
            this.f15699f = hVar;
        }

        /* renamed from: a */
        public void mo16341a() {
        }

        /* renamed from: a */
        public void mo16342a(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: a */
        public void mo16343a(int i, int i2, List<C6317c> list) {
            C5942k.m22327b(list, "requestHeaders");
            this.f15700g.mo16296a(i2, list);
        }

        /* renamed from: a */
        public void mo16344a(int i, long j) {
            Object obj;
            if (i == 0) {
                Object obj2 = this.f15700g;
                synchronized (obj2) {
                    C6323f fVar = this.f15700g;
                    fVar.f15661C = fVar.mo16324o() + j;
                    C6323f fVar2 = this.f15700g;
                    if (fVar2 != null) {
                        fVar2.notifyAll();
                        C5812t tVar = C5812t.f14872a;
                        obj = obj2;
                    } else {
                        throw new C5809q("null cannot be cast to non-null type java.lang.Object");
                    }
                }
            } else {
                C6348i a = this.f15700g.mo16293a(i);
                if (a != 0) {
                    synchronized (a) {
                        a.mo16367a(j);
                        C5812t tVar2 = C5812t.f14872a;
                        obj = a;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public void mo16345a(int i, C6315b bVar) {
            C5942k.m22327b(bVar, "errorCode");
            if (this.f15700g.mo16309b(i)) {
                this.f15700g.mo16298a(i, bVar);
                return;
            }
            C6348i c = this.f15700g.mo16310c(i);
            if (c != null) {
                c.mo16374b(bVar);
            }
        }

        /* renamed from: a */
        public void mo16346a(int i, C6315b bVar, C6485h hVar) {
            int i2;
            C6348i[] iVarArr;
            C5942k.m22327b(bVar, "errorCode");
            C5942k.m22327b(hVar, "debugData");
            int p = hVar.mo16868p();
            synchronized (this.f15700g) {
                Object[] array = this.f15700g.mo16323m().values().toArray(new C6348i[0]);
                if (array != null) {
                    iVarArr = (C6348i[]) array;
                    this.f15700g.f15672l = true;
                    C5812t tVar = C5812t.f14872a;
                } else {
                    throw new C5809q("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (C6348i iVar : iVarArr) {
                if (iVar.mo16380f() > i && iVar.mo16390p()) {
                    iVar.mo16374b(C6315b.REFUSED_STREAM);
                    this.f15700g.mo16310c(iVar.mo16380f());
                }
            }
        }

        /* renamed from: a */
        public void mo16347a(boolean z, int i, int i2) {
            if (z) {
                synchronized (this.f15700g) {
                    if (i == 1) {
                        C6323f fVar = this.f15700g;
                        fVar.f15679s = fVar.f15679s + 1;
                    } else if (i != 2) {
                        if (i == 3) {
                            C6323f fVar2 = this.f15700g;
                            fVar2.f15682v = fVar2.f15682v + 1;
                            C6323f fVar3 = this.f15700g;
                            if (fVar3 != null) {
                                fVar3.notifyAll();
                            } else {
                                throw new C5809q("null cannot be cast to non-null type java.lang.Object");
                            }
                        }
                        C5812t tVar = C5812t.f14872a;
                    } else {
                        C6323f fVar4 = this.f15700g;
                        fVar4.f15681u = fVar4.f15681u + 1;
                    }
                }
                return;
            }
            C6261c i3 = this.f15700g.f15674n;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f15700g.mo16313d());
            sb.append(" ping");
            String sb2 = sb.toString();
            C6333c cVar = new C6333c(sb2, true, sb2, true, this, i, i2);
            i3.mo16116a(cVar, 0);
        }

        /* renamed from: a */
        public void mo16348a(boolean z, int i, int i2, List<C6317c> list) {
            boolean z2 = z;
            int i3 = i;
            List<C6317c> list2 = list;
            C5942k.m22327b(list2, "headerBlock");
            if (this.f15700g.mo16309b(i3)) {
                this.f15700g.mo16297a(i3, list2, z2);
                return;
            }
            synchronized (this.f15700g) {
                C6348i a = this.f15700g.mo16293a(i3);
                if (a != null) {
                    C5812t tVar = C5812t.f14872a;
                    a.mo16370a(C6250b.m23455a(list), z2);
                } else if (!this.f15700g.f15672l) {
                    if (i3 > this.f15700g.mo16316f()) {
                        if (i3 % 2 != this.f15700g.mo16320h() % 2) {
                            int i4 = i;
                            C6348i iVar = new C6348i(i4, this.f15700g, false, z, C6250b.m23455a(list));
                            this.f15700g.mo16314d(i3);
                            this.f15700g.mo16323m().put(Integer.valueOf(i), iVar);
                            C6261c c = this.f15700g.f15673m.mo16131c();
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.f15700g.mo16313d());
                            sb.append('[');
                            sb.append(i3);
                            sb.append("] onStream");
                            String sb2 = sb.toString();
                            C6332b bVar = new C6332b(sb2, true, sb2, true, iVar, this, a, i, list, z);
                            c.mo16116a(bVar, 0);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo16349a(boolean z, int i, C6484g gVar, int i2) {
            C5942k.m22327b(gVar, "source");
            if (this.f15700g.mo16309b(i)) {
                this.f15700g.mo16299a(i, gVar, i2, z);
                return;
            }
            C6348i a = this.f15700g.mo16293a(i);
            if (a == null) {
                this.f15700g.mo16311c(i, C6315b.PROTOCOL_ERROR);
                long j = (long) i2;
                this.f15700g.mo16319g(j);
                gVar.skip(j);
                return;
            }
            a.mo16371a(gVar, i2);
            if (z) {
                a.mo16370a(C6250b.f15416b, true);
            }
        }

        /* renamed from: a */
        public void mo16350a(boolean z, C6360m mVar) {
            C5942k.m22327b(mVar, "settings");
            C6261c i = this.f15700g.f15674n;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f15700g.mo16313d());
            sb.append(" applyAndAckSettings");
            String sb2 = sb.toString();
            C6334d dVar = new C6334d(sb2, true, sb2, true, this, z, mVar);
            i.mo16116a(dVar, 0);
        }

        /* renamed from: b */
        public final void mo16351b(boolean z, C6360m mVar) {
            C6323f fVar;
            Object obj;
            C6360m mVar2 = mVar;
            C5942k.m22327b(mVar2, "settings");
            C5948q qVar = new C5948q();
            C5949r rVar = new C5949r();
            C5949r rVar2 = new C5949r();
            synchronized (this.f15700g.mo16325p()) {
                C6323f fVar2 = this.f15700g;
                synchronized (fVar2) {
                    try {
                        C6360m l = this.f15700g.mo16322l();
                        if (z) {
                            rVar2.f14947f = mVar2;
                        } else {
                            T mVar3 = new C6360m();
                            mVar3.mo16433a(l);
                            mVar3.mo16433a(mVar2);
                            rVar2.f14947f = mVar3;
                        }
                        long b = ((long) ((C6360m) rVar2.f14947f).mo16434b()) - ((long) l.mo16434b());
                        qVar.f14946f = b;
                        if (b != 0) {
                            if (!this.f15700g.mo16323m().isEmpty()) {
                                Object[] array = this.f15700g.mo16323m().values().toArray(new C6348i[0]);
                                if (array != null) {
                                    obj = (C6348i[]) array;
                                    rVar.f14947f = obj;
                                    this.f15700g.mo16304a((C6360m) rVar2.f14947f);
                                    C6261c g = this.f15700g.f15676p;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(this.f15700g.mo16313d());
                                    sb.append(" onSettings");
                                    String sb2 = sb.toString();
                                    r1 = r1;
                                    C6331a aVar = r1;
                                    C6261c cVar = g;
                                    fVar = fVar2;
                                    C6331a aVar2 = new C6331a(sb2, true, sb2, true, this, z, rVar2, mVar, qVar, rVar);
                                    cVar.mo16116a(aVar, 0);
                                    C5812t tVar = C5812t.f14872a;
                                    this.f15700g.mo16325p().mo16412a((C6360m) rVar2.f14947f);
                                    C5812t tVar2 = C5812t.f14872a;
                                } else {
                                    throw new C5809q("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            }
                        }
                        obj = null;
                        rVar.f14947f = obj;
                        this.f15700g.mo16304a((C6360m) rVar2.f14947f);
                        C6261c g2 = this.f15700g.f15676p;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(this.f15700g.mo16313d());
                        sb3.append(" onSettings");
                        String sb22 = sb3.toString();
                        aVar2 = aVar2;
                        C6331a aVar3 = aVar2;
                        C6261c cVar2 = g2;
                        fVar = fVar2;
                        try {
                            C6331a aVar22 = new C6331a(sb22, true, sb22, true, this, z, rVar2, mVar, qVar, rVar);
                            cVar2.mo16116a(aVar3, 0);
                            C5812t tVar3 = C5812t.f14872a;
                            try {
                                this.f15700g.mo16325p().mo16412a((C6360m) rVar2.f14947f);
                            } catch (IOException e) {
                                this.f15700g.m23787a(e);
                            }
                            C5812t tVar22 = C5812t.f14872a;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fVar = fVar2;
                        throw th;
                    }
                }
            }
            T t = rVar.f14947f;
            if (((C6348i[]) t) != null) {
                C6348i[] iVarArr = (C6348i[]) t;
                if (iVarArr != null) {
                    for (C6348i iVar : iVarArr) {
                        synchronized (iVar) {
                            iVar.mo16367a(qVar.f14946f);
                            C5812t tVar4 = C5812t.f14872a;
                        }
                    }
                    return;
                }
                C5942k.m22323a();
                throw null;
            }
        }

        public void run() {
            C6315b bVar;
            C6315b bVar2;
            C6315b bVar3 = C6315b.INTERNAL_ERROR;
            e = null;
            try {
                this.f15699f.mo16355a(this);
                while (this.f15699f.mo16356a(false, (C6347c) this)) {
                }
                bVar = C6315b.NO_ERROR;
                try {
                    bVar2 = C6315b.CANCEL;
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                e = e2;
                bVar = bVar3;
                try {
                    bVar = C6315b.PROTOCOL_ERROR;
                    bVar2 = C6315b.PROTOCOL_ERROR;
                    this.f15700g.mo16303a(bVar, bVar2, e);
                    C6250b.m23457a((Closeable) this.f15699f);
                } catch (Throwable th) {
                    th = th;
                    this.f15700g.mo16303a(bVar, bVar3, e);
                    C6250b.m23457a((Closeable) this.f15699f);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar3;
                this.f15700g.mo16303a(bVar, bVar3, e);
                C6250b.m23457a((Closeable) this.f15699f);
                throw th;
            }
            this.f15700g.mo16303a(bVar, bVar2, e);
            C6250b.m23457a((Closeable) this.f15699f);
        }
    }

    /* renamed from: m.f0.h.f$f */
    public static final class C6335f extends C6259a {

        /* renamed from: e */
        final /* synthetic */ C6323f f15711e;

        /* renamed from: f */
        final /* synthetic */ int f15712f;

        /* renamed from: g */
        final /* synthetic */ C6480e f15713g;

        /* renamed from: h */
        final /* synthetic */ int f15714h;

        /* renamed from: i */
        final /* synthetic */ boolean f15715i;

        public C6335f(String str, boolean z, String str2, boolean z2, C6323f fVar, int i, C6480e eVar, int i2, boolean z3) {
            this.f15711e = fVar;
            this.f15712f = i;
            this.f15713g = eVar;
            this.f15714h = i2;
            this.f15715i = z3;
            super(str2, z2);
        }

        /* renamed from: e */
        public long mo16112e() {
            try {
                boolean a = this.f15711e.f15677q.mo16429a(this.f15712f, this.f15713g, this.f15714h, this.f15715i);
                if (a) {
                    this.f15711e.mo16325p().mo16410a(this.f15712f, C6315b.CANCEL);
                }
                if (a || this.f15715i) {
                    synchronized (this.f15711e) {
                        this.f15711e.f15665G.remove(Integer.valueOf(this.f15712f));
                    }
                }
            } catch (IOException unused) {
            }
            return -1;
        }
    }

    /* renamed from: m.f0.h.f$g */
    public static final class C6336g extends C6259a {

        /* renamed from: e */
        final /* synthetic */ C6323f f15716e;

        /* renamed from: f */
        final /* synthetic */ int f15717f;

        /* renamed from: g */
        final /* synthetic */ List f15718g;

        /* renamed from: h */
        final /* synthetic */ boolean f15719h;

        public C6336g(String str, boolean z, String str2, boolean z2, C6323f fVar, int i, List list, boolean z3) {
            this.f15716e = fVar;
            this.f15717f = i;
            this.f15718g = list;
            this.f15719h = z3;
            super(str2, z2);
        }

        /* renamed from: e */
        public long mo16112e() {
            boolean a = this.f15716e.f15677q.mo16428a(this.f15717f, this.f15718g, this.f15719h);
            if (a) {
                try {
                    this.f15716e.mo16325p().mo16410a(this.f15717f, C6315b.CANCEL);
                } catch (IOException unused) {
                }
            }
            if (a || this.f15719h) {
                synchronized (this.f15716e) {
                    this.f15716e.f15665G.remove(Integer.valueOf(this.f15717f));
                }
            }
            return -1;
        }
    }

    /* renamed from: m.f0.h.f$h */
    public static final class C6337h extends C6259a {

        /* renamed from: e */
        final /* synthetic */ C6323f f15720e;

        /* renamed from: f */
        final /* synthetic */ int f15721f;

        /* renamed from: g */
        final /* synthetic */ List f15722g;

        public C6337h(String str, boolean z, String str2, boolean z2, C6323f fVar, int i, List list) {
            this.f15720e = fVar;
            this.f15721f = i;
            this.f15722g = list;
            super(str2, z2);
        }

        /* renamed from: e */
        public long mo16112e() {
            if (this.f15720e.f15677q.mo16427a(this.f15721f, this.f15722g)) {
                try {
                    this.f15720e.mo16325p().mo16410a(this.f15721f, C6315b.CANCEL);
                    synchronized (this.f15720e) {
                        this.f15720e.f15665G.remove(Integer.valueOf(this.f15721f));
                    }
                } catch (IOException unused) {
                }
            }
            return -1;
        }
    }

    /* renamed from: m.f0.h.f$i */
    public static final class C6338i extends C6259a {

        /* renamed from: e */
        final /* synthetic */ C6323f f15723e;

        /* renamed from: f */
        final /* synthetic */ int f15724f;

        /* renamed from: g */
        final /* synthetic */ C6315b f15725g;

        public C6338i(String str, boolean z, String str2, boolean z2, C6323f fVar, int i, C6315b bVar) {
            this.f15723e = fVar;
            this.f15724f = i;
            this.f15725g = bVar;
            super(str2, z2);
        }

        /* renamed from: e */
        public long mo16112e() {
            this.f15723e.f15677q.mo16426a(this.f15724f, this.f15725g);
            synchronized (this.f15723e) {
                this.f15723e.f15665G.remove(Integer.valueOf(this.f15724f));
            }
            return -1;
        }
    }

    /* renamed from: m.f0.h.f$j */
    public static final class C6339j extends C6259a {

        /* renamed from: e */
        final /* synthetic */ C6323f f15726e;

        public C6339j(String str, boolean z, String str2, boolean z2, C6323f fVar) {
            this.f15726e = fVar;
            super(str2, z2);
        }

        /* renamed from: e */
        public long mo16112e() {
            this.f15726e.mo16306a(false, 2, 0);
            return -1;
        }
    }

    /* renamed from: m.f0.h.f$k */
    public static final class C6340k extends C6259a {

        /* renamed from: e */
        final /* synthetic */ C6323f f15727e;

        /* renamed from: f */
        final /* synthetic */ int f15728f;

        /* renamed from: g */
        final /* synthetic */ C6315b f15729g;

        public C6340k(String str, boolean z, String str2, boolean z2, C6323f fVar, int i, C6315b bVar) {
            this.f15727e = fVar;
            this.f15728f = i;
            this.f15729g = bVar;
            super(str2, z2);
        }

        /* renamed from: e */
        public long mo16112e() {
            try {
                this.f15727e.mo16308b(this.f15728f, this.f15729g);
            } catch (IOException e) {
                this.f15727e.m23787a(e);
            }
            return -1;
        }
    }

    /* renamed from: m.f0.h.f$l */
    public static final class C6341l extends C6259a {

        /* renamed from: e */
        final /* synthetic */ C6323f f15730e;

        /* renamed from: f */
        final /* synthetic */ int f15731f;

        /* renamed from: g */
        final /* synthetic */ long f15732g;

        public C6341l(String str, boolean z, String str2, boolean z2, C6323f fVar, int i, long j) {
            this.f15730e = fVar;
            this.f15731f = i;
            this.f15732g = j;
            super(str2, z2);
        }

        /* renamed from: e */
        public long mo16112e() {
            try {
                this.f15730e.mo16325p().mo16409a(this.f15731f, this.f15732g);
            } catch (IOException e) {
                this.f15730e.m23787a(e);
            }
            return -1;
        }
    }

    static {
        C6360m mVar = new C6360m();
        mVar.mo16432a(7, 65535);
        mVar.mo16432a(5, 16384);
        f15657H = mVar;
    }

    public C6323f(C6325b bVar) {
        C5942k.m22327b(bVar, "builder");
        this.f15666f = bVar.mo16331b();
        this.f15667g = bVar.mo16333d();
        this.f15669i = bVar.mo16332c();
        this.f15671k = bVar.mo16331b() ? 3 : 2;
        C6262d j = bVar.mo16339j();
        this.f15673m = j;
        this.f15674n = j.mo16131c();
        this.f15675o = this.f15673m.mo16131c();
        this.f15676p = this.f15673m.mo16131c();
        this.f15677q = bVar.mo16335f();
        C6360m mVar = new C6360m();
        if (bVar.mo16331b()) {
            mVar.mo16432a(7, 16777216);
        }
        this.f15684x = mVar;
        C6360m mVar2 = f15657H;
        this.f15685y = mVar2;
        this.f15661C = (long) mVar2.mo16434b();
        this.f15662D = bVar.mo16337h();
        this.f15663E = new C6353j(bVar.mo16336g(), this.f15666f);
        this.f15664F = new C6330e(this, new C6344h(bVar.mo16338i(), this.f15666f));
        this.f15665G = new LinkedHashSet();
        if (bVar.mo16334e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) bVar.mo16334e());
            C6261c cVar = this.f15674n;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f15669i);
            sb.append(" ping");
            String sb2 = sb.toString();
            C6324a aVar = new C6324a(sb2, sb2, this, nanos);
            cVar.mo16116a(aVar, nanos);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23787a(IOException iOException) {
        C6315b bVar = C6315b.PROTOCOL_ERROR;
        mo16303a(bVar, bVar, iOException);
    }

    /* renamed from: a */
    public static /* synthetic */ void m23791a(C6323f fVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        fVar.mo16305a(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p337m.p338f0.p344h.C6348i m23793b(int r11, java.util.List<p337m.p338f0.p344h.C6317c> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            m.f0.h.j r7 = r10.f15663E
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0088 }
            int r0 = r10.f15671k     // Catch:{ all -> 0x0085 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            m.f0.h.b r0 = p337m.p338f0.p344h.C6315b.REFUSED_STREAM     // Catch:{ all -> 0x0085 }
            r10.mo16302a(r0)     // Catch:{ all -> 0x0085 }
        L_0x0013:
            boolean r0 = r10.f15672l     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x007f
            int r8 = r10.f15671k     // Catch:{ all -> 0x0085 }
            int r0 = r10.f15671k     // Catch:{ all -> 0x0085 }
            int r0 = r0 + 2
            r10.f15671k = r0     // Catch:{ all -> 0x0085 }
            m.f0.h.i r9 = new m.f0.h.i     // Catch:{ all -> 0x0085 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0085 }
            r0 = 1
            if (r13 == 0) goto L_0x0043
            long r1 = r10.f15660B     // Catch:{ all -> 0x0085 }
            long r3 = r10.f15661C     // Catch:{ all -> 0x0085 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0043
            long r1 = r9.mo16388n()     // Catch:{ all -> 0x0085 }
            long r3 = r9.mo16387m()     // Catch:{ all -> 0x0085 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r13 = 0
            goto L_0x0044
        L_0x0043:
            r13 = 1
        L_0x0044:
            boolean r1 = r9.mo16391q()     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0053
            java.util.Map<java.lang.Integer, m.f0.h.i> r1 = r10.f15668h     // Catch:{ all -> 0x0085 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0085 }
            r1.put(r2, r9)     // Catch:{ all -> 0x0085 }
        L_0x0053:
            k.t r1 = p308k.C5812t.f14872a     // Catch:{ all -> 0x0085 }
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            if (r11 != 0) goto L_0x005e
            m.f0.h.j r11 = r10.f15663E     // Catch:{ all -> 0x0088 }
            r11.mo16414a(r6, r8, r12)     // Catch:{ all -> 0x0088 }
            goto L_0x0068
        L_0x005e:
            boolean r1 = r10.f15666f     // Catch:{ all -> 0x0088 }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0073
            m.f0.h.j r0 = r10.f15663E     // Catch:{ all -> 0x0088 }
            r0.mo16407a(r11, r8, r12)     // Catch:{ all -> 0x0088 }
        L_0x0068:
            k.t r11 = p308k.C5812t.f14872a     // Catch:{ all -> 0x0088 }
            monitor-exit(r7)
            if (r13 == 0) goto L_0x0072
            m.f0.h.j r11 = r10.f15663E
            r11.flush()
        L_0x0072:
            return r9
        L_0x0073:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0088 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0088 }
            r12.<init>(r11)     // Catch:{ all -> 0x0088 }
            throw r12     // Catch:{ all -> 0x0088 }
        L_0x007f:
            m.f0.h.a r11 = new m.f0.h.a     // Catch:{ all -> 0x0085 }
            r11.<init>()     // Catch:{ all -> 0x0085 }
            throw r11     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            throw r11     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p344h.C6323f.m23793b(int, java.util.List, boolean):m.f0.h.i");
    }

    /* renamed from: a */
    public final synchronized C6348i mo16293a(int i) {
        return (C6348i) this.f15668h.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final C6348i mo16294a(List<C6317c> list, boolean z) {
        C5942k.m22327b(list, "requestHeaders");
        return m23793b(0, list, z);
    }

    /* renamed from: a */
    public final void mo16295a(int i, long j) {
        C6261c cVar = this.f15674n;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15669i);
        sb.append('[');
        sb.append(i);
        sb.append("] windowUpdate");
        String sb2 = sb.toString();
        C6341l lVar = new C6341l(sb2, true, sb2, true, this, i, j);
        cVar.mo16116a(lVar, 0);
    }

    /* renamed from: a */
    public final void mo16296a(int i, List<C6317c> list) {
        C5942k.m22327b(list, "requestHeaders");
        synchronized (this) {
            if (this.f15665G.contains(Integer.valueOf(i))) {
                mo16311c(i, C6315b.PROTOCOL_ERROR);
                return;
            }
            this.f15665G.add(Integer.valueOf(i));
            C6261c cVar = this.f15675o;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f15669i);
            sb.append('[');
            sb.append(i);
            sb.append("] onRequest");
            String sb2 = sb.toString();
            C6337h hVar = new C6337h(sb2, true, sb2, true, this, i, list);
            cVar.mo16116a(hVar, 0);
        }
    }

    /* renamed from: a */
    public final void mo16297a(int i, List<C6317c> list, boolean z) {
        C5942k.m22327b(list, "requestHeaders");
        C6261c cVar = this.f15675o;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15669i);
        sb.append('[');
        sb.append(i);
        sb.append("] onHeaders");
        String sb2 = sb.toString();
        C6336g gVar = new C6336g(sb2, true, sb2, true, this, i, list, z);
        cVar.mo16116a(gVar, 0);
    }

    /* renamed from: a */
    public final void mo16298a(int i, C6315b bVar) {
        C5942k.m22327b(bVar, "errorCode");
        C6261c cVar = this.f15675o;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15669i);
        sb.append('[');
        sb.append(i);
        sb.append("] onReset");
        String sb2 = sb.toString();
        C6338i iVar = new C6338i(sb2, true, sb2, true, this, i, bVar);
        cVar.mo16116a(iVar, 0);
    }

    /* renamed from: a */
    public final void mo16299a(int i, C6484g gVar, int i2, boolean z) {
        C5942k.m22327b(gVar, "source");
        C6480e eVar = new C6480e();
        long j = (long) i2;
        gVar.mo16804h(j);
        gVar.mo16163b(eVar, j);
        C6261c cVar = this.f15675o;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15669i);
        sb.append('[');
        sb.append(i);
        sb.append("] onData");
        String sb2 = sb.toString();
        C6335f fVar = new C6335f(sb2, true, sb2, true, this, i, eVar, i2, z);
        cVar.mo16116a(fVar, 0);
    }

    /* renamed from: a */
    public final void mo16300a(int i, boolean z, List<C6317c> list) {
        C5942k.m22327b(list, "alternating");
        this.f15663E.mo16414a(z, i, list);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r5 = (int) java.lang.Math.min(r13, r9.f15661C - r9.f15660B);
        r3.f14945f = r5;
        r4 = java.lang.Math.min(r5, r9.f15663E.mo16418d());
        r3.f14945f = r4;
        r9.f15660B += (long) r4;
        r5 = p308k.C5812t.f14872a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16301a(int r10, boolean r11, p350n.C6480e r12, long r13) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            m.f0.h.j r13 = r9.f15663E
            r13.mo16415a(r11, r10, r12, r0)
            return
        L_0x000d:
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x007c
            k.z.d.p r3 = new k.z.d.p
            r3.<init>()
            monitor-enter(r9)
        L_0x0017:
            long r4 = r9.f15660B     // Catch:{ InterruptedException -> 0x006d }
            long r6 = r9.f15661C     // Catch:{ InterruptedException -> 0x006d }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0037
            java.util.Map<java.lang.Integer, m.f0.h.i> r4 = r9.f15668h     // Catch:{ InterruptedException -> 0x006d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ InterruptedException -> 0x006d }
            boolean r4 = r4.containsKey(r5)     // Catch:{ InterruptedException -> 0x006d }
            if (r4 == 0) goto L_0x002f
            r9.wait()     // Catch:{ InterruptedException -> 0x006d }
            goto L_0x0017
        L_0x002f:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ InterruptedException -> 0x006d }
            java.lang.String r11 = "stream closed"
            r10.<init>(r11)     // Catch:{ InterruptedException -> 0x006d }
            throw r10     // Catch:{ InterruptedException -> 0x006d }
        L_0x0037:
            long r4 = r9.f15661C     // Catch:{ all -> 0x006b }
            long r6 = r9.f15660B     // Catch:{ all -> 0x006b }
            long r4 = r4 - r6
            long r4 = java.lang.Math.min(r13, r4)     // Catch:{ all -> 0x006b }
            int r5 = (int) r4     // Catch:{ all -> 0x006b }
            r3.f14945f = r5     // Catch:{ all -> 0x006b }
            m.f0.h.j r4 = r9.f15663E     // Catch:{ all -> 0x006b }
            int r4 = r4.mo16418d()     // Catch:{ all -> 0x006b }
            int r4 = java.lang.Math.min(r5, r4)     // Catch:{ all -> 0x006b }
            r3.f14945f = r4     // Catch:{ all -> 0x006b }
            long r5 = r9.f15660B     // Catch:{ all -> 0x006b }
            long r7 = (long) r4     // Catch:{ all -> 0x006b }
            long r5 = r5 + r7
            r9.f15660B = r5     // Catch:{ all -> 0x006b }
            k.t r5 = p308k.C5812t.f14872a     // Catch:{ all -> 0x006b }
            monitor-exit(r9)
            long r4 = (long) r4
            long r13 = r13 - r4
            m.f0.h.j r4 = r9.f15663E
            if (r11 == 0) goto L_0x0064
            int r5 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0064
            r5 = 1
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            int r3 = r3.f14945f
            r4.mo16415a(r5, r10, r12, r3)
            goto L_0x000d
        L_0x006b:
            r10 = move-exception
            goto L_0x007a
        L_0x006d:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x006b }
            r10.interrupt()     // Catch:{ all -> 0x006b }
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch:{ all -> 0x006b }
            r10.<init>()     // Catch:{ all -> 0x006b }
            throw r10     // Catch:{ all -> 0x006b }
        L_0x007a:
            monitor-exit(r9)
            throw r10
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p344h.C6323f.mo16301a(int, boolean, n.e, long):void");
    }

    /* renamed from: a */
    public final void mo16302a(C6315b bVar) {
        C5942k.m22327b(bVar, "statusCode");
        synchronized (this.f15663E) {
            synchronized (this) {
                if (!this.f15672l) {
                    this.f15672l = true;
                    int i = this.f15670j;
                    C5812t tVar = C5812t.f14872a;
                    this.f15663E.mo16411a(i, bVar, C6250b.f15415a);
                    C5812t tVar2 = C5812t.f14872a;
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:6|7|8|45|(2:22|(5:24|25|26|39|27))|29|30|31|32|33|35) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0084 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16303a(p337m.p338f0.p344h.C6315b r4, p337m.p338f0.p344h.C6315b r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            p308k.p323z.p325d.C5942k.m22327b(r4, r0)
            java.lang.String r0 = "streamCode"
            p308k.p323z.p325d.C5942k.m22327b(r5, r0)
            boolean r0 = p337m.p338f0.C6250b.f15421g
            if (r0 == 0) goto L_0x0041
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L_0x0015
            goto L_0x0041
        L_0x0015:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Thread "
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r0 = "Thread.currentThread()"
            p308k.p323z.p325d.C5942k.m22324a(r6, r0)
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = " MUST NOT hold lock on "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0041:
            r3.mo16302a(r4)     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, m.f0.h.i> r0 = r3.f15668h     // Catch:{ all -> 0x0099 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0099 }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x006f
            java.util.Map<java.lang.Integer, m.f0.h.i> r4 = r3.f15668h     // Catch:{ all -> 0x0099 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0099 }
            m.f0.h.i[] r0 = new p337m.p338f0.p344h.C6348i[r1]     // Catch:{ all -> 0x0099 }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x0067
            m.f0.h.i[] r4 = (p337m.p338f0.p344h.C6348i[]) r4     // Catch:{ all -> 0x0099 }
            java.util.Map<java.lang.Integer, m.f0.h.i> r0 = r3.f15668h     // Catch:{ all -> 0x0099 }
            r0.clear()     // Catch:{ all -> 0x0099 }
            goto L_0x006f
        L_0x0067:
            k.q r4 = new k.q     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0099 }
            throw r4     // Catch:{ all -> 0x0099 }
        L_0x006f:
            k.t r0 = p308k.C5812t.f14872a     // Catch:{ all -> 0x0099 }
            monitor-exit(r3)
            if (r4 == 0) goto L_0x007f
            int r0 = r4.length
        L_0x0075:
            if (r1 >= r0) goto L_0x007f
            r2 = r4[r1]
            r2.mo16369a(r5, r6)     // Catch:{ IOException -> 0x007c }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0075
        L_0x007f:
            m.f0.h.j r4 = r3.f15663E     // Catch:{ IOException -> 0x0084 }
            r4.close()     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            java.net.Socket r4 = r3.f15662D     // Catch:{ IOException -> 0x0089 }
            r4.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            m.f0.d.c r4 = r3.f15674n
            r4.mo16126i()
            m.f0.d.c r4 = r3.f15675o
            r4.mo16126i()
            m.f0.d.c r4 = r3.f15676p
            r4.mo16126i()
            return
        L_0x0099:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p344h.C6323f.mo16303a(m.f0.h.b, m.f0.h.b, java.io.IOException):void");
    }

    /* renamed from: a */
    public final void mo16304a(C6360m mVar) {
        C5942k.m22327b(mVar, "<set-?>");
        this.f15685y = mVar;
    }

    /* renamed from: a */
    public final void mo16305a(boolean z) {
        if (z) {
            this.f15663E.mo16405a();
            this.f15663E.mo16416b(this.f15684x);
            int b = this.f15684x.mo16434b();
            if (b != 65535) {
                this.f15663E.mo16409a(0, (long) (b - 65535));
            }
        }
        new Thread(this.f15664F, this.f15669i).start();
    }

    /* renamed from: a */
    public final void mo16306a(boolean z, int i, int i2) {
        try {
            this.f15663E.mo16413a(z, i, i2);
        } catch (IOException e) {
            m23787a(e);
        }
    }

    /* renamed from: a */
    public final boolean mo16307a() {
        return this.f15666f;
    }

    /* renamed from: b */
    public final void mo16308b(int i, C6315b bVar) {
        C5942k.m22327b(bVar, "statusCode");
        this.f15663E.mo16410a(i, bVar);
    }

    /* renamed from: b */
    public final boolean mo16309b(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* renamed from: c */
    public final synchronized C6348i mo16310c(int i) {
        C6348i iVar;
        iVar = (C6348i) this.f15668h.remove(Integer.valueOf(i));
        notifyAll();
        return iVar;
    }

    /* renamed from: c */
    public final void mo16311c(int i, C6315b bVar) {
        C5942k.m22327b(bVar, "errorCode");
        C6261c cVar = this.f15674n;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15669i);
        sb.append('[');
        sb.append(i);
        sb.append("] writeSynReset");
        String sb2 = sb.toString();
        C6340k kVar = new C6340k(sb2, true, sb2, true, this, i, bVar);
        cVar.mo16116a(kVar, 0);
    }

    public void close() {
        mo16303a(C6315b.NO_ERROR, C6315b.CANCEL, (IOException) null);
    }

    /* renamed from: d */
    public final String mo16313d() {
        return this.f15669i;
    }

    /* renamed from: d */
    public final void mo16314d(int i) {
        this.f15670j = i;
    }

    /* renamed from: d */
    public final synchronized boolean mo16315d(long j) {
        if (this.f15672l) {
            return false;
        }
        return this.f15681u >= this.f15680t || j < this.f15683w;
    }

    /* renamed from: f */
    public final int mo16316f() {
        return this.f15670j;
    }

    public final void flush() {
        this.f15663E.flush();
    }

    /* renamed from: g */
    public final C6327d mo16318g() {
        return this.f15667g;
    }

    /* renamed from: g */
    public final synchronized void mo16319g(long j) {
        long j2 = this.f15686z + j;
        this.f15686z = j2;
        long j3 = j2 - this.f15659A;
        if (j3 >= ((long) (this.f15684x.mo16434b() / 2))) {
            mo16295a(0, j3);
            this.f15659A += j3;
        }
    }

    /* renamed from: h */
    public final int mo16320h() {
        return this.f15671k;
    }

    /* renamed from: i */
    public final C6360m mo16321i() {
        return this.f15684x;
    }

    /* renamed from: l */
    public final C6360m mo16322l() {
        return this.f15685y;
    }

    /* renamed from: m */
    public final Map<Integer, C6348i> mo16323m() {
        return this.f15668h;
    }

    /* renamed from: o */
    public final long mo16324o() {
        return this.f15661C;
    }

    /* renamed from: p */
    public final C6353j mo16325p() {
        return this.f15663E;
    }

    /* renamed from: q */
    public final void mo16326q() {
        synchronized (this) {
            if (this.f15681u >= this.f15680t) {
                this.f15680t++;
                this.f15683w = System.nanoTime() + ((long) 1000000000);
                C5812t tVar = C5812t.f14872a;
                C6261c cVar = this.f15674n;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f15669i);
                sb.append(" ping");
                String sb2 = sb.toString();
                C6339j jVar = new C6339j(sb2, true, sb2, true, this);
                cVar.mo16116a(jVar, 0);
            }
        }
    }
}
