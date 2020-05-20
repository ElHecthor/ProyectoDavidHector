package com.bumptech.glide.p022o;

import android.util.Log;
import com.bumptech.glide.p025r.C1269c;
import com.bumptech.glide.p029t.C1310k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.o.n */
public class C1250n {

    /* renamed from: a */
    private final Set<C1269c> f4154a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<C1269c> f4155b = new ArrayList();

    /* renamed from: c */
    private boolean f4156c;

    /* renamed from: a */
    public void mo5208a() {
        for (C1269c a : C1310k.m6164a((Collection<T>) this.f4154a)) {
            mo5209a(a);
        }
        this.f4155b.clear();
    }

    /* renamed from: a */
    public boolean mo5209a(C1269c cVar) {
        boolean z = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.f4154a.remove(cVar);
        if (!this.f4155b.remove(cVar) && !remove) {
            z = false;
        }
        if (z) {
            cVar.clear();
        }
        return z;
    }

    /* renamed from: b */
    public void mo5210b() {
        this.f4156c = true;
        for (C1269c cVar : C1310k.m6164a((Collection<T>) this.f4154a)) {
            if (cVar.isRunning() || cVar.mo5306f()) {
                cVar.clear();
                this.f4155b.add(cVar);
            }
        }
    }

    /* renamed from: b */
    public void mo5211b(C1269c cVar) {
        this.f4154a.add(cVar);
        if (!this.f4156c) {
            cVar.mo5304e();
            return;
        }
        cVar.clear();
        String str = "RequestTracker";
        if (Log.isLoggable(str, 2)) {
            Log.v(str, "Paused, delaying request");
        }
        this.f4155b.add(cVar);
    }

    /* renamed from: c */
    public void mo5212c() {
        this.f4156c = true;
        for (C1269c cVar : C1310k.m6164a((Collection<T>) this.f4154a)) {
            if (cVar.isRunning()) {
                cVar.mo5302d();
                this.f4155b.add(cVar);
            }
        }
    }

    /* renamed from: d */
    public void mo5213d() {
        for (C1269c cVar : C1310k.m6164a((Collection<T>) this.f4154a)) {
            if (!cVar.mo5306f() && !cVar.mo5299c()) {
                cVar.clear();
                if (!this.f4156c) {
                    cVar.mo5304e();
                } else {
                    this.f4155b.add(cVar);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo5214e() {
        this.f4156c = false;
        for (C1269c cVar : C1310k.m6164a((Collection<T>) this.f4154a)) {
            if (!cVar.mo5306f() && !cVar.isRunning()) {
                cVar.mo5304e();
            }
        }
        this.f4155b.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.f4154a.size());
        sb.append(", isPaused=");
        sb.append(this.f4156c);
        sb.append("}");
        return sb.toString();
    }
}
