package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.ActionMenuItemView.C0109b;
import androidx.appcompat.view.menu.C0111b;
import androidx.appcompat.view.menu.C0122g;
import androidx.appcompat.view.menu.C0126i;
import androidx.appcompat.view.menu.C0135l;
import androidx.appcompat.view.menu.C0137m.C0138a;
import androidx.appcompat.view.menu.C0139n;
import androidx.appcompat.view.menu.C0139n.C0140a;
import androidx.appcompat.view.menu.C0142p;
import androidx.appcompat.view.menu.C0146r;
import androidx.appcompat.widget.ActionMenuView.C0154a;
import androidx.core.graphics.drawable.C0371a;
import java.util.ArrayList;
import p071f.p072a.C3093a;
import p071f.p072a.C3099g;
import p071f.p072a.p079o.C3123a;
import p071f.p097h.p108m.C3329b;
import p071f.p097h.p108m.C3329b.C3330a;

/* renamed from: androidx.appcompat.widget.c */
class C0195c extends C0111b implements C3330a {

    /* renamed from: A */
    private int f888A;

    /* renamed from: B */
    private final SparseBooleanArray f889B = new SparseBooleanArray();

    /* renamed from: C */
    C0201e f890C;

    /* renamed from: D */
    C0196a f891D;

    /* renamed from: E */
    C0198c f892E;

    /* renamed from: F */
    private C0197b f893F;

    /* renamed from: G */
    final C0202f f894G = new C0202f();

    /* renamed from: H */
    int f895H;

    /* renamed from: o */
    C0199d f896o;

    /* renamed from: p */
    private Drawable f897p;

    /* renamed from: q */
    private boolean f898q;

    /* renamed from: r */
    private boolean f899r;

    /* renamed from: s */
    private boolean f900s;

    /* renamed from: t */
    private int f901t;

    /* renamed from: u */
    private int f902u;

    /* renamed from: v */
    private int f903v;

    /* renamed from: w */
    private boolean f904w;

    /* renamed from: x */
    private boolean f905x;

    /* renamed from: y */
    private boolean f906y;

    /* renamed from: z */
    private boolean f907z;

