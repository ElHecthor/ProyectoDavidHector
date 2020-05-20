package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.C2001f;
import com.google.android.gms.common.api.C2004g;
import com.google.android.gms.common.api.C2006h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2046o;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.p049n.C2169a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.auth.api.signin.internal.e */
public final class C1958e implements Runnable {

    /* renamed from: h */
    private static final C2169a f5779h = new C2169a("RevokeAccessOperation", new String[0]);

    /* renamed from: f */
    private final String f5780f;

    /* renamed from: g */
    private final C2046o f5781g = new C2046o(null);

    private C1958e(String str) {
        C2148s.m8844b(str);
        this.f5780f = str;
    }

    /* renamed from: a */
    public static C2004g<Status> m8267a(String str) {
        if (str == null) {
            return C2006h.m8367a(new Status(4), (C2001f) null);
        }
        C1958e eVar = new C1958e(str);
        new Thread(eVar).start();
        return eVar.f5781g;
    }

    public final void run() {
        Status status = Status.f5798l;
        try {
            String str = "https://accounts.google.com/o/oauth2/revoke?token=";
            String valueOf = String.valueOf(this.f5780f);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f5796j;
            } else {
                f5779h.mo6954b("Unable to revoke access!", new Object[0]);
            }
            C2169a aVar = f5779h;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            aVar.mo6952a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            C2169a aVar2 = f5779h;
            String str2 = "IOException when revoking access: ";
            String valueOf2 = String.valueOf(e.toString());
            aVar2.mo6954b(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), new Object[0]);
        } catch (Exception e2) {
            C2169a aVar3 = f5779h;
            String str3 = "Exception when revoking access: ";
            String valueOf3 = String.valueOf(e2.toString());
            aVar3.mo6954b(valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3), new Object[0]);
        }
        this.f5781g.mo6634a(status);
    }
}
