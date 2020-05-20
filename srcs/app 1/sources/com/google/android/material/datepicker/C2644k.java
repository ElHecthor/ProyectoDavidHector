package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.k */
public final class C2644k<S> extends C2653p<S> {

    /* renamed from: c0 */
    private C2620d<S> f7636c0;

    /* renamed from: d0 */
    private C2614a f7637d0;

    /* renamed from: com.google.android.material.datepicker.k$a */
    class C2645a implements C2652o<S> {
        C2645a() {
        }

        /* renamed from: a */
        public void mo8652a(S s) {
            Iterator it = C2644k.this.f7659b0.iterator();
            while (it.hasNext()) {
                ((C2652o) it.next()).mo8652a(s);
            }
        }
    }

    /* renamed from: a */
    static <T> C2644k<T> m10910a(C2620d<T> dVar, C2614a aVar) {
        C2644k<T> kVar = new C2644k<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.mo2566m(bundle);
        return kVar;
    }

    /* renamed from: a */
    public View mo2488a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f7636c0.mo8618a(layoutInflater, viewGroup, bundle, this.f7637d0, new C2645a());
    }

    /* renamed from: c */
    public void mo2524c(Bundle bundle) {
        super.mo2524c(bundle);
        if (bundle == null) {
            bundle = mo2562l();
        }
        this.f7636c0 = (C2620d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f7637d0 = (C2614a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    /* renamed from: e */
    public void mo2536e(Bundle bundle) {
        super.mo2536e(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f7636c0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7637d0);
    }
}
