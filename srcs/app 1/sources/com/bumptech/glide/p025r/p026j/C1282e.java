package com.bumptech.glide.p025r.p026j;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.p025r.p027k.C1291b;
import com.bumptech.glide.p025r.p027k.C1291b.C1292a;

/* renamed from: com.bumptech.glide.r.j.e */
public abstract class C1282e<Z> extends C1286i<ImageView, Z> implements C1292a {

    /* renamed from: l */
    private Animatable f4270l;

    public C1282e(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: b */
    private void m6069b(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f4270l = animatable;
            animatable.start();
            return;
        }
        this.f4270l = null;
    }

    /* renamed from: c */
    private void m6070c(Z z) {
        mo5320a(z);
        m6069b(z);
    }

    /* renamed from: a */
    public void mo4587a() {
        Animatable animatable = this.f4270l;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* renamed from: a */
    public void mo5317a(Drawable drawable) {
        super.mo5317a(drawable);
        m6070c((Z) null);
        mo5326d(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5320a(Z z);

    /* renamed from: a */
    public void mo5128a(Z z, C1291b<? super Z> bVar) {
        if (bVar == null || !bVar.mo5334a(z, this)) {
            m6070c(z);
        } else {
            m6069b(z);
        }
    }

    /* renamed from: b */
    public void mo4592b() {
        Animatable animatable = this.f4270l;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: b */
    public void mo5318b(Drawable drawable) {
        super.mo5318b(drawable);
        m6070c((Z) null);
        mo5326d(drawable);
    }

    /* renamed from: c */
    public void mo5129c(Drawable drawable) {
        super.mo5129c(drawable);
        Animatable animatable = this.f4270l;
        if (animatable != null) {
            animatable.stop();
        }
        m6070c((Z) null);
        mo5326d(drawable);
    }

    /* renamed from: d */
    public void mo5326d(Drawable drawable) {
        ((ImageView) this.f4272f).setImageDrawable(drawable);
    }
}
