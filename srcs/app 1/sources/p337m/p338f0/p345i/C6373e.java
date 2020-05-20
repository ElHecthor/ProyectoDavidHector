package p337m.p338f0.p345i;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p337m.C6465y;

/* renamed from: m.f0.i.e */
public final class C6373e extends C6380h {

    /* renamed from: i */
    public static final C6375b f15815i = new C6375b(null);

    /* renamed from: d */
    private final Method f15816d;

    /* renamed from: e */
    private final Method f15817e;

    /* renamed from: f */
    private final Method f15818f;

    /* renamed from: g */
    private final Class<?> f15819g;

    /* renamed from: h */
    private final Class<?> f15820h;

    /* renamed from: m.f0.i.e$a */
    private static final class C6374a implements InvocationHandler {

        /* renamed from: a */
        private boolean f15821a;

        /* renamed from: b */
        private String f15822b;

        /* renamed from: c */
        private final List<String> f15823c;

        public C6374a(List<String> list) {
            C5942k.m22327b(list, "protocols");
            this.f15823c = list;
        }

        /* renamed from: a */
        public final String mo16467a() {
            return this.f15822b;
        }

        /* renamed from: b */
        public final boolean mo16468b() {
            return this.f15821a;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            C5942k.m22327b(obj, "proxy");
            C5942k.m22327b(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class returnType = method.getReturnType();
            if (C5942k.m22326a((Object) name, (Object) "supports") && C5942k.m22326a((Object) Boolean.TYPE, (Object) returnType)) {
                return Boolean.valueOf(true);
            }
            if (!C5942k.m22326a((Object) name, (Object) "unsupported") || !C5942k.m22326a((Object) Void.TYPE, (Object) returnType)) {
                if (C5942k.m22326a((Object) name, (Object) "protocols")) {
                    if (objArr.length == 0) {
                        return this.f15823c;
                    }
                }
                String str = "null cannot be cast to non-null type kotlin.String";
                if ((C5942k.m22326a((Object) name, (Object) "selectProtocol") || C5942k.m22326a((Object) name, (Object) "select")) && C5942k.m22326a((Object) String.class, (Object) returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i = 0;
                            while (true) {
                                Object obj3 = list.get(i);
                                if (obj3 != null) {
                                    String str2 = (String) obj3;
                                    if (!this.f15823c.contains(str2)) {
                                        if (i == size) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        this.f15822b = str2;
                                        return str2;
                                    }
                                } else {
                                    throw new C5809q(str);
                                }
                            }
                        }
                        String str3 = (String) this.f15823c.get(0);
                        this.f15822b = str3;
                        return str3;
                    }
                    throw new C5809q("null cannot be cast to non-null type kotlin.collections.List<*>");
                } else if ((!C5942k.m22326a((Object) name, (Object) "protocolSelected") && !C5942k.m22326a((Object) name, (Object) "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                } else {
                    Object obj4 = objArr[0];
                    if (obj4 != null) {
                        this.f15822b = (String) obj4;
                        return null;
                    }
                    throw new C5809q(str);
                }
            } else {
                this.f15821a = true;
                return null;
            }
        }
    }

    /* renamed from: m.f0.i.e$b */
    public static final class C6375b {
        private C6375b() {
        }

        public /* synthetic */ C6375b(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6380h mo16470a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                C5942k.m22324a((Object) property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            String str = "org.eclipse.jetty.alpn.ALPN";
            try {
                Class cls = Class.forName(str, true, null);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("$Provider");
                Class cls2 = Class.forName(sb.toString(), true, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("$ClientProvider");
                Class cls3 = Class.forName(sb2.toString(), true, null);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append("$ServerProvider");
                Class cls4 = Class.forName(sb3.toString(), true, null);
                Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
                Method method2 = cls.getMethod("get", new Class[]{SSLSocket.class});
                Method method3 = cls.getMethod("remove", new Class[]{SSLSocket.class});
                C5942k.m22324a((Object) method, "putMethod");
                C5942k.m22324a((Object) method2, "getMethod");
                C5942k.m22324a((Object) method3, "removeMethod");
                C5942k.m22324a((Object) cls3, "clientProviderClass");
                C5942k.m22324a((Object) cls4, "serverProviderClass");
                C6373e eVar = new C6373e(method, method2, method3, cls3, cls4);
                return eVar;
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public C6373e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        C5942k.m22327b(method, "putMethod");
        C5942k.m22327b(method2, "getMethod");
        C5942k.m22327b(method3, "removeMethod");
        C5942k.m22327b(cls, "clientProviderClass");
        C5942k.m22327b(cls2, "serverProviderClass");
        this.f15816d = method;
        this.f15817e = method2;
        this.f15818f = method3;
        this.f15819g = cls;
        this.f15820h = cls2;
    }

    /* renamed from: a */
    public void mo16466a(SSLSocket sSLSocket) {
        String str = "failed to remove ALPN";
        C5942k.m22327b(sSLSocket, "sslSocket");
        try {
            this.f15818f.invoke(null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError(str, e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError(str, e2);
        }
    }

    /* renamed from: a */
    public void mo16441a(SSLSocket sSLSocket, String str, List<? extends C6465y> list) {
        String str2 = "failed to set ALPN";
        C5942k.m22327b(sSLSocket, "sslSocket");
        C5942k.m22327b(list, "protocols");
        List a = C6380h.f15831c.mo16476a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C6380h.class.getClassLoader(), new Class[]{this.f15819g, this.f15820h}, new C6374a(a));
            this.f15816d.invoke(null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e) {
            throw new AssertionError(str2, e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(str2, e2);
        }
    }

    /* renamed from: b */
    public String mo16442b(SSLSocket sSLSocket) {
        String str = "failed to get ALPN selected protocol";
        C5942k.m22327b(sSLSocket, "sslSocket");
        try {
            Object[] objArr = {sSLSocket};
            String str2 = null;
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f15817e.invoke(null, objArr));
            if (invocationHandler != null) {
                C6374a aVar = (C6374a) invocationHandler;
                if (aVar.mo16468b() || aVar.mo16467a() != null) {
                    if (!aVar.mo16468b()) {
                        str2 = aVar.mo16467a();
                    }
                    return str2;
                }
                C6380h.m24071a(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            throw new C5809q("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
        } catch (InvocationTargetException e) {
            throw new AssertionError(str, e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(str, e2);
        }
    }
}
