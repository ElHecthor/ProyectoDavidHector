package p071f.p140w.p141a.p142a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0371a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p071f.p088e.C3162a;
import p071f.p097h.p098e.p099c.C3239b;
import p071f.p097h.p098e.p099c.C3252g;
import p071f.p097h.p100f.C3259f;
import p071f.p097h.p100f.C3259f.C3261b;

/* renamed from: f.w.a.a.i */
public class C3647i extends C3646h {

    /* renamed from: o */
    static final Mode f10225o = Mode.SRC_IN;

    /* renamed from: g */
    private C3655h f10226g;

    /* renamed from: h */
    private PorterDuffColorFilter f10227h;

    /* renamed from: i */
    private ColorFilter f10228i;

    /* renamed from: j */
    private boolean f10229j;

    /* renamed from: k */
    private boolean f10230k;

    /* renamed from: l */
    private final float[] f10231l;

    /* renamed from: m */
    private final Matrix f10232m;

    /* renamed from: n */
    private final Rect f10233n;

    /* renamed from: f.w.a.a.i$b */
    private static class C3649b extends C3653f {
        C3649b() {
        }

        C3649b(C3649b bVar) {
            super(bVar);
        }

        /* renamed from: a */
        private void m14837a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f10260b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f10259a = C3259f.m13354a(string2);
            }
            this.f10261c = C3252g.m13337b(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        /* renamed from: a */
        public void mo11501a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            if (C3252g.m13336a(xmlPullParser, "pathData")) {
                TypedArray a = C3252g.m13332a(resources, theme, attributeSet, C3634a.f10200d);
                m14837a(a, xmlPullParser);
                a.recycle();
            }
        }

