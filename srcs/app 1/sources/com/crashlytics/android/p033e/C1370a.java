package com.crashlytics.android.p033e;

import android.content.Context;
import android.content.pm.PackageInfo;
import p242i.p243a.p244a.p245a.p246n.p248b.C4830s;

/* renamed from: com.crashlytics.android.e.a */
class C1370a {

    /* renamed from: a */
    public final String f4431a;

    /* renamed from: b */
    public final String f4432b;

    /* renamed from: c */
    public final String f4433c;

    /* renamed from: d */
    public final String f4434d;

    /* renamed from: e */
    public final String f4435e;

    /* renamed from: f */
    public final String f4436f;

    C1370a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f4431a = str;
        this.f4432b = str2;
        this.f4433c = str3;
        this.f4434d = str4;
        this.f4435e = str5;
        this.f4436f = str6;
    }

    /* renamed from: a */
    public static C1370a m6340a(Context context, C4830s sVar, String str, String str2) {
        String packageName = context.getPackageName();
        String f = sVar.mo13895f();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        C1370a aVar = new C1370a(str, str2, f, packageName, num, str3);
        return aVar;
    }
}
