package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C2484v4;
import com.google.android.gms.measurement.internal.C2517y4;
import p071f.p124o.p125a.C3454a;

public final class AppMeasurementReceiver extends C3454a implements C2517y4 {

    /* renamed from: c */
    private C2484v4 f6214c;

    /* renamed from: a */
    public final void mo7036a(Context context, Intent intent) {
        C3454a.m14162b(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f6214c == null) {
            this.f6214c = new C2484v4(this);
        }
        this.f6214c.mo7675a(context, intent);
    }
}
