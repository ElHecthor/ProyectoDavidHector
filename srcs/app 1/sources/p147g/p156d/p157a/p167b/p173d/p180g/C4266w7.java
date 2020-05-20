package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.w7 */
final class C4266w7 {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m17458b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m17467g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m17467g(b3) || m17467g(b4)) {
            throw C3968d5.m16210f();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m17459b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m17467g(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m17467g(b3)))) {
            throw C3968d5.m16210f();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m17460b(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m17467g(b2)) {
            throw C3968d5.m16210f();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m17461b(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m17464d(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m17465e(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m17466f(byte b) {
        return b < -16;
    }

    /* renamed from: g */
    private static boolean m17467g(byte b) {
        return b > -65;
    }
}
