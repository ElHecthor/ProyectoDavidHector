package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C2148s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.f5 */
final class C2299f5 {

    /* renamed from: A */
    private long f6403A;

    /* renamed from: B */
    private long f6404B;

    /* renamed from: C */
    private long f6405C;

    /* renamed from: D */
    private String f6406D;

    /* renamed from: E */
    private boolean f6407E;

    /* renamed from: F */
    private long f6408F;

    /* renamed from: G */
    private long f6409G;

    /* renamed from: a */
    private final C2263c5 f6410a;

    /* renamed from: b */
    private final String f6411b;

    /* renamed from: c */
    private String f6412c;

    /* renamed from: d */
    private String f6413d;

    /* renamed from: e */
    private String f6414e;

    /* renamed from: f */
    private String f6415f;

    /* renamed from: g */
    private long f6416g;

    /* renamed from: h */
    private long f6417h;

    /* renamed from: i */
    private long f6418i;

    /* renamed from: j */
    private String f6419j;

    /* renamed from: k */
    private long f6420k;

    /* renamed from: l */
    private String f6421l;

    /* renamed from: m */
    private long f6422m;

    /* renamed from: n */
    private long f6423n;

    /* renamed from: o */
    private boolean f6424o;

    /* renamed from: p */
    private long f6425p;

    /* renamed from: q */
    private boolean f6426q;

    /* renamed from: r */
    private boolean f6427r;

    /* renamed from: s */
    private String f6428s;

    /* renamed from: t */
    private Boolean f6429t;

    /* renamed from: u */
    private long f6430u;

    /* renamed from: v */
    private List<String> f6431v;

    /* renamed from: w */
    private String f6432w;

    /* renamed from: x */
    private long f6433x;

    /* renamed from: y */
    private long f6434y;

    /* renamed from: z */
    private long f6435z;

    C2299f5(C2263c5 c5Var, String str) {
        C2148s.m8834a(c5Var);
        C2148s.m8844b(str);
        this.f6410a = c5Var;
        this.f6411b = str;
        c5Var.mo7097i().mo7274c();
    }

