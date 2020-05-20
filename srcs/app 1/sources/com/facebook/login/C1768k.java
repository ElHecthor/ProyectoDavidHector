package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0429d;
import androidx.fragment.app.Fragment;
import com.facebook.common.C1515b;
import com.facebook.common.C1516c;
import com.facebook.login.C1759j.C1762c;
import com.facebook.login.C1759j.C1763d;
import com.facebook.login.C1759j.C1765e;

/* renamed from: com.facebook.login.k */
public class C1768k extends Fragment {

    /* renamed from: b0 */
    private String f5330b0;

    /* renamed from: c0 */
    private C1759j f5331c0;

    /* renamed from: d0 */
    private C1763d f5332d0;

    /* renamed from: com.facebook.login.k$a */
    class C1769a implements C1762c {
        C1769a() {
        }

        /* renamed from: a */
        public void mo6104a(C1765e eVar) {
            C1768k.this.m7642a(eVar);
        }
    }

    /* renamed from: com.facebook.login.k$b */
    class C1770b implements C1761b {

        /* renamed from: a */
        final /* synthetic */ View f5334a;

        C1770b(C1768k kVar, View view) {
            this.f5334a = view;
        }

        /* renamed from: a */
        public void mo6102a() {
            this.f5334a.setVisibility(0);
        }

        /* renamed from: b */
        public void mo6103b() {
            this.f5334a.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7642a(C1765e eVar) {
        this.f5332d0 = null;
        int i = eVar.f5318f == C1767b.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", eVar);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (mo2472L()) {
            mo2540f().setResult(i, intent);
            mo2540f().finish();
        }
    }

    /* renamed from: b */
    private void m7644b(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f5330b0 = callingActivity.getPackageName();
        }
    }

    /* renamed from: W */
    public void mo2483W() {
        this.f5331c0.mo6077a();
        super.mo2483W();
    }

    /* renamed from: a */
    public View mo2488a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo2654t0(), viewGroup, false);
        this.f5331c0.mo6079a((C1761b) new C1770b(this, inflate.findViewById(C1515b.com_facebook_login_fragment_progress_bar)));
        return inflate;
    }

    /* renamed from: a */
    public void mo2492a(int i, int i2, Intent intent) {
        super.mo2492a(i, i2, intent);
        this.f5331c0.mo6083a(i, i2, intent);
    }

    /* renamed from: a0 */
    public void mo2513a0() {
        super.mo2513a0();
        View findViewById = mo2469I() == null ? null : mo2469I().findViewById(C1515b.com_facebook_login_fragment_progress_bar);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: b0 */
    public void mo2522b0() {
        super.mo2522b0();
        if (this.f5330b0 == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            mo2540f().finish();
            return;
        }
        this.f5331c0.mo6088c(this.f5332d0);
    }

    /* renamed from: c */
    public void mo2524c(Bundle bundle) {
        super.mo2524c(bundle);
        if (bundle != null) {
            C1759j jVar = (C1759j) bundle.getParcelable("loginClient");
            this.f5331c0 = jVar;
            jVar.mo6078a((Fragment) this);
        } else {
            this.f5331c0 = mo2653s0();
        }
        this.f5331c0.mo6080a((C1762c) new C1769a());
        C0429d f = mo2540f();
        if (f != null) {
            m7644b(f);
            Intent intent = f.getIntent();
            if (intent != null) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request");
                if (bundleExtra != null) {
                    this.f5332d0 = (C1763d) bundleExtra.getParcelable("request");
                }
            }
        }
    }

    /* renamed from: e */
    public void mo2536e(Bundle bundle) {
        super.mo2536e(bundle);
        bundle.putParcelable("loginClient", this.f5331c0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public C1759j mo2653s0() {
        return new C1759j((Fragment) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public int mo2654t0() {
        return C1516c.com_facebook_login_fragment;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u0 */
    public C1759j mo6126u0() {
        return this.f5331c0;
    }
}
