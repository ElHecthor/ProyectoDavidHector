package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.C0391i;
import p071f.p072a.C3093a;
import p071f.p097h.p108m.C3378u;

/* renamed from: androidx.appcompat.widget.k */
public class C0239k extends EditText implements C3378u {

    /* renamed from: f */
    private final C0211e f1034f;

    /* renamed from: g */
    private final C0280v f1035g;

    /* renamed from: h */
    private final C0276u f1036h;

    public C0239k(Context context) {
        this(context, null);
    }

    public C0239k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3093a.editTextStyle);
    }

    public C0239k(Context context, AttributeSet attributeSet, int i) {
        super(C0258q0.m1264b(context), attributeSet, i);
        C0211e eVar = new C0211e(this);
        this.f1034f = eVar;
        eVar.mo1326a(attributeSet, i);
        C0280v vVar = new C0280v(this);
        this.f1035g = vVar;
        vVar.mo1801a(attributeSet, i);
        this.f1035g.mo1793a();
        this.f1036h = new C0276u(this);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0211e eVar = this.f1034f;
        if (eVar != null) {
            eVar.mo1321a();
        }
        C0280v vVar = this.f1035g;
        if (vVar != null) {
            vVar.mo1793a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0211e eVar = this.f1034f;
        if (eVar != null) {
            return eVar.mo1327b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0211e eVar = this.f1034f;
        if (eVar != null) {
            return eVar.mo1329c();
        }
        return null;
    }

    public Editable getText() {
        return VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        if (VERSION.SDK_INT < 28) {
            C0276u uVar = this.f1036h;
            if (uVar != null) {
                return uVar.mo1752a();
            }
        }
        return super.getTextClassifier();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0241l.m1194a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0211e eVar = this.f1034f;
        if (eVar != null) {
            eVar.mo1325a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0211e eVar = this.f1034f;
        if (eVar != null) {
            eVar.mo1322a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0391i.m2025a((TextView) this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0211e eVar = this.f1034f;
        if (eVar != null) {
            eVar.mo1328b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0211e eVar = this.f1034f;
        if (eVar != null) {
            eVar.mo1324a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0280v vVar = this.f1035g;
        if (vVar != null) {
            vVar.mo1797a(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        if (VERSION.SDK_INT < 28) {
            C0276u uVar = this.f1036h;
            if (uVar != null) {
                uVar.mo1753a(textClassifier);
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }
}