    /* renamed from: androidx.appcompat.widget.c$a */
    private class C0196a extends C0135l {
        public C0196a(Context context, C0146r rVar, View view) {
            super(context, rVar, view, false, C3093a.actionOverflowMenuStyle);
            if (!((C0126i) rVar.getItem()).mo682h()) {
                View view2 = C0195c.this.f896o;
                if (view2 == null) {
                    view2 = (View) C0195c.this.f456m;
                }
                mo787a(view2);
            }
            mo789a((C0138a) C0195c.this.f894G);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo794d() {
            C0195c cVar = C0195c.this;
            cVar.f891D = null;
            cVar.f895H = 0;
            super.mo794d();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    private class C0197b extends C0109b {
        C0197b() {
        }

        /* renamed from: a */
        public C0142p mo437a() {
            C0196a aVar = C0195c.this.f891D;
            if (aVar != null) {
                return aVar.mo792b();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    private class C0198c implements Runnable {

        /* renamed from: f */
        private C0201e f910f;

        public C0198c(C0201e eVar) {
            this.f910f = eVar;
        }

        public void run() {
            if (C0195c.this.f451h != null) {
                C0195c.this.f451h.mo582a();
            }
            View view = (View) C0195c.this.f456m;
            if (!(view == null || view.getWindowToken() == null || !this.f910f.mo796f())) {
                C0195c.this.f890C = this.f910f;
            }
            C0195c.this.f892E = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    private class C0199d extends AppCompatImageView implements C0154a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        class C0200a extends C0208d0 {
            C0200a(View view, C0195c cVar) {
                super(view);
            }

            /* renamed from: a */
            public C0142p mo435a() {
                C0201e eVar = C0195c.this.f890C;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo792b();
            }

            /* renamed from: b */
            public boolean mo436b() {
                C0195c.this.mo1300k();
                return true;
            }

            /* renamed from: c */
            public boolean mo1304c() {
                C0195c cVar = C0195c.this;
                if (cVar.f892E != null) {
                    return false;
                }
                cVar.mo1296e();
                return true;
            }
        }

        public C0199d(Context context) {
            super(context, null, C3093a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0283v0.m1404a(this, getContentDescription());
            setOnTouchListener(new C0200a(this, C0195c.this));
        }

        /* renamed from: a */
        public boolean mo417a() {
            return false;
        }

        /* renamed from: c */
        public boolean mo419c() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0195c.this.mo1300k();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0371a.m1897a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    private class C0201e extends C0135l {
        public C0201e(Context context, C0122g gVar, View view, boolean z) {
            super(context, gVar, view, z, C3093a.actionOverflowMenuStyle);
            mo786a(8388613);
            mo789a((C0138a) C0195c.this.f894G);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo794d() {
            if (C0195c.this.f451h != null) {
                C0195c.this.f451h.close();
            }
            C0195c.this.f890C = null;
            super.mo794d();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    private class C0202f implements C0138a {
        C0202f() {
        }

        /* renamed from: a */
        public void mo332a(C0122g gVar, boolean z) {
            if (gVar instanceof C0146r) {
                gVar.mo634m().mo589a(false);
            }
            C0138a a = C0195c.this.mo510a();
            if (a != null) {
                a.mo332a(gVar, z);
            }
        }

        /* renamed from: a */
        public boolean mo333a(C0122g gVar) {
            boolean z = false;
            if (gVar == null) {
                return false;
            }
            C0195c.this.f895H = ((C0146r) gVar).getItem().getItemId();
            C0138a a = C0195c.this.mo510a();
            if (a != null) {
                z = a.mo333a(gVar);
            }
            return z;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.appcompat.widget.c$g */
    private static class C0203g implements Parcelable {
        public static final Creator<C0203g> CREATOR = new C0204a();

        /* renamed from: f */
        public int f916f;

        /* renamed from: androidx.appcompat.widget.c$g$a */
        static class C0204a implements Creator<C0203g> {
            C0204a() {
            }

            public C0203g createFromParcel(Parcel parcel) {
                return new C0203g(parcel);
            }

            public C0203g[] newArray(int i) {
                return new C0203g[i];
            }
        }

        C0203g() {
        }

        C0203g(Parcel parcel) {
            this.f916f = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f916f);
        }
    }

    public C0195c(Context context) {
        super(context, C3099g.abc_action_menu_layout, C3099g.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    private View m995a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f456m;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0140a) && ((C0140a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public View mo509a(C0126i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.mo668f()) {
            actionView = super.mo509a(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public void mo513a(Context context, C0122g gVar) {
        super.mo513a(context, gVar);
        Resources resources = context.getResources();
        C3123a a = C3123a.m12641a(context);
        if (!this.f900s) {
            this.f899r = a.mo10045g();
        }
        if (!this.f906y) {
            this.f901t = a.mo10040b();
        }
        if (!this.f904w) {
            this.f903v = a.mo10041c();
        }
        int i = this.f901t;
        if (this.f899r) {
            if (this.f896o == null) {
                C0199d dVar = new C0199d(this.f449f);
                this.f896o = dVar;
                if (this.f898q) {
                    dVar.setImageDrawable(this.f897p);
                    this.f897p = null;
                    this.f898q = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f896o.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f896o.getMeasuredWidth();
        } else {
            this.f896o = null;
        }
        this.f902u = i;
        this.f888A = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: a */
    public void mo1289a(Configuration configuration) {
        if (!this.f904w) {
            this.f903v = C3123a.m12641a(this.f450g).mo10041c();
        }
        C0122g gVar = this.f451h;
        if (gVar != null) {
            gVar.mo607b(true);
        }
    }

    /* renamed from: a */
    public void mo1290a(Drawable drawable) {
        C0199d dVar = this.f896o;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f898q = true;
        this.f897p = drawable;
    }

    /* renamed from: a */
    public void mo532a(Parcelable parcelable) {
        if (parcelable instanceof C0203g) {
            int i = ((C0203g) parcelable).f916f;
            if (i > 0) {
                MenuItem findItem = this.f451h.findItem(i);
                if (findItem != null) {
                    mo522a((C0146r) findItem.getSubMenu());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo515a(C0122g gVar, boolean z) {
        mo1293b();
        super.mo515a(gVar, z);
    }

    /* renamed from: a */
    public void mo516a(C0126i iVar, C0140a aVar) {
        aVar.mo416a(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f456m);
        if (this.f893F == null) {
            this.f893F = new C0197b();
        }
        actionMenuItemView.setPopupCallback(this.f893F);
    }

    /* renamed from: a */
    public void mo1291a(ActionMenuView actionMenuView) {
        this.f456m = actionMenuView;
        actionMenuView.mo438a(this.f451h);
    }

    /* renamed from: a */
    public void mo518a(boolean z) {
        super.mo518a(z);
        ((View) this.f456m).requestLayout();
        C0122g gVar = this.f451h;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList c = gVar.mo610c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                C3329b a = ((C0126i) c.get(i)).mo454a();
                if (a != null) {
                    a.mo10722a((C3330a) this);
                }
            }
        }
        C0122g gVar2 = this.f451h;
        ArrayList j = gVar2 != null ? gVar2.mo631j() : null;
        if (this.f899r && j != null) {
            int size2 = j.size();
            if (size2 == 1) {
                z2 = !((C0126i) j.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        C0199d dVar = this.f896o;
        if (z2) {
            if (dVar == null) {
                this.f896o = new C0199d(this.f449f);
            }
            ViewGroup viewGroup = (ViewGroup) this.f896o.getParent();
            if (viewGroup != this.f456m) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f896o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f456m;
                actionMenuView.addView(this.f896o, actionMenuView.mo948e());
            }
        } else if (dVar != null) {
            ViewParent parent = dVar.getParent();
            C0139n nVar = this.f456m;
            if (parent == nVar) {
                ((ViewGroup) nVar).removeView(this.f896o);
            }
        }
        ((ActionMenuView) this.f456m).setOverflowReserved(this.f899r);
    }

    /* renamed from: a */
    public boolean mo519a(int i, C0126i iVar) {
        return iVar.mo682h();
    }

    /* renamed from: a */
    public boolean mo520a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f896o) {
            return false;
        }
        return super.mo520a(viewGroup, i);
    }

    /* renamed from: a */
    public boolean mo522a(C0146r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        C0146r rVar2 = rVar;
        while (rVar2.mo835t() != this.f451h) {
            rVar2 = (C0146r) rVar2.mo835t();
        }
        View a = m995a(rVar2.getItem());
        if (a == null) {
            return false;
        }
        this.f895H = rVar.getItem().getItemId();
        int size = rVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0196a aVar = new C0196a(this.f450g, rVar, a);
        this.f891D = aVar;
        aVar.mo790a(z);
        this.f891D.mo795e();
        super.mo522a(rVar);
        return true;
    }

    /* renamed from: b */
    public C0139n mo523b(ViewGroup viewGroup) {
        C0139n nVar = this.f456m;
        C0139n b = super.mo523b(viewGroup);
        if (nVar != b) {
            ((ActionMenuView) b).setPresenter(this);
        }
        return b;
    }

    /* renamed from: b */
    public void mo1292b(boolean z) {
        this.f907z = z;
    }

    /* renamed from: b */
    public boolean mo1293b() {
        return mo1296e() | mo1297h();
    }

    /* renamed from: c */
    public Drawable mo1294c() {
        C0199d dVar = this.f896o;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f898q) {
            return this.f897p;
        }
        return null;
    }

    /* renamed from: c */
    public void mo1295c(boolean z) {
        this.f899r = z;
        this.f900s = true;
    }

    /* renamed from: e */
    public boolean mo1296e() {
        C0198c cVar = this.f892E;
        if (cVar != null) {
            C0139n nVar = this.f456m;
            if (nVar != null) {
                ((View) nVar).removeCallbacks(cVar);
                this.f892E = null;
                return true;
            }
        }
        C0201e eVar = this.f890C;
        if (eVar == null) {
            return false;
        }
        eVar.mo785a();
        return true;
    }

    /* renamed from: f */
    public boolean mo545f() {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        C0195c cVar = this;
        C0122g gVar = cVar.f451h;
        View view = null;
        int i5 = 0;
        if (gVar != null) {
            arrayList = gVar.mo635n();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = cVar.f903v;
        int i7 = cVar.f902u;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f456m;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            C0126i iVar = (C0126i) arrayList.get(i10);
            if (iVar.mo690k()) {
                i8++;
            } else if (iVar.mo689j()) {
                i9++;
            } else {
                z = true;
            }
            if (cVar.f907z && iVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (cVar.f899r && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = cVar.f889B;
        sparseBooleanArray.clear();
        if (cVar.f905x) {
            int i12 = cVar.f888A;
            i2 = i7 / i12;
            i3 = i12 + ((i7 % i12) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C0126i iVar2 = (C0126i) arrayList.get(i13);
            if (iVar2.mo690k()) {
                View a = cVar.mo509a(iVar2, view, viewGroup);
                if (cVar.f905x) {
                    i2 -= ActionMenuView.m833a(a, i3, i2, makeMeasureSpec, i5);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.mo665d(true);
                i4 = i;
            } else if (iVar2.mo689j()) {
                int groupId2 = iVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!cVar.f905x || i2 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View a2 = cVar.mo509a(iVar2, null, viewGroup);
                    if (cVar.f905x) {
                        int a3 = ActionMenuView.m833a(a2, i3, i2, makeMeasureSpec, 0);
                        i2 -= a3;
                        if (a3 == 0) {
                            z4 = false;
                        }
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z5 & (!cVar.f905x ? i7 + i14 > 0 : i7 >= 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    int i15 = 0;
                    while (i15 < i13) {
                        C0126i iVar3 = (C0126i) arrayList.get(i15);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.mo682h()) {
                                i11++;
                            }
                            iVar3.mo665d(false);
                        }
                        i15++;
                    }
                }
                if (z3) {
                    i11--;
                }
                iVar2.mo665d(z3);
            } else {
                i4 = i;
                iVar2.mo665d(false);
                i13++;
                i = i4;
                view = null;
                i5 = 0;
                cVar = this;
            }
            i13++;
            i = i4;
            view = null;
            i5 = 0;
            cVar = this;
        }
        return true;
    }

    /* renamed from: g */
    public Parcelable mo546g() {
        C0203g gVar = new C0203g();
        gVar.f916f = this.f895H;
        return gVar;
    }

    /* renamed from: h */
    public boolean mo1297h() {
        C0196a aVar = this.f891D;
        if (aVar == null) {
            return false;
        }
        aVar.mo785a();
        return true;
    }

    /* renamed from: i */
    public boolean mo1298i() {
        return this.f892E != null || mo1299j();
    }

    /* renamed from: j */
    public boolean mo1299j() {
        C0201e eVar = this.f890C;
        return eVar != null && eVar.mo793c();
    }

    /* renamed from: k */
    public boolean mo1300k() {
        if (this.f899r && !mo1299j()) {
            C0122g gVar = this.f451h;
            if (gVar != null && this.f456m != null && this.f892E == null && !gVar.mo631j().isEmpty()) {
                C0201e eVar = new C0201e(this.f450g, this.f451h, this.f896o, true);
                C0198c cVar = new C0198c(eVar);
                this.f892E = cVar;
                ((View) this.f456m).post(cVar);
                super.mo522a((C0146r) null);
                return true;
            }
        }
        return false;
    }
}
