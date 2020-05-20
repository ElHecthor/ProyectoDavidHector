package p071f.p097h.p108m.p109f0;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: f.h.m.f0.b */
public final class C3346b {
    /* renamed from: a */
    public static int m13626a(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m13627a(AccessibilityEvent accessibilityEvent, int i) {
        if (VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
