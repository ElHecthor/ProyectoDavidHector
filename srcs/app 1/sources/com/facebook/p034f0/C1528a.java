package com.facebook.p034f0;

import com.facebook.C1499a;
import com.facebook.C1787m;
import com.facebook.internal.C1698v;
import java.io.Serializable;

/* renamed from: com.facebook.f0.a */
class C1528a implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: f */
    private final String f4780f;

    /* renamed from: g */
    private final String f4781g;

    /* renamed from: com.facebook.f0.a$b */
    static class C1530b implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: f */
        private final String f4782f;

        /* renamed from: g */
        private final String f4783g;

        private C1530b(String str, String str2) {
            this.f4782f = str;
            this.f4783g = str2;
        }

        private Object readResolve() {
            return new C1528a(this.f4782f, this.f4783g);
        }
    }

    public C1528a(C1499a aVar) {
        this(aVar.mo5692i(), C1787m.m7745f());
    }

    public C1528a(String str, String str2) {
        if (C1698v.m7401c(str)) {
            str = null;
        }
        this.f4780f = str;
        this.f4781g = str2;
    }

    private Object writeReplace() {
        return new C1530b(this.f4780f, this.f4781g);
    }

    /* renamed from: a */
    public String mo5735a() {
        return this.f4780f;
    }

    /* renamed from: b */
    public String mo5736b() {
        return this.f4781g;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C1528a)) {
            return false;
        }
        C1528a aVar = (C1528a) obj;
        if (C1698v.m7388a(aVar.f4780f, this.f4780f) && C1698v.m7388a(aVar.f4781g, this.f4781g)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f4780f;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f4781g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }
}
