package p147g.p156d.p157a.p185c.p187b0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build.VERSION;

/* renamed from: g.d.a.c.b0.l */
public class C4393l {

    /* renamed from: a */
    private final C4396m[] f11652a = new C4396m[4];

    /* renamed from: b */
    private final Matrix[] f11653b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f11654c = new Matrix[4];

    /* renamed from: d */
    private final PointF f11655d = new PointF();

    /* renamed from: e */
    private final Path f11656e = new Path();

    /* renamed from: f */
    private final Path f11657f = new Path();

    /* renamed from: g */
    private final C4396m f11658g = new C4396m();

    /* renamed from: h */
    private final float[] f11659h = new float[2];

    /* renamed from: i */
    private final float[] f11660i = new float[2];

    /* renamed from: j */
    private boolean f11661j = true;

    /* renamed from: g.d.a.c.b0.l$a */
    public interface C4394a {
        /* renamed from: a */
        void mo13093a(C4396m mVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo13094b(C4396m mVar, Matrix matrix, int i);
    }

    /* renamed from: g.d.a.c.b0.l$b */
    static final class C4395b {

        /* renamed from: a */
        public final C4389k f11662a;

        /* renamed from: b */
        public final Path f11663b;

        /* renamed from: c */
        public final RectF f11664c;

        /* renamed from: d */
        public final C4394a f11665d;

        /* renamed from: e */
        public final float f11666e;

        C4395b(C4389k kVar, float f, RectF rectF, C4394a aVar, Path path) {
            this.f11665d = aVar;
            this.f11662a = kVar;
            this.f11666e = f;
            this.f11664c = rectF;
            this.f11663b = path;
        }
    }

