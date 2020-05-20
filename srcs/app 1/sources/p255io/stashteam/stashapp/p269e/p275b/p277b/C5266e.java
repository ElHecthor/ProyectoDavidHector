package p255io.stashteam.stashapp.p269e.p275b.p277b;

import java.util.List;
import p255io.stashteam.stashapp.data.network.model.ImageApiModel;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a.C5258a;
import p255io.stashteam.stashapp.p269e.p280c.C5311p;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5887b;

/* renamed from: io.stashteam.stashapp.e.b.b.e */
public final class C5266e implements C5257a<ImageApiModel, C5311p> {
    /* renamed from: a */
    public Object mo14344a(ImageApiModel imageApiModel, C5866d<? super C5311p> dVar) {
        return new C5311p(C5887b.m22260a(imageApiModel.getHeight()), C5887b.m22260a(imageApiModel.getWidth()), imageApiModel.getUrl());
    }

    /* renamed from: a */
    public Object mo14835a(List<ImageApiModel> list, C5866d<? super List<C5311p>> dVar) {
        return C5258a.m20632a(this, list, dVar);
    }
}
