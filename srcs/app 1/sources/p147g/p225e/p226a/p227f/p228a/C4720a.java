package p147g.p225e.p226a.p227f.p228a;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p308k.p323z.p325d.C5942k;

/* renamed from: g.e.a.f.a.a */
public final class C4720a {
    /* renamed from: a */
    public static final void m19029a(ImageView imageView, ImageView imageView2) {
        C5942k.m22327b(imageView, "$receiver");
        if (imageView2 != null) {
            Drawable drawable = imageView2.getDrawable();
            if (drawable != null && (drawable instanceof BitmapDrawable)) {
                imageView.setImageBitmap(((BitmapDrawable) drawable).getBitmap());
            }
        }
    }
}
