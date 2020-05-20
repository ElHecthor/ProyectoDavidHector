package p337m.p338f0.p344h;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p308k.p310b0.C5729b;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.C6250b;
import p337m.p338f0.p344h.C6319d.C6320a;
import p350n.C6480e;
import p350n.C6484g;
import p350n.C6485h;
import p350n.C6506y;
import p350n.C6507z;

/* renamed from: m.f0.h.h */
public final class C6344h implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Logger f15742j;

    /* renamed from: k */
    public static final C6345a f15743k = new C6345a(null);

    /* renamed from: f */
    private final C6346b f15744f;

    /* renamed from: g */
    private final C6320a f15745g;

    /* renamed from: h */
    private final C6484g f15746h;

    /* renamed from: i */
    private final boolean f15747i;

    /* renamed from: m.f0.h.h$a */
    public static final class C6345a {
        private C6345a() {
        }

        public /* synthetic */ C6345a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final int mo16358a(int i, int i2, int i3) {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("PROTOCOL_ERROR padding ");
            sb.append(i3);
            sb.append(" > remaining length ");
            sb.append(i);
            throw new IOException(sb.toString());
        }

        /* renamed from: a */
        public final Logger mo16359a() {
            return C6344h.f15742j;
        }
    }

    /* renamed from: m.f0.h.h$b */
    public static final class C6346b implements C6506y {

        /* renamed from: f */
        private int f15748f;

        /* renamed from: g */
        private int f15749g;

        /* renamed from: h */
        private int f15750h;

        /* renamed from: i */
        private int f15751i;

        /* renamed from: j */
        private int f15752j;

        /* renamed from: k */
        private final C6484g f15753k;

        public C6346b(C6484g gVar) {
            C5942k.m22327b(gVar, "source");
            this.f15753k = gVar;
        }

        /* renamed from: d */
        private final void m23907d() {
            int i = this.f15750h;
            int a = C6250b.m23439a(this.f15753k);
            this.f15751i = a;
            this.f15748f = a;
            int a2 = C6250b.m23430a(this.f15753k.readByte(), 255);
            this.f15749g = C6250b.m23430a(this.f15753k.readByte(), 255);
            if (C6344h.f15743k.mo16359a().isLoggable(Level.FINE)) {
                C6344h.f15743k.mo16359a().fine(C6322e.f15656e.mo16292a(true, this.f15750h, this.f15748f, a2, this.f15749g));
            }
            int readInt = this.f15753k.readInt() & Integer.MAX_VALUE;
            this.f15750h = readInt;
            if (a2 != 9) {
                StringBuilder sb = new StringBuilder();
                sb.append(a2);
                sb.append(" != TYPE_CONTINUATION");
                throw new IOException(sb.toString());
            } else if (readInt != i) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        /* renamed from: a */
        public final int mo16360a() {
            return this.f15751i;
        }

        /* renamed from: a */
        public final void mo16361a(int i) {
            this.f15749g = i;
        }

        /* renamed from: b */
        public long mo16163b(C6480e eVar, long j) {
            C5942k.m22327b(eVar, "sink");
            while (true) {
                int i = this.f15751i;
                if (i == 0) {
                    this.f15753k.skip((long) this.f15752j);
                    this.f15752j = 0;
                    if ((this.f15749g & 4) != 0) {
                        return -1;
                    }
                    m23907d();
                } else {
                    long b = this.f15753k.mo16163b(eVar, Math.min(j, (long) i));
                    if (b == -1) {
                        return -1;
                    }
                    this.f15751i -= (int) b;
                    return b;
                }
            }
        }

        /* renamed from: b */
        public C6507z mo16270b() {
            return this.f15753k.mo16270b();
        }

        /* renamed from: b */
        public final void mo16362b(int i) {
            this.f15751i = i;
        }

        /* renamed from: c */
        public final void mo16363c(int i) {
            this.f15748f = i;
        }

        public void close() {
        }

        /* renamed from: d */
        public final void mo16364d(int i) {
            this.f15752j = i;
        }

        /* renamed from: e */
        public final void mo16365e(int i) {
            this.f15750h = i;
        }
    }

    /* renamed from: m.f0.h.h$c */
    public interface C6347c {
        /* renamed from: a */
        void mo16341a();

        /* renamed from: a */
        void mo16342a(int i, int i2, int i3, boolean z);

        /* renamed from: a */
        void mo16343a(int i, int i2, List<C6317c> list);

        /* renamed from: a */
        void mo16344a(int i, long j);

        /* renamed from: a */
        void mo16345a(int i, C6315b bVar);

        /* renamed from: a */
        void mo16346a(int i, C6315b bVar, C6485h hVar);

        /* renamed from: a */
        void mo16347a(boolean z, int i, int i2);

        /* renamed from: a */
        void mo16348a(boolean z, int i, int i2, List<C6317c> list);

        /* renamed from: a */
        void mo16349a(boolean z, int i, C6484g gVar, int i2);

        /* renamed from: a */
        void mo16350a(boolean z, C6360m mVar);
    }

    static {
        Logger logger = Logger.getLogger(C6322e.class.getName());
        C5942k.m22324a((Object) logger, "Logger.getLogger(Http2::class.java.name)");
        f15742j = logger;
    }

    public C6344h(C6484g gVar, boolean z) {
        C5942k.m22327b(gVar, "source");
        this.f15746h = gVar;
        this.f15747i = z;
        C6346b bVar = new C6346b(gVar);
        this.f15744f = bVar;
        C6320a aVar = new C6320a(bVar, 4096, 0, 4, null);
        this.f15745g = aVar;
    }

    /* renamed from: a */
    private final List<C6317c> m23891a(int i, int i2, int i3, int i4) {
        this.f15744f.mo16362b(i);
        C6346b bVar = this.f15744f;
        bVar.mo16363c(bVar.mo16360a());
        this.f15744f.mo16364d(i2);
        this.f15744f.mo16361a(i3);
        this.f15744f.mo16365e(i4);
        this.f15745g.mo16286c();
        return this.f15745g.mo16284a();
    }

    /* renamed from: a */
    private final void m23893a(C6347c cVar, int i) {
        int readInt = this.f15746h.readInt();
        cVar.mo16342a(i, readInt & Integer.MAX_VALUE, C6250b.m23430a(this.f15746h.readByte(), 255) + 1, (readInt & ((int) 2147483648L)) != 0);
    }

    /* renamed from: a */
    private final void m23894a(C6347c cVar, int i, int i2, int i3) {
        if (i3 != 0) {
            int i4 = 0;
            boolean z = true;
            boolean z2 = (i2 & 1) != 0;
            if ((i2 & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((i2 & 8) != 0) {
                    i4 = C6250b.m23430a(this.f15746h.readByte(), 255);
                }
                cVar.mo16349a(z2, i3, this.f15746h, f15743k.mo16358a(i, i2, i4));
                this.f15746h.skip((long) i4);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    /* renamed from: b */
    private final void m23895b(C6347c cVar, int i, int i2, int i3) {
        if (i < 8) {
            StringBuilder sb = new StringBuilder();
            sb.append("TYPE_GOAWAY length < 8: ");
            sb.append(i);
            throw new IOException(sb.toString());
        } else if (i3 == 0) {
            int readInt = this.f15746h.readInt();
            int readInt2 = this.f15746h.readInt();
            int i4 = i - 8;
            C6315b a = C6315b.f15620n.mo16274a(readInt2);
            if (a != null) {
                C6485h hVar = C6485h.f16097i;
                if (i4 > 0) {
                    hVar = this.f15746h.mo16790b((long) i4);
                }
                cVar.mo16346a(readInt, a, hVar);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("TYPE_GOAWAY unexpected error code: ");
            sb2.append(readInt2);
            throw new IOException(sb2.toString());
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    /* renamed from: c */
    private final void m23896c(C6347c cVar, int i, int i2, int i3) {
        if (i3 != 0) {
            int i4 = 0;
            boolean z = (i2 & 1) != 0;
            if ((i2 & 8) != 0) {
                i4 = C6250b.m23430a(this.f15746h.readByte(), 255);
            }
            if ((i2 & 32) != 0) {
                m23893a(cVar, i3);
                i -= 5;
            }
            cVar.mo16348a(z, i3, -1, m23891a(f15743k.mo16358a(i, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    /* renamed from: d */
    private final void m23897d(C6347c cVar, int i, int i2, int i3) {
        if (i != 8) {
            StringBuilder sb = new StringBuilder();
            sb.append("TYPE_PING length != 8: ");
            sb.append(i);
            throw new IOException(sb.toString());
        } else if (i3 == 0) {
            int readInt = this.f15746h.readInt();
            int readInt2 = this.f15746h.readInt();
            boolean z = true;
            if ((i2 & 1) == 0) {
                z = false;
            }
            cVar.mo16347a(z, readInt, readInt2);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    /* renamed from: e */
    private final void m23898e(C6347c cVar, int i, int i2, int i3) {
        if (i != 5) {
            StringBuilder sb = new StringBuilder();
            sb.append("TYPE_PRIORITY length: ");
            sb.append(i);
            sb.append(" != 5");
            throw new IOException(sb.toString());
        } else if (i3 != 0) {
            m23893a(cVar, i3);
        } else {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
    }

    /* renamed from: f */
    private final void m23899f(C6347c cVar, int i, int i2, int i3) {
        if (i3 != 0) {
            int a = (i2 & 8) != 0 ? C6250b.m23430a(this.f15746h.readByte(), 255) : 0;
            cVar.mo16343a(i3, this.f15746h.readInt() & Integer.MAX_VALUE, m23891a(f15743k.mo16358a(i - 4, i2, a), a, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    /* renamed from: g */
    private final void m23900g(C6347c cVar, int i, int i2, int i3) {
        if (i != 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("TYPE_RST_STREAM length: ");
            sb.append(i);
            sb.append(" != 4");
            throw new IOException(sb.toString());
        } else if (i3 != 0) {
            int readInt = this.f15746h.readInt();
            C6315b a = C6315b.f15620n.mo16274a(readInt);
            if (a != null) {
                cVar.mo16345a(i3, a);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("TYPE_RST_STREAM unexpected error code: ");
            sb2.append(readInt);
            throw new IOException(sb2.toString());
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    /* renamed from: h */
    private final void m23901h(C6347c cVar, int i, int i2, int i3) {
        int readInt;
        if (i3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        } else if ((i2 & 1) != 0) {
            if (i == 0) {
                cVar.mo16341a();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        } else if (i % 6 == 0) {
            C6360m mVar = new C6360m();
            C5729b a = C5736g.m21870a((C5729b) C5736g.m21875d(0, i), 6);
            int c = a.mo15363c();
            int d = a.mo15364d();
            int e = a.mo15365e();
            if (e < 0 ? c >= d : c <= d) {
                while (true) {
                    int a2 = C6250b.m23440a(this.f15746h.readShort(), 65535);
                    readInt = this.f15746h.readInt();
                    if (a2 != 2) {
                        if (a2 == 3) {
                            a2 = 4;
                        } else if (a2 == 4) {
                            a2 = 7;
                            if (readInt < 0) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                            }
                        } else if (a2 == 5 && (readInt < 16384 || readInt > 16777215)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ");
                            sb.append(readInt);
                        }
                    } else if (!(readInt == 0 || readInt == 1)) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    mVar.mo16432a(a2, readInt);
                    if (c == d) {
                        break;
                    }
                    c += e;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ");
                sb2.append(readInt);
                throw new IOException(sb2.toString());
            }
            cVar.mo16350a(false, mVar);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("TYPE_SETTINGS length % 6 != 0: ");
            sb3.append(i);
            throw new IOException(sb3.toString());
        }
    }

    /* renamed from: i */
    private final void m23902i(C6347c cVar, int i, int i2, int i3) {
        if (i == 4) {
            long a = C6250b.m23442a(this.f15746h.readInt(), 2147483647L);
            if (a != 0) {
                cVar.mo16344a(i3, a);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("TYPE_WINDOW_UPDATE length !=4: ");
        sb.append(i);
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    public final void mo16355a(C6347c cVar) {
        C5942k.m22327b(cVar, "handler");
        if (!this.f15747i) {
            C6485h b = this.f15746h.mo16790b((long) C6322e.f15652a.mo16868p());
            if (f15742j.isLoggable(Level.FINE)) {
                Logger logger = f15742j;
                StringBuilder sb = new StringBuilder();
                sb.append("<< CONNECTION ");
                sb.append(b.mo16864l());
                logger.fine(C6250b.m23446a(sb.toString(), new Object[0]));
            }
            if (!C5942k.m22326a((Object) C6322e.f15652a, (Object) b)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a connection header but was ");
                sb2.append(b.mo16870r());
                throw new IOException(sb2.toString());
            }
        } else if (!mo16356a(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    /* renamed from: a */
    public final boolean mo16356a(boolean z, C6347c cVar) {
        C5942k.m22327b(cVar, "handler");
        try {
            this.f15746h.mo16804h(9);
            int a = C6250b.m23439a(this.f15746h);
            if (a <= 16384) {
                int a2 = C6250b.m23430a(this.f15746h.readByte(), 255);
                if (!z || a2 == 4) {
                    int a3 = C6250b.m23430a(this.f15746h.readByte(), 255);
                    int readInt = this.f15746h.readInt() & Integer.MAX_VALUE;
                    if (f15742j.isLoggable(Level.FINE)) {
                        f15742j.fine(C6322e.f15656e.mo16292a(true, readInt, a, a2, a3));
                    }
                    switch (a2) {
                        case 0:
                            m23894a(cVar, a, a3, readInt);
                            break;
                        case 1:
                            m23896c(cVar, a, a3, readInt);
                            break;
                        case 2:
                            m23898e(cVar, a, a3, readInt);
                            break;
                        case 3:
                            m23900g(cVar, a, a3, readInt);
                            break;
                        case 4:
                            m23901h(cVar, a, a3, readInt);
                            break;
                        case 5:
                            m23899f(cVar, a, a3, readInt);
                            break;
                        case 6:
                            m23897d(cVar, a, a3, readInt);
                            break;
                        case 7:
                            m23895b(cVar, a, a3, readInt);
                            break;
                        case 8:
                            m23902i(cVar, a, a3, readInt);
                            break;
                        default:
                            this.f15746h.skip((long) a);
                            break;
                    }
                    return true;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a SETTINGS frame but was ");
                sb.append(a2);
                throw new IOException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FRAME_SIZE_ERROR: ");
            sb2.append(a);
            throw new IOException(sb2.toString());
        } catch (EOFException unused) {
            return false;
        }
    }

    public void close() {
        this.f15746h.close();
    }
}
