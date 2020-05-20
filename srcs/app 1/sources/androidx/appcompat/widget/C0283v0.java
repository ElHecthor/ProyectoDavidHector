package androidx.appcompat.widget;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: androidx.appcompat.widget.v0 */
public class C0283v0 {
    /* renamed from: a */
    public static void m1404a(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C0285w0.m1436a(view, charSequence);
        }
    }
}
