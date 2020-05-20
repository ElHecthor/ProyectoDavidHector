package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.measurement.internal.C2263c5;

public class Analytics {

    /* renamed from: a */
    private static volatile Analytics f7134a;

    private Analytics(C2263c5 c5Var) {
        C2148s.m8834a(c5Var);
    }

    @Keep
    public static Analytics getInstance(Context context) {
        if (f7134a == null) {
            synchronized (Analytics.class) {
                if (f7134a == null) {
                    f7134a = new Analytics(C2263c5.m9228a(context, null, null));
                }
            }
        }
        return f7134a;
    }
}
