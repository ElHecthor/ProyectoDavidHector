package p071f.p097h.p105j;

import android.util.Base64;
import java.util.List;
import p071f.p097h.p107l.C3321h;

/* renamed from: f.h.j.a */
public final class C3282a {

    /* renamed from: a */
    private final String f9404a;

    /* renamed from: b */
    private final String f9405b;

    /* renamed from: c */
    private final String f9406c;

    /* renamed from: d */
    private final List<List<byte[]>> f9407d;

    /* renamed from: e */
    private final int f9408e = 0;

    /* renamed from: f */
    private final String f9409f;

    public C3282a(String str, String str2, String str3, List<List<byte[]>> list) {
        C3321h.m13543a(str);
        this.f9404a = str;
        C3321h.m13543a(str2);
        this.f9405b = str2;
        C3321h.m13543a(str3);
        this.f9406c = str3;
        C3321h.m13543a(list);
        this.f9407d = list;
        StringBuilder sb = new StringBuilder(this.f9404a);
        String str4 = "-";
        sb.append(str4);
        sb.append(this.f9405b);
        sb.append(str4);
        sb.append(this.f9406c);
        this.f9409f = sb.toString();
    }

    /* renamed from: a */
    public List<List<byte[]>> mo10628a() {
        return this.f9407d;
    }

    /* renamed from: b */
    public int mo10629b() {
        return this.f9408e;
    }

    /* renamed from: c */
    public String mo10630c() {
        return this.f9409f;
    }

    /* renamed from: d */
    public String mo10631d() {
        return this.f9404a;
    }

    /* renamed from: e */
    public String mo10632e() {
        return this.f9405b;
    }

    /* renamed from: f */
    public String mo10633f() {
        return this.f9406c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: ");
        sb2.append(this.f9404a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.f9405b);
        sb2.append(", mQuery: ");
        sb2.append(this.f9406c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.f9407d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f9407d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("mCertificatesArray: ");
        sb3.append(this.f9408e);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
