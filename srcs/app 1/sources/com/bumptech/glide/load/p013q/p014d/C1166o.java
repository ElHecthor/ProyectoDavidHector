package com.bumptech.glide.load.p013q.p014d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import com.bumptech.glide.load.p007o.p008a0.C0922f;
import java.util.concurrent.locks.Lock;

/* renamed from: com.bumptech.glide.load.q.d.o */
final class C1166o {

    /* renamed from: a */
    private static final C0921e f3949a = new C1167a();

    /* renamed from: com.bumptech.glide.load.q.d.o$a */
    class C1167a extends C0922f {
        C1167a() {
        }

        /* renamed from: a */
        public void mo4713a(Bitmap bitmap) {
        }
    }

    /* renamed from: a */
    static C1020v<Bitmap> m5514a(C0921e eVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m5515b(eVar, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            eVar = f3949a;
        }
        return C1142e.m5424a(bitmap, eVar);
    }

    /* renamed from: b */
    private static Bitmap m5515b(C0921e eVar, Drawable drawable, int i, int i2) {
        String str = "Unable to draw ";
        String str2 = "DrawableToBitmap";
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(str2, 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(drawable);
                sb.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                Log.w(str2, sb.toString());
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock a = C1125b0.m5379a();
            a.lock();
            Bitmap a2 = eVar.mo4710a(i, i2, Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(a2);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return a2;
            } finally {
                a.unlock();
            }
        } else {
            if (Log.isLoggable(str2, 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(drawable);
                sb2.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                Log.w(str2, sb2.toString());
            }
            return null;
        }
    }
}
