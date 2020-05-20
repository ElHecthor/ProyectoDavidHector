package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.widget.C0393j;
import p071f.p072a.C3093a;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p097h.p108m.C3378u;

/* renamed from: androidx.appcompat.widget.g */
public class C0223g extends CheckBox implements C0393j, C3378u {

    /* renamed from: f */
    private final C0228i f997f;

    /* renamed from: g */
    private final C0211e f998g;

    /* renamed from: h */
    private final C0280v f999h;

    public C0223g(Context context) {
        this(context, null);
    }

    public C0223g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3093a.checkboxStyle);
    }

    public C0223g(Context context, AttributeSet attributeSet, int i) {
        super(C0258q0.m1264b(context), attributeSet, i);
        C0228i iVar = new C0228i(this);
        this.f997f = iVar;
        iVar.mo1454a(attributeSet, i);
        C0211e eVar = new C0211e(this);
        this.f998g = eVar;
        eVar.mo1326a(attributeSet, i);
        C0280v vVar = new C0280v(this);
        this.f999h = vVar;
        vVar.mo1801a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0211e eVar = this.f998g;
        if (eVar != null) {
            eVar.mo1321a();
        }
        C0280v vVar = this.f999h;
        if (vVar != null) {
            vVar.mo1793a();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0228i iVar = this.f997f;
        return iVar != null ? iVar.mo1450a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0211e eVar = this.f998g;
        if (eVar != null) {
            return eVar.mo1327b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0211e eVar = this.f998g;
        if (eVar != null) {
            return eVar.mo1329c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0228i iVar = this.f997f;
        if (iVar != null) {
            return iVar.mo1455b();
        }
        return null;
    }

    public Mode getSupportButtonTintMode() {
        C0228i iVar = this.f997f;
        if (iVar != null) {
            return iVar.mo1456c();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0211e eVar = this.f998g;
        if (eVar != null) {
            eVar.mo1325a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0211e eVar = this.f998g;
        if (eVar != null) {
            eVar.mo1322a(i);
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C3103a.m12557c(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0228i iVar = this.f997f;
        if (iVar != null) {
            iVar.mo1457d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0211e eVar = this.f998g;
        if (eVar != null) {
            eVar.mo1328b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0211e eVar = this.f998g;
        if (eVar != null) {
            eVar.mo1324a(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0228i iVar = this.f997f;
        if (iVar != null) {
            iVar.mo1452a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(Mode mode) {
        C0228i iVar = this.f997f;
        if (iVar != null) {
            iVar.mo1453a(mode);
        }
    }
}
