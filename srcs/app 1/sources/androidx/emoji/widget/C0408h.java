package androidx.emoji.widget;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p071f.p115k.p117c.C3419a;
import p071f.p115k.p117c.C3419a.C3424d;

/* renamed from: androidx.emoji.widget.h */
final class C0408h implements TextWatcher {

    /* renamed from: f */
    private final EditText f1846f;

    /* renamed from: g */
    private C3424d f1847g;

    /* renamed from: h */
    private int f1848h = Integer.MAX_VALUE;

    /* renamed from: i */
    private int f1849i = 0;

    /* renamed from: androidx.emoji.widget.h$a */
    private static class C0409a extends C3424d {

        /* renamed from: a */
        private final Reference<EditText> f1850a;

        C0409a(EditText editText) {
            this.f1850a = new WeakReference(editText);
        }

        /* renamed from: a */
        public void mo2414a() {
            super.mo2414a();
            EditText editText = (EditText) this.f1850a.get();
            if (editText != null && editText.isAttachedToWindow()) {
                Editable editableText = editText.getEditableText();
                int selectionStart = Selection.getSelectionStart(editableText);
                int selectionEnd = Selection.getSelectionEnd(editableText);
                C3419a.m14025e().mo10927a((CharSequence) editableText);
                C0402e.m2067a(editableText, selectionStart, selectionEnd);
            }
        }
    }

    C0408h(EditText editText) {
        this.f1846f = editText;
    }

    /* renamed from: a */
    private C3424d m2079a() {
        if (this.f1847g == null) {
            this.f1847g = new C0409a(this.f1846f);
        }
        return this.f1847g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2427a(int i) {
        this.f1849i = i;
    }

    public void afterTextChanged(Editable editable) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2429b(int i) {
        this.f1848h = i;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r9 != 3) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            android.widget.EditText r0 = r6.f1846f
            boolean r0 = r0.isInEditMode()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            if (r9 > r10) goto L_0x003d
            boolean r9 = r7 instanceof android.text.Spannable
            if (r9 == 0) goto L_0x003d
            f.k.c.a r9 = p071f.p115k.p117c.C3419a.m14025e()
            int r9 = r9.mo10934b()
            if (r9 == 0) goto L_0x0032
            r0 = 1
            if (r9 == r0) goto L_0x0020
            r7 = 3
            if (r9 == r7) goto L_0x0032
            goto L_0x003d
        L_0x0020:
            r1 = r7
            android.text.Spannable r1 = (android.text.Spannable) r1
            f.k.c.a r0 = p071f.p115k.p117c.C3419a.m14025e()
            int r3 = r8 + r10
            int r4 = r6.f1848h
            int r5 = r6.f1849i
            r2 = r8
            r0.mo10930a(r1, r2, r3, r4, r5)
            goto L_0x003d
        L_0x0032:
            f.k.c.a r7 = p071f.p115k.p117c.C3419a.m14025e()
            f.k.c.a$d r8 = r6.m2079a()
            r7.mo10932a(r8)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji.widget.C0408h.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
