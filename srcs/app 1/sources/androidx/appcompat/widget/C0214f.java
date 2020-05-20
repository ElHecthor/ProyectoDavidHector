package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.C0384b;
import androidx.core.widget.C0391i;
import p071f.p072a.C3093a;
import p071f.p097h.p108m.C3378u;

/* renamed from: androidx.appcompat.widget.f */
public class C0214f extends Button implements C3378u, C0384b {

    /* renamed from: f */
    private final C0211e f954f;

    /* renamed from: g */
    private final C0280v f955g;

    public C0214f(Context context) {
        this(context, null);
    }

    public C0214f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3093a.buttonStyle);
    }

    public C0214f(Context context, AttributeSet attributeSet, int i) {
        super(C0258q0.m1264b(context), attributeSet, i);
        C0211e eVar = new C0211e(this);
        this.f954f = eVar;
        eVar.mo1326a(attributeSet, i);
        C0280v vVar = new C0280v(this);
        this.f955g = vVar;
        vVar.mo1801a(attributeSet, i);
        this.f955g.mo1793a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0211e eVar = this.f954f;
        if (eVar != null) {
            eVar.mo1321a();
        }
        C0280v vVar = this.f955g;
        if (vVar != null) {
            vVar.mo1793a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0384b.f1807a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0280v vVar = this.f955g;
        if (vVar != null) {
            return vVar.mo1807c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0384b.f1807a) {
            return super.getAutoSizeMinTextSize();
        }
        C0280v vVar = this.f955g;
        if (vVar != null) {
            return vVar.mo1808d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0384b.f1807a) {
            return super.getAutoSizeStepGranularity();
        }
        C0280v vVar = this.f955g;
        if (vVar != null) {
            return vVar.mo1809e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0384b.f1807a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0280v vVar = this.f955g;
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
        C0280v vVar = this.f955g;
        if (vVar != null) {
            return vVar.mo1811g();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0211e eVar = this.f954f;
        if (eVar != null) {
            return eVar.mo1327b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0211e eVar = this.f954f;
        if (eVar != null) {
            return eVar.mo1329c();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0280v vVar = this.f955g;
        if (vVar != null) {
            vVar.mo1804a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0280v vVar = this.f955g;
        if (vVar != null && !C0384b.f1807a && vVar.mo1814j()) {
            this.f955g.mo1806b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C0384b.f1807a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0280v vVar = this.f955g;
        if (vVar != null) {
            vVar.mo1796a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C0384b.f1807a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0280v vVar = this.f955g;
        if (vVar != null) {
            vVar.mo1805a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0384b.f1807a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0280v vVar = this.f955g;
        if (vVar != null) {
            vVar.mo1794a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0211e eVar = this.f954f;
        if (eVar != null) {
            eVar.mo1325a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0211e eVar = this.f954f;
        if (eVar != null) {
            eVar.mo1322a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0391i.m2025a((TextView) this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0280v vVar = this.f955g;
        if (vVar != null) {
            vVar.mo1803a(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0211e eVar = this.f954f;
        if (eVar != null) {
            eVar.mo1328b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0211e eVar = this.f954f;
        if (eVar != null) {
            eVar.mo1324a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0280v vVar = this.f955g;
        if (vVar != null) {
            vVar.mo1797a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C0384b.f1807a) {
            super.setTextSize(i, f);
            return;
        }
        C0280v vVar = this.f955g;
        if (vVar != null) {
            vVar.mo1795a(i, f);
        }
    }
}
