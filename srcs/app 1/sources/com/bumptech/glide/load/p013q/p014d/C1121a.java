package com.bumptech.glide.load.p013q.p014d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0875k;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.p029t.C1309j;

/* renamed from: com.bumptech.glide.load.q.d.a */
public class C1121a<DataType> implements C0875k<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final C0875k<DataType, Bitmap> f3886a;

    /* renamed from: b */
    private final Resources f3887b;

    public C1121a(Resources resources, C0875k<DataType, Bitmap> kVar) {
        C1309j.m6149a(resources);
        this.f3887b = resources;
        C1309j.m6149a(kVar);
        this.f3886a = kVar;
    }

    /* renamed from: a */
    public C1020v<BitmapDrawable> mo4631a(DataType datatype, int i, int i2, C0873i iVar) {
        return C1176v.m5547a(this.f3887b, this.f3886a.mo4631a(datatype, i, i2, iVar));
    }

    /* renamed from: a */
    public boolean mo4632a(DataType datatype, C0873i iVar) {
        return this.f3886a.mo4632a(datatype, iVar);
    }
}
