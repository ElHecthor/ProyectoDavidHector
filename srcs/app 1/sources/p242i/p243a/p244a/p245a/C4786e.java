package p242i.p243a.p244a.p245a;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;

/* renamed from: i.a.a.a.e */
class C4786e implements Callable<Map<String, C4794k>> {

    /* renamed from: f */
    final String f12519f;

    C4786e(String str) {
        this.f12519f = str;
    }

    /* renamed from: a */
    private C4794k m19250a(ZipEntry zipEntry, ZipFile zipFile) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = zipFile.getInputStream(zipEntry);
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                String property = properties.getProperty("fabric-identifier");
                String property2 = properties.getProperty("fabric-version");
                String property3 = properties.getProperty("fabric-build-type");
                if (TextUtils.isEmpty(property) || TextUtils.isEmpty(property2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid format of fabric file,");
                    sb.append(zipEntry.getName());
                    throw new IllegalStateException(sb.toString());
                }
                C4794k kVar = new C4794k(property, property2, property3);
                C4813i.m19365a((Closeable) inputStream);
                return kVar;
            } catch (IOException e) {
                e = e;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error when parsing fabric properties ");
                    sb2.append(zipEntry.getName());
                    C4781c.m19229f().mo13793c("Fabric", sb2.toString(), e);
                    C4813i.m19365a((Closeable) inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    C4813i.m19365a((Closeable) inputStream2);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Error when parsing fabric properties ");
            sb22.append(zipEntry.getName());
            C4781c.m19229f().mo13793c("Fabric", sb22.toString(), e);
            C4813i.m19365a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C4813i.m19365a((Closeable) inputStream2);
            throw th;
        }
    }

    /* renamed from: b */
    private Map<String, C4794k> m19251b() {
        HashMap hashMap = new HashMap();
        try {
            Class.forName("com.google.android.gms.ads.AdView");
            C4794k kVar = new C4794k("com.google.firebase.firebase-ads", "0.0.0", "binary");
            hashMap.put(kVar.mo13841b(), kVar);
            C4781c.m19229f().mo13794d("Fabric", "Found kit: com.google.firebase.firebase-ads");
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: c */
    private Map<String, C4794k> m19252c() {
        HashMap hashMap = new HashMap();
        ZipFile a = mo13820a();
        Enumeration entries = a.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (zipEntry.getName().startsWith("fabric/") && zipEntry.getName().length() > 7) {
                C4794k a2 = m19250a(zipEntry, a);
                if (a2 != null) {
                    hashMap.put(a2.mo13841b(), a2);
                    C4781c.m19229f().mo13794d("Fabric", String.format("Found kit:[%s] version:[%s]", new Object[]{a2.mo13841b(), a2.mo13842c()}));
                }
            }
        }
        if (a != null) {
            try {
                a.close();
            } catch (IOException unused) {
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ZipFile mo13820a() {
        return new ZipFile(this.f12519f);
    }

    public Map<String, C4794k> call() {
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(m19251b());
        hashMap.putAll(m19252c());
        C4795l f = C4781c.m19229f();
        StringBuilder sb = new StringBuilder();
        sb.append("finish scanning in ");
        sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        f.mo13794d("Fabric", sb.toString());
        return hashMap;
    }
}
