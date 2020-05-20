package com.google.android.material.datepicker;

import android.os.Build.VERSION;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.e */
class C2621e {
    /* renamed from: a */
    static String m10844a(long j) {
        return m10845a(j, Locale.getDefault());
    }

    /* renamed from: a */
    static String m10845a(long j, Locale locale) {
        return VERSION.SDK_INT >= 24 ? C2656r.m10950a(locale).format(new Date(j)) : C2656r.m10954b(locale).format(new Date(j));
    }

    /* renamed from: b */
    static String m10846b(long j) {
        return m10847b(j, Locale.getDefault());
    }

    /* renamed from: b */
    static String m10847b(long j, Locale locale) {
        return VERSION.SDK_INT >= 24 ? C2656r.m10958c(locale).format(new Date(j)) : C2656r.m10954b(locale).format(new Date(j));
    }
}
