package com.google.firebase.installations.p065r;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.util.C2186a;
import com.google.android.gms.common.util.C2195j;
import com.google.firebase.installations.p065r.C3030d.C3031a;
import com.google.firebase.installations.p065r.C3030d.C3032b;
import com.google.firebase.installations.p065r.C3033e.C3034a;
import com.google.firebase.installations.p065r.C3033e.C3035b;
import com.google.firebase.p060g.C2921c;
import com.google.firebase.p060g.C2921c.C2922a;
import com.google.firebase.p066j.C3043h;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.r.c */
public class C3029c {

    /* renamed from: d */
    private static final Pattern f8645d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    private static final Charset f8646e = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f8647a;

    /* renamed from: b */
    private final C3043h f8648b;

    /* renamed from: c */
    private final C2921c f8649c;

    public C3029c(Context context, C3043h hVar, C2921c cVar) {
        this.f8647a = context;
        this.f8648b = hVar;
        this.f8649c = cVar;
    }

    /* renamed from: a */
    static long m12349a(String str) {
        C2148s.m8842a(f8645d.matcher(str).matches(), (Object) "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: a */
    private HttpURLConnection m12350a(URL url, String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        String str2 = "application/json";
        httpURLConnection.addRequestProperty("Content-Type", str2);
        httpURLConnection.addRequestProperty("Accept", str2);
        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.addRequestProperty("X-Android-Package", this.f8647a.getPackageName());
        C2921c cVar = this.f8649c;
        if (!(cVar == null || this.f8648b == null)) {
            C2922a a = cVar.mo9604a("fire-installations-id");
            if (a != C2922a.NONE) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f8648b.mo9803a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a.mo9605f()));
            }
        }
        httpURLConnection.addRequestProperty("X-Android-Cert", m12358b());
        httpURLConnection.addRequestProperty("x-goog-api-key", str);
        return httpURLConnection;
    }

    /* renamed from: a */
    private static JSONObject m12351a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    private static JSONObject m12352a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.0");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    private static void m12353a(HttpURLConnection httpURLConnection) {
        String c = m12359c(httpURLConnection);
        if (!TextUtils.isEmpty(c)) {
            Log.w("Firebase-Installations", c);
        }
    }

    /* renamed from: a */
    private void m12354a(HttpURLConnection httpURLConnection, String str, String str2) {
        m12355a((URLConnection) httpURLConnection, m12356a(m12352a(str, str2)));
    }

    /* renamed from: a */
    private static void m12355a(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    /* renamed from: a */
    private static byte[] m12356a(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: b */
    private C3030d m12357b(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f8646e));
        C3034a d = C3033e.m12377d();
        C3031a f = C3030d.m12365f();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                f.mo9785c(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                f.mo9782a(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                f.mo9784b(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        d.mo9794a(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        d.mo9792a(m12349a(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                f.mo9781a(d.mo9795a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        f.mo9780a(C3032b.OK);
        return f.mo9783a();
    }

    /* renamed from: b */
    private String m12358b() {
        String str = "ContentValues";
        try {
            byte[] a = C2186a.m8970a(this.f8647a, this.f8647a.getPackageName());
            if (a != null) {
                return C2195j.m8996a(a, false);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get fingerprint hash for package: ");
            sb.append(this.f8647a.getPackageName());
            Log.e(str, sb.toString());
            return null;
        } catch (NameNotFoundException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No such package: ");
            sb2.append(this.f8647a.getPackageName());
            Log.e(str, sb2.toString(), e);
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m12359c(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f8646e
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 0
            int r6 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p065r.C3029c.m12359c(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: c */
    private static void m12360c() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: d */
    private C3033e m12361d(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f8646e));
        C3034a d = C3033e.m12377d();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                d.mo9794a(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                d.mo9792a(m12349a(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        d.mo9793a(C3035b.OK);
        return d.mo9795a();
    }

    /* renamed from: e */
    private void m12362e(HttpURLConnection httpURLConnection) {
        m12355a((URLConnection) httpURLConnection, m12356a(m12351a()));
    }

    /* renamed from: a */
    public C3030d mo9796a(String str, String str2, String str3, String str4, String str5) {
        int i = 0;
        URL url = new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", String.format("projects/%s/installations", new Object[]{str3})}));
        while (i <= 1) {
            HttpURLConnection a = m12350a(url, str);
            try {
                a.setRequestMethod("POST");
                a.setDoOutput(true);
                if (str5 != null) {
                    a.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                }
                m12354a(a, str2, str4);
                int responseCode = a.getResponseCode();
                if (responseCode == 200) {
                    C3030d b = m12357b(a);
                    a.disconnect();
                    return b;
                }
                m12353a(a);
                if (responseCode != 429) {
                    if (responseCode < 500 || responseCode >= 600) {
                        m12360c();
                        C3031a f = C3030d.m12365f();
                        f.mo9780a(C3032b.BAD_CONFIG);
                        C3030d a2 = f.mo9783a();
                        a.disconnect();
                        return a2;
                    }
                }
                i++;
            } finally {
                a.disconnect();
            }
        }
        throw new IOException();
    }

    /* renamed from: a */
    public C3033e mo9797a(String str, String str2, String str3, String str4) {
        int i = 0;
        URL url = new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2})}));
        while (i <= 1) {
            HttpURLConnection a = m12350a(url, str);
            try {
                a.setRequestMethod("POST");
                StringBuilder sb = new StringBuilder();
                sb.append("FIS_v2 ");
                sb.append(str4);
                a.addRequestProperty("Authorization", sb.toString());
                m12362e(a);
                int responseCode = a.getResponseCode();
                if (responseCode == 200) {
                    C3033e d = m12361d(a);
                    a.disconnect();
                    return d;
                }
                m12353a(a);
                if (responseCode != 401) {
                    if (responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                m12360c();
                                C3034a d2 = C3033e.m12377d();
                                d2.mo9793a(C3035b.BAD_CONFIG);
                                C3033e a2 = d2.mo9795a();
                                a.disconnect();
                                return a2;
                            }
                        }
                        i++;
                    }
                }
                C3034a d3 = C3033e.m12377d();
                d3.mo9793a(C3035b.AUTH_ERROR);
                C3033e a3 = d3.mo9795a();
                a.disconnect();
                return a3;
            } finally {
                a.disconnect();
            }
        }
        throw new IOException();
    }
}
