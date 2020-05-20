package p255io.stashteam.stashapp.p298ui.widgets.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appyvet.materialrangebar.RangeBar;
import com.appyvet.materialrangebar.RangeBar.C0821d;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import io.stashteam.games.tracker.stashapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p255io.stashteam.stashapp.p262c.C4988k0;
import p255io.stashteam.stashapp.p269e.p280c.C5288b0;
import p255io.stashteam.stashapp.p269e.p280c.C5288b0.C5289a;
import p255io.stashteam.stashapp.p269e.p280c.C5299h;
import p255io.stashteam.stashapp.p269e.p280c.C5299h.C5300a;
import p255io.stashteam.stashapp.p269e.p280c.C5303j;
import p255io.stashteam.stashapp.p269e.p280c.C5303j.C5304a;
import p255io.stashteam.stashapp.p269e.p280c.C5309o;
import p255io.stashteam.stashapp.p269e.p280c.C5309o.C5310a;
import p255io.stashteam.stashapp.p269e.p280c.C5315t;
import p255io.stashteam.stashapp.p269e.p280c.C5315t.C5316a;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.widgets.filter.FilterView */
public final class FilterView extends LinearLayout {

    /* renamed from: f */
    private C5672a f14739f;

    /* renamed from: g */
    private final C4988k0 f14740g;

    /* renamed from: io.stashteam.stashapp.ui.widgets.filter.FilterView$a */
    public static final class C5672a {

        /* renamed from: a */
        private final List<C5303j> f14741a;

        /* renamed from: b */
        private final List<C5288b0> f14742b;

        public C5672a() {
            this(null, null, 3, null);
        }

        public C5672a(List<? extends C5303j> list, List<? extends C5288b0> list2) {
            this.f14741a = list;
            this.f14742b = list2;
        }

        public /* synthetic */ C5672a(List list, List list2, int i, C5938g gVar) {
            if ((i & 1) != 0) {
                list = null;
            }
            if ((i & 2) != 0) {
                list2 = null;
            }
            this(list, list2);
        }

        /* renamed from: a */
        public final List<C5303j> mo15293a() {
            return this.f14741a;
        }

        /* renamed from: b */
        public final List<C5288b0> mo15294b() {
            return this.f14742b;
        }

