package p308k.p316w;

import p308k.C5809q;
import p308k.p316w.C5871g.C5874b;
import p308k.p316w.C5871g.C5876c;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.w.e */
public interface C5867e extends C5874b {

    /* renamed from: b */
    public static final C5869b f14898b = C5869b.f14899a;

    /* renamed from: k.w.e$a */
    public static final class C5868a {
        /* renamed from: a */
        public static <E extends C5874b> E m22228a(C5867e eVar, C5876c<E> cVar) {
            C5942k.m22327b(cVar, "key");
            E e = null;
            if (cVar instanceof C5860b) {
                C5860b bVar = (C5860b) cVar;
                if (bVar.mo15574a(eVar.getKey())) {
                    E a = bVar.mo15573a((C5874b) eVar);
                    if (a instanceof C5874b) {
                        e = a;
                    }
                }
                return e;
            }
            if (C5867e.f14898b != cVar) {
                eVar = null;
            } else if (eVar == null) {
                throw new C5809q("null cannot be cast to non-null type E");
            }
            return eVar;
        }

        /* renamed from: a */
        public static void m22229a(C5867e eVar, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "continuation");
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [k.w.e, k.w.g$b] */
        /* JADX WARNING: type inference failed for: r1v1, types: [k.w.g] */
        /* JADX WARNING: type inference failed for: r1v2, types: [k.w.h] */
        /* JADX WARNING: type inference failed for: r1v3, types: [k.w.g] */
        /* JADX WARNING: type inference failed for: r1v4, types: [k.w.h] */
        /* JADX WARNING: type inference failed for: r1v5 */
        /* JADX WARNING: type inference failed for: r1v6 */
        /* JADX WARNING: Incorrect type for immutable var: ssa=k.w.e, code=null, for r1v0, types: [k.w.e, k.w.g$b] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v5
          assigns: [k.w.e, k.w.h]
          uses: [k.w.g, k.w.g$b]
          mth insns count: 18
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static p308k.p316w.C5871g m22230b(p308k.p316w.C5867e r1, p308k.p316w.C5871g.C5876c<?> r2) {
            /*
                java.lang.String r0 = "key"
                p308k.p323z.p325d.C5942k.m22327b(r2, r0)
                boolean r0 = r2 instanceof p308k.p316w.C5860b
                if (r0 == 0) goto L_0x001e
                k.w.b r2 = (p308k.p316w.C5860b) r2
                k.w.g$c r0 = r1.getKey()
                boolean r0 = r2.mo15574a(r0)
                if (r0 == 0) goto L_0x001d
                k.w.g$b r2 = r2.mo15573a(r1)
                if (r2 == 0) goto L_0x001d
                k.w.h r1 = p308k.p316w.C5877h.f14901f
            L_0x001d:
                return r1
            L_0x001e:
                k.w.e$b r0 = p308k.p316w.C5867e.f14898b
                if (r0 != r2) goto L_0x0024
                k.w.h r1 = p308k.p316w.C5877h.f14901f
            L_0x0024:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p308k.p316w.C5867e.C5868a.m22230b(k.w.e, k.w.g$c):k.w.g");
        }
    }

    /* renamed from: k.w.e$b */
    public static final class C5869b implements C5876c<C5867e> {

        /* renamed from: a */
        static final /* synthetic */ C5869b f14899a = new C5869b();

        private C5869b() {
        }
    }

    /* renamed from: a */
    void mo15580a(C5866d<?> dVar);

    /* renamed from: b */
    <T> C5866d<T> mo15581b(C5866d<? super T> dVar);
}
