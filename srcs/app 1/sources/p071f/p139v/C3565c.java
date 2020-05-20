package p071f.p139v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import p071f.p097h.p108m.C3379v;
import p071f.p139v.C3607m.C3613f;

/* renamed from: f.v.c */
public class C3565c extends C3607m {

    /* renamed from: R */
    private static final String[] f10032R = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: S */
    private static final Property<Drawable, PointF> f10033S = new C3567b(PointF.class, "boundsOrigin");

    /* renamed from: T */
    private static final Property<C3576k, PointF> f10034T;

    /* renamed from: U */
    private static final Property<C3576k, PointF> f10035U;

    /* renamed from: V */
    private static final Property<View, PointF> f10036V;

    /* renamed from: W */
    private static final Property<View, PointF> f10037W;

    /* renamed from: X */
    private static final Property<View, PointF> f10038X = new C3572g(PointF.class, "position");

    /* renamed from: Y */
    private static C3603k f10039Y = new C3603k();

    /* renamed from: O */
    private int[] f10040O = new int[2];

    /* renamed from: P */
    private boolean f10041P = false;

    /* renamed from: Q */
    private boolean f10042Q = false;

    /* renamed from: f.v.c$a */
    class C3566a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f10043a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f10044b;

        /* renamed from: c */
        final /* synthetic */ View f10045c;

        /* renamed from: d */
        final /* synthetic */ float f10046d;

