package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.e */
abstract class C2783e {

    /* renamed from: a */
    TextInputLayout f8165a;

    /* renamed from: b */
    Context f8166b;

    /* renamed from: c */
    CheckableImageButton f8167c;

    C2783e(TextInputLayout textInputLayout) {
        this.f8165a = textInputLayout;
        this.f8166b = textInputLayout.getContext();
        this.f8167c = textInputLayout.getEndIconView();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo9318a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9319a(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9331a(int i) {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo9332b() {
        return false;
    }
}
