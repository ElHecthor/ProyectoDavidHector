package com.bumptech.glide.load.p011p.p012y;

import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p011p.C1055g;
import com.bumptech.glide.load.p011p.C1069n;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.load.p011p.C1071o;
import com.bumptech.glide.load.p011p.C1077r;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.p.y.f */
public class C1114f implements C1069n<URL, InputStream> {

    /* renamed from: a */
    private final C1069n<C1055g, InputStream> f3875a;

    /* renamed from: com.bumptech.glide.load.p.y.f$a */
    public static class C1115a implements C1071o<URL, InputStream> {
        /* renamed from: a */
        public C1069n<URL, InputStream> mo4574a(C1077r rVar) {
            return new C1114f(rVar.mo4967a(C1055g.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    public C1114f(C1069n<C1055g, InputStream> nVar) {
        this.f3875a = nVar;
    }

    /* renamed from: a */
    public C1070a<InputStream> mo4571a(URL url, int i, int i2, C0873i iVar) {
        return this.f3875a.mo4571a(new C1055g(url), i, i2, iVar);
    }

    /* renamed from: a */
    public boolean mo4573a(URL url) {
        return true;
    }
}
