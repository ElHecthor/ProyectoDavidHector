package p255io.stashteam.stashapp.data.local.p264db.p267c;

import p255io.stashteam.stashapp.data.local.p264db.p268d.C5177c;
import p255io.stashteam.stashapp.data.network.model.ImageApiModel;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5887b;

/* renamed from: io.stashteam.stashapp.data.local.db.c.c */
public final class C5168c implements C5257a<ImageApiModel, C5177c> {
    /* renamed from: a */
    public Object mo14344a(ImageApiModel imageApiModel, C5866d<? super C5177c> dVar) {
        C5177c cVar = new C5177c(imageApiModel.getId(), imageApiModel.getAlphaChannel(), imageApiModel.getAnimated(), C5887b.m22260a(imageApiModel.getHeight()), C5887b.m22260a(imageApiModel.getWidth()), imageApiModel.getImageId(), imageApiModel.getUrl());
        return cVar;
    }
}
