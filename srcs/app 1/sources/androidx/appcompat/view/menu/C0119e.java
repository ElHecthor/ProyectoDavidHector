package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.C0137m.C0138a;
import androidx.appcompat.view.menu.C0139n.C0140a;
import java.util.ArrayList;
import p071f.p072a.C3099g;

/* renamed from: androidx.appcompat.view.menu.e */
public class C0119e implements C0137m, OnItemClickListener {

    /* renamed from: f */
    Context f498f;

    /* renamed from: g */
    LayoutInflater f499g;

    /* renamed from: h */
    C0122g f500h;

    /* renamed from: i */
    ExpandedMenuView f501i;

    /* renamed from: j */
    int f502j;

    /* renamed from: k */
    int f503k;

    /* renamed from: l */
    int f504l;

    /* renamed from: m */
    private C0138a f505m;

    /* renamed from: n */
    C0120a f506n;

    /* renamed from: o */
    private int f507o;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    private class C0120a extends BaseAdapter {

        /* renamed from: f */
        private int f508f = -1;

        public C0120a() {
            mo561a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo561a() {
            C0126i f = C0119e.this.f500h.mo623f();
            if (f != null) {
                ArrayList j = C0119e.this.f500h.mo631j();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    if (((C0126i) j.get(i)) == f) {
                        this.f508f = i;
                        return;
                    }
                }
            }
            this.f508f = -1;
        }

        public int getCount() {
            int size = C0119e.this.f500h.mo631j().size() - C0119e.this.f502j;
            return this.f508f < 0 ? size : size - 1;
        }

        public C0126i getItem(int i) {
            ArrayList j = C0119e.this.f500h.mo631j();
            int i2 = i + C0119e.this.f502j;
            int i3 = this.f508f;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return (C0126i) j.get(i2);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0119e eVar = C0119e.this;
                view = eVar.f499g.inflate(eVar.f504l, viewGroup, false);
            }
            ((C0140a) view).mo416a(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo561a();
            super.notifyDataSetChanged();
        }
    }

    public C0119e(int i, int i2) {
        this.f504l = i;
        this.f503k = i2;
    }

    public C0119e(Context context, int i) {
        this(i, 0);
        this.f498f = context;
        this.f499g = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter mo556a() {
        if (this.f506n == null) {
            this.f506n = new C0120a();
        }
        return this.f506n;
    }

    /* renamed from: a */
    public C0139n mo557a(ViewGroup viewGroup) {
        if (this.f501i == null) {
            this.f501i = (ExpandedMenuView) this.f499g.inflate(C3099g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f506n == null) {
                this.f506n = new C0120a();
            }
            this.f501i.setAdapter(this.f506n);
            this.f501i.setOnItemClickListener(this);
        }
        return this.f501i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo513a(android.content.Context r3, androidx.appcompat.view.menu.C0122g r4) {
        /*
            r2 = this;
            int r0 = r2.f503k
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f503k
            r0.<init>(r3, r1)
            r2.f498f = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.f499g = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.f498f
            if (r0 == 0) goto L_0x0023
            r2.f498f = r3
            android.view.LayoutInflater r0 = r2.f499g
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            r2.f500h = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f506n
            if (r3 == 0) goto L_0x002c
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0119e.mo513a(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    /* renamed from: a */
    public void mo558a(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f501i.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: a */
    public void mo532a(Parcelable parcelable) {
        mo558a((Bundle) parcelable);
    }

    /* renamed from: a */
    public void mo515a(C0122g gVar, boolean z) {
        C0138a aVar = this.f505m;
        if (aVar != null) {
            aVar.mo332a(gVar, z);
        }
    }

    /* renamed from: a */
    public void mo517a(C0138a aVar) {
        this.f505m = aVar;
    }

    /* renamed from: a */
    public void mo518a(boolean z) {
        C0120a aVar = this.f506n;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo521a(C0122g gVar, C0126i iVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo522a(C0146r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new C0125h(rVar).mo652a((IBinder) null);
        C0138a aVar = this.f505m;
        if (aVar != null) {
            aVar.mo333a(rVar);
        }
        return true;
    }

    /* renamed from: b */
    public void mo559b(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f501i;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    /* renamed from: b */
    public boolean mo524b(C0122g gVar, C0126i iVar) {
        return false;
    }

    /* renamed from: d */
    public int mo525d() {
        return this.f507o;
    }

    /* renamed from: f */
    public boolean mo545f() {
        return false;
    }

    /* renamed from: g */
    public Parcelable mo546g() {
        if (this.f501i == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo559b(bundle);
        return bundle;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f500h.mo591a((MenuItem) this.f506n.getItem(i), (C0137m) this, 0);
    }
}
