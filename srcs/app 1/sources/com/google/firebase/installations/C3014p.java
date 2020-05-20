package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.p064q.C3021d;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.installations.p */
class C3014p {

    /* renamed from: a */
    public static final long f8603a = TimeUnit.HOURS.toSeconds(1);

    static {
        Pattern.compile("\\AA[\\w-]{38}\\z");
    }

    C3014p() {
    }

    /* renamed from: a */
    public long mo9736a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    /* renamed from: a */
    public boolean mo9737a(C3021d dVar) {
        return TextUtils.isEmpty(dVar.mo9738a()) || dVar.mo9745g() + dVar.mo9739b() < mo9736a() + f8603a;
    }
}
