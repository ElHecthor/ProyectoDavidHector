package p308k.p323z.p325d;

import java.util.Arrays;
import p308k.C5765e;
import p308k.C5811s;

/* renamed from: k.z.d.k */
public class C5942k {
    private C5942k() {
    }

    /* renamed from: a */
    public static String m22320a(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    /* renamed from: a */
    private static <T extends Throwable> T m22321a(T t) {
        m22322a(t, C5942k.class.getName());
        return t;
    }

    /* renamed from: a */
    static <T extends Throwable> T m22322a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: a */
    public static void m22323a() {
        C5765e eVar = new C5765e();
        m22321a((T) eVar);
        throw eVar;
    }

    /* renamed from: a */
    public static void m22324a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" must not be null");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            m22321a((T) illegalStateException);
            throw illegalStateException;
        }
    }

    /* renamed from: a */
    private static void m22325a(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder();
        sb.append("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(".");
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb.toString());
        m22321a((T) illegalArgumentException);
        throw illegalArgumentException;
    }

    /* renamed from: a */
    public static boolean m22326a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m22327b(Object obj, String str) {
        if (obj == null) {
            m22325a(str);
            throw null;
        }
    }

    /* renamed from: b */
    public static void m22328b(String str) {
        C5811s sVar = new C5811s(str);
        m22321a((T) sVar);
        throw sVar;
    }

    /* renamed from: c */
    public static void m22329c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        m22328b(sb.toString());
        throw null;
    }
}
