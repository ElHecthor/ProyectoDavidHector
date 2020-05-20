package com.google.firebase.installations.p064q;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.q.b */
public class C3018b {

    /* renamed from: c */
    private static final String[] f8618c = {"*", "FCM", "GCM", ""};

    /* renamed from: a */
    private final SharedPreferences f8619a;

    /* renamed from: b */
    private final String f8620b;

    public C3018b(FirebaseApp firebaseApp) {
        this.f8619a = firebaseApp.mo9508a().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f8620b = m12291a(firebaseApp);
    }

    /* renamed from: a */
    private static String m12291a(FirebaseApp firebaseApp) {
        String c = firebaseApp.mo9511c().mo9579c();
        if (c != null) {
            return c;
        }
        String b = firebaseApp.mo9511c().mo9578b();
        if (!b.startsWith("1:") && !b.startsWith("2:")) {
            return b;
        }
        String[] split = b.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    private String m12292a(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private String m12293a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("|T|");
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m12294a(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: b */
    private PublicKey m12295b(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid key stored ");
            sb.append(e);
            Log.w("ContentValues", sb.toString());
            return null;
        }
    }

    /* renamed from: c */
    private String m12296c() {
        String string;
        synchronized (this.f8619a) {
            string = this.f8619a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: d */
    private String m12297d() {
        synchronized (this.f8619a) {
            String string = this.f8619a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey b = m12295b(string);
            if (b == null) {
                return null;
            }
            String a = m12294a(b);
            return a;
        }
    }

    /* renamed from: a */
    public String mo9757a() {
        synchronized (this.f8619a) {
            String c = m12296c();
            if (c != null) {
                return c;
            }
            String d = m12297d();
            return d;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r4;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo9758b() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f8619a
            monitor-enter(r0)
            java.lang.String[] r1 = f8618c     // Catch:{ all -> 0x0033 }
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0031
            r5 = r1[r3]     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = r7.f8620b     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r7.m12293a(r6, r5)     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r6 = r7.f8619a     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002e
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x002e
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r4 = r7.m12292a(r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p064q.C3018b.mo9758b():java.lang.String");
    }
}
