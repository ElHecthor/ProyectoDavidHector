package p147g.p148a.p149a;

import android.util.Log;

/* renamed from: g.a.a.f */
public class C3690f {

    /* renamed from: c */
    protected static C3690f f10453c = new C3690f();

    /* renamed from: a */
    private volatile boolean f10454a = true;

    /* renamed from: b */
    private volatile int f10455b = 4;

    private C3690f() {
    }

    /* renamed from: a */
    public static C3690f m15021a() {
        return f10453c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo11710a(String str, String str2) {
        if (!this.f10454a || this.f10455b > 3) {
            return 0;
        }
        return Log.d(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo11711a(String str, String str2, Throwable th) {
        if (!this.f10454a || this.f10455b > 6) {
            return 0;
        }
        return Log.e(str, str2, th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo11712a(String str, Throwable th) {
        if (!this.f10454a || this.f10455b > 5) {
            return 0;
        }
        return Log.w(str, th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo11713b(String str, String str2) {
        if (!this.f10454a || this.f10455b > 6) {
            return 0;
        }
        return Log.e(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo11714c(String str, String str2) {
        if (!this.f10454a || this.f10455b > 4) {
            return 0;
        }
        return Log.i(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo11715d(String str, String str2) {
        if (!this.f10454a || this.f10455b > 5) {
            return 0;
        }
        return Log.w(str, str2);
    }
}
