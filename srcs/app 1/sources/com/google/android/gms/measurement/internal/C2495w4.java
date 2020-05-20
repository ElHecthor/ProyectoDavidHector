package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.C2179a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4091l2;
import p147g.p156d.p157a.p167b.p173d.p180g.C4268w9;

/* renamed from: com.google.android.gms.measurement.internal.w4 */
final class C2495w4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4091l2 f7045f;

    /* renamed from: g */
    private final /* synthetic */ ServiceConnection f7046g;

    /* renamed from: h */
    private final /* synthetic */ C2462t4 f7047h;

    C2495w4(C2462t4 t4Var, C4091l2 l2Var, ServiceConnection serviceConnection) {
        this.f7047h = t4Var;
        this.f7045f = l2Var;
        this.f7046g = serviceConnection;
    }

    public final void run() {
        C2238a4 t;
        String str;
        C2462t4 t4Var = this.f7047h;
        C2473u4 u4Var = t4Var.f6962b;
        String a = t4Var.f6961a;
        C4091l2 l2Var = this.f7045f;
        ServiceConnection serviceConnection = this.f7046g;
        Bundle a2 = u4Var.mo7659a(a, l2Var);
        u4Var.f6983a.mo7097i().mo7274c();
        if (a2 != null) {
            long j = a2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                t = u4Var.f6983a.mo7098j().mo7815t();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = a2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    t = u4Var.f6983a.mo7098j().mo7815t();
                    str = "No referrer defined in Install Referrer response";
                } else {
                    u4Var.f6983a.mo7098j().mo7810B().mo7089a("InstallReferrer API result", string);
                    C2489v9 v = u4Var.f6983a.mo7218v();
                    String str2 = "?";
                    String valueOf = String.valueOf(string);
                    Bundle a3 = v.mo7682a(Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)));
                    if (a3 == null) {
                        t = u4Var.f6983a.mo7098j().mo7815t();
                        str = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = a3.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                t = u4Var.f6983a.mo7098j().mo7815t();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                a3.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == u4Var.f6983a.mo7212p().f6628k.mo7570a()) {
                            u4Var.f6983a.mo7094f();
                            t = u4Var.f6983a.mo7098j().mo7810B();
                            str = "Install Referrer campaign has already been logged";
                        } else if (!C4268w9.m17501b() || !u4Var.f6983a.mo7211o().mo7108a(C2457t.f6867C0) || u4Var.f6983a.mo7204c()) {
                            u4Var.f6983a.mo7212p().f6628k.mo7571a(j);
                            u4Var.f6983a.mo7094f();
                            String str3 = "referrer API";
                            u4Var.f6983a.mo7098j().mo7810B().mo7089a("Logging Install Referrer campaign from sdk with ", str3);
                            a3.putString("_cis", str3);
                            u4Var.f6983a.mo7217u().mo7431a("auto", "_cmp", a3);
                        }
                    }
                }
            }
            t.mo7088a(str);
        }
        if (serviceConnection != null) {
            C2179a.m8953a().mo6976a(u4Var.f6983a.mo7096h(), serviceConnection);
        }
    }
}
