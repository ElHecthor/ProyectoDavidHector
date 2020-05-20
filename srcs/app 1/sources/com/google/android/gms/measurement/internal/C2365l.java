package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p071f.p097h.p098e.C3236a;

/* renamed from: com.google.android.gms.measurement.internal.l */
public final class C2365l extends C2507x5 {

    /* renamed from: c */
    private long f6605c;

    /* renamed from: d */
    private String f6606d;

    /* renamed from: e */
    private Boolean f6607e;

    /* renamed from: f */
    private AccountManager f6608f;

    /* renamed from: g */
    private Boolean f6609g;

    /* renamed from: h */
    private long f6610h;

    C2365l(C2263c5 c5Var) {
        super(c5Var);
    }

    /* renamed from: a */
    public final boolean mo7462a(Context context) {
        if (this.f6607e == null) {
            mo7094f();
            this.f6607e = Boolean.valueOf(false);
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f6607e = Boolean.valueOf(true);
                }
            } catch (NameNotFoundException unused) {
            }
        }
        return this.f6607e.booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo7397r() {
        Calendar instance = Calendar.getInstance();
        this.f6605c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f6606d = sb.toString();
        return false;
    }

    /* renamed from: t */
    public final long mo7463t() {
        mo7742o();
        return this.f6605c;
    }

    /* renamed from: u */
    public final String mo7464u() {
        mo7742o();
        return this.f6606d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final long mo7465v() {
        mo7274c();
        return this.f6610h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final void mo7466w() {
        mo7274c();
        this.f6609g = null;
        this.f6610h = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final boolean mo7467x() {
        String str = "com.google";
        mo7274c();
        long b = mo7095g().mo6988b();
        if (b - this.f6610h > 86400000) {
            this.f6609g = null;
        }
        Boolean bool = this.f6609g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C3236a.m13264a(mo7096h(), "android.permission.GET_ACCOUNTS") != 0) {
            mo7098j().mo7819x().mo7088a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f6608f == null) {
                this.f6608f = AccountManager.get(mo7096h());
            }
            try {
                Account[] accountArr = (Account[]) this.f6608f.getAccountsByTypeAndFeatures(str, new String[]{"service_HOSTED"}, null, null).getResult();
                if (accountArr == null || accountArr.length <= 0) {
                    Account[] accountArr2 = (Account[]) this.f6608f.getAccountsByTypeAndFeatures(str, new String[]{"service_uca"}, null, null).getResult();
                    if (accountArr2 != null && accountArr2.length > 0) {
                        this.f6609g = Boolean.valueOf(true);
                        this.f6610h = b;
                        return true;
                    }
                } else {
                    this.f6609g = Boolean.valueOf(true);
                    this.f6610h = b;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                mo7098j().mo7816u().mo7089a("Exception checking account types", e);
            }
        }
        this.f6610h = b;
        this.f6609g = Boolean.valueOf(false);
        return false;
    }
}
