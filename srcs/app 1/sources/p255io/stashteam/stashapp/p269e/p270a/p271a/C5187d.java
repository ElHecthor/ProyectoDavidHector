package p255io.stashteam.stashapp.p269e.p270a.p271a;

import p255io.stashteam.stashapp.p256b.p258b.p259a.C4940a;
import p255io.stashteam.stashapp.p256b.p261d.C4944a;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.a.d */
public final class C5187d {

    /* renamed from: a */
    private final C4940a f13520a;

    /* renamed from: b */
    private final C4944a f13521b;

    public C5187d(C4940a aVar, C4944a aVar2) {
        C5942k.m22327b(aVar, "preferencesManager");
        C5942k.m22327b(aVar2, "accountRepository");
        this.f13520a = aVar;
        this.f13521b = aVar2;
    }

    /* renamed from: a */
    public void mo14720a() {
        if (!this.f13520a.mo14097k()) {
            String f = this.f13520a.mo14092f();
            if (f != null) {
                this.f13521b.mo14149b(f);
            }
        }
        if (!this.f13520a.mo14096j()) {
            String c = this.f13520a.mo14089c();
            if (c != null) {
                this.f13521b.mo14143a(c);
            }
        }
        if (this.f13520a.mo14095i() && this.f13520a.mo14092f() != null) {
            String e = this.f13520a.mo14091e();
            if (e != null) {
                this.f13521b.mo14151d(e);
            }
        }
        if (this.f13520a.mo14094h() && this.f13520a.mo14089c() != null) {
            String b = this.f13520a.mo14085b();
            if (b != null) {
                this.f13521b.mo14150c(b);
            }
        }
        String d = this.f13520a.mo14090d();
        if (this.f13520a.mo14095i() && this.f13520a.mo14091e() == null && d != null) {
            this.f13521b.mo14152e(d);
        }
    }
}
