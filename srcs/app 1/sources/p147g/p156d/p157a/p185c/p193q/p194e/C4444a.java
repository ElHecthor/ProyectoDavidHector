package p147g.p156d.p157a.p185c.p193q.p194e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.google.android.material.card.MaterialCardView;
import p147g.p156d.p157a.p185c.p193q.C4437c;
import p147g.p156d.p157a.p185c.p193q.C4438d;
import p147g.p156d.p157a.p185c.p193q.C4438d.C4443e;

/* renamed from: g.d.a.c.q.e.a */
public class C4444a extends MaterialCardView implements C4438d {

    /* renamed from: x */
    private final C4437c f11778x;

    /* renamed from: a */
    public void mo13219a() {
        this.f11778x.mo13234b();
        throw null;
    }

    /* renamed from: b */
    public void mo13220b() {
        this.f11778x.mo13229a();
        throw null;
    }

    public void draw(Canvas canvas) {
        C4437c cVar = this.f11778x;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.mo13231a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f11778x.mo13235c();
        throw null;
    }

    public int getCircularRevealScrimColor() {
        this.f11778x.mo13236d();
        throw null;
    }

    public C4443e getRevealInfo() {
        this.f11778x.mo13237e();
        throw null;
    }

    public boolean isOpaque() {
        C4437c cVar = this.f11778x;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.mo13238f();
        throw null;
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f11778x.mo13232a(drawable);
        throw null;
    }

    public void setCircularRevealScrimColor(int i) {
        this.f11778x.mo13230a(i);
        throw null;
    }

    public void setRevealInfo(C4443e eVar) {
        this.f11778x.mo13233a(eVar);
        throw null;
    }
}
