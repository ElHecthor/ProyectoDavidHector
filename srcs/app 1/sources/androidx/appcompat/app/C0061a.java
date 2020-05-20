package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import p071f.p072a.C3102j;
import p071f.p072a.p079o.C3124b;
import p071f.p072a.p079o.C3124b.C3125a;

/* renamed from: androidx.appcompat.app.a */
public abstract class C0061a {

    /* renamed from: androidx.appcompat.app.a$a */
    public static class C0062a extends MarginLayoutParams {

        /* renamed from: a */
        public int f218a;

        public C0062a(int i, int i2) {
            super(i, i2);
            this.f218a = 0;
            this.f218a = 8388627;
        }

        public C0062a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f218a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3102j.ActionBarLayout);
            this.f218a = obtainStyledAttributes.getInt(C3102j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0062a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f218a = 0;
        }

        public C0062a(C0062a aVar) {
            super(aVar);
            this.f218a = 0;
            this.f218a = aVar.f218a;
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    public interface C0063b {
        /* renamed from: a */
        void mo201a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    public static abstract class C0064c {
        /* renamed from: a */
        public abstract CharSequence mo202a();

        /* renamed from: b */
        public abstract View mo203b();

        /* renamed from: c */
        public abstract Drawable mo204c();

        /* renamed from: d */
        public abstract CharSequence mo205d();

        /* renamed from: e */
        public abstract void mo206e();
    }

    /* renamed from: a */
    public C3124b mo184a(C3125a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo185a(Configuration configuration) {
    }

    /* renamed from: a */
    public abstract void mo186a(Drawable drawable);

    /* renamed from: a */
    public abstract void mo187a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo188a(int i, KeyEvent keyEvent);

    /* renamed from: a */
    public boolean mo189a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo190b(boolean z);

    /* renamed from: c */
    public abstract void mo191c(boolean z);

    /* renamed from: d */
    public abstract void mo192d(boolean z);

    /* renamed from: e */
    public abstract void mo193e(boolean z);

    /* renamed from: e */
    public boolean mo194e() {
        return false;
    }

    /* renamed from: f */
    public abstract boolean mo195f();

    /* renamed from: g */
    public abstract int mo196g();

    /* renamed from: h */
    public abstract Context mo197h();

    /* renamed from: i */
    public boolean mo198i() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo199j() {
    }

    /* renamed from: k */
    public boolean mo200k() {
        return false;
    }
}
