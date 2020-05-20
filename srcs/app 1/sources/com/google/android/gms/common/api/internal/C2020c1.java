package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.C0429d;
import androidx.fragment.app.C0466s;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import p071f.p088e.C3162a;
import p147g.p156d.p157a.p167b.p173d.p178e.C3886h;

/* renamed from: com.google.android.gms.common.api.internal.c1 */
public final class C2020c1 extends Fragment implements C2034i {

    /* renamed from: e0 */
    private static WeakHashMap<C0429d, WeakReference<C2020c1>> f5857e0 = new WeakHashMap<>();

    /* renamed from: b0 */
    private Map<String, LifecycleCallback> f5858b0 = new C3162a();
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public int f5859c0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public Bundle f5860d0;

    /* renamed from: a */
    public static C2020c1 m8408a(C0429d dVar) {
        String str = "SupportLifecycleFragmentImpl";
        WeakReference weakReference = (WeakReference) f5857e0.get(dVar);
        if (weakReference != null) {
            C2020c1 c1Var = (C2020c1) weakReference.get();
            if (c1Var != null) {
                return c1Var;
            }
        }
        try {
            C2020c1 c1Var2 = (C2020c1) dVar.mo2666l().mo2777b(str);
            if (c1Var2 == null || c1Var2.mo2477Q()) {
                c1Var2 = new C2020c1();
                C0466s b = dVar.mo2666l().mo2778b();
                b.mo2914a((Fragment) c1Var2, str);
                b.mo2629b();
            }
            f5857e0.put(dVar, new WeakReference(c1Var2));
            return c1Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    /* renamed from: W */
    public final void mo2483W() {
        super.mo2483W();
        this.f5859c0 = 5;
        for (LifecycleCallback b : this.f5858b0.values()) {
            b.mo6645b();
        }
    }

    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo6671a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f5858b0.get(str));
    }

    /* renamed from: a */
    public final void mo2492a(int i, int i2, Intent intent) {
        super.mo2492a(i, i2, intent);
        for (LifecycleCallback a : this.f5858b0.values()) {
            a.mo6642a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public final void mo6672a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f5858b0.containsKey(str)) {
            this.f5858b0.put(str, lifecycleCallback);
            if (this.f5859c0 > 0) {
                new C3886h(Looper.getMainLooper()).post(new C2016b1(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo2510a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo2510a(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f5858b0.values()) {
            a.mo6644a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: b0 */
    public final void mo2522b0() {
        super.mo2522b0();
        this.f5859c0 = 3;
        for (LifecycleCallback c : this.f5858b0.values()) {
            c.mo6647c();
        }
    }

    /* renamed from: c */
    public final void mo2524c(Bundle bundle) {
        super.mo2524c(bundle);
        this.f5859c0 = 1;
        this.f5860d0 = bundle;
        for (Entry entry : this.f5858b0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo6643a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* renamed from: c0 */
    public final void mo2528c0() {
        super.mo2528c0();
        this.f5859c0 = 2;
        for (LifecycleCallback d : this.f5858b0.values()) {
            d.mo6648d();
        }
    }

    /* renamed from: d */
    public final /* synthetic */ Activity mo6673d() {
        return mo2540f();
    }

    /* renamed from: d0 */
    public final void mo2534d0() {
        super.mo2534d0();
        this.f5859c0 = 4;
        for (LifecycleCallback e : this.f5858b0.values()) {
            e.mo6649e();
        }
    }

    /* renamed from: e */
    public final void mo2536e(Bundle bundle) {
        super.mo2536e(bundle);
        if (bundle != null) {
            for (Entry entry : this.f5858b0.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo6646b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }
}
