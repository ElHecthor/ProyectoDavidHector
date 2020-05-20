package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.C2090i;
import com.google.android.gms.common.C2165j;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.util.C2200o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.measurement.internal.i5 */
public final class C2335i5 extends C2461t3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2399n9 f6519a;

    /* renamed from: b */
    private Boolean f6520b;

    /* renamed from: c */
    private String f6521c;

    public C2335i5(C2399n9 n9Var) {
        this(n9Var, null);
    }

    private C2335i5(C2399n9 n9Var, String str) {
        C2148s.m8834a(n9Var);
        this.f6519a = n9Var;
        this.f6521c = null;
    }

    /* renamed from: a */
    private final void m9451a(Runnable runnable) {
        C2148s.m8834a(runnable);
        if (this.f6519a.mo7097i().mo7844t()) {
            runnable.run();
        } else {
            this.f6519a.mo7097i().mo7841a(runnable);
        }
    }

    /* renamed from: a */
    private final void m9452a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f6520b == null) {
                        if (!"com.google.android.gms".equals(this.f6521c) && !C2200o.m9013a(this.f6519a.mo7096h(), Binder.getCallingUid())) {
                            if (!C2165j.m8914a(this.f6519a.mo7096h()).mo6950a(Binder.getCallingUid())) {
                                z2 = false;
                                this.f6520b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f6520b = Boolean.valueOf(z2);
                    }
                    if (this.f6520b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f6519a.mo7098j().mo7815t().mo7089a("Measurement Service called with invalid calling package. appId", C2516y3.m10125a(str));
                    throw e;
                }
            }
            if (this.f6521c == null && C2090i.uidHasPackageName(this.f6519a.mo7096h(), Binder.getCallingUid(), str)) {
                this.f6521c = str;
            }
            if (!str.equals(this.f6521c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        String str2 = "Measurement Service called without app package";
        this.f6519a.mo7098j().mo7815t().mo7088a(str2);
        throw new SecurityException(str2);
    }

    /* renamed from: b */
    private final void m9453b(C2244aa aaVar, boolean z) {
        C2148s.m8834a(aaVar);
        m9452a(aaVar.f6243f, false);
        this.f6519a.mo7556o().mo7703a(aaVar.f6244g, aaVar.f6260w, aaVar.f6242A);
    }

    /* renamed from: a */
    public final List<C2478u9> mo7378a(C2244aa aaVar, boolean z) {
        m9453b(aaVar, false);
        try {
            List<C2500w9> list = (List) this.f6519a.mo7097i().mo7840a((Callable<V>) new C2474u5<V>(this, aaVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2500w9 w9Var : list) {
                if (z || !C2489v9.m10029f(w9Var.f7060c)) {
                    arrayList.add(new C2478u9(w9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f6519a.mo7098j().mo7815t().mo7090a("Failed to get user properties. appId", C2516y3.m10125a(aaVar.f6243f), e);
            return null;
        }
    }

    /* renamed from: a */
    public final List<C2388ma> mo7379a(String str, String str2, C2244aa aaVar) {
        m9453b(aaVar, false);
        try {
            return (List) this.f6519a.mo7097i().mo7840a((Callable<V>) new C2371l5<V>(this, aaVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f6519a.mo7098j().mo7815t().mo7089a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<C2388ma> mo7380a(String str, String str2, String str3) {
        m9452a(str, true);
        try {
            return (List) this.f6519a.mo7097i().mo7840a((Callable<V>) new C2408o5<V>(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f6519a.mo7098j().mo7815t().mo7089a("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<C2478u9> mo7381a(String str, String str2, String str3, boolean z) {
        m9452a(str, true);
        try {
            List<C2500w9> list = (List) this.f6519a.mo7097i().mo7840a((Callable<V>) new C2383m5<V>(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2500w9 w9Var : list) {
                if (z || !C2489v9.m10029f(w9Var.f7060c)) {
                    arrayList.add(new C2478u9(w9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f6519a.mo7098j().mo7815t().mo7090a("Failed to get user properties as. appId", C2516y3.m10125a(str), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<C2478u9> mo7382a(String str, String str2, boolean z, C2244aa aaVar) {
        m9453b(aaVar, false);
        try {
            List<C2500w9> list = (List) this.f6519a.mo7097i().mo7840a((Callable<V>) new C2347j5<V>(this, aaVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2500w9 w9Var : list) {
                if (z || !C2489v9.m10029f(w9Var.f7060c)) {
                    arrayList.add(new C2478u9(w9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f6519a.mo7098j().mo7815t().mo7090a("Failed to query user properties. appId", C2516y3.m10125a(aaVar.f6243f), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final void mo7383a(long j, String str, String str2, String str3) {
        C2496w5 w5Var = new C2496w5(this, str2, str3, str, j);
        m9451a((Runnable) w5Var);
    }

    /* renamed from: a */
    public final void mo7384a(C2244aa aaVar) {
        m9453b(aaVar, false);
        m9451a((Runnable) new C2323h5(this, aaVar));
    }

    /* renamed from: a */
    public final void mo7385a(C2388ma maVar) {
        C2148s.m8834a(maVar);
        C2148s.m8834a(maVar.f6682h);
        m9452a(maVar.f6680f, true);
        m9451a((Runnable) new C2359k5(this, new C2388ma(maVar)));
    }

    /* renamed from: a */
    public final void mo7386a(C2388ma maVar, C2244aa aaVar) {
        C2148s.m8834a(maVar);
        C2148s.m8834a(maVar.f6682h);
        m9453b(aaVar, false);
        C2388ma maVar2 = new C2388ma(maVar);
        maVar2.f6680f = aaVar.f6243f;
        m9451a((Runnable) new C2485v5(this, maVar2, aaVar));
    }

    /* renamed from: a */
    public final void mo7387a(C2435r rVar, C2244aa aaVar) {
        C2148s.m8834a(rVar);
        m9453b(aaVar, false);
        m9451a((Runnable) new C2430q5(this, rVar, aaVar));
    }

    /* renamed from: a */
    public final void mo7388a(C2435r rVar, String str, String str2) {
        C2148s.m8834a(rVar);
        C2148s.m8844b(str);
        m9452a(str, true);
        m9451a((Runnable) new C2419p5(this, rVar, str));
    }

    /* renamed from: a */
    public final void mo7389a(C2478u9 u9Var, C2244aa aaVar) {
        C2148s.m8834a(u9Var);
        m9453b(aaVar, false);
        m9451a((Runnable) new C2441r5(this, u9Var, aaVar));
    }

    /* renamed from: a */
    public final byte[] mo7390a(C2435r rVar, String str) {
        C2148s.m8844b(str);
        C2148s.m8834a(rVar);
        m9452a(str, true);
        this.f6519a.mo7098j().mo7809A().mo7089a("Log and bundle. event", this.f6519a.mo7555n().mo7718a(rVar.f6817f));
        long a = this.f6519a.mo7095g().mo6987a() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f6519a.mo7097i().mo7842b((Callable<V>) new C2452s5<V>(this, rVar, str)).get();
            if (bArr == null) {
                this.f6519a.mo7098j().mo7815t().mo7089a("Log and bundle returned null. appId", C2516y3.m10125a(str));
                bArr = new byte[0];
            }
            this.f6519a.mo7098j().mo7809A().mo7091a("Log and bundle processed. event, size, time_ms", this.f6519a.mo7555n().mo7718a(rVar.f6817f), Integer.valueOf(bArr.length), Long.valueOf((this.f6519a.mo7095g().mo6987a() / 1000000) - a));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f6519a.mo7098j().mo7815t().mo7091a("Failed to log and bundle. appId, event, error", C2516y3.m10125a(str), this.f6519a.mo7555n().mo7718a(rVar.f6817f), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C2435r mo7391b(C2435r rVar, C2244aa aaVar) {
        boolean z = false;
        if ("_cmp".equals(rVar.f6817f)) {
            C2377m mVar = rVar.f6818g;
            if (!(mVar == null || mVar.mo7497a() == 0)) {
                String d = rVar.f6818g.mo7502d("_cis");
                if (!TextUtils.isEmpty(d) && (("referrer broadcast".equals(d) || "referrer API".equals(d)) && this.f6519a.mo7542b().mo7116e(aaVar.f6243f, C2457t.f6898S))) {
                    z = true;
                }
            }
        }
        if (!z) {
            return rVar;
        }
        this.f6519a.mo7098j().mo7821z().mo7089a("Event has been filtered ", rVar.toString());
        C2435r rVar2 = new C2435r("_cmpx", rVar.f6818g, rVar.f6819h, rVar.f6820i);
        return rVar2;
    }

    /* renamed from: b */
    public final String mo7392b(C2244aa aaVar) {
        m9453b(aaVar, false);
        return this.f6519a.mo7550d(aaVar);
    }

    /* renamed from: c */
    public final void mo7393c(C2244aa aaVar) {
        m9452a(aaVar.f6243f, false);
        m9451a((Runnable) new C2395n5(this, aaVar));
    }

    /* renamed from: d */
    public final void mo7394d(C2244aa aaVar) {
        m9453b(aaVar, false);
        m9451a((Runnable) new C2463t5(this, aaVar));
    }
}
