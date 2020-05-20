package p071f.p139v;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: f.v.v */
class C3627v implements C3628w {

    /* renamed from: a */
    private final ViewGroupOverlay f10184a;

    C3627v(ViewGroup viewGroup) {
        this.f10184a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo11275a(Drawable drawable) {
        this.f10184a.add(drawable);
    }

    /* renamed from: a */
    public void mo11406a(View view) {
        this.f10184a.add(view);
    }

    /* renamed from: b */
    public void mo11276b(Drawable drawable) {
        this.f10184a.remove(drawable);
    }

    /* renamed from: b */
    public void mo11407b(View view) {
        this.f10184a.remove(view);
    }
}
