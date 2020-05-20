package p337m.p338f0.p344h;

import p308k.p323z.p325d.C5942k;
import p337m.p338f0.C6250b;
import p350n.C6485h;

/* renamed from: m.f0.h.e */
public final class C6322e {

    /* renamed from: a */
    public static final C6485h f15652a = C6485h.f16098j.mo16875b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f15653b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    private static final String[] f15654c = new String[64];

    /* renamed from: d */
    private static final String[] f15655d;

    /* renamed from: e */
    public static final C6322e f15656e = new C6322e();

    static {
        String str;
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            C5942k.m22324a((Object) binaryString, "Integer.toBinaryString(it)");
            strArr[i] = C5787p.m21969a(C6250b.m23446a("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f15655d = strArr;
        String[] strArr2 = f15654c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = 0;
        while (true) {
            str = "|PADDED";
            if (i2 >= 1) {
                break;
            }
            int i3 = iArr[i2];
            String[] strArr3 = f15654c;
            strArr3[i3 | 8] = C5942k.m22320a(strArr3[i3], (Object) str);
            i2++;
        }
        String[] strArr4 = f15654c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = f15654c;
                int i8 = i7 | i5;
                StringBuilder sb = new StringBuilder();
                sb.append(f15654c[i7]);
                String str2 = "|";
                sb.append(str2);
                sb.append(f15654c[i5]);
                strArr5[i8] = sb.toString();
                String[] strArr6 = f15654c;
                int i9 = i8 | 8;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f15654c[i7]);
                sb2.append(str2);
                sb2.append(f15654c[i5]);
                sb2.append(str);
                strArr6[i9] = sb2.toString();
            }
        }
        int length = f15654c.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr7 = f15654c;
            if (strArr7[i10] == null) {
                strArr7[i10] = f15655d[i10];
            }
        }
    }

    private C6322e() {
    }

    /* renamed from: a */
    public final String mo16291a(int i, int i2) {
        String str;
        boolean z;
        int i3;
        Object obj;
        String str2;
        String str3;
        if (i2 == 0) {
            return "";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4 || i == 6) {
                return i2 == 1 ? "ACK" : f15655d[i2];
            } else if (!(i == 7 || i == 8)) {
                String[] strArr = f15654c;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    if (str == null) {
                        C5942k.m22323a();
                        throw null;
                    }
                } else {
                    str = f15655d[i2];
                }
                String str4 = str;
                if (i != 5 || (i2 & 4) == 0) {
                    if (i == 0 && (i2 & 32) != 0) {
                        z = false;
                        i3 = 4;
                        obj = null;
                        str2 = "PRIORITY";
                        str3 = "COMPRESSED";
                    }
                    return str4;
                }
                z = false;
                i3 = 4;
                obj = null;
                str2 = "HEADERS";
                str3 = "PUSH_PROMISE";
                str4 = C5787p.m21971a(str4, str2, str3, z, i3, obj);
                return str4;
            }
        }
        return f15655d[i2];
    }

    /* renamed from: a */
    public final String mo16292a(boolean z, int i, int i2, int i3, int i4) {
        String[] strArr = f15653b;
        return C6250b.m23446a("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), i3 < strArr.length ? strArr[i3] : C6250b.m23446a("0x%02x", Integer.valueOf(i3)), mo16291a(i3, i4));
    }
}
