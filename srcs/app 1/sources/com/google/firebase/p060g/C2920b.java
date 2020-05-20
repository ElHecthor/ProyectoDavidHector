package com.google.firebase.p060g;

import android.content.Context;
import com.google.firebase.components.C2873d;
import com.google.firebase.components.C2873d.C2875b;
import com.google.firebase.components.C2876e;
import com.google.firebase.components.C2891n;
import com.google.firebase.p060g.C2921c.C2922a;

/* renamed from: com.google.firebase.g.b */
public class C2920b implements C2921c {

    /* renamed from: a */
    private C2923d f8409a;

    private C2920b(Context context) {
        this.f8409a = C2923d.m12053a(context);
    }

    /* renamed from: a */
    public static C2873d<C2921c> m12048a() {
        C2875b a = C2873d.m11915a(C2921c.class);
        a.mo9547a(C2891n.m11973b(Context.class));
        a.mo9546a(C2919a.m12046a());
        return a.mo9548b();
    }

    /* renamed from: a */
    static /* synthetic */ C2921c m12049a(C2876e eVar) {
        return new C2920b((Context) eVar.mo9535a(Context.class));
    }

    /* renamed from: a */
    public C2922a mo9604a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean a = this.f8409a.mo9607a(str, currentTimeMillis);
        boolean a2 = this.f8409a.mo9606a(currentTimeMillis);
        return (!a || !a2) ? a2 ? C2922a.GLOBAL : a ? C2922a.SDK : C2922a.NONE : C2922a.COMBINED;
    }
}
