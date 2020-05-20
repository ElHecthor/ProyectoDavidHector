package com.bumptech.glide.load.p013q.p014d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder.OnHeaderDecodedListener;
import android.graphics.ImageDecoder.Source;
import android.util.Log;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import com.bumptech.glide.load.p007o.p008a0.C0922f;
import com.bumptech.glide.load.p013q.C1116a;

/* renamed from: com.bumptech.glide.load.q.d.d */
public final class C1132d extends C1116a<Bitmap> {

    /* renamed from: b */
    private final C0921e f3904b = new C0922f();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1020v<Bitmap> mo4998a(Source source, int i, int i2, OnHeaderDecodedListener onHeaderDecodedListener) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        String str = "BitmapImageDecoder";
        if (Log.isLoggable(str, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoded [");
            sb.append(decodeBitmap.getWidth());
            String str2 = "x";
            sb.append(str2);
            sb.append(decodeBitmap.getHeight());
            sb.append("] for [");
            sb.append(i);
            sb.append(str2);
            sb.append(i2);
            sb.append("]");
            Log.v(str, sb.toString());
        }
        return new C1142e(decodeBitmap, this.f3904b);
    }
}
