package p071f.p139v;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: f.v.a0 */
class C3562a0 implements C3564b0 {

    /* renamed from: a */
    private final ViewOverlay f10031a;

    C3562a0(View view) {
        this.f10031a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo11275a(Drawable drawable) {
        this.f10031a.add(drawable);
    }

    /* renamed from: b */
    public void mo11276b(Drawable drawable) {
        this.f10031a.remove(drawable);
    }
}
