package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.s */
final class C2976s extends C2972q<Bundle> {
    C2976s(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9680a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        mo9687a(bundle2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo9681a() {
        return false;
    }
}