    public C4393l() {
        for (int i = 0; i < 4; i++) {
            this.f11652a[i] = new C4396m();
            this.f11653b[i] = new Matrix();
            this.f11654c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m17937a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: a */
    private float m17938a(RectF rectF, int i) {
        float centerX;
        float f;
        float[] fArr = this.f11659h;
        C4396m[] mVarArr = this.f11652a;
        fArr[0] = mVarArr[i].f11669c;
        fArr[1] = mVarArr[i].f11670d;
        this.f11653b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            centerX = rectF.centerX();
            f = this.f11659h[0];
        } else {
            centerX = rectF.centerY();
            f = this.f11659h[1];
        }
        return Math.abs(centerX - f);
    }

    /* renamed from: a */
    private C4378c m17939a(int i, C4389k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.mo13114l() : kVar.mo13112j() : kVar.mo13105c() : kVar.mo13107e();
    }

    /* renamed from: a */
    private void m17940a(int i, RectF rectF, PointF pointF) {
        float f;
        float f2;
        float f3;
        if (i == 1) {
            f3 = rectF.right;
            f2 = rectF.bottom;
        } else if (i != 2) {
            f = i != 3 ? rectF.right : rectF.left;
            f2 = rectF.top;
        } else {
            f3 = rectF.left;
            f2 = rectF.bottom;
        }
        pointF.set(f, f2);
    }

    /* renamed from: a */
    private void m17941a(C4395b bVar, int i) {
        this.f11659h[0] = this.f11652a[i].mo13144c();
        this.f11659h[1] = this.f11652a[i].mo13145d();
        this.f11653b[i].mapPoints(this.f11659h);
        Path path = bVar.f11663b;
        float[] fArr = this.f11659h;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f11652a[i].mo13141a(this.f11653b[i], bVar.f11663b);
        C4394a aVar = bVar.f11665d;
        if (aVar != null) {
            aVar.mo13094b(this.f11652a[i], this.f11653b[i], i);
        }
    }

    /* renamed from: a */
    private boolean m17942a(Path path, int i) {
        Path path2 = new Path();
        this.f11652a[i].mo13141a(this.f11653b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* renamed from: b */
    private C4379d m17943b(int i, C4389k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.mo13113k() : kVar.mo13111i() : kVar.mo13104b() : kVar.mo13106d();
    }

    /* renamed from: b */
    private void m17944b(int i) {
        this.f11659h[0] = this.f11652a[i].mo13136a();
        this.f11659h[1] = this.f11652a[i].mo13142b();
        this.f11653b[i].mapPoints(this.f11659h);
        float a = m17937a(i);
        this.f11654c[i].reset();
        Matrix matrix = this.f11654c[i];
        float[] fArr = this.f11659h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f11654c[i].preRotate(a);
    }

    /* renamed from: b */
    private void m17945b(C4395b bVar, int i) {
        Path path;
        Matrix matrix;
        C4396m mVar;
        int i2 = (i + 1) % 4;
        this.f11659h[0] = this.f11652a[i].mo13136a();
        this.f11659h[1] = this.f11652a[i].mo13142b();
        this.f11653b[i].mapPoints(this.f11659h);
        this.f11660i[0] = this.f11652a[i2].mo13144c();
        this.f11660i[1] = this.f11652a[i2].mo13145d();
        this.f11653b[i2].mapPoints(this.f11660i);
        float[] fArr = this.f11659h;
        float f = fArr[0];
        float[] fArr2 = this.f11660i;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float a = m17938a(bVar.f11664c, i);
        this.f11658g.mo13143b(0.0f, 0.0f);
        C4381f c = m17946c(i, bVar.f11662a);
        c.mo8002a(max, a, bVar.f11666e, this.f11658g);
        Path path2 = new Path();
        this.f11658g.mo13141a(this.f11654c[i], path2);
        if (!this.f11661j || VERSION.SDK_INT < 19 || (!c.mo13052b() && !m17942a(path2, i) && !m17942a(path2, i2))) {
            mVar = this.f11658g;
            matrix = this.f11654c[i];
            path = bVar.f11663b;
        } else {
            path2.op(path2, this.f11657f, Op.DIFFERENCE);
            this.f11659h[0] = this.f11658g.mo13144c();
            this.f11659h[1] = this.f11658g.mo13145d();
            this.f11654c[i].mapPoints(this.f11659h);
            Path path3 = this.f11656e;
            float[] fArr3 = this.f11659h;
            path3.moveTo(fArr3[0], fArr3[1]);
            mVar = this.f11658g;
            matrix = this.f11654c[i];
            path = this.f11656e;
        }
        mVar.mo13141a(matrix, path);
        C4394a aVar = bVar.f11665d;
        if (aVar != null) {
            aVar.mo13093a(this.f11658g, this.f11654c[i], i);
        }
    }

    /* renamed from: c */
    private C4381f m17946c(int i, C4389k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.mo13109g() : kVar.mo13110h() : kVar.mo13108f() : kVar.mo13100a();
    }

    /* renamed from: c */
    private void m17947c(C4395b bVar, int i) {
        m17943b(i, bVar.f11662a).mo13051a(this.f11652a[i], 90.0f, bVar.f11666e, bVar.f11664c, m17939a(i, bVar.f11662a));
        float a = m17937a(i);
        this.f11653b[i].reset();
        m17940a(i, bVar.f11664c, this.f11655d);
        Matrix matrix = this.f11653b[i];
        PointF pointF = this.f11655d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f11653b[i].preRotate(a);
    }

    /* renamed from: a */
    public void mo13134a(C4389k kVar, float f, RectF rectF, Path path) {
        mo13135a(kVar, f, rectF, null, path);
    }

    /* renamed from: a */
    public void mo13135a(C4389k kVar, float f, RectF rectF, C4394a aVar, Path path) {
        path.rewind();
        this.f11656e.rewind();
        this.f11657f.rewind();
        this.f11657f.addRect(rectF, Direction.CW);
        C4395b bVar = new C4395b(kVar, f, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            m17947c(bVar, i);
            m17944b(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m17941a(bVar, i2);
            m17945b(bVar, i2);
        }
        path.close();
        this.f11656e.close();
        if (VERSION.SDK_INT >= 19 && !this.f11656e.isEmpty()) {
            path.op(this.f11656e, Op.UNION);
        }
    }
}
