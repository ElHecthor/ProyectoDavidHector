package p071f.p139v;

import android.os.IBinder;

/* renamed from: f.v.k0 */
class C3604k0 implements C3614m0 {

    /* renamed from: a */
    private final IBinder f10113a;

    C3604k0(IBinder iBinder) {
        this.f10113a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3604k0) && ((C3604k0) obj).f10113a.equals(this.f10113a);
    }

    public int hashCode() {
        return this.f10113a.hashCode();
    }
}
