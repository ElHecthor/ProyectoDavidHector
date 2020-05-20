package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: androidx.appcompat.view.menu.k */
abstract class C0134k implements C0142p, C0137m, OnItemClickListener {

    /* renamed from: f */
    private Rect f589f;

    C0134k() {
    }

    /* renamed from: a */
    protected static int m713a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: a */
    protected static C0121f m714a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0121f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0121f) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m715b(C0122g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo531a(int i);

    /* renamed from: a */
    public void mo513a(Context context, C0122g gVar) {
    }

    /* renamed from: a */
    public void mo782a(Rect rect) {
        this.f589f = rect;
    }

    /* renamed from: a */
    public abstract void mo533a(View view);

    /* renamed from: a */
    public abstract void mo534a(OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo535a(C0122g gVar);

    /* renamed from: a */
    public boolean mo521a(C0122g gVar, C0126i iVar) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo537b(int i);

    /* renamed from: b */
    public abstract void mo538b(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo539b() {
        return true;
    }

    /* renamed from: b */
    public boolean mo524b(C0122g gVar, C0126i iVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo541c(int i);

    /* renamed from: c */
    public abstract void mo542c(boolean z);

    /* renamed from: d */
    public int mo525d() {
        return 0;
    }

    /* renamed from: h */
    public Rect mo783h() {
        return this.f589f;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m714a(listAdapter).f510f.mo591a((MenuItem) listAdapter.getItem(i), (C0137m) this, mo539b() ? 0 : 4);
    }
}
