package com.bumptech.glide.load.p013q.p014d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p007o.C1015r;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import com.bumptech.glide.p029t.C1309j;
import com.bumptech.glide.p029t.C1310k;

/* renamed from: com.bumptech.glide.load.q.d.e */
public class C1142e implements C1020v<Bitmap>, C1015r {

    /* renamed from: f */
    private final Bitmap f3914f;

    /* renamed from: g */
    private final C0921e f3915g;

    public C1142e(Bitmap bitmap, C0921e eVar) {
        C1309j.m6150a(bitmap, "Bitmap must not be null");
        this.f3914f = bitmap;
        C1309j.m6150a(eVar, "BitmapPool must not be null");
        this.f3915g = eVar;
    }

    /* renamed from: a */
    public static C1142e m5424a(Bitmap bitmap, C0921e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new C1142e(bitmap, eVar);
    }

    /* renamed from: a */
    public void mo4902a() {
        this.f3914f.prepareToDraw();
    }

    /* renamed from: b */
    public int mo4880b() {
        return C1310k.m6159a(this.f3914f);
    }

    /* renamed from: c */
    public Class<Bitmap> mo4881c() {
        return Bitmap.class;
    }

    /* renamed from: d */
    public void mo4882d() {
        this.f3915g.mo4713a(this.f3914f);
    }

    public Bitmap get() {
        return this.f3914f;
    }
}
