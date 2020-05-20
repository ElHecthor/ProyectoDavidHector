package p147g.p156d.p157a.p185c.p193q;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p147g.p156d.p157a.p185c.p200w.C4454a;

/* renamed from: g.d.a.c.q.d */
public interface C4438d {

    /* renamed from: g.d.a.c.q.d$b */
    public static class C4440b implements TypeEvaluator<C4443e> {

        /* renamed from: b */
        public static final TypeEvaluator<C4443e> f11771b = new C4440b();

        /* renamed from: a */
        private final C4443e f11772a = new C4443e();

        /* renamed from: a */
        public C4443e evaluate(float f, C4443e eVar, C4443e eVar2) {
            this.f11772a.mo13249a(C4454a.m18160a(eVar.f11775a, eVar2.f11775a, f), C4454a.m18160a(eVar.f11776b, eVar2.f11776b, f), C4454a.m18160a(eVar.f11777c, eVar2.f11777c, f));
            return this.f11772a;
        }
    }

    /* renamed from: g.d.a.c.q.d$c */
    public static class C4441c extends Property<C4438d, C4443e> {

        /* renamed from: a */
        public static final Property<C4438d, C4443e> f11773a = new C4441c("circularReveal");

        private C4441c(String str) {
            super(C4443e.class, str);
        }

        /* renamed from: a */
        public C4443e get(C4438d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: a */
        public void set(C4438d dVar, C4443e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: g.d.a.c.q.d$d */
    public static class C4442d extends Property<C4438d, Integer> {

        /* renamed from: a */
        public static final Property<C4438d, Integer> f11774a = new C4442d("circularRevealScrimColor");

        private C4442d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(C4438d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        public void set(C4438d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: g.d.a.c.q.d$e */
    public static class C4443e {

        /* renamed from: a */
        public float f11775a;

        /* renamed from: b */
        public float f11776b;

        /* renamed from: c */
        public float f11777c;

        private C4443e() {
        }

        public C4443e(float f, float f2, float f3) {
            this.f11775a = f;
            this.f11776b = f2;
            this.f11777c = f3;
        }

        /* renamed from: a */
        public void mo13249a(float f, float f2, float f3) {
            this.f11775a = f;
            this.f11776b = f2;
            this.f11777c = f3;
        }
    }

    /* renamed from: a */
    void mo13219a();

    /* renamed from: b */
    void mo13220b();

    int getCircularRevealScrimColor();

    C4443e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C4443e eVar);
}
