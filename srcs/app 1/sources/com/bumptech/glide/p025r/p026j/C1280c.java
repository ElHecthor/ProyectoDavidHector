package com.bumptech.glide.p025r.p026j;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.p025r.C1269c;
import com.bumptech.glide.p029t.C1310k;

/* renamed from: com.bumptech.glide.r.j.c */
public abstract class C1280c<T> implements C1285h<T> {

    /* renamed from: f */
    private final int f4267f;

    /* renamed from: g */
    private final int f4268g;

    /* renamed from: h */
    private C1269c f4269h;

    public C1280c() {
        this(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
    }

    public C1280c(int i, int i2) {
        if (C1310k.m6170b(i, i2)) {
            this.f4267f = i;
            this.f4268g = i2;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb.append(i);
        sb.append(" and height: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo4587a() {
    }

    /* renamed from: a */
    public void mo5317a(Drawable drawable) {
    }

    /* renamed from: a */
    public final void mo5321a(C1269c cVar) {
        this.f4269h = cVar;
    }

    /* renamed from: a */
    public final void mo5322a(C1284g gVar) {
    }

    /* renamed from: b */
    public void mo4592b() {
    }

    /* renamed from: b */
    public void mo5318b(Drawable drawable) {
    }

    /* renamed from: b */
    public final void mo5323b(C1284g gVar) {
        gVar.mo5315a(this.f4267f, this.f4268g);
    }

    /* renamed from: c */
    public final C1269c mo5324c() {
        return this.f4269h;
    }

    /* renamed from: d */
    public void mo4594d() {
    }
}
