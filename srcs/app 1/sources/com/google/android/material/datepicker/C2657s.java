package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import androidx.recyclerview.widget.RecyclerView.C0569g;
import java.util.Calendar;
import java.util.Locale;
import p147g.p156d.p157a.p185c.C4412h;
import p147g.p156d.p157a.p185c.C4414j;

/* renamed from: com.google.android.material.datepicker.s */
class C2657s extends C0569g<C2659b> {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2625h<?> f7660c;

    /* renamed from: com.google.android.material.datepicker.s$a */
    class C2658a implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ int f7661f;

        C2658a(int i) {
            this.f7661f = i;
        }

        public void onClick(View view) {
            C2657s.this.f7660c.mo8637a(C2646l.m10915a(this.f7661f, C2657s.this.f7660c.mo8639v0().f7641h));
            C2657s.this.f7660c.mo8636a(C2636k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.s$b */
    public static class C2659b extends C0566d0 {

        /* renamed from: t */
        final TextView f7663t;

        C2659b(TextView textView) {
            super(textView);
            this.f7663t = textView;
        }
    }

    C2657s(C2625h<?> hVar) {
        this.f7660c = hVar;
    }

    /* renamed from: e */
    private OnClickListener m10964e(int i) {
        return new C2658a(i);
    }

    /* renamed from: a */
    public void mo3477b(C2659b bVar, int i) {
        int d = mo8689d(i);
        String string = bVar.f7663t.getContext().getString(C4414j.mtrl_picker_navigate_to_year_description);
        bVar.f7663t.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(d)}));
        bVar.f7663t.setContentDescription(String.format(string, new Object[]{Integer.valueOf(d)}));
        C2619c u0 = this.f7660c.mo8638u0();
        Calendar b = C2656r.m10956b();
        C2618b bVar2 = b.get(1) == d ? u0.f7571f : u0.f7569d;
        for (Long longValue : this.f7660c.mo8640w0().mo8624p()) {
            b.setTimeInMillis(longValue.longValue());
            if (b.get(1) == d) {
                bVar2 = u0.f7570e;
            }
        }
        bVar2.mo8616a(bVar.f7663t);
        bVar.f7663t.setOnClickListener(m10964e(d));
    }

    /* renamed from: b */
    public int mo3472b() {
        return this.f7660c.mo2654t0().mo8607f();
    }

    /* renamed from: b */
    public C2659b m10968b(ViewGroup viewGroup, int i) {
        return new C2659b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C4412h.mtrl_calendar_year, viewGroup, false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo8688c(int i) {
        return i - this.f7660c.mo2654t0().mo8605e().f7642i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo8689d(int i) {
        return this.f7660c.mo2654t0().mo8605e().f7642i + i;
    }
}
