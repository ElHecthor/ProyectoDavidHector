package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p071f.p072a.C3102j;

public final class ViewStubCompat extends View {

    /* renamed from: f */
    private int f851f;

    /* renamed from: g */
    private int f852g;

    /* renamed from: h */
    private WeakReference<View> f853h;

    /* renamed from: i */
    private LayoutInflater f854i;

    /* renamed from: j */
    private C0186a f855j;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0186a {
        /* renamed from: a */
        void mo1252a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f851f = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3102j.ViewStubCompat, i, 0);
        this.f852g = obtainStyledAttributes.getResourceId(C3102j.ViewStubCompat_android_inflatedId, -1);
        this.f851f = obtainStyledAttributes.getResourceId(C3102j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C3102j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo1240a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f851f != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f854i;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f851f, viewGroup, false);
            int i = this.f852g;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f853h = new WeakReference<>(inflate);
            C0186a aVar = this.f855j;
            if (aVar != null) {
                aVar.mo1252a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f852g;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f854i;
    }

    public int getLayoutResource() {
        return this.f851f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f852g = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f854i = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f851f = i;
    }

    public void setOnInflateListener(C0186a aVar) {
        this.f855j = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f853h;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo1240a();
        }
    }
}
