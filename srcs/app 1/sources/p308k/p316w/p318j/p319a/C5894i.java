package p308k.p316w.p318j.p319a;

import java.lang.reflect.Method;

/* renamed from: k.w.j.a.i */
final class C5894i {

    /* renamed from: a */
    private static final C5895a f14918a = new C5895a(null, null, null);

    /* renamed from: b */
    public static C5895a f14919b;

    /* renamed from: c */
    public static final C5894i f14920c = new C5894i();

    /* renamed from: k.w.j.a.i$a */
    private static final class C5895a {

        /* renamed from: a */
        public final Method f14921a;

        /* renamed from: b */
        public final Method f14922b;

        /* renamed from: c */
        public final Method f14923c;

        public C5895a(Method method, Method method2, Method method3) {
            this.f14921a = method;
            this.f14922b = method2;
            this.f14923c = method3;
        }
    }

    private C5894i() {
    }

    /* renamed from: b */
    private final C5895a m22281b(C5886a aVar) {
        try {
            C5895a aVar2 = new C5895a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f14919b = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C5895a aVar3 = f14918a;
            f14919b = aVar3;
            return aVar3;
        }
    }

    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo15598a(p308k.p316w.p318j.p319a.C5886a r6) {
        /*
            r5 = this;
            java.lang.String r0 = "continuation"
            p308k.p323z.p325d.C5942k.m22327b(r6, r0)
            k.w.j.a.i$a r0 = f14919b
            if (r0 == 0) goto L_0x000a
            goto L_0x000e
        L_0x000a:
            k.w.j.a.i$a r0 = r5.m22281b(r6)
        L_0x000e:
            k.w.j.a.i$a r1 = f14918a
            r2 = 0
            if (r0 != r1) goto L_0x0014
            return r2
        L_0x0014:
            java.lang.reflect.Method r1 = r0.f14921a
            if (r1 == 0) goto L_0x0045
            java.lang.Class r6 = r6.getClass()
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Object r6 = r1.invoke(r6, r4)
            if (r6 == 0) goto L_0x0045
            java.lang.reflect.Method r1 = r0.f14922b
            if (r1 == 0) goto L_0x0045
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Object r6 = r1.invoke(r6, r4)
            if (r6 == 0) goto L_0x0045
            java.lang.reflect.Method r0 = r0.f14923c
            if (r0 == 0) goto L_0x003c
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Object r6 = r0.invoke(r6, r1)
            goto L_0x003d
        L_0x003c:
            r6 = r2
        L_0x003d:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r2 = r6
        L_0x0043:
            java.lang.String r2 = (java.lang.String) r2
        L_0x0045:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p308k.p316w.p318j.p319a.C5894i.mo15598a(k.w.j.a.a):java.lang.String");
    }
}
