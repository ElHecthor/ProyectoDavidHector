package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.a0 */
public abstract class C0498a0 {

    /* renamed from: a */
    private final Map<String, Object> f2209a = new HashMap();

    /* renamed from: a */
    private static void m2698a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T> T mo3005a(String str) {
        T t;
        Map<String, Object> map = this.f2209a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.f2209a.get(str);
        }
        return t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3006a() {
        Map<String, Object> map = this.f2209a;
        if (map != null) {
            synchronized (map) {
                for (Object a : this.f2209a.values()) {
                    m2698a(a);
                }
            }
        }
        mo2855b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2855b() {
    }
}
