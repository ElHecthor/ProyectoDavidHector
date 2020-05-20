package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0371a;
import androidx.core.graphics.drawable.C0372b;
import com.google.android.material.internal.C2709g;
import com.google.android.material.internal.C2709g.C2711b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p097h.p100f.C3257d;
import p071f.p097h.p106k.C3297a;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p189m.C4424h;
import p147g.p156d.p157a.p185c.p191o.C4432a;
import p147g.p156d.p157a.p185c.p197t.C4449a;
import p147g.p156d.p157a.p185c.p202y.C4460d;
import p147g.p156d.p157a.p185c.p203z.C4468b;

/* renamed from: com.google.android.material.chip.a */
public class C2611a extends C4382g implements C0372b, Callback, C2711b {

    /* renamed from: L0 */
    private static final int[] f7484L0 = {16842910};

    /* renamed from: M0 */
    private static final ShapeDrawable f7485M0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private PorterDuffColorFilter f7486A0;

    /* renamed from: B0 */
    private ColorStateList f7487B0;

    /* renamed from: C */
    private ColorStateList f7488C;

    /* renamed from: C0 */
    private Mode f7489C0 = Mode.SRC_IN;

    /* renamed from: D */
    private ColorStateList f7490D;

    /* renamed from: D0 */
    private int[] f7491D0;

    /* renamed from: E */
    private float f7492E;

    /* renamed from: E0 */
    private boolean f7493E0;

    /* renamed from: F */
    private float f7494F;

    /* renamed from: F0 */
    private ColorStateList f7495F0;

    /* renamed from: G */
    private ColorStateList f7496G;

    /* renamed from: G0 */
    private WeakReference<C2612a> f7497G0;

    /* renamed from: H */
    private float f7498H;

    /* renamed from: H0 */
    private TruncateAt f7499H0;

    /* renamed from: I */
    private ColorStateList f7500I;

    /* renamed from: I0 */
    private boolean f7501I0;

    /* renamed from: J */
    private CharSequence f7502J;

    /* renamed from: J0 */
    private int f7503J0;

    /* renamed from: K */
    private boolean f7504K;

    /* renamed from: K0 */
    private boolean f7505K0;

    /* renamed from: L */
    private Drawable f7506L;

    /* renamed from: M */
    private ColorStateList f7507M;

    /* renamed from: N */
    private float f7508N;

    /* renamed from: O */
    private boolean f7509O;

    /* renamed from: P */
    private boolean f7510P;

    /* renamed from: Q */
    private Drawable f7511Q;

    /* renamed from: R */
    private Drawable f7512R;

    /* renamed from: S */
    private ColorStateList f7513S;

    /* renamed from: T */
    private float f7514T;

    /* renamed from: U */
    private CharSequence f7515U;

    /* renamed from: V */
    private boolean f7516V;

    /* renamed from: W */
    private boolean f7517W;

    /* renamed from: X */
    private Drawable f7518X;

    /* renamed from: Y */
    private C4424h f7519Y;

    /* renamed from: Z */
    private C4424h f7520Z;

    /* renamed from: a0 */
    private float f7521a0;

    /* renamed from: b0 */
    private float f7522b0;

    /* renamed from: c0 */
    private float f7523c0;

    /* renamed from: d0 */
    private float f7524d0;

    /* renamed from: e0 */
    private float f7525e0;

    /* renamed from: f0 */
    private float f7526f0;

    /* renamed from: g0 */
    private float f7527g0;

    /* renamed from: h0 */
    private float f7528h0;

    /* renamed from: i0 */
    private final Context f7529i0;

    /* renamed from: j0 */
    private final Paint f7530j0 = new Paint(1);

    /* renamed from: k0 */
    private final Paint f7531k0;

    /* renamed from: l0 */
    private final FontMetrics f7532l0 = new FontMetrics();

    /* renamed from: m0 */
    private final RectF f7533m0 = new RectF();

    /* renamed from: n0 */
    private final PointF f7534n0 = new PointF();

    /* renamed from: o0 */
    private final Path f7535o0 = new Path();

    /* renamed from: p0 */
    private final C2709g f7536p0;

    /* renamed from: q0 */
    private int f7537q0;

    /* renamed from: r0 */
    private int f7538r0;

    /* renamed from: s0 */
    private int f7539s0;

    /* renamed from: t0 */
    private int f7540t0;

    /* renamed from: u0 */
    private int f7541u0;

    /* renamed from: v0 */
    private int f7542v0;

    /* renamed from: w0 */
    private boolean f7543w0;

    /* renamed from: x0 */
    private int f7544x0;

    /* renamed from: y0 */
    private int f7545y0 = 255;

    /* renamed from: z0 */
    private ColorFilter f7546z0;

    /* renamed from: com.google.android.material.chip.a$a */
    public interface C2612a {
        /* renamed from: a */
        void mo8291a();
    }

