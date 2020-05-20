package p147g.p156d.p157a.p167b.p173d.p180g;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g.d.a.b.d.g.wc */
public final class C4271wc extends C3956cd {

    /* renamed from: a */
    private final AtomicReference<Bundle> f11421a = new AtomicReference<>();

    /* renamed from: b */
    private boolean f11422b;

    /* renamed from: a */
    public static <T> T m17508a(Bundle bundle, Class<T> cls) {
        if (bundle != null) {
            Object obj = bundle.get("r");
            if (obj != null) {
                try {
                    return cls.cast(obj);
                } catch (ClassCastException e) {
                    String canonicalName = cls.getCanonicalName();
                    String canonicalName2 = obj.getClass().getCanonicalName();
                    Object[] objArr = {canonicalName, canonicalName2};
                    String str = "AM";
                    Log.w(str, String.format("Unexpected object type. Expected, Received".concat(": %s, %s"), objArr), e);
                    throw e;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final String mo12898a(long j) {
        return (String) m17508a(mo12899b(j), String.class);
    }

    /* renamed from: a */
    public final void mo12121a(Bundle bundle) {
        synchronized (this.f11421a) {
            try {
                this.f11421a.set(bundle);
                this.f11422b = true;
                this.f11421a.notify();
            } catch (Throwable th) {
                this.f11421a.notify();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final Bundle mo12899b(long j) {
        Bundle bundle;
        synchronized (this.f11421a) {
            if (!this.f11422b) {
                try {
                    this.f11421a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f11421a.get();
        }
        return bundle;
    }
}
