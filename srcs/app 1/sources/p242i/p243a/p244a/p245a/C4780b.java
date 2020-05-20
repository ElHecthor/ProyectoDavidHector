package p242i.p243a.p244a.p245a;

import android.util.Log;

/* renamed from: i.a.a.a.b */
public class C4780b implements C4795l {

    /* renamed from: a */
    private int f12490a;

    public C4780b() {
        this.f12490a = 4;
    }

    public C4780b(int i) {
        this.f12490a = i;
    }

    /* renamed from: a */
    public void mo13785a(int i, String str, String str2) {
        mo13786a(i, str, str2, false);
    }

    /* renamed from: a */
    public void mo13786a(int i, String str, String str2, boolean z) {
        if (z || mo13789a(str, i)) {
            Log.println(i, str, str2);
        }
    }

    /* renamed from: a */
    public void mo13787a(String str, String str2) {
        mo13791b(str, str2, null);
    }

    /* renamed from: a */
    public void mo13788a(String str, String str2, Throwable th) {
        if (mo13789a(str, 3)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: a */
    public boolean mo13789a(String str, int i) {
        return this.f12490a <= i || Log.isLoggable(str, i);
    }

    /* renamed from: b */
    public void mo13790b(String str, String str2) {
        mo13795d(str, str2, null);
    }

    /* renamed from: b */
    public void mo13791b(String str, String str2, Throwable th) {
        if (mo13789a(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: c */
    public void mo13792c(String str, String str2) {
        mo13793c(str, str2, null);
    }

    /* renamed from: c */
    public void mo13793c(String str, String str2, Throwable th) {
        if (mo13789a(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: d */
    public void mo13794d(String str, String str2) {
        mo13797e(str, str2, null);
    }

    /* renamed from: d */
    public void mo13795d(String str, String str2, Throwable th) {
        if (mo13789a(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    /* renamed from: e */
    public void mo13796e(String str, String str2) {
        mo13788a(str, str2, (Throwable) null);
    }

    /* renamed from: e */
    public void mo13797e(String str, String str2, Throwable th) {
        if (mo13789a(str, 2)) {
            Log.v(str, str2, th);
        }
    }
}
