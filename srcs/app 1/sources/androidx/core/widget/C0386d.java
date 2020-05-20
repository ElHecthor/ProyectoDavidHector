package androidx.core.widget;

import android.os.Build.VERSION;
import android.widget.EdgeEffect;

/* renamed from: androidx.core.widget.d */
public final class C0386d {
    /* renamed from: a */
    public static void m2010a(EdgeEffect edgeEffect, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
