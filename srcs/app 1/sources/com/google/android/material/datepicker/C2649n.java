package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import androidx.recyclerview.widget.RecyclerView.C0569g;
import androidx.recyclerview.widget.RecyclerView.C0585p;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4410f;
import p147g.p156d.p157a.p185c.C4412h;

/* renamed from: com.google.android.material.datepicker.n */
class C2649n extends C0569g<C2651b> {

    /* renamed from: c */
    private final C2614a f7651c;

    /* renamed from: d */
    private final C2620d<?> f7652d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2637l f7653e;

    /* renamed from: f */
    private final int f7654f;

    /* renamed from: com.google.android.material.datepicker.n$a */
    class C2650a implements OnItemClickListener {

        /* renamed from: f */
        final /* synthetic */ MaterialCalendarGridView f7655f;

        C2650a(MaterialCalendarGridView materialCalendarGridView) {
            this.f7655f = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f7655f.getAdapter().mo8675e(i)) {
                C2649n.this.f7653e.mo8644a(this.f7655f.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.n$b */
    public static class C2651b extends C0566d0 {

        /* renamed from: t */
        final TextView f7657t;

        /* renamed from: u */
        final MaterialCalendarGridView f7658u;

        C2651b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C4410f.month_title);
            this.f7657t = textView;
            C3379v.m13797a((View) textView, true);
            this.f7658u = (MaterialCalendarGridView) linearLayout.findViewById(C4410f.month_grid);
            if (!z) {
                this.f7657t.setVisibility(8);
            }
        }
    }

    C2649n(Context context, C2620d<?> dVar, C2614a aVar, C2637l lVar) {
        C2646l e = aVar.mo8605e();
        C2646l b = aVar.mo8601b();
        C2646l d = aVar.mo8603d();
        if (e.compareTo(d) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (d.compareTo(b) <= 0) {
            this.f7654f = (C2648m.f7646j * C2625h.m10855b(context)) + (C2638i.m10898g(context) ? C2625h.m10855b(context) : 0);
            this.f7651c = aVar;
            this.f7652d = dVar;
            this.f7653e = lVar;
            mo3470a(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo8681a(C2646l lVar) {
        return this.f7651c.mo8605e().mo8657b(lVar);
    }

    /* renamed from: a */
    public long mo3462a(int i) {
        return this.f7651c.mo8605e().mo8658b(i).mo8664h();
    }

    /* renamed from: a */
    public void mo3477b(C2651b bVar, int i) {
        C2646l b = this.f7651c.mo8605e().mo8658b(i);
        bVar.f7657t.setText(b.mo8663g());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f7658u.findViewById(C4410f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !b.equals(materialCalendarGridView.getAdapter().f7647f)) {
            C2648m mVar = new C2648m(b, this.f7652d, this.f7651c);
            materialCalendarGridView.setNumColumns(b.f7643j);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new C2650a(materialCalendarGridView));
    }

    /* renamed from: b */
    public int mo3472b() {
        return this.f7651c.mo8602c();
    }

    /* renamed from: b */
    public C2651b m10939b(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C4412h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C2638i.m10898g(viewGroup.getContext())) {
            return new C2651b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0585p(-1, this.f7654f));
        return new C2651b(linearLayout, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C2646l mo8683c(int i) {
        return this.f7651c.mo8605e().mo8658b(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public CharSequence mo8684d(int i) {
        return mo8683c(i).mo8663g();
    }
}
