package com.bumptech.glide.load.p013q.p019i;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p013q.p015e.C1184b;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bumptech.glide.load.q.i.a */
public class C1209a implements C1213e<Bitmap, byte[]> {

    /* renamed from: a */
    private final CompressFormat f4037a;

    /* renamed from: b */
    private final int f4038b;

    public C1209a() {
        this(CompressFormat.JPEG, 100);
    }

    public C1209a(CompressFormat compressFormat, int i) {
        this.f4037a = compressFormat;
        this.f4038b = i;
    }

    /* renamed from: a */
    public C1020v<byte[]> mo5137a(C1020v<Bitmap> vVar, C0873i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) vVar.get()).compress(this.f4037a, this.f4038b, byteArrayOutputStream);
        vVar.mo4882d();
        return new C1184b(byteArrayOutputStream.toByteArray());
    }
}
