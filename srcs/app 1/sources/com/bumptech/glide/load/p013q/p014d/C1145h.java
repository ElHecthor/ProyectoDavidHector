package com.bumptech.glide.load.p013q.p014d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0875k;
import com.bumptech.glide.load.p007o.C1020v;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.q.d.h */
public final class C1145h implements C0875k<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C1132d f3917a = new C1132d();

    /* renamed from: a */
    public C1020v<Bitmap> mo4631a(ByteBuffer byteBuffer, int i, int i2, C0873i iVar) {
        return this.f3917a.mo4631a(ImageDecoder.createSource(byteBuffer), i, i2, iVar);
    }

    /* renamed from: a */
    public boolean mo4632a(ByteBuffer byteBuffer, C0873i iVar) {
        return true;
    }
}
