package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C2148s;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* renamed from: com.google.android.gms.auth.api.signin.internal.c */
public class C1956c {

    /* renamed from: c */
    private static final Lock f5775c = new ReentrantLock();
    @GuardedBy("sLk")

    /* renamed from: d */
    private static C1956c f5776d;

    /* renamed from: a */
    private final Lock f5777a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b */
    private final SharedPreferences f5778b;

    private C1956c(Context context) {
        this.f5778b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @Nullable
    /* renamed from: a */
    private final GoogleSignInAccount m8256a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String c = m8261c(m8260b("googleSignInAccount", str));
        if (c != null) {
            try {
                return GoogleSignInAccount.m8187a(c);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C1956c m8257a(Context context) {
        C2148s.m8834a(context);
        f5775c.lock();
        try {
            if (f5776d == null) {
                f5776d = new C1956c(context.getApplicationContext());
            }
            return f5776d;
        } finally {
            f5775c.unlock();
        }
    }

    /* renamed from: a */
    private final void m8258a(String str, String str2) {
        this.f5777a.lock();
        try {
            this.f5778b.edit().putString(str, str2).apply();
        } finally {
            this.f5777a.unlock();
        }
    }

    @Nullable
    /* renamed from: b */
    private final GoogleSignInOptions m8259b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String c = m8261c(m8260b("googleSignInOptions", str));
        if (c != null) {
            try {
                return GoogleSignInOptions.m8202a(c);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m8260b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @Nullable
    /* renamed from: c */
    private final String m8261c(String str) {
        this.f5777a.lock();
        try {
            return this.f5778b.getString(str, null);
        } finally {
            this.f5777a.unlock();
        }
    }

    /* renamed from: a */
    public void mo6540a() {
        this.f5777a.lock();
        try {
            this.f5778b.edit().clear().apply();
        } finally {
            this.f5777a.unlock();
        }
    }

    /* renamed from: a */
    public void mo6541a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C2148s.m8834a(googleSignInAccount);
        C2148s.m8834a(googleSignInOptions);
        m8258a("defaultGoogleSignInAccount", googleSignInAccount.mo6488u());
        C2148s.m8834a(googleSignInAccount);
        C2148s.m8834a(googleSignInOptions);
        String u = googleSignInAccount.mo6488u();
        m8258a(m8260b("googleSignInAccount", u), googleSignInAccount.mo6489v());
        m8258a(m8260b("googleSignInOptions", u), googleSignInOptions.mo6501s());
    }

    @Nullable
    /* renamed from: b */
    public GoogleSignInAccount mo6542b() {
        return m8256a(m8261c("defaultGoogleSignInAccount"));
    }

    @Nullable
    /* renamed from: c */
    public GoogleSignInOptions mo6543c() {
        return m8259b(m8261c("defaultGoogleSignInAccount"));
    }

    @Nullable
    /* renamed from: d */
    public String mo6544d() {
        return m8261c("refreshToken");
    }
}
