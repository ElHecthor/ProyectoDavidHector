package com.bumptech.glide.load.p013q.p014d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0875k;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.p029t.C1310k;

/* renamed from: com.bumptech.glide.load.q.d.c0 */
public final class C1130c0 implements C0875k<Bitmap, Bitmap> {

    /* renamed from: com.bumptech.glide.load.q.d.c0$a */
    private static final class C1131a implements C1020v<Bitmap> {

        /* renamed from: f */
        private final Bitmap f3903f;

        C1131a(Bitmap bitmap) {
            this.f3903f = bitmap;
        }

        /* renamed from: b */
        public int mo4880b() {
            return C1310k.m6159a(this.f3903f);
        }

        /* renamed from: c */
        public Class<Bitmap> mo4881c() {
            return Bitmap.class;
        }

        /* renamed from: d */
        public void mo4882d() {
        }

        public Bitmap get() {
            return this.f3903f;
        }
    }

    /* renamed from: a */
    public C1020v<Bitmap> mo4631a(Bitmap bitmap, int i, int i2, C0873i iVar) {
        return new C1131a(bitmap);
    }

    /* renamed from: a */
    public boolean mo4632a(Bitmap bitmap, C0873i iVar) {
        return true;
    }
}
