package p147g.p156d.p157a.p167b.p168a.p169a;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C1960g;
import com.google.android.gms.auth.api.signin.internal.C1963j;
import com.google.android.gms.common.api.C1981a;
import com.google.android.gms.common.api.C1981a.C1982a;
import com.google.android.gms.common.api.C1981a.C1985d.C1990e;
import com.google.android.gms.common.api.C1981a.C1993g;
import com.google.android.gms.common.internal.C2141q;
import p147g.p156d.p157a.p167b.p168a.p169a.p170d.C3845a;
import p147g.p156d.p157a.p167b.p173d.p175b.C3866f;
import p147g.p156d.p157a.p167b.p173d.p175b.C3867g;

/* renamed from: g.d.a.b.a.a.a */
public final class C3840a {

    /* renamed from: a */
    public static final C1993g<C3867g> f10761a = new C1993g<>();

    /* renamed from: b */
    public static final C1993g<C1963j> f10762b = new C1993g<>();

    /* renamed from: c */
    private static final C1982a<C3867g, C3841a> f10763c = new C3847f();

    /* renamed from: d */
    private static final C1982a<C1963j, GoogleSignInOptions> f10764d = new C3848g();

    /* renamed from: e */
    public static final C1981a<GoogleSignInOptions> f10765e = new C1981a<>("Auth.GOOGLE_SIGN_IN_API", f10764d, f10762b);

    @Deprecated
    /* renamed from: g.d.a.b.a.a.a$a */
    public static class C3841a implements C1990e {

        /* renamed from: i */
        public static final C3841a f10766i = new C3842a().mo12006a();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final String f10767f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final boolean f10768g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final String f10769h;

        @Deprecated
        /* renamed from: g.d.a.b.a.a.a$a$a */
        public static class C3842a {

            /* renamed from: a */
            protected String f10770a;

            /* renamed from: b */
            protected Boolean f10771b = Boolean.valueOf(false);

            /* renamed from: c */
            protected String f10772c;

            public C3842a() {
            }

            public C3842a(C3841a aVar) {
                this.f10770a = aVar.f10767f;
                this.f10771b = Boolean.valueOf(aVar.f10768g);
                this.f10772c = aVar.f10769h;
            }

            /* renamed from: a */
            public C3842a mo12005a(String str) {
                this.f10772c = str;
                return this;
            }

            /* renamed from: a */
            public C3841a mo12006a() {
                return new C3841a(this);
            }
        }

        public C3841a(C3842a aVar) {
            this.f10767f = aVar.f10770a;
            this.f10768g = aVar.f10771b.booleanValue();
            this.f10769h = aVar.f10772c;
        }

        /* renamed from: a */
        public final Bundle mo12002a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", this.f10767f);
            bundle.putBoolean("force_save_dialog", this.f10768g);
            bundle.putString("log_session_id", this.f10769h);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3841a)) {
                return false;
            }
            C3841a aVar = (C3841a) obj;
            return C2141q.m8823a(this.f10767f, aVar.f10767f) && this.f10768g == aVar.f10768g && C2141q.m8823a(this.f10769h, aVar.f10769h);
        }

        public int hashCode() {
            return C2141q.m8821a(this.f10767f, Boolean.valueOf(this.f10768g), this.f10769h);
        }
    }

    static {
        C1981a<C3844c> aVar = C3843b.f10775c;
        new C1981a("Auth.CREDENTIALS_API", f10763c, f10761a);
        C3845a aVar2 = C3843b.f10776d;
        new C3866f();
        new C1960g();
    }
}
