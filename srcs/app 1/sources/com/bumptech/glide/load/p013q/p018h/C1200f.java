package com.bumptech.glide.load.p013q.p018h;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C0832c;
import com.bumptech.glide.load.C0877m;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p013q.p014d.C1142e;
import com.bumptech.glide.p029t.C1309j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.q.h.f */
public class C1200f implements C0877m<C1196c> {

    /* renamed from: b */
    private final C0877m<Bitmap> f4007b;

    public C1200f(C0877m<Bitmap> mVar) {
        C1309j.m6149a(mVar);
        this.f4007b = mVar;
    }

    /* renamed from: a */
    public C1020v<C1196c> mo4634a(Context context, C1020v<C1196c> vVar, int i, int i2) {
        C1196c cVar = (C1196c) vVar.get();
        C1142e eVar = new C1142e(cVar.mo5093c(), C0832c.m4445a(context).mo4521c());
        C1020v a = this.f4007b.mo4634a(context, eVar, i, i2);
        if (!eVar.equals(a)) {
            eVar.mo4882d();
        }
        cVar.mo5091a(this.f4007b, (Bitmap) a.get());
        return vVar;
    }

    /* renamed from: a */
    public void mo4618a(MessageDigest messageDigest) {
        this.f4007b.mo4618a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1200f)) {
            return false;
        }
        return this.f4007b.equals(((C1200f) obj).f4007b);
    }

    public int hashCode() {
        return this.f4007b.hashCode();
    }
}
