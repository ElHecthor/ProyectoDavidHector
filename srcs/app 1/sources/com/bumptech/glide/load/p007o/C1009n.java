package com.bumptech.glide.load.p007o;

import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0877m;
import com.bumptech.glide.p029t.C1309j;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.o.n */
class C1009n implements C0869g {

    /* renamed from: b */
    private final Object f3699b;

    /* renamed from: c */
    private final int f3700c;

    /* renamed from: d */
    private final int f3701d;

    /* renamed from: e */
    private final Class<?> f3702e;

    /* renamed from: f */
    private final Class<?> f3703f;

    /* renamed from: g */
    private final C0869g f3704g;

    /* renamed from: h */
    private final Map<Class<?>, C0877m<?>> f3705h;

    /* renamed from: i */
    private final C0873i f3706i;

    /* renamed from: j */
    private int f3707j;

    C1009n(Object obj, C0869g gVar, int i, int i2, Map<Class<?>, C0877m<?>> map, Class<?> cls, Class<?> cls2, C0873i iVar) {
        C1309j.m6149a(obj);
        this.f3699b = obj;
        C1309j.m6150a(gVar, "Signature must not be null");
        this.f3704g = gVar;
        this.f3700c = i;
        this.f3701d = i2;
        C1309j.m6149a(map);
        this.f3705h = map;
        C1309j.m6150a(cls, "Resource class must not be null");
        this.f3702e = cls;
        C1309j.m6150a(cls2, "Transcode class must not be null");
        this.f3703f = cls2;
        C1309j.m6149a(iVar);
        this.f3706i = iVar;
    }

    /* renamed from: a */
    public void mo4618a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1009n)) {
            return false;
        }
        C1009n nVar = (C1009n) obj;
        return this.f3699b.equals(nVar.f3699b) && this.f3704g.equals(nVar.f3704g) && this.f3701d == nVar.f3701d && this.f3700c == nVar.f3700c && this.f3705h.equals(nVar.f3705h) && this.f3702e.equals(nVar.f3702e) && this.f3703f.equals(nVar.f3703f) && this.f3706i.equals(nVar.f3706i);
    }

    public int hashCode() {
        if (this.f3707j == 0) {
            int hashCode = this.f3699b.hashCode();
            this.f3707j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f3704g.hashCode();
            this.f3707j = hashCode2;
            int i = (hashCode2 * 31) + this.f3700c;
            this.f3707j = i;
            int i2 = (i * 31) + this.f3701d;
            this.f3707j = i2;
            int hashCode3 = (i2 * 31) + this.f3705h.hashCode();
            this.f3707j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f3702e.hashCode();
            this.f3707j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f3703f.hashCode();
            this.f3707j = hashCode5;
            this.f3707j = (hashCode5 * 31) + this.f3706i.hashCode();
        }
        return this.f3707j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EngineKey{model=");
        sb.append(this.f3699b);
        sb.append(", width=");
        sb.append(this.f3700c);
        sb.append(", height=");
        sb.append(this.f3701d);
        sb.append(", resourceClass=");
        sb.append(this.f3702e);
        sb.append(", transcodeClass=");
        sb.append(this.f3703f);
        sb.append(", signature=");
        sb.append(this.f3704g);
        sb.append(", hashCode=");
        sb.append(this.f3707j);
        sb.append(", transformations=");
        sb.append(this.f3705h);
        sb.append(", options=");
        sb.append(this.f3706i);
        sb.append('}');
        return sb.toString();
    }
}
