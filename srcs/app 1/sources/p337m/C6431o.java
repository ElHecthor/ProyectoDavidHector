package p337m;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import p308k.p323z.p325d.C5942k;

/* renamed from: m.o */
public interface C6431o {

    /* renamed from: a */
    public static final C6431o f15934a = new C6433a();

    /* renamed from: m.o$a */
    public static final class C6432a {

        /* renamed from: m.o$a$a */
        private static final class C6433a implements C6431o {
            /* renamed from: a */
            public List<InetAddress> mo16565a(String str) {
                C5942k.m22327b(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    C5942k.m22324a((Object) allByName, "InetAddress.getAllByName(hostname)");
                    return C5832h.m22124e(allByName);
                } catch (NullPointerException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Broken system behaviour for dns lookup of ");
                    sb.append(str);
                    UnknownHostException unknownHostException = new UnknownHostException(sb.toString());
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private C6432a() {
        }

        public /* synthetic */ C6432a(C5938g gVar) {
            this();
        }
    }

    static {
        new C6432a(null);
    }

    /* renamed from: a */
    List<InetAddress> mo16565a(String str);
}
