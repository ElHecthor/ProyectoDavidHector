package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.C2873d;
import com.google.firebase.components.C2873d.C2875b;
import com.google.firebase.components.C2882h;
import com.google.firebase.components.C2891n;
import com.google.firebase.iid.p063b.C2931a;
import com.google.firebase.installations.C3004h;
import com.google.firebase.p059f.C2918d;
import com.google.firebase.p060g.C2921c;
import com.google.firebase.p066j.C3042g;
import com.google.firebase.p066j.C3043h;
import java.util.Arrays;
import java.util.List;

@Keep
public final class Registrar implements C2882h {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    private static class C2927a implements C2931a {
        public C2927a(FirebaseInstanceId firebaseInstanceId) {
        }
    }

    @Keep
    public final List<C2873d<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        C2875b a = C2873d.m11915a(cls);
        a.mo9547a(C2891n.m11973b(FirebaseApp.class));
        a.mo9547a(C2891n.m11973b(C2918d.class));
        a.mo9547a(C2891n.m11973b(C3043h.class));
        a.mo9547a(C2891n.m11973b(C2921c.class));
        a.mo9547a(C2891n.m11973b(C3004h.class));
        a.mo9546a(C2978t.f8539a);
        a.mo9545a();
        C2873d b = a.mo9548b();
        C2875b a2 = C2873d.m11915a(C2931a.class);
        a2.mo9547a(C2891n.m11973b(cls));
        a2.mo9546a(C2980u.f8541a);
        return Arrays.asList(new C2873d[]{b, a2.mo9548b(), C3042g.m12399a("fire-iid", "20.1.7")});
    }
}
