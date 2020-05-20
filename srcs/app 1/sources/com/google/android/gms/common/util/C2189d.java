package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.common.p051p.C2175c;

/* renamed from: com.google.android.gms.common.util.d */
public class C2189d {
    /* renamed from: a */
    public static int m8974a(Context context, String str) {
        PackageInfo b = m8975b(context, str);
        if (b != null) {
            ApplicationInfo applicationInfo = b.applicationInfo;
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null) {
                    return -1;
                }
                return bundle.getInt("com.google.android.gms.version", -1);
            }
        }
        return -1;
    }

    /* renamed from: b */
    private static PackageInfo m8975b(Context context, String str) {
        try {
            return C2175c.m8939a(context).mo6964b(str, 128);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m8976c(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            if ((C2175c.m8939a(context).mo6959a(str, 0).flags & 2097152) != 0) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }
}
