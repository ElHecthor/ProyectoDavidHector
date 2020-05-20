package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.iid.k1 */
final /* synthetic */ class C2960k1 implements Callable {

    /* renamed from: f */
    private final Intent f8507f;

    C2960k1(Intent intent) {
        this.f8507f = intent;
    }

    public final Object call() {
        Intent intent = this.f8507f;
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
                sb.append("Received command: ");
                sb.append(stringExtra);
                sb.append(" - ");
                sb.append(valueOf);
                Log.d(str, sb.toString());
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.m12068k().mo9621f();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId.m12068k().mo9623h();
            }
        }
        return Integer.valueOf(-1);
    }
}
