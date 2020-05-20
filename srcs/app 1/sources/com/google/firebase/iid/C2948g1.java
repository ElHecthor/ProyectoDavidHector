package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import p147g.p156d.p157a.p167b.p184g.C4339a;
import p147g.p156d.p157a.p167b.p184g.C4350h;

/* renamed from: com.google.firebase.iid.g1 */
final /* synthetic */ class C2948g1 implements C4339a {
    C2948g1(C2945f1 f1Var) {
    }

    /* renamed from: a */
    public final Object mo9663a(C4350h hVar) {
        Bundle bundle = (Bundle) hVar.mo13012a(IOException.class);
        String str = "SERVICE_NOT_AVAILABLE";
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException(str);
            }
        } else {
            throw new IOException(str);
        }
    }
}
