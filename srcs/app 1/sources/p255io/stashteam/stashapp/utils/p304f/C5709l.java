package p255io.stashteam.stashapp.utils.p304f;

import android.content.res.Resources;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.utils.f.l */
public final class C5709l {
    /* renamed from: a */
    public static final int m21806a(int i) {
        float f = (float) i;
        Resources system = Resources.getSystem();
        C5942k.m22324a((Object) system, "Resources.getSystem()");
        return (int) (f * system.getDisplayMetrics().density);
    }
}