        C3566a(C3565c cVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f10043a = viewGroup;
            this.f10044b = bitmapDrawable;
            this.f10045c = view;
            this.f10046d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C3577c0.m14571b(this.f10043a).mo11276b(this.f10044b);
            C3577c0.m14567a(this.f10045c, this.f10046d);
        }
    }

    /* renamed from: f.v.c$b */
    static class C3567b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f10047a = new Rect();

        C3567b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f10047a);
            Rect rect = this.f10047a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: a */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f10047a);
            this.f10047a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f10047a);
        }
    }

    /* renamed from: f.v.c$c */
    static class C3568c extends Property<C3576k, PointF> {
        C3568c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C3576k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C3576k kVar, PointF pointF) {
            kVar.mo11310b(pointF);
        }
    }

    /* renamed from: f.v.c$d */
    static class C3569d extends Property<C3576k, PointF> {
        C3569d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C3576k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C3576k kVar, PointF pointF) {
            kVar.mo11309a(pointF);
        }
    }

    /* renamed from: f.v.c$e */
    static class C3570e extends Property<View, PointF> {
        C3570e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C3577c0.m14569a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: f.v.c$f */
    static class C3571f extends Property<View, PointF> {
        C3571f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C3577c0.m14569a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: f.v.c$g */
    static class C3572g extends Property<View, PointF> {
        C3572g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C3577c0.m14569a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: f.v.c$h */
    class C3573h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C3576k f10048a;
        private C3576k mViewBounds = this.f10048a;

        C3573h(C3565c cVar, C3576k kVar) {
            this.f10048a = kVar;
        }
    }

    /* renamed from: f.v.c$i */
    class C3574i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f10049a;

        /* renamed from: b */
        final /* synthetic */ View f10050b;

        /* renamed from: c */
        final /* synthetic */ Rect f10051c;

        /* renamed from: d */
        final /* synthetic */ int f10052d;

        /* renamed from: e */
        final /* synthetic */ int f10053e;

        /* renamed from: f */
        final /* synthetic */ int f10054f;

        /* renamed from: g */
        final /* synthetic */ int f10055g;

        C3574i(C3565c cVar, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f10050b = view;
            this.f10051c = rect;
            this.f10052d = i;
            this.f10053e = i2;
            this.f10054f = i3;
            this.f10055g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f10049a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f10049a) {
                C3379v.m13786a(this.f10050b, this.f10051c);
                C3577c0.m14569a(this.f10050b, this.f10052d, this.f10053e, this.f10054f, this.f10055g);
            }
        }
    }

    /* renamed from: f.v.c$j */
    class C3575j extends C3615n {

        /* renamed from: a */
        boolean f10056a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f10057b;

        C3575j(C3565c cVar, ViewGroup viewGroup) {
            this.f10057b = viewGroup;
        }

        /* renamed from: b */
        public void mo11305b(C3607m mVar) {
            C3629x.m14782b(this.f10057b, false);
            this.f10056a = true;
        }

        /* renamed from: c */
        public void mo11306c(C3607m mVar) {
            C3629x.m14782b(this.f10057b, false);
        }

        /* renamed from: d */
        public void mo11307d(C3607m mVar) {
            C3629x.m14782b(this.f10057b, true);
        }

        /* renamed from: e */
        public void mo11308e(C3607m mVar) {
            if (!this.f10056a) {
                C3629x.m14782b(this.f10057b, false);
            }
            mVar.mo11366b((C3613f) this);
        }
    }

    /* renamed from: f.v.c$k */
    private static class C3576k {

        /* renamed from: a */
        private int f10058a;

        /* renamed from: b */
        private int f10059b;

        /* renamed from: c */
        private int f10060c;

        /* renamed from: d */
        private int f10061d;

        /* renamed from: e */
        private View f10062e;

        /* renamed from: f */
        private int f10063f;

        /* renamed from: g */
        private int f10064g;

        C3576k(View view) {
            this.f10062e = view;
        }

        /* renamed from: a */
        private void m14563a() {
            C3577c0.m14569a(this.f10062e, this.f10058a, this.f10059b, this.f10060c, this.f10061d);
            this.f10063f = 0;
            this.f10064g = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo11309a(PointF pointF) {
            this.f10060c = Math.round(pointF.x);
            this.f10061d = Math.round(pointF.y);
            int i = this.f10064g + 1;
            this.f10064g = i;
            if (this.f10063f == i) {
                m14563a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo11310b(PointF pointF) {
            this.f10058a = Math.round(pointF.x);
            this.f10059b = Math.round(pointF.y);
            int i = this.f10063f + 1;
            this.f10063f = i;
            if (i == this.f10064g) {
                m14563a();
            }
        }
    }

    static {
        String str = "topLeft";
        f10034T = new C3568c(PointF.class, str);
        String str2 = "bottomRight";
        f10035U = new C3569d(PointF.class, str2);
        f10036V = new C3570e(PointF.class, str2);
        f10037W = new C3571f(PointF.class, str);
    }

    /* renamed from: a */
    private boolean m14541a(View view, View view2) {
        if (!this.f10042Q) {
            return true;
        }
        C3624s a = mo11355a(view, true);
        if (a == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == a.f10178b) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m14542d(C3624s sVar) {
        View view = sVar.f10178b;
        if (C3379v.m13768D(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f10177a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f10177a.put("android:changeBounds:parent", sVar.f10178b.getParent());
            if (this.f10042Q) {
                sVar.f10178b.getLocationInWindow(this.f10040O);
                sVar.f10177a.put("android:changeBounds:windowX", Integer.valueOf(this.f10040O[0]));
                sVar.f10177a.put("android:changeBounds:windowY", Integer.valueOf(this.f10040O[1]));
            }
            if (this.f10041P) {
                sVar.f10177a.put("android:changeBounds:clip", C3379v.m13823j(view));
            }
        }
    }

    /* renamed from: a */
    public Animator mo8999a(ViewGroup viewGroup, C3624s sVar, C3624s sVar2) {
        int i;
        View view;
        Animator animator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        C3624s sVar3 = sVar;
        C3624s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        String str = "android:changeBounds:parent";
        ViewGroup viewGroup2 = (ViewGroup) sVar3.f10177a.get(str);
        ViewGroup viewGroup3 = (ViewGroup) sVar4.f10177a.get(str);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f10178b;
        if (m14541a(viewGroup2, viewGroup3)) {
            String str2 = "android:changeBounds:bounds";
            Rect rect2 = (Rect) sVar3.f10177a.get(str2);
            Rect rect3 = (Rect) sVar4.f10177a.get(str2);
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            String str3 = "android:changeBounds:clip";
            Rect rect4 = (Rect) sVar3.f10177a.get(str3);
            Rect rect5 = (Rect) sVar4.f10177a.get(str3);
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i > 0) {
                Rect rect6 = rect5;
                Rect rect7 = rect4;
                if (!this.f10041P) {
                    view = view3;
                    C3577c0.m14569a(view, i3, i5, i7, i9);
                    if (i == 2) {
                        if (i11 == i13 && i12 == i14) {
                            path = mo11380k().mo11331a((float) i3, (float) i5, (float) i4, (float) i6);
                            property = f10038X;
                        } else {
                            C3576k kVar = new C3576k(view);
                            ObjectAnimator a = C3590f.m14616a(kVar, f10034T, mo11380k().mo11331a((float) i3, (float) i5, (float) i4, (float) i6));
                            ObjectAnimator a2 = C3590f.m14616a(kVar, f10035U, mo11380k().mo11331a((float) i7, (float) i9, (float) i8, (float) i10));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(new Animator[]{a, a2});
                            animatorSet.addListener(new C3573h(this, kVar));
                            animator = animatorSet;
                        }
                    } else if (i3 == i4 && i5 == i6) {
                        path = mo11380k().mo11331a((float) i7, (float) i9, (float) i8, (float) i10);
                        property = f10036V;
                    } else {
                        path = mo11380k().mo11331a((float) i3, (float) i5, (float) i4, (float) i6);
                        property = f10037W;
                    }
                    animator = C3590f.m14616a(view, property, path);
                } else {
                    view = view3;
                    C3577c0.m14569a(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                    Animator a3 = (i3 == i4 && i5 == i6) ? null : C3590f.m14616a(view, f10038X, mo11380k().mo11331a((float) i3, (float) i5, (float) i4, (float) i6));
                    if (rect7 == null) {
                        i2 = 0;
                        rect = new Rect(0, 0, i11, i12);
                    } else {
                        i2 = 0;
                        rect = rect7;
                    }
                    Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                    if (!rect.equals(rect8)) {
                        C3379v.m13786a(view, rect);
                        C3603k kVar2 = f10039Y;
                        Object[] objArr = new Object[2];
                        objArr[i2] = rect;
                        objArr[1] = rect8;
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                        C3574i iVar = new C3574i(this, view, rect6, i4, i6, i8, i10);
                        ofObject.addListener(iVar);
                        objectAnimator = ofObject;
                    } else {
                        objectAnimator = null;
                    }
                    animator = C3623r.m14768a(a3, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    C3629x.m14782b(viewGroup4, true);
                    mo11354a((C3613f) new C3575j(this, viewGroup4));
                }
                return animator;
            }
        } else {
            String str4 = "android:changeBounds:windowX";
            int intValue = ((Integer) sVar3.f10177a.get(str4)).intValue();
            String str5 = "android:changeBounds:windowY";
            int intValue2 = ((Integer) sVar3.f10177a.get(str5)).intValue();
            int intValue3 = ((Integer) sVar4.f10177a.get(str4)).intValue();
            int intValue4 = ((Integer) sVar4.f10177a.get(str5)).intValue();
            if (!(intValue == intValue3 && intValue2 == intValue4)) {
                viewGroup.getLocationInWindow(this.f10040O);
                Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Config.ARGB_8888);
                view2.draw(new Canvas(createBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                float c = C3577c0.m14573c(view2);
                C3577c0.m14567a(view2, 0.0f);
                C3577c0.m14571b(viewGroup).mo11275a(bitmapDrawable);
                C3592g k = mo11380k();
                int[] iArr = this.f10040O;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C3596i.m14627a(f10033S, k.mo11331a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
                C3566a aVar = new C3566a(this, viewGroup, bitmapDrawable, view2, c);
                ofPropertyValuesHolder.addListener(aVar);
                return ofPropertyValuesHolder;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo9000a(C3624s sVar) {
        m14542d(sVar);
    }

    /* renamed from: c */
    public void mo9001c(C3624s sVar) {
        m14542d(sVar);
    }

    /* renamed from: s */
    public String[] mo11277s() {
        return f10032R;
    }
}
