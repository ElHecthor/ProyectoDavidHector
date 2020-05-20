package com.bumptech.glide.p025r.p026j;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.bumptech.glide.r.j.f */
public class C1283f {
    /* renamed from: a */
    public <Z> C1286i<ImageView, Z> mo5327a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C1279b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C1281d(imageView);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unhandled class: ");
        sb.append(cls);
        sb.append(", try .as*(Class).transcode(ResourceTranscoder)");
        throw new IllegalArgumentException(sb.toString());
    }
}
