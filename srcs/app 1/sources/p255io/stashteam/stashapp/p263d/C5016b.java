package p255io.stashteam.stashapp.p263d;

import android.app.Activity;
import com.facebook.C1522e;
import com.facebook.C1522e.C1523a;
import com.facebook.login.C1772m;
import com.google.android.gms.auth.api.signin.C1942a;
import com.google.android.gms.auth.api.signin.C1943b;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C1941a;
import p255io.stashteam.stashapp.p298ui.auth.signin.SignInActivity;
import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p308k.p323z.p325d.C5950s;
import p352o.p353a.p364c.p366e.C6532b;
import p352o.p353a.p364c.p366e.C6534c;
import p352o.p353a.p364c.p366e.C6535d;
import p352o.p353a.p364c.p366e.C6536e;
import p352o.p353a.p364c.p367f.C6539b;
import p352o.p353a.p364c.p370i.C6556a;
import p352o.p353a.p364c.p371j.C6557a;
import p352o.p353a.p364c.p372k.C6560a;
import p352o.p353a.p364c.p372k.C6561b;
import p352o.p353a.p364c.p374m.C6565a;
import p352o.p353a.p376d.C6570a;
import p352o.p353a.p376d.C6571b;

/* renamed from: io.stashteam.stashapp.d.b */
public final class C5016b {

    /* renamed from: a */
    private static final C6556a f13231a = C6570a.m24848a(false, false, C5017a.f13232g, 3, null);

    /* renamed from: io.stashteam.stashapp.d.b$a */
    static final class C5017a extends C5943l implements C5918l<C6556a, C5812t> {

        /* renamed from: g */
        public static final C5017a f13232g = new C5017a();

        /* renamed from: io.stashteam.stashapp.d.b$a$a */
        static final class C5018a extends C5943l implements C5918l<C6571b, C5812t> {

            /* renamed from: g */
            public static final C5018a f13233g = new C5018a();

            /* renamed from: io.stashteam.stashapp.d.b$a$a$a */
            static final class C5019a extends C5943l implements C5922p<C6565a, C6557a, C1943b> {

                /* renamed from: g */
                public static final C5019a f13234g = new C5019a();

                C5019a() {
                    super(2);
                }

                /* renamed from: a */
                public final C1943b mo4018c(C6565a aVar, C6557a aVar2) {
                    C5942k.m22327b(aVar, "$receiver");
                    C5942k.m22327b(aVar2, "<name for destructuring parameter 0>");
                    return C5016b.m20069b((Activity) aVar2.mo16993a());
                }
            }

            /* renamed from: io.stashteam.stashapp.d.b$a$a$b */
            static final class C5020b extends C5943l implements C5922p<C6565a, C6557a, C1772m> {

                /* renamed from: g */
                public static final C5020b f13235g = new C5020b();

                C5020b() {
                    super(2);
                }

                /* renamed from: a */
                public final C1772m mo4018c(C6565a aVar, C6557a aVar2) {
                    C5942k.m22327b(aVar, "$receiver");
                    C5942k.m22327b(aVar2, "it");
                    return C1772m.m7675b();
                }
            }

            /* renamed from: io.stashteam.stashapp.d.b$a$a$c */
            static final class C5021c extends C5943l implements C5922p<C6565a, C6557a, C1522e> {

                /* renamed from: g */
                public static final C5021c f13236g = new C5021c();

                C5021c() {
                    super(2);
                }

                /* renamed from: a */
                public final C1522e mo4018c(C6565a aVar, C6557a aVar2) {
                    C5942k.m22327b(aVar, "$receiver");
                    C5942k.m22327b(aVar2, "it");
                    return C1523a.m6820a();
                }
            }

            C5018a() {
                super(1);
            }

            /* renamed from: a */
            public final void mo14192a(C6571b bVar) {
                C5942k.m22327b(bVar, "$receiver");
                C5019a aVar = C5019a.f13234g;
                C6534c cVar = C6534c.f16180a;
                C6560a c = bVar.mo17032c();
                C6535d dVar = C6535d.Scoped;
                C6532b bVar2 = new C6532b(null, c, C5950s.m22341a(C1943b.class));
                bVar2.mo16947a((C5922p<? super C6565a, ? super C6557a, ? extends T>) aVar);
                bVar2.mo16948a(dVar);
                bVar.mo17030a(bVar2, new C6536e(false, false));
                String str = " as it already exists";
                String str2 = " for scope ";
                String str3 = "Can't add definition ";
                if (!bVar.mo17031b().contains(bVar2)) {
                    bVar.mo17031b().add(bVar2);
                    C5020b bVar3 = C5020b.f13235g;
                    C6534c cVar2 = C6534c.f16180a;
                    C6560a c2 = bVar.mo17032c();
                    C6535d dVar2 = C6535d.Scoped;
                    C6532b bVar4 = new C6532b(null, c2, C5950s.m22341a(C1772m.class));
                    bVar4.mo16947a((C5922p<? super C6565a, ? super C6557a, ? extends T>) bVar3);
                    bVar4.mo16948a(dVar2);
                    bVar.mo17030a(bVar4, new C6536e(false, false));
                    if (!bVar.mo17031b().contains(bVar4)) {
                        bVar.mo17031b().add(bVar4);
                        C5021c cVar3 = C5021c.f13236g;
                        C6534c cVar4 = C6534c.f16180a;
                        C6560a c3 = bVar.mo17032c();
                        C6535d dVar3 = C6535d.Scoped;
                        C6532b bVar5 = new C6532b(null, c3, C5950s.m22341a(C1522e.class));
                        bVar5.mo16947a((C5922p<? super C6565a, ? super C6557a, ? extends T>) cVar3);
                        bVar5.mo16948a(dVar3);
                        bVar.mo17030a(bVar5, new C6536e(false, false));
                        if (!bVar.mo17031b().contains(bVar5)) {
                            bVar.mo17031b().add(bVar5);
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append(bVar5);
                        sb.append(str2);
                        sb.append(bVar.mo17032c());
                        sb.append(str);
                        throw new C6539b(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(bVar4);
                    sb2.append(str2);
                    sb2.append(bVar.mo17032c());
                    sb2.append(str);
                    throw new C6539b(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(bVar2);
                sb3.append(str2);
                sb3.append(bVar.mo17032c());
                sb3.append(str);
                throw new C6539b(sb3.toString());
            }

            /* renamed from: d */
            public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
                mo14192a((C6571b) obj);
                return C5812t.f14872a;
            }
        }

        C5017a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo14191a(C6556a aVar) {
            C5942k.m22327b(aVar, "$receiver");
            aVar.mo16990a((C6560a) new C6561b(C5950s.m22341a(SignInActivity.class)), (C5918l<? super C6571b, C5812t>) C5018a.f13233g);
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo14191a((C6556a) obj);
            return C5812t.f14872a;
        }
    }

    /* renamed from: a */
    public static final C6556a m20068a() {
        return f13231a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C1943b m20069b(Activity activity) {
        C1941a aVar = new C1941a(GoogleSignInOptions.f5727u);
        aVar.mo6504a("767397334359-3j7bksgp201vs99q5jf9jpf5g0nbcfo2.apps.googleusercontent.com");
        aVar.mo6506b();
        C1943b a = C1942a.m8233a(activity, aVar.mo6505a());
        C5942k.m22324a((Object) a, "GoogleSignIn.getClient(activity, options)");
        return a;
    }
}
