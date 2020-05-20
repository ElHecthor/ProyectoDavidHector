package com.google.android.gms.common.p051p;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.C2197l;

/* renamed from: com.google.android.gms.common.p.b */
public class C2174b {

    /* renamed from: a */
    private final Context f6135a;

    public C2174b(Context context) {
        this.f6135a = context;
    }

    /* renamed from: a */
    public int mo6957a(String str) {
        return this.f6135a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: a */
    public int mo6958a(String str, String str2) {
        return this.f6135a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: a */
    public ApplicationInfo mo6959a(String str, int i) {
        return this.f6135a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: a */
    public final PackageInfo mo6960a(String str, int i, int i2) {
        return this.f6135a.getPackageManager().getPackageInfo(str, 64);
    }

    /* renamed from: a */
    public boolean mo6961a() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return C2173a.m8929a(this.f6135a);
        }
        if (C2197l.m9007j()) {
            String nameForUid = this.f6135a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return this.f6135a.getPackageManager().isInstantApp(nameForUid);
            }
        }
        return false;
    }

    @TargetApi(19)
    /* renamed from: a */
    public final boolean mo6962a(int i, String str) {
        if (C2197l.m9003f()) {
            try {
                ((AppOpsManager) this.f6135a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f6135a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public final String[] mo6963a(int i) {
        return this.f6135a.getPackageManager().getPackagesForUid(i);
    }

    /* renamed from: b */
    public PackageInfo mo6964b(String str, int i) {
        return this.f6135a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: b */
    public CharSequence mo6965b(String str) {
        return this.f6135a.getPackageManager().getApplicationLabel(this.f6135a.getPackageManager().getApplicationInfo(str, 0));
    }
}
