package androidx.media;

import java.util.Arrays;

/* renamed from: androidx.media.c */
class C0550c implements C0548a {

    /* renamed from: a */
    int f2270a = 0;

    /* renamed from: b */
    int f2271b = 0;

    /* renamed from: c */
    int f2272c = 0;

    /* renamed from: d */
    int f2273d = -1;

    C0550c() {
    }

    /* renamed from: a */
    public int mo3092a() {
        return this.f2271b;
    }

    /* renamed from: b */
    public int mo3093b() {
        int i = this.f2272c;
        int c = mo3094c();
        if (c == 6) {
            i |= 4;
        } else if (c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int mo3094c() {
        int i = this.f2273d;
        return i != -1 ? i : AudioAttributesCompat.m2802a(false, this.f2272c, this.f2270a);
    }

    /* renamed from: d */
    public int mo3095d() {
        return this.f2270a;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C0550c)) {
            return false;
        }
        C0550c cVar = (C0550c) obj;
        if (this.f2271b == cVar.mo3092a() && this.f2272c == cVar.mo3093b() && this.f2270a == cVar.mo3095d() && this.f2273d == cVar.f2273d) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2271b), Integer.valueOf(this.f2272c), Integer.valueOf(this.f2270a), Integer.valueOf(this.f2273d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f2273d != -1) {
            sb.append(" stream=");
            sb.append(this.f2273d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m2803a(this.f2270a));
        sb.append(" content=");
        sb.append(this.f2271b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f2272c).toUpperCase());
        return sb.toString();
    }
}
