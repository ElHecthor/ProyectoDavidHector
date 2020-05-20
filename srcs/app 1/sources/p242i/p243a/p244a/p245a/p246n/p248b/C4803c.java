package p242i.p243a.p244a.p245a.p246n.p248b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;
import p242i.p243a.p244a.p245a.p246n.p253f.C4903c;
import p242i.p243a.p244a.p245a.p246n.p253f.C4904d;

/* renamed from: i.a.a.a.n.b.c */
class C4803c {

    /* renamed from: a */
    private final Context f12552a;

    /* renamed from: b */
    private final C4903c f12553b;

    /* renamed from: i.a.a.a.n.b.c$a */
    class C4804a extends C4812h {

        /* renamed from: f */
        final /* synthetic */ C4802b f12554f;

        C4804a(C4802b bVar) {
            this.f12554f = bVar;
        }

        /* renamed from: a */
        public void mo5649a() {
            C4802b a = C4803c.this.m19325e();
            if (!this.f12554f.equals(a)) {
                C4781c.m19229f().mo13796e("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
                C4803c.this.m19324c(a);
            }
        }
    }

    public C4803c(Context context) {
        this.f12552a = context.getApplicationContext();
        this.f12553b = new C4904d(context, "TwitterAdvertisingInfoPreferences");
    }

    /* renamed from: a */
    private boolean m19322a(C4802b bVar) {
        return bVar != null && !TextUtils.isEmpty(bVar.f12550a);
    }

    /* renamed from: b */
    private void m19323b(C4802b bVar) {
        new Thread(new C4804a(bVar)).start();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: c */
    public void m19324c(C4802b bVar) {
        String str = "limit_ad_tracking_enabled";
        String str2 = "advertising_id";
        if (m19322a(bVar)) {
            C4903c cVar = this.f12553b;
            cVar.mo14053a(cVar.mo14052a().putString(str2, bVar.f12550a).putBoolean(str, bVar.f12551b));
            return;
        }
        C4903c cVar2 = this.f12553b;
        cVar2.mo14053a(cVar2.mo14052a().remove(str2).remove(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C4802b m19325e() {
        String str;
        C4795l lVar;
        C4802b a = mo13856c().mo13858a();
        String str2 = "Fabric";
        if (!m19322a(a)) {
            a = mo13857d().mo13858a();
            if (!m19322a(a)) {
                lVar = C4781c.m19229f();
                str = "AdvertisingInfo not present";
            } else {
                lVar = C4781c.m19229f();
                str = "Using AdvertisingInfo from Service Provider";
            }
        } else {
            lVar = C4781c.m19229f();
            str = "Using AdvertisingInfo from Reflection Provider";
        }
        lVar.mo13796e(str2, str);
        return a;
    }

    /* renamed from: a */
    public C4802b mo13854a() {
        C4802b b = mo13855b();
        if (m19322a(b)) {
            C4781c.m19229f().mo13796e("Fabric", "Using AdvertisingInfo from Preference Store");
            m19323b(b);
            return b;
        }
        C4802b e = m19325e();
        m19324c(e);
        return e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C4802b mo13855b() {
        return new C4802b(this.f12553b.get().getString("advertising_id", ""), this.f12553b.get().getBoolean("limit_ad_tracking_enabled", false));
    }

    /* renamed from: c */
    public C4810f mo13856c() {
        return new C4805d(this.f12552a);
    }

    /* renamed from: d */
    public C4810f mo13857d() {
        return new C4806e(this.f12552a);
    }
}
