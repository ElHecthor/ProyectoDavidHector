package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p071f.p097h.p107l.C3321h;

/* renamed from: androidx.appcompat.widget.u */
final class C0276u {

    /* renamed from: a */
    private TextView f1193a;

    /* renamed from: b */
    private TextClassifier f1194b;

    C0276u(TextView textView) {
        C3321h.m13543a(textView);
        this.f1193a = textView;
    }

    /* renamed from: a */
    public TextClassifier mo1752a() {
        TextClassifier textClassifier = this.f1194b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1193a.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            textClassifier = TextClassifier.NO_OP;
        }
        return textClassifier;
    }

    /* renamed from: a */
    public void mo1753a(TextClassifier textClassifier) {
        this.f1194b = textClassifier;
    }
}
