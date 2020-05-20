package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.datatransport.cct.p047b.C1852a;
import com.google.android.datatransport.cct.p047b.C1852a.C1853a;
import com.google.android.datatransport.cct.p047b.C1854b;
import com.google.android.datatransport.cct.p047b.C1873k;
import com.google.android.datatransport.cct.p047b.C1875m;
import com.google.android.datatransport.cct.p047b.C1875m.C1876a;
import com.google.android.datatransport.cct.p047b.C1875m.C1877b;
import com.google.android.datatransport.cct.p047b.C1879o;
import com.google.android.datatransport.cct.p047b.C1880p;
import com.google.android.datatransport.cct.p047b.C1880p.C1881a;
import com.google.android.datatransport.cct.p047b.C1883r;
import com.google.android.datatransport.cct.p047b.C1883r.C1884a;
import com.google.android.datatransport.cct.p047b.C1886t;
import com.google.android.datatransport.cct.p047b.C1887u;
import com.google.android.datatransport.cct.p047b.C1887u.C1888a;
import com.google.android.datatransport.cct.p047b.C1887u.C1889b;
import com.google.android.datatransport.cct.p047b.C1887u.C1890c;
import com.google.android.datatransport.runtime.backends.C1905f;
import com.google.android.datatransport.runtime.backends.C1907g;
import com.google.android.datatransport.runtime.backends.C1915m;
import com.google.firebase.p057e.C2903a;
import com.google.firebase.p057e.C2904b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p147g.p156d.p157a.p158a.C3739b;
import p147g.p156d.p157a.p158a.p159i.C3760g;
import p147g.p156d.p157a.p158a.p159i.C3761h;
import p147g.p156d.p157a.p158a.p159i.C3761h.C3762a;
import p147g.p156d.p157a.p158a.p159i.p160t.C3777a;
import p147g.p156d.p157a.p158a.p159i.p161u.C3779b;
import p147g.p156d.p157a.p158a.p159i.p165x.C3833a;

/* renamed from: com.google.android.datatransport.cct.e */
final class C1894e implements C1915m {

    /* renamed from: a */
    private final C2903a f5605a = C1879o.m8035a();

    /* renamed from: b */
    private final ConnectivityManager f5606b;

    /* renamed from: c */
    final URL f5607c;

    /* renamed from: d */
    private final C3833a f5608d;

    /* renamed from: e */
    private final C3833a f5609e;

    /* renamed from: f */
    private final int f5610f;

    /* renamed from: com.google.android.datatransport.cct.e$a */
    static final class C1895a {

        /* renamed from: a */
        final URL f5611a;

        /* renamed from: b */
        final C1873k f5612b;

        /* renamed from: c */
        final String f5613c;

        C1895a(URL url, C1873k kVar, String str) {
            this.f5611a = url;
            this.f5612b = kVar;
            this.f5613c = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1895a mo6403a(URL url) {
            return new C1895a(url, this.f5612b, this.f5613c);
        }
    }

    /* renamed from: com.google.android.datatransport.cct.e$b */
    static final class C1896b {

        /* renamed from: a */
        final int f5614a;

        /* renamed from: b */
        final URL f5615b;

        /* renamed from: c */
        final long f5616c;

        C1896b(int i, URL url, long j) {
            this.f5614a = i;
            this.f5615b = url;
            this.f5616c = j;
        }
    }

    C1894e(Context context, C3833a aVar, C3833a aVar2) {
        this.f5606b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5607c = m8080a(C1851a.f5489c);
        this.f5608d = aVar2;
        this.f5609e = aVar;
        this.f5610f = 40000;
    }

