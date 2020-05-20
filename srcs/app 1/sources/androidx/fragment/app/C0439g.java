package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0510d0;
import p071f.p097h.p107l.C3321h;

/* renamed from: androidx.fragment.app.g */
public class C0439g {

    /* renamed from: a */
    private final C0441i<?> f1992a;

    private C0439g(C0441i<?> iVar) {
        this.f1992a = iVar;
    }

    /* renamed from: a */
    public static C0439g m2311a(C0441i<?> iVar) {
        C3321h.m13544a(iVar, (Object) "callbacks == null");
        return new C0439g(iVar);
    }

    /* renamed from: a */
    public View mo2704a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1992a.f1997i.mo2816q().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public Fragment mo2705a(String str) {
        return this.f1992a.f1997i.mo2786c(str);
    }

    /* renamed from: a */
    public void mo2706a() {
        this.f1992a.f1997i.mo2790d();
    }

    /* renamed from: a */
    public void mo2707a(Configuration configuration) {
        this.f1992a.f1997i.mo2757a(configuration);
    }

    /* renamed from: a */
    public void mo2708a(Parcelable parcelable) {
        C0441i<?> iVar = this.f1992a;
        if (iVar instanceof C0510d0) {
            iVar.f1997i.mo2759a(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: a */
    public void mo2709a(Menu menu) {
        this.f1992a.f1997i.mo2760a(menu);
    }

    /* renamed from: a */
    public void mo2710a(Fragment fragment) {
        C0441i<?> iVar = this.f1992a;
        iVar.f1997i.mo2768a(iVar, (C0438f) iVar, fragment);
    }

    /* renamed from: a */
    public void mo2711a(boolean z) {
        this.f1992a.f1997i.mo2773a(z);
    }

    /* renamed from: a */
    public boolean mo2712a(Menu menu, MenuInflater menuInflater) {
        return this.f1992a.f1997i.mo2774a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean mo2713a(MenuItem menuItem) {
        return this.f1992a.f1997i.mo2775a(menuItem);
    }

    /* renamed from: b */
    public void mo2714b() {
        this.f1992a.f1997i.mo2793e();
    }

    /* renamed from: b */
    public void mo2715b(boolean z) {
        this.f1992a.f1997i.mo2782b(z);
    }

    /* renamed from: b */
    public boolean mo2716b(Menu menu) {
        return this.f1992a.f1997i.mo2784b(menu);
    }

    /* renamed from: b */
    public boolean mo2717b(MenuItem menuItem) {
        return this.f1992a.f1997i.mo2785b(menuItem);
    }

    /* renamed from: c */
    public void mo2718c() {
        this.f1992a.f1997i.mo2794f();
    }

    /* renamed from: d */
    public void mo2719d() {
        this.f1992a.f1997i.mo2798h();
    }

    /* renamed from: e */
    public void mo2720e() {
        this.f1992a.f1997i.mo2800i();
    }

    /* renamed from: f */
    public void mo2721f() {
        this.f1992a.f1997i.mo2804k();
    }

    /* renamed from: g */
    public void mo2722g() {
        this.f1992a.f1997i.mo2806l();
    }

    /* renamed from: h */
    public void mo2723h() {
        this.f1992a.f1997i.mo2808m();
    }

    /* renamed from: i */
    public boolean mo2724i() {
        return this.f1992a.f1997i.mo2789c(true);
    }

    /* renamed from: j */
    public C0445l mo2725j() {
        return this.f1992a.f1997i;
    }

    /* renamed from: k */
    public void mo2726k() {
        this.f1992a.f1997i.mo2824x();
    }

    /* renamed from: l */
    public Parcelable mo2727l() {
        return this.f1992a.f1997i.mo2826z();
    }
}
