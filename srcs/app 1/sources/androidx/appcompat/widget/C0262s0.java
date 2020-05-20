package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.s0 */
class C0262s0 extends C0238j0 {

    /* renamed from: b */
    private final WeakReference<Context> f1161b;

    public C0262s0(Context context, Resources resources) {
        super(resources);
        this.f1161b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f1161b.get();
        if (!(drawable == null || context == null)) {
            C0229i0.m1135a().mo1464a(context, i, drawable);
        }
        return drawable;
    }
}
