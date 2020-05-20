package com.bumptech.glide.load.p005n;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0860e;
import com.bumptech.glide.load.p005n.C0881d.C0882a;
import com.bumptech.glide.load.p011p.C1055g;
import com.bumptech.glide.p029t.C1300c;
import com.bumptech.glide.p029t.C1305f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.load.n.j */
public class C0891j implements C0881d<InputStream> {

    /* renamed from: l */
    static final C0893b f3415l = new C0892a();

    /* renamed from: f */
    private final C1055g f3416f;

    /* renamed from: g */
    private final int f3417g;

    /* renamed from: h */
    private final C0893b f3418h;

    /* renamed from: i */
    private HttpURLConnection f3419i;

    /* renamed from: j */
    private InputStream f3420j;

    /* renamed from: k */
    private volatile boolean f3421k;

    /* renamed from: com.bumptech.glide.load.n.j$a */
    private static class C0892a implements C0893b {
        C0892a() {
        }

        /* renamed from: a */
        public HttpURLConnection mo4661a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.bumptech.glide.load.n.j$b */
    interface C0893b {
        /* renamed from: a */
        HttpURLConnection mo4661a(URL url);
    }

    public C0891j(C1055g gVar, int i) {
        this(gVar, i, f3415l);
    }

    C0891j(C1055g gVar, int i, C0893b bVar) {
        this.f3416f = gVar;
        this.f3417g = i;
        this.f3418h = bVar;
    }

    /* renamed from: a */
    private InputStream m4629a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            inputStream = C1300c.m6128a(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            String str = "HttpUrlFetcher";
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got non empty content encoding: ");
                sb.append(httpURLConnection.getContentEncoding());
                Log.d(str, sb.toString());
            }
            inputStream = httpURLConnection.getInputStream();
        }
        this.f3420j = inputStream;
        return this.f3420j;
    }

    /* renamed from: a */
    private InputStream m4630a(URL url, int i, URL url2, Map<String, String> map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new C0860e("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f3419i = this.f3418h.mo4661a(url);
            for (Entry entry : map.entrySet()) {
                this.f3419i.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            this.f3419i.setConnectTimeout(this.f3417g);
            this.f3419i.setReadTimeout(this.f3417g);
            this.f3419i.setUseCaches(false);
            this.f3419i.setDoInput(true);
            this.f3419i.setInstanceFollowRedirects(false);
            this.f3419i.connect();
            this.f3420j = this.f3419i.getInputStream();
            if (this.f3421k) {
                return null;
            }
            int responseCode = this.f3419i.getResponseCode();
            if (m4631a(responseCode)) {
                return m4629a(this.f3419i);
            }
            if (m4632b(responseCode)) {
                String headerField = this.f3419i.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    mo4567b();
                    return m4630a(url3, i + 1, url, map);
                }
                throw new C0860e("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new C0860e(responseCode);
            } else {
                throw new C0860e(this.f3419i.getResponseMessage(), responseCode);
            }
        } else {
            throw new C0860e("Too many (> 5) redirects!");
        }
    }

    /* renamed from: a */
    private static boolean m4631a(int i) {
        return i / 100 == 2;
    }

    /* renamed from: b */
    private static boolean m4632b(int i) {
        return i / 100 == 3;
    }

    /* renamed from: a */
    public Class<InputStream> mo4563a() {
        return InputStream.class;
    }

    /* renamed from: a */
    public void mo4564a(C0838g gVar, C0882a<? super InputStream> aVar) {
        StringBuilder sb;
        String str = "Finished http url fetcher fetch in ";
        String str2 = "HttpUrlFetcher";
        long a = C1305f.m6136a();
        try {
            aVar.mo4646a(m4630a(this.f3416f.mo4939d(), 0, null, this.f3416f.mo4937b()));
            if (Log.isLoggable(str2, 2)) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(C1305f.m6135a(a));
                Log.v(str2, sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Failed to load data for url", e);
            }
            aVar.mo4645a((Exception) e);
            if (Log.isLoggable(str2, 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable(str2, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(C1305f.m6135a(a));
                Log.v(str2, sb2.toString());
            }
            throw th;
        }
    }

    /* renamed from: b */
    public void mo4567b() {
        InputStream inputStream = this.f3420j;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f3419i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f3419i = null;
    }

    /* renamed from: c */
    public C0856a mo4568c() {
        return C0856a.REMOTE;
    }

    public void cancel() {
        this.f3421k = true;
    }
}
