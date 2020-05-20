package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: androidx.appcompat.widget.p */
class C0255p {

    /* renamed from: c */
    private static final int[] f1140c = {16843067, 16843068};

    /* renamed from: a */
    private final ProgressBar f1141a;

    /* renamed from: b */
    private Bitmap f1142b;

    C0255p(ProgressBar progressBar) {
        this.f1141a = progressBar;
    }

    /* renamed from: a */
    private Drawable mo1667a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m1259a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r8v4, types: [android.graphics.drawable.ClipDrawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1259a(android.graphics.drawable.Drawable r8, boolean r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.core.graphics.drawable.C0373c
            if (r0 == 0) goto L_0x0016
            r0 = r8
            androidx.core.graphics.drawable.c r0 = (androidx.core.graphics.drawable.C0373c) r0
            android.graphics.drawable.Drawable r1 = r0.mo2244a()
            if (r1 == 0) goto L_0x009a
            android.graphics.drawable.Drawable r9 = r7.m1259a(r1, r9)
            r0.mo2245a(r9)
            goto L_0x009a
        L_0x0016:
            boolean r0 = r8 instanceof android.graphics.drawable.LayerDrawable
            r1 = 1
            if (r0 == 0) goto L_0x0058
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            int r9 = r8.getNumberOfLayers()
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r9]
            r2 = 0
            r3 = 0
        L_0x0025:
            if (r3 >= r9) goto L_0x0046
            int r4 = r8.getId(r3)
            android.graphics.drawable.Drawable r5 = r8.getDrawable(r3)
            r6 = 16908301(0x102000d, float:2.3877265E-38)
            if (r4 == r6) goto L_0x003c
            r6 = 16908303(0x102000f, float:2.387727E-38)
            if (r4 != r6) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r4 = 0
            goto L_0x003d
        L_0x003c:
            r4 = 1
        L_0x003d:
            android.graphics.drawable.Drawable r4 = r7.m1259a(r5, r4)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L_0x0025
        L_0x0046:
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r1.<init>(r0)
        L_0x004b:
            if (r2 >= r9) goto L_0x0057
            int r0 = r8.getId(r2)
            r1.setId(r2, r0)
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0057:
            return r1
        L_0x0058:
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x009a
            android.graphics.drawable.BitmapDrawable r8 = (android.graphics.drawable.BitmapDrawable) r8
            android.graphics.Bitmap r0 = r8.getBitmap()
            android.graphics.Bitmap r2 = r7.f1142b
            if (r2 != 0) goto L_0x0068
            r7.f1142b = r0
        L_0x0068:
            android.graphics.drawable.ShapeDrawable r2 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.Shape r3 = r7.mo1668b()
            r2.<init>(r3)
            android.graphics.BitmapShader r3 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.CLAMP
            r3.<init>(r0, r4, r5)
            android.graphics.Paint r0 = r2.getPaint()
            r0.setShader(r3)
            android.graphics.Paint r0 = r2.getPaint()
            android.graphics.Paint r8 = r8.getPaint()
            android.graphics.ColorFilter r8 = r8.getColorFilter()
            r0.setColorFilter(r8)
            if (r9 == 0) goto L_0x0099
            android.graphics.drawable.ClipDrawable r8 = new android.graphics.drawable.ClipDrawable
            r9 = 3
            r8.<init>(r2, r9, r1)
            r2 = r8
        L_0x0099:
            return r2
        L_0x009a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0255p.m1259a(android.graphics.drawable.Drawable, boolean):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    private Shape mo1668b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bitmap mo1647a() {
        return this.f1142b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1648a(AttributeSet attributeSet, int i) {
        C0275t0 a = C0275t0.m1311a(this.f1141a.getContext(), attributeSet, f1140c, i, 0);
        Drawable c = a.mo1743c(0);
        if (c != null) {
            this.f1141a.setIndeterminateDrawable(mo1667a(c));
        }
        Drawable c2 = a.mo1743c(1);
        if (c2 != null) {
            this.f1141a.setProgressDrawable(m1259a(c2, false));
        }
        a.mo1737a();
    }
}
