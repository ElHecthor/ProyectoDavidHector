package com.bumptech.glide.load.p013q.p016f;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import com.bumptech.glide.load.p007o.C1015r;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p013q.p018h.C1196c;
import com.bumptech.glide.p029t.C1309j;

/* renamed from: com.bumptech.glide.load.q.f.b */
public abstract class C1186b<T extends Drawable> implements C1020v<T>, C1015r {

    /* renamed from: f */
    protected final T f3983f;

    public C1186b(T t) {
        C1309j.m6149a(t);
        this.f3983f = (Drawable) t;
    }

    /* renamed from: a */
    public void mo4902a() {
        Bitmap c;
        T t = this.f3983f;
        if (t instanceof BitmapDrawable) {
            c = ((BitmapDrawable) t).getBitmap();
        } else if (t instanceof C1196c) {
            c = ((C1196c) t).mo5093c();
        } else {
            return;
        }
        c.prepareToDraw();
    }

    public final T get() {
        ConstantState constantState = this.f3983f.getConstantState();
        return constantState == null ? this.f3983f : constantState.newDrawable();
    }
}
