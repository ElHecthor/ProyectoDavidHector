package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.core.widget.C0391i;
import p071f.p072a.C3093a;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p097h.p108m.C3378u;

/* renamed from: androidx.appcompat.widget.d */
public class C0207d extends AutoCompleteTextView implements C3378u {

    /* renamed from: h */
    private static final int[] f917h = {16843126};

    /* renamed from: f */
    private final C0211e f918f;

    /* renamed from: g */
    private final C0280v f919g;

    public C0207d(Context context) {
        this(context, null);
    }

    public C0207d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3093a.autoCompleteTextViewStyle);
    }

    public C0207d(Context context, AttributeSet attributeSet, int i) {
        super(C0258q0.m1264b(context), attributeSet, i);
        C0275t0 a = C0275t0.m1311a(getContext(), attributeSet, f917h, i, 0);
        if (a.mo1751g(0)) {
            setDropDownBackgroundDrawable(a.mo1741b(0));
        }
        a.mo1737a();
        C0211e eVar = new C0211e(this);
        this.f918f = eVar;
        eVar.mo1326a(attributeSet, i);
        C0280v vVar = new C0280v(this);
        this.f919g = vVar;
        vVar.mo1801a(attributeSet, i);
        this.f919g.mo1793a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0211e eVar = this.f918f;
        if (eVar != null) {
            eVar.mo1321a();
        }
        C0280v vVar = this.f919g;
        if (vVar != null) {
            vVar.mo1793a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0211e eVar = this.f918f;
        if (eVar != null) {
            return eVar.mo1327b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0211e eVar = this.f918f;
        if (eVar != null) {
            return eVar.mo1329c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0241l.m1194a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0211e eVar = this.f918f;
        if (eVar != null) {
            eVar.mo1325a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0211e eVar = this.f918f;
        if (eVar != null) {
            eVar.mo1322a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0391i.m2025a((TextView) this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C3103a.m12557c(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0211e eVar = this.f918f;
        if (eVar != null) {
            eVar.mo1328b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0211e eVar = this.f918f;
        if (eVar != null) {
            eVar.mo1324a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0280v vVar = this.f919g;
        if (vVar != null) {
            vVar.mo1797a(context, i);
        }
    }
}
