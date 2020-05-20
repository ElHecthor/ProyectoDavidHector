package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.C1981a.C1983b;
import com.google.android.gms.common.api.internal.C2021d;
import com.google.android.gms.common.api.internal.C2023e;
import com.google.android.gms.common.api.internal.C2038k;
import com.google.android.gms.common.api.internal.C2042m;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
/* renamed from: com.google.android.gms.common.api.f */
public abstract class C2001f {
    @GuardedBy("sAllClients")

    /* renamed from: a */
    private static final Set<C2001f> f5821a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.f$a */
    public interface C2002a extends C2023e {
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.f$b */
    public interface C2003b extends C2038k {
    }

    /* renamed from: c */
    public static Set<C2001f> m8358c() {
        Set<C2001f> set;
        synchronized (f5821a) {
            set = f5821a;
        }
        return set;
    }

    /* renamed from: a */
    public Looper mo6626a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public <A extends C1983b, T extends C2021d<? extends C2071k, A>> T mo6627a(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public boolean mo6628a(C2042m mVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo6629b() {
        throw new UnsupportedOperationException();
    }
}
