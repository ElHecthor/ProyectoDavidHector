package com.bumptech.glide.load.p013q.p014d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C0832c;
import com.bumptech.glide.load.C0877m;
import com.bumptech.glide.load.p007o.C1020v;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.q.d.p */
public class C1168p implements C0877m<Drawable> {

    /* renamed from: b */
    private final C0877m<Bitmap> f3950b;

    /* renamed from: c */
    private final boolean f3951c;

    public C1168p(C0877m<Bitmap> mVar, boolean z) {
        this.f3950b = mVar;
        this.f3951c = z;
    }

    /* renamed from: a */
    private C1020v<Drawable> m5517a(Context context, C1020v<Bitmap> vVar) {
        return C1176v.m5547a(context.getResources(), vVar);
    }

    /* renamed from: a */
    public C0877m<BitmapDrawable> mo5049a() {
        return this;
    }

    /* renamed from: a */
    public C1020v<Drawable> mo4634a(Context context, C1020v<Drawable> vVar, int i, int i2) {
        Drawable drawable = (Drawable) vVar.get();
        C1020v a = C1166o.m5514a(C0832c.m4445a(context).mo4521c(), drawable, i, i2);
        if (a != null) {
            C1020v a2 = this.f3950b.mo4634a(context, a, i, i2);
            if (!a2.equals(a)) {
                return m5517a(context, a2);
            }
            a2.mo4882d();
            return vVar;
        } else if (!this.f3951c) {
            return vVar;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to convert ");
            sb.append(drawable);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo4618a(MessageDigest messageDigest) {
        this.f3950b.mo4618a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1168p)) {
            return false;
        }
        return this.f3950b.equals(((C1168p) obj).f3950b);
    }

    public int hashCode() {
        return this.f3950b.hashCode();
    }
}
