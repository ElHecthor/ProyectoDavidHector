package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import p071f.p072a.C3093a;
import p071f.p072a.p079o.C3124b;
import p071f.p072a.p079o.C3124b.C3125a;
import p071f.p097h.p108m.C3341e;
import p071f.p097h.p108m.C3341e.C3342a;

/* renamed from: androidx.appcompat.app.g */
public class C0090g extends Dialog implements C0068d {

    /* renamed from: f */
    private C0069e f322f;

    /* renamed from: g */
    private final C3342a f323g;

    /* renamed from: androidx.appcompat.app.g$a */
    class C0091a implements C3342a {
        C0091a() {
        }

        /* renamed from: a */
        public boolean mo374a(KeyEvent keyEvent) {
            return C0090g.this.mo364a(keyEvent);
        }
    }

    public C0090g(Context context) {
        this(context, 0);
    }

    public C0090g(Context context, int i) {
        super(context, m414a(context, i));
        this.f323g = new C0091a();
        C0069e a = mo362a();
        a.mo283d(m414a(context, i));
        a.mo269a((Bundle) null);
    }

    /* renamed from: a */
    private static int m414a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C3093a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public C0069e mo362a() {
        if (this.f322f == null) {
            this.f322f = C0069e.m267a((Dialog) this, (C0068d) this);
        }
        return this.f322f;
    }

    /* renamed from: a */
    public C3124b mo226a(C3125a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo230a(C3124b bVar) {
    }

    /* renamed from: a */
    public boolean mo363a(int i) {
        return mo362a().mo278b(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo364a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo362a().mo271a(view, layoutParams);
    }

    /* renamed from: b */
    public void mo235b(C3124b bVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C3341e.m13614a(this.f323g, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return mo362a().mo266a(i);
    }

    public void invalidateOptionsMenu() {
        mo362a().mo285f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo362a().mo284e();
        super.onCreate(bundle);
        mo362a().mo269a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo362a().mo289j();
    }

    public void setContentView(int i) {
        mo362a().mo280c(i);
    }

    public void setContentView(View view) {
        mo362a().mo270a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo362a().mo277b(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo362a().mo273a((CharSequence) getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo362a().mo273a(charSequence);
    }
}
