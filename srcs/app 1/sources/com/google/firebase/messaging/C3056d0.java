package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C2141q;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.messaging.d0 */
final class C3056d0 {

    /* renamed from: d */
    private static final Pattern f8685d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    private final String f8686a;

    /* renamed from: b */
    private final String f8687b;

    /* renamed from: c */
    private final String f8688c;

    private C3056d0(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str}));
            str3 = str2.substring(8);
        }
        if (str3 == null || !f8685d.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str3, "[a-zA-Z0-9-_.~%]{1,900}"}));
        }
        this.f8686a = str3;
        this.f8687b = str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.f8688c = sb.toString();
    }

    /* renamed from: a */
    static C3056d0 m12426a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C3056d0(split[0], split[1]);
    }

    /* renamed from: a */
    public final String mo9826a() {
        return this.f8686a;
    }

    /* renamed from: b */
    public final String mo9827b() {
        return this.f8687b;
    }

    /* renamed from: c */
    public final String mo9828c() {
        return this.f8688c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3056d0)) {
            return false;
        }
        C3056d0 d0Var = (C3056d0) obj;
        return this.f8686a.equals(d0Var.f8686a) && this.f8687b.equals(d0Var.f8687b);
    }

    public final int hashCode() {
        return C2141q.m8821a(this.f8687b, this.f8686a);
    }
}
