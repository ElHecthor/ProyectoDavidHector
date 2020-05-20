package com.bumptech.glide.load.p011p;

import android.net.Uri;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.p.x */
public class C1099x<Data> implements C1069n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f3847b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    private final C1069n<C1055g, Data> f3848a;

    /* renamed from: com.bumptech.glide.load.p.x$a */
    public static class C1100a implements C1071o<Uri, InputStream> {
        /* renamed from: a */
        public C1069n<Uri, InputStream> mo4574a(C1077r rVar) {
            return new C1099x(rVar.mo4967a(C1055g.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    public C1099x(C1069n<C1055g, Data> nVar) {
        this.f3848a = nVar;
    }

    /* renamed from: a */
    public C1070a<Data> mo4571a(Uri uri, int i, int i2, C0873i iVar) {
        return this.f3848a.mo4571a(new C1055g(uri.toString()), i, i2, iVar);
    }

    /* renamed from: a */
    public boolean mo4573a(Uri uri) {
        return f3847b.contains(uri.getScheme());
    }
}