        /* renamed from: c */
        public final boolean mo15295c() {
            List b = C5837l.m22162b((Object[]) new C5303j[]{C5303j.ONLY_RELEASED, C5303j.COMPLETED, C5303j.NOT_COMPLETED});
            List<C5303j> list = this.f14741a;
            if (list != null) {
                for (C5303j contains : list) {
                    if (b.contains(contains)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        public final boolean mo15296d() {
            List<C5303j> list = this.f14741a;
            return list != null && list.contains(C5303j.GENRE);
        }

        /* renamed from: e */
        public final boolean mo15297e() {
            List<C5303j> list = this.f14741a;
            return list != null && list.contains(C5303j.PLATFORM);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.f14742b, (java.lang.Object) r3.f14742b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof p255io.stashteam.stashapp.p298ui.widgets.filter.FilterView.C5672a
                if (r0 == 0) goto L_0x001d
                io.stashteam.stashapp.ui.widgets.filter.FilterView$a r3 = (p255io.stashteam.stashapp.p298ui.widgets.filter.FilterView.C5672a) r3
                java.util.List<io.stashteam.stashapp.e.c.j> r0 = r2.f14741a
                java.util.List<io.stashteam.stashapp.e.c.j> r1 = r3.f14741a
                boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.util.List<io.stashteam.stashapp.e.c.b0> r0 = r2.f14742b
                java.util.List<io.stashteam.stashapp.e.c.b0> r3 = r3.f14742b
                boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.widgets.filter.FilterView.C5672a.equals(java.lang.Object):boolean");
        }

        /* renamed from: f */
        public final boolean mo15299f() {
            List<C5303j> list = this.f14741a;
            return list != null && list.contains(C5303j.RELEASE_YEAR);
        }

        /* renamed from: g */
        public final boolean mo15300g() {
            List<C5288b0> list = this.f14742b;
            return list != null && (list.isEmpty() ^ true);
        }

        public int hashCode() {
            List<C5303j> list = this.f14741a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<C5288b0> list2 = this.f14742b;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Data(filterFields=");
            sb.append(this.f14741a);
            sb.append(", sortFields=");
            sb.append(this.f14742b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.widgets.filter.FilterView$b */
    public static final class C5673b implements C0821d {

        /* renamed from: a */
        final /* synthetic */ C4988k0 f14743a;

        C5673b(C4988k0 k0Var) {
            this.f14743a = k0Var;
        }

        /* renamed from: a */
        public void mo4484a(RangeBar rangeBar) {
        }

        /* renamed from: a */
        public void mo4485a(RangeBar rangeBar, int i, int i2, String str, String str2) {
            AppCompatTextView appCompatTextView = this.f14743a.f13112l;
            C5942k.m22324a((Object) appCompatTextView, "textYearStart");
            appCompatTextView.setText(str);
            AppCompatTextView appCompatTextView2 = this.f14743a.f13111k;
            C5942k.m22324a((Object) appCompatTextView2, "textYearEnd");
            appCompatTextView2.setText(str2);
        }

        /* renamed from: b */
        public void mo4486b(RangeBar rangeBar) {
        }
    }

    public FilterView() {
        this(null, null, 0, 7, null);
    }

    public FilterView(Context context) {
        this(context, null, 0, 6, null);
    }

    public FilterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C4988k0 a = C4988k0.m19977a(LayoutInflater.from(context), this);
        C5942k.m22324a((Object) a, "ViewFilterBinding.inflat…ater.from(context), this)");
        this.f14740g = a;
        setOrientation(1);
    }

    public /* synthetic */ FilterView(Context context, AttributeSet attributeSet, int i, int i2, C5938g gVar) {
        if ((i2 & 1) != 0) {
            context = null;
        }
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    private final Chip m21622a(int i, String str) {
        return m21623a(i, str, R.attr.filterChipStyle);
    }

    /* renamed from: a */
    private final Chip m21623a(int i, String str, int i2) {
        Chip chip = new Chip(getContext(), null, i2);
        chip.setId(i);
        chip.setText(str);
        return chip;
    }

    /* renamed from: a */
    private final void m21624a() {
        C5309o[] values;
        LinearLayout linearLayout = this.f14740g.f13106f;
        C5942k.m22324a((Object) linearLayout, "binding.layoutGenres");
        linearLayout.setVisibility(0);
        for (C5309o oVar : C5309o.values()) {
            int j = oVar.mo14977j();
            StringBuilder sb = new StringBuilder();
            sb.append(oVar.mo14973f());
            sb.append(' ');
            sb.append(getContext().getString(oVar.mo14976i()));
            this.f14740g.f13103c.addView(m21622a(j, sb.toString()));
        }
    }

    /* renamed from: a */
    private final void m21625a(C5303j jVar) {
        ChipGroup chipGroup = this.f14740g.f13102b;
        chipGroup.setVisibility(0);
        int i = jVar.mo14953i();
        String string = chipGroup.getContext().getString(jVar.mo14952h());
        C5942k.m22324a((Object) string, "context.getString(filterField.titleRes)");
        chipGroup.addView(m21622a(i, string));
    }

    /* renamed from: b */
    private final Chip m21626b(int i, String str) {
        return m21623a(i, str, R.attr.sortChipStyle);
    }

    /* renamed from: b */
    private final void m21627b() {
        C5315t[] values;
        LinearLayout linearLayout = this.f14740g.f13107g;
        C5942k.m22324a((Object) linearLayout, "binding.layoutPlatforms");
        linearLayout.setVisibility(0);
        for (C5315t tVar : C5315t.values()) {
            this.f14740g.f13104d.addView(m21622a(tVar.mo14990h(), tVar.mo14988f()));
        }
    }

    /* renamed from: c */
    private final void m21628c() {
        C4988k0 k0Var = this.f14740g;
        ConstraintLayout constraintLayout = k0Var.f13109i;
        C5942k.m22324a((Object) constraintLayout, "layoutYears");
        constraintLayout.setVisibility(0);
        AppCompatTextView appCompatTextView = k0Var.f13112l;
        C5942k.m22324a((Object) appCompatTextView, "textYearStart");
        appCompatTextView.setText("2000");
        AppCompatTextView appCompatTextView2 = k0Var.f13111k;
        C5942k.m22324a((Object) appCompatTextView2, "textYearEnd");
        appCompatTextView2.setText(String.valueOf(C5300a.f13896d.mo14949a()));
        RangeBar rangeBar = k0Var.f13110j;
        String str = "rangebarYears";
        C5942k.m22324a((Object) rangeBar, str);
        rangeBar.setTickEnd((float) C5300a.f13896d.mo14949a());
        RangeBar rangeBar2 = k0Var.f13110j;
        C5942k.m22324a((Object) rangeBar2, str);
        rangeBar2.setTickStart((float) 2000);
        k0Var.f13110j.setOnRangeBarChangeListener(new C5673b(k0Var));
    }

    /* renamed from: a */
    public final void mo15290a(C5299h hVar) {
        C5942k.m22327b(hVar, "filterData");
        C5672a aVar = this.f14739f;
        if (aVar != null && aVar.mo15295c()) {
            this.f14740g.f13102b.mo8441b();
            C5303j d = hVar.mo14933d();
            if (d != null) {
                this.f14740g.f13102b.mo8438a(d.mo14953i());
            }
        }
        C5672a aVar2 = this.f14739f;
        if (aVar2 != null && aVar2.mo15296d()) {
            this.f14740g.f13103c.mo8441b();
            List<C5309o> e = hVar.mo14934e();
            if (e != null) {
                for (C5309o j : e) {
                    this.f14740g.f13103c.mo8438a(j.mo14977j());
                }
            }
        }
        C5672a aVar3 = this.f14739f;
        if (aVar3 != null && aVar3.mo15297e()) {
            this.f14740g.f13104d.mo8441b();
            List<C5315t> f = hVar.mo14936f();
            if (f != null) {
                for (C5315t h : f) {
                    this.f14740g.f13104d.mo8438a(h.mo14990h());
                }
            }
        }
        C5672a aVar4 = this.f14739f;
        if (aVar4 != null && aVar4.mo15299f()) {
            RangeBar rangeBar = this.f14740g.f13110j;
            C5300a g = hVar.mo14937g();
            float b = (float) (g != null ? g.mo14944b() : 2000);
            C5300a g2 = hVar.mo14937g();
            rangeBar.mo4422a(b, (float) (g2 != null ? g2.mo14943a() : C5300a.f13896d.mo14949a()));
        }
        C5672a aVar5 = this.f14739f;
        if (aVar5 != null && aVar5.mo15300g()) {
            C5288b0 h2 = hVar.mo14938h();
            if (h2 != null) {
                this.f14740g.f13105e.mo8438a(h2.mo14865j());
            }
        }
    }

    public final C5299h getSelectedFilters() {
        String str;
        C5300a aVar;
        C5304a aVar2 = C5303j.f13908p;
        ChipGroup chipGroup = this.f14740g.f13102b;
        C5942k.m22324a((Object) chipGroup, "binding.chipGroupGeneral");
        C5303j a = aVar2.mo14954a(chipGroup.getCheckedChipId());
        ChipGroup chipGroup2 = this.f14740g.f13103c;
        C5942k.m22324a((Object) chipGroup2, "binding.chipGroupGenres");
        List checkedChipIds = chipGroup2.getCheckedChipIds();
        C5942k.m22324a((Object) checkedChipIds, "binding.chipGroupGenres.checkedChipIds");
        ArrayList arrayList = new ArrayList();
        Iterator it = checkedChipIds.iterator();
        while (true) {
            str = "it";
            if (!it.hasNext()) {
                break;
            }
            Integer num = (Integer) it.next();
            C5310a aVar3 = C5309o.f13943k;
            C5942k.m22324a((Object) num, str);
            C5309o b = aVar3.mo14979b(num.intValue());
            if (b != null) {
                arrayList.add(b);
            }
        }
        ChipGroup chipGroup3 = this.f14740g.f13104d;
        C5942k.m22324a((Object) chipGroup3, "binding.chipGroupPlatforms");
        List<Integer> checkedChipIds2 = chipGroup3.getCheckedChipIds();
        C5942k.m22324a((Object) checkedChipIds2, "binding.chipGroupPlatforms.checkedChipIds");
        ArrayList arrayList2 = new ArrayList();
        for (Integer num2 : checkedChipIds2) {
            C5316a aVar4 = C5315t.f13963i;
            C5942k.m22324a((Object) num2, str);
            C5315t a2 = aVar4.mo14991a(num2.intValue());
            if (a2 != null) {
                arrayList2.add(a2);
            }
        }
        C5672a aVar5 = this.f14739f;
        if (aVar5 == null || !aVar5.mo15299f()) {
            aVar = null;
        } else {
            RangeBar rangeBar = this.f14740g.f13110j;
            String str2 = "binding.rangebarYears";
            C5942k.m22324a((Object) rangeBar, str2);
            String leftPinValue = rangeBar.getLeftPinValue();
            C5942k.m22324a((Object) leftPinValue, "binding.rangebarYears.leftPinValue");
            int parseInt = Integer.parseInt(leftPinValue);
            RangeBar rangeBar2 = this.f14740g.f13110j;
            C5942k.m22324a((Object) rangeBar2, str2);
            String rightPinValue = rangeBar2.getRightPinValue();
            C5942k.m22324a((Object) rightPinValue, "binding.rangebarYears.rightPinValue");
            aVar = new C5300a(parseInt, Integer.parseInt(rightPinValue));
        }
        C5300a aVar6 = (aVar == null || !aVar.mo14945c()) ? aVar : null;
        C5289a aVar7 = C5288b0.f13836o;
        ChipGroup chipGroup4 = this.f14740g.f13105e;
        C5942k.m22324a((Object) chipGroup4, "binding.chipGroupSort");
        C5299h hVar = new C5299h(a, arrayList, arrayList2, aVar6, aVar7.mo14866a(chipGroup4.getCheckedChipId()));
        return hVar;
    }

    public final void setUpFilter(C5672a aVar) {
        C5942k.m22327b(aVar, "data");
        this.f14739f = aVar;
        List<C5303j> a = aVar.mo15293a();
        if (a != null) {
            for (C5303j jVar : a) {
                int i = C5676c.f14748a[jVar.ordinal()];
                if (i == 1) {
                    m21627b();
                } else if (i == 2) {
                    m21624a();
                } else if (i != 3) {
                    m21625a(jVar);
                } else {
                    m21628c();
                }
            }
        }
        if (aVar.mo15300g()) {
            LinearLayout linearLayout = this.f14740g.f13108h;
            C5942k.m22324a((Object) linearLayout, "binding.layoutSorting");
            linearLayout.setVisibility(0);
            List<C5288b0> b = aVar.mo15294b();
            if (b != null) {
                for (C5288b0 b0Var : b) {
                    int j = b0Var.mo14865j();
                    String string = getContext().getString(b0Var.mo14864i());
                    C5942k.m22324a((Object) string, "context.getString(sortField.titleRes)");
                    this.f14740g.f13105e.addView(m21626b(j, string));
                }
            }
        }
    }
}
