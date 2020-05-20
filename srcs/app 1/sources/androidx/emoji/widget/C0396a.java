package androidx.emoji.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import p071f.p115k.C3415a;

/* renamed from: androidx.emoji.widget.a */
public class C0396a {

    /* renamed from: a */
    private int f1829a;

    public C0396a(View view, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C3415a.EmojiEditText, i, i2);
            this.f1829a = obtainStyledAttributes.getInteger(C3415a.EmojiEditText_maxEmojiCount, Integer.MAX_VALUE);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public int mo2399a() {
        return this.f1829a;
    }
}
