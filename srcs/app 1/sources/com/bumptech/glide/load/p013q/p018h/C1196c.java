package com.bumptech.glide.load.p013q.p018h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import com.bumptech.glide.C0832c;
import com.bumptech.glide.load.C0877m;
import com.bumptech.glide.load.p013q.p018h.C1201g.C1203b;
import com.bumptech.glide.p021n.C1226a;
import com.bumptech.glide.p029t.C1309j;
import java.nio.ByteBuffer;
import java.util.List;
import p071f.p140w.p141a.p142a.C3635b;
import p071f.p140w.p141a.p142a.C3635b.C3636a;

/* renamed from: com.bumptech.glide.load.q.h.c */
public class C1196c extends Drawable implements C1203b, Animatable, C3635b {

    /* renamed from: f */
    private final C1197a f3995f;

    /* renamed from: g */
    private boolean f3996g;

    /* renamed from: h */
    private boolean f3997h;

    /* renamed from: i */
    private boolean f3998i;

    /* renamed from: j */
    private boolean f3999j;

    /* renamed from: k */
    private int f4000k;

    /* renamed from: l */
    private int f4001l;

    /* renamed from: m */
    private boolean f4002m;

    /* renamed from: n */
    private Paint f4003n;

    /* renamed from: o */
    private Rect f4004o;

    /* renamed from: p */
    private List<C3636a> f4005p;

    /* renamed from: com.bumptech.glide.load.q.h.c$a */
    static final class C1197a extends ConstantState {

        /* renamed from: a */
        final C1201g f4006a;

        C1197a(C1201g gVar) {
            this.f4006a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new C1196c(this);
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public C1196c(Context context, C1226a aVar, C0877m<Bitmap> mVar, int i, int i2, Bitmap bitmap) {
        C1201g gVar = new C1201g(C0832c.m4445a(context), aVar, i, i2, mVar, bitmap);
        this(new C1197a(gVar));
    }

    C1196c(C1197a aVar) {
        this.f3999j = true;
        this.f4001l = -1;
        C1309j.m6149a(aVar);
        this.f3995f = aVar;
    }

    /* renamed from: h */
    private Callback m5616h() {
        Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: i */
    private Rect m5617i() {
        if (this.f4004o == null) {
            this.f4004o = new Rect();
        }
        return this.f4004o;
    }

    /* renamed from: j */
    private Paint m5618j() {
        if (this.f4003n == null) {
            this.f4003n = new Paint(2);
        }
        return this.f4003n;
    }

    /* renamed from: k */
    private void m5619k() {
        List<C3636a> list = this.f4005p;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C3636a) this.f4005p.get(i)).mo11419a(this);
            }
        }
    }

    /* renamed from: l */
    private void m5620l() {
        this.f4000k = 0;
    }

    /* renamed from: m */
    private void m5621m() {
        C1309j.m6153a(!this.f3998i, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f3995f.f4006a.mo5123f() != 1) {
            if (!this.f3996g) {
                this.f3996g = true;
                this.f3995f.f4006a.mo5117a((C1203b) this);
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    /* renamed from: n */
    private void m5622n() {
        this.f3996g = false;
        this.f3995f.f4006a.mo5119b(this);
    }

    /* renamed from: a */
    public void mo5090a() {
        if (m5616h() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo5096e() == mo5094d() - 1) {
            this.f4000k++;
        }
        int i = this.f4001l;
        if (i != -1 && this.f4000k >= i) {
            m5619k();
            stop();
        }
    }

    /* renamed from: a */
    public void mo5091a(C0877m<Bitmap> mVar, Bitmap bitmap) {
        this.f3995f.f4006a.mo5115a(mVar, bitmap);
    }

    /* renamed from: b */
    public ByteBuffer mo5092b() {
        return this.f3995f.f4006a.mo5118b();
    }

    /* renamed from: c */
    public Bitmap mo5093c() {
        return this.f3995f.f4006a.mo5122e();
    }

    /* renamed from: d */
    public int mo5094d() {
        return this.f3995f.f4006a.mo5123f();
    }

    public void draw(Canvas canvas) {
        if (!this.f3998i) {
            if (this.f4002m) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m5617i());
                this.f4002m = false;
            }
            canvas.drawBitmap(this.f3995f.f4006a.mo5120c(), null, m5617i(), m5618j());
        }
    }

    /* renamed from: e */
    public int mo5096e() {
        return this.f3995f.f4006a.mo5121d();
    }

    /* renamed from: f */
    public int mo5097f() {
        return this.f3995f.f4006a.mo5125h();
    }

    /* renamed from: g */
    public void mo5098g() {
        this.f3998i = true;
        this.f3995f.f4006a.mo5114a();
    }

    public ConstantState getConstantState() {
        return this.f3995f;
    }

    public int getIntrinsicHeight() {
        return this.f3995f.f4006a.mo5124g();
    }

    public int getIntrinsicWidth() {
        return this.f3995f.f4006a.mo5126i();
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f3996g;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4002m = true;
    }

    public void setAlpha(int i) {
        m5618j().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m5618j().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C1309j.m6153a(!this.f3998i, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f3999j = z;
        if (!z) {
            m5622n();
        } else if (this.f3997h) {
            m5621m();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f3997h = true;
        m5620l();
        if (this.f3999j) {
            m5621m();
        }
    }

    public void stop() {
        this.f3997h = false;
        m5622n();
    }
}
