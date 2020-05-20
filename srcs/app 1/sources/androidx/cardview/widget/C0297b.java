package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: androidx.cardview.widget.b */
class C0297b implements C0301e {
    C0297b() {
    }

    /* renamed from: j */
    private C0302f m1502j(C0300d dVar) {
        return (C0302f) dVar.mo1876d();
    }

    /* renamed from: a */
    public float mo1879a(C0300d dVar) {
        return m1502j(dVar).mo1897b();
    }

    /* renamed from: a */
    public void mo1877a() {
    }

    /* renamed from: a */
    public void mo1880a(C0300d dVar, float f) {
        m1502j(dVar).mo1894a(f);
    }

    /* renamed from: a */
    public void mo1881a(C0300d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        dVar.mo1873a(new C0302f(colorStateList, f));
        View a = dVar.mo1870a();
        a.setClipToOutline(true);
        a.setElevation(f2);
        mo1886c(dVar, f3);
    }

    /* renamed from: a */
    public void mo1882a(C0300d dVar, ColorStateList colorStateList) {
        m1502j(dVar).mo1896a(colorStateList);
    }

    /* renamed from: b */
    public ColorStateList mo1883b(C0300d dVar) {
        return m1502j(dVar).mo1893a();
    }

    /* renamed from: b */
    public void mo1884b(C0300d dVar, float f) {
        dVar.mo1870a().setElevation(f);
    }

    /* renamed from: c */
    public float mo1885c(C0300d dVar) {
        return dVar.mo1870a().getElevation();
    }

    /* renamed from: c */
    public void mo1886c(C0300d dVar, float f) {
        m1502j(dVar).mo1895a(f, dVar.mo1875c(), dVar.mo1874b());
        mo1887d(dVar);
    }

    /* renamed from: d */
    public void mo1887d(C0300d dVar) {
        if (!dVar.mo1875c()) {
            dVar.mo1872a(0, 0, 0, 0);
            return;
        }
        float a = mo1879a(dVar);
        float e = mo1888e(dVar);
        int ceil = (int) Math.ceil((double) C0303g.m1567a(a, e, dVar.mo1874b()));
        int ceil2 = (int) Math.ceil((double) C0303g.m1570b(a, e, dVar.mo1874b()));
        dVar.mo1872a(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: e */
    public float mo1888e(C0300d dVar) {
        return m1502j(dVar).mo1898c();
    }

    /* renamed from: f */
    public float mo1889f(C0300d dVar) {
        return mo1888e(dVar) * 2.0f;
    }

    /* renamed from: g */
    public float mo1890g(C0300d dVar) {
        return mo1888e(dVar) * 2.0f;
    }

    /* renamed from: h */
    public void mo1891h(C0300d dVar) {
        mo1886c(dVar, mo1879a(dVar));
    }

    /* renamed from: i */
    public void mo1892i(C0300d dVar) {
        mo1886c(dVar, mo1879a(dVar));
    }
}
