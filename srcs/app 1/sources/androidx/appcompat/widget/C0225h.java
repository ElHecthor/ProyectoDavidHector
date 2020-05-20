package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.core.widget.C0391i;
import p071f.p072a.p073k.p074a.C3103a;

/* renamed from: androidx.appcompat.widget.h */
public class C0225h extends CheckedTextView {

    /* renamed from: g */
    private static final int[] f1000g = {16843016};

    /* renamed from: f */
    private final C0280v f1001f;

    public C0225h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C0225h(Context context, AttributeSet attributeSet, int i) {
        super(C0258q0.m1264b(context), attributeSet, i);
        C0280v vVar = new C0280v(this);
        this.f1001f = vVar;
        vVar.mo1801a(attributeSet, i);
        this.f1001f.mo1793a();
        C0275t0 a = C0275t0.m1311a(getContext(), attributeSet, f1000g, i, 0);
        setCheckMarkDrawable(a.mo1741b(0));
        a.mo1737a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0280v vVar = this.f1001f;
        if (vVar != null) {
            vVar.mo1793a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0241l.m1194a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C3103a.m12557c(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0391i.m2025a((TextView) this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0280v vVar = this.f1001f;
        if (vVar != null) {
            vVar.mo1797a(context, i);
        }
    }
}
