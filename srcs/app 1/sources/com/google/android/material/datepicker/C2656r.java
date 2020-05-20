package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.r */
class C2656r {
    /* renamed from: a */
    static long m10948a(long j) {
        Calendar d = m10961d();
        d.setTimeInMillis(j);
        return m10952a(d).getTimeInMillis();
    }

    @TargetApi(24)
    /* renamed from: a */
    private static DateFormat m10949a(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m10959c());
        return instanceForSkeleton;
    }

    @TargetApi(24)
    /* renamed from: a */
    static DateFormat m10950a(Locale locale) {
        return m10949a("MMMEd", locale);
    }

    /* renamed from: a */
    private static java.text.DateFormat m10951a(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m10953a());
        return dateInstance;
    }

    /* renamed from: a */
    static Calendar m10952a(Calendar calendar) {
        Calendar b = m10957b(calendar);
        Calendar d = m10961d();
        d.set(b.get(1), b.get(2), b.get(5));
        return d;
    }

    /* renamed from: a */
    private static TimeZone m10953a() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: b */
    static java.text.DateFormat m10954b(Locale locale) {
        return m10951a(0, locale);
    }

    /* renamed from: b */
    private static SimpleDateFormat m10955b(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(m10953a());
        return simpleDateFormat;
    }

    /* renamed from: b */
    static Calendar m10956b() {
        return m10952a(Calendar.getInstance());
    }

    /* renamed from: b */
    static Calendar m10957b(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m10953a());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    @TargetApi(24)
    /* renamed from: c */
    static DateFormat m10958c(Locale locale) {
        return m10949a("yMMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: c */
    private static android.icu.util.TimeZone m10959c() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: d */
    private static SimpleDateFormat m10960d(Locale locale) {
        return m10955b("MMMM, yyyy", locale);
    }

    /* renamed from: d */
    static Calendar m10961d() {
        return m10957b((Calendar) null);
    }

    /* renamed from: e */
    static SimpleDateFormat m10962e() {
        return m10960d(Locale.getDefault());
    }
}