    /* renamed from: A */
    public final boolean mo7283A() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6424o;
    }

    /* renamed from: B */
    public final long mo7284B() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6416g;
    }

    /* renamed from: C */
    public final long mo7285C() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6408F;
    }

    /* renamed from: D */
    public final long mo7286D() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6409G;
    }

    /* renamed from: E */
    public final void mo7287E() {
        this.f6410a.mo7097i().mo7274c();
        long j = this.f6416g + 1;
        if (j > 2147483647L) {
            this.f6410a.mo7098j().mo7818w().mo7089a("Bundle index overflow. appId", C2516y3.m10125a(this.f6411b));
            j = 0;
        }
        this.f6407E = true;
        this.f6416g = j;
    }

    /* renamed from: F */
    public final long mo7288F() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6433x;
    }

    /* renamed from: G */
    public final long mo7289G() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6434y;
    }

    /* renamed from: H */
    public final long mo7290H() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6435z;
    }

    /* renamed from: I */
    public final long mo7291I() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6403A;
    }

    /* renamed from: a */
    public final void mo7292a(long j) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6417h != j;
        this.f6417h = j;
    }

    /* renamed from: a */
    public final void mo7293a(Boolean bool) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= !C2489v9.m10014a(this.f6429t, bool);
        this.f6429t = bool;
    }

    /* renamed from: a */
    public final void mo7294a(String str) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= !C2489v9.m10027c(this.f6412c, str);
        this.f6412c = str;
    }

    /* renamed from: a */
    public final void mo7295a(List<String> list) {
        this.f6410a.mo7097i().mo7274c();
        if (!C2489v9.m10018a(this.f6431v, list)) {
            this.f6407E = true;
            this.f6431v = list != null ? new ArrayList(list) : null;
        }
    }

    /* renamed from: a */
    public final void mo7296a(boolean z) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6424o != z;
        this.f6424o = z;
    }

    /* renamed from: a */
    public final boolean mo7297a() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6407E;
    }

    /* renamed from: b */
    public final long mo7298b() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6405C;
    }

    /* renamed from: b */
    public final void mo7299b(long j) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6418i != j;
        this.f6418i = j;
    }

    /* renamed from: b */
    public final void mo7300b(String str) {
        this.f6410a.mo7097i().mo7274c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f6407E |= !C2489v9.m10027c(this.f6413d, str);
        this.f6413d = str;
    }

    /* renamed from: b */
    public final void mo7301b(boolean z) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6426q != z;
        this.f6426q = z;
    }

    /* renamed from: c */
    public final long mo7302c() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6404B;
    }

    /* renamed from: c */
    public final void mo7303c(long j) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6420k != j;
        this.f6420k = j;
    }

    /* renamed from: c */
    public final void mo7304c(String str) {
        this.f6410a.mo7097i().mo7274c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f6407E |= !C2489v9.m10027c(this.f6428s, str);
        this.f6428s = str;
    }

    /* renamed from: c */
    public final void mo7305c(boolean z) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6427r != z;
        this.f6427r = z;
    }

    /* renamed from: d */
    public final String mo7306d() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6406D;
    }

    /* renamed from: d */
    public final void mo7307d(long j) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6422m != j;
        this.f6422m = j;
    }

    /* renamed from: d */
    public final void mo7308d(String str) {
        this.f6410a.mo7097i().mo7274c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f6407E |= !C2489v9.m10027c(this.f6432w, str);
        this.f6432w = str;
    }

    /* renamed from: e */
    public final String mo7309e() {
        this.f6410a.mo7097i().mo7274c();
        String str = this.f6406D;
        mo7323i((String) null);
        return str;
    }

    /* renamed from: e */
    public final void mo7310e(long j) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6423n != j;
        this.f6423n = j;
    }

    /* renamed from: e */
    public final void mo7311e(String str) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= !C2489v9.m10027c(this.f6414e, str);
        this.f6414e = str;
    }

    /* renamed from: f */
    public final long mo7312f() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6425p;
    }

    /* renamed from: f */
    public final void mo7313f(long j) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6430u != j;
        this.f6430u = j;
    }

    /* renamed from: f */
    public final void mo7314f(String str) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= !C2489v9.m10027c(this.f6415f, str);
        this.f6415f = str;
    }

    /* renamed from: g */
    public final void mo7315g(long j) {
        boolean z = true;
        C2148s.m8841a(j >= 0);
        this.f6410a.mo7097i().mo7274c();
        boolean z2 = this.f6407E;
        if (this.f6416g == j) {
            z = false;
        }
        this.f6407E = z | z2;
        this.f6416g = j;
    }

    /* renamed from: g */
    public final void mo7316g(String str) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= !C2489v9.m10027c(this.f6419j, str);
        this.f6419j = str;
    }

    /* renamed from: g */
    public final boolean mo7317g() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6426q;
    }

    /* renamed from: h */
    public final void mo7318h(long j) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6408F != j;
        this.f6408F = j;
    }

    /* renamed from: h */
    public final void mo7319h(String str) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= !C2489v9.m10027c(this.f6421l, str);
        this.f6421l = str;
    }

    /* renamed from: h */
    public final boolean mo7320h() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6427r;
    }

    /* renamed from: i */
    public final Boolean mo7321i() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6429t;
    }

    /* renamed from: i */
    public final void mo7322i(long j) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6409G != j;
        this.f6409G = j;
    }

    /* renamed from: i */
    public final void mo7323i(String str) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= !C2489v9.m10027c(this.f6406D, str);
        this.f6406D = str;
    }

    /* renamed from: j */
    public final List<String> mo7324j() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6431v;
    }

    /* renamed from: j */
    public final void mo7325j(long j) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6433x != j;
        this.f6433x = j;
    }

    /* renamed from: k */
    public final void mo7326k() {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E = false;
    }

    /* renamed from: k */
    public final void mo7327k(long j) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6434y != j;
        this.f6434y = j;
    }

    /* renamed from: l */
    public final String mo7328l() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6411b;
    }

    /* renamed from: l */
    public final void mo7329l(long j) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6435z != j;
        this.f6435z = j;
    }

    /* renamed from: m */
    public final String mo7330m() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6412c;
    }

    /* renamed from: m */
    public final void mo7331m(long j) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6403A != j;
        this.f6403A = j;
    }

    /* renamed from: n */
    public final String mo7332n() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6413d;
    }

    /* renamed from: n */
    public final void mo7333n(long j) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6405C != j;
        this.f6405C = j;
    }

    /* renamed from: o */
    public final String mo7334o() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6428s;
    }

    /* renamed from: o */
    public final void mo7335o(long j) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6404B != j;
        this.f6404B = j;
    }

    /* renamed from: p */
    public final String mo7336p() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6432w;
    }

    /* renamed from: p */
    public final void mo7337p(long j) {
        this.f6410a.mo7097i().mo7274c();
        this.f6407E |= this.f6425p != j;
        this.f6425p = j;
    }

    /* renamed from: q */
    public final String mo7338q() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6414e;
    }

    /* renamed from: r */
    public final String mo7339r() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6415f;
    }

    /* renamed from: s */
    public final long mo7340s() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6417h;
    }

    /* renamed from: t */
    public final long mo7341t() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6418i;
    }

    /* renamed from: u */
    public final String mo7342u() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6419j;
    }

    /* renamed from: v */
    public final long mo7343v() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6420k;
    }

    /* renamed from: w */
    public final String mo7344w() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6421l;
    }

    /* renamed from: x */
    public final long mo7345x() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6422m;
    }

    /* renamed from: y */
    public final long mo7346y() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6423n;
    }

    /* renamed from: z */
    public final long mo7347z() {
        this.f6410a.mo7097i().mo7274c();
        return this.f6430u;
    }
}
