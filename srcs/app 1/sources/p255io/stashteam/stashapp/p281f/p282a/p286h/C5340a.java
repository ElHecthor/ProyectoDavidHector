package p255io.stashteam.stashapp.p281f.p282a.p286h;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C2585e;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.a.h.a */
public final class C5340a extends C2585e {

    /* renamed from: a */
    private final C5907a<C5812t> f14031a;

    public C5340a(C5907a<C5812t> aVar) {
        C5942k.m22327b(aVar, "onClose");
        this.f14031a = aVar;
    }

    /* renamed from: a */
    public void mo8128a(View view, float f) {
        C5942k.m22327b(view, "bottomSheet");
    }

    /* renamed from: a */
    public void mo8129a(View view, int i) {
        C5942k.m22327b(view, "bottomSheet");
        if (5 == i) {
            this.f14031a.invoke();
        }
    }
}
