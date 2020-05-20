package com.bumptech.glide.p022o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.C0445l;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.C0832c;
import com.bumptech.glide.C0852k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.o.o */
public class C1251o extends Fragment {

    /* renamed from: b0 */
    private final C1232a f4157b0;

    /* renamed from: c0 */
    private final C1249m f4158c0;

    /* renamed from: d0 */
    private final Set<C1251o> f4159d0;

    /* renamed from: e0 */
    private C1251o f4160e0;

    /* renamed from: f0 */
    private C0852k f4161f0;

    /* renamed from: g0 */
    private Fragment f4162g0;

    /* renamed from: com.bumptech.glide.o.o$a */
    private class C1252a implements C1249m {
        C1252a() {
        }

        /* renamed from: a */
        public Set<C0852k> mo5188a() {
            Set<C1251o> s0 = C1251o.this.mo2653s0();
            HashSet hashSet = new HashSet(s0.size());
            for (C1251o oVar : s0) {
                if (oVar.mo5218u0() != null) {
                    hashSet.add(oVar.mo5218u0());
                }
            }
            return hashSet;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(C1251o.this);
            sb.append("}");
            return sb.toString();
        }
    }

    public C1251o() {
        this(new C1232a());
    }

    @SuppressLint({"ValidFragment"})
    public C1251o(C1232a aVar) {
        this.f4158c0 = new C1252a();
        this.f4159d0 = new HashSet();
        this.f4157b0 = aVar;
    }

    /* renamed from: a */
    private void m5856a(Context context, C0445l lVar) {
        m5862x0();
        C1251o a = C0832c.m4445a(context).mo4526h().mo5205a(context, lVar);
        this.f4160e0 = a;
        if (!equals(a)) {
            this.f4160e0.m5857a(this);
        }
    }

    /* renamed from: a */
    private void m5857a(C1251o oVar) {
        this.f4159d0.add(oVar);
    }

    /* renamed from: b */
    private void m5858b(C1251o oVar) {
        this.f4159d0.remove(oVar);
    }

    /* renamed from: c */
    private static C0445l m5859c(Fragment fragment) {
        while (fragment.mo2588x() != null) {
            fragment = fragment.mo2588x();
        }
        return fragment.mo2581s();
    }

    /* renamed from: d */
    private boolean m5860d(Fragment fragment) {
        Fragment w0 = m5861w0();
        while (true) {
            Fragment x = fragment.mo2588x();
            if (x == null) {
                return false;
            }
            if (x.equals(w0)) {
                return true;
            }
            fragment = fragment.mo2588x();
        }
    }

    /* renamed from: w0 */
    private Fragment m5861w0() {
        Fragment x = mo2588x();
        return x != null ? x : this.f4162g0;
    }

    /* renamed from: x0 */
    private void m5862x0() {
        C1251o oVar = this.f4160e0;
        if (oVar != null) {
            oVar.m5858b(this);
            this.f4160e0 = null;
        }
    }

    /* renamed from: W */
    public void mo2483W() {
        super.mo2483W();
        this.f4157b0.mo5180a();
        m5862x0();
    }

    /* renamed from: Z */
    public void mo2486Z() {
        super.mo2486Z();
        this.f4162g0 = null;
        m5862x0();
    }

    /* renamed from: a */
    public void mo2497a(Context context) {
        super.mo2497a(context);
        C0445l c = m5859c(this);
        String str = "SupportRMFragment";
        if (c == null) {
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to register fragment with root, ancestor detached");
            }
            return;
        }
        try {
            m5856a(mo2568n(), c);
        } catch (IllegalStateException e) {
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to register fragment with root", e);
            }
        }
    }

    /* renamed from: a */
    public void mo5216a(C0852k kVar) {
        this.f4161f0 = kVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5217b(Fragment fragment) {
        this.f4162g0 = fragment;
        if (!(fragment == null || fragment.mo2568n() == null)) {
            C0445l c = m5859c(fragment);
            if (c != null) {
                m5856a(fragment.mo2568n(), c);
            }
        }
    }

    /* renamed from: c0 */
    public void mo2528c0() {
        super.mo2528c0();
        this.f4157b0.mo5182b();
    }

    /* renamed from: d0 */
    public void mo2534d0() {
        super.mo2534d0();
        this.f4157b0.mo5184c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s0 */
    public Set<C1251o> mo2653s0() {
        C1251o oVar = this.f4160e0;
        if (oVar == null) {
            return Collections.emptySet();
        }
        if (equals(oVar)) {
            return Collections.unmodifiableSet(this.f4159d0);
        }
        HashSet hashSet = new HashSet();
        for (C1251o oVar2 : this.f4160e0.mo2653s0()) {
            if (m5860d(oVar2.m5861w0())) {
                hashSet.add(oVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t0 */
    public C1232a mo2654t0() {
        return this.f4157b0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        sb.append(m5861w0());
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u0 */
    public C0852k mo5218u0() {
        return this.f4161f0;
    }

    /* renamed from: v0 */
    public C1249m mo5219v0() {
        return this.f4158c0;
    }
}
