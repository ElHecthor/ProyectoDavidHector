package p147g.p156d.p157a.p167b.p181e;

import com.google.android.gms.common.api.C1981a;
import com.google.android.gms.common.api.C1981a.C1982a;
import com.google.android.gms.common.api.C1981a.C1993g;
import com.google.android.gms.common.api.Scope;
import p147g.p156d.p157a.p167b.p181e.p182b.C4320a;

/* renamed from: g.d.a.b.e.d */
public final class C4333d {

    /* renamed from: a */
    private static final C1993g<C4320a> f11495a = new C1993g<>();

    /* renamed from: b */
    private static final C1993g<C4320a> f11496b = new C1993g<>();

    /* renamed from: c */
    public static final C1982a<C4320a, C4318a> f11497c = new C4332c();

    /* renamed from: d */
    private static final C1982a<C4320a, Object> f11498d = new C4335f();

    static {
        new Scope("profile");
        new Scope("email");
        new C1981a("SignIn.API", f11497c, f11495a);
        new C1981a("SignIn.INTERNAL_API", f11498d, f11496b);
    }
}
