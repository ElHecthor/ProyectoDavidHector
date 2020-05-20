package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.C0656n;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0560a0;
import androidx.recyclerview.widget.RecyclerView.C0579n;
import androidx.recyclerview.widget.RecyclerView.C0589t;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p071f.p097h.p107l.C3317d;
import p071f.p097h.p108m.C3323a;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4410f;
import p147g.p156d.p157a.p185c.C4411g;
import p147g.p156d.p157a.p185c.C4412h;
import p147g.p156d.p157a.p185c.C4414j;

/* renamed from: com.google.android.material.datepicker.h */
public final class C2625h<S> extends C2653p<S> {

    /* renamed from: m0 */
    static final Object f7579m0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: n0 */
    static final Object f7580n0 = "NAVIGATION_PREV_TAG";

    /* renamed from: o0 */
    static final Object f7581o0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: p0 */
    static final Object f7582p0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: c0 */
    private int f7583c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public C2620d<S> f7584d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public C2614a f7585e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public C2646l f7586f0;

    /* renamed from: g0 */
    private C2636k f7587g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public C2619c f7588h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public RecyclerView f7589i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public RecyclerView f7590j0;

    /* renamed from: k0 */
    private View f7591k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public View f7592l0;

    /* renamed from: com.google.android.material.datepicker.h$a */
    class C2626a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f7593f;

        C2626a(int i) {
            this.f7593f = i;
        }

