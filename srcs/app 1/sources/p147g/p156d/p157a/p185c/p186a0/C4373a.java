package p147g.p156d.p157a.p185c.p186a0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Shader.TileMode;
import p071f.p097h.p100f.C3257d;

/* renamed from: g.d.a.c.a0.a */
public class C4373a {

    /* renamed from: i */
    private static final int[] f11562i = new int[3];

    /* renamed from: j */
    private static final float[] f11563j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    private static final int[] f11564k = new int[4];

    /* renamed from: l */
    private static final float[] f11565l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f11566a;

    /* renamed from: b */
    private final Paint f11567b;

    /* renamed from: c */
    private final Paint f11568c;

    /* renamed from: d */
    private int f11569d;

    /* renamed from: e */
    private int f11570e;

    /* renamed from: f */
    private int f11571f;

    /* renamed from: g */
    private final Path f11572g;

    /* renamed from: h */
    private Paint f11573h;

    public C4373a() {
        this(-16777216);
    }

    public C4373a(int i) {
        this.f11572g = new Path();
        this.f11573h = new Paint();
        mo13042a(i);
        this.f11573h.setColor(0);
        Paint paint = new Paint(4);
        this.f11567b = paint;
        paint.setStyle(Style.FILL);
        Paint paint2 = new Paint();
        this.f11566a = paint2;
        paint2.setColor(this.f11569d);
        this.f11568c = new Paint(this.f11567b);
    }

    /* renamed from: a */
    public Paint mo13041a() {
        return this.f11566a;
    }

    /* renamed from: a */
    public void mo13042a(int i) {
        this.f11569d = C3257d.m13346c(i, 68);
        this.f11570e = C3257d.m13346c(i, 20);
        this.f11571f = C3257d.m13346c(i, 0);
    }

    /* renamed from: a */
    public void mo13043a(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = f11562i;
        iArr[0] = this.f11571f;
        iArr[1] = this.f11570e;
        iArr[2] = this.f11569d;
        Paint paint = this.f11568c;
        float f = rectF.left;
        LinearGradient linearGradient = new LinearGradient(f, rectF.top, f, rectF.bottom, f11562i, f11563j, TileMode.CLAMP);
        paint.setShader(linearGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f11568c);
        canvas.restore();
    }

    /* renamed from: a */
    public void mo13044a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i2 = i;
        float f3 = f2;
        boolean z = f3 < 0.0f;
        Path path = this.f11572g;
        if (z) {
            int[] iArr = f11564k;
            iArr[0] = 0;
            iArr[1] = this.f11571f;
            iArr[2] = this.f11570e;
            iArr[3] = this.f11569d;
            float f4 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f, f3);
            path.close();
            float f5 = (float) (-i2);
            rectF2.inset(f5, f5);
            int[] iArr2 = f11564k;
            iArr2[0] = 0;
            iArr2[1] = this.f11569d;
            iArr2[2] = this.f11570e;
            iArr2[3] = this.f11571f;
        }
        float width = 1.0f - (((float) i2) / (rectF.width() / 2.0f));
        float f6 = ((1.0f - width) / 2.0f) + width;
        float[] fArr = f11565l;
        fArr[1] = width;
        fArr[2] = f6;
        Paint paint = this.f11567b;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f11564k, f11565l, TileMode.CLAMP);
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas2.clipPath(path, Op.DIFFERENCE);
            canvas2.drawPath(path, this.f11573h);
        }
        canvas.drawArc(rectF, f, f2, true, this.f11567b);
        canvas.restore();
    }
}
