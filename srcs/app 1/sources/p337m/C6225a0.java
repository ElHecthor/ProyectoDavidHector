package p337m;

import p308k.p323z.p325d.C5942k;
import p337m.p338f0.C6250b;
import p350n.C6483f;
import p350n.C6485h;

/* renamed from: m.a0 */
public abstract class C6225a0 {

    /* renamed from: a */
    public static final C6226a f15338a = new C6226a(null);

    /* renamed from: m.a0$a */
    public static final class C6226a {

        /* renamed from: m.a0$a$a */
        public static final class C6227a extends C6225a0 {

            /* renamed from: b */
            final /* synthetic */ C6485h f15339b;

            /* renamed from: c */
            final /* synthetic */ C6455v f15340c;

            C6227a(C6485h hVar, C6455v vVar) {
                this.f15339b = hVar;
                this.f15340c = vVar;
            }

            /* renamed from: a */
            public long mo16007a() {
                return (long) this.f15339b.mo16868p();
            }

            /* renamed from: a */
            public void mo16008a(C6483f fVar) {
                C5942k.m22327b(fVar, "sink");
                fVar.mo16788a(this.f15339b);
            }

            /* renamed from: b */
            public C6455v mo16009b() {
                return this.f15340c;
            }
        }

        /* renamed from: m.a0$a$b */
        public static final class C6228b extends C6225a0 {

            /* renamed from: b */
            final /* synthetic */ byte[] f15341b;

            /* renamed from: c */
            final /* synthetic */ C6455v f15342c;

            /* renamed from: d */
            final /* synthetic */ int f15343d;

            /* renamed from: e */
            final /* synthetic */ int f15344e;

            C6228b(byte[] bArr, C6455v vVar, int i, int i2) {
                this.f15341b = bArr;
                this.f15342c = vVar;
                this.f15343d = i;
                this.f15344e = i2;
            }

            /* renamed from: a */
            public long mo16007a() {
                return (long) this.f15343d;
            }

            /* renamed from: a */
            public void mo16008a(C6483f fVar) {
                C5942k.m22327b(fVar, "sink");
                fVar.write(this.f15341b, this.f15344e, this.f15343d);
            }

            /* renamed from: b */
            public C6455v mo16009b() {
                return this.f15342c;
            }
        }

        private C6226a() {
        }

        public /* synthetic */ C6226a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ C6225a0 m23325a(C6226a aVar, C6455v vVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo16013a(vVar, bArr, i, i2);
        }

        /* renamed from: a */
        public static /* synthetic */ C6225a0 m23326a(C6226a aVar, byte[] bArr, C6455v vVar, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                vVar = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo16015a(bArr, vVar, i, i2);
        }

        /* renamed from: a */
        public final C6225a0 mo16012a(C6455v vVar, C6485h hVar) {
            C5942k.m22327b(hVar, "content");
            return mo16014a(hVar, vVar);
        }

        /* renamed from: a */
        public final C6225a0 mo16013a(C6455v vVar, byte[] bArr, int i, int i2) {
            C5942k.m22327b(bArr, "content");
            return mo16015a(bArr, vVar, i, i2);
        }

        /* renamed from: a */
        public final C6225a0 mo16014a(C6485h hVar, C6455v vVar) {
            C5942k.m22327b(hVar, "$this$toRequestBody");
            return new C6227a(hVar, vVar);
        }

        /* renamed from: a */
        public final C6225a0 mo16015a(byte[] bArr, C6455v vVar, int i, int i2) {
            C5942k.m22327b(bArr, "$this$toRequestBody");
            C6250b.m23456a((long) bArr.length, (long) i, (long) i2);
            return new C6228b(bArr, vVar, i2, i);
        }
    }

    /* renamed from: a */
    public static final C6225a0 m23318a(C6455v vVar, C6485h hVar) {
        return f15338a.mo16012a(vVar, hVar);
    }

    /* renamed from: a */
    public static final C6225a0 m23319a(C6455v vVar, byte[] bArr) {
        return C6226a.m23325a(f15338a, vVar, bArr, 0, 0, 12, (Object) null);
    }

    /* renamed from: a */
    public long mo16007a() {
        return -1;
    }

    /* renamed from: a */
    public abstract void mo16008a(C6483f fVar);

    /* renamed from: b */
    public abstract C6455v mo16009b();

    /* renamed from: c */
    public boolean mo16010c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo16011d() {
        return false;
    }
}
