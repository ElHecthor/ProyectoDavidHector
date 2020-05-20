package com.bumptech.glide.load.p011p.p012y;

import android.net.Uri;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p011p.C1055g;
import com.bumptech.glide.load.p011p.C1069n;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.load.p011p.C1071o;
import com.bumptech.glide.load.p011p.C1077r;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.p.y.b */
public class C1103b implements C1069n<Uri, InputStream> {

    /* renamed from: b */
    private static final Set<String> f3852b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    private final C1069n<C1055g, InputStream> f3853a;

    /* renamed from: com.bumptech.glide.load.p.y.b$a */
    public static class C1104a implements C1071o<Uri, InputStream> {
        /* renamed from: a */
        public C1069n<Uri, InputStream> mo4574a(C1077r rVar) {
            return new C1103b(rVar.mo4967a(C1055g.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    public C1103b(C1069n<C1055g, InputStream> nVar) {
        this.f3853a = nVar;
    }

    /* renamed from: a */
    public C1070a<InputStream> mo4571a(Uri uri, int i, int i2, C0873i iVar) {
        return this.f3853a.mo4571a(new C1055g(uri.toString()), i, i2, iVar);
    }

    /* renamed from: a */
    public boolean mo4573a(Uri uri) {
        return f3852b.contains(uri.getScheme());
    }
}
