package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0371a;
import p071f.p072a.C3102j;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.appcompat.widget.s */
class C0261s extends C0255p {

    /* renamed from: d */
    private final SeekBar f1155d;

    /* renamed from: e */
    private Drawable f1156e;

    /* renamed from: f */
    private ColorStateList f1157f = null;

    /* renamed from: g */
    private Mode f1158g = null;

    /* renamed from: h */
    private boolean f1159h = false;

    /* renamed from: i */
    private boolean f1160i = false;

    C0261s(SeekBar seekBar) {
        super(seekBar);
        this.f1155d = seekBar;
    }

    /* renamed from: d */
    private void m1266d() {
        if (this.f1156e == null) {
            return;
        }
        if (this.f1159h || this.f1160i) {
            Drawable i = C0371a.m1913i(this.f1156e.mutate());
            this.f1156e = i;
            if (this.f1159h) {
                C0371a.m1898a(i, this.f1157f);
            }
            if (this.f1160i) {
                C0371a.m1901a(this.f1156e, this.f1158g);
            }
            if (this.f1156e.isStateful()) {
                this.f1156e.setState(this.f1155d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1666a(Canvas canvas) {
        if (this.f1156e != null) {
            int max = this.f1155d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1156e.getIntrinsicWidth();
                int intrinsicHeight = this.f1156e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1156e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1155d.getWidth() - this.f1155d.getPaddingLeft()) - this.f1155d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1155d.getPaddingLeft(), (float) (this.f1155d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1156e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1667a(Drawable drawable) {
        Drawable drawable2 = this.f1156e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1156e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1155d);
            C0371a.m1904a(drawable, C3379v.m13829p(this.f1155d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1155d.getDrawableState());
            }
            m1266d();
        }
        this.f1155d.invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1648a(AttributeSet attributeSet, int i) {
        super.mo1648a(attributeSet, i);
        C0275t0 a = C0275t0.m1311a(this.f1155d.getContext(), attributeSet, C3102j.AppCompatSeekBar, i, 0);
        Drawable c = a.mo1743c(C3102j.AppCompatSeekBar_android_thumb);
        if (c != null) {
            this.f1155d.setThumb(c);
        }
        mo1667a(a.mo1741b(C3102j.AppCompatSeekBar_tickMark));
        if (a.mo1751g(C3102j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f1158g = C0189a0.m975a(a.mo1744d(C3102j.AppCompatSeekBar_tickMarkTintMode, -1), this.f1158g);
            this.f1160i = true;
        }
        if (a.mo1751g(C3102j.AppCompatSeekBar_tickMarkTint)) {
            this.f1157f = a.mo1735a(C3102j.AppCompatSeekBar_tickMarkTint);
            this.f1159h = true;
        }
        a.mo1737a();
        m1266d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1668b() {
        Drawable drawable = this.f1156e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1155d.getDrawableState())) {
            this.f1155d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1669c() {
        Drawable drawable = this.f1156e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
