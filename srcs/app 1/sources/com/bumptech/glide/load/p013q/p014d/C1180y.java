package com.bumptech.glide.load.p013q.p014d;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0875k;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import com.bumptech.glide.load.p013q.p016f.C1188d;

/* renamed from: com.bumptech.glide.load.q.d.y */
public class C1180y implements C0875k<Uri, Bitmap> {

    /* renamed from: a */
    private final C1188d f3976a;

    /* renamed from: b */
    private final C0921e f3977b;

    public C1180y(C1188d dVar, C0921e eVar) {
        this.f3976a = dVar;
        this.f3977b = eVar;
    }

    /* renamed from: a */
    public C1020v<Bitmap> mo4631a(Uri uri, int i, int i2, C0873i iVar) {
        C1020v a = this.f3976a.mo4631a(uri, i, i2, iVar);
        if (a == null) {
            return null;
        }
        return C1166o.m5514a(this.f3977b, (Drawable) a.get(), i, i2);
    }

    /* renamed from: a */
    public boolean mo4632a(Uri uri, C0873i iVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
