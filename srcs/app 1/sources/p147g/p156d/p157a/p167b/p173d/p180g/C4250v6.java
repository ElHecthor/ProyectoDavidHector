package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: g.d.a.b.d.g.v6 */
final class C4250v6 {

    /* renamed from: a */
    private static final Class<?> f11364a = m17342d();

    /* renamed from: b */
    private static final C4096l7<?, ?> f11365b = m17317a(false);

    /* renamed from: c */
    private static final C4096l7<?, ?> f11366c = m17317a(true);

    /* renamed from: d */
    private static final C4096l7<?, ?> f11367d = new C4126n7();

    /* renamed from: a */
    static int m17311a(int i, Object obj, C4236u6 u6Var) {
        return obj instanceof C4048i5 ? C3945c4.m16013a(i, (C4048i5) obj) : C3945c4.m16022b(i, (C3985e6) obj, u6Var);
    }

    /* renamed from: a */
    static int m17312a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int e = C3945c4.m16038e(i) * size;
        if (list instanceof C4094l5) {
            C4094l5 l5Var = (C4094l5) list;
            while (i2 < size) {
                Object b = l5Var.mo12622b(i2);
                e += b instanceof C4092l3 ? C3945c4.m16027b((C4092l3) b) : C3945c4.m16028b((String) b);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                e += obj instanceof C4092l3 ? C3945c4.m16027b((C4092l3) obj) : C3945c4.m16028b((String) obj);
                i2++;
            }
        }
        return e;
    }

    /* renamed from: a */
    static int m17313a(int i, List<?> list, C4236u6 u6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = C3945c4.m16038e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            e += obj instanceof C4048i5 ? C3945c4.m16015a((C4048i5) obj) : C3945c4.m16014a((C3985e6) obj, u6Var);
        }
        return e;
    }

    /* renamed from: a */
    static int m17314a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m17315a(list) + (list.size() * C3945c4.m16038e(i));
    }

    /* renamed from: a */
    static int m17315a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4200s5) {
            C4200s5 s5Var = (C4200s5) list;
            i = 0;
            while (i2 < size) {
                i += C3945c4.m16037d(s5Var.mo12109b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3945c4.m16037d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static C4096l7<?, ?> m17316a() {
        return f11365b;
    }

    /* renamed from: a */
    private static C4096l7<?, ?> m17317a(boolean z) {
        try {
            Class e = m17346e();
            if (e == null) {
                return null;
            }
            return (C4096l7) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static <UT, UB> UB m17318a(int i, int i2, UB ub, C4096l7<UT, UB> l7Var) {
        if (ub == null) {
            ub = l7Var.mo12625a();
        }
        l7Var.mo12627a(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: a */
    static <UT, UB> UB m17319a(int i, List<Integer> list, C4309z4 z4Var, UB ub, C4096l7<UT, UB> l7Var) {
        if (z4Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (z4Var.mo12537a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m17318a(i, intValue, ub, l7Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!z4Var.mo12537a(intValue2)) {
                    ub = m17318a(i, intValue2, ub, l7Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: a */
    public static void m17320a(int i, List<String> list, C4051i8 i8Var) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12407b(i, list);
        }
    }

    /* renamed from: a */
    public static void m17321a(int i, List<?> list, C4051i8 i8Var, C4236u6 u6Var) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12400a(i, list, u6Var);
        }
    }

    /* renamed from: a */
    public static void m17322a(int i, List<Double> list, C4051i8 i8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12423i(i, list, z);
        }
    }

    /* renamed from: a */
    static <T, FT extends C4137o4<FT>> void m17323a(C4032h4<FT> h4Var, T t, T t2) {
        C4109m4 a = h4Var.mo12511a((Object) t2);
        if (!a.f11116a.isEmpty()) {
            h4Var.mo12515b(t).mo12651a(a);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m17324a(C4096l7<UT, UB> l7Var, T t, T t2) {
        l7Var.mo12630a((Object) t, l7Var.mo12635c(l7Var.mo12626a(t), l7Var.mo12626a(t2)));
    }

    /* renamed from: a */
    static <T> void m17325a(C4280x5 x5Var, T t, T t2, long j) {
        C4183r7.m16997a((Object) t, j, x5Var.mo12082a(C4183r7.m17019f(t, j), C4183r7.m17019f(t2, j)));
    }

    /* renamed from: a */
    public static void m17326a(Class<?> cls) {
        if (!C4214t4.class.isAssignableFrom(cls)) {
            Class<?> cls2 = f11364a;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    /* renamed from: a */
    static boolean m17327a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    static int m17328b(int i, List<C4092l3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * C3945c4.m16038e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += C3945c4.m16027b((C4092l3) list.get(i2));
        }
        return e;
    }

    /* renamed from: b */
    static int m17329b(int i, List<C3985e6> list, C4236u6 u6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C3945c4.m16031c(i, (C3985e6) list.get(i3), u6Var);
        }
        return i2;
    }

    /* renamed from: b */
    static int m17330b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17331b(list) + (size * C3945c4.m16038e(i));
    }

    /* renamed from: b */
    static int m17331b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4200s5) {
            C4200s5 s5Var = (C4200s5) list;
            i = 0;
            while (i2 < size) {
                i += C3945c4.m16040e(s5Var.mo12109b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3945c4.m16040e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C4096l7<?, ?> m17332b() {
        return f11366c;
    }

    /* renamed from: b */
    public static void m17333b(int i, List<C4092l3> list, C4051i8 i8Var) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12399a(i, list);
        }
    }

    /* renamed from: b */
    public static void m17334b(int i, List<?> list, C4051i8 i8Var, C4236u6 u6Var) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12408b(i, list, u6Var);
        }
    }

    /* renamed from: b */
    public static void m17335b(int i, List<Float> list, C4051i8 i8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12426l(i, list, z);
        }
    }

    /* renamed from: c */
    static int m17336c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17337c(list) + (size * C3945c4.m16038e(i));
    }

    /* renamed from: c */
    static int m17337c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4200s5) {
            C4200s5 s5Var = (C4200s5) list;
            i = 0;
            while (i2 < size) {
                i += C3945c4.m16044f(s5Var.mo12109b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3945c4.m16044f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static C4096l7<?, ?> m17338c() {
        return f11367d;
    }

    /* renamed from: c */
    public static void m17339c(int i, List<Long> list, C4051i8 i8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12422h(i, list, z);
        }
    }

    /* renamed from: d */
    static int m17340d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17341d(list) + (size * C3945c4.m16038e(i));
    }

    /* renamed from: d */
    static int m17341d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4263w4) {
            C4263w4 w4Var = (C4263w4) list;
            i = 0;
            while (i2 < size) {
                i += C3945c4.m16058k(w4Var.mo12890e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3945c4.m16058k(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    private static Class<?> m17342d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m17343d(int i, List<Long> list, C4051i8 i8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12418e(i, list, z);
        }
    }

    /* renamed from: e */
    static int m17344e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17345e(list) + (size * C3945c4.m16038e(i));
    }

    /* renamed from: e */
    static int m17345e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4263w4) {
            C4263w4 w4Var = (C4263w4) list;
            i = 0;
            while (i2 < size) {
                i += C3945c4.m16041f(w4Var.mo12890e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3945c4.m16041f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    private static Class<?> m17346e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m17347e(int i, List<Long> list, C4051i8 i8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12412c(i, list, z);
        }
    }

    /* renamed from: f */
    static int m17348f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17349f(list) + (size * C3945c4.m16038e(i));
    }

    /* renamed from: f */
    static int m17349f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4263w4) {
            C4263w4 w4Var = (C4263w4) list;
            i = 0;
            while (i2 < size) {
                i += C3945c4.m16045g(w4Var.mo12890e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3945c4.m16045g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static void m17350f(int i, List<Long> list, C4051i8 i8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12401a(i, list, z);
        }
    }

    /* renamed from: g */
    static int m17351g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17352g(list) + (size * C3945c4.m16038e(i));
    }

    /* renamed from: g */
    static int m17352g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4263w4) {
            C4263w4 w4Var = (C4263w4) list;
            i = 0;
            while (i2 < size) {
                i += C3945c4.m16049h(w4Var.mo12890e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3945c4.m16049h(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static void m17353g(int i, List<Long> list, C4051i8 i8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12424j(i, list, z);
        }
    }

    /* renamed from: h */
    static int m17354h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C3945c4.m16054i(i, 0);
    }

    /* renamed from: h */
    static int m17355h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    public static void m17356h(int i, List<Integer> list, C4051i8 i8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12415d(i, list, z);
        }
    }

    /* renamed from: i */
    static int m17357i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C3945c4.m16047g(i, 0);
    }

    /* renamed from: i */
    static int m17358i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    public static void m17359i(int i, List<Integer> list, C4051i8 i8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12427m(i, list, z);
        }
    }

    /* renamed from: j */
    static int m17360j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C3945c4.m16025b(i, true);
    }

    /* renamed from: j */
    static int m17361j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    public static void m17362j(int i, List<Integer> list, C4051i8 i8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12421g(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m17363k(int i, List<Integer> list, C4051i8 i8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12425k(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m17364l(int i, List<Integer> list, C4051i8 i8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12428n(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m17365m(int i, List<Integer> list, C4051i8 i8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12420f(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m17366n(int i, List<Boolean> list, C4051i8 i8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i8Var.mo12409b(i, list, z);
        }
    }
}