    /* renamed from: a */
    static /* synthetic */ C1895a m8077a(C1895a aVar, C1896b bVar) {
        URL url = bVar.f5615b;
        if (url == null) {
            return null;
        }
        C3777a.m15416a("CctTransportBackend", "Following redirect to: %s", (Object) url);
        return aVar.mo6403a(bVar.f5615b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C1896b m8078a(C1895a aVar) {
        GZIPOutputStream gZIPOutputStream;
        InputStream inputStream;
        String str = "CctTransportBackend";
        C3777a.m15416a(str, "Making request to: %s", (Object) aVar.f5611a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f5611a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f5610f);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"2.2.0"}));
        String str2 = "gzip";
        String str3 = "Content-Encoding";
        httpURLConnection.setRequestProperty(str3, str2);
        String str4 = "Content-Type";
        httpURLConnection.setRequestProperty(str4, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", str2);
        String str5 = aVar.f5613c;
        if (str5 != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str5);
        }
        WritableByteChannel newChannel = Channels.newChannel(httpURLConnection.getOutputStream());
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                this.f5605a.mo9585a(aVar.f5612b, new OutputStreamWriter(gZIPOutputStream));
                gZIPOutputStream.close();
                newChannel.write(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
                int responseCode = httpURLConnection.getResponseCode();
                StringBuilder sb = new StringBuilder();
                sb.append("Status Code: ");
                sb.append(responseCode);
                C3777a.m15415a(str, sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Content-Type: ");
                sb2.append(httpURLConnection.getHeaderField(str4));
                C3777a.m15415a(str, sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Content-Encoding: ");
                sb3.append(httpURLConnection.getHeaderField(str3));
                C3777a.m15415a(str, sb3.toString());
                if (!(responseCode == 302 || responseCode == 301)) {
                    if (responseCode != 307) {
                        if (responseCode != 200) {
                            C1896b bVar = new C1896b(responseCode, null, 0);
                            newChannel.close();
                            return bVar;
                        }
                        String headerField = httpURLConnection.getHeaderField(str3);
                        inputStream = (headerField == null || !headerField.equals(str2)) ? httpURLConnection.getInputStream() : new GZIPInputStream(httpURLConnection.getInputStream());
                        C1896b bVar2 = new C1896b(responseCode, null, C1886t.m8062a(new InputStreamReader(inputStream)).mo6383a());
                        inputStream.close();
                        newChannel.close();
                        return bVar2;
                    }
                }
                C1896b bVar3 = new C1896b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                newChannel.close();
                return bVar3;
            } catch (C2904b | IOException e) {
                C3777a.m15417a(str, "Couldn't encode request, returning with 400", e);
                C1896b bVar4 = new C1896b(400, null, 0);
                gZIPOutputStream.close();
                newChannel.close();
                return bVar4;
            }
        } catch (Throwable th) {
            newChannel.close();
            throw th;
        }
    }

