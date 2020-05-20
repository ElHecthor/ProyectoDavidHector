package com.google.android.material.textview;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C0207d;
import androidx.appcompat.widget.C0215f0;
import com.google.android.material.textfield.TextInputLayout;
import p147g.p156d.p157a.p185c.C4375b;

/* renamed from: com.google.android.material.textview.a */
public class C2792a extends C0207d {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C0215f0 f8201i;

    /* renamed from: j */
    private final AccessibilityManager f8202j;

    /* renamed from: com.google.android.material.textview.a$a */
    class C2793a implements OnItemClickListener {
        C2793a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C2792a aVar = C2792a.this;
            C2792a.this.m11635a(i < 0 ? aVar.f8201i.mo1411j() : aVar.getAdapter().getItem(i));
            OnItemClickListener onItemClickListener = C2792a.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = C2792a.this.f8201i.mo1415m();
                    i = C2792a.this.f8201i.mo1414l();
                    j = C2792a.this.f8201i.mo1413k();
                }
                onItemClickListener.onItemClick(C2792a.this.f8201i.mo544e(), view, i, j);
            }
            C2792a.this.f8201i.dismiss();
        }
    }

    public C2792a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4375b.autoCompleteTextViewStyle);
    }

    public C2792a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8202j = (AccessibilityManager) context.getSystemService("accessibility");
        C0215f0 f0Var = new C0215f0(getContext());
        this.f8201i = f0Var;
        f0Var.mo1397a(true);
        this.f8201i.mo1393a((View) this);
        this.f8201i.mo1406g(2);
        this.f8201i.mo1395a(getAdapter());
        this.f8201i.mo1394a((OnItemClickListener) new C2793a());
    }

    /* renamed from: a */
    private TextInputLayout m11633a() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T extends ListAdapter & Filterable> void m11635a(Object obj) {
        if (VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    public CharSequence getHint() {
        TextInputLayout a = m11633a();
        return (a == null || !a.mo9177d()) ? super.getHint() : a.getHint();
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f8201i.mo1395a(getAdapter());
    }

    public void showDropDown() {
        if (getInputType() == 0) {
            AccessibilityManager accessibilityManager = this.f8202j;
            if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
                this.f8201i.mo540c();
                return;
            }
        }
        super.showDropDown();
    }
}
