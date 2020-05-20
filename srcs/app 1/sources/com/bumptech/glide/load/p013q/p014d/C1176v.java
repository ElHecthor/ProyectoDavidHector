package com.bumptech.glide.load.p013q.p014d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.p007o.C1015r;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.p029t.C1309j;

/* renamed from: com.bumptech.glide.load.q.d.v */
public final class C1176v implements C1020v<BitmapDrawable>, C1015r {

    /* renamed from: f */
    private final Resources f3967f;

    /* renamed from: g */
    private final C1020v<Bitmap> f3968g;

    private C1176v(Resources resources, C1020v<Bitmap> vVar) {
        C1309j.m6149a(resources);
        this.f3967f = resources;
        C1309j.m6149a(vVar);
        this.f3968g = vVar;
    }

    /* renamed from: a */
    public static C1020v<BitmapDrawable> m5547a(Resources resources, C1020v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new C1176v(resources, vVar);
    }

    /* renamed from: a */
    public void mo4902a() {
        C1020v<Bitmap> vVar = this.f3968g;
        if (vVar instanceof C1015r) {
            ((C1015r) vVar).mo4902a();
        }
    }

    /* renamed from: b */
    public int mo4880b() {
        return this.f3968g.mo4880b();
    }

    /* renamed from: c */
    public Class<BitmapDrawable> mo4881c() {
        return BitmapDrawable.class;
    }

    /* renamed from: d */
    public void mo4882d() {
        this.f3968g.mo4882d();
    }

    public BitmapDrawable get() {
        return new BitmapDrawable(this.f3967f, (Bitmap) this.f3968g.get());
    }
}
