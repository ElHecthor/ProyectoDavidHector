package p071f.p139v;

import android.view.View;
import android.view.WindowId;

/* renamed from: f.v.l0 */
class C3606l0 implements C3614m0 {

    /* renamed from: a */
    private final WindowId f10116a;

    C3606l0(View view) {
        this.f10116a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3606l0) && ((C3606l0) obj).f10116a.equals(this.f10116a);
    }

    public int hashCode() {
        return this.f10116a.hashCode();
    }
}
