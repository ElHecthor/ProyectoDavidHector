package com.bumptech.glide.p022o;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.C0832c;
import com.bumptech.glide.C0852k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: com.bumptech.glide.o.k */
public class C1244k extends Fragment {

    /* renamed from: f */
    private final C1232a f4141f;

    /* renamed from: g */
    private final C1249m f4142g;

    /* renamed from: h */
    private final Set<C1244k> f4143h;

    /* renamed from: i */
    private C0852k f4144i;

    /* renamed from: j */
    private C1244k f4145j;

    /* renamed from: k */
    private Fragment f4146k;

    /* renamed from: com.bumptech.glide.o.k$a */
    private class C1245a implements C1249m {
        C1245a() {
        }

        /* renamed from: a */
        public Set<C0852k> mo5188a() {
            Set<C1244k> a = C1244k.this.mo5189a();
            HashSet hashSet = new HashSet(a.size());
            for (C1244k kVar : a) {
                if (kVar.mo5193c() != null) {
                    hashSet.add(kVar.mo5193c());
                }
            }
            return hashSet;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(C1244k.this);
            sb.append("}");
            return sb.toString();
        }
    }

    public C1244k() {
        this(new C1232a());
    }

    @SuppressLint({"ValidFragment"})
    C1244k(C1232a aVar) {
        this.f4142g = new C1245a();
        this.f4143h = new HashSet();
        this.f4141f = aVar;
    }

    /* renamed from: a */
    private void m5820a(Activity activity) {
        m5825f();
        C1244k b = C0832c.m4445a((Context) activity).mo4526h().mo5206b(activity);
        this.f4145j = b;
        if (!equals(b)) {
            this.f4145j.m5821a(this);
        }
    }

    /* renamed from: a */
    private void m5821a(C1244k kVar) {
        this.f4143h.add(kVar);
    }

    /* renamed from: b */
    private void m5822b(C1244k kVar) {
        this.f4143h.remove(kVar);
    }

    @TargetApi(17)
    /* renamed from: b */
    private boolean m5823b(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    @TargetApi(17)
    /* renamed from: e */
    private Fragment m5824e() {
        Fragment parentFragment = VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f4146k;
    }

    /* renamed from: f */
    private void m5825f() {
        C1244k kVar = this.f4145j;
        if (kVar != null) {
            kVar.m5822b(this);
            this.f4145j = null;
        }
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(17)
    /* renamed from: a */
    public Set<C1244k> mo5189a() {
        if (equals(this.f4145j)) {
            return Collections.unmodifiableSet(this.f4143h);
        }
        if (this.f4145j == null || VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (C1244k kVar : this.f4145j.mo5189a()) {
            if (m5823b(kVar.getParentFragment())) {
                hashSet.add(kVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5190a(Fragment fragment) {
        this.f4146k = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m5820a(fragment.getActivity());
        }
    }

    /* renamed from: a */
    public void mo5191a(C0852k kVar) {
        this.f4144i = kVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C1232a mo5192b() {
        return this.f4141f;
    }

    /* renamed from: c */
    public C0852k mo5193c() {
        return this.f4144i;
    }

    /* renamed from: d */
    public C1249m mo5194d() {
        return this.f4142g;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m5820a(activity);
        } catch (IllegalStateException e) {
            String str = "RMFragment";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f4141f.mo5180a();
        m5825f();
    }

    public void onDetach() {
        super.onDetach();
        m5825f();
    }

    public void onStart() {
        super.onStart();
        this.f4141f.mo5182b();
    }

    public void onStop() {
        super.onStop();
        this.f4141f.mo5184c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        sb.append(m5824e());
        sb.append("}");
        return sb.toString();
    }
}
