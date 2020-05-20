package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.C0425c;

/* renamed from: androidx.appcompat.app.h */
public class C0092h extends C0425c {
    /* renamed from: a */
    public void mo375a(Dialog dialog, int i) {
        if (dialog instanceof C0090g) {
            C0090g gVar = (C0090g) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            gVar.mo363a(1);
            return;
        }
        super.mo375a(dialog, i);
    }

    /* renamed from: n */
    public Dialog mo376n(Bundle bundle) {
        return new C0090g(mo2568n(), mo2656v0());
    }
}
