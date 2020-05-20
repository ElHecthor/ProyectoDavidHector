package com.facebook.p034f0.p038s;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.C1787m;

/* renamed from: com.facebook.f0.s.j */
class C1624j {

    /* renamed from: a */
    private String f5010a;

    /* renamed from: b */
    private boolean f5011b;

    private C1624j(String str, boolean z) {
        this.f5010a = str;
        this.f5011b = z;
    }

    /* renamed from: b */
    public static void m7144b() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C1787m.m7744e()).edit();
        edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
        edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
        edit.apply();
    }

    /* renamed from: c */
    public static C1624j m7145c() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C1787m.m7744e());
        String str = "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage";
        if (!defaultSharedPreferences.contains(str)) {
            return null;
        }
        return new C1624j(defaultSharedPreferences.getString(str, null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
    }

    /* renamed from: a */
    public void mo5858a() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C1787m.m7744e()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f5010a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f5011b);
        edit.apply();
    }

    public String toString() {
        String str = this.f5011b ? "Applink" : "Unclassified";
        if (this.f5010a == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("(");
        sb.append(this.f5010a);
        sb.append(")");
        return sb.toString();
    }
}
