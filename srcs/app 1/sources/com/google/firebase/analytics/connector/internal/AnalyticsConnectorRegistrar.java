package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.p056a.C2861a;
import com.google.firebase.components.C2873d;
import com.google.firebase.components.C2873d.C2875b;
import com.google.firebase.components.C2882h;
import com.google.firebase.components.C2891n;
import com.google.firebase.p059f.C2918d;
import com.google.firebase.p066j.C3042g;
import java.util.Arrays;
import java.util.List;

@Keep
public class AnalyticsConnectorRegistrar implements C2882h {
    @SuppressLint({"MissingPermission"})
    @Keep
    public List<C2873d<?>> getComponents() {
        C2875b a = C2873d.m11915a(C2861a.class);
        a.mo9547a(C2891n.m11973b(FirebaseApp.class));
        a.mo9547a(C2891n.m11973b(Context.class));
        a.mo9547a(C2891n.m11973b(C2918d.class));
        a.mo9546a(C2866a.f8328a);
        a.mo9549c();
        return Arrays.asList(new C2873d[]{a.mo9548b(), C3042g.m12399a("fire-analytics", "17.4.1")});
    }
}
