package p147g.p156d.p157a.p185c.p187b0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p147g.p156d.p157a.p185c.p186a0.C4373a;

/* renamed from: g.d.a.c.b0.m */
public class C4396m {
    @Deprecated

    /* renamed from: a */
    public float f11667a;
    @Deprecated

    /* renamed from: b */
    public float f11668b;
    @Deprecated

    /* renamed from: c */
    public float f11669c;
    @Deprecated

    /* renamed from: d */
    public float f11670d;
    @Deprecated

    /* renamed from: e */
    public float f11671e;
    @Deprecated

    /* renamed from: f */
    public float f11672f;

    /* renamed from: g */
    private final List<C4402f> f11673g = new ArrayList();

    /* renamed from: h */
    private final List<C4403g> f11674h = new ArrayList();

    /* renamed from: g.d.a.c.b0.m$a */
    class C4397a extends C4403g {

        /* renamed from: b */
        final /* synthetic */ List f11675b;

        /* renamed from: c */
        final /* synthetic */ Matrix f11676c;

        C4397a(C4396m mVar, List list, Matrix matrix) {
            this.f11675b = list;
            this.f11676c = matrix;
        }

        /* renamed from: a */
        public void mo13146a(Matrix matrix, C4373a aVar, int i, Canvas canvas) {
            for (C4403g a : this.f11675b) {
                a.mo13146a(this.f11676c, aVar, i, canvas);
            }
        }
    }

    /* renamed from: g.d.a.c.b0.m$b */
    static class C4398b extends C4403g {

        /* renamed from: b */
        private final C4400d f11677b;

        public C4398b(C4400d dVar) {
            this.f11677b = dVar;
        }

        /* renamed from: a */
        public void mo13146a(Matrix matrix, C4373a aVar, int i, Canvas canvas) {
            float e = this.f11677b.m17987d();
            float f = this.f11677b.m17990e();
            aVar.mo13044a(canvas, matrix, new RectF(this.f11677b.m17980b(), this.f11677b.m17993f(), this.f11677b.m17984c(), this.f11677b.m17976a()), i, e, f);
        }
    }

    /* renamed from: g.d.a.c.b0.m$c */
    static class C4399c extends C4403g {

        /* renamed from: b */
        private final C4401e f11678b;

        /* renamed from: c */
        private final float f11679c;

        /* renamed from: d */
        private final float f11680d;

