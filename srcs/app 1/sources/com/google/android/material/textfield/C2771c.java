package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import android.view.View;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p187b0.C4389k;

/* renamed from: com.google.android.material.textfield.c */
class C2771c extends C4382g {

    /* renamed from: C */
    private final Paint f8138C;

    /* renamed from: D */
    private final RectF f8139D;

    /* renamed from: E */
    private int f8140E;

    C2771c() {
        this(null);
    }

    C2771c(C4389k kVar) {
        if (kVar == null) {
            kVar = new C4389k();
        }
        super(kVar);
        this.f8138C = new Paint(1);
        m11539v();
        this.f8139D = new RectF();
    }

    /* renamed from: a */
    private void m11535a(Canvas canvas) {
        if (!m11536a(getCallback())) {
            canvas.restoreToCount(this.f8140E);
        }
    }

    /* renamed from: a */
    private boolean m11536a(Callback callback) {
        return callback instanceof View;
    }

    /* renamed from: b */
    private void m11537b(Canvas canvas) {
        Callback callback = getCallback();
        if (m11536a(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        m11538c(canvas);
    }

    /* renamed from: c */
    private void m11538c(Canvas canvas) {
        int i;
        if (VERSION.SDK_INT >= 21) {
            i = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
        } else {
            i = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
        }
        this.f8140E = i;
    }

    /* renamed from: v */
    private void m11539v() {
        this.f8138C.setStyle(Style.FILL_AND_STROKE);
        this.f8138C.setColor(-1);
        this.f8138C.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9329a(float f, float f2, float f3, float f4) {
        RectF rectF = this.f8139D;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            this.f8139D.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9330a(RectF rectF) {
        mo9329a(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public void draw(Canvas canvas) {
        m11537b(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f8139D, this.f8138C);
        m11535a(canvas);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public boolean mo8577t() {
        return !this.f8139D.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo8579u() {
        mo9329a(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
