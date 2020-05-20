package com.bumptech.glide.load.p013q.p014d;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C0858c;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0876l;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import java.io.File;

/* renamed from: com.bumptech.glide.load.q.d.b */
public class C1124b implements C0876l<BitmapDrawable> {

    /* renamed from: a */
    private final C0921e f3892a;

    /* renamed from: b */
    private final C0876l<Bitmap> f3893b;

    public C1124b(C0921e eVar, C0876l<Bitmap> lVar) {
        this.f3892a = eVar;
        this.f3893b = lVar;
    }

    /* renamed from: a */
    public C0858c mo4633a(C0873i iVar) {
        return this.f3893b.mo4633a(iVar);
    }

    /* renamed from: a */
    public boolean mo4615a(C1020v<BitmapDrawable> vVar, File file, C0873i iVar) {
        return this.f3893b.mo4615a(new C1142e(((BitmapDrawable) vVar.get()).getBitmap(), this.f3892a), file, iVar);
    }
}
