package androidx.emoji.widget;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p071f.p115k.p117c.C3419a;
import p071f.p115k.p117c.C3419a.C3424d;

/* renamed from: androidx.emoji.widget.e */
final class C0402e implements InputFilter {

    /* renamed from: f */
    private final TextView f1839f;

    /* renamed from: g */
    private C3424d f1840g;

    /* renamed from: androidx.emoji.widget.e$a */
    private static class C0403a extends C3424d {

        /* renamed from: a */
        private final Reference<TextView> f1841a;

        C0403a(TextView textView) {
            this.f1841a = new WeakReference(textView);
        }

        /* renamed from: a */
        public void mo2414a() {
            super.mo2414a();
            TextView textView = (TextView) this.f1841a.get();
            if (textView != null && textView.isAttachedToWindow()) {
                CharSequence a = C3419a.m14025e().mo10927a(textView.getText());
                int selectionStart = Selection.getSelectionStart(a);
                int selectionEnd = Selection.getSelectionEnd(a);
                textView.setText(a);
                if (a instanceof Spannable) {
                    C0402e.m2067a((Spannable) a, selectionStart, selectionEnd);
                }
            }
        }
    }

    C0402e(TextView textView) {
        this.f1839f = textView;
    }

    /* renamed from: a */
    private C3424d m2066a() {
        if (this.f1840g == null) {
            this.f1840g = new C0403a(this.f1839f);
        }
        return this.f1840g;
    }

    /* renamed from: a */
    static void m2067a(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f1839f.isInEditMode()) {
            return charSequence;
        }
        int b = C3419a.m14025e().mo10934b();
        if (b != 0) {
            boolean z = true;
            if (b == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f1839f.getText()) {
                    z = false;
                }
                if (z && charSequence != null) {
                    if (!(i == 0 && i2 == charSequence.length())) {
                        charSequence = charSequence.subSequence(i, i2);
                    }
                    charSequence = C3419a.m14025e().mo10928a(charSequence, 0, charSequence.length());
                }
                return charSequence;
            } else if (b != 3) {
                return charSequence;
            }
        }
        C3419a.m14025e().mo10932a(m2066a());
        return charSequence;
    }
}
