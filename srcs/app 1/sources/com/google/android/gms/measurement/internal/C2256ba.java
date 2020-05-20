package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: com.google.android.gms.measurement.internal.ba */
public final class C2256ba {

    /* renamed from: a */
    private final C2263c5 f6290a;

    public C2256ba(C2263c5 c5Var) {
        this.f6290a = c5Var;
    }

    /* renamed from: c */
    private final boolean m9155c() {
        return m9156d() && this.f6290a.mo7095g().mo6988b() - this.f6290a.mo7212p().f6618C.mo7570a() > this.f6290a.mo7211o().mo7105a((String) null, C2457t.f6897R0);
    }

    /* renamed from: d */
    private final boolean m9156d() {
        return this.f6290a.mo7212p().f6618C.mo7570a() > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7138a() {
        this.f6290a.mo7097i().mo7274c();
        if (m9156d()) {
            String str = "_cc";
            if (m9155c()) {
                this.f6290a.mo7212p().f6617B.mo7590a(null);
                Bundle bundle = new Bundle();
                String str2 = "(not set)";
                bundle.putString("source", str2);
                bundle.putString("medium", str2);
                bundle.putString("_cis", "intent");
                bundle.putLong(str, 1);
                this.f6290a.mo7217u().mo7431a("auto", "_cmpx", bundle);
            } else {
                String a = this.f6290a.mo7212p().f6617B.mo7589a();
                if (TextUtils.isEmpty(a)) {
                    this.f6290a.mo7098j().mo7816u().mo7088a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((this.f6290a.mo7212p().f6618C.mo7570a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str3 : parse.getQueryParameterNames()) {
                        bundle2.putString(str3, parse.getQueryParameter(str3));
                    }
                    ((Bundle) pair.second).putLong(str, a2);
                    this.f6290a.mo7217u().mo7431a((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                this.f6290a.mo7212p().f6617B.mo7590a(null);
            }
            this.f6290a.mo7212p().f6618C.mo7571a(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7139a(String str, Bundle bundle) {
        String str2;
        this.f6290a.mo7097i().mo7274c();
        if (!this.f6290a.mo7204c()) {
            if (bundle == null || bundle.isEmpty()) {
                str2 = null;
            } else {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Builder builder = new Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f6290a.mo7212p().f6617B.mo7590a(str2);
                this.f6290a.mo7212p().f6618C.mo7571a(this.f6290a.mo7095g().mo6988b());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo7140b() {
        if (m9156d() && m9155c()) {
            this.f6290a.mo7212p().f6617B.mo7590a(null);
        }
    }
}
