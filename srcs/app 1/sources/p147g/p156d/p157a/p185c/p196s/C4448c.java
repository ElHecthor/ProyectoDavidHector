package p147g.p156d.p157a.p185c.p196s;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import com.google.android.material.internal.C2714i;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4416l;

/* renamed from: g.d.a.c.s.c */
public class C4448c {
    /* renamed from: a */
    public static Rect m18145a(Context context, int i, int i2) {
        TypedArray c = C2714i.m11283c(context, null, C4416l.MaterialAlertDialog, i, i2, new int[0]);
        int dimensionPixelSize = c.getDimensionPixelSize(C4416l.MaterialAlertDialog_backgroundInsetStart, context.getResources().getDimensionPixelSize(C4408d.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = c.getDimensionPixelSize(C4416l.MaterialAlertDialog_backgroundInsetTop, context.getResources().getDimensionPixelSize(C4408d.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = c.getDimensionPixelSize(C4416l.MaterialAlertDialog_backgroundInsetEnd, context.getResources().getDimensionPixelSize(C4408d.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = c.getDimensionPixelSize(C4416l.MaterialAlertDialog_backgroundInsetBottom, context.getResources().getDimensionPixelSize(C4408d.mtrl_alert_dialog_background_inset_bottom));
        c.recycle();
        if (VERSION.SDK_INT >= 17 && context.getResources().getConfiguration().getLayoutDirection() == 1) {
            int i3 = dimensionPixelSize3;
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = i3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    /* renamed from: a */
    public static InsetDrawable m18146a(Drawable drawable, Rect rect) {
        InsetDrawable insetDrawable = new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
        return insetDrawable;
    }
}
