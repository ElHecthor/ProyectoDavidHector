package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import p071f.p097h.p098e.C3236a;

/* renamed from: androidx.core.app.a */
public class C0343a extends C3236a {

    /* renamed from: c */
    private static C0344a f1622c;

    /* renamed from: androidx.core.app.a$a */
    public interface C0344a {
        /* renamed from: a */
        boolean mo2163a(Activity activity, int i, int i2, Intent intent);
    }

    /* renamed from: a */
    public static C0344a m1776a() {
        return f1622c;
    }

    /* renamed from: a */
    public static void m1777a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: a */
    public static void m1778a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: b */
    public static void m1779b(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    /* renamed from: c */
    public static void m1780c(Activity activity) {
        if (VERSION.SDK_INT >= 28 || !C0347c.m1787a(activity)) {
            activity.recreate();
        }
    }
}
