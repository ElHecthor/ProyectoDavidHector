package com.bumptech.glide.load;

import com.bumptech.glide.p029t.C1299b;
import java.security.MessageDigest;
import p071f.p088e.C3162a;
import p071f.p088e.C3175g;

/* renamed from: com.bumptech.glide.load.i */
public final class C0873i implements C0869g {

    /* renamed from: b */
    private final C3162a<C0870h<?>, Object> f3396b = new C1299b();

    /* renamed from: a */
    private static <T> void m4581a(C0870h<T> hVar, Object obj, MessageDigest messageDigest) {
        hVar.mo4622a(obj, messageDigest);
    }

    /* renamed from: a */
    public <T> C0873i mo4627a(C0870h<T> hVar, T t) {
        this.f3396b.put(hVar, t);
        return this;
    }

    /* renamed from: a */
    public <T> T mo4628a(C0870h<T> hVar) {
        return this.f3396b.containsKey(hVar) ? this.f3396b.get(hVar) : hVar.mo4621a();
    }

    /* renamed from: a */
    public void mo4629a(C0873i iVar) {
        this.f3396b.mo5346a((C3175g<? extends K, ? extends V>) iVar.f3396b);
    }

    /* renamed from: a */
    public void mo4618a(MessageDigest messageDigest) {
        for (int i = 0; i < this.f3396b.size(); i++) {
            m4581a((C0870h) this.f3396b.mo10271b(i), this.f3396b.mo10274d(i), messageDigest);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0873i)) {
            return false;
        }
        return this.f3396b.equals(((C0873i) obj).f3396b);
    }

    public int hashCode() {
        return this.f3396b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Options{values=");
        sb.append(this.f3396b);
        sb.append('}');
        return sb.toString();
    }
}