        public void run() {
            C2625h.this.f7590j0.smoothScrollToPosition(this.f7593f);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$b */
    class C2627b extends C3323a {
        C2627b(C2625h hVar) {
        }

        /* renamed from: a */
        public void mo2349a(View view, C3347c cVar) {
            super.mo2349a(view, cVar);
            cVar.mo10747a((Object) null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$c */
    class C2628c extends C2654q {

        /* renamed from: I */
        final /* synthetic */ int f7595I;

        C2628c(Context context, int i, boolean z, int i2) {
            this.f7595I = i2;
            super(context, i, z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3158a(C0560a0 a0Var, int[] iArr) {
            if (this.f7595I == 0) {
                iArr[0] = C2625h.this.f7590j0.getWidth();
                iArr[1] = C2625h.this.f7590j0.getWidth();
                return;
            }
            iArr[0] = C2625h.this.f7590j0.getHeight();
            iArr[1] = C2625h.this.f7590j0.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$d */
    class C2629d implements C2637l {
        C2629d() {
        }

        /* renamed from: a */
        public void mo8644a(long j) {
            if (C2625h.this.f7585e0.mo8600a().mo8614d(j)) {
                C2625h.this.f7584d0.mo8621g(j);
                Iterator it = C2625h.this.f7659b0.iterator();
                while (it.hasNext()) {
                    ((C2652o) it.next()).mo8652a(C2625h.this.f7584d0.mo8625q());
                }
                C2625h.this.f7590j0.getAdapter().mo3485e();
                if (C2625h.this.f7589i0 != null) {
                    C2625h.this.f7589i0.getAdapter().mo3485e();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$e */
    class C2630e extends C0579n {

        /* renamed from: a */
        private final Calendar f7598a = C2656r.m10961d();

        /* renamed from: b */
        private final Calendar f7599b = C2656r.m10961d();

        C2630e() {
        }

        /* renamed from: a */
        public void mo3526a(Canvas canvas, RecyclerView recyclerView, C0560a0 a0Var) {
            if ((recyclerView.getAdapter() instanceof C2657s) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C2657s sVar = (C2657s) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C3317d dVar : C2625h.this.f7584d0.mo8622l()) {
                    F f = dVar.f9493a;
                    if (!(f == null || dVar.f9494b == null)) {
                        this.f7598a.setTimeInMillis(((Long) f).longValue());
                        this.f7599b.setTimeInMillis(((Long) dVar.f9494b).longValue());
                        int c = sVar.mo8688c(this.f7598a.get(1));
                        int c2 = sVar.mo8688c(this.f7599b.get(1));
                        View c3 = gridLayoutManager.mo3167c(c);
                        View c4 = gridLayoutManager.mo3167c(c2);
                        int N = c / gridLayoutManager.mo3100N();
                        int N2 = c2 / gridLayoutManager.mo3100N();
                        int i = N;
                        while (i <= N2) {
                            View c5 = gridLayoutManager.mo3167c(gridLayoutManager.mo3100N() * i);
                            if (c5 != null) {
                                canvas.drawRect((float) (i == N ? c3.getLeft() + (c3.getWidth() / 2) : 0), (float) (c5.getTop() + C2625h.this.f7588h0.f7569d.mo8617b()), (float) (i == N2 ? c4.getLeft() + (c4.getWidth() / 2) : recyclerView.getWidth()), (float) (c5.getBottom() - C2625h.this.f7588h0.f7569d.mo8615a()), C2625h.this.f7588h0.f7573h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$f */
    class C2631f extends C3323a {
        C2631f() {
        }

        /* renamed from: a */
        public void mo2349a(View view, C3347c cVar) {
            C2625h hVar;
            int i;
            super.mo2349a(view, cVar);
            if (C2625h.this.f7592l0.getVisibility() == 0) {
                hVar = C2625h.this;
                i = C4414j.mtrl_picker_toggle_to_year_selection;
            } else {
                hVar = C2625h.this;
                i = C4414j.mtrl_picker_toggle_to_day_selection;
            }
            cVar.mo10765d((CharSequence) hVar.mo2491a(i));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$g */
    class C2632g extends C0589t {

        /* renamed from: a */
        final /* synthetic */ C2649n f7602a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f7603b;

        C2632g(C2649n nVar, MaterialButton materialButton) {
            this.f7602a = nVar;
            this.f7603b = materialButton;
        }

        /* renamed from: a */
        public void mo3640a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f7603b.getText();
                if (VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        /* renamed from: a */
        public void mo3641a(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager x0 = C2625h.this.mo8641x0();
            int H = i < 0 ? x0.mo3143H() : x0.mo3144I();
            C2625h.this.f7586f0 = this.f7602a.mo8683c(H);
            this.f7603b.setText(this.f7602a.mo8684d(H));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$h */
    class C2633h implements OnClickListener {
        C2633h() {
        }

        public void onClick(View view) {
            C2625h.this.mo8642y0();
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$i */
    class C2634i implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C2649n f7606f;

        C2634i(C2649n nVar) {
            this.f7606f = nVar;
        }

        public void onClick(View view) {
            int H = C2625h.this.mo8641x0().mo3143H() + 1;
            if (H < C2625h.this.f7590j0.getAdapter().mo3472b()) {
                C2625h.this.mo8637a(this.f7606f.mo8683c(H));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$j */
    class C2635j implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C2649n f7608f;

        C2635j(C2649n nVar) {
            this.f7608f = nVar;
        }

        public void onClick(View view) {
            int I = C2625h.this.mo8641x0().mo3144I() - 1;
            if (I >= 0) {
                C2625h.this.mo8637a(this.f7608f.mo8683c(I));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$k */
    enum C2636k {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.h$l */
    interface C2637l {
        /* renamed from: a */
        void mo8644a(long j);
    }

    /* renamed from: a */
    static <T> C2625h<T> m10852a(C2620d<T> dVar, int i, C2614a aVar) {
        C2625h<T> hVar = new C2625h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.mo8603d());
        hVar.mo2566m(bundle);
        return hVar;
    }

    /* renamed from: a */
    private void m10854a(View view, C2649n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C4410f.month_navigation_fragment_toggle);
        materialButton.setTag(f7582p0);
        C3379v.m13788a((View) materialButton, (C3323a) new C2631f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C4410f.month_navigation_previous);
        materialButton2.setTag(f7580n0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C4410f.month_navigation_next);
        materialButton3.setTag(f7581o0);
        this.f7591k0 = view.findViewById(C4410f.mtrl_calendar_year_selector_frame);
        this.f7592l0 = view.findViewById(C4410f.mtrl_calendar_day_selector_frame);
        mo8636a(C2636k.DAY);
        materialButton.setText(this.f7586f0.mo8663g());
        this.f7590j0.addOnScrollListener(new C2632g(nVar, materialButton));
        materialButton.setOnClickListener(new C2633h());
        materialButton3.setOnClickListener(new C2634i(nVar));
        materialButton2.setOnClickListener(new C2635j(nVar));
    }

    /* renamed from: b */
    static int m10855b(Context context) {
        return context.getResources().getDimensionPixelSize(C4408d.mtrl_calendar_day_height);
    }

    /* renamed from: e */
    private void m10860e(int i) {
        this.f7590j0.post(new C2626a(i));
    }

    /* renamed from: z0 */
    private C0579n m10862z0() {
        return new C2630e();
    }

    /* renamed from: a */
    public View mo2488a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mo2568n(), this.f7583c0);
        this.f7588h0 = new C2619c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C2646l e = this.f7585e0.mo8605e();
        if (C2638i.m10898g((Context) contextThemeWrapper)) {
            i2 = C4412h.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = C4412h.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C4410f.mtrl_calendar_days_of_week);
        C3379v.m13788a((View) gridView, (C3323a) new C2627b(this));
        gridView.setAdapter(new C2624g());
        gridView.setNumColumns(e.f7643j);
        gridView.setEnabled(false);
        this.f7590j0 = (RecyclerView) inflate.findViewById(C4410f.mtrl_calendar_months);
        C2628c cVar = new C2628c(mo2568n(), i, false, i);
        this.f7590j0.setLayoutManager(cVar);
        this.f7590j0.setTag(f7579m0);
        C2649n nVar = new C2649n(contextThemeWrapper, this.f7584d0, this.f7585e0, new C2629d());
        this.f7590j0.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(C4411g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C4410f.mtrl_calendar_year_selector_frame);
        this.f7589i0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f7589i0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f7589i0.setAdapter(new C2657s(this));
            this.f7589i0.addItemDecoration(m10862z0());
        }
        if (inflate.findViewById(C4410f.month_navigation_fragment_toggle) != null) {
            m10854a(inflate, nVar);
        }
        if (!C2638i.m10898g((Context) contextThemeWrapper)) {
            new C0656n().mo3984a(this.f7590j0);
        }
        this.f7590j0.scrollToPosition(nVar.mo8681a(this.f7586f0));
        return inflate;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8636a(C2636k kVar) {
        this.f7587g0 = kVar;
        if (kVar == C2636k.YEAR) {
            this.f7589i0.getLayoutManager().mo3171i(((C2657s) this.f7589i0.getAdapter()).mo8688c(this.f7586f0.f7642i));
            this.f7591k0.setVisibility(0);
            this.f7592l0.setVisibility(8);
        } else if (kVar == C2636k.DAY) {
            this.f7591k0.setVisibility(8);
            this.f7592l0.setVisibility(0);
            mo8637a(this.f7586f0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8637a(C2646l lVar) {
        RecyclerView recyclerView;
        int i;
        C2649n nVar = (C2649n) this.f7590j0.getAdapter();
        int a = nVar.mo8681a(lVar);
        int a2 = a - nVar.mo8681a(this.f7586f0);
        boolean z = true;
        boolean z2 = Math.abs(a2) > 3;
        if (a2 <= 0) {
            z = false;
        }
        this.f7586f0 = lVar;
        if (!z2 || !z) {
            if (z2) {
                recyclerView = this.f7590j0;
                i = a + 3;
            }
            m10860e(a);
        }
        recyclerView = this.f7590j0;
        i = a - 3;
        recyclerView.scrollToPosition(i);
        m10860e(a);
    }

    /* renamed from: c */
    public void mo2524c(Bundle bundle) {
        super.mo2524c(bundle);
        if (bundle == null) {
            bundle = mo2562l();
        }
        this.f7583c0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f7584d0 = (C2620d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f7585e0 = (C2614a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f7586f0 = (C2646l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* renamed from: e */
    public void mo2536e(Bundle bundle) {
        super.mo2536e(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f7583c0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f7584d0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7585e0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f7586f0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t0 */
    public C2614a mo2654t0() {
        return this.f7585e0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u0 */
    public C2619c mo8638u0() {
        return this.f7588h0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v0 */
    public C2646l mo8639v0() {
        return this.f7586f0;
    }

    /* renamed from: w0 */
    public C2620d<S> mo8640w0() {
        return this.f7584d0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x0 */
    public LinearLayoutManager mo8641x0() {
        return (LinearLayoutManager) this.f7590j0.getLayoutManager();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y0 */
    public void mo8642y0() {
        C2636k kVar;
        C2636k kVar2 = this.f7587g0;
        if (kVar2 == C2636k.YEAR) {
            kVar = C2636k.DAY;
        } else if (kVar2 == C2636k.DAY) {
            kVar = C2636k.YEAR;
        } else {
            return;
        }
        mo8636a(kVar);
    }
}
