package com.facebook;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.C1809s.C1810a;
import com.facebook.C1809s.C1811b;
import com.facebook.internal.C1679n;
import com.facebook.internal.C1682p;
import com.facebook.internal.C1696t;
import com.facebook.internal.C1698v;
import com.facebook.internal.C1703w;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.q */
public class C1797q {

    /* renamed from: n */
    public static final String f5383n = "q";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final String f5384o;

    /* renamed from: p */
    private static String f5385p;

    /* renamed from: q */
    private static Pattern f5386q = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");

    /* renamed from: r */
    private static volatile String f5387r;

    /* renamed from: a */
    private C1499a f5388a;

    /* renamed from: b */
    private C1843u f5389b;

    /* renamed from: c */
    private String f5390c;

    /* renamed from: d */
    private JSONObject f5391d;

    /* renamed from: e */
    private String f5392e;

    /* renamed from: f */
    private String f5393f;

    /* renamed from: g */
    private boolean f5394g;

    /* renamed from: h */
    private Bundle f5395h;

    /* renamed from: i */
    private C1802e f5396i;

    /* renamed from: j */
    private String f5397j;

    /* renamed from: k */
    private Object f5398k;

    /* renamed from: l */
    private String f5399l;

    /* renamed from: m */
    private boolean f5400m;

    /* renamed from: com.facebook.q$a */
    class C1798a implements C1802e {

        /* renamed from: a */
        final /* synthetic */ C1802e f5401a;

        C1798a(C1797q qVar, C1802e eVar) {
            this.f5401a = eVar;
        }

