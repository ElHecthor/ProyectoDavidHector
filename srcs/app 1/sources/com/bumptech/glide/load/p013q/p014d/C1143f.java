package com.bumptech.glide.load.p013q.p014d;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C0832c;
import com.bumptech.glide.load.C0877m;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import com.bumptech.glide.p029t.C1310k;

/* renamed from: com.bumptech.glide.load.q.d.f */
public abstract class C1143f implements C0877m<Bitmap> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bitmap mo5028a(C0921e eVar, Bitmap bitmap, int i, int i2);

    /* renamed from: a */
    public final C1020v<Bitmap> mo4634a(Context context, C1020v<Bitmap> vVar, int i, int i2) {
        if (C1310k.m6170b(i, i2)) {
            C0921e c = C0832c.m4445a(context).mo4521c();
            Bitmap bitmap = (Bitmap) vVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a = mo5028a(c, bitmap, i, i2);
            return bitmap.equals(a) ? vVar : C1142e.m5424a(a, c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot apply transformation on width: ");
        sb.append(i);
        sb.append(" or height: ");
        sb.append(i2);
        sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
        throw new IllegalArgumentException(sb.toString());
    }
}
