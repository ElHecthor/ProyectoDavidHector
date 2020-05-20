package p337m;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import p308k.p313e0.C5769d;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.C6250b;
import p350n.C6480e;
import p350n.C6484g;

/* renamed from: m.c0 */
public abstract class C6236c0 implements Closeable {

    /* renamed from: g */
    public static final C6238b f15373g = new C6238b(null);

    /* renamed from: f */
    private Reader f15374f;

    /* renamed from: m.c0$a */
    public static final class C6237a extends Reader {

        /* renamed from: f */
        private boolean f15375f;

        /* renamed from: g */
        private Reader f15376g;

        /* renamed from: h */
        private final C6484g f15377h;

        /* renamed from: i */
        private final Charset f15378i;

        public C6237a(C6484g gVar, Charset charset) {
            C5942k.m22327b(gVar, "source");
            C5942k.m22327b(charset, "charset");
            this.f15377h = gVar;
            this.f15378i = charset;
        }

        public void close() {
            this.f15375f = true;
            Reader reader = this.f15376g;
            if (reader != null) {
                reader.close();
            } else {
                this.f15377h.close();
            }
        }

        public int read(char[] cArr, int i, int i2) {
            C5942k.m22327b(cArr, "cbuf");
            if (!this.f15375f) {
                Reader reader = this.f15376g;
                if (reader == null) {
                    reader = new InputStreamReader(this.f15377h.mo16815r(), C6250b.m23449a(this.f15377h, this.f15378i));
                    this.f15376g = reader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    /* renamed from: m.c0$b */
    public static final class C6238b {

        /* renamed from: m.c0$b$a */
        public static final class C6239a extends C6236c0 {

            /* renamed from: h */
            final /* synthetic */ C6484g f15379h;

            /* renamed from: i */
            final /* synthetic */ C6455v f15380i;

            /* renamed from: j */
            final /* synthetic */ long f15381j;

            C6239a(C6484g gVar, C6455v vVar, long j) {
                this.f15379h = gVar;
                this.f15380i = vVar;
                this.f15381j = j;
            }

            /* renamed from: f */
            public long mo16061f() {
                return this.f15381j;
            }

            /* renamed from: g */
            public C6455v mo16062g() {
                return this.f15380i;
            }

            /* renamed from: h */
            public C6484g mo16063h() {
                return this.f15379h;
            }
        }

        private C6238b() {
        }

        public /* synthetic */ C6238b(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ C6236c0 m23389a(C6238b bVar, byte[] bArr, C6455v vVar, int i, Object obj) {
            if ((i & 1) != 0) {
                vVar = null;
            }
            return bVar.mo16069a(bArr, vVar);
        }

        /* renamed from: a */
        public final C6236c0 mo16067a(C6455v vVar, long j, C6484g gVar) {
            C5942k.m22327b(gVar, "content");
            return mo16068a(gVar, vVar, j);
        }

        /* renamed from: a */
        public final C6236c0 mo16068a(C6484g gVar, C6455v vVar, long j) {
            C5942k.m22327b(gVar, "$this$asResponseBody");
            return new C6239a(gVar, vVar, j);
        }

        /* renamed from: a */
        public final C6236c0 mo16069a(byte[] bArr, C6455v vVar) {
            C5942k.m22327b(bArr, "$this$toResponseBody");
            C6480e eVar = new C6480e();
            eVar.write(bArr);
            return mo16068a((C6484g) eVar, vVar, (long) bArr.length);
        }
    }

    /* renamed from: a */
    public static final C6236c0 m23381a(C6455v vVar, long j, C6484g gVar) {
        return f15373g.mo16067a(vVar, j, gVar);
    }

    /* renamed from: l */
    private final Charset mo17098l() {
        C6455v g = mo16062g();
        if (g != null) {
            Charset a = g.mo16667a(C5769d.f14834a);
            if (a != null) {
                return a;
            }
        }
        return C5769d.f14834a;
    }

    /* renamed from: a */
    public final InputStream mo16058a() {
        return mo16063h().mo16815r();
    }

    public void close() {
        C6250b.m23457a((Closeable) mo16063h());
    }

    /* renamed from: d */
    public final Reader mo16060d() {
        Reader reader = this.f15374f;
        if (reader != null) {
            return reader;
        }
        C6237a aVar = new C6237a(mo16063h(), mo17098l());
        this.f15374f = aVar;
        return aVar;
    }

    /* renamed from: f */
    public abstract long mo16061f();

    /* renamed from: g */
    public abstract C6455v mo16062g();

    /* renamed from: h */
    public abstract C6484g mo16063h();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        p308k.p322y.C5904a.m22293a(r0, r1);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo16064i() {
        /*
            r3 = this;
            n.g r0 = r3.mo16063h()
            java.nio.charset.Charset r1 = r3.mo17098l()     // Catch:{ all -> 0x0015 }
            java.nio.charset.Charset r1 = p337m.p338f0.C6250b.m23449a(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r0.mo16782a(r1)     // Catch:{ all -> 0x0015 }
            r2 = 0
            p308k.p322y.C5904a.m22293a(r0, r2)
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            p308k.p322y.C5904a.m22293a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.C6236c0.mo16064i():java.lang.String");
    }
}
