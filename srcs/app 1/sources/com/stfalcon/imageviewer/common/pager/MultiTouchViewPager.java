package com.stfalcon.imageviewer.common.pager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p071f.p144y.p145a.C3659b;
import p071f.p144y.p145a.C3659b.C3669j;
import p147g.p225e.p226a.p227f.p228a.C4726e;
import p308k.C5812t;
import p308k.p311c0.C5740c;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5940i;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5950s;

public final class MultiTouchViewPager extends C3659b {

    /* renamed from: o0 */
    private boolean f8739o0;

    /* renamed from: p0 */
    private boolean f8740p0;

    /* renamed from: q0 */
    private C3669j f8741q0;

    /* renamed from: com.stfalcon.imageviewer.common.pager.MultiTouchViewPager$a */
    static final class C3079a extends C5940i implements C5918l<Integer, C5812t> {
        C3079a(MultiTouchViewPager multiTouchViewPager) {
            super(1, multiTouchViewPager);
        }

        /* renamed from: a */
        public final void mo9883a(int i) {
            ((MultiTouchViewPager) this.f14932g).m12517d(i);
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo9883a(((Number) obj).intValue());
            return C5812t.f14872a;
        }

        /* renamed from: e */
        public final String mo9884e() {
            return "onPageScrollStateChanged";
        }

        /* renamed from: f */
        public final C5740c mo9885f() {
            return C5950s.m22341a(MultiTouchViewPager.class);
        }

        /* renamed from: i */
        public final String mo9886i() {
            return "onPageScrollStateChanged(I)V";
        }
    }

    public MultiTouchViewPager(Context context) {
        this(context, null, 2, null);
    }

    public MultiTouchViewPager(Context context, AttributeSet attributeSet) {
        C5942k.m22327b(context, "context");
        super(context, attributeSet);
        this.f8739o0 = true;
    }

    public /* synthetic */ MultiTouchViewPager(Context context, AttributeSet attributeSet, int i, C5938g gVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m12517d(int i) {
        this.f8739o0 = i == 0;
    }

    private final void setIdle(boolean z) {
        this.f8739o0 = z;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C5942k.m22327b(motionEvent, "ev");
        if (motionEvent.getPointerCount() <= 1 || !this.f8740p0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        requestDisallowInterceptTouchEvent(false);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        requestDisallowInterceptTouchEvent(true);
        return dispatchTouchEvent;
    }

    /* renamed from: f */
    public final boolean mo9877f() {
        return this.f8739o0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8741q0 = C4726e.m19053a(this, null, null, new C3079a(this), 3, null);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3669j jVar = this.f8741q0;
        if (jVar != null) {
            mo11601b(jVar);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C5942k.m22327b(motionEvent, "ev");
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C5942k.m22327b(motionEvent, "ev");
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        this.f8740p0 = z;
        super.requestDisallowInterceptTouchEvent(z);
    }
}
