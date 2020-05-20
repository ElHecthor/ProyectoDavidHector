package p071f.p097h.p108m;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: f.h.m.q */
public class C3374q {

    /* renamed from: a */
    private int f9577a;

    /* renamed from: b */
    private int f9578b;

    public C3374q(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int mo10831a() {
        return this.f9577a | this.f9578b;
    }

    /* renamed from: a */
    public void mo10832a(View view) {
        mo10833a(view, 0);
    }

    /* renamed from: a */
    public void mo10833a(View view, int i) {
        if (i == 1) {
            this.f9578b = 0;
        } else {
            this.f9577a = 0;
        }
    }

    /* renamed from: a */
    public void mo10834a(View view, View view2, int i) {
        mo10835a(view, view2, i, 0);
    }

    /* renamed from: a */
    public void mo10835a(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f9578b = i;
        } else {
            this.f9577a = i;
        }
    }
}
