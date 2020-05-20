package p147g.p156d.p157a.p185c.p203z;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.StateSet;
import p071f.p097h.p100f.C3257d;

/* renamed from: g.d.a.c.z.b */
public class C4468b {

    /* renamed from: a */
    public static final boolean f11823a = (VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private static final int[] f11824b = {16842919};

    /* renamed from: c */
    private static final int[] f11825c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f11826d = {16842908};

    /* renamed from: e */
    private static final int[] f11827e = {16843623};

    /* renamed from: f */
    private static final int[] f11828f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f11829g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f11830h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f11831i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f11832j = {16842913};

    /* renamed from: k */
    private static final int[] f11833k = {16842910, 16842919};

    /* renamed from: l */
    static final String f11834l = C4468b.class.getSimpleName();

    private C4468b() {
    }

    @TargetApi(21)
    /* renamed from: a */
    private static int m18197a(int i) {
        return C3257d.m13346c(i, Math.min(Color.alpha(i) * 2, 255));
    }

    /* renamed from: a */
    private static int m18198a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f11823a ? m18197a(colorForState) : colorForState;
    }

    /* renamed from: a */
    public static ColorStateList m18199a(ColorStateList colorStateList) {
        if (f11823a) {
            return new ColorStateList(new int[][]{f11832j, StateSet.NOTHING}, new int[]{m18198a(colorStateList, f11828f), m18198a(colorStateList, f11824b)});
        }
        int[] iArr = f11828f;
        int[] iArr2 = f11829g;
        int[] iArr3 = f11830h;
        int[] iArr4 = f11831i;
        int[] iArr5 = f11824b;
        int[] iArr6 = f11825c;
        int[] iArr7 = f11826d;
        int[] iArr8 = f11827e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f11832j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m18198a(colorStateList, iArr), m18198a(colorStateList, iArr2), m18198a(colorStateList, iArr3), m18198a(colorStateList, iArr4), 0, m18198a(colorStateList, iArr5), m18198a(colorStateList, iArr6), m18198a(colorStateList, iArr7), m18198a(colorStateList, iArr8), 0});
    }

    /* renamed from: a */
    public static boolean m18200a(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    /* renamed from: b */
    public static ColorStateList m18201b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f11833k, 0)) != 0) {
            Log.w(f11834l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }
}
