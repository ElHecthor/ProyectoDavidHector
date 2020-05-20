package p255io.stashteam.stashapp.p256b.p257a;

import android.app.Application;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.Map.Entry;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.b.a.d */
public final class C4939d implements C4937b {

    /* renamed from: a */
    private final FirebaseAnalytics f12843a;

    public C4939d(Application application) {
        C5942k.m22327b(application, "application");
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(application);
        C5942k.m22324a((Object) instance, "FirebaseAnalytics.getInstance(application)");
        this.f12843a = instance;
    }

    /* renamed from: b */
    private final Bundle m19737b(Map<String, ? extends Object> map) {
        Bundle bundle = new Bundle();
        for (Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), entry.getValue().toString());
        }
        return bundle;
    }

    /* renamed from: a */
    public void mo14077a(String str, Map<String, ? extends Object> map) {
        C5942k.m22327b(str, "event");
        this.f12843a.mo9523a("sign_up", map != null ? m19737b(map) : null);
    }

    /* renamed from: a */
    public void mo14078a(Map<String, ? extends Object> map) {
        C5942k.m22327b(map, "params");
        for (Entry entry : map.entrySet()) {
            if (C5942k.m22326a((Object) (String) entry.getKey(), (Object) "user_id")) {
                this.f12843a.mo9522a(entry.getValue().toString());
            } else {
                this.f12843a.mo9524a((String) entry.getKey(), entry.getValue().toString());
            }
        }
    }
}
