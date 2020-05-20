package com.bumptech.glide.p029t;

/* renamed from: com.bumptech.glide.t.i */
public class C1308i {

    /* renamed from: a */
    private Class<?> f4307a;

    /* renamed from: b */
    private Class<?> f4308b;

    /* renamed from: c */
    private Class<?> f4309c;

    public C1308i() {
    }

    public C1308i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        mo5381a(cls, cls2, cls3);
    }

    /* renamed from: a */
    public void mo5381a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f4307a = cls;
        this.f4308b = cls2;
        this.f4309c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1308i.class != obj.getClass()) {
            return false;
        }
        C1308i iVar = (C1308i) obj;
        return this.f4307a.equals(iVar.f4307a) && this.f4308b.equals(iVar.f4308b) && C1310k.m6171b((Object) this.f4309c, (Object) iVar.f4309c);
    }

    public int hashCode() {
        int hashCode = ((this.f4307a.hashCode() * 31) + this.f4308b.hashCode()) * 31;
        Class<?> cls = this.f4309c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiClassKey{first=");
        sb.append(this.f4307a);
        sb.append(", second=");
        sb.append(this.f4308b);
        sb.append('}');
        return sb.toString();
    }
}
