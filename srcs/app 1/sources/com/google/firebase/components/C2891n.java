package com.google.firebase.components;

/* renamed from: com.google.firebase.components.n */
public final class C2891n {

    /* renamed from: a */
    private final Class<?> f8367a;

    /* renamed from: b */
    private final int f8368b;

    /* renamed from: c */
    private final int f8369c;

    private C2891n(Class<?> cls, int i, int i2) {
        C2898u.m11987a(cls, "Null dependency anInterface.");
        this.f8367a = cls;
        this.f8368b = i;
        this.f8369c = i2;
    }

    /* renamed from: a */
    public static C2891n m11972a(Class<?> cls) {
        return new C2891n(cls, 0, 0);
    }

    /* renamed from: b */
    public static C2891n m11973b(Class<?> cls) {
        return new C2891n(cls, 1, 0);
    }

    /* renamed from: c */
    public static C2891n m11974c(Class<?> cls) {
        return new C2891n(cls, 2, 0);
    }

    /* renamed from: a */
    public Class<?> mo9565a() {
        return this.f8367a;
    }

    /* renamed from: b */
    public boolean mo9566b() {
        return this.f8369c == 0;
    }

    /* renamed from: c */
    public boolean mo9567c() {
        return this.f8368b == 1;
    }

    /* renamed from: d */
    public boolean mo9568d() {
        return this.f8368b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2891n)) {
            return false;
        }
        C2891n nVar = (C2891n) obj;
        return this.f8367a == nVar.f8367a && this.f8368b == nVar.f8368b && this.f8369c == nVar.f8369c;
    }

    public int hashCode() {
        return ((((this.f8367a.hashCode() ^ 1000003) * 1000003) ^ this.f8368b) * 1000003) ^ this.f8369c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f8367a);
        sb.append(", type=");
        int i = this.f8368b;
        boolean z = true;
        String str = i == 1 ? "required" : i == 0 ? "optional" : "set";
        sb.append(str);
        sb.append(", direct=");
        if (this.f8369c != 0) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
