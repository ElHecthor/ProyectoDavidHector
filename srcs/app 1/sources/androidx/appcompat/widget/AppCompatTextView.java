package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.C0384b;
import androidx.core.widget.C0391i;
import androidx.core.widget.C0394k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p097h.p100f.C3262g;
import p071f.p097h.p106k.C3302d;
import p071f.p097h.p106k.C3302d.C3303a;
import p071f.p097h.p108m.C3378u;

public class AppCompatTextView extends TextView implements C3378u, C0394k, C0384b {

    /* renamed from: f */
    private final C0211e f708f;

    /* renamed from: g */
    private final C0280v f709g;

    /* renamed from: h */
    private final C0276u f710h;

    /* renamed from: i */
    private Future<C3302d> f711i;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0258q0.m1264b(context), attributeSet, i);
        C0211e eVar = new C0211e(this);
        this.f708f = eVar;
        eVar.mo1326a(attributeSet, i);
        C0280v vVar = new C0280v(this);
        this.f709g = vVar;
        vVar.mo1801a(attributeSet, i);
        this.f709g.mo1793a();
        this.f710h = new C0276u(this);
    }

    /* renamed from: d */
    private void mo420d() {
        Future<C3302d> future = this.f711i;
        if (future != null) {
            try {
                this.f711i = null;
                C0391i.m2032a((TextView) this, (C3302d) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0211e eVar = this.f708f;
        if (eVar != null) {
            eVar.mo1321a();
        }
        C0280v vVar = this.f709g;
        if (vVar != null) {
            vVar.mo1793a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0384b.f1807a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0280v vVar = this.f709g;
        if (vVar != null) {
            return vVar.mo1807c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0384b.f1807a) {
            return super.getAutoSizeMinTextSize();
        }
        C0280v vVar = this.f709g;
        if (vVar != null) {
            return vVar.mo1808d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0384b.f1807a) {
            return super.getAutoSizeStepGranularity();
        }
        C0280v vVar = this.f709g;
        if (vVar != null) {
            return vVar.mo1809e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0384b.f1807a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0280v vVar = this.f709g;
        return vVar != null ? vVar.mo1810f() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        int i = 0;
        if (C0384b.f1807a) {
            if (super.getAutoSizeTextType() == 1) {
                i = 1;
            }
            return i;
        }
        C0280v vVar = this.f709g;
        if (vVar != null) {
            return vVar.mo1811g();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return C0391i.m2034b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0391i.m2036c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0211e eVar = this.f708f;
        if (eVar != null) {
            return eVar.mo1327b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0211e eVar = this.f708f;
        if (eVar != null) {
            return eVar.mo1329c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f709g.mo1812h();
    }

    public Mode getSupportCompoundDrawablesTintMode() {
        return this.f709g.mo1813i();
    }

    public CharSequence getText() {
        mo420d();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        if (VERSION.SDK_INT < 28) {
            C0276u uVar = this.f710h;
            if (uVar != null) {
                return uVar.mo1752a();
            }
        }
        return super.getTextClassifier();
    }

    public C3303a getTextMetricsParamsCompat() {
        return C0391i.m2041f(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0241l.m1194a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0280v vVar = this.f709g;
        if (vVar != null) {
            vVar.mo1804a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo420d();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0280v vVar = this.f709g;
        if (vVar != null && !C0384b.f1807a && vVar.mo1814j()) {
            this.f709g.mo1806b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C0384b.f1807a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0280v vVar = this.f709g;
        if (vVar != null) {
            vVar.mo1796a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C0384b.f1807a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0280v vVar = this.f709g;
        if (vVar != null) {
            vVar.mo1805a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0384b.f1807a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0280v vVar = this.f709g;
        if (vVar != null) {
            vVar.mo1794a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0211e eVar = this.f708f;
        if (eVar != null) {
            eVar.mo1325a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0211e eVar = this.f708f;
        if (eVar != null) {
            eVar.mo1322a(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0280v vVar = this.f709g;
        if (vVar != null) {
            vVar.mo1815k();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0280v vVar = this.f709g;
        if (vVar != null) {
            vVar.mo1815k();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i != 0 ? C3103a.m12557c(context, i) : null;
        Drawable c2 = i2 != 0 ? C3103a.m12557c(context, i2) : null;
        Drawable c3 = i3 != 0 ? C3103a.m12557c(context, i3) : null;
        if (i4 != 0) {
            drawable = C3103a.m12557c(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(c, c2, c3, drawable);
        C0280v vVar = this.f709g;
        if (vVar != null) {
            vVar.mo1815k();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0280v vVar = this.f709g;
        if (vVar != null) {
            vVar.mo1815k();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i != 0 ? C3103a.m12557c(context, i) : null;
        Drawable c2 = i2 != 0 ? C3103a.m12557c(context, i2) : null;
        Drawable c3 = i3 != 0 ? C3103a.m12557c(context, i3) : null;
        if (i4 != 0) {
            drawable = C3103a.m12557c(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(c, c2, c3, drawable);
        C0280v vVar = this.f709g;
        if (vVar != null) {
            vVar.mo1815k();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0280v vVar = this.f709g;
        if (vVar != null) {
            vVar.mo1815k();
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0391i.m2025a((TextView) this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0391i.m2027a((TextView) this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0391i.m2035b(this, i);
        }
    }

    public void setLineHeight(int i) {
        C0391i.m2037c(this, i);
    }

    public void setPrecomputedText(C3302d dVar) {
        C0391i.m2032a((TextView) this, dVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0211e eVar = this.f708f;
        if (eVar != null) {
            eVar.mo1328b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0211e eVar = this.f708f;
        if (eVar != null) {
            eVar.mo1324a(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f709g.mo1798a(colorStateList);
        this.f709g.mo1793a();
    }

    public void setSupportCompoundDrawablesTintMode(Mode mode) {
        this.f709g.mo1799a(mode);
        this.f709g.mo1793a();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0280v vVar = this.f709g;
        if (vVar != null) {
            vVar.mo1797a(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        if (VERSION.SDK_INT < 28) {
            C0276u uVar = this.f710h;
            if (uVar != null) {
                uVar.mo1753a(textClassifier);
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<C3302d> future) {
        this.f711i = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C3303a aVar) {
        C0391i.m2031a((TextView) this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (C0384b.f1807a) {
            super.setTextSize(i, f);
            return;
        }
        C0280v vVar = this.f709g;
        if (vVar != null) {
            vVar.mo1795a(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface a = (typeface == null || i <= 0) ? null : C3262g.m13365a(getContext(), typeface, i);
        if (a != null) {
            typeface = a;
        }
        super.setTypeface(typeface, i);
    }
}
