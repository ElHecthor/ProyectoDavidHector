package com.google.android.gms.common.p049n;

import android.util.Log;
import com.google.android.gms.common.internal.C2124j;
import java.util.Locale;

/* renamed from: com.google.android.gms.common.n.a */
public class C2169a {

    /* renamed from: a */
    private final String f6129a;

    /* renamed from: b */
    private final String f6130b;

    /* renamed from: c */
    private final int f6131c;

    private C2169a(String str, String str2) {
        this.f6130b = str2;
        this.f6129a = str;
        new C2124j(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f6129a, i)) {
            i++;
        }
        this.f6131c = i;
    }

    public C2169a(String str, String... strArr) {
        String str2;
        if (strArr.length == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append(']');
            sb.append(' ');
            str2 = sb.toString();
        }
        this(str, str2);
    }

    /* renamed from: a */
    public void mo6952a(String str, Object... objArr) {
        if (mo6953a(3)) {
            Log.d(this.f6129a, mo6955c(str, objArr));
        }
    }

    /* renamed from: a */
    public boolean mo6953a(int i) {
        return this.f6131c <= i;
    }

    /* renamed from: b */
    public void mo6954b(String str, Object... objArr) {
        Log.e(this.f6129a, mo6955c(str, objArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo6955c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f6130b.concat(str);
    }
}
