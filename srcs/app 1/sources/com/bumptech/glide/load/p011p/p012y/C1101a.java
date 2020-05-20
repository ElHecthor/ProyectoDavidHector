package com.bumptech.glide.load.p011p.p012y;

import com.bumptech.glide.load.C0870h;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p005n.C0891j;
import com.bumptech.glide.load.p011p.C1055g;
import com.bumptech.glide.load.p011p.C1066m;
import com.bumptech.glide.load.p011p.C1069n;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.load.p011p.C1071o;
import com.bumptech.glide.load.p011p.C1077r;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.y.a */
public class C1101a implements C1069n<C1055g, InputStream> {

    /* renamed from: b */
    public static final C0870h<Integer> f3849b = C0870h.m4573a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(2500));

    /* renamed from: a */
    private final C1066m<C1055g, C1055g> f3850a;

    /* renamed from: com.bumptech.glide.load.p.y.a$a */
    public static class C1102a implements C1071o<C1055g, InputStream> {

        /* renamed from: a */
        private final C1066m<C1055g, C1055g> f3851a = new C1066m<>(500);

        /* renamed from: a */
        public C1069n<C1055g, InputStream> mo4574a(C1077r rVar) {
            return new C1101a(this.f3851a);
        }

        /* renamed from: a */
        public void mo4575a() {
        }
    }

    public C1101a(C1066m<C1055g, C1055g> mVar) {
        this.f3850a = mVar;
    }

    /* renamed from: a */
    public C1070a<InputStream> mo4571a(C1055g gVar, int i, int i2, C0873i iVar) {
        C1066m<C1055g, C1055g> mVar = this.f3850a;
        if (mVar != null) {
            C1055g gVar2 = (C1055g) mVar.mo4953a(gVar, 0, 0);
            if (gVar2 == null) {
                this.f3850a.mo4954a(gVar, 0, 0, gVar);
            } else {
                gVar = gVar2;
            }
        }
        return new C1070a<>(gVar, new C0891j(gVar, ((Integer) iVar.mo4628a(f3849b)).intValue()));
    }

    /* renamed from: a */
    public boolean mo4573a(C1055g gVar) {
        return true;
    }
}
