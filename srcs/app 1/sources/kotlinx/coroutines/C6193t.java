package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.t */
public class C6193t {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f15299b = AtomicIntegerFieldUpdater.newUpdater(C6193t.class, "_handled");
    private volatile int _handled;

    /* renamed from: a */
    public final Throwable f15300a;

    public C6193t(Throwable th, boolean z) {
        C5942k.m22327b(th, "cause");
        this.f15300a = th;
        this._handled = z ? 1 : 0;
    }

    public /* synthetic */ C6193t(Throwable th, boolean z, int i, C5938g gVar) {
        if ((i & 2) != 0) {
            z = false;
        }
        this(th, z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [int, boolean]
      assigns: [int]
      uses: [boolean]
      mth insns count: 2
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15962a() {
        /*
            r1 = this;
            int r0 = r1._handled
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6193t.mo15962a():boolean");
    }

    /* renamed from: b */
    public final boolean mo15963b() {
        return f15299b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C6161m0.m23157a((Object) this));
        sb.append('[');
        sb.append(this.f15300a);
        sb.append(']');
        return sb.toString();
    }
}
