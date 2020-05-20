package p147g.p156d.p157a.p185c.p203z;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import androidx.core.graphics.drawable.C0372b;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p187b0.C4389k;
import p147g.p156d.p157a.p185c.p187b0.C4404n;

/* renamed from: g.d.a.c.z.a */
public class C4465a extends Drawable implements C4404n, C0372b {

    /* renamed from: f */
    private C4467b f11820f;

    /* renamed from: g.d.a.c.z.a$b */
    static final class C4467b extends ConstantState {

        /* renamed from: a */
        C4382g f11821a;

        /* renamed from: b */
        boolean f11822b;

        public C4467b(C4382g gVar) {
            this.f11821a = gVar;
            this.f11822b = false;
        }

        public C4467b(C4467b bVar) {
            this.f11821a = (C4382g) bVar.f11821a.getConstantState().newDrawable();
            this.f11822b = bVar.f11822b;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public C4465a newDrawable() {
            return new C4465a(new C4467b(this));
        }
    }

    public C4465a(C4389k kVar) {
        this(new C4467b(new C4382g(kVar)));
    }

    private C4465a(C4467b bVar) {
        this.f11820f = bVar;
    }

    public void draw(Canvas canvas) {
        C4467b bVar = this.f11820f;
        if (bVar.f11822b) {
            bVar.f11821a.draw(canvas);
        }
    }

    public ConstantState getConstantState() {
        return this.f11820f;
    }

    public int getOpacity() {
        return this.f11820f.f11821a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    public C4465a mutate() {
        this.f11820f = new C4467b(this.f11820f);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f11820f.f11821a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f11820f.f11821a.setState(iArr)) {
            onStateChange = true;
        }
        boolean a = C4468b.m18200a(iArr);
        C4467b bVar = this.f11820f;
        if (bVar.f11822b == a) {
            return onStateChange;
        }
        bVar.f11822b = a;
        return true;
    }

    public void setAlpha(int i) {
        this.f11820f.f11821a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f11820f.f11821a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(C4389k kVar) {
        this.f11820f.f11821a.setShapeAppearanceModel(kVar);
    }

    public void setTint(int i) {
        this.f11820f.f11821a.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f11820f.f11821a.setTintList(colorStateList);
    }

    public void setTintMode(Mode mode) {
        this.f11820f.f11821a.setTintMode(mode);
    }
}
