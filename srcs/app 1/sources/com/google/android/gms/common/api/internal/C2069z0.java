package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import p071f.p088e.C3162a;
import p147g.p156d.p157a.p167b.p173d.p178e.C3886h;

/* renamed from: com.google.android.gms.common.api.internal.z0 */
public final class C2069z0 extends Fragment implements C2034i {

    /* renamed from: i */
    private static WeakHashMap<Activity, WeakReference<C2069z0>> f5957i = new WeakHashMap<>();

    /* renamed from: f */
    private Map<String, LifecycleCallback> f5958f = new C3162a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f5959g = 0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Bundle f5960h;

    /* renamed from: a */
    public static C2069z0 m8586a(Activity activity) {
        String str = "LifecycleFragmentImpl";
        WeakReference weakReference = (WeakReference) f5957i.get(activity);
        if (weakReference != null) {
            C2069z0 z0Var = (C2069z0) weakReference.get();
            if (z0Var != null) {
                return z0Var;
            }
        }
        try {
            C2069z0 z0Var2 = (C2069z0) activity.getFragmentManager().findFragmentByTag(str);
            if (z0Var2 == null || z0Var2.isRemoving()) {
                z0Var2 = new C2069z0();
                activity.getFragmentManager().beginTransaction().add(z0Var2, str).commitAllowingStateLoss();
            }
            f5957i.put(activity, new WeakReference(z0Var2));
            return z0Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo6671a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f5958f.get(str));
    }

    /* renamed from: a */
    public final void mo6672a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f5958f.containsKey(str)) {
            this.f5958f.put(str, lifecycleCallback);
            if (this.f5959g > 0) {
                new C3886h(Looper.getMainLooper()).post(new C2013a1(this, lifecycleCallback, str));
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

    /* renamed from: d */
    public final Activity mo6673d() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f5958f.values()) {
            a.mo6644a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.f5958f.values()) {
            a.mo6642a(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5959g = 1;
        this.f5960h = bundle;
        for (Entry entry : this.f5958f.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo6643a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f5959g = 5;
        for (LifecycleCallback b : this.f5958f.values()) {
            b.mo6645b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f5959g = 3;
        for (LifecycleCallback c : this.f5958f.values()) {
            c.mo6647c();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f5958f.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo6646b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f5959g = 2;
        for (LifecycleCallback d : this.f5958f.values()) {
            d.mo6648d();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f5959g = 4;
        for (LifecycleCallback e : this.f5958f.values()) {
            e.mo6649e();
        }
    }
}
