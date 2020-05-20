package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import p071f.p088e.C3162a;
import p071f.p097h.p098e.C3236a;

/* renamed from: com.google.firebase.iid.c0 */
final class C2935c0 {

    /* renamed from: a */
    private final SharedPreferences f8457a;

    /* renamed from: b */
    private final Context f8458b;

    /* renamed from: c */
    private final Map<String, Long> f8459c = new C3162a();

    public C2935c0(Context context) {
        String str = "FirebaseInstanceId";
        this.f8458b = context;
        this.f8457a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(C3236a.m13270b(this.f8458b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m12112b()) {
                    Log.i(str, "App restored, clearing state");
                    mo9637a();
                    FirebaseInstanceId.m12068k().mo9621f();
                }
            } catch (IOException e) {
                if (Log.isLoggable(str, 3)) {
                    String str2 = "Error creating file in no backup dir: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
    }

    /* renamed from: a */
    private static String m12110a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    private static String m12111b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: b */
    private final synchronized boolean m12112b() {
        return this.f8457a.getAll().isEmpty();
    }

    /* renamed from: c */
    private final long m12113c(String str) {
        String string = this.f8457a.getString(m12110a(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final synchronized long mo9635a(String str) {
        long currentTimeMillis;
        currentTimeMillis = System.currentTimeMillis();
        if (!this.f8457a.contains(m12110a(str, "cre"))) {
            Editor edit = this.f8457a.edit();
            edit.putString(m12110a(str, "cre"), String.valueOf(currentTimeMillis));
            edit.commit();
        } else {
            currentTimeMillis = m12113c(str);
        }
        this.f8459c.put(str, Long.valueOf(currentTimeMillis));
        return currentTimeMillis;
    }

    /* renamed from: a */
    public final synchronized C2932b0 mo9636a(String str, String str2, String str3) {
        return C2932b0.m12100b(this.f8457a.getString(m12111b(str, str2, str3), null));
    }

    /* renamed from: a */
    public final synchronized void mo9637a() {
        this.f8459c.clear();
        this.f8457a.edit().clear().commit();
    }

    /* renamed from: a */
    public final synchronized void mo9638a(String str, String str2, String str3, String str4, String str5) {
        String a = C2932b0.m12099a(str4, str5, System.currentTimeMillis());
        if (a != null) {
            Editor edit = this.f8457a.edit();
            edit.putString(m12111b(str, str2, str3), a);
            edit.commit();
        }
    }

    /* renamed from: b */
    public final synchronized void mo9639b(String str) {
        String concat = String.valueOf(str).concat("|T|");
        Editor edit = this.f8457a.edit();
        for (String str2 : this.f8457a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }
}
