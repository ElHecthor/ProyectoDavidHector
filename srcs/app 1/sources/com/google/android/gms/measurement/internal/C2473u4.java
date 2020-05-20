package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.gms.common.p051p.C2174b;
import com.google.android.gms.common.p051p.C2175c;
import com.google.android.gms.common.stats.C2179a;
import java.util.List;
import p147g.p156d.p157a.p167b.p173d.p180g.C4091l2;

/* renamed from: com.google.android.gms.measurement.internal.u4 */
public final class C2473u4 {

    /* renamed from: a */
    final C2263c5 f6983a;

    C2473u4(C2263c5 c5Var) {
        this.f6983a = c5Var;
    }

    /* renamed from: a */
    private final boolean m9978a() {
        boolean z = false;
        try {
            C2174b a = C2175c.m8939a(this.f6983a.mo7096h());
            if (a == null) {
                this.f6983a.mo7098j().mo7810B().mo7088a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if (a.mo6964b("com.android.vending", 128).versionCode >= 80837300) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            this.f6983a.mo7098j().mo7810B().mo7089a("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo7659a(String str, C4091l2 l2Var) {
        this.f6983a.mo7097i().mo7274c();
        if (l2Var == null) {
            this.f6983a.mo7098j().mo7818w().mo7088a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle a = l2Var.mo12594a(bundle);
            if (a != null) {
                return a;
            }
            this.f6983a.mo7098j().mo7815t().mo7088a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f6983a.mo7098j().mo7815t().mo7089a("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7660a(String str) {
        if (str == null || str.isEmpty()) {
            this.f6983a.mo7098j().mo7819x().mo7088a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f6983a.mo7097i().mo7274c();
        if (!m9978a()) {
            this.f6983a.mo7098j().mo7821z().mo7088a("Install Referrer Reporter is not available");
            return;
        }
        C2462t4 t4Var = new C2462t4(this, str);
        this.f6983a.mo7097i().mo7274c();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        String str2 = "com.android.vending";
        intent.setComponent(new ComponentName(str2, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f6983a.mo7096h().getPackageManager();
        if (packageManager == null) {
            this.f6983a.mo7098j().mo7819x().mo7088a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f6983a.mo7098j().mo7821z().mo7088a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = ((ResolveInfo) queryIntentServices.get(0)).serviceInfo;
        if (serviceInfo != null) {
            String str3 = serviceInfo.packageName;
            if (serviceInfo.name == null || !str2.equals(str3) || !m9978a()) {
                this.f6983a.mo7098j().mo7818w().mo7088a("Play Store version 8.3.73 or higher required for Install Referrer");
            } else {
                try {
                    this.f6983a.mo7098j().mo7810B().mo7089a("Install Referrer Service is", C2179a.m8953a().mo6977a(this.f6983a.mo7096h(), new Intent(intent), t4Var, 1) ? "available" : "not available");
                } catch (Exception e) {
                    this.f6983a.mo7098j().mo7815t().mo7089a("Exception occurred while binding to Install Referrer Service", e.getMessage());
                }
            }
        }
    }
}
