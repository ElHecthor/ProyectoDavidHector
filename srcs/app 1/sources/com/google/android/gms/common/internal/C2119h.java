package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C2084e;
import com.google.android.gms.common.api.C1981a.C1992f;
import com.google.android.gms.common.api.C2001f.C2002a;
import com.google.android.gms.common.api.C2001f.C2003b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.C2023e;
import com.google.android.gms.common.api.internal.C2038k;
import com.google.android.gms.common.internal.C2095c.C2096a;
import com.google.android.gms.common.internal.C2095c.C2097b;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.h */
public abstract class C2119h<T extends IInterface> extends C2095c<T> implements C1992f {

    /* renamed from: w */
    private final C2109d f6061w;

    /* renamed from: x */
    private final Set<Scope> f6062x;

    /* renamed from: y */
    private final Account f6063y;

    @Deprecated
    protected C2119h(Context context, Looper looper, int i, C2109d dVar, C2002a aVar, C2003b bVar) {
        this(context, looper, i, dVar, (C2023e) aVar, (C2038k) bVar);
    }

    protected C2119h(Context context, Looper looper, int i, C2109d dVar, C2023e eVar, C2038k kVar) {
        C2121i a = C2121i.m8768a(context);
        C2084e a2 = C2084e.m8612a();
        C2148s.m8834a(eVar);
        C2023e eVar2 = eVar;
        C2148s.m8834a(kVar);
        this(context, looper, a, a2, i, dVar, eVar2, kVar);
    }

    protected C2119h(Context context, Looper looper, C2121i iVar, C2084e eVar, int i, C2109d dVar, C2023e eVar2, C2038k kVar) {
        super(context, looper, iVar, eVar, i, m8759a(eVar2), m8760a(kVar), dVar.mo6871f());
        this.f6061w = dVar;
        this.f6063y = dVar.mo6864a();
        Set<Scope> d = dVar.mo6869d();
        m8761b(d);
        this.f6062x = d;
    }

    /* renamed from: a */
    private static C2096a m8759a(C2023e eVar) {
        if (eVar == null) {
            return null;
        }
        return new C2094b0(eVar);
    }

    /* renamed from: a */
    private static C2097b m8760a(C2038k kVar) {
        if (kVar == null) {
            return null;
        }
        return new C2108c0(kVar);
    }

    /* renamed from: b */
    private final Set<Scope> m8761b(Set<Scope> set) {
        mo6886a(set);
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final C2109d mo6885A() {
        return this.f6061w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Set<Scope> mo6886a(Set<Scope> set) {
        return set;
    }

    /* renamed from: b */
    public Set<Scope> mo6601b() {
        return mo6835k() ? this.f6062x : Collections.emptySet();
    }

    /* renamed from: e */
    public int mo6556e() {
        return super.mo6556e();
    }

    /* renamed from: p */
    public final Account mo6839p() {
        return this.f6063y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Set<Scope> mo6845v() {
        return this.f6062x;
    }
}
