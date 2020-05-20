package p147g.p156d.p157a.p167b.p181e.p182b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.C1956c;
import com.google.android.gms.common.C2090i;
import com.google.android.gms.common.api.C2001f.C2002a;
import com.google.android.gms.common.api.C2001f.C2003b;
import com.google.android.gms.common.internal.C2095c.C2098c;
import com.google.android.gms.common.internal.C2109d;
import com.google.android.gms.common.internal.C2119h;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.C2150t;
import p147g.p156d.p157a.p167b.p181e.C4318a;
import p147g.p156d.p157a.p167b.p181e.C4334e;

/* renamed from: g.d.a.b.e.b.a */
public class C4320a extends C2119h<C4325f> implements C4334e {

    /* renamed from: A */
    private final C2109d f11483A;

    /* renamed from: B */
    private final Bundle f11484B;

    /* renamed from: C */
    private Integer f11485C;

    /* renamed from: z */
    private final boolean f11486z;

    private C4320a(Context context, Looper looper, boolean z, C2109d dVar, Bundle bundle, C2002a aVar, C2003b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.f11486z = true;
        this.f11483A = dVar;
        this.f11484B = bundle;
        this.f11485C = dVar.mo6870e();
    }

    public C4320a(Context context, Looper looper, boolean z, C2109d dVar, C4318a aVar, C2002a aVar2, C2003b bVar) {
        this(context, looper, true, dVar, m17670a(dVar), aVar2, bVar);
    }

    /* renamed from: a */
    public static Bundle m17670a(C2109d dVar) {
        C4318a i = dVar.mo6874i();
        Integer e = dVar.mo6870e();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.mo6864a());
        if (e != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", e.intValue());
        }
        if (i != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", i.mo12976j());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", i.mo12974h());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", i.mo12972f());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", i.mo12973g());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", i.mo12968b());
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", i.mo12969c());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", i.mo12977k());
            if (i.mo12967a() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", i.mo12967a().longValue());
            }
            if (i.mo12970e() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", i.mo12970e().longValue());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ IInterface mo6554a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C4325f ? (C4325f) queryLocalInterface : new C4327h(iBinder);
    }

    /* renamed from: a */
    public final void mo12978a(C4323d dVar) {
        C2148s.m8835a(dVar, (Object) "Expecting a valid ISignInCallbacks");
        try {
            Account c = this.f11483A.mo6868c();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(c.name)) {
                googleSignInAccount = C1956c.m8257a(mo6842s()).mo6542b();
            }
            ((C4325f) mo6846w()).mo12987a(new C4329j(new C2150t(c, this.f11485C.intValue(), googleSignInAccount)), dVar);
        } catch (RemoteException e) {
            String str = "SignInClientImpl";
            Log.w(str, "Remote service probably died when signIn is called");
            try {
                dVar.mo6725a(new C4331l(8));
            } catch (RemoteException unused) {
                Log.wtf(str, "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo6555c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* renamed from: e */
    public int mo6556e() {
        return C2090i.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* renamed from: j */
    public final void mo12979j() {
        mo6823a((C2098c) new C2099d());
    }

    /* renamed from: k */
    public boolean mo6835k() {
        return this.f11486z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public String mo6557l() {
        return "com.google.android.gms.signin.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Bundle mo6843t() {
        if (!mo6842s().getPackageName().equals(this.f11483A.mo6872g())) {
            this.f11484B.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f11483A.mo6872g());
        }
        return this.f11484B;
    }
}
