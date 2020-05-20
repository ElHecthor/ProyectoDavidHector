package com.bumptech.glide.p025r.p026j;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import com.bumptech.glide.C0839h;
import com.bumptech.glide.p025r.C1269c;
import com.bumptech.glide.p029t.C1309j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: com.bumptech.glide.r.j.i */
public abstract class C1286i<T extends View, Z> extends C1278a<Z> {

    /* renamed from: k */
    private static int f4271k = C0839h.glide_custom_view_target_tag;

    /* renamed from: f */
    protected final T f4272f;

    /* renamed from: g */
    private final C1287a f4273g;

    /* renamed from: h */
    private OnAttachStateChangeListener f4274h;

    /* renamed from: i */
    private boolean f4275i;

    /* renamed from: j */
    private boolean f4276j;

    /* renamed from: com.bumptech.glide.r.j.i$a */
    static final class C1287a {

        /* renamed from: e */
        static Integer f4277e;

        /* renamed from: a */
        private final View f4278a;

        /* renamed from: b */
        private final List<C1284g> f4279b = new ArrayList();

        /* renamed from: c */
        boolean f4280c;

        /* renamed from: d */
        private C1288a f4281d;

        /* renamed from: com.bumptech.glide.r.j.i$a$a */
        private static final class C1288a implements OnPreDrawListener {

            /* renamed from: f */
            private final WeakReference<C1287a> f4282f;

            C1288a(C1287a aVar) {
                this.f4282f = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                String str = "ViewTarget";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                    Log.v(str, sb.toString());
                }
                C1287a aVar = (C1287a) this.f4282f.get();
                if (aVar != null) {
                    aVar.mo5329a();
                }
                return true;
            }
        }

        C1287a(View view) {
            this.f4278a = view;
        }

        /* renamed from: a */
        private int m6099a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f4280c && this.f4278a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f4278a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            String str = "ViewTarget";
            if (Log.isLoggable(str, 4)) {
                Log.i(str, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m6100a(this.f4278a.getContext());
        }

        /* renamed from: a */
        private static int m6100a(Context context) {
            if (f4277e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C1309j.m6149a(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f4277e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f4277e.intValue();
        }

        /* renamed from: a */
        private boolean m6101a(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: a */
        private boolean m6102a(int i, int i2) {
            return m6101a(i) && m6101a(i2);
        }

        /* renamed from: b */
        private void m6103b(int i, int i2) {
            Iterator it = new ArrayList(this.f4279b).iterator();
            while (it.hasNext()) {
                ((C1284g) it.next()).mo5315a(i, i2);
            }
        }

        /* renamed from: c */
        private int m6104c() {
            int paddingTop = this.f4278a.getPaddingTop() + this.f4278a.getPaddingBottom();
            LayoutParams layoutParams = this.f4278a.getLayoutParams();
            return m6099a(this.f4278a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: d */
        private int m6105d() {
            int paddingLeft = this.f4278a.getPaddingLeft() + this.f4278a.getPaddingRight();
            LayoutParams layoutParams = this.f4278a.getLayoutParams();
            return m6099a(this.f4278a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5329a() {
            if (!this.f4279b.isEmpty()) {
                int d = m6105d();
                int c = m6104c();
                if (m6102a(d, c)) {
                    m6103b(d, c);
                    mo5331b();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5330a(C1284g gVar) {
            int d = m6105d();
            int c = m6104c();
            if (m6102a(d, c)) {
                gVar.mo5315a(d, c);
                return;
            }
            if (!this.f4279b.contains(gVar)) {
                this.f4279b.add(gVar);
            }
            if (this.f4281d == null) {
                ViewTreeObserver viewTreeObserver = this.f4278a.getViewTreeObserver();
                C1288a aVar = new C1288a(this);
                this.f4281d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5331b() {
            ViewTreeObserver viewTreeObserver = this.f4278a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f4281d);
            }
            this.f4281d = null;
            this.f4279b.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5332b(C1284g gVar) {
            this.f4279b.remove(gVar);
        }
    }

    public C1286i(T t) {
        C1309j.m6149a(t);
        this.f4272f = (View) t;
        this.f4273g = new C1287a(t);
    }

    /* renamed from: a */
    private void mo5320a(Object obj) {
        this.f4272f.setTag(f4271k, obj);
    }

    /* renamed from: e */
    private Object m6090e() {
        return this.f4272f.getTag(f4271k);
    }

    /* renamed from: f */
    private void m6091f() {
        OnAttachStateChangeListener onAttachStateChangeListener = this.f4274h;
        if (onAttachStateChangeListener != null && !this.f4276j) {
            this.f4272f.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f4276j = true;
        }
    }

    /* renamed from: g */
    private void m6092g() {
        OnAttachStateChangeListener onAttachStateChangeListener = this.f4274h;
        if (onAttachStateChangeListener != null && this.f4276j) {
            this.f4272f.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f4276j = false;
        }
    }

    /* renamed from: a */
    public void mo5321a(C1269c cVar) {
        mo5320a((Object) cVar);
    }

    /* renamed from: a */
    public void mo5322a(C1284g gVar) {
        this.f4273g.mo5332b(gVar);
    }

    /* renamed from: b */
    public void mo5318b(Drawable drawable) {
        super.mo5318b(drawable);
        m6091f();
    }

    /* renamed from: b */
    public void mo5323b(C1284g gVar) {
        this.f4273g.mo5330a(gVar);
    }

    /* renamed from: c */
    public C1269c mo5324c() {
        Object e = m6090e();
        if (e == null) {
            return null;
        }
        if (e instanceof C1269c) {
            return (C1269c) e;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: c */
    public void mo5129c(Drawable drawable) {
        super.mo5129c(drawable);
        this.f4273g.mo5331b();
        if (!this.f4275i) {
            m6092g();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Target for: ");
        sb.append(this.f4272f);
        return sb.toString();
    }
}
