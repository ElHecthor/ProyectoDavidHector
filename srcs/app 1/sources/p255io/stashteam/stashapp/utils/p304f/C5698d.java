package p255io.stashteam.stashapp.utils.p304f;

import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C2589a;
import io.stashteam.games.tracker.stashapp.R;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.utils.f.d */
public final class C5698d {
    /* renamed from: a */
    public static final void m21782a(C2589a aVar) {
        C5942k.m22327b(aVar, "$this$setUpExpandedDialog");
        FrameLayout frameLayout = (FrameLayout) aVar.findViewById(R.id.design_bottom_sheet);
        if (frameLayout != null) {
            BottomSheetBehavior b = BottomSheetBehavior.m10458b(frameLayout);
            C5942k.m22324a((Object) b, "BottomSheetBehavior.from(bottomSheet!!)");
            b.mo8123e(3);
            b.mo8120c(true);
            b.mo8118b(true);
            return;
        }
        C5942k.m22323a();
        throw null;
    }
}
