package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0122g.C0124b;
import androidx.appcompat.widget.C0275t0;

public final class ExpandedMenuView extends ListView implements C0124b, C0139n, OnItemClickListener {

    /* renamed from: h */
    private static final int[] f410h = {16842964, 16843049};

    /* renamed from: f */
    private C0122g f411f;

    /* renamed from: g */
    private int f412g;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0275t0 a = C0275t0.m1311a(context, attributeSet, f410h, i, 0);
        if (a.mo1751g(0)) {
            setBackgroundDrawable(a.mo1741b(0));
        }
        if (a.mo1751g(1)) {
            setDivider(a.mo1741b(1));
        }
        a.mo1737a();
    }

    /* renamed from: a */
    public void mo438a(C0122g gVar) {
        this.f411f = gVar;
    }

    /* renamed from: a */
    public boolean mo439a(C0126i iVar) {
        return this.f411f.mo590a((MenuItem) iVar, 0);
    }

    public int getWindowAnimations() {
        return this.f412g;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo439a((C0126i) getAdapter().getItem(i));
    }
}
