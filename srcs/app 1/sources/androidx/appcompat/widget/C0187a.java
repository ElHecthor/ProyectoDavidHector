package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p071f.p072a.C3093a;
import p071f.p072a.C3102j;
import p071f.p097h.p108m.C3325a0;
import p071f.p097h.p108m.C3332b0;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.appcompat.widget.a */
abstract class C0187a extends ViewGroup {

    /* renamed from: f */
    protected final C0188a f856f;

    /* renamed from: g */
    protected final Context f857g;

    /* renamed from: h */
    protected ActionMenuView f858h;

    /* renamed from: i */
    protected C0195c f859i;

    /* renamed from: j */
    protected int f860j;

    /* renamed from: k */
    protected C3325a0 f861k;

    /* renamed from: l */
    private boolean f862l;

    /* renamed from: m */
    private boolean f863m;

    /* renamed from: androidx.appcompat.widget.a$a */
    protected class C0188a implements C3332b0 {

        /* renamed from: a */
        private boolean f864a = false;

        /* renamed from: b */
        int f865b;

        protected C0188a() {
        }

        /* renamed from: a */
        public C0188a mo1259a(C3325a0 a0Var, int i) {
            C0187a.this.f861k = a0Var;
            this.f865b = i;
            return this;
        }

        /* renamed from: a */
        public void mo1260a(View view) {
            this.f864a = true;
        }

        /* renamed from: b */
        public void mo330b(View view) {
            if (!this.f864a) {
                C0187a aVar = C0187a.this;
                aVar.f861k = null;
                C0187a.super.setVisibility(this.f865b);
            }
        }

        /* renamed from: c */
        public void mo331c(View view) {
            C0187a.super.setVisibility(0);
            this.f864a = false;
        }
    }

    C0187a(Context context) {
        this(context, null);
    }

    C0187a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0187a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f856f = new C0188a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C3093a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f857g = context;
        } else {
            this.f857g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: a */
    protected static int m965a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo1253a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo1254a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public C3325a0 mo1255a(int i, long j) {
        C3325a0 a0Var = this.f861k;
        if (a0Var != null) {
            a0Var.mo10713a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C3325a0 a = C3379v.m13776a(this);
            a.mo10708a(1.0f);
            a.mo10709a(j);
            C0188a aVar = this.f856f;
            aVar.mo1259a(a, i);
            a.mo10711a((C3332b0) aVar);
            return a;
        }
        C3325a0 a2 = C3379v.m13776a(this);
        a2.mo10708a(0.0f);
        a2.mo10709a(j);
        C0188a aVar2 = this.f856f;
        aVar2.mo1259a(a2, i);
        a2.mo10711a((C3332b0) aVar2);
        return a2;
    }

    public int getAnimatedVisibility() {
        return this.f861k != null ? this.f856f.f865b : getVisibility();
    }

    public int getContentHeight() {
        return this.f860j;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C3102j.ActionBar, C3093a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C3102j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C0195c cVar = this.f859i;
        if (cVar != null) {
            cVar.mo1289a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f863m = false;
        }
        if (!this.f863m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f863m = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f863m = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f862l = false;
        }
        if (!this.f862l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f862l = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f862l = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C3325a0 a0Var = this.f861k;
            if (a0Var != null) {
                a0Var.mo10713a();
            }
            super.setVisibility(i);
        }
    }
}
