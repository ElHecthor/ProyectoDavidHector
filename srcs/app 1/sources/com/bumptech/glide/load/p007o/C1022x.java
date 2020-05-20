package com.bumptech.glide.load.p007o;

import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0877m;
import com.bumptech.glide.load.p007o.p008a0.C0916b;
import com.bumptech.glide.p029t.C1306g;
import com.bumptech.glide.p029t.C1310k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.o.x */
final class C1022x implements C0869g {

    /* renamed from: j */
    private static final C1306g<Class<?>, byte[]> f3743j = new C1306g<>(50);

    /* renamed from: b */
    private final C0916b f3744b;

    /* renamed from: c */
    private final C0869g f3745c;

    /* renamed from: d */
    private final C0869g f3746d;

    /* renamed from: e */
    private final int f3747e;

    /* renamed from: f */
    private final int f3748f;

    /* renamed from: g */
    private final Class<?> f3749g;

    /* renamed from: h */
    private final C0873i f3750h;

    /* renamed from: i */
    private final C0877m<?> f3751i;

    C1022x(C0916b bVar, C0869g gVar, C0869g gVar2, int i, int i2, C0877m<?> mVar, Class<?> cls, C0873i iVar) {
        this.f3744b = bVar;
        this.f3745c = gVar;
        this.f3746d = gVar2;
        this.f3747e = i;
        this.f3748f = i2;
        this.f3751i = mVar;
        this.f3749g = cls;
        this.f3750h = iVar;
    }

    /* renamed from: a */
    private byte[] m5079a() {
        byte[] bArr = (byte[]) f3743j.mo5369a(this.f3749g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f3749g.getName().getBytes(C0869g.f3390a);
        f3743j.mo5373b(this.f3749g, bytes);
        return bytes;
    }

    /* renamed from: a */
    public void mo4618a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f3744b.mo4689a(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f3747e).putInt(this.f3748f).array();
        this.f3746d.mo4618a(messageDigest);
        this.f3745c.mo4618a(messageDigest);
        messageDigest.update(bArr);
        C0877m<?> mVar = this.f3751i;
        if (mVar != null) {
            mVar.mo4618a(messageDigest);
        }
        this.f3750h.mo4618a(messageDigest);
        messageDigest.update(m5079a());
        this.f3744b.put(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1022x)) {
            return false;
        }
        C1022x xVar = (C1022x) obj;
        return this.f3748f == xVar.f3748f && this.f3747e == xVar.f3747e && C1310k.m6171b((Object) this.f3751i, (Object) xVar.f3751i) && this.f3749g.equals(xVar.f3749g) && this.f3745c.equals(xVar.f3745c) && this.f3746d.equals(xVar.f3746d) && this.f3750h.equals(xVar.f3750h);
    }

    public int hashCode() {
        int hashCode = (((((this.f3745c.hashCode() * 31) + this.f3746d.hashCode()) * 31) + this.f3747e) * 31) + this.f3748f;
        C0877m<?> mVar = this.f3751i;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return (((hashCode * 31) + this.f3749g.hashCode()) * 31) + this.f3750h.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResourceCacheKey{sourceKey=");
        sb.append(this.f3745c);
        sb.append(", signature=");
        sb.append(this.f3746d);
        sb.append(", width=");
        sb.append(this.f3747e);
        sb.append(", height=");
        sb.append(this.f3748f);
        sb.append(", decodedResourceClass=");
        sb.append(this.f3749g);
        sb.append(", transformation='");
        sb.append(this.f3751i);
        sb.append('\'');
        sb.append(", options=");
        sb.append(this.f3750h);
        sb.append('}');
        return sb.toString();
    }
}