        /* renamed from: b */
        public boolean mo11502b() {
            return true;
        }
    }

    /* renamed from: f.w.a.a.i$c */
    private static class C3650c extends C3653f {

        /* renamed from: e */
        private int[] f10234e;

        /* renamed from: f */
        C3239b f10235f;

        /* renamed from: g */
        float f10236g = 0.0f;

        /* renamed from: h */
        C3239b f10237h;

        /* renamed from: i */
        float f10238i = 1.0f;

        /* renamed from: j */
        float f10239j = 1.0f;

        /* renamed from: k */
        float f10240k = 0.0f;

        /* renamed from: l */
        float f10241l = 1.0f;

        /* renamed from: m */
        float f10242m = 0.0f;

        /* renamed from: n */
        Cap f10243n = Cap.BUTT;

        /* renamed from: o */
        Join f10244o = Join.MITER;

        /* renamed from: p */
        float f10245p = 4.0f;

        C3650c() {
        }

        C3650c(C3650c cVar) {
            super(cVar);
            this.f10234e = cVar.f10234e;
            this.f10235f = cVar.f10235f;
            this.f10236g = cVar.f10236g;
            this.f10238i = cVar.f10238i;
            this.f10237h = cVar.f10237h;
            this.f10261c = cVar.f10261c;
            this.f10239j = cVar.f10239j;
            this.f10240k = cVar.f10240k;
            this.f10241l = cVar.f10241l;
            this.f10242m = cVar.f10242m;
            this.f10243n = cVar.f10243n;
            this.f10244o = cVar.f10244o;
            this.f10245p = cVar.f10245p;
        }

        /* renamed from: a */
        private Cap m14840a(int i, Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Cap.SQUARE : Cap.ROUND : Cap.BUTT;
        }

        /* renamed from: a */
        private Join m14841a(int i, Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Join.BEVEL : Join.ROUND : Join.MITER;
        }

        /* renamed from: a */
        private void m14842a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) {
            this.f10234e = null;
            if (C3252g.m13336a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f10260b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f10259a = C3259f.m13354a(string2);
                }
                Theme theme2 = theme;
                this.f10237h = C3252g.m13333a(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f10239j = C3252g.m13328a(typedArray, xmlPullParser, "fillAlpha", 12, this.f10239j);
                this.f10243n = m14840a(C3252g.m13337b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f10243n);
                this.f10244o = m14841a(C3252g.m13337b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f10244o);
                this.f10245p = C3252g.m13328a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f10245p);
                this.f10235f = C3252g.m13333a(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f10238i = C3252g.m13328a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f10238i);
                this.f10236g = C3252g.m13328a(typedArray, xmlPullParser, "strokeWidth", 4, this.f10236g);
                this.f10241l = C3252g.m13328a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f10241l);
                this.f10242m = C3252g.m13328a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f10242m);
                this.f10240k = C3252g.m13328a(typedArray, xmlPullParser, "trimPathStart", 5, this.f10240k);
                this.f10261c = C3252g.m13337b(typedArray, xmlPullParser, "fillType", 13, this.f10261c);
            }
        }

        /* renamed from: a */
        public void mo11503a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C3252g.m13332a(resources, theme, attributeSet, C3634a.f10199c);
            m14842a(a, xmlPullParser, theme);
            a.recycle();
        }

        /* renamed from: a */
        public boolean mo11504a() {
            return this.f10237h.mo10588d() || this.f10235f.mo10588d();
        }

        /* renamed from: a */
        public boolean mo11505a(int[] iArr) {
            return this.f10235f.mo10585a(iArr) | this.f10237h.mo10585a(iArr);
        }

        /* access modifiers changed from: 0000 */
        public float getFillAlpha() {
            return this.f10239j;
        }

        /* access modifiers changed from: 0000 */
        public int getFillColor() {
            return this.f10237h.mo10583a();
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeAlpha() {
            return this.f10238i;
        }

        /* access modifiers changed from: 0000 */
        public int getStrokeColor() {
            return this.f10235f.mo10583a();
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeWidth() {
            return this.f10236g;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathEnd() {
            return this.f10241l;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathOffset() {
            return this.f10242m;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathStart() {
            return this.f10240k;
        }

        /* access modifiers changed from: 0000 */
        public void setFillAlpha(float f) {
            this.f10239j = f;
        }

        /* access modifiers changed from: 0000 */
        public void setFillColor(int i) {
            this.f10237h.mo10584a(i);
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeAlpha(float f) {
            this.f10238i = f;
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeColor(int i) {
            this.f10235f.mo10584a(i);
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeWidth(float f) {
            this.f10236g = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathEnd(float f) {
            this.f10241l = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathOffset(float f) {
            this.f10242m = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathStart(float f) {
            this.f10240k = f;
        }
    }

    /* renamed from: f.w.a.a.i$d */
    private static class C3651d extends C3652e {

        /* renamed from: a */
        final Matrix f10246a = new Matrix();

        /* renamed from: b */
        final ArrayList<C3652e> f10247b = new ArrayList<>();

        /* renamed from: c */
        float f10248c = 0.0f;

        /* renamed from: d */
        private float f10249d = 0.0f;

        /* renamed from: e */
        private float f10250e = 0.0f;

        /* renamed from: f */
        private float f10251f = 1.0f;

        /* renamed from: g */
        private float f10252g = 1.0f;

        /* renamed from: h */
        private float f10253h = 0.0f;

        /* renamed from: i */
        private float f10254i = 0.0f;

        /* renamed from: j */
        final Matrix f10255j = new Matrix();

        /* renamed from: k */
        int f10256k;

        /* renamed from: l */
        private int[] f10257l;

        /* renamed from: m */
        private String f10258m = null;

        public C3651d() {
            super();
        }

        public C3651d(C3651d dVar, C3162a<String, Object> aVar) {
            C3653f fVar;
            super();
            this.f10248c = dVar.f10248c;
            this.f10249d = dVar.f10249d;
            this.f10250e = dVar.f10250e;
            this.f10251f = dVar.f10251f;
            this.f10252g = dVar.f10252g;
            this.f10253h = dVar.f10253h;
            this.f10254i = dVar.f10254i;
            this.f10257l = dVar.f10257l;
            String str = dVar.f10258m;
            this.f10258m = str;
            this.f10256k = dVar.f10256k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f10255j.set(dVar.f10255j);
            ArrayList<C3652e> arrayList = dVar.f10247b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C3651d) {
                    this.f10247b.add(new C3651d((C3651d) obj, aVar));
                } else {
                    if (obj instanceof C3650c) {
                        fVar = new C3650c((C3650c) obj);
                    } else if (obj instanceof C3649b) {
                        fVar = new C3649b((C3649b) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f10247b.add(fVar);
                    String str2 = fVar.f10260b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m14846a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f10257l = null;
            this.f10248c = C3252g.m13328a(typedArray, xmlPullParser, "rotation", 5, this.f10248c);
            this.f10249d = typedArray.getFloat(1, this.f10249d);
            this.f10250e = typedArray.getFloat(2, this.f10250e);
            this.f10251f = C3252g.m13328a(typedArray, xmlPullParser, "scaleX", 3, this.f10251f);
            this.f10252g = C3252g.m13328a(typedArray, xmlPullParser, "scaleY", 4, this.f10252g);
            this.f10253h = C3252g.m13328a(typedArray, xmlPullParser, "translateX", 6, this.f10253h);
            this.f10254i = C3252g.m13328a(typedArray, xmlPullParser, "translateY", 7, this.f10254i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f10258m = string;
            }
            m14847b();
        }

        /* renamed from: b */
        private void m14847b() {
            this.f10255j.reset();
            this.f10255j.postTranslate(-this.f10249d, -this.f10250e);
            this.f10255j.postScale(this.f10251f, this.f10252g);
            this.f10255j.postRotate(this.f10248c, 0.0f, 0.0f);
            this.f10255j.postTranslate(this.f10253h + this.f10249d, this.f10254i + this.f10250e);
        }

        /* renamed from: a */
        public void mo11522a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C3252g.m13332a(resources, theme, attributeSet, C3634a.f10198b);
            m14846a(a, xmlPullParser);
            a.recycle();
        }

        /* renamed from: a */
        public boolean mo11504a() {
            for (int i = 0; i < this.f10247b.size(); i++) {
                if (((C3652e) this.f10247b.get(i)).mo11504a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo11505a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f10247b.size(); i++) {
                z |= ((C3652e) this.f10247b.get(i)).mo11505a(iArr);
            }
            return z;
        }

        public String getGroupName() {
            return this.f10258m;
        }

        public Matrix getLocalMatrix() {
            return this.f10255j;
        }

        public float getPivotX() {
            return this.f10249d;
        }

        public float getPivotY() {
            return this.f10250e;
        }

        public float getRotation() {
            return this.f10248c;
        }

        public float getScaleX() {
            return this.f10251f;
        }

        public float getScaleY() {
            return this.f10252g;
        }

        public float getTranslateX() {
            return this.f10253h;
        }

        public float getTranslateY() {
            return this.f10254i;
        }

        public void setPivotX(float f) {
            if (f != this.f10249d) {
                this.f10249d = f;
                m14847b();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f10250e) {
                this.f10250e = f;
                m14847b();
            }
        }

        public void setRotation(float f) {
            if (f != this.f10248c) {
                this.f10248c = f;
                m14847b();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f10251f) {
                this.f10251f = f;
                m14847b();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f10252g) {
                this.f10252g = f;
                m14847b();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f10253h) {
                this.f10253h = f;
                m14847b();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f10254i) {
                this.f10254i = f;
                m14847b();
            }
        }
    }

    /* renamed from: f.w.a.a.i$e */
    private static abstract class C3652e {
        private C3652e() {
        }

        /* renamed from: a */
        public boolean mo11504a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo11505a(int[] iArr) {
            return false;
        }
    }

    /* renamed from: f.w.a.a.i$f */
    private static abstract class C3653f extends C3652e {

        /* renamed from: a */
        protected C3261b[] f10259a = null;

        /* renamed from: b */
        String f10260b;

        /* renamed from: c */
        int f10261c = 0;

        /* renamed from: d */
        int f10262d;

        public C3653f() {
            super();
        }

        public C3653f(C3653f fVar) {
            super();
            this.f10260b = fVar.f10260b;
            this.f10262d = fVar.f10262d;
            this.f10259a = C3259f.m13355a(fVar.f10259a);
        }

        /* renamed from: a */
        public void mo11539a(Path path) {
            path.reset();
            C3261b[] bVarArr = this.f10259a;
            if (bVarArr != null) {
                C3261b.m13362a(bVarArr, path);
            }
        }

        /* renamed from: b */
        public boolean mo11502b() {
            return false;
        }

        public C3261b[] getPathData() {
            return this.f10259a;
        }

        public String getPathName() {
            return this.f10260b;
        }

        public void setPathData(C3261b[] bVarArr) {
            if (!C3259f.m13352a(this.f10259a, bVarArr)) {
                this.f10259a = C3259f.m13355a(bVarArr);
            } else {
                C3259f.m13357b(this.f10259a, bVarArr);
            }
        }
    }

    /* renamed from: f.w.a.a.i$g */
    private static class C3654g {

        /* renamed from: q */
        private static final Matrix f10263q = new Matrix();

        /* renamed from: a */
        private final Path f10264a;

        /* renamed from: b */
        private final Path f10265b;

        /* renamed from: c */
        private final Matrix f10266c;

        /* renamed from: d */
        Paint f10267d;

        /* renamed from: e */
        Paint f10268e;

        /* renamed from: f */
        private PathMeasure f10269f;

        /* renamed from: g */
        private int f10270g;

        /* renamed from: h */
        final C3651d f10271h;

        /* renamed from: i */
        float f10272i;

        /* renamed from: j */
        float f10273j;

        /* renamed from: k */
        float f10274k;

        /* renamed from: l */
        float f10275l;

        /* renamed from: m */
        int f10276m;

        /* renamed from: n */
        String f10277n;

        /* renamed from: o */
        Boolean f10278o;

        /* renamed from: p */
        final C3162a<String, Object> f10279p;

        public C3654g() {
            this.f10266c = new Matrix();
            this.f10272i = 0.0f;
            this.f10273j = 0.0f;
            this.f10274k = 0.0f;
            this.f10275l = 0.0f;
            this.f10276m = 255;
            this.f10277n = null;
            this.f10278o = null;
            this.f10279p = new C3162a<>();
            this.f10271h = new C3651d();
            this.f10264a = new Path();
            this.f10265b = new Path();
        }

        public C3654g(C3654g gVar) {
            this.f10266c = new Matrix();
            this.f10272i = 0.0f;
            this.f10273j = 0.0f;
            this.f10274k = 0.0f;
            this.f10275l = 0.0f;
            this.f10276m = 255;
            this.f10277n = null;
            this.f10278o = null;
            C3162a<String, Object> aVar = new C3162a<>();
            this.f10279p = aVar;
            this.f10271h = new C3651d(gVar.f10271h, aVar);
            this.f10264a = new Path(gVar.f10264a);
            this.f10265b = new Path(gVar.f10265b);
            this.f10272i = gVar.f10272i;
            this.f10273j = gVar.f10273j;
            this.f10274k = gVar.f10274k;
            this.f10275l = gVar.f10275l;
            this.f10270g = gVar.f10270g;
            this.f10276m = gVar.f10276m;
            this.f10277n = gVar.f10277n;
            String str = gVar.f10277n;
            if (str != null) {
                this.f10279p.put(str, this);
            }
            this.f10278o = gVar.f10278o;
        }

        /* renamed from: a */
        private static float m14855a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private float m14856a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
            float hypot2 = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            float a = m14855a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        private void m14857a(C3651d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f10246a.set(matrix);
            dVar.f10246a.preConcat(dVar.f10255j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f10247b.size(); i3++) {
                C3652e eVar = (C3652e) dVar.f10247b.get(i3);
                if (eVar instanceof C3651d) {
                    m14857a((C3651d) eVar, dVar.f10246a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C3653f) {
                    m14858a(dVar, (C3653f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        private void m14858a(C3651d dVar, C3653f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f10274k;
            float f2 = ((float) i2) / this.f10275l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f10246a;
            this.f10266c.set(matrix);
            this.f10266c.postScale(f, f2);
            float a = m14856a(matrix);
            if (a != 0.0f) {
                fVar.mo11539a(this.f10264a);
                Path path = this.f10264a;
                this.f10265b.reset();
                if (fVar.mo11502b()) {
                    this.f10265b.setFillType(fVar.f10261c == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                    this.f10265b.addPath(path, this.f10266c);
                    canvas.clipPath(this.f10265b);
                } else {
                    C3650c cVar = (C3650c) fVar;
                    if (!(cVar.f10240k == 0.0f && cVar.f10241l == 1.0f)) {
                        float f3 = cVar.f10240k;
                        float f4 = cVar.f10242m;
                        float f5 = (f3 + f4) % 1.0f;
                        float f6 = (cVar.f10241l + f4) % 1.0f;
                        if (this.f10269f == null) {
                            this.f10269f = new PathMeasure();
                        }
                        this.f10269f.setPath(this.f10264a, false);
                        float length = this.f10269f.getLength();
                        float f7 = f5 * length;
                        float f8 = f6 * length;
                        path.reset();
                        if (f7 > f8) {
                            this.f10269f.getSegment(f7, length, path, true);
                            this.f10269f.getSegment(0.0f, f8, path, true);
                        } else {
                            this.f10269f.getSegment(f7, f8, path, true);
                        }
                        path.rLineTo(0.0f, 0.0f);
                    }
                    this.f10265b.addPath(path, this.f10266c);
                    if (cVar.f10237h.mo10589e()) {
                        C3239b bVar = cVar.f10237h;
                        if (this.f10268e == null) {
                            Paint paint = new Paint(1);
                            this.f10268e = paint;
                            paint.setStyle(Style.FILL);
                        }
                        Paint paint2 = this.f10268e;
                        if (bVar.mo10587c()) {
                            Shader b = bVar.mo10586b();
                            b.setLocalMatrix(this.f10266c);
                            paint2.setShader(b);
                            paint2.setAlpha(Math.round(cVar.f10239j * 255.0f));
                        } else {
                            paint2.setShader(null);
                            paint2.setAlpha(255);
                            paint2.setColor(C3647i.m14828a(bVar.mo10583a(), cVar.f10239j));
                        }
                        paint2.setColorFilter(colorFilter);
                        this.f10265b.setFillType(cVar.f10261c == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                        canvas.drawPath(this.f10265b, paint2);
                    }
                    if (cVar.f10235f.mo10589e()) {
                        C3239b bVar2 = cVar.f10235f;
                        if (this.f10267d == null) {
                            Paint paint3 = new Paint(1);
                            this.f10267d = paint3;
                            paint3.setStyle(Style.STROKE);
                        }
                        Paint paint4 = this.f10267d;
                        Join join = cVar.f10244o;
                        if (join != null) {
                            paint4.setStrokeJoin(join);
                        }
                        Cap cap = cVar.f10243n;
                        if (cap != null) {
                            paint4.setStrokeCap(cap);
                        }
                        paint4.setStrokeMiter(cVar.f10245p);
                        if (bVar2.mo10587c()) {
                            Shader b2 = bVar2.mo10586b();
                            b2.setLocalMatrix(this.f10266c);
                            paint4.setShader(b2);
                            paint4.setAlpha(Math.round(cVar.f10238i * 255.0f));
                        } else {
                            paint4.setShader(null);
                            paint4.setAlpha(255);
                            paint4.setColor(C3647i.m14828a(bVar2.mo10583a(), cVar.f10238i));
                        }
                        paint4.setColorFilter(colorFilter);
                        paint4.setStrokeWidth(cVar.f10236g * min * a);
                        canvas.drawPath(this.f10265b, paint4);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo11543a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m14857a(this.f10271h, f10263q, canvas, i, i2, colorFilter);
        }

        /* renamed from: a */
        public boolean mo11544a() {
            if (this.f10278o == null) {
                this.f10278o = Boolean.valueOf(this.f10271h.mo11504a());
            }
            return this.f10278o.booleanValue();
        }

        /* renamed from: a */
        public boolean mo11545a(int[] iArr) {
            return this.f10271h.mo11505a(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f10276m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f10276m = i;
        }
    }

    /* renamed from: f.w.a.a.i$h */
    private static class C3655h extends ConstantState {

        /* renamed from: a */
        int f10280a;

        /* renamed from: b */
        C3654g f10281b;

        /* renamed from: c */
        ColorStateList f10282c;

        /* renamed from: d */
        Mode f10283d;

        /* renamed from: e */
        boolean f10284e;

        /* renamed from: f */
        Bitmap f10285f;

        /* renamed from: g */
        ColorStateList f10286g;

        /* renamed from: h */
        Mode f10287h;

        /* renamed from: i */
        int f10288i;

        /* renamed from: j */
        boolean f10289j;

        /* renamed from: k */
        boolean f10290k;

        /* renamed from: l */
        Paint f10291l;

        public C3655h() {
            this.f10282c = null;
            this.f10283d = C3647i.f10225o;
            this.f10281b = new C3654g();
        }

        public C3655h(C3655h hVar) {
            this.f10282c = null;
            this.f10283d = C3647i.f10225o;
            if (hVar != null) {
                this.f10280a = hVar.f10280a;
                C3654g gVar = new C3654g(hVar.f10281b);
                this.f10281b = gVar;
                if (hVar.f10281b.f10268e != null) {
                    gVar.f10268e = new Paint(hVar.f10281b.f10268e);
                }
                if (hVar.f10281b.f10267d != null) {
                    this.f10281b.f10267d = new Paint(hVar.f10281b.f10267d);
                }
                this.f10282c = hVar.f10282c;
                this.f10283d = hVar.f10283d;
                this.f10284e = hVar.f10284e;
            }
        }

        /* renamed from: a */
        public Paint mo11550a(ColorFilter colorFilter) {
            if (!mo11556b() && colorFilter == null) {
                return null;
            }
            if (this.f10291l == null) {
                Paint paint = new Paint();
                this.f10291l = paint;
                paint.setFilterBitmap(true);
            }
            this.f10291l.setAlpha(this.f10281b.getRootAlpha());
            this.f10291l.setColorFilter(colorFilter);
            return this.f10291l;
        }

        /* renamed from: a */
        public void mo11551a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f10285f, null, rect, mo11550a(colorFilter));
        }

        /* renamed from: a */
        public boolean mo11552a() {
            return !this.f10290k && this.f10286g == this.f10282c && this.f10287h == this.f10283d && this.f10289j == this.f10284e && this.f10288i == this.f10281b.getRootAlpha();
        }

        /* renamed from: a */
        public boolean mo11553a(int i, int i2) {
            return i == this.f10285f.getWidth() && i2 == this.f10285f.getHeight();
        }

        /* renamed from: a */
        public boolean mo11554a(int[] iArr) {
            boolean a = this.f10281b.mo11545a(iArr);
            this.f10290k |= a;
            return a;
        }

        /* renamed from: b */
        public void mo11555b(int i, int i2) {
            if (this.f10285f == null || !mo11553a(i, i2)) {
                this.f10285f = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.f10290k = true;
            }
        }

        /* renamed from: b */
        public boolean mo11556b() {
            return this.f10281b.getRootAlpha() < 255;
        }

        /* renamed from: c */
        public void mo11557c(int i, int i2) {
            this.f10285f.eraseColor(0);
            this.f10281b.mo11543a(new Canvas(this.f10285f), i, i2, (ColorFilter) null);
        }

        /* renamed from: c */
        public boolean mo11558c() {
            return this.f10281b.mo11544a();
        }

        /* renamed from: d */
        public void mo11559d() {
            this.f10286g = this.f10282c;
            this.f10287h = this.f10283d;
            this.f10288i = this.f10281b.getRootAlpha();
            this.f10289j = this.f10284e;
            this.f10290k = false;
        }

        public int getChangingConfigurations() {
            return this.f10280a;
        }

        public Drawable newDrawable() {
            return new C3647i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C3647i(this);
        }
    }

    /* renamed from: f.w.a.a.i$i */
    private static class C3656i extends ConstantState {

        /* renamed from: a */
        private final ConstantState f10292a;

        public C3656i(ConstantState constantState) {
            this.f10292a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f10292a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f10292a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C3647i iVar = new C3647i();
            iVar.f10224f = (VectorDrawable) this.f10292a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C3647i iVar = new C3647i();
            iVar.f10224f = (VectorDrawable) this.f10292a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C3647i iVar = new C3647i();
            iVar.f10224f = (VectorDrawable) this.f10292a.newDrawable(resources, theme);
            return iVar;
        }
    }

    C3647i() {
        this.f10230k = true;
        this.f10231l = new float[9];
        this.f10232m = new Matrix();
        this.f10233n = new Rect();
        this.f10226g = new C3655h();
    }

    C3647i(C3655h hVar) {
        this.f10230k = true;
        this.f10231l = new float[9];
        this.f10232m = new Matrix();
        this.f10233n = new Rect();
        this.f10226g = hVar;
        this.f10227h = mo11475a(this.f10227h, hVar.f10282c, hVar.f10283d);
    }

    /* renamed from: a */
    static int m14828a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* renamed from: a */
    private static Mode m14829a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ IOException | XmlPullParserException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[Catch:{ IOException | XmlPullParserException -> 0x0043 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p071f.p140w.p141a.p142a.C3647i m14830a(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            f.w.a.a.i r0 = new f.w.a.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r6 = p071f.p097h.p098e.p099c.C3248f.m13322a(r6, r7, r8)
            r0.f10224f = r6
            f.w.a.a.i$i r6 = new f.w.a.a.i$i
            android.graphics.drawable.Drawable r7 = r0.f10224f
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x0029:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            r4 = 2
            if (r3 == r4) goto L_0x0034
            r5 = 1
            if (r3 == r5) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            if (r3 != r4) goto L_0x003b
            f.w.a.a.i r6 = createFromXmlInner(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            return r6
        L_0x003b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x0043:
            r6 = move-exception
            goto L_0x0046
        L_0x0045:
            r6 = move-exception
        L_0x0046:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p140w.p141a.p142a.C3647i.m14830a(android.content.res.Resources, int, android.content.res.Resources$Theme):f.w.a.a.i");
    }

    /* renamed from: a */
    private void m14831a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        int i;
        int i2;
        C3649b bVar;
        C3655h hVar = this.f10226g;
        C3654g gVar = hVar.f10281b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f10271h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            String str = "group";
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C3651d dVar = (C3651d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C3650c cVar = new C3650c();
                    cVar.mo11503a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f10247b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f10279p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    bVar = new C3649b();
                    bVar.mo11501a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f10247b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f10279p.put(bVar.getPathName(), bVar);
                    }
                } else if (str.equals(name)) {
                    C3651d dVar2 = new C3651d();
                    dVar2.mo11522a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f10247b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f10279p.put(dVar2.getGroupName(), dVar2);
                    }
                    i = hVar.f10280a;
                    i2 = dVar2.f10256k;
                    hVar.f10280a = i2 | i;
                }
                i = hVar.f10280a;
                i2 = bVar.f10262d;
                hVar.f10280a = i2 | i;
            } else if (eventType == 3 && str.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: a */
    private void m14832a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) {
        C3655h hVar = this.f10226g;
        C3654g gVar = hVar.f10281b;
        hVar.f10283d = m14829a(C3252g.m13337b(typedArray, xmlPullParser, "tintMode", 6, -1), Mode.SRC_IN);
        ColorStateList a = C3252g.m13330a(typedArray, xmlPullParser, theme, "tint", 1);
        if (a != null) {
            hVar.f10282c = a;
        }
        hVar.f10284e = C3252g.m13335a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f10284e);
        gVar.f10274k = C3252g.m13328a(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f10274k);
        float a2 = C3252g.m13328a(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f10275l);
        gVar.f10275l = a2;
        if (gVar.f10274k <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        } else if (a2 > 0.0f) {
            gVar.f10272i = typedArray.getDimension(3, gVar.f10272i);
            float dimension = typedArray.getDimension(2, gVar.f10273j);
            gVar.f10273j = dimension;
            if (gVar.f10272i <= 0.0f) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(typedArray.getPositionDescription());
                sb2.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb2.toString());
            } else if (dimension > 0.0f) {
                gVar.setAlpha(C3252g.m13328a(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f10277n = string;
                    gVar.f10279p.put(string, gVar);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(typedArray.getPositionDescription());
                sb3.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(typedArray.getPositionDescription());
            sb4.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb4.toString());
        }
    }

    /* renamed from: a */
    private boolean m14833a() {
        return VERSION.SDK_INT >= 17 && isAutoMirrored() && C0371a.m1909e(this) == 1;
    }

    public static C3647i createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C3647i iVar = new C3647i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public PorterDuffColorFilter mo11475a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo11476a(String str) {
        return this.f10226g.f10281b.f10279p.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11477a(boolean z) {
        this.f10230k = z;
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            C0371a.m1903a(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f10233n);
        if (this.f10233n.width() > 0 && this.f10233n.height() > 0) {
            ColorFilter colorFilter = this.f10228i;
            if (colorFilter == null) {
                colorFilter = this.f10227h;
            }
            canvas.getMatrix(this.f10232m);
            this.f10232m.getValues(this.f10231l);
            float abs = Math.abs(this.f10231l[0]);
            float abs2 = Math.abs(this.f10231l[4]);
            float abs3 = Math.abs(this.f10231l[1]);
            float abs4 = Math.abs(this.f10231l[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int height = (int) (((float) this.f10233n.height()) * abs2);
            int min = Math.min(2048, (int) (((float) this.f10233n.width()) * abs));
            int min2 = Math.min(2048, height);
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f10233n;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m14833a()) {
                    canvas.translate((float) this.f10233n.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f10233n.offsetTo(0, 0);
                this.f10226g.mo11555b(min, min2);
                if (!this.f10230k) {
                    this.f10226g.mo11557c(min, min2);
                } else if (!this.f10226g.mo11552a()) {
                    this.f10226g.mo11557c(min, min2);
                    this.f10226g.mo11559d();
                }
                this.f10226g.mo11551a(canvas, colorFilter, this.f10233n);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f10224f;
        return drawable != null ? C0371a.m1907c(drawable) : this.f10226g.f10281b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f10224f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f10226g.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f10224f;
        return drawable != null ? C0371a.m1908d(drawable) : this.f10228i;
    }

    public ConstantState getConstantState() {
        if (this.f10224f != null && VERSION.SDK_INT >= 24) {
            return new C3656i(this.f10224f.getConstantState());
        }
        this.f10226g.f10280a = getChangingConfigurations();
        return this.f10226g;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f10224f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f10226g.f10281b.f10273j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f10224f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f10226g.f10281b.f10272i;
    }

    public int getOpacity() {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            C0371a.m1900a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C3655h hVar = this.f10226g;
        hVar.f10281b = new C3654g();
        TypedArray a = C3252g.m13332a(resources, theme, attributeSet, C3634a.f10197a);
        m14832a(a, xmlPullParser, theme);
        a.recycle();
        hVar.f10280a = getChangingConfigurations();
        hVar.f10290k = true;
        m14831a(resources, xmlPullParser, attributeSet, theme);
        this.f10227h = mo11475a(this.f10227h, hVar.f10282c, hVar.f10283d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f10224f;
        return drawable != null ? C0371a.m1910f(drawable) : this.f10226g.f10284e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0.isStateful() != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10224f
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            f.w.a.a.i$h r0 = r1.f10226g
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo11558c()
            if (r0 != 0) goto L_0x0028
            f.w.a.a.i$h r0 = r1.f10226g
            android.content.res.ColorStateList r0 = r0.f10282c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p140w.p141a.p142a.C3647i.isStateful():boolean");
    }

    public Drawable mutate() {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f10229j && super.mutate() == this) {
            this.f10226g = new C3655h(this.f10226g);
            this.f10229j = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C3655h hVar = this.f10226g;
        ColorStateList colorStateList = hVar.f10282c;
        boolean z2 = true;
        if (colorStateList != null) {
            Mode mode = hVar.f10283d;
            if (mode != null) {
                this.f10227h = mo11475a(this.f10227h, colorStateList, mode);
                invalidateSelf();
                z = true;
            }
        }
        if (!hVar.mo11558c() || !hVar.mo11554a(iArr)) {
            z2 = z;
        } else {
            invalidateSelf();
        }
        return z2;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        if (this.f10226g.f10281b.getRootAlpha() != i) {
            this.f10226g.f10281b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            C0371a.m1902a(drawable, z);
        } else {
            this.f10226g.f10284e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f10228i = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            C0371a.m1906b(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            C0371a.m1898a(drawable, colorStateList);
            return;
        }
        C3655h hVar = this.f10226g;
        if (hVar.f10282c != colorStateList) {
            hVar.f10282c = colorStateList;
            this.f10227h = mo11475a(this.f10227h, colorStateList, hVar.f10283d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            C0371a.m1901a(drawable, mode);
            return;
        }
        C3655h hVar = this.f10226g;
        if (hVar.f10283d != mode) {
            hVar.f10283d = mode;
            this.f10227h = mo11475a(this.f10227h, hVar.f10282c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f10224f;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
