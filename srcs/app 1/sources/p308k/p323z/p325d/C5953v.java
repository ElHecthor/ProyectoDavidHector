package p308k.p323z.p325d;

import java.util.List;
import p308k.C5737c;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p324c.C5908b;
import p308k.p323z.p324c.C5909c;
import p308k.p323z.p324c.C5910d;
import p308k.p323z.p324c.C5911e;
import p308k.p323z.p324c.C5912f;
import p308k.p323z.p324c.C5913g;
import p308k.p323z.p324c.C5914h;
import p308k.p323z.p324c.C5915i;
import p308k.p323z.p324c.C5916j;
import p308k.p323z.p324c.C5917k;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5919m;
import p308k.p323z.p324c.C5920n;
import p308k.p323z.p324c.C5921o;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p324c.C5923q;
import p308k.p323z.p324c.C5924r;
import p308k.p323z.p324c.C5925s;
import p308k.p323z.p324c.C5926t;
import p308k.p323z.p324c.C5927u;
import p308k.p323z.p324c.C5928v;
import p308k.p323z.p324c.C5929w;
import p308k.p323z.p325d.p326w.C5954a;

/* renamed from: k.z.d.v */
public class C5953v {
    /* renamed from: a */
    public static ClassCastException m22349a(ClassCastException classCastException) {
        m22351a((T) classCastException);
        throw classCastException;
    }

    /* renamed from: a */
    public static Object m22350a(Object obj, int i) {
        if (obj == null || m22356b(obj, i)) {
            return obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("kotlin.jvm.functions.Function");
        sb.append(i);
        m22353a(obj, sb.toString());
        throw null;
    }

    /* renamed from: a */
    private static <T extends Throwable> T m22351a(T t) {
        C5942k.m22322a(t, C5953v.class.getName());
        return t;
    }

    /* renamed from: a */
    public static List m22352a(Object obj) {
        if (!(obj instanceof C5954a)) {
            return m22355b(obj);
        }
        m22353a(obj, "kotlin.collections.MutableList");
        throw null;
    }

    /* renamed from: a */
    public static void m22353a(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to ");
        sb.append(str);
        m22354a(sb.toString());
        throw null;
    }

    /* renamed from: a */
    public static void m22354a(String str) {
        m22349a(new ClassCastException(str));
        throw null;
    }

    /* renamed from: b */
    public static List m22355b(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            m22349a(e);
            throw null;
        }
    }

    /* renamed from: b */
    public static boolean m22356b(Object obj, int i) {
        return (obj instanceof C5737c) && m22357c(obj) == i;
    }

    /* renamed from: c */
    public static int m22357c(Object obj) {
        if (obj instanceof C5939h) {
            return ((C5939h) obj).mo15599d();
        }
        if (obj instanceof C5907a) {
            return 0;
        }
        if (obj instanceof C5918l) {
            return 1;
        }
        if (obj instanceof C5922p) {
            return 2;
        }
        if (obj instanceof C5923q) {
            return 3;
        }
        if (obj instanceof C5924r) {
            return 4;
        }
        if (obj instanceof C5925s) {
            return 5;
        }
        if (obj instanceof C5926t) {
            return 6;
        }
        if (obj instanceof C5927u) {
            return 7;
        }
        if (obj instanceof C5928v) {
            return 8;
        }
        if (obj instanceof C5929w) {
            return 9;
        }
        if (obj instanceof C5908b) {
            return 10;
        }
        if (obj instanceof C5909c) {
            return 11;
        }
        if (obj instanceof C5910d) {
            return 12;
        }
        if (obj instanceof C5911e) {
            return 13;
        }
        if (obj instanceof C5912f) {
            return 14;
        }
        if (obj instanceof C5913g) {
            return 15;
        }
        if (obj instanceof C5914h) {
            return 16;
        }
        if (obj instanceof C5915i) {
            return 17;
        }
        if (obj instanceof C5916j) {
            return 18;
        }
        if (obj instanceof C5917k) {
            return 19;
        }
        if (obj instanceof C5919m) {
            return 20;
        }
        if (obj instanceof C5920n) {
            return 21;
        }
        return obj instanceof C5921o ? 22 : -1;
    }
}
