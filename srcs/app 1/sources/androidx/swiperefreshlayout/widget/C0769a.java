package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.swiperefreshlayout.widget.a */
class C0769a extends ImageView {

    /* renamed from: f */
    private AnimationListener f3009f;

    /* renamed from: g */
    int f3010g;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    private class C0770a extends OvalShape {

        /* renamed from: f */
        private RadialGradient f3011f;

        /* renamed from: g */
        private Paint f3012g = new Paint();

        C0770a(int i) {
            C0769a.this.f3010g = i;
            m4115a((int) rect().width());
        }

        /* renamed from: a */
        private void m4115a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C0769a.this.f3010g, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f3011f = radialGradient;
            this.f3012g.setShader(radialGradient);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = C0769a.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C0769a.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f3012g);
            canvas.drawCircle(f, height, (float) (width - C0769a.this.f3010g), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m4115a((int) f);
        }
    }

    C0769a(Context context, int i) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f3010g = (int) (3.5f * f);
        if (m4113a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C3379v.m13780a((View) this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0770a(this.f3010g));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f3010g, (float) i3, (float) i2, 503316480);
            int i4 = this.f3010g;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        C3379v.m13787a((View) this, (Drawable) shapeDrawable);
    }

    /* renamed from: a */
    private boolean m4113a() {
        return VERSION.SDK_INT >= 21;
    }

    /* renamed from: a */
    public void mo4226a(AnimationListener animationListener) {
        this.f3009f = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        AnimationListener animationListener = this.f3009f;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        AnimationListener animationListener = this.f3009f;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m4113a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f3010g * 2), getMeasuredHeight() + (this.f3010g * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
