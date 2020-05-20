package androidx.emoji.widget;

import android.os.Build.VERSION;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import p071f.p097h.p107l.C3321h;

/* renamed from: androidx.emoji.widget.g */
public final class C0405g {

    /* renamed from: a */
    private final C0407b f1843a;

    /* renamed from: androidx.emoji.widget.g$a */
    private static class C0406a extends C0407b {

        /* renamed from: a */
        private final TextView f1844a;

        /* renamed from: b */
        private final C0402e f1845b;

        C0406a(TextView textView) {
            this.f1844a = textView;
            this.f1845b = new C0402e(textView);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public TransformationMethod mo2423a(TransformationMethod transformationMethod) {
            return transformationMethod instanceof C0410i ? transformationMethod : new C0410i(transformationMethod);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2424a() {
            TransformationMethod transformationMethod = this.f1844a.getTransformationMethod();
            if (transformationMethod != null && !(transformationMethod instanceof PasswordTransformationMethod)) {
                this.f1844a.setTransformationMethod(mo2423a(transformationMethod));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2425a(boolean z) {
            if (z) {
                mo2424a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public InputFilter[] mo2426a(InputFilter[] inputFilterArr) {
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter instanceof C0402e) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f1845b;
            return inputFilterArr2;
        }
    }

    /* renamed from: androidx.emoji.widget.g$b */
    static class C0407b {
        C0407b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2424a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2425a(boolean z) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public InputFilter[] mo2426a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }
    }

    public C0405g(TextView textView) {
        C3321h.m13544a(textView, (Object) "textView cannot be null");
        this.f1843a = VERSION.SDK_INT >= 19 ? new C0406a(textView) : new C0407b();
    }

    /* renamed from: a */
    public void mo2420a() {
        this.f1843a.mo2424a();
    }

    /* renamed from: a */
    public void mo2421a(boolean z) {
        this.f1843a.mo2425a(z);
    }

    /* renamed from: a */
    public InputFilter[] mo2422a(InputFilter[] inputFilterArr) {
        return this.f1843a.mo2426a(inputFilterArr);
    }
}