    private C2611a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Paint paint = null;
        this.f7497G0 = new WeakReference<>(paint);
        mo13058a(context);
        this.f7529i0 = context;
        C2709g gVar = new C2709g(this);
        this.f7536p0 = gVar;
        this.f7502J = "";
        gVar.mo8997b().density = context.getResources().getDisplayMetrics().density;
        this.f7531k0 = paint;
        if (paint != null) {
            paint.setStyle(Style.STROKE);
        }
        setState(f7484L0);
        mo8512a(f7484L0);
        this.f7501I0 = true;
        if (C4468b.f11823a) {
            f7485M0.setTint(-1);
        }
    }

    /* renamed from: a */
    public static C2611a m10680a(Context context, AttributeSet attributeSet, int i, int i2) {
        C2611a aVar = new C2611a(context, attributeSet, i, i2);
        aVar.m10683a(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: a */
    private void m10681a(Canvas canvas, Rect rect) {
        if (m10703g0()) {
            m10682a(rect, this.f7533m0);
            RectF rectF = this.f7533m0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f7518X.setBounds(0, 0, (int) this.f7533m0.width(), (int) this.f7533m0.height());
            this.f7518X.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: a */
    private void m10682a(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m10706h0() || m10703g0()) {
            float f = this.f7521a0 + this.f7522b0;
            if (C0371a.m1909e(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + this.f7508N;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - this.f7508N;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f7508N;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ce  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10683a(android.util.AttributeSet r8, int r9, int r10) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f7529i0
            int[] r2 = p147g.p156d.p157a.p185c.C4416l.Chip
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r8
            r3 = r9
            r4 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C2714i.m11283c(r0, r1, r2, r3, r4, r5)
            int r10 = p147g.p156d.p157a.p185c.C4416l.Chip_shapeAppearance
            boolean r10 = r9.hasValue(r10)
            r7.f7505K0 = r10
            android.content.Context r10 = r7.f7529i0
            int r0 = p147g.p156d.p157a.p185c.C4416l.Chip_chipSurfaceColor
            android.content.res.ColorStateList r10 = p147g.p156d.p157a.p185c.p202y.C4459c.m18175a(r10, r9, r0)
            r7.m10707i(r10)
            android.content.Context r10 = r7.f7529i0
            int r0 = p147g.p156d.p157a.p185c.C4416l.Chip_chipBackgroundColor
            android.content.res.ColorStateList r10 = p147g.p156d.p157a.p185c.p202y.C4459c.m18175a(r10, r9, r0)
            r7.mo8520c(r10)
            int r10 = p147g.p156d.p157a.p185c.C4416l.Chip_chipMinHeight
            r0 = 0
            float r10 = r9.getDimension(r10, r0)
            r7.mo8547i(r10)
            int r10 = p147g.p156d.p157a.p185c.C4416l.Chip_chipCornerRadius
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L_0x0047
            int r10 = p147g.p156d.p157a.p185c.C4416l.Chip_chipCornerRadius
            float r10 = r9.getDimension(r10, r0)
            r7.mo8531f(r10)
        L_0x0047:
            android.content.Context r10 = r7.f7529i0
            int r1 = p147g.p156d.p157a.p185c.C4416l.Chip_chipStrokeColor
            android.content.res.ColorStateList r10 = p147g.p156d.p157a.p185c.p202y.C4459c.m18175a(r10, r9, r1)
            r7.mo8529e(r10)
            int r10 = p147g.p156d.p157a.p185c.C4416l.Chip_chipStrokeWidth
            float r10 = r9.getDimension(r10, r0)
            r7.mo8553k(r10)
            android.content.Context r10 = r7.f7529i0
            int r1 = p147g.p156d.p157a.p185c.C4416l.Chip_rippleColor
            android.content.res.ColorStateList r10 = p147g.p156d.p157a.p185c.p202y.C4459c.m18175a(r10, r9, r1)
            r7.mo8537g(r10)
            int r10 = p147g.p156d.p157a.p185c.C4416l.Chip_android_text
            java.lang.CharSequence r10 = r9.getText(r10)
            r7.mo8516b(r10)
            android.content.Context r10 = r7.f7529i0
            int r1 = p147g.p156d.p157a.p185c.C4416l.Chip_android_textAppearance
            g.d.a.c.y.d r10 = p147g.p156d.p157a.p185c.p202y.C4459c.m18178c(r10, r9, r1)
            r7.mo8510a(r10)
            int r10 = p147g.p156d.p157a.p185c.C4416l.Chip_android_ellipsize
            int r10 = r9.getInt(r10, r6)
            r1 = 1
            if (r10 == r1) goto L_0x0090
            r1 = 2
            if (r10 == r1) goto L_0x008d
            r1 = 3
            if (r10 == r1) goto L_0x008a
            goto L_0x0095
        L_0x008a:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
            goto L_0x0092
        L_0x008d:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x0092
        L_0x0090:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.START
        L_0x0092:
            r7.mo8507a(r10)
        L_0x0095:
            int r10 = p147g.p156d.p157a.p185c.C4416l.Chip_chipIconVisible
            boolean r10 = r9.getBoolean(r10, r6)
            r7.mo8526d(r10)
            java.lang.String r10 = "http://schemas.android.com/apk/res-auto"
            if (r8 == 0) goto L_0x00bb
            java.lang.String r1 = "chipIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x00bb
            java.lang.String r1 = "chipIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L_0x00bb
            int r1 = p147g.p156d.p157a.p185c.C4416l.Chip_chipIconEnabled
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo8526d(r1)
        L_0x00bb:
            android.content.Context r1 = r7.f7529i0
            int r2 = p147g.p156d.p157a.p185c.C4416l.Chip_chipIcon
            android.graphics.drawable.Drawable r1 = p147g.p156d.p157a.p185c.p202y.C4459c.m18177b(r1, r9, r2)
            r7.mo8514b(r1)
            int r1 = p147g.p156d.p157a.p185c.C4416l.Chip_chipIconTint
            boolean r1 = r9.hasValue(r1)
            if (r1 == 0) goto L_0x00d9
            android.content.Context r1 = r7.f7529i0
            int r2 = p147g.p156d.p157a.p185c.C4416l.Chip_chipIconTint
            android.content.res.ColorStateList r1 = p147g.p156d.p157a.p185c.p202y.C4459c.m18175a(r1, r9, r2)
            r7.mo8525d(r1)
        L_0x00d9:
            int r1 = p147g.p156d.p157a.p185c.C4416l.Chip_chipIconSize
            float r1 = r9.getDimension(r1, r0)
            r7.mo8545h(r1)
            int r1 = p147g.p156d.p157a.p185c.C4416l.Chip_closeIconVisible
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo8530e(r1)
            if (r8 == 0) goto L_0x0106
            java.lang.String r1 = "closeIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = "closeIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L_0x0106
            int r1 = p147g.p156d.p157a.p185c.C4416l.Chip_closeIconEnabled
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo8530e(r1)
        L_0x0106:
            android.content.Context r1 = r7.f7529i0
            int r2 = p147g.p156d.p157a.p185c.C4416l.Chip_closeIcon
            android.graphics.drawable.Drawable r1 = p147g.p156d.p157a.p185c.p202y.C4459c.m18177b(r1, r9, r2)
            r7.mo8521c(r1)
            android.content.Context r1 = r7.f7529i0
            int r2 = p147g.p156d.p157a.p185c.C4416l.Chip_closeIconTint
            android.content.res.ColorStateList r1 = p147g.p156d.p157a.p185c.p202y.C4459c.m18175a(r1, r9, r2)
            r7.mo8533f(r1)
            int r1 = p147g.p156d.p157a.p185c.C4416l.Chip_closeIconSize
            float r1 = r9.getDimension(r1, r0)
            r7.mo8557m(r1)
            int r1 = p147g.p156d.p157a.p185c.C4416l.Chip_android_checkable
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo8517b(r1)
            int r1 = p147g.p156d.p157a.p185c.C4416l.Chip_checkedIconVisible
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo8522c(r1)
            if (r8 == 0) goto L_0x0152
            java.lang.String r1 = "checkedIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x0152
            java.lang.String r1 = "checkedIconVisible"
            java.lang.String r8 = r8.getAttributeValue(r10, r1)
            if (r8 != 0) goto L_0x0152
            int r8 = p147g.p156d.p157a.p185c.C4416l.Chip_checkedIconEnabled
            boolean r8 = r9.getBoolean(r8, r6)
            r7.mo8522c(r8)
        L_0x0152:
            android.content.Context r8 = r7.f7529i0
            int r10 = p147g.p156d.p157a.p185c.C4416l.Chip_checkedIcon
            android.graphics.drawable.Drawable r8 = p147g.p156d.p157a.p185c.p202y.C4459c.m18177b(r8, r9, r10)
            r7.mo8506a(r8)
            android.content.Context r8 = r7.f7529i0
            int r10 = p147g.p156d.p157a.p185c.C4416l.Chip_showMotionSpec
            g.d.a.c.m.h r8 = p147g.p156d.p157a.p185c.p189m.C4424h.m18018a(r8, r9, r10)
            r7.mo8515b(r8)
            android.content.Context r8 = r7.f7529i0
            int r10 = p147g.p156d.p157a.p185c.C4416l.Chip_hideMotionSpec
            g.d.a.c.m.h r8 = p147g.p156d.p157a.p185c.p189m.C4424h.m18018a(r8, r9, r10)
            r7.mo8509a(r8)
            int r8 = p147g.p156d.p157a.p185c.C4416l.Chip_chipStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo8551j(r8)
            int r8 = p147g.p156d.p157a.p185c.C4416l.Chip_iconStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo8566p(r8)
            int r8 = p147g.p156d.p157a.p185c.C4416l.Chip_iconEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo8561o(r8)
            int r8 = p147g.p156d.p157a.p185c.C4416l.Chip_textStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo8570r(r8)
            int r8 = p147g.p156d.p157a.p185c.C4416l.Chip_textEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo8568q(r8)
            int r8 = p147g.p156d.p157a.p185c.C4416l.Chip_closeIconStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo8559n(r8)
            int r8 = p147g.p156d.p157a.p185c.C4416l.Chip_closeIconEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo8555l(r8)
            int r8 = p147g.p156d.p157a.p185c.C4416l.Chip_chipEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.mo8535g(r8)
            int r8 = p147g.p156d.p157a.p185c.C4416l.Chip_android_maxWidth
            r10 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r9.getDimensionPixelSize(r8, r10)
            r7.mo8589y(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C2611a.m10683a(android.util.AttributeSet, int, int):void");
    }

    /* renamed from: a */
    private static boolean m10684a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m10685a(int[] r7, int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.f7488C
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.f7537q0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r6.f7537q0
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r6.f7537q0 = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r3 = r6.f7490D
            if (r3 == 0) goto L_0x0024
            int r5 = r6.f7538r0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            int r5 = r6.f7538r0
            if (r5 == r3) goto L_0x002c
            r6.f7538r0 = r3
            r0 = 1
        L_0x002c:
            int r1 = p147g.p156d.p157a.p185c.p195r.C4445a.m18116a(r1, r3)
            int r3 = r6.f7539s0
            if (r3 == r1) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            android.content.res.ColorStateList r5 = r6.mo13073f()
            if (r5 != 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x004d
            r6.f7539s0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r6.mo13059a(r0)
            r0 = 1
        L_0x004d:
            android.content.res.ColorStateList r1 = r6.f7496G
            if (r1 == 0) goto L_0x0058
            int r3 = r6.f7540t0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            int r3 = r6.f7540t0
            if (r3 == r1) goto L_0x0060
            r6.f7540t0 = r1
            r0 = 1
        L_0x0060:
            android.content.res.ColorStateList r1 = r6.f7495F0
            if (r1 == 0) goto L_0x0073
            boolean r1 = p147g.p156d.p157a.p185c.p203z.C4468b.m18200a(r7)
            if (r1 == 0) goto L_0x0073
            android.content.res.ColorStateList r1 = r6.f7495F0
            int r3 = r6.f7541u0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            int r3 = r6.f7541u0
            if (r3 == r1) goto L_0x007f
            r6.f7541u0 = r1
            boolean r1 = r6.f7493E0
            if (r1 == 0) goto L_0x007f
            r0 = 1
        L_0x007f:
            com.google.android.material.internal.g r1 = r6.f7536p0
            g.d.a.c.y.d r1 = r1.mo8992a()
            if (r1 == 0) goto L_0x00a0
            com.google.android.material.internal.g r1 = r6.f7536p0
            g.d.a.c.y.d r1 = r1.mo8992a()
            android.content.res.ColorStateList r1 = r1.f11803b
            if (r1 == 0) goto L_0x00a0
            com.google.android.material.internal.g r1 = r6.f7536p0
            g.d.a.c.y.d r1 = r1.mo8992a()
            android.content.res.ColorStateList r1 = r1.f11803b
            int r3 = r6.f7542v0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            int r3 = r6.f7542v0
            if (r3 == r1) goto L_0x00a8
            r6.f7542v0 = r1
            r0 = 1
        L_0x00a8:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = m10684a(r1, r3)
            if (r1 == 0) goto L_0x00bb
            boolean r1 = r6.f7516V
            if (r1 == 0) goto L_0x00bb
            r1 = 1
            goto L_0x00bc
        L_0x00bb:
            r1 = 0
        L_0x00bc:
            boolean r3 = r6.f7543w0
            if (r3 == r1) goto L_0x00d6
            android.graphics.drawable.Drawable r3 = r6.f7518X
            if (r3 == 0) goto L_0x00d6
            float r0 = r6.mo8577t()
            r6.f7543w0 = r1
            float r1 = r6.mo8577t()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d5
            r0 = 1
            r1 = 1
            goto L_0x00d7
        L_0x00d5:
            r0 = 1
        L_0x00d6:
            r1 = 0
        L_0x00d7:
            android.content.res.ColorStateList r3 = r6.f7487B0
            if (r3 == 0) goto L_0x00e2
            int r5 = r6.f7544x0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00e3
        L_0x00e2:
            r3 = 0
        L_0x00e3:
            int r5 = r6.f7544x0
            if (r5 == r3) goto L_0x00f4
            r6.f7544x0 = r3
            android.content.res.ColorStateList r0 = r6.f7487B0
            android.graphics.PorterDuff$Mode r3 = r6.f7489C0
            android.graphics.PorterDuffColorFilter r0 = p147g.p156d.p157a.p185c.p197t.C4449a.m18147a(r6, r0, r3)
            r6.f7486A0 = r0
            goto L_0x00f5
        L_0x00f4:
            r4 = r0
        L_0x00f5:
            android.graphics.drawable.Drawable r0 = r6.f7506L
            boolean r0 = m10697e(r0)
            if (r0 == 0) goto L_0x0104
            android.graphics.drawable.Drawable r0 = r6.f7506L
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0104:
            android.graphics.drawable.Drawable r0 = r6.f7518X
            boolean r0 = m10697e(r0)
            if (r0 == 0) goto L_0x0113
            android.graphics.drawable.Drawable r0 = r6.f7518X
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0113:
            android.graphics.drawable.Drawable r0 = r6.f7511Q
            boolean r0 = m10697e(r0)
            if (r0 == 0) goto L_0x0130
            int r0 = r7.length
            int r3 = r8.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r3)
            int r7 = r7.length
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r2, r0, r7, r3)
            android.graphics.drawable.Drawable r7 = r6.f7511Q
            boolean r7 = r7.setState(r0)
            r4 = r4 | r7
        L_0x0130:
            boolean r7 = p147g.p156d.p157a.p185c.p203z.C4468b.f11823a
            if (r7 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r7 = r6.f7512R
            boolean r7 = m10697e(r7)
            if (r7 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r7 = r6.f7512R
            boolean r7 = r7.setState(r8)
            r4 = r4 | r7
        L_0x0143:
            if (r4 == 0) goto L_0x0148
            r6.invalidateSelf()
        L_0x0148:
            if (r1 == 0) goto L_0x014d
            r6.mo8518b0()
        L_0x014d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C2611a.m10685a(int[], int[]):boolean");
    }

    /* renamed from: b */
    private void m10686b(Canvas canvas, Rect rect) {
        if (!this.f7505K0) {
            this.f7530j0.setColor(this.f7538r0);
            this.f7530j0.setStyle(Style.FILL);
            this.f7530j0.setColorFilter(m10701f0());
            this.f7533m0.set(rect);
            canvas.drawRoundRect(this.f7533m0, mo8586x(), mo8586x(), this.f7530j0);
        }
    }

    /* renamed from: b */
    private void m10687b(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m10709i0()) {
            float f = this.f7528h0 + this.f7527g0 + this.f7514T + this.f7526f0 + this.f7525e0;
            if (C0371a.m1909e(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: b */
    private static boolean m10688b(C4460d dVar) {
        if (dVar != null) {
            ColorStateList colorStateList = dVar.f11803b;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m10689c(Canvas canvas, Rect rect) {
        if (m10706h0()) {
            m10682a(rect, this.f7533m0);
            RectF rectF = this.f7533m0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f7506L.setBounds(0, 0, (int) this.f7533m0.width(), (int) this.f7533m0.height());
            this.f7506L.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: c */
    private void m10690c(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m10709i0()) {
            float f = this.f7528h0 + this.f7527g0;
            if (C0371a.m1909e(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f7514T;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f7514T;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f7514T;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: d */
    private void m10691d(Canvas canvas, Rect rect) {
        if (this.f7498H > 0.0f && !this.f7505K0) {
            this.f7530j0.setColor(this.f7540t0);
            this.f7530j0.setStyle(Style.STROKE);
            if (!this.f7505K0) {
                this.f7530j0.setColorFilter(m10701f0());
            }
            RectF rectF = this.f7533m0;
            float f = (float) rect.left;
            float f2 = this.f7498H;
            rectF.set(f + (f2 / 2.0f), ((float) rect.top) + (f2 / 2.0f), ((float) rect.right) - (f2 / 2.0f), ((float) rect.bottom) - (f2 / 2.0f));
            float f3 = this.f7494F - (this.f7498H / 2.0f);
            canvas.drawRoundRect(this.f7533m0, f3, f3, this.f7530j0);
        }
    }

    /* renamed from: d */
    private void m10692d(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m10709i0()) {
            float f = this.f7528h0 + this.f7527g0 + this.f7514T + this.f7526f0 + this.f7525e0;
            if (C0371a.m1909e(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: d */
    private void m10693d(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C0371a.m1904a(drawable, C0371a.m1909e(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f7511Q) {
                if (drawable.isStateful()) {
                    drawable.setState(mo8488L());
                }
                C0371a.m1898a(drawable, this.f7513S);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f7506L;
            if (drawable == drawable2 && this.f7509O) {
                C0371a.m1898a(drawable2, this.f7507M);
            }
        }
    }

    /* renamed from: d0 */
    private float m10694d0() {
        this.f7536p0.mo8997b().getFontMetrics(this.f7532l0);
        FontMetrics fontMetrics = this.f7532l0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: e */
    private void m10695e(Canvas canvas, Rect rect) {
        if (!this.f7505K0) {
            this.f7530j0.setColor(this.f7537q0);
            this.f7530j0.setStyle(Style.FILL);
            this.f7533m0.set(rect);
            canvas.drawRoundRect(this.f7533m0, mo8586x(), mo8586x(), this.f7530j0);
        }
    }

    /* renamed from: e */
    private void m10696e(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f7502J != null) {
            float t = this.f7521a0 + mo8577t() + this.f7524d0;
            float u = this.f7528h0 + mo8579u() + this.f7525e0;
            if (C0371a.m1909e(this) == 0) {
                rectF.left = ((float) rect.left) + t;
                rectF.right = ((float) rect.right) - u;
            } else {
                rectF.left = ((float) rect.left) + u;
                rectF.right = ((float) rect.right) - t;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: e */
    private static boolean m10697e(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: e0 */
    private boolean m10698e0() {
        return this.f7517W && this.f7518X != null && this.f7516V;
    }

    /* renamed from: f */
    private void m10699f(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (m10709i0()) {
            m10690c(rect, this.f7533m0);
            RectF rectF = this.f7533m0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f7511Q.setBounds(0, 0, (int) this.f7533m0.width(), (int) this.f7533m0.height());
            if (C4468b.f11823a) {
                this.f7512R.setBounds(this.f7511Q.getBounds());
                this.f7512R.jumpToCurrentState();
                drawable = this.f7512R;
            } else {
                drawable = this.f7511Q;
            }
            drawable.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: f */
    private void m10700f(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: f0 */
    private ColorFilter m10701f0() {
        ColorFilter colorFilter = this.f7546z0;
        return colorFilter != null ? colorFilter : this.f7486A0;
    }

    /* renamed from: g */
    private void m10702g(Canvas canvas, Rect rect) {
        this.f7530j0.setColor(this.f7541u0);
        this.f7530j0.setStyle(Style.FILL);
        this.f7533m0.set(rect);
        if (!this.f7505K0) {
            canvas.drawRoundRect(this.f7533m0, mo8586x(), mo8586x(), this.f7530j0);
            return;
        }
        mo13061a(new RectF(rect), this.f7535o0);
        super.mo13060a(canvas, this.f7530j0, this.f7535o0, mo13069d());
    }

    /* renamed from: g0 */
    private boolean m10703g0() {
        return this.f7517W && this.f7518X != null && this.f7543w0;
    }

    /* renamed from: h */
    private void m10704h(Canvas canvas, Rect rect) {
        Paint paint = this.f7531k0;
        if (paint != null) {
            paint.setColor(C3257d.m13346c(-16777216, 127));
            canvas.drawRect(rect, this.f7531k0);
            if (m10706h0() || m10703g0()) {
                m10682a(rect, this.f7533m0);
                canvas.drawRect(this.f7533m0, this.f7531k0);
            }
            if (this.f7502J != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f7531k0);
            }
            if (m10709i0()) {
                m10690c(rect, this.f7533m0);
                canvas.drawRect(this.f7533m0, this.f7531k0);
            }
            this.f7531k0.setColor(C3257d.m13346c(-65536, 127));
            m10687b(rect, this.f7533m0);
            canvas.drawRect(this.f7533m0, this.f7531k0);
            this.f7531k0.setColor(C3257d.m13346c(-16711936, 127));
            m10692d(rect, this.f7533m0);
            canvas.drawRect(this.f7533m0, this.f7531k0);
        }
    }

    /* renamed from: h */
    private static boolean m10705h(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: h0 */
    private boolean m10706h0() {
        return this.f7504K && this.f7506L != null;
    }

    /* renamed from: i */
    private void m10707i(ColorStateList colorStateList) {
        if (this.f7488C != colorStateList) {
            this.f7488C = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: i */
    private void m10708i(Canvas canvas, Rect rect) {
        if (this.f7502J != null) {
            Align a = mo8503a(rect, this.f7534n0);
            m10696e(rect, this.f7533m0);
            if (this.f7536p0.mo8992a() != null) {
                this.f7536p0.mo8997b().drawableState = getState();
                this.f7536p0.mo8993a(this.f7529i0);
            }
            this.f7536p0.mo8997b().setTextAlign(a);
            int i = 0;
            boolean z = Math.round(this.f7536p0.mo8991a(mo8496T().toString())) > Math.round(this.f7533m0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f7533m0);
            }
            CharSequence charSequence = this.f7502J;
            if (z && this.f7499H0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f7536p0.mo8997b(), this.f7533m0.width(), this.f7499H0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f7534n0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f7536p0.mo8997b());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: i0 */
    private boolean m10709i0() {
        return this.f7510P && this.f7511Q != null;
    }

    /* renamed from: j0 */
    private void m10710j0() {
        this.f7495F0 = this.f7493E0 ? C4468b.m18201b(this.f7500I) : null;
    }

    @TargetApi(21)
    /* renamed from: k0 */
    private void m10711k0() {
        this.f7512R = new RippleDrawable(C4468b.m18201b(mo8494R()), this.f7511Q, f7485M0);
    }

    /* renamed from: A */
    public float mo8473A() {
        return this.f7508N;
    }

    /* renamed from: A */
    public void mo8474A(int i) {
        mo8515b(C4424h.m18017a(this.f7529i0, i));
    }

    /* renamed from: B */
    public ColorStateList mo8475B() {
        return this.f7507M;
    }

    /* renamed from: B */
    public void mo8476B(int i) {
        mo8510a(new C4460d(this.f7529i0, i));
    }

    /* renamed from: C */
    public float mo8477C() {
        return this.f7492E;
    }

    /* renamed from: C */
    public void mo8478C(int i) {
        mo8568q(this.f7529i0.getResources().getDimension(i));
    }

    /* renamed from: D */
    public float mo8479D() {
        return this.f7521a0;
    }

    /* renamed from: D */
    public void mo8480D(int i) {
        mo8570r(this.f7529i0.getResources().getDimension(i));
    }

    /* renamed from: E */
    public ColorStateList mo8481E() {
        return this.f7496G;
    }

    /* renamed from: F */
    public float mo8482F() {
        return this.f7498H;
    }

    /* renamed from: G */
    public Drawable mo8483G() {
        Drawable drawable = this.f7511Q;
        if (drawable != null) {
            return C0371a.m1912h(drawable);
        }
        return null;
    }

    /* renamed from: H */
    public CharSequence mo8484H() {
        return this.f7515U;
    }

    /* renamed from: I */
    public float mo8485I() {
        return this.f7527g0;
    }

    /* renamed from: J */
    public float mo8486J() {
        return this.f7514T;
    }

    /* renamed from: K */
    public float mo8487K() {
        return this.f7526f0;
    }

    /* renamed from: L */
    public int[] mo8488L() {
        return this.f7491D0;
    }

    /* renamed from: M */
    public ColorStateList mo8489M() {
        return this.f7513S;
    }

    /* renamed from: N */
    public TruncateAt mo8490N() {
        return this.f7499H0;
    }

    /* renamed from: O */
    public C4424h mo8491O() {
        return this.f7520Z;
    }

    /* renamed from: P */
    public float mo8492P() {
        return this.f7523c0;
    }

    /* renamed from: Q */
    public float mo8493Q() {
        return this.f7522b0;
    }

    /* renamed from: R */
    public ColorStateList mo8494R() {
        return this.f7500I;
    }

    /* renamed from: S */
    public C4424h mo8495S() {
        return this.f7519Y;
    }

    /* renamed from: T */
    public CharSequence mo8496T() {
        return this.f7502J;
    }

    /* renamed from: U */
    public C4460d mo8497U() {
        return this.f7536p0.mo8992a();
    }

    /* renamed from: V */
    public float mo8498V() {
        return this.f7525e0;
    }

    /* renamed from: W */
    public float mo8499W() {
        return this.f7524d0;
    }

    /* renamed from: X */
    public boolean mo8500X() {
        return this.f7493E0;
    }

    /* renamed from: Y */
    public boolean mo8501Y() {
        return this.f7516V;
    }

    /* renamed from: Z */
    public boolean mo8502Z() {
        return m10697e(this.f7511Q);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Align mo8503a(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Align align = Align.LEFT;
        if (this.f7502J != null) {
            float t = this.f7521a0 + mo8577t() + this.f7524d0;
            if (C0371a.m1909e(this) == 0) {
                pointF.x = ((float) rect.left) + t;
                align = Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - t;
                align = Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m10694d0();
        }
        return align;
    }

    /* renamed from: a */
    public void mo8504a() {
        mo8518b0();
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo8505a(RectF rectF) {
        m10692d(getBounds(), rectF);
    }

    /* renamed from: a */
    public void mo8506a(Drawable drawable) {
        if (this.f7518X != drawable) {
            float t = mo8577t();
            this.f7518X = drawable;
            float t2 = mo8577t();
            m10700f(this.f7518X);
            m10693d(this.f7518X);
            invalidateSelf();
            if (t != t2) {
                mo8518b0();
            }
        }
    }

    /* renamed from: a */
    public void mo8507a(TruncateAt truncateAt) {
        this.f7499H0 = truncateAt;
    }

    /* renamed from: a */
    public void mo8508a(C2612a aVar) {
        this.f7497G0 = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public void mo8509a(C4424h hVar) {
        this.f7520Z = hVar;
    }

    /* renamed from: a */
    public void mo8510a(C4460d dVar) {
        this.f7536p0.mo8995a(dVar, this.f7529i0);
    }

    /* renamed from: a */
    public void mo8511a(CharSequence charSequence) {
        if (this.f7515U != charSequence) {
            this.f7515U = C3297a.m13483b().mo10656a(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public boolean mo8512a(int[] iArr) {
        if (!Arrays.equals(this.f7491D0, iArr)) {
            this.f7491D0 = iArr;
            if (m10709i0()) {
                return m10685a(getState(), iArr);
            }
        }
        return false;
    }

    /* renamed from: a0 */
    public boolean mo8513a0() {
        return this.f7510P;
    }

    /* renamed from: b */
    public void mo8514b(Drawable drawable) {
        Drawable z = mo8590z();
        if (z != drawable) {
            float t = mo8577t();
            this.f7506L = drawable != null ? C0371a.m1913i(drawable).mutate() : null;
            float t2 = mo8577t();
            m10700f(z);
            if (m10706h0()) {
                m10693d(this.f7506L);
            }
            invalidateSelf();
            if (t != t2) {
                mo8518b0();
            }
        }
    }

    /* renamed from: b */
    public void mo8515b(C4424h hVar) {
        this.f7519Y = hVar;
    }

    /* renamed from: b */
    public void mo8516b(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f7502J, charSequence)) {
            this.f7502J = charSequence;
            this.f7536p0.mo8996a(true);
            invalidateSelf();
            mo8518b0();
        }
    }

    /* renamed from: b */
    public void mo8517b(boolean z) {
        if (this.f7516V != z) {
            this.f7516V = z;
            float t = mo8577t();
            if (!z && this.f7543w0) {
                this.f7543w0 = false;
            }
            float t2 = mo8577t();
            invalidateSelf();
            if (t != t2) {
                mo8518b0();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public void mo8518b0() {
        C2612a aVar = (C2612a) this.f7497G0.get();
        if (aVar != null) {
            aVar.mo8291a();
        }
    }

    /* renamed from: c */
    public void mo8519c(int i) {
        mo8517b(this.f7529i0.getResources().getBoolean(i));
    }

    /* renamed from: c */
    public void mo8520c(ColorStateList colorStateList) {
        if (this.f7490D != colorStateList) {
            this.f7490D = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: c */
    public void mo8521c(Drawable drawable) {
        Drawable G = mo8483G();
        if (G != drawable) {
            float u = mo8579u();
            this.f7511Q = drawable != null ? C0371a.m1913i(drawable).mutate() : null;
            if (C4468b.f11823a) {
                m10711k0();
            }
            float u2 = mo8579u();
            m10700f(G);
            if (m10709i0()) {
                m10693d(this.f7511Q);
            }
            invalidateSelf();
            if (u != u2) {
                mo8518b0();
            }
        }
    }

    /* renamed from: c */
    public void mo8522c(boolean z) {
        if (this.f7517W != z) {
            boolean g0 = m10703g0();
            this.f7517W = z;
            boolean g02 = m10703g0();
            if (g0 != g02) {
                if (g02) {
                    m10693d(this.f7518X);
                } else {
                    m10700f(this.f7518X);
                }
                invalidateSelf();
                mo8518b0();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c0 */
    public boolean mo8523c0() {
        return this.f7501I0;
    }

    /* renamed from: d */
    public void mo8524d(int i) {
        mo8506a(C3103a.m12557c(this.f7529i0, i));
    }

    /* renamed from: d */
    public void mo8525d(ColorStateList colorStateList) {
        this.f7509O = true;
        if (this.f7507M != colorStateList) {
            this.f7507M = colorStateList;
            if (m10706h0()) {
                C0371a.m1898a(this.f7506L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: d */
    public void mo8526d(boolean z) {
        if (this.f7504K != z) {
            boolean h0 = m10706h0();
            this.f7504K = z;
            boolean h02 = m10706h0();
            if (h0 != h02) {
                if (h02) {
                    m10693d(this.f7506L);
                } else {
                    m10700f(this.f7506L);
                }
                invalidateSelf();
                mo8518b0();
            }
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.f7545y0;
            if (i2 < 255) {
                i = C4432a.m18091a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            m10695e(canvas, bounds);
            m10686b(canvas, bounds);
            if (this.f7505K0) {
                super.draw(canvas);
            }
            m10691d(canvas, bounds);
            m10702g(canvas, bounds);
            m10689c(canvas, bounds);
            m10681a(canvas, bounds);
            if (this.f7501I0) {
                m10708i(canvas, bounds);
            }
            m10699f(canvas, bounds);
            m10704h(canvas, bounds);
            if (this.f7545y0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e */
    public void mo8528e(int i) {
        mo8522c(this.f7529i0.getResources().getBoolean(i));
    }

    /* renamed from: e */
    public void mo8529e(ColorStateList colorStateList) {
        if (this.f7496G != colorStateList) {
            this.f7496G = colorStateList;
            if (this.f7505K0) {
                mo13066b(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: e */
    public void mo8530e(boolean z) {
        if (this.f7510P != z) {
            boolean i0 = m10709i0();
            this.f7510P = z;
            boolean i02 = m10709i0();
            if (i0 != i02) {
                if (i02) {
                    m10693d(this.f7511Q);
                } else {
                    m10700f(this.f7511Q);
                }
                invalidateSelf();
                mo8518b0();
            }
        }
    }

    @Deprecated
    /* renamed from: f */
    public void mo8531f(float f) {
        if (this.f7494F != f) {
            this.f7494F = f;
            setShapeAppearanceModel(mo13083l().mo13101a(f));
        }
    }

    /* renamed from: f */
    public void mo8532f(int i) {
        mo8520c(C3103a.m12556b(this.f7529i0, i));
    }

    /* renamed from: f */
    public void mo8533f(ColorStateList colorStateList) {
        if (this.f7513S != colorStateList) {
            this.f7513S = colorStateList;
            if (m10709i0()) {
                C0371a.m1898a(this.f7511Q, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo8534f(boolean z) {
        this.f7501I0 = z;
    }

    /* renamed from: g */
    public void mo8535g(float f) {
        if (this.f7528h0 != f) {
            this.f7528h0 = f;
            invalidateSelf();
            mo8518b0();
        }
    }

    @Deprecated
    /* renamed from: g */
    public void mo8536g(int i) {
        mo8531f(this.f7529i0.getResources().getDimension(i));
    }

    /* renamed from: g */
    public void mo8537g(ColorStateList colorStateList) {
        if (this.f7500I != colorStateList) {
            this.f7500I = colorStateList;
            m10710j0();
            onStateChange(getState());
        }
    }

    /* renamed from: g */
    public void mo8538g(boolean z) {
        if (this.f7493E0 != z) {
            this.f7493E0 = z;
            m10710j0();
            onStateChange(getState());
        }
    }

    public int getAlpha() {
        return this.f7545y0;
    }

    public ColorFilter getColorFilter() {
        return this.f7546z0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f7492E;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f7521a0 + mo8577t() + this.f7524d0 + this.f7536p0.mo8991a(mo8496T().toString()) + this.f7525e0 + mo8579u() + this.f7528h0), this.f7503J0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f7505K0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f7494F);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f7494F);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: h */
    public void mo8545h(float f) {
        if (this.f7508N != f) {
            float t = mo8577t();
            this.f7508N = f;
            float t2 = mo8577t();
            invalidateSelf();
            if (t != t2) {
                mo8518b0();
            }
        }
    }

    /* renamed from: h */
    public void mo8546h(int i) {
        mo8535g(this.f7529i0.getResources().getDimension(i));
    }

    /* renamed from: i */
    public void mo8547i(float f) {
        if (this.f7492E != f) {
            this.f7492E = f;
            invalidateSelf();
            mo8518b0();
        }
    }

    /* renamed from: i */
    public void mo8548i(int i) {
        mo8514b(C3103a.m12557c(this.f7529i0, i));
    }

    public void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return m10705h(this.f7488C) || m10705h(this.f7490D) || m10705h(this.f7496G) || (this.f7493E0 && m10705h(this.f7495F0)) || m10688b(this.f7536p0.mo8992a()) || m10698e0() || m10697e(this.f7506L) || m10697e(this.f7518X) || m10705h(this.f7487B0);
    }

    /* renamed from: j */
    public void mo8551j(float f) {
        if (this.f7521a0 != f) {
            this.f7521a0 = f;
            invalidateSelf();
            mo8518b0();
        }
    }

    /* renamed from: j */
    public void mo8552j(int i) {
        mo8545h(this.f7529i0.getResources().getDimension(i));
    }

    /* renamed from: k */
    public void mo8553k(float f) {
        if (this.f7498H != f) {
            this.f7498H = f;
            this.f7530j0.setStrokeWidth(f);
            if (this.f7505K0) {
                super.mo13072e(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: k */
    public void mo8554k(int i) {
        mo8525d(C3103a.m12556b(this.f7529i0, i));
    }

    /* renamed from: l */
    public void mo8555l(float f) {
        if (this.f7527g0 != f) {
            this.f7527g0 = f;
            invalidateSelf();
            if (m10709i0()) {
                mo8518b0();
            }
        }
    }

    /* renamed from: l */
    public void mo8556l(int i) {
        mo8526d(this.f7529i0.getResources().getBoolean(i));
    }

    /* renamed from: m */
    public void mo8557m(float f) {
        if (this.f7514T != f) {
            this.f7514T = f;
            invalidateSelf();
            if (m10709i0()) {
                mo8518b0();
            }
        }
    }

    /* renamed from: m */
    public void mo8558m(int i) {
        mo8547i(this.f7529i0.getResources().getDimension(i));
    }

    /* renamed from: n */
    public void mo8559n(float f) {
        if (this.f7526f0 != f) {
            this.f7526f0 = f;
            invalidateSelf();
            if (m10709i0()) {
                mo8518b0();
            }
        }
    }

    /* renamed from: n */
    public void mo8560n(int i) {
        mo8551j(this.f7529i0.getResources().getDimension(i));
    }

    /* renamed from: o */
    public void mo8561o(float f) {
        if (this.f7523c0 != f) {
            float t = mo8577t();
            this.f7523c0 = f;
            float t2 = mo8577t();
            invalidateSelf();
            if (t != t2) {
                mo8518b0();
            }
        }
    }

    /* renamed from: o */
    public void mo8562o(int i) {
        mo8529e(C3103a.m12556b(this.f7529i0, i));
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m10706h0()) {
            onLayoutDirectionChanged |= C0371a.m1904a(this.f7506L, i);
        }
        if (m10703g0()) {
            onLayoutDirectionChanged |= C0371a.m1904a(this.f7518X, i);
        }
        if (m10709i0()) {
            onLayoutDirectionChanged |= C0371a.m1904a(this.f7511Q, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m10706h0()) {
            onLevelChange |= this.f7506L.setLevel(i);
        }
        if (m10703g0()) {
            onLevelChange |= this.f7518X.setLevel(i);
        }
        if (m10709i0()) {
            onLevelChange |= this.f7511Q.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f7505K0) {
            super.onStateChange(iArr);
        }
        return m10685a(iArr, mo8488L());
    }

    /* renamed from: p */
    public void mo8566p(float f) {
        if (this.f7522b0 != f) {
            float t = mo8577t();
            this.f7522b0 = f;
            float t2 = mo8577t();
            invalidateSelf();
            if (t != t2) {
                mo8518b0();
            }
        }
    }

    /* renamed from: p */
    public void mo8567p(int i) {
        mo8553k(this.f7529i0.getResources().getDimension(i));
    }

    /* renamed from: q */
    public void mo8568q(float f) {
        if (this.f7525e0 != f) {
            this.f7525e0 = f;
            invalidateSelf();
            mo8518b0();
        }
    }

    /* renamed from: q */
    public void mo8569q(int i) {
        mo8555l(this.f7529i0.getResources().getDimension(i));
    }

    /* renamed from: r */
    public void mo8570r(float f) {
        if (this.f7524d0 != f) {
            this.f7524d0 = f;
            invalidateSelf();
            mo8518b0();
        }
    }

    /* renamed from: r */
    public void mo8571r(int i) {
        mo8521c(C3103a.m12557c(this.f7529i0, i));
    }

    /* renamed from: s */
    public void mo8572s(int i) {
        mo8557m(this.f7529i0.getResources().getDimension(i));
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f7545y0 != i) {
            this.f7545y0 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f7546z0 != colorFilter) {
            this.f7546z0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f7487B0 != colorStateList) {
            this.f7487B0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(Mode mode) {
        if (this.f7489C0 != mode) {
            this.f7489C0 = mode;
            this.f7486A0 = C4449a.m18147a(this, this.f7487B0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m10706h0()) {
            visible |= this.f7506L.setVisible(z, z2);
        }
        if (m10703g0()) {
            visible |= this.f7518X.setVisible(z, z2);
        }
        if (m10709i0()) {
            visible |= this.f7511Q.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public float mo8577t() {
        if (m10706h0() || m10703g0()) {
            return this.f7522b0 + this.f7508N + this.f7523c0;
        }
        return 0.0f;
    }

    /* renamed from: t */
    public void mo8578t(int i) {
        mo8559n(this.f7529i0.getResources().getDimension(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public float mo8579u() {
        if (m10709i0()) {
            return this.f7526f0 + this.f7514T + this.f7527g0;
        }
        return 0.0f;
    }

    /* renamed from: u */
    public void mo8580u(int i) {
        mo8533f(C3103a.m12556b(this.f7529i0, i));
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v */
    public Drawable mo8582v() {
        return this.f7518X;
    }

    /* renamed from: v */
    public void mo8583v(int i) {
        mo8509a(C4424h.m18017a(this.f7529i0, i));
    }

    /* renamed from: w */
    public ColorStateList mo8584w() {
        return this.f7490D;
    }

    /* renamed from: w */
    public void mo8585w(int i) {
        mo8561o(this.f7529i0.getResources().getDimension(i));
    }

    /* renamed from: x */
    public float mo8586x() {
        return this.f7505K0 ? mo13086n() : this.f7494F;
    }

    /* renamed from: x */
    public void mo8587x(int i) {
        mo8566p(this.f7529i0.getResources().getDimension(i));
    }

    /* renamed from: y */
    public float mo8588y() {
        return this.f7528h0;
    }

    /* renamed from: y */
    public void mo8589y(int i) {
        this.f7503J0 = i;
    }

    /* renamed from: z */
    public Drawable mo8590z() {
        Drawable drawable = this.f7506L;
        if (drawable != null) {
            return C0371a.m1912h(drawable);
        }
        return null;
    }

    /* renamed from: z */
    public void mo8591z(int i) {
        mo8537g(C3103a.m12556b(this.f7529i0, i));
    }
}
