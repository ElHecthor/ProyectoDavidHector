package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.common.internal.C2148s;
import com.google.firebase.p057e.C2905c;
import com.google.firebase.p057e.C2906d;

/* renamed from: com.google.firebase.messaging.a */
final class C3046a {

    /* renamed from: a */
    private final String f8669a;

    /* renamed from: b */
    private final Intent f8670b;

    /* renamed from: com.google.firebase.messaging.a$a */
    static final class C3047a {

        /* renamed from: a */
        private final C3046a f8671a;

        C3047a(C3046a aVar) {
            C2148s.m8834a(aVar);
            this.f8671a = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C3046a mo9818a() {
            return this.f8671a;
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    static class C3048b implements C2905c<C3046a> {
        C3048b() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo6324a(Object obj, Object obj2) {
            C3046a aVar = (C3046a) obj;
            C2906d dVar = (C2906d) obj2;
            Intent a = aVar.mo9816a();
            dVar.mo9586a("ttl", C3075w.m12488f(a));
            dVar.mo9588a("event", (Object) aVar.mo9817b());
            dVar.mo9588a("instanceId", (Object) C3075w.m12483c());
            dVar.mo9586a("priority", C3075w.m12495m(a));
            dVar.mo9588a("packageName", (Object) C3075w.m12481b());
            dVar.mo9588a("sdkPlatform", (Object) "ANDROID");
            dVar.mo9588a("messageType", (Object) C3075w.m12493k(a));
            String j = C3075w.m12492j(a);
            if (j != null) {
                dVar.mo9588a("messageId", (Object) j);
            }
            String l = C3075w.m12494l(a);
            if (l != null) {
                dVar.mo9588a("topic", (Object) l);
            }
            String g = C3075w.m12489g(a);
            if (g != null) {
                dVar.mo9588a("collapseKey", (Object) g);
            }
            if (C3075w.m12491i(a) != null) {
                dVar.mo9588a("analyticsLabel", (Object) C3075w.m12491i(a));
            }
            if (C3075w.m12490h(a) != null) {
                dVar.mo9588a("composerLabel", (Object) C3075w.m12490h(a));
            }
            String d = C3075w.m12485d();
            if (d != null) {
                dVar.mo9588a("projectNumber", (Object) d);
            }
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    static final class C3049c implements C2905c<C3047a> {
        C3049c() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo6324a(Object obj, Object obj2) {
            ((C2906d) obj2).mo9588a("messaging_client_event", (Object) ((C3047a) obj).mo9818a());
        }
    }

    C3046a(String str, Intent intent) {
        C2148s.m8836a(str, (Object) "evenType must be non-null");
        this.f8669a = str;
        C2148s.m8835a(intent, (Object) "intent must be non-null");
        this.f8670b = intent;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Intent mo9816a() {
        return this.f8670b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo9817b() {
        return this.f8669a;
    }
}
