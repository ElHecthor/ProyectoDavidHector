package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.C2187b;
import com.google.android.gms.measurement.internal.C2288e6;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.firebase.analytics.connector.internal.b */
public final class C2867b {

    /* renamed from: a */
    private static final List<String> f8329a = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});

    /* renamed from: b */
    private static final List<String> f8330b = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: c */
    private static final List<String> f8331c = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: d */
    private static final List<String> f8332d = Arrays.asList((String[]) C2187b.m8972a(C2288e6.f6377a, C2288e6.f6378b));

    /* renamed from: e */
    private static final List<String> f8333e = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    static {
        new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));
    }

    /* renamed from: a */
    public static boolean m11903a(String str) {
        return !f8330b.contains(str);
    }

    /* renamed from: a */
    public static boolean m11904a(String str, Bundle bundle) {
        if (f8329a.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String containsKey : f8331c) {
                if (bundle.containsKey(containsKey)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m11905a(String str, String str2) {
        String str3 = "fcm";
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(str3) || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals(str3) || str.equals("fiam");
        }
        if (f8332d.contains(str2)) {
            return false;
        }
        for (String matches : f8333e) {
            if (str2.matches(matches)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m11906a(String str, String str2, Bundle bundle) {
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m11903a(str) || bundle == null) {
            return false;
        }
        for (String containsKey : f8331c) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c = 2;
                }
            } else if (str.equals("fdl")) {
                c = 1;
            }
        } else if (str.equals("fcm")) {
            c = 0;
        }
        String str4 = "_cis";
        if (c == 0) {
            str3 = "fcm_integration";
        } else if (c == 1) {
            str3 = "fdl_integration";
        } else if (c != 2) {
            return false;
        } else {
            str3 = "fiam_integration";
        }
        bundle.putString(str4, str3);
        return true;
    }

    /* renamed from: b */
    public static void m11907b(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }
}
