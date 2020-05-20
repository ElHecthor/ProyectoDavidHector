package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.C2873d;
import com.google.firebase.components.C2873d.C2875b;
import com.google.firebase.components.C2876e;
import com.google.firebase.components.C2882h;
import com.google.firebase.components.C2891n;
import com.google.firebase.p060g.C2921c;
import com.google.firebase.p066j.C3042g;
import com.google.firebase.p066j.C3043h;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseInstallationsRegistrar implements C2882h {
    static /* synthetic */ C3004h lambda$getComponents$0(C2876e eVar) {
        return new C3001g((FirebaseApp) eVar.mo9535a(FirebaseApp.class), (C3043h) eVar.mo9535a(C3043h.class), (C2921c) eVar.mo9535a(C2921c.class));
    }

    public List<C2873d<?>> getComponents() {
        C2875b a = C2873d.m11915a(C3004h.class);
        a.mo9547a(C2891n.m11973b(FirebaseApp.class));
        a.mo9547a(C2891n.m11973b(C2921c.class));
        a.mo9547a(C2891n.m11973b(C3043h.class));
        a.mo9546a(C3007j.m12254a());
        return Arrays.asList(new C2873d[]{a.mo9548b(), C3042g.m12399a("fire-installations", "16.3.0")});
    }
}
