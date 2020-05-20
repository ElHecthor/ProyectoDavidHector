package com.bumptech.glide.load.p011p;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.p029t.C1309j;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.p.g */
public class C1055g implements C0869g {

    /* renamed from: b */
    private final C1056h f3782b;

    /* renamed from: c */
    private final URL f3783c;

    /* renamed from: d */
    private final String f3784d;

    /* renamed from: e */
    private String f3785e;

    /* renamed from: f */
    private URL f3786f;

    /* renamed from: g */
    private volatile byte[] f3787g;

    /* renamed from: h */
    private int f3788h;

    public C1055g(String str) {
        this(str, C1056h.f3789a);
    }

    public C1055g(String str, C1056h hVar) {
        this.f3783c = null;
        C1309j.m6151a(str);
        this.f3784d = str;
        C1309j.m6149a(hVar);
        this.f3782b = hVar;
    }

    public C1055g(URL url) {
        this(url, C1056h.f3789a);
    }

    public C1055g(URL url, C1056h hVar) {
        C1309j.m6149a(url);
        this.f3783c = url;
        this.f3784d = null;
        C1309j.m6149a(hVar);
        this.f3782b = hVar;
    }

    /* renamed from: e */
    private byte[] m5176e() {
        if (this.f3787g == null) {
            this.f3787g = mo4936a().getBytes(C0869g.f3390a);
        }
        return this.f3787g;
    }

    /* renamed from: f */
    private String m5177f() {
        if (TextUtils.isEmpty(this.f3785e)) {
            String str = this.f3784d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.f3783c;
                C1309j.m6149a(url);
                str = url.toString();
            }
            this.f3785e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f3785e;
    }

    /* renamed from: g */
    private URL m5178g() {
        if (this.f3786f == null) {
            this.f3786f = new URL(m5177f());
        }
        return this.f3786f;
    }

    /* renamed from: a */
    public String mo4936a() {
        String str = this.f3784d;
        if (str != null) {
            return str;
        }
        URL url = this.f3783c;
        C1309j.m6149a(url);
        return url.toString();
    }

    /* renamed from: a */
    public void mo4618a(MessageDigest messageDigest) {
        messageDigest.update(m5176e());
    }

    /* renamed from: b */
    public Map<String, String> mo4937b() {
        return this.f3782b.mo4941a();
    }

    /* renamed from: c */
    public String mo4938c() {
        return m5177f();
    }

    /* renamed from: d */
    public URL mo4939d() {
        return m5178g();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1055g)) {
            return false;
        }
        C1055g gVar = (C1055g) obj;
        return mo4936a().equals(gVar.mo4936a()) && this.f3782b.equals(gVar.f3782b);
    }

    public int hashCode() {
        if (this.f3788h == 0) {
            int hashCode = mo4936a().hashCode();
            this.f3788h = hashCode;
            this.f3788h = (hashCode * 31) + this.f3782b.hashCode();
        }
        return this.f3788h;
    }

    public String toString() {
        return mo4936a();
    }
}
