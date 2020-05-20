package androidx.emoji.widget;

import android.content.Context;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.widget.C0391i;

public class EmojiExtractEditText extends ExtractEditText {

    /* renamed from: f */
    private C0397b f1827f;

    /* renamed from: g */
    private boolean f1828g;

    public EmojiExtractEditText(Context context) {
        super(context);
        m2049a(null, 0, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2049a(attributeSet, 16842862, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2049a(attributeSet, i, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m2049a(attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m2049a(AttributeSet attributeSet, int i, int i2) {
        if (!this.f1828g) {
            this.f1828g = true;
            setMaxEmojiCount(new C0396a(this, attributeSet, i, i2).mo2399a());
            setKeyListener(super.getKeyListener());
        }
    }

    private C0397b getEmojiEditTextHelper() {
        if (this.f1827f == null) {
            this.f1827f = new C0397b(this);
        }
        return this.f1827f;
    }

    public int getEmojiReplaceStrategy() {
        return getEmojiEditTextHelper().mo2400a();
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().mo2404b();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().mo2402a(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0391i.m2025a((TextView) this, callback));
    }

    public void setEmojiReplaceStrategy(int i) {
        getEmojiEditTextHelper().mo2403a(i);
    }

    public void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            keyListener = getEmojiEditTextHelper().mo2401a(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public void setMaxEmojiCount(int i) {
        getEmojiEditTextHelper().mo2405b(i);
    }
}
