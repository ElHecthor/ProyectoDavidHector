package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.n */
final class C2966n extends C2972q<Void> {
    C2966n(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9680a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo9687a(null);
        } else {
            mo9686a(new C2970p(4, "Invalid response to one way request"));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo9681a() {
        return true;
    }
}
