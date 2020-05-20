package androidx.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class EmojiAppCompatTextView extends AppCompatTextView {

    /* renamed from: j */
    private C0405g f1825j;

    /* renamed from: k */
    private boolean f1826k;

    public EmojiAppCompatTextView(Context context) {
        super(context);
        m2048d();
    }

    public EmojiAppCompatTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2048d();
    }

    public EmojiAppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2048d();
    }

    /* renamed from: d */
    private void m2048d() {
        if (!this.f1826k) {
            this.f1826k = true;
            getEmojiTextViewHelper().mo2420a();
        }
    }

    private C0405g getEmojiTextViewHelper() {
        if (this.f1825j == null) {
            this.f1825j = new C0405g(this);
        }
        return this.f1825j;
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2421a(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo2422a(inputFilterArr));
    }
}
