package com.google.android.material.appbar;

import android.view.View;
import p071f.p097h.p108m.C3379v;

/* renamed from: com.google.android.material.appbar.d */
class C2547d {

    /* renamed from: a */
    private final View f7188a;

    /* renamed from: b */
    private int f7189b;

    /* renamed from: c */
    private int f7190c;

    /* renamed from: d */
    private int f7191d;

    /* renamed from: e */
    private int f7192e;

    /* renamed from: f */
    private boolean f7193f = true;

    /* renamed from: g */
    private boolean f7194g = true;

    public C2547d(View view) {
        this.f7188a = view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7941a() {
        View view = this.f7188a;
        C3379v.m13814e(view, this.f7191d - (view.getTop() - this.f7189b));
        View view2 = this.f7188a;
        C3379v.m13811d(view2, this.f7192e - (view2.getLeft() - this.f7190c));
    }

    /* renamed from: a */
    public boolean mo7942a(int i) {
        if (!this.f7194g || this.f7192e == i) {
            return false;
        }
        this.f7192e = i;
        mo7941a();
        return true;
    }

    /* renamed from: b */
    public int mo7943b() {
        return this.f7191d;
    }

    /* renamed from: b */
    public boolean mo7944b(int i) {
        if (!this.f7193f || this.f7191d == i) {
            return false;
        }
        this.f7191d = i;
        mo7941a();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo7945c() {
        this.f7189b = this.f7188a.getTop();
        this.f7190c = this.f7188a.getLeft();
    }
}
