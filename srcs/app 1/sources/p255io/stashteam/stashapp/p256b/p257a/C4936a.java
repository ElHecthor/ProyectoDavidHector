package p255io.stashteam.stashapp.p256b.p257a;

import android.app.Application;
import android.content.Context;
import java.util.Map;
import org.json.JSONObject;
import p147g.p148a.p149a.C3677b;
import p147g.p148a.p149a.C3679d;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.b.a.a */
public final class C4936a implements C4937b {

    /* renamed from: a */
    private final C3679d f12841a;

    public C4936a(Application application) {
        C5942k.m22327b(application, "application");
        C3679d a = C3677b.m14947a();
        a.mo11664a((Context) application, "32250395645b61526e28165183208ce8");
        a.mo11663a(application);
        this.f12841a = a;
    }

    /* renamed from: a */
    public void mo14077a(String str, Map<String, ? extends Object> map) {
        C5942k.m22327b(str, "event");
        if (map != null) {
            this.f12841a.mo11676a(str, new JSONObject(map));
        } else {
            this.f12841a.mo11688b(str);
        }
    }

    /* renamed from: a */
    public void mo14078a(Map<String, ? extends Object> map) {
        C5942k.m22327b(map, "params");
        Object obj = map.get("user_id");
        if (obj != null) {
            C3679d dVar = this.f12841a;
            C5942k.m22324a((Object) dVar, "amplitudeClient");
            dVar.mo11690c(obj.toString());
        }
        this.f12841a.mo11681a(new JSONObject(map));
    }
}
