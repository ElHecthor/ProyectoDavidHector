package com.crashlytics.android.p031c;

/* renamed from: com.crashlytics.android.c.b0 */
final class C1333b0 {

    /* renamed from: a */
    public final String f4347a;

    /* renamed from: b */
    public final String f4348b;

    /* renamed from: c */
    public final String f4349c;

    /* renamed from: d */
    public final Boolean f4350d;

    /* renamed from: e */
    public final String f4351e;

    /* renamed from: f */
    public final String f4352f;

    /* renamed from: g */
    public final String f4353g;

    /* renamed from: h */
    public final String f4354h;

    /* renamed from: i */
    public final String f4355i;

    /* renamed from: j */
    public final String f4356j;

    /* renamed from: k */
    private String f4357k;

    public C1333b0(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f4347a = str;
        this.f4348b = str2;
        this.f4349c = str3;
        this.f4350d = bool;
        this.f4351e = str4;
        this.f4352f = str5;
        this.f4353g = str6;
        this.f4354h = str7;
        this.f4355i = str8;
        this.f4356j = str9;
    }

    public String toString() {
        if (this.f4357k == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("appBundleId=");
            sb.append(this.f4347a);
            sb.append(", executionId=");
            sb.append(this.f4348b);
            sb.append(", installationId=");
            sb.append(this.f4349c);
            sb.append(", limitAdTrackingEnabled=");
            sb.append(this.f4350d);
            sb.append(", betaDeviceToken=");
            sb.append(this.f4351e);
            sb.append(", buildId=");
            sb.append(this.f4352f);
            sb.append(", osVersion=");
            sb.append(this.f4353g);
            sb.append(", deviceModel=");
            sb.append(this.f4354h);
            sb.append(", appVersionCode=");
            sb.append(this.f4355i);
            sb.append(", appVersionName=");
            sb.append(this.f4356j);
            this.f4357k = sb.toString();
        }
        return this.f4357k;
    }
}
