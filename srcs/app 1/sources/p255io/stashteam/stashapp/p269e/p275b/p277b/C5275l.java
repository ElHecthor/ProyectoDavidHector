package p255io.stashteam.stashapp.p269e.p275b.p277b;

import java.util.List;
import p255io.stashteam.stashapp.data.network.model.VideoApiModel;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a.C5258a;
import p255io.stashteam.stashapp.p269e.p280c.C5296e0;
import p308k.p316w.C5866d;

/* renamed from: io.stashteam.stashapp.e.b.b.l */
public final class C5275l implements C5257a<VideoApiModel, C5296e0> {
    /* renamed from: a */
    public Object mo14344a(VideoApiModel videoApiModel, C5866d<? super C5296e0> dVar) {
        return new C5296e0(videoApiModel.getName(), videoApiModel.getVideoId());
    }

    /* renamed from: a */
    public Object mo14847a(List<VideoApiModel> list, C5866d<? super List<C5296e0>> dVar) {
        return C5258a.m20632a(this, list, dVar);
    }
}
