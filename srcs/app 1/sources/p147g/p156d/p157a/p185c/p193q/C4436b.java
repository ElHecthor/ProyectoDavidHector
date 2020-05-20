package p147g.p156d.p157a.p185c.p193q;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import p147g.p156d.p157a.p185c.p193q.C4438d.C4443e;

/* renamed from: g.d.a.c.q.b */
public class C4436b extends FrameLayout implements C4438d {

    /* renamed from: f */
    private final C4437c f11769f;

    /* renamed from: a */
    public void mo13219a() {
        this.f11769f.mo13234b();
        throw null;
    }

    /* renamed from: b */
    public void mo13220b() {
        this.f11769f.mo13229a();
        throw null;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        C4437c cVar = this.f11769f;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.mo13231a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f11769f.mo13235c();
        throw null;
    }

    public int getCircularRevealScrimColor() {
        this.f11769f.mo13236d();
        throw null;
    }

    public C4443e getRevealInfo() {
        this.f11769f.mo13237e();
        throw null;
    }

    public boolean isOpaque() {
        C4437c cVar = this.f11769f;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.mo13238f();
        throw null;
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f11769f.mo13232a(drawable);
        throw null;
    }

    public void setCircularRevealScrimColor(int i) {
        this.f11769f.mo13230a(i);
        throw null;
    }

    public void setRevealInfo(C4443e eVar) {
        this.f11769f.mo13233a(eVar);
        throw null;
    }
}
