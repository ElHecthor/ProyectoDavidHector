package p337m.p338f0.p342f;

import java.net.ProtocolException;
import p308k.p323z.p325d.C5942k;
import p337m.C6465y;

/* renamed from: m.f0.f.k */
public final class C6304k {

    /* renamed from: d */
    public static final C6305a f15586d = new C6305a(null);

    /* renamed from: a */
    public final C6465y f15587a;

    /* renamed from: b */
    public final int f15588b;

    /* renamed from: c */
    public final String f15589c;

    /* renamed from: m.f0.f.k$a */
    public static final class C6305a {
        private C6305a() {
        }

        public /* synthetic */ C6305a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6304k mo16265a(String str) {
            C6465y yVar;
            String str2;
            C5942k.m22327b(str, "statusLine");
            int i = 9;
            String str3 = "Unexpected status line: ";
            if (C5787p.m21980b(str, "HTTP/1.", false, 2, null)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(str);
                    throw new ProtocolException(sb.toString());
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    yVar = C6465y.HTTP_1_0;
                } else if (charAt == 1) {
                    yVar = C6465y.HTTP_1_1;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(str);
                    throw new ProtocolException(sb2.toString());
                }
            } else if (C5787p.m21980b(str, "ICY ", false, 2, null)) {
                yVar = C6465y.HTTP_1_0;
                i = 4;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(str);
                throw new ProtocolException(sb3.toString());
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                try {
                    String substring = str.substring(i, i2);
                    C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i2) {
                        str2 = "";
                    } else if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                        C5942k.m22324a((Object) str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str3);
                        sb4.append(str);
                        throw new ProtocolException(sb4.toString());
                    }
                    return new C6304k(yVar, parseInt, str2);
                } catch (NumberFormatException unused) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str3);
                    sb5.append(str);
                    throw new ProtocolException(sb5.toString());
                }
            } else {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str3);
                sb6.append(str);
                throw new ProtocolException(sb6.toString());
            }
        }
    }

    public C6304k(C6465y yVar, int i, String str) {
        C5942k.m22327b(yVar, "protocol");
        C5942k.m22327b(str, "message");
        this.f15587a = yVar;
        this.f15588b = i;
        this.f15589c = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15587a == C6465y.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f15588b);
        sb.append(' ');
        sb.append(this.f15589c);
        String sb2 = sb.toString();
        C5942k.m22324a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
