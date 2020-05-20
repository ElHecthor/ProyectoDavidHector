package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.lifecycle.c0 */
public class C0508c0 {

    /* renamed from: a */
    private final HashMap<String, C0498a0> f2221a = new HashMap<>();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0498a0 mo3018a(String str) {
        return (C0498a0) this.f2221a.get(str);
    }

    /* renamed from: a */
    public final void mo3019a() {
        for (C0498a0 a : this.f2221a.values()) {
            a.mo3006a();
        }
        this.f2221a.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3020a(String str, C0498a0 a0Var) {
        C0498a0 a0Var2 = (C0498a0) this.f2221a.put(str, a0Var);
        if (a0Var2 != null) {
            a0Var2.mo2855b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Set<String> mo3021b() {
        return new HashSet(this.f2221a.keySet());
    }
}
