package androidx.emoji.widget;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import p071f.p115k.p117c.C3419a;

/* renamed from: androidx.emoji.widget.d */
final class C0401d extends InputConnectionWrapper {

    /* renamed from: a */
    private final TextView f1838a;

    C0401d(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        this.f1838a = textView;
        C3419a.m14025e().mo10931a(editorInfo);
    }

    /* renamed from: a */
    private Editable m2065a() {
        return this.f1838a.getEditableText();
    }

    public boolean deleteSurroundingText(int i, int i2) {
        return C3419a.m14024a((InputConnection) this, m2065a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return C3419a.m14024a((InputConnection) this, m2065a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
