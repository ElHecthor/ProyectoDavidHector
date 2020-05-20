package p071f.p139v;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import p071f.p097h.p108m.C3379v;

/* renamed from: f.v.z */
class C3632z implements C3564b0 {

    /* renamed from: a */
    protected C3633a f10191a;

    /* renamed from: f.v.z$a */
    static class C3633a extends ViewGroup {

        /* renamed from: f */
        ViewGroup f10192f;

        /* renamed from: g */
        View f10193g;

        /* renamed from: h */
        ArrayList<Drawable> f10194h = null;

        /* renamed from: i */
        C3632z f10195i;

        /* renamed from: j */
        private boolean f10196j;

        static {
            try {
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C3633a(Context context, ViewGroup viewGroup, View view, C3632z zVar) {
            super(context);
            this.f10192f = viewGroup;
            this.f10193g = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f10195i = zVar;
        }

        /* renamed from: a */
        private void m14789a() {
            if (this.f10196j) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: a */
        private void m14790a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f10192f.getLocationOnScreen(iArr2);
            this.f10193g.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: b */
        private void m14791b() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f10194h;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f10196j = true;
                    this.f10192f.removeView(this);
                }
            }
        }

        /* renamed from: a */
        public void mo11409a(Drawable drawable) {
            m14789a();
            if (this.f10194h == null) {
                this.f10194h = new ArrayList<>();
            }
            if (!this.f10194h.contains(drawable)) {
                this.f10194h.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: a */
        public void mo11410a(View view) {
            m14789a();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f10192f || viewGroup.getParent() == null || !C3379v.m13767C(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f10192f.getLocationOnScreen(iArr2);
                    C3379v.m13811d(view, iArr[0] - iArr2[0]);
                    C3379v.m13814e(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* renamed from: b */
        public void mo11411b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f10194h;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                m14791b();
            }
        }

        /* renamed from: b */
        public void mo11412b(View view) {
            super.removeView(view);
            m14791b();
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f10192f.getLocationOnScreen(iArr);
            this.f10193g.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f10193g.getWidth(), this.f10193g.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f10194h;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Drawable) this.f10194h.get(i)).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f10192f != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f10192f instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    m14790a(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        public boolean verifyDrawable(Drawable drawable) {
            if (!super.verifyDrawable(drawable)) {
                ArrayList<Drawable> arrayList = this.f10194h;
                if (arrayList == null || !arrayList.contains(drawable)) {
                    return false;
                }
            }
            return true;
        }
    }

    C3632z(Context context, ViewGroup viewGroup, View view) {
        this.f10191a = new C3633a(context, viewGroup, view, this);
    }

    /* renamed from: c */
    static C3632z m14785c(View view) {
        ViewGroup d = m14786d(view);
        if (d == null) {
            return null;
        }
        int childCount = d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = d.getChildAt(i);
            if (childAt instanceof C3633a) {
                return ((C3633a) childAt).f10195i;
            }
        }
        return new C3626u(d.getContext(), d, view);
    }

    /* renamed from: d */
    static ViewGroup m14786d(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo11275a(Drawable drawable) {
        this.f10191a.mo11409a(drawable);
    }

    /* renamed from: b */
    public void mo11276b(Drawable drawable) {
        this.f10191a.mo11411b(drawable);
    }
}
