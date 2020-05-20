package p147g.p153c.p154a.p155a;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: g.c.a.a.k */
public class C3728k extends AppCompatImageView {

    /* renamed from: h */
    private C3729l f10551h;

    /* renamed from: i */
    private ScaleType f10552i;

    public C3728k(Context context) {
        this(context, null);
    }

    public C3728k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3728k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m15211b();
    }

    /* renamed from: b */
    private void m15211b() {
        this.f10551h = new C3729l(this);
        super.setScaleType(ScaleType.MATRIX);
        ScaleType scaleType = this.f10552i;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f10552i = null;
        }
    }

    /* renamed from: a */
    public void mo11815a(float f, boolean z) {
        this.f10551h.mo11848a(f, z);
    }

    public C3729l getAttacher() {
        return this.f10551h;
    }

    public RectF getDisplayRect() {
        return this.f10551h.mo11845a();
    }

    public Matrix getImageMatrix() {
        return this.f10551h.mo11862b();
    }

    public float getMaximumScale() {
        return this.f10551h.mo11865c();
    }

    public float getMediumScale() {
        return this.f10551h.mo11867d();
    }

    public float getMinimumScale() {
        return this.f10551h.mo11869e();
    }

    public float getScale() {
        return this.f10551h.mo11871f();
    }

    public ScaleType getScaleType() {
        return this.f10551h.mo11873g();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f10551h.mo11861a(z);
    }

    /* access modifiers changed from: protected */
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f10551h.mo11874h();
        }
        return frame;
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C3729l lVar = this.f10551h;
        if (lVar != null) {
            lVar.mo11874h();
        }
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        C3729l lVar = this.f10551h;
        if (lVar != null) {
            lVar.mo11874h();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C3729l lVar = this.f10551h;
        if (lVar != null) {
            lVar.mo11874h();
        }
    }

    public void setMaximumScale(float f) {
        this.f10551h.mo11846a(f);
    }

    public void setMediumScale(float f) {
        this.f10551h.mo11863b(f);
    }

    public void setMinimumScale(float f) {
        this.f10551h.mo11866c(f);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f10551h.mo11851a(onClickListener);
    }

    public void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
        this.f10551h.mo11850a(onDoubleTapListener);
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f10551h.mo11852a(onLongClickListener);
    }

    public void setOnMatrixChangeListener(C3721d dVar) {
        this.f10551h.mo11854a(dVar);
    }

    public void setOnOutsidePhotoTapListener(C3722e eVar) {
        this.f10551h.mo11855a(eVar);
    }

    public void setOnPhotoTapListener(C3723f fVar) {
        this.f10551h.mo11856a(fVar);
    }

    public void setOnScaleChangeListener(C3724g gVar) {
        this.f10551h.mo11857a(gVar);
    }

    public void setOnSingleFlingListener(C3725h hVar) {
        this.f10551h.mo11858a(hVar);
    }

    public void setOnViewDragListener(C3726i iVar) {
        this.f10551h.mo11859a(iVar);
    }

    public void setOnViewTapListener(C3727j jVar) {
        this.f10551h.mo11860a(jVar);
    }

    public void setRotationBy(float f) {
        this.f10551h.mo11868d(f);
    }

    public void setRotationTo(float f) {
        this.f10551h.mo11870e(f);
    }

    public void setScale(float f) {
        this.f10551h.mo11872f(f);
    }

    public void setScaleType(ScaleType scaleType) {
        C3729l lVar = this.f10551h;
        if (lVar == null) {
            this.f10552i = scaleType;
        } else {
            lVar.mo11853a(scaleType);
        }
    }

    public void setZoomTransitionDuration(int i) {
        this.f10551h.mo11849a(i);
    }

    public void setZoomable(boolean z) {
        this.f10551h.mo11864b(z);
    }
}
