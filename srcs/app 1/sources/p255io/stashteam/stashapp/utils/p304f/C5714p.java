package p255io.stashteam.stashapp.utils.p304f;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.utils.f.p */
public final class C5714p {
    /* renamed from: a */
    public static final void m21814a(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        C5942k.m22327b(view, "$this$updateViewMargins");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(num != null ? num.intValue() : marginLayoutParams.leftMargin, num2 != null ? num2.intValue() : marginLayoutParams.topMargin, num3 != null ? num3.intValue() : marginLayoutParams.rightMargin, num4 != null ? num4.intValue() : marginLayoutParams.bottomMargin);
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new C5809q("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: a */
    public static /* synthetic */ void m21815a(View view, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        m21814a(view, num, num2, num3, num4);
    }
}
