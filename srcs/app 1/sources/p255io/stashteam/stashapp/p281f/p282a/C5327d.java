package p255io.stashteam.stashapp.p281f.p282a;

import android.content.ComponentCallbacks;
import p071f.p143x.C3657a;
import p255io.stashteam.stashapp.p256b.p258b.p259a.C4940a;
import p308k.C5797g;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: io.stashteam.stashapp.f.a.d */
public abstract class C5327d<VB extends C3657a> extends C5324a<VB> {

    /* renamed from: x */
    private final C5797g f13995x = C5799i.m22044a(new C5328a(this, null, null));

    /* renamed from: io.stashteam.stashapp.f.a.d$a */
    public static final class C5328a extends C5943l implements C5907a<C4940a> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f13996g;

        /* renamed from: h */
        final /* synthetic */ C6560a f13997h;

        /* renamed from: i */
        final /* synthetic */ C5907a f13998i;

        public C5328a(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f13996g = componentCallbacks;
            this.f13997h = aVar;
            this.f13998i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [io.stashteam.stashapp.b.b.a.a, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [io.stashteam.stashapp.b.b.a.a, java.lang.Object]
          assigns: [java.lang.Object]
          uses: [io.stashteam.stashapp.b.b.a.a]
          mth insns count: 9
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p255io.stashteam.stashapp.p256b.p258b.p259a.C4940a invoke() {
            /*
                r4 = this;
                android.content.ComponentCallbacks r0 = r4.f13996g
                o.a.c.k.a r1 = r4.f13997h
                k.z.c.a r2 = r4.f13998i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.b.a.a> r3 = p255io.stashteam.stashapp.p256b.p258b.p259a.C4940a.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p281f.p282a.C5327d.C5328a.invoke():java.lang.Object");
        }
    }

    /* renamed from: y */
    private final C4940a m20818y() {
        return (C4940a) this.f13995x.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo15028w() {
        return m20818y().mo14089c() != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo15029x() {
        return m20818y().mo14098l();
    }
}
