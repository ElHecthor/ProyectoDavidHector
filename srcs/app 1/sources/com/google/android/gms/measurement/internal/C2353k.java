package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2148s;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.k */
public final class C2353k {

    /* renamed from: a */
    final String f6572a;

    /* renamed from: b */
    final String f6573b;

    /* renamed from: c */
    private final String f6574c;

    /* renamed from: d */
    final long f6575d;

    /* renamed from: e */
    final long f6576e;

    /* renamed from: f */
    final C2377m f6577f;

    C2353k(C2263c5 c5Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C2377m mVar;
        C2148s.m8844b(str2);
        C2148s.m8844b(str3);
        this.f6572a = str2;
        this.f6573b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f6574c = str;
        this.f6575d = j;
        this.f6576e = j2;
        if (j2 != 0 && j2 > j) {
            c5Var.mo7098j().mo7818w().mo7089a("Event created with reverse previous/current timestamps. appId", C2516y3.m10125a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            mVar = new C2377m(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    c5Var.mo7098j().mo7815t().mo7088a("Param name can't be null");
                } else {
                    Object a = c5Var.mo7218v().mo7686a(str4, bundle2.get(str4));
                    if (a == null) {
                        c5Var.mo7098j().mo7818w().mo7089a("Param value can't be null", c5Var.mo7219w().mo7719b(str4));
                    } else {
                        c5Var.mo7218v().mo7690a(bundle2, str4, a);
                    }
                }
                it.remove();
            }
            mVar = new C2377m(bundle2);
        }
        this.f6577f = mVar;
    }

    private C2353k(C2263c5 c5Var, String str, String str2, String str3, long j, long j2, C2377m mVar) {
        C2148s.m8844b(str2);
        C2148s.m8844b(str3);
        C2148s.m8834a(mVar);
        this.f6572a = str2;
        this.f6573b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f6574c = str;
        this.f6575d = j;
        this.f6576e = j2;
        if (j2 != 0 && j2 > j) {
            c5Var.mo7098j().mo7818w().mo7090a("Event created with reverse previous/current timestamps. appId, name", C2516y3.m10125a(str2), C2516y3.m10125a(str3));
        }
        this.f6577f = mVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C2353k mo7450a(C2263c5 c5Var, long j) {
        C2353k kVar = new C2353k(c5Var, this.f6574c, this.f6572a, this.f6573b, this.f6575d, j, this.f6577f);
        return kVar;
    }

    public final String toString() {
        String str = this.f6572a;
        String str2 = this.f6573b;
        String valueOf = String.valueOf(this.f6577f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
