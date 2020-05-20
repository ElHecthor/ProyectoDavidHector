package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.p */
abstract class C2653p<S> extends Fragment {

    /* renamed from: b0 */
    protected final LinkedHashSet<C2652o<S>> f7659b0 = new LinkedHashSet<>();

    C2653p() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo8686a(C2652o<S> oVar) {
        return this.f7659b0.add(oVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s0 */
    public void mo2653s0() {
        this.f7659b0.clear();
    }
}
