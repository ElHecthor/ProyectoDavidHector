package com.bumptech.glide.load.p013q.p016f;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.p007o.C1020v;

/* renamed from: com.bumptech.glide.load.q.f.c */
final class C1187c extends C1186b<Drawable> {
    private C1187c(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: a */
    static C1020v<Drawable> m5581a(Drawable drawable) {
        if (drawable != null) {
            return new C1187c(drawable);
        }
        return null;
    }

    /* renamed from: b */
    public int mo4880b() {
        return Math.max(1, this.f3983f.getIntrinsicWidth() * this.f3983f.getIntrinsicHeight() * 4);
    }

    /* renamed from: c */
    public Class<Drawable> mo4881c() {
        return this.f3983f.getClass();
    }

    /* renamed from: d */
    public void mo4882d() {
    }
}
