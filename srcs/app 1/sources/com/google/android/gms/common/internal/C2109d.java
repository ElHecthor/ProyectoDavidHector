package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C1981a;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import p071f.p088e.C3164b;
import p147g.p156d.p157a.p167b.p181e.C4318a;

/* renamed from: com.google.android.gms.common.internal.d */
public final class C2109d {

    /* renamed from: a */
    private final Account f6026a;

    /* renamed from: b */
    private final Set<Scope> f6027b;

    /* renamed from: c */
    private final Set<Scope> f6028c;

    /* renamed from: d */
    private final Map<C1981a<?>, C2111b> f6029d;

    /* renamed from: e */
    private final String f6030e;

    /* renamed from: f */
    private final String f6031f;

    /* renamed from: g */
    private final C4318a f6032g;

    /* renamed from: h */
    private Integer f6033h;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public static final class C2110a {

        /* renamed from: a */
        private Account f6034a;

        /* renamed from: b */
        private C3164b<Scope> f6035b;

        /* renamed from: c */
        private Map<C1981a<?>, C2111b> f6036c;

        /* renamed from: d */
        private int f6037d = 0;

        /* renamed from: e */
        private View f6038e;

        /* renamed from: f */
        private String f6039f;

        /* renamed from: g */
        private String f6040g;

        /* renamed from: h */
        private C4318a f6041h = C4318a.f11473o;

        /* renamed from: i */
        private boolean f6042i;

        /* renamed from: a */
        public final C2110a mo6875a(Account account) {
            this.f6034a = account;
            return this;
        }

        /* renamed from: a */
        public final C2110a mo6876a(String str) {
            this.f6040g = str;
            return this;
        }

        /* renamed from: a */
        public final C2110a mo6877a(Collection<Scope> collection) {
            if (this.f6035b == null) {
                this.f6035b = new C3164b<>();
            }
            this.f6035b.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public final C2109d mo6878a() {
            C2109d dVar = new C2109d(this.f6034a, this.f6035b, this.f6036c, this.f6037d, this.f6038e, this.f6039f, this.f6040g, this.f6041h, this.f6042i);
            return dVar;
        }

        /* renamed from: b */
        public final C2110a mo6879b(String str) {
            this.f6039f = str;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$b */
    public static final class C2111b {

        /* renamed from: a */
        public final Set<Scope> f6043a;
    }

    public C2109d(Account account, Set<Scope> set, Map<C1981a<?>, C2111b> map, int i, View view, String str, String str2, C4318a aVar, boolean z) {
        this.f6026a = account;
        this.f6027b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        if (map == null) {
            map = Collections.emptyMap();
        }
        this.f6029d = map;
        this.f6030e = str;
        this.f6031f = str2;
        this.f6032g = aVar;
        HashSet hashSet = new HashSet(this.f6027b);
        for (C2111b bVar : this.f6029d.values()) {
            hashSet.addAll(bVar.f6043a);
        }
        this.f6028c = Collections.unmodifiableSet(hashSet);
    }

    @Nullable
    /* renamed from: a */
    public final Account mo6864a() {
        return this.f6026a;
    }

    /* renamed from: a */
    public final Set<Scope> mo6865a(C1981a<?> aVar) {
        C2111b bVar = (C2111b) this.f6029d.get(aVar);
        if (bVar == null || bVar.f6043a.isEmpty()) {
            return this.f6027b;
        }
        HashSet hashSet = new HashSet(this.f6027b);
        hashSet.addAll(bVar.f6043a);
        return hashSet;
    }

    /* renamed from: a */
    public final void mo6866a(Integer num) {
        this.f6033h = num;
    }

    @Deprecated
    @Nullable
    /* renamed from: b */
    public final String mo6867b() {
        Account account = this.f6026a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: c */
    public final Account mo6868c() {
        Account account = this.f6026a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    /* renamed from: d */
    public final Set<Scope> mo6869d() {
        return this.f6028c;
    }

    @Nullable
    /* renamed from: e */
    public final Integer mo6870e() {
        return this.f6033h;
    }

    @Nullable
    /* renamed from: f */
    public final String mo6871f() {
        return this.f6031f;
    }

    @Nullable
    /* renamed from: g */
    public final String mo6872g() {
        return this.f6030e;
    }

    /* renamed from: h */
    public final Set<Scope> mo6873h() {
        return this.f6027b;
    }

    @Nullable
    /* renamed from: i */
    public final C4318a mo6874i() {
        return this.f6032g;
    }
}
