package p147g.p156d.p157a.p158a.p159i;

import java.util.Arrays;
import p147g.p156d.p157a.p158a.C3739b;

/* renamed from: g.d.a.a.i.g */
public final class C3760g {

    /* renamed from: a */
    private final C3739b f10652a;

    /* renamed from: b */
    private final byte[] f10653b;

    public C3760g(C3739b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f10652a = bVar;
            this.f10653b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    /* renamed from: a */
    public byte[] mo11941a() {
        return this.f10653b;
    }

    /* renamed from: b */
    public C3739b mo11942b() {
        return this.f10652a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3760g)) {
            return false;
        }
        C3760g gVar = (C3760g) obj;
        if (!this.f10652a.equals(gVar.f10652a)) {
            return false;
        }
        return Arrays.equals(this.f10653b, gVar.f10653b);
    }

    public int hashCode() {
        return ((this.f10652a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10653b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EncodedPayload{encoding=");
        sb.append(this.f10652a);
        sb.append(", bytes=[...]}");
        return sb.toString();
    }
}
