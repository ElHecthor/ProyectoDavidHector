package androidx.emoji.widget;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import p071f.p115k.p117c.C3419a;

/* renamed from: androidx.emoji.widget.i */
class C0410i implements TransformationMethod {

    /* renamed from: f */
    private final TransformationMethod f1851f;

    C0410i(TransformationMethod transformationMethod) {
        this.f1851f = transformationMethod;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f1851f;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && C3419a.m14025e().mo10934b() == 1) {
            charSequence = C3419a.m14025e().mo10927a(charSequence);
        }
        return charSequence;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f1851f;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
