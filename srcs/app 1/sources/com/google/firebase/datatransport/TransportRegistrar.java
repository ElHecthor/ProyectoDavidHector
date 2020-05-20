package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.C2873d;
import com.google.firebase.components.C2873d.C2875b;
import com.google.firebase.components.C2882h;
import com.google.firebase.components.C2891n;
import java.util.Collections;
import java.util.List;
import p147g.p156d.p157a.p158a.C3744g;

@Keep
public class TransportRegistrar implements C2882h {
    public List<C2873d<?>> getComponents() {
        C2875b a = C2873d.m11915a(C3744g.class);
        a.mo9547a(C2891n.m11973b(Context.class));
        a.mo9546a(C2902a.m11999a());
        return Collections.singletonList(a.mo9548b());
    }
}
