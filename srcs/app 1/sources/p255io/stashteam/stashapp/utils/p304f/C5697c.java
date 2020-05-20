package p255io.stashteam.stashapp.utils.p304f;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p255io.stashteam.stashapp.utils.C5688a;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.utils.f.c */
public final class C5697c {
    /* renamed from: a */
    private static final int m21780a(int i) {
        return C5688a.f14784a.mo15339a() - (i + C5688a.f14784a.mo15343b());
    }

    /* renamed from: a */
    public static final <V extends View> void m21781a(BottomSheetBehavior<V> bottomSheetBehavior, int i) {
        C5942k.m22327b(bottomSheetBehavior, "$this$listCustomSetUp");
        bottomSheetBehavior.mo8119c(m21780a(i));
        bottomSheetBehavior.mo8107a(0.99f);
        bottomSheetBehavior.mo8116b(i);
        bottomSheetBehavior.mo8123e(3);
    }
}
