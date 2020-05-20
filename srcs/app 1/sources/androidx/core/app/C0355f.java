package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0514h.C0516b;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0524o;
import androidx.lifecycle.C0540x;
import p071f.p088e.C3175g;
import p071f.p097h.p108m.C3341e;
import p071f.p097h.p108m.C3341e.C3342a;

/* renamed from: androidx.core.app.f */
public class C0355f extends Activity implements C0523n, C3342a {

    /* renamed from: f */
    private C0524o f1646f = new C0524o(this);

    public C0355f() {
        new C3175g();
    }

    /* renamed from: a */
    public boolean mo374a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C3341e.m13613a(decorView, keyEvent)) {
            return C3341e.m13614a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C3341e.m13613a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0540x.m2788b((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f1646f.mo3042a(C0516b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
