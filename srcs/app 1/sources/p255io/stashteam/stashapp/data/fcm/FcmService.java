package p255io.stashteam.stashapp.data.fcm;

import android.content.ComponentCallbacks;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.firebase.messaging.FirebaseMessagingService;
import p255io.stashteam.stashapp.p256b.p261d.C4944a;
import p308k.C5797g;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: io.stashteam.stashapp.data.fcm.FcmService */
public final class FcmService extends FirebaseMessagingService {

    /* renamed from: l */
    private final C5797g f13326l = C5799i.m22044a(new C5111a(this, null, null));

    /* renamed from: io.stashteam.stashapp.data.fcm.FcmService$a */
    public static final class C5111a extends C5943l implements C5907a<C4944a> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f13327g;

        /* renamed from: h */
        final /* synthetic */ C6560a f13328h;

        /* renamed from: i */
        final /* synthetic */ C5907a f13329i;

        public C5111a(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f13327g = componentCallbacks;
            this.f13328h = aVar;
            this.f13329i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, io.stashteam.stashapp.b.d.a] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [java.lang.Object, io.stashteam.stashapp.b.d.a]
          assigns: [java.lang.Object]
          uses: [io.stashteam.stashapp.b.d.a]
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
        public final p255io.stashteam.stashapp.p256b.p261d.C4944a invoke() {
            /*
                r4 = this;
                android.content.ComponentCallbacks r0 = r4.f13327g
                o.a.c.k.a r1 = r4.f13328h
                k.z.c.a r2 = r4.f13329i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.d.a> r3 = p255io.stashteam.stashapp.p256b.p261d.C4944a.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.fcm.FcmService.C5111a.invoke():java.lang.Object");
        }
    }

    /* renamed from: b */
    private final C4944a m20255b() {
        return (C4944a) this.f13326l.getValue();
    }

    /* renamed from: b */
    public void mo9813b(String str) {
        C5942k.m22327b(str, "token");
        super.mo9813b(str);
        Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext());
        C5942k.m22324a((Object) advertisingIdInfo, "AdvertisingIdClient.getA…dInfo(applicationContext)");
        String id = advertisingIdInfo.getId();
        C4944a b = m20255b();
        C5942k.m22324a((Object) id, "deviceId");
        b.mo14144a(id, str);
    }
}