    /* renamed from: a */
    private static URL m8080a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid url: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public C1907g mo6401a(C1905f fVar) {
        String str;
        C1881a aVar;
        HashMap hashMap = new HashMap();
        for (C3761h hVar : fVar.mo6405a()) {
            String f = hVar.mo11902f();
            if (!hashMap.containsKey(f)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(hVar);
                hashMap.put(f, arrayList);
            } else {
                ((List) hashMap.get(f)).add(hVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            str = "CctTransportBackend";
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            C3761h hVar2 = (C3761h) ((List) entry.getValue()).get(0);
            C1884a a = C1883r.m8050a();
            a.mo6377a(C1854b.DEFAULT);
            a.mo6376a(this.f5609e.mo12001a());
            a.mo6382b(this.f5608d.mo12001a());
            C1876a a2 = C1875m.m8030a();
            a2.mo6346a(C1877b.ANDROID);
            C1853a a3 = C1852a.m7958a();
            a3.mo6315a(hVar2.mo11947b("sdk-version"));
            a3.mo6321e(hVar2.mo11946a("model"));
            a3.mo6319c(hVar2.mo11946a("hardware"));
            a3.mo6316a(hVar2.mo11946a("device"));
            a3.mo6323g(hVar2.mo11946a("product"));
            a3.mo6322f(hVar2.mo11946a("os-uild"));
            a3.mo6320d(hVar2.mo11946a("manufacturer"));
            a3.mo6318b(hVar2.mo11946a("fingerprint"));
            a2.mo6345a(a3.mo6317a());
            a.mo6378a(a2.mo6347a());
            try {
                a.mo6395b(Integer.valueOf((String) entry.getKey()).intValue());
            } catch (NumberFormatException unused) {
                a.mo6396b((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (C3761h hVar3 : (List) entry.getValue()) {
                C3760g c = hVar3.mo11899c();
                C3739b b = c.mo11942b();
                if (b.equals(C3739b.m15293a("proto"))) {
                    aVar = C1880p.m8037a(c.mo11941a());
                } else if (b.equals(C3739b.m15293a("json"))) {
                    aVar = C1880p.m8036a(new String(c.mo11941a(), Charset.forName("UTF-8")));
                } else {
                    C3777a.m15419b(str, "Received event of unsupported encoding %s. Skipping...", b);
                }
                aVar.mo6359a(hVar3.mo11900d());
                aVar.mo6364b(hVar3.mo11903g());
                aVar.mo6365c(hVar3.mo11948c("tz-offset"));
                C1888a a4 = C1887u.m8064a();
                a4.mo6393a(C1890c.m8070a(hVar3.mo11947b("net-type")));
                a4.mo6392a(C1889b.m8068a(hVar3.mo11947b("mobile-subtype")));
                aVar.mo6360a(a4.mo6394a());
                if (hVar3.mo11898b() != null) {
                    aVar.mo6358a(hVar3.mo11898b().intValue());
                }
                arrayList3.add(aVar.mo6363a());
            }
            a.mo6380a((List<C1880p>) arrayList3);
            arrayList2.add(a.mo6381a());
        }
        C1873k a5 = C1873k.m8027a(arrayList2);
        String str2 = null;
        URL url = this.f5607c;
        if (fVar.mo6406b() != null) {
            try {
                C1851a a6 = C1851a.m7951a(fVar.mo6406b());
                if (a6.mo6313e() != null) {
                    str2 = a6.mo6313e();
                }
                if (a6.mo6314f() != null) {
                    url = m8080a(a6.mo6314f());
                }
            } catch (IllegalArgumentException unused2) {
                return C1907g.m8104c();
            }
        }
        try {
            C1896b bVar = (C1896b) C3779b.m15421a(5, new C1895a(url, a5, str2), C1892c.m8073a(this), C1893d.m8075a());
            if (bVar.f5614a == 200) {
                return C1907g.m8103a(bVar.f5616c);
            }
            int i = bVar.f5614a;
            if (i < 500) {
                if (i != 404) {
                    return C1907g.m8104c();
                }
            }
            return C1907g.m8105d();
        } catch (IOException e) {
            C3777a.m15417a(str, "Could not make request to the backend", (Throwable) e);
            return C1907g.m8105d();
        }
    }

    /* renamed from: a */
    public C3761h mo6402a(C3761h hVar) {
        int i;
        C1889b bVar;
        NetworkInfo activeNetworkInfo = this.f5606b.getActiveNetworkInfo();
        C3762a h = hVar.mo11950h();
        h.mo11951a("sdk-version", VERSION.SDK_INT);
        h.mo11953a("model", Build.MODEL);
        h.mo11953a("hardware", Build.HARDWARE);
        h.mo11953a("device", Build.DEVICE);
        h.mo11953a("product", Build.PRODUCT);
        h.mo11953a("os-uild", Build.ID);
        h.mo11953a("manufacturer", Build.MANUFACTURER);
        h.mo11953a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        h.mo11952a("tz-offset", (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        h.mo11951a("net-type", activeNetworkInfo == null ? C1890c.NONE.mo6398a() : activeNetworkInfo.getType());
        if (activeNetworkInfo == null) {
            bVar = C1889b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            i = activeNetworkInfo.getSubtype();
            if (i == -1) {
                bVar = C1889b.COMBINED;
            } else {
                if (C1889b.m8068a(i) == null) {
                    i = 0;
                }
                h.mo11951a("mobile-subtype", i);
                return h.mo11911a();
            }
        }
        i = bVar.mo6397a();
        h.mo11951a("mobile-subtype", i);
        return h.mo11911a();
    }
}
