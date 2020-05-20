package p337m.p338f0;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p350n.C6480e;

/* renamed from: m.f0.a */
public final class C6249a {
    /* renamed from: a */
    private static final String m23425a(byte[] bArr) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i2 = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C6480e eVar = new C6480e();
        while (i < bArr.length) {
            if (i == i2) {
                eVar.writeByte(58);
                i += i4;
                if (i == 16) {
                    eVar.writeByte(58);
                }
            } else {
                if (i > 0) {
                    eVar.writeByte(58);
                }
                eVar.mo16783a((long) ((C6250b.m23430a(bArr[i], 255) << 8) | C6250b.m23430a(bArr[i + 1], 255)));
                i += 2;
            }
        }
        return eVar.mo16826v();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        if (r13 == 16) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0099, code lost:
        if (r14 != -1) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009c, code lost:
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ae, code lost:
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.net.InetAddress m23426a(java.lang.String r18, int r19, int r20) {
        /*
            r6 = r18
            r7 = r20
            r8 = 16
            byte[] r9 = new byte[r8]
            r11 = -1
            r12 = r19
            r13 = 0
            r14 = -1
            r15 = -1
        L_0x000e:
            r16 = 0
            if (r12 >= r7) goto L_0x0097
            if (r13 != r8) goto L_0x0015
            return r16
        L_0x0015:
            int r5 = r12 + 2
            if (r5 > r7) goto L_0x0038
            r3 = 0
            r4 = 4
            r17 = 0
            java.lang.String r1 = "::"
            r0 = r18
            r2 = r12
            r10 = r5
            r5 = r17
            boolean r0 = p308k.p313e0.C5787p.m21976a(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0038
            if (r14 == r11) goto L_0x002e
            return r16
        L_0x002e:
            int r13 = r13 + 2
            if (r10 != r7) goto L_0x0035
            r14 = r13
            goto L_0x0097
        L_0x0035:
            r15 = r10
            r14 = r13
            goto L_0x0067
        L_0x0038:
            if (r13 == 0) goto L_0x0066
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r0 = r18
            r2 = r12
            boolean r0 = p308k.p313e0.C5787p.m21976a(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x004b
            int r12 = r12 + 1
            goto L_0x0066
        L_0x004b:
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r0 = r18
            r2 = r12
            boolean r0 = p308k.p313e0.C5787p.m21976a(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0065
            int r0 = r13 + -2
            boolean r0 = m23428a(r6, r15, r7, r9, r0)
            if (r0 != 0) goto L_0x0062
            return r16
        L_0x0062:
            int r13 = r13 + 2
            goto L_0x0097
        L_0x0065:
            return r16
        L_0x0066:
            r15 = r12
        L_0x0067:
            r12 = r15
            r0 = 0
        L_0x0069:
            if (r12 >= r7) goto L_0x007c
            char r1 = r6.charAt(r12)
            int r1 = p337m.p338f0.C6250b.m23431a(r1)
            if (r1 != r11) goto L_0x0076
            goto L_0x007c
        L_0x0076:
            int r0 = r0 << 4
            int r0 = r0 + r1
            int r12 = r12 + 1
            goto L_0x0069
        L_0x007c:
            int r1 = r12 - r15
            if (r1 == 0) goto L_0x0096
            r2 = 4
            if (r1 <= r2) goto L_0x0084
            goto L_0x0096
        L_0x0084:
            int r1 = r13 + 1
            int r2 = r0 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r9[r13] = r2
            int r13 = r1 + 1
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r9[r1] = r0
            goto L_0x000e
        L_0x0096:
            return r16
        L_0x0097:
            if (r13 == r8) goto L_0x00aa
            if (r14 != r11) goto L_0x009c
            return r16
        L_0x009c:
            int r0 = r13 - r14
            int r1 = 16 - r0
            java.lang.System.arraycopy(r9, r14, r9, r1, r0)
            int r8 = r8 - r13
            int r8 = r8 + r14
            r0 = 0
            byte r0 = (byte) r0
            java.util.Arrays.fill(r9, r14, r8, r0)
        L_0x00aa:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.C6249a.m23426a(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: a */
    private static final boolean m23427a(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || C5788q.m21984a((CharSequence) " #%/:?@[\\]", charAt, 0, false, 6, (Object) null) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static final boolean m23428a(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (true) {
            boolean z = false;
            if (i >= i2) {
                if (i4 == i3 + 4) {
                    z = true;
                }
                return z;
            } else if (i4 == bArr.length) {
                return false;
            } else {
                if (i4 != i3) {
                    if (str.charAt(i) != '.') {
                        return false;
                    }
                    i++;
                }
                int i5 = i;
                int i6 = 0;
                while (i5 < i2) {
                    char charAt = str.charAt(i5);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    } else if (i6 == 0 && i != i5) {
                        return false;
                    } else {
                        i6 = ((i6 * 10) + charAt) - 48;
                        if (i6 > 255) {
                            return false;
                        }
                        i5++;
                    }
                }
                if (i5 - i == 0) {
                    return false;
                }
                int i7 = i4 + 1;
                bArr[i4] = (byte) i6;
                i4 = i7;
                i = i5;
            }
        }
    }

    /* renamed from: b */
    public static final String m23429b(String str) {
        C5942k.m22327b(str, "$this$toCanonicalHost");
        boolean z = false;
        String str2 = null;
        if (C5788q.m22009a((CharSequence) str, (CharSequence) ":", false, 2, (Object) null)) {
            InetAddress a = (!C5787p.m21980b(str, "[", false, 2, null) || !C5787p.m21978a(str, "]", false, 2, null)) ? m23426a(str, 0, str.length()) : m23426a(str, 1, str.length() - 1);
            if (a == null) {
                return null;
            }
            byte[] address = a.getAddress();
            if (address.length == 16) {
                C5942k.m22324a((Object) address, "address");
                return m23425a(address);
            } else if (address.length == 4) {
                return a.getHostAddress();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid IPv6 address: '");
                sb.append(str);
                sb.append('\'');
                throw new AssertionError(sb.toString());
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                C5942k.m22324a((Object) ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                C5942k.m22324a((Object) locale, "Locale.US");
                if (ascii != null) {
                    String lowerCase = ascii.toLowerCase(locale);
                    C5942k.m22324a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (lowerCase.length() == 0) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    if (!m23427a(lowerCase)) {
                        str2 = lowerCase;
                    }
                    return str2;
                }
                throw new C5809q("null cannot be cast to non-null type java.lang.String");
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }
}
