package com.bumptech.glide.load.p011p.p012y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p005n.p006p.C0903b;
import com.bumptech.glide.load.p005n.p006p.C0904c;
import com.bumptech.glide.load.p011p.C1069n;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.load.p011p.C1071o;
import com.bumptech.glide.load.p011p.C1077r;
import com.bumptech.glide.p028s.C1295b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.y.c */
public class C1105c implements C1069n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f3854a;

    /* renamed from: com.bumptech.glide.load.p.y.c$a */
    public static class C1106a implements C1071o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f3855a;

        public C1106a(Context context) {
            this.f3855a = context;
        }

        /* renamed from: a */
        public C1069n<Uri, InputStream> mo4574a(C1077r rVar) {
            return new C1105c(this.f3855a);
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    public C1105c(Context context) {
        this.f3854a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C1070a<InputStream> mo4571a(Uri uri, int i, int i2, C0873i iVar) {
        if (C0903b.m4674a(i, i2)) {
            return new C1070a<>(new C1295b(uri), C0904c.m4679a(this.f3854a, uri));
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo4573a(Uri uri) {
        return C0903b.m4675a(uri);
    }
}
