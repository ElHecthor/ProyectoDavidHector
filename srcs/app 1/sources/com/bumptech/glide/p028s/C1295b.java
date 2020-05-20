package com.bumptech.glide.p028s;

import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.p029t.C1309j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.s.b */
public final class C1295b implements C0869g {

    /* renamed from: b */
    private final Object f4286b;

    public C1295b(Object obj) {
        C1309j.m6149a(obj);
        this.f4286b = obj;
    }

    /* renamed from: a */
    public void mo4618a(MessageDigest messageDigest) {
        messageDigest.update(this.f4286b.toString().getBytes(C0869g.f3390a));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1295b)) {
            return false;
        }
        return this.f4286b.equals(((C1295b) obj).f4286b);
    }

    public int hashCode() {
        return this.f4286b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObjectKey{object=");
        sb.append(this.f4286b);
        sb.append('}');
        return sb.toString();
    }
}
