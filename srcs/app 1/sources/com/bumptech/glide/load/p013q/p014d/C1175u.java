package com.bumptech.glide.load.p013q.p014d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0875k;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.p029t.C1296a;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.q.d.u */
public final class C1175u implements C0875k<InputStream, Bitmap> {

    /* renamed from: a */
    private final C1132d f3966a = new C1132d();

    /* renamed from: a */
    public C1020v<Bitmap> mo4631a(InputStream inputStream, int i, int i2, C0873i iVar) {
        return this.f3966a.mo4631a(ImageDecoder.createSource(C1296a.m6120a(inputStream)), i, i2, iVar);
    }

    /* renamed from: a */
    public boolean mo4632a(InputStream inputStream, C0873i iVar) {
        return true;
    }
}
