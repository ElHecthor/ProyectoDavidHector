package p255io.stashteam.stashapp.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C0832c;
import com.bumptech.glide.C0852k;
import com.bumptech.glide.p022o.C1241h;
import com.bumptech.glide.p022o.C1249m;
import com.bumptech.glide.p025r.C1267a;
import com.bumptech.glide.p025r.C1273f;

/* renamed from: io.stashteam.stashapp.utils.e */
public class C5692e extends C0852k {
    public C5692e(C0832c cVar, C1241h hVar, C1249m mVar, Context context) {
        super(cVar, hVar, mVar, context);
    }

    /* renamed from: a */
    public <ResourceType> C5691d<ResourceType> m21769a(Class<ResourceType> cls) {
        return new C5691d<>(this.f3351f, this, cls, this.f3352g);
    }

    /* renamed from: a */
    public C5691d<Drawable> m21770a(String str) {
        return (C5691d) super.mo4586a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4588a(C1273f fVar) {
        if (!(fVar instanceof C5690c)) {
            fVar = new C5690c().mo4577a((C1267a) fVar);
        }
        super.mo4588a(fVar);
    }

    /* renamed from: e */
    public C5691d<Bitmap> m21773e() {
        return (C5691d) super.mo4595e();
    }

    /* renamed from: f */
    public C5691d<Drawable> m21775f() {
        return (C5691d) super.mo4596f();
    }
}
