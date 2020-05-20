package com.google.firebase.installations.p064q;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.p064q.C3021d.C3022a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.q.c */
public class C3019c {

    /* renamed from: a */
    private final File f8621a;

    /* renamed from: b */
    private final FirebaseApp f8622b;

    /* renamed from: com.google.firebase.installations.q.c$a */
    public enum C3020a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C3019c(FirebaseApp firebaseApp) {
        File filesDir = firebaseApp.mo9508a().getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append("PersistedInstallation.");
        sb.append(firebaseApp.mo9512d());
        sb.append(".json");
        this.f8621a = new File(filesDir, sb.toString());
        this.f8622b = firebaseApp;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m12300b() {
        /*
            r6 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r1]
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException | JSONException -> 0x002d }
            java.io.File r4 = r6.f8621a     // Catch:{ IOException | JSONException -> 0x002d }
            r3.<init>(r4)     // Catch:{ IOException | JSONException -> 0x002d }
        L_0x0010:
            r4 = 0
            int r5 = r3.read(r2, r4, r1)     // Catch:{ all -> 0x0028 }
            if (r5 >= 0) goto L_0x0024
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0028 }
            r1.<init>(r0)     // Catch:{ all -> 0x0028 }
            r3.close()     // Catch:{ IOException | JSONException -> 0x002d }
            return r1
        L_0x0024:
            r0.write(r2, r4, r5)     // Catch:{ all -> 0x0028 }
            goto L_0x0010
        L_0x0028:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ IOException | JSONException -> 0x002d }
        L_0x002d:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p064q.C3019c.m12300b():org.json.JSONObject");
    }

    /* renamed from: a */
    public C3021d mo9759a() {
        JSONObject b = m12300b();
        String optString = b.optString("Fid", null);
        int optInt = b.optInt("Status", C3020a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = b.optString("AuthToken", null);
        String optString3 = b.optString("RefreshToken", null);
        long optLong = b.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = b.optLong("ExpiresInSecs", 0);
        String optString4 = b.optString("FisError", null);
        C3022a p = C3021d.m12303p();
        p.mo9754b(optString);
        p.mo9750a(C3020a.values()[optInt]);
        p.mo9751a(optString2);
        p.mo9756d(optString3);
        p.mo9753b(optLong);
        p.mo9749a(optLong2);
        p.mo9755c(optString4);
        return p.mo9752a();
    }

    /* renamed from: a */
    public C3021d mo9760a(C3021d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.mo9740c());
            jSONObject.put("Status", dVar.mo9744f().ordinal());
            jSONObject.put("AuthToken", dVar.mo9738a());
            jSONObject.put("RefreshToken", dVar.mo9742e());
            jSONObject.put("TokenCreationEpochInSecs", dVar.mo9745g());
            jSONObject.put("ExpiresInSecs", dVar.mo9739b());
            jSONObject.put("FisError", dVar.mo9741d());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f8622b.mo9508a().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.f8621a)) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }
}
