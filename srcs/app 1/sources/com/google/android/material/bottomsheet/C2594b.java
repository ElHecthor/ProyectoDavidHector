package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0092h;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C2585e;

/* renamed from: com.google.android.material.bottomsheet.b */
public class C2594b extends C0092h {

    /* renamed from: p0 */
    private boolean f7384p0;

    /* renamed from: com.google.android.material.bottomsheet.b$b */
    private class C2596b extends C2585e {
        private C2596b() {
        }

        /* renamed from: a */
        public void mo8128a(View view, float f) {
        }

        /* renamed from: a */
        public void mo8129a(View view, int i) {
            if (i == 5) {
                C2594b.this.mo15026x0();
            }
        }
    }

    /* renamed from: a */
    private void m10528a(BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.f7384p0 = z;
        if (bottomSheetBehavior.mo8115b() == 5) {
            mo15026x0();
            return;
        }
        if (mo2655u0() instanceof C2589a) {
            ((C2589a) mo2655u0()).mo8137d();
        }
        bottomSheetBehavior.mo8112a((C2585e) new C2596b());
        bottomSheetBehavior.mo8123e(5);
    }

    /* renamed from: k */
    private boolean m10530k(boolean z) {
        Dialog u0 = mo2655u0();
        if (u0 instanceof C2589a) {
            C2589a aVar = (C2589a) u0;
            BottomSheetBehavior b = aVar.mo8134b();
            if (b.mo8121c() && aVar.mo8135c()) {
                m10528a(b, z);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void mo15026x0() {
        if (this.f7384p0) {
            super.mo2654t0();
        } else {
            super.mo2653s0();
        }
    }

    /* renamed from: n */
    public Dialog mo376n(Bundle bundle) {
        return new C2589a(mo2568n(), mo2656v0());
    }

    /* renamed from: s0 */
    public void mo2653s0() {
        if (!m10530k(false)) {
            super.mo2653s0();
        }
    }
}
