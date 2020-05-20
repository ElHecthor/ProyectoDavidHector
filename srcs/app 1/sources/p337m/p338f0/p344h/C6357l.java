package p337m.p338f0.p344h;

import java.util.List;
import p308k.p323z.p325d.C5942k;
import p350n.C6484g;

/* renamed from: m.f0.h.l */
public interface C6357l {

    /* renamed from: a */
    public static final C6357l f15794a = new C6359a();

    /* renamed from: m.f0.h.l$a */
    public static final class C6358a {

        /* renamed from: m.f0.h.l$a$a */
        private static final class C6359a implements C6357l {
            /* renamed from: a */
            public void mo16426a(int i, C6315b bVar) {
                C5942k.m22327b(bVar, "errorCode");
            }

            /* renamed from: a */
            public boolean mo16427a(int i, List<C6317c> list) {
                C5942k.m22327b(list, "requestHeaders");
                return true;
            }

            /* renamed from: a */
            public boolean mo16428a(int i, List<C6317c> list, boolean z) {
                C5942k.m22327b(list, "responseHeaders");
                return true;
            }

            /* renamed from: a */
            public boolean mo16429a(int i, C6484g gVar, int i2, boolean z) {
                C5942k.m22327b(gVar, "source");
                gVar.skip((long) i2);
                return true;
            }
        }

        private C6358a() {
        }

        public /* synthetic */ C6358a(C5938g gVar) {
            this();
        }
    }

    static {
        new C6358a(null);
    }

    /* renamed from: a */
    void mo16426a(int i, C6315b bVar);

    /* renamed from: a */
    boolean mo16427a(int i, List<C6317c> list);

    /* renamed from: a */
    boolean mo16428a(int i, List<C6317c> list, boolean z);

    /* renamed from: a */
    boolean mo16429a(int i, C6484g gVar, int i2, boolean z);
}