        public C4399c(C4401e eVar, float f, float f2) {
            this.f11678b = eVar;
            this.f11679c = f;
            this.f11680d = f2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public float mo13147a() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f11678b.f11689c - this.f11680d) / (this.f11678b.f11688b - this.f11679c))));
        }

        /* renamed from: a */
        public void mo13146a(Matrix matrix, C4373a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f11678b.f11689c - this.f11680d), (double) (this.f11678b.f11688b - this.f11679c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f11679c, this.f11680d);
            matrix2.preRotate(mo13147a());
            aVar.mo13043a(canvas, matrix2, rectF, i);
        }
    }

    /* renamed from: g.d.a.c.b0.m$d */
    public static class C4400d extends C4402f {

        /* renamed from: h */
        private static final RectF f11681h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f11682b;
        @Deprecated

        /* renamed from: c */
        public float f11683c;
        @Deprecated

        /* renamed from: d */
        public float f11684d;
        @Deprecated

        /* renamed from: e */
        public float f11685e;
        @Deprecated

        /* renamed from: f */
        public float f11686f;
        @Deprecated

        /* renamed from: g */
        public float f11687g;

        public C4400d(float f, float f2, float f3, float f4) {
            m17982b(f);
            m17995f(f2);
            m17986c(f3);
            m17978a(f4);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public float m17976a() {
            return this.f11685e;
        }

        /* renamed from: a */
        private void m17978a(float f) {
            this.f11685e = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public float m17980b() {
            return this.f11682b;
        }

        /* renamed from: b */
        private void m17982b(float f) {
            this.f11682b = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public float m17984c() {
            return this.f11684d;
        }

        /* renamed from: c */
        private void m17986c(float f) {
            this.f11684d = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public float m17987d() {
            return this.f11686f;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m17989d(float f) {
            this.f11686f = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public float m17990e() {
            return this.f11687g;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m17992e(float f) {
            this.f11687g = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public float m17993f() {
            return this.f11683c;
        }

        /* renamed from: f */
        private void m17995f(float f) {
            this.f11683c = f;
        }

        /* renamed from: a */
        public void mo13148a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f11690a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            f11681h.set(m17980b(), m17993f(), m17984c(), m17976a());
            path.arcTo(f11681h, m17987d(), m17990e(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: g.d.a.c.b0.m$e */
    public static class C4401e extends C4402f {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f11688b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f11689c;

        /* renamed from: a */
        public void mo13148a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f11690a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f11688b, this.f11689c);
            path.transform(matrix);
        }
    }

    /* renamed from: g.d.a.c.b0.m$f */
    public static abstract class C4402f {

        /* renamed from: a */
        protected final Matrix f11690a = new Matrix();

        /* renamed from: a */
        public abstract void mo13148a(Matrix matrix, Path path);
    }

    /* renamed from: g.d.a.c.b0.m$g */
    static abstract class C4403g {

        /* renamed from: a */
        static final Matrix f11691a = new Matrix();

        C4403g() {
        }

        /* renamed from: a */
        public abstract void mo13146a(Matrix matrix, C4373a aVar, int i, Canvas canvas);

        /* renamed from: a */
        public final void mo13149a(C4373a aVar, int i, Canvas canvas) {
            mo13146a(f11691a, aVar, i, canvas);
        }
    }

    public C4396m() {
        mo13143b(0.0f, 0.0f);
    }

    /* renamed from: a */
    private void m17952a(float f) {
        if (m17957e() != f) {
            float e = ((f - m17957e()) + 360.0f) % 360.0f;
            if (e <= 180.0f) {
                C4400d dVar = new C4400d(mo13136a(), mo13142b(), mo13136a(), mo13142b());
                dVar.m17989d(m17957e());
                dVar.m17992e(e);
                this.f11674h.add(new C4398b(dVar));
                m17954b(f);
            }
        }
    }

    /* renamed from: a */
    private void m17953a(C4403g gVar, float f, float f2) {
        m17952a(f);
        this.f11674h.add(gVar);
        m17954b(f2);
    }

    /* renamed from: b */
    private void m17954b(float f) {
        this.f11671e = f;
    }

    /* renamed from: c */
    private void m17955c(float f) {
        this.f11672f = f;
    }

    /* renamed from: d */
    private void m17956d(float f) {
        this.f11669c = f;
    }

    /* renamed from: e */
    private float m17957e() {
        return this.f11671e;
    }

    /* renamed from: e */
    private void m17958e(float f) {
        this.f11670d = f;
    }

    /* renamed from: f */
    private float m17959f() {
        return this.f11672f;
    }

    /* renamed from: f */
    private void m17960f(float f) {
        this.f11667a = f;
    }

    /* renamed from: g */
    private void m17961g(float f) {
        this.f11668b = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo13136a() {
        return this.f11669c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4403g mo13137a(Matrix matrix) {
        m17952a(m17959f());
        return new C4397a(this, new ArrayList(this.f11674h), matrix);
    }

    /* renamed from: a */
    public void mo13138a(float f, float f2) {
        C4401e eVar = new C4401e();
        eVar.f11688b = f;
        eVar.f11689c = f2;
        this.f11673g.add(eVar);
        C4399c cVar = new C4399c(eVar, mo13136a(), mo13142b());
        m17953a(cVar, cVar.mo13147a() + 270.0f, cVar.mo13147a() + 270.0f);
        m17956d(f);
        m17958e(f2);
    }

    /* renamed from: a */
    public void mo13139a(float f, float f2, float f3, float f4) {
        m17960f(f);
        m17961g(f2);
        m17956d(f);
        m17958e(f2);
        m17954b(f3);
        m17955c((f3 + f4) % 360.0f);
        this.f11673g.clear();
        this.f11674h.clear();
    }

    /* renamed from: a */
    public void mo13140a(float f, float f2, float f3, float f4, float f5, float f6) {
        C4400d dVar = new C4400d(f, f2, f3, f4);
        dVar.m17989d(f5);
        dVar.m17992e(f6);
        this.f11673g.add(dVar);
        C4398b bVar = new C4398b(dVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m17953a(bVar, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = (double) f7;
        m17956d(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m17958e(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: a */
    public void mo13141a(Matrix matrix, Path path) {
        int size = this.f11673g.size();
        for (int i = 0; i < size; i++) {
            ((C4402f) this.f11673g.get(i)).mo13148a(matrix, path);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo13142b() {
        return this.f11670d;
    }

    /* renamed from: b */
    public void mo13143b(float f, float f2) {
        mo13139a(f, f2, 270.0f, 0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo13144c() {
        return this.f11667a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo13145d() {
        return this.f11668b;
    }
}
