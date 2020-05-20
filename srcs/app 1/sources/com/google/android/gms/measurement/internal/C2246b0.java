package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C2148s;
import java.util.Map;
import p071f.p088e.C3162a;

/* renamed from: com.google.android.gms.measurement.internal.b0 */
public final class C2246b0 extends C2298f4 {

    /* renamed from: b */
    private final Map<String, Long> f6267b = new C3162a();

    /* renamed from: c */
    private final Map<String, Integer> f6268c = new C3162a();

    /* renamed from: d */
    private long f6269d;

    public C2246b0(C2263c5 c5Var) {
        super(c5Var);
    }

    /* renamed from: a */
    private final void m9140a(long j, C2410o7 o7Var) {
        if (o7Var == null) {
            mo7098j().mo7810B().mo7088a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            mo7098j().mo7810B().mo7089a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C2397n7.m9636a(o7Var, bundle, true);
            mo7277p().mo7431a("am", "_xa", bundle);
        }
    }

    /* renamed from: a */
    private final void m9143a(String str, long j, C2410o7 o7Var) {
        if (o7Var == null) {
            mo7098j().mo7810B().mo7088a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            mo7098j().mo7810B().mo7089a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C2397n7.m9636a(o7Var, bundle, true);
            mo7277p().mo7431a("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m9144b(long j) {
        for (String put : this.f6267b.keySet()) {
            this.f6267b.put(put, Long.valueOf(j));
        }
        if (!this.f6267b.isEmpty()) {
            this.f6269d = j;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m9146c(String str, long j) {
        mo7273a();
        mo7274c();
        C2148s.m8844b(str);
        if (this.f6268c.isEmpty()) {
            this.f6269d = j;
        }
        Integer num = (Integer) this.f6268c.get(str);
        if (num != null) {
            this.f6268c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f6268c.size() >= 100) {
            mo7098j().mo7818w().mo7088a("Too many ads visible");
        } else {
            this.f6268c.put(str, Integer.valueOf(1));
            this.f6267b.put(str, Long.valueOf(j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m9147d(String str, long j) {
        mo7273a();
        mo7274c();
        C2148s.m8844b(str);
        Integer num = (Integer) this.f6268c.get(str);
        if (num != null) {
            C2410o7 a = mo7280s().mo7521a(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f6268c.remove(str);
                Long l = (Long) this.f6267b.get(str);
                if (l == null) {
                    mo7098j().mo7815t().mo7088a("First ad unit exposure time was never set");
                } else {
                    long longValue = j - l.longValue();
                    this.f6267b.remove(str);
                    m9143a(str, longValue, a);
                }
                if (this.f6268c.isEmpty()) {
                    long j2 = this.f6269d;
                    if (j2 == 0) {
                        mo7098j().mo7815t().mo7088a("First ad exposure time was never set");
                        return;
                    } else {
                        m9140a(j - j2, a);
                        this.f6269d = 0;
                    }
                }
                return;
            }
            this.f6268c.put(str, Integer.valueOf(intValue));
            return;
        }
        mo7098j().mo7815t().mo7089a("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: a */
    public final void mo7130a(long j) {
        C2410o7 a = mo7280s().mo7521a(false);
        for (String str : this.f6267b.keySet()) {
            m9143a(str, j - ((Long) this.f6267b.get(str)).longValue(), a);
        }
        if (!this.f6267b.isEmpty()) {
            m9140a(j - this.f6269d, a);
        }
        m9144b(j);
    }

    /* renamed from: a */
    public final void mo7131a(String str, long j) {
        if (str == null || str.length() == 0) {
            mo7098j().mo7815t().mo7088a("Ad unit id must be a non-empty string");
        } else {
            mo7097i().mo7841a((Runnable) new C2233a(this, str, j));
        }
    }

    /* renamed from: b */
    public final void mo7132b(String str, long j) {
        if (str == null || str.length() == 0) {
            mo7098j().mo7815t().mo7088a("Ad unit id must be a non-empty string");
        } else {
            mo7097i().mo7841a((Runnable) new C2272d2(this, str, j));
        }
    }
}
