package p071f.p131r;

import java.util.Collections;
import java.util.List;

/* renamed from: f.r.g */
class C3501g<T> {

    /* renamed from: e */
    private static final C3501g f9920e = new C3501g(Collections.emptyList(), 0);

    /* renamed from: a */
    public final List<T> f9921a;

    /* renamed from: b */
    public final int f9922b;

    /* renamed from: c */
    public final int f9923c;

    /* renamed from: d */
    public final int f9924d;

    /* renamed from: f.r.g$a */
    static abstract class C3502a<T> {
        C3502a() {
        }

        /* renamed from: a */
        public abstract void mo11123a(int i, C3501g<T> gVar);
    }

    static {
        new C3501g(Collections.emptyList(), 0);
    }

    C3501g(List<T> list, int i) {
        this.f9921a = list;
        this.f9922b = 0;
        this.f9923c = 0;
        this.f9924d = i;
    }

    C3501g(List<T> list, int i, int i2, int i3) {
        this.f9921a = list;
        this.f9922b = i;
        this.f9923c = i2;
        this.f9924d = i3;
    }

    /* renamed from: b */
    static <T> C3501g<T> m14319b() {
        return f9920e;
    }

    /* renamed from: a */
    public boolean mo11143a() {
        return this == f9920e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Result ");
        sb.append(this.f9922b);
        String str = ", ";
        sb.append(str);
        sb.append(this.f9921a);
        sb.append(str);
        sb.append(this.f9923c);
        sb.append(", offset ");
        sb.append(this.f9924d);
        return sb.toString();
    }
}