        /* renamed from: a */
        public void mo5725a(C1842t tVar) {
            JSONObject b = tVar.mo6291b();
            JSONObject optJSONObject = b != null ? b.optJSONObject("__debug__") : null;
            JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("messages") : null;
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    String optString = optJSONObject2 != null ? optJSONObject2.optString("message") : null;
                    String optString2 = optJSONObject2 != null ? optJSONObject2.optString("type") : null;
                    String optString3 = optJSONObject2 != null ? optJSONObject2.optString("link") : null;
                    if (!(optString == null || optString2 == null)) {
                        C1845w wVar = C1845w.GRAPH_API_DEBUG_INFO;
                        if (optString2.equals("warning")) {
                            wVar = C1845w.GRAPH_API_DEBUG_WARNING;
                        }
                        if (!C1698v.m7401c(optString3)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(optString);
                            sb.append(" Link: ");
                            sb.append(optString3);
                            optString = sb.toString();
                        }
                        C1682p.m7282a(wVar, C1797q.f5383n, optString);
                    }
                }
            }
            C1802e eVar = this.f5401a;
            if (eVar != null) {
                eVar.mo5725a(tVar);
            }
        }
    }

    /* renamed from: com.facebook.q$b */
    static class C1799b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f5402f;

        /* renamed from: g */
        final /* synthetic */ C1809s f5403g;

        C1799b(ArrayList arrayList, C1809s sVar) {
            this.f5402f = arrayList;
            this.f5403g = sVar;
        }

        public void run() {
            Iterator it = this.f5402f.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ((C1802e) pair.first).mo5725a((C1842t) pair.second);
            }
            for (C1810a a : this.f5403g.mo6229i()) {
                a.mo5726a(this.f5403g);
            }
        }
    }

    /* renamed from: com.facebook.q$c */
    class C1800c implements C1803f {

        /* renamed from: a */
        final /* synthetic */ ArrayList f5404a;

        C1800c(C1797q qVar, ArrayList arrayList) {
            this.f5404a = arrayList;
        }

        /* renamed from: a */
        public void mo6188a(String str, String str2) {
            this.f5404a.add(String.format(Locale.US, "%s=%s", new Object[]{str, URLEncoder.encode(str2, "UTF-8")}));
        }
    }

    /* renamed from: com.facebook.q$d */
    private static class C1801d {

        /* renamed from: a */
        private final C1797q f5405a;

        /* renamed from: b */
        private final Object f5406b;

        public C1801d(C1797q qVar, Object obj) {
            this.f5405a = qVar;
            this.f5406b = obj;
        }

        /* renamed from: a */
        public C1797q mo6189a() {
            return this.f5405a;
        }

        /* renamed from: b */
        public Object mo6190b() {
            return this.f5406b;
        }
    }

    /* renamed from: com.facebook.q$e */
    public interface C1802e {
        /* renamed from: a */
        void mo5725a(C1842t tVar);
    }

    /* renamed from: com.facebook.q$f */
    private interface C1803f {
        /* renamed from: a */
        void mo6188a(String str, String str2);
    }

    /* renamed from: com.facebook.q$g */
    public interface C1804g extends C1802e {
        /* renamed from: a */
        void mo6191a(long j, long j2);
    }

    /* renamed from: com.facebook.q$h */
    public static class C1805h<RESOURCE extends Parcelable> implements Parcelable {
        public static final Creator<C1805h> CREATOR = new C1806a();

        /* renamed from: f */
        private final String f5407f;

        /* renamed from: g */
        private final RESOURCE f5408g;

        /* renamed from: com.facebook.q$h$a */
        static class C1806a implements Creator<C1805h> {
            C1806a() {
            }

            public C1805h createFromParcel(Parcel parcel) {
                return new C1805h(parcel, (C1796p) null);
            }

            public C1805h[] newArray(int i) {
                return new C1805h[i];
            }
        }

        private C1805h(Parcel parcel) {
            this.f5407f = parcel.readString();
            this.f5408g = parcel.readParcelable(C1787m.m7744e().getClassLoader());
        }

        /* synthetic */ C1805h(Parcel parcel, C1796p pVar) {
            this(parcel);
        }

        public C1805h(RESOURCE resource, String str) {
            this.f5407f = str;
            this.f5408g = resource;
        }

        /* renamed from: a */
        public String mo6192a() {
            return this.f5407f;
        }

        /* renamed from: b */
        public RESOURCE mo6193b() {
            return this.f5408g;
        }

        public int describeContents() {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5407f);
            parcel.writeParcelable(this.f5408g, i);
        }
    }

    /* renamed from: com.facebook.q$i */
    private static class C1807i implements C1803f {

        /* renamed from: a */
        private final OutputStream f5409a;

        /* renamed from: b */
        private final C1682p f5410b;

        /* renamed from: c */
        private boolean f5411c = true;

        /* renamed from: d */
        private boolean f5412d = false;

        public C1807i(OutputStream outputStream, C1682p pVar, boolean z) {
            this.f5409a = outputStream;
            this.f5410b = pVar;
            this.f5412d = z;
        }

        /* renamed from: b */
        private RuntimeException m7830b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: a */
        public void mo6198a() {
            if (!this.f5412d) {
                mo6207b("--%s", C1797q.f5384o);
                return;
            }
            this.f5409a.write("&".getBytes());
        }

        /* renamed from: a */
        public void mo6199a(String str, Bitmap bitmap) {
            mo6203a(str, str, "image/png");
            bitmap.compress(CompressFormat.PNG, 100, this.f5409a);
            mo6207b("", new Object[0]);
            mo6198a();
            C1682p pVar = this.f5410b;
            if (pVar != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                pVar.mo5926a(sb.toString(), (Object) "<Image>");
            }
        }

        /* renamed from: a */
        public void mo6200a(String str, Uri uri, String str2) {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo6203a(str, str, str2);
            if (this.f5409a instanceof C1502a0) {
                ((C1502a0) this.f5409a).mo5705d(C1698v.m7355a(uri));
                i = 0;
            } else {
                i = C1698v.m7353a(C1787m.m7744e().getContentResolver().openInputStream(uri), this.f5409a) + 0;
            }
            mo6207b("", new Object[0]);
            mo6198a();
            C1682p pVar = this.f5410b;
            if (pVar != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                pVar.mo5926a(sb.toString(), (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: a */
        public void mo6201a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo6203a(str, str, str2);
            OutputStream outputStream = this.f5409a;
            if (outputStream instanceof C1502a0) {
                ((C1502a0) outputStream).mo5705d(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = C1698v.m7353a((InputStream) new AutoCloseInputStream(parcelFileDescriptor), this.f5409a) + 0;
            }
            mo6207b("", new Object[0]);
            mo6198a();
            C1682p pVar = this.f5410b;
            if (pVar != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                pVar.mo5926a(sb.toString(), (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: a */
        public void mo6202a(String str, Object obj, C1797q qVar) {
            OutputStream outputStream = this.f5409a;
            if (outputStream instanceof C1513c0) {
                ((C1513c0) outputStream).mo5703a(qVar);
            }
            if (C1797q.m7794e(obj)) {
                mo6188a(str, C1797q.m7795f(obj));
            } else if (obj instanceof Bitmap) {
                mo6199a(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                mo6205a(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                mo6200a(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                mo6201a(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof C1805h) {
                C1805h hVar = (C1805h) obj;
                Parcelable b = hVar.mo6193b();
                String a = hVar.mo6192a();
                if (b instanceof ParcelFileDescriptor) {
                    mo6201a(str, (ParcelFileDescriptor) b, a);
                } else if (b instanceof Uri) {
                    mo6200a(str, (Uri) b, a);
                } else {
                    throw m7830b();
                }
            } else {
                throw m7830b();
            }
        }

        /* renamed from: a */
        public void mo6188a(String str, String str2) {
            mo6203a(str, (String) null, (String) null);
            mo6207b("%s", str2);
            mo6198a();
            C1682p pVar = this.f5410b;
            if (pVar != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                pVar.mo5926a(sb.toString(), (Object) str2);
            }
        }

        /* renamed from: a */
        public void mo6203a(String str, String str2, String str3) {
            if (!this.f5412d) {
                mo6206a("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    mo6206a("; filename=\"%s\"", str2);
                }
                String str4 = "";
                mo6207b(str4, new Object[0]);
                if (str3 != null) {
                    mo6207b("%s: %s", "Content-Type", str3);
                }
                mo6207b(str4, new Object[0]);
                return;
            }
            this.f5409a.write(String.format("%s=", new Object[]{str}).getBytes());
        }

        /* renamed from: a */
        public void mo6204a(String str, JSONArray jSONArray, Collection<C1797q> collection) {
            OutputStream outputStream = this.f5409a;
            if (!(outputStream instanceof C1513c0)) {
                mo6188a(str, jSONArray.toString());
                return;
            }
            C1513c0 c0Var = (C1513c0) outputStream;
            mo6203a(str, (String) null, (String) null);
            mo6206a("[", new Object[0]);
            int i = 0;
            for (C1797q qVar : collection) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                c0Var.mo5703a(qVar);
                Object[] objArr = new Object[1];
                String jSONObject2 = jSONObject.toString();
                if (i > 0) {
                    objArr[0] = jSONObject2;
                    mo6206a(",%s", objArr);
                } else {
                    objArr[0] = jSONObject2;
                    mo6206a("%s", objArr);
                }
                i++;
            }
            mo6206a("]", new Object[0]);
            C1682p pVar = this.f5410b;
            if (pVar != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                pVar.mo5926a(sb.toString(), (Object) jSONArray.toString());
            }
        }

        /* renamed from: a */
        public void mo6205a(String str, byte[] bArr) {
            mo6203a(str, str, "content/unknown");
            this.f5409a.write(bArr);
            mo6207b("", new Object[0]);
            mo6198a();
            C1682p pVar = this.f5410b;
            if (pVar != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                pVar.mo5926a(sb.toString(), (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(bArr.length)}));
            }
        }

        /* renamed from: a */
        public void mo6206a(String str, Object... objArr) {
            if (!this.f5412d) {
                if (this.f5411c) {
                    this.f5409a.write("--".getBytes());
                    this.f5409a.write(C1797q.f5384o.getBytes());
                    this.f5409a.write("\r\n".getBytes());
                    this.f5411c = false;
                }
                this.f5409a.write(String.format(str, objArr).getBytes());
                return;
            }
            this.f5409a.write(URLEncoder.encode(String.format(Locale.US, str, objArr), "UTF-8").getBytes());
        }

        /* renamed from: b */
        public void mo6207b(String str, Object... objArr) {
            mo6206a(str, objArr);
            if (!this.f5412d) {
                mo6206a("\r\n", new Object[0]);
            }
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        f5384o = sb.toString();
    }

    public C1797q() {
        this(null, null, null, null, null);
    }

    public C1797q(C1499a aVar, String str, Bundle bundle, C1843u uVar, C1802e eVar) {
        this(aVar, str, bundle, uVar, eVar, null);
    }

    public C1797q(C1499a aVar, String str, Bundle bundle, C1843u uVar, C1802e eVar, String str2) {
        Bundle bundle2;
        this.f5394g = true;
        this.f5400m = false;
        this.f5388a = aVar;
        this.f5390c = str;
        this.f5399l = str2;
        mo6170a(eVar);
        mo6171a(uVar);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        this.f5395h = bundle2;
        if (this.f5399l == null) {
            this.f5399l = C1787m.m7753n();
        }
    }

    /* renamed from: a */
    public static C1797q m7764a(C1499a aVar, String str, C1802e eVar) {
        C1797q qVar = new C1797q(aVar, str, null, null, eVar);
        return qVar;
    }

    /* renamed from: a */
    public static C1797q m7765a(C1499a aVar, String str, JSONObject jSONObject, C1802e eVar) {
        C1797q qVar = new C1797q(aVar, str, null, C1843u.POST, eVar);
        qVar.mo6173a(jSONObject);
        return qVar;
    }

    /* renamed from: a */
    public static C1842t m7766a(C1797q qVar) {
        List a = m7772a(qVar);
        if (a != null && a.size() == 1) {
            return (C1842t) a.get(0);
        }
        throw new C1631i("invalid state: expected a single response");
    }

    /* renamed from: a */
    private String m7767a(String str, Boolean bool) {
        if (!bool.booleanValue() && this.f5389b == C1843u.POST) {
            return str;
        }
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f5395h.keySet()) {
            Object obj = this.f5395h.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (m7794e(obj)) {
                buildUpon.appendQueryParameter(str2, m7795f(obj).toString());
            } else if (this.f5389b == C1843u.GET) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[]{obj.getClass().getSimpleName()}));
            }
        }
        return buildUpon.toString();
    }

    /* renamed from: a */
    private static HttpURLConnection m7768a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("User-Agent", m7802q());
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    /* renamed from: a */
    public static List<C1842t> m7769a(C1809s sVar) {
        C1703w.m7431c(sVar, "requests");
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = m7796f(sVar);
            return m7770a(httpURLConnection, sVar);
        } catch (Exception e) {
            List<C1842t> a = C1842t.m7924a(sVar.mo6231l(), httpURLConnection, new C1631i((Throwable) e));
            m7777a(sVar, a);
            return a;
        } finally {
            C1698v.m7382a((URLConnection) httpURLConnection);
        }
    }

    /* renamed from: a */
    public static List<C1842t> m7770a(HttpURLConnection httpURLConnection, C1809s sVar) {
        List<C1842t> a = C1842t.m7922a(httpURLConnection, sVar);
        C1698v.m7382a((URLConnection) httpURLConnection);
        int size = sVar.size();
        if (size == a.size()) {
            m7777a(sVar, a);
            C1507c.m6802e().mo5721b();
            return a;
        }
        throw new C1631i(String.format(Locale.US, "Received %d responses while expecting %d", new Object[]{Integer.valueOf(a.size()), Integer.valueOf(size)}));
    }

    /* renamed from: a */
    public static List<C1842t> m7771a(Collection<C1797q> collection) {
        return m7769a(new C1809s(collection));
    }

    /* renamed from: a */
    public static List<C1842t> m7772a(C1797q... qVarArr) {
        C1703w.m7423a((Object) qVarArr, "requests");
        return m7771a((Collection<C1797q>) Arrays.asList(qVarArr));
    }

    /* renamed from: a */
    private static void m7773a(Bundle bundle, C1807i iVar, C1797q qVar) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (m7794e(obj)) {
                iVar.mo6202a(str, obj, qVar);
            }
        }
    }

    /* renamed from: a */
    private static void m7774a(C1807i iVar, Collection<C1797q> collection, Map<String, C1801d> map) {
        JSONArray jSONArray = new JSONArray();
        for (C1797q a : collection) {
            a.m7781a(jSONArray, map);
        }
        iVar.mo6204a("batch", jSONArray, collection);
    }

    /* renamed from: a */
    private static void m7775a(C1809s sVar, C1682p pVar, int i, URL url, OutputStream outputStream, boolean z) {
        C1807i iVar = new C1807i(outputStream, pVar, z);
        String str = "  Attachments:\n";
        if (i == 1) {
            C1797q qVar = sVar.get(0);
            HashMap hashMap = new HashMap();
            for (String str2 : qVar.f5395h.keySet()) {
                Object obj = qVar.f5395h.get(str2);
                if (m7792d(obj)) {
                    hashMap.put(str2, new C1801d(qVar, obj));
                }
            }
            if (pVar != null) {
                pVar.mo5925a("  Parameters:\n");
            }
            m7773a(qVar.f5395h, iVar, qVar);
            if (pVar != null) {
                pVar.mo5925a(str);
            }
            m7780a((Map<String, C1801d>) hashMap, iVar);
            JSONObject jSONObject = qVar.f5391d;
            if (jSONObject != null) {
                m7782a(jSONObject, url.getPath(), (C1803f) iVar);
                return;
            }
            return;
        }
        String c = m7789c(sVar);
        if (!C1698v.m7401c(c)) {
            iVar.mo6188a("batch_app_id", c);
            HashMap hashMap2 = new HashMap();
            m7774a(iVar, (Collection<C1797q>) sVar, (Map<String, C1801d>) hashMap2);
            if (pVar != null) {
                pVar.mo5925a(str);
            }
            m7780a((Map<String, C1801d>) hashMap2, iVar);
            return;
        }
        throw new C1631i("App ID was not specified at the request or Settings.");
    }

    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r14v3, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* JADX WARNING: type inference failed for: r7v10, types: [com.facebook.b0] */
    /* JADX WARNING: type inference failed for: r8v5, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r14v7, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r7v11, types: [com.facebook.b0] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v5
      assigns: []
      uses: []
      mth insns count: 87
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARNING: Unknown variable types count: 11 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void m7776a(com.facebook.C1809s r13, java.net.HttpURLConnection r14) {
        /*
            com.facebook.internal.p r6 = new com.facebook.internal.p
            com.facebook.w r0 = com.facebook.C1845w.REQUESTS
            java.lang.String r1 = "Request"
            r6.<init>(r0, r1)
            int r2 = r13.size()
            boolean r5 = m7793e(r13)
            r0 = 0
            r1 = 1
            if (r2 != r1) goto L_0x001c
            com.facebook.q r3 = r13.get(r0)
            com.facebook.u r3 = r3.f5389b
            goto L_0x001e
        L_0x001c:
            com.facebook.u r3 = com.facebook.C1843u.POST
        L_0x001e:
            java.lang.String r4 = r3.name()
            r14.setRequestMethod(r4)
            m7779a(r14, r5)
            java.net.URL r4 = r14.getURL()
            java.lang.String r7 = "Request:\n"
            r6.mo5925a(r7)
            java.lang.String r7 = r13.mo6230k()
            java.lang.String r8 = "Id"
            r6.mo5926a(r8, r7)
            java.lang.String r7 = "URL"
            r6.mo5926a(r7, r4)
            java.lang.String r7 = r14.getRequestMethod()
            java.lang.String r8 = "Method"
            r6.mo5926a(r8, r7)
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = r14.getRequestProperty(r7)
            r6.mo5926a(r7, r8)
            java.lang.String r7 = "Content-Type"
            java.lang.String r8 = r14.getRequestProperty(r7)
            r6.mo5926a(r7, r8)
            int r7 = r13.mo6232m()
            r14.setConnectTimeout(r7)
            int r7 = r13.mo6232m()
            r14.setReadTimeout(r7)
            com.facebook.u r7 = com.facebook.C1843u.POST
            if (r3 != r7) goto L_0x006d
            r0 = 1
        L_0x006d:
            if (r0 != 0) goto L_0x0073
            r6.mo5924a()
            return
        L_0x0073:
            r14.setDoOutput(r1)
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00c9 }
            java.io.OutputStream r14 = r14.getOutputStream()     // Catch:{ all -> 0x00c9 }
            r1.<init>(r14)     // Catch:{ all -> 0x00c9 }
            if (r5 == 0) goto L_0x008c
            java.util.zip.GZIPOutputStream r14 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0089 }
            r14.<init>(r1)     // Catch:{ all -> 0x0089 }
            r0 = r14
            goto L_0x008d
        L_0x0089:
            r13 = move-exception
            r0 = r1
            goto L_0x00ca
        L_0x008c:
            r0 = r1
        L_0x008d:
            boolean r14 = m7791d(r13)     // Catch:{ all -> 0x00c9 }
            if (r14 == 0) goto L_0x00b7
            com.facebook.a0 r14 = new com.facebook.a0     // Catch:{ all -> 0x00c9 }
            android.os.Handler r1 = r13.mo6228h()     // Catch:{ all -> 0x00c9 }
            r14.<init>(r1)     // Catch:{ all -> 0x00c9 }
            r8 = 0
            r7 = r13
            r9 = r2
            r10 = r4
            r11 = r14
            r12 = r5
            m7775a(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c9 }
            int r1 = r14.mo5702a()     // Catch:{ all -> 0x00c9 }
            java.util.Map r10 = r14.mo5704d()     // Catch:{ all -> 0x00c9 }
            com.facebook.b0 r14 = new com.facebook.b0     // Catch:{ all -> 0x00c9 }
            long r11 = (long) r1     // Catch:{ all -> 0x00c9 }
            r7 = r14
            r8 = r0
            r9 = r13
            r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x00c9 }
            goto L_0x00b8
        L_0x00b7:
            r14 = r0
        L_0x00b8:
            r0 = r13
            r1 = r6
            r3 = r4
            r4 = r14
            m7775a(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00c6 }
            r14.close()
            r6.mo5924a()
            return
        L_0x00c6:
            r13 = move-exception
            r0 = r14
            goto L_0x00ca
        L_0x00c9:
            r13 = move-exception
        L_0x00ca:
            if (r0 == 0) goto L_0x00cf
            r0.close()
        L_0x00cf:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C1797q.m7776a(com.facebook.s, java.net.HttpURLConnection):void");
    }

    /* renamed from: a */
    static void m7777a(C1809s sVar, List<C1842t> list) {
        int size = sVar.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            C1797q qVar = sVar.get(i);
            if (qVar.f5396i != null) {
                arrayList.add(new Pair(qVar.f5396i, list.get(i)));
            }
        }
        if (arrayList.size() > 0) {
            C1799b bVar = new C1799b(arrayList, sVar);
            Handler h = sVar.mo6228h();
            if (h == null) {
                bVar.run();
            } else {
                h.post(bVar);
            }
        }
    }

    /* renamed from: a */
    private static void m7778a(String str, Object obj, C1803f fVar, boolean z) {
        String str2;
        String jSONObject;
        Class cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject2 = (JSONObject) obj;
            if (z) {
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    m7778a(String.format("%s[%s]", new Object[]{str, str3}), jSONObject2.opt(str3), fVar, z);
                }
                return;
            }
            String str4 = "id";
            if (!jSONObject2.has(str4)) {
                str4 = "url";
                if (!jSONObject2.has(str4)) {
                    if (jSONObject2.has("fbsdk:create_object")) {
                        jSONObject = jSONObject2.toString();
                        m7778a(str, (Object) jSONObject, fVar, z);
                    }
                    return;
                }
            }
            jSONObject = jSONObject2.optString(str4);
            m7778a(str, (Object) jSONObject, fVar, z);
        } else if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                m7778a(String.format(Locale.ROOT, "%s[%d]", new Object[]{str, Integer.valueOf(i)}), jSONArray.opt(i), fVar, z);
            }
        } else {
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                str2 = obj.toString();
            } else if (Date.class.isAssignableFrom(cls)) {
                str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            } else {
                return;
            }
            fVar.mo6188a(str, str2);
        }
    }

    /* renamed from: a */
    private static void m7779a(HttpURLConnection httpURLConnection, boolean z) {
        String str = "Content-Type";
        if (z) {
            httpURLConnection.setRequestProperty(str, "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            return;
        }
        httpURLConnection.setRequestProperty(str, m7801p());
    }

    /* renamed from: a */
    private static void m7780a(Map<String, C1801d> map, C1807i iVar) {
        for (String str : map.keySet()) {
            C1801d dVar = (C1801d) map.get(str);
            if (m7792d(dVar.mo6190b())) {
                iVar.mo6202a(str, dVar.mo6190b(), dVar.mo6189a());
            }
        }
    }

    /* renamed from: a */
    private void m7781a(JSONArray jSONArray, Map<String, C1801d> map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.f5392e;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f5394g);
        }
        String str2 = this.f5393f;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String i = mo6182i();
        jSONObject.put("relative_url", i);
        jSONObject.put("method", this.f5389b);
        C1499a aVar = this.f5388a;
        if (aVar != null) {
            C1682p.m7286c(aVar.mo5692i());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.f5395h.keySet()) {
            Object obj = this.f5395h.get(str3);
            if (m7792d(obj)) {
                String format = String.format(Locale.ROOT, "%s%d", new Object[]{"file", Integer.valueOf(map.size())});
                arrayList.add(format);
                map.put(format, new C1801d(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.f5391d != null) {
            ArrayList arrayList2 = new ArrayList();
            m7782a(this.f5391d, i, (C1803f) new C1800c(this, arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m7782a(org.json.JSONObject r6, java.lang.String r7, com.facebook.C1797q.C1803f r8) {
        /*
            boolean r0 = m7783a(r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = ":"
            int r0 = r7.indexOf(r0)
            java.lang.String r3 = "?"
            int r7 = r7.indexOf(r3)
            r3 = 3
            if (r0 <= r3) goto L_0x001e
            r3 = -1
            if (r7 == r3) goto L_0x001c
            if (r0 >= r7) goto L_0x001e
        L_0x001c:
            r7 = 1
            goto L_0x001f
        L_0x001e:
            r7 = 0
        L_0x001f:
            java.util.Iterator r0 = r6.keys()
        L_0x0023:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0044
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r6.opt(r3)
            if (r7 == 0) goto L_0x003f
            java.lang.String r5 = "image"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            m7778a(r3, r4, r8, r5)
            goto L_0x0023
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C1797q.m7782a(org.json.JSONObject, java.lang.String, com.facebook.q$f):void");
    }

    /* renamed from: a */
    private static boolean m7783a(String str) {
        Matcher matcher = f5386q.matcher(str);
        if (matcher.matches()) {
            str = matcher.group(1);
        }
        return str.startsWith("me/") || str.startsWith("/me/");
    }

    /* renamed from: b */
    public static C1808r m7784b(C1809s sVar) {
        C1703w.m7431c(sVar, "requests");
        C1808r rVar = new C1808r(sVar);
        rVar.executeOnExecutor(C1787m.m7751l(), new Void[0]);
        return rVar;
    }

    /* renamed from: b */
    public static C1808r m7785b(Collection<C1797q> collection) {
        return m7784b(new C1809s(collection));
    }

    /* renamed from: b */
    public static C1808r m7786b(C1797q... qVarArr) {
        C1703w.m7423a((Object) qVarArr, "requests");
        return m7785b((Collection<C1797q>) Arrays.asList(qVarArr));
    }

    /* renamed from: b */
    static final boolean m7787b(C1797q qVar) {
        String l = qVar.mo6185l();
        boolean z = true;
        if (C1698v.m7401c(l)) {
            return true;
        }
        if (l.startsWith("v")) {
            l = l.substring(1);
        }
        String[] split = l.split("\\.");
        if ((split.length < 2 || Integer.parseInt(split[0]) <= 2) && (Integer.parseInt(split[0]) < 2 || Integer.parseInt(split[1]) < 4)) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private static String m7789c(C1809s sVar) {
        if (!C1698v.m7401c(sVar.mo6226g())) {
            return sVar.mo6226g();
        }
        Iterator it = sVar.iterator();
        while (it.hasNext()) {
            C1499a aVar = ((C1797q) it.next()).f5388a;
            if (aVar != null) {
                String a = aVar.mo5681a();
                if (a != null) {
                    return a;
                }
            }
        }
        return !C1698v.m7401c(f5385p) ? f5385p : C1787m.m7745f();
    }

    /* renamed from: d */
    private static boolean m7791d(C1809s sVar) {
        for (C1810a aVar : sVar.mo6229i()) {
            if (aVar instanceof C1811b) {
                return true;
            }
        }
        Iterator it = sVar.iterator();
        while (it.hasNext()) {
            if (((C1797q) it.next()).mo6177d() instanceof C1804g) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m7792d(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof C1805h);
    }

    /* renamed from: e */
    private static boolean m7793e(C1809s sVar) {
        Iterator it = sVar.iterator();
        while (it.hasNext()) {
            C1797q qVar = (C1797q) it.next();
            Iterator it2 = qVar.f5395h.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (m7792d(qVar.f5395h.get((String) it2.next()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m7794e(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static String m7795f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    /* renamed from: f */
    public static HttpURLConnection m7796f(C1809s sVar) {
        m7797g(sVar);
        try {
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = m7768a(sVar.size() == 1 ? new URL(sVar.get(0).mo6184k()) : new URL(C1696t.m7349c()));
                m7776a(sVar, httpURLConnection);
                return httpURLConnection;
            } catch (IOException | JSONException e) {
                C1698v.m7382a((URLConnection) httpURLConnection);
                throw new C1631i("could not construct request body", e);
            }
        } catch (MalformedURLException e2) {
            throw new C1631i("could not construct URL for request", e2);
        }
    }

    /* renamed from: g */
    static final void m7797g(C1809s sVar) {
        Iterator it = sVar.iterator();
        while (it.hasNext()) {
            C1797q qVar = (C1797q) it.next();
            if (C1843u.GET.equals(qVar.mo6180g()) && m7787b(qVar)) {
                Bundle h = qVar.mo6181h();
                String str = "fields";
                if (!h.containsKey(str) || C1698v.m7401c(h.getString(str))) {
                    C1682p.m7281a(C1845w.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", qVar.mo6179f());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7799n() {
        /*
            r4 = this;
            com.facebook.a r0 = r4.f5388a
            java.lang.String r1 = "access_token"
            if (r0 == 0) goto L_0x001d
            android.os.Bundle r0 = r4.f5395h
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0059
            com.facebook.a r0 = r4.f5388a
            java.lang.String r0 = r0.mo5692i()
            com.facebook.internal.C1682p.m7286c(r0)
        L_0x0017:
            android.os.Bundle r2 = r4.f5395h
            r2.putString(r1, r0)
            goto L_0x0059
        L_0x001d:
            boolean r0 = r4.f5400m
            if (r0 != 0) goto L_0x0059
            android.os.Bundle r0 = r4.f5395h
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = com.facebook.C1787m.m7745f()
            java.lang.String r2 = com.facebook.C1787m.m7749j()
            boolean r3 = com.facebook.internal.C1698v.m7401c(r0)
            if (r3 != 0) goto L_0x0052
            boolean r3 = com.facebook.internal.C1698v.m7401c(r2)
            if (r3 != 0) goto L_0x0052
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "|"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            goto L_0x0017
        L_0x0052:
            java.lang.String r0 = f5383n
            java.lang.String r1 = "Warning: Request without access token missing application ID or client token."
            com.facebook.internal.C1698v.m7399c(r0, r1)
        L_0x0059:
            android.os.Bundle r0 = r4.f5395h
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            android.os.Bundle r0 = r4.f5395h
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            com.facebook.w r0 = com.facebook.C1845w.GRAPH_API_DEBUG_INFO
            boolean r0 = com.facebook.C1787m.m7737a(r0)
            java.lang.String r1 = "debug"
            if (r0 == 0) goto L_0x007d
            android.os.Bundle r0 = r4.f5395h
            java.lang.String r2 = "info"
        L_0x0079:
            r0.putString(r1, r2)
            goto L_0x008a
        L_0x007d:
            com.facebook.w r0 = com.facebook.C1845w.GRAPH_API_DEBUG_WARNING
            boolean r0 = com.facebook.C1787m.m7737a(r0)
            if (r0 == 0) goto L_0x008a
            android.os.Bundle r0 = r4.f5395h
            java.lang.String r2 = "warning"
            goto L_0x0079
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C1797q.m7799n():void");
    }

    /* renamed from: o */
    private String m7800o() {
        if (f5386q.matcher(this.f5390c).matches()) {
            return this.f5390c;
        }
        return String.format("%s/%s", new Object[]{this.f5399l, this.f5390c});
    }

    /* renamed from: p */
    private static String m7801p() {
        return String.format("multipart/form-data; boundary=%s", new Object[]{f5384o});
    }

    /* renamed from: q */
    private static String m7802q() {
        if (f5387r == null) {
            f5387r = String.format("%s.%s", new Object[]{"FBAndroidSDK", "5.8.0"});
            String a = C1679n.m7276a();
            if (!C1698v.m7401c(a)) {
                f5387r = String.format(Locale.ROOT, "%s/%s", new Object[]{f5387r, a});
            }
        }
        return f5387r;
    }

    /* renamed from: a */
    public final C1842t mo6168a() {
        return m7766a(this);
    }

    /* renamed from: a */
    public final void mo6169a(Bundle bundle) {
        this.f5395h = bundle;
    }

    /* renamed from: a */
    public final void mo6170a(C1802e eVar) {
        if (C1787m.m7737a(C1845w.GRAPH_API_DEBUG_INFO) || C1787m.m7737a(C1845w.GRAPH_API_DEBUG_WARNING)) {
            this.f5396i = new C1798a(this, eVar);
        } else {
            this.f5396i = eVar;
        }
    }

    /* renamed from: a */
    public final void mo6171a(C1843u uVar) {
        if (this.f5397j == null || uVar == C1843u.GET) {
            if (uVar == null) {
                uVar = C1843u.GET;
            }
            this.f5389b = uVar;
            return;
        }
        throw new C1631i("Can't change HTTP method on request with overridden URL.");
    }

    /* renamed from: a */
    public final void mo6172a(Object obj) {
        this.f5398k = obj;
    }

    /* renamed from: a */
    public final void mo6173a(JSONObject jSONObject) {
        this.f5391d = jSONObject;
    }

    /* renamed from: a */
    public final void mo6174a(boolean z) {
        this.f5400m = z;
    }

    /* renamed from: b */
    public final C1808r mo6175b() {
        return m7786b(this);
    }

    /* renamed from: c */
    public final C1499a mo6176c() {
        return this.f5388a;
    }

    /* renamed from: d */
    public final C1802e mo6177d() {
        return this.f5396i;
    }

    /* renamed from: e */
    public final JSONObject mo6178e() {
        return this.f5391d;
    }

    /* renamed from: f */
    public final String mo6179f() {
        return this.f5390c;
    }

    /* renamed from: g */
    public final C1843u mo6180g() {
        return this.f5389b;
    }

    /* renamed from: h */
    public final Bundle mo6181h() {
        return this.f5395h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final String mo6182i() {
        if (this.f5397j == null) {
            String format = String.format("%s/%s", new Object[]{C1696t.m7349c(), m7800o()});
            m7799n();
            Uri parse = Uri.parse(m7767a(format, Boolean.valueOf(true)));
            return String.format("%s?%s", new Object[]{parse.getPath(), parse.getQuery()});
        }
        throw new C1631i("Can't override URL for a batch request");
    }

    /* renamed from: j */
    public final Object mo6183j() {
        return this.f5398k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final String mo6184k() {
        String str;
        String str2 = this.f5397j;
        if (str2 != null) {
            return str2.toString();
        }
        if (mo6180g() == C1843u.POST) {
            String str3 = this.f5390c;
            if (str3 != null && str3.endsWith("/videos")) {
                str = C1696t.m7350d();
                String format = String.format("%s/%s", new Object[]{str, m7800o()});
                m7799n();
                return m7767a(format, Boolean.valueOf(false));
            }
        }
        str = C1696t.m7349c();
        String format2 = String.format("%s/%s", new Object[]{str, m7800o()});
        m7799n();
        return m7767a(format2, Boolean.valueOf(false));
    }

    /* renamed from: l */
    public final String mo6185l() {
        return this.f5399l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.f5388a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f5390c);
        sb.append(", graphObject: ");
        sb.append(this.f5391d);
        sb.append(", httpMethod: ");
        sb.append(this.f5389b);
        sb.append(", parameters: ");
        sb.append(this.f5395h);
        sb.append("}");
        return sb.toString();
    }
}
