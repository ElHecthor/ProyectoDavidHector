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
import com.bumptech.glide.load.p013q.p014d.C1133d0;
import com.bumptech.glide.p028s.C1295b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.y.d */
public class C1107d implements C1069n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f3856a;

    /* renamed from: com.bumptech.glide.load.p.y.d$a */
    public static class C1108a implements C1071o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f3857a;

        public C1108a(Context context) {
            this.f3857a = context;
        }

        /* renamed from: a */
        public C1069n<Uri, InputStream> mo4574a(C1077r rVar) {
            return new C1107d(this.f3857a);
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    public C1107d(Context context) {
        this.f3856a = context.getApplicationContext();
    }

    /* renamed from: a */
    private boolean m5324a(C0873i iVar) {
        Long l = (Long) iVar.mo4628a(C1133d0.f3905d);
        return l != null && l.longValue() == -1;
    }

    /* renamed from: a */
    public C1070a<InputStream> mo4571a(Uri uri, int i, int i2, C0873i iVar) {
        if (!C0903b.m4674a(i, i2) || !m5324a(iVar)) {
            return null;
        }
        return new C1070a<>(new C1295b(uri), C0904c.m4681b(this.f3856a, uri));
    }

    /* renamed from: a */
    public boolean mo4573a(Uri uri) {
        return C0903b.m4677c(uri);
    }
}
