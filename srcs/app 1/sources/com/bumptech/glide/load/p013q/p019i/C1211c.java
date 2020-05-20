package com.bumptech.glide.load.p013q.p019i;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import com.bumptech.glide.load.p013q.p014d.C1142e;
import com.bumptech.glide.load.p013q.p018h.C1196c;

/* renamed from: com.bumptech.glide.load.q.i.c */
public final class C1211c implements C1213e<Drawable, byte[]> {

    /* renamed from: a */
    private final C0921e f4040a;

    /* renamed from: b */
    private final C1213e<Bitmap, byte[]> f4041b;

    /* renamed from: c */
    private final C1213e<C1196c, byte[]> f4042c;

    public C1211c(C0921e eVar, C1213e<Bitmap, byte[]> eVar2, C1213e<C1196c, byte[]> eVar3) {
        this.f4040a = eVar;
        this.f4041b = eVar2;
        this.f4042c = eVar3;
    }

    /* renamed from: a */
    private static C1020v<C1196c> m5676a(C1020v<Drawable> vVar) {
        return vVar;
    }

    /* renamed from: a */
    public C1020v<byte[]> mo5137a(C1020v<Drawable> vVar, C0873i iVar) {
        Drawable drawable = (Drawable) vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f4041b.mo5137a(C1142e.m5424a(((BitmapDrawable) drawable).getBitmap(), this.f4040a), iVar);
        }
        if (!(drawable instanceof C1196c)) {
            return null;
        }
        C1213e<C1196c, byte[]> eVar = this.f4042c;
        m5676a(vVar);
        return eVar.mo5137a(vVar, iVar);
    }
}
