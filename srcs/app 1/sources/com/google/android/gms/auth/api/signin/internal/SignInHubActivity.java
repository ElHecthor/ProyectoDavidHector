package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.C0429d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C2001f;
import com.google.android.gms.common.api.Status;
import p071f.p126p.p127a.C3455a.C3456a;
import p071f.p126p.p128b.C3464b;
import p147g.p156d.p157a.p167b.p173d.p175b.C3862b;

@KeepName
public class SignInHubActivity extends C0429d {

    /* renamed from: z */
    private static boolean f5763z = false;

    /* renamed from: u */
    private boolean f5764u = false;

    /* renamed from: v */
    private SignInConfiguration f5765v;

    /* renamed from: w */
    private boolean f5766w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f5767x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public Intent f5768y;

    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    private class C1953a implements C3456a<Void> {
        private C1953a() {
        }

        /* renamed from: a */
        public final C3464b<Void> mo6532a(int i, Bundle bundle) {
            return new C1961h(SignInHubActivity.this, C2001f.m8358c());
        }

        /* renamed from: a */
        public final void mo6533a(C3464b<Void> bVar) {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo6534a(C3464b bVar, Object obj) {
            Void voidR = (Void) obj;
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f5767x, SignInHubActivity.this.f5768y);
            SignInHubActivity.this.finish();
        }
    }

    /* renamed from: b */
    private final void m8247b(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f5763z = false;
    }

    /* renamed from: q */
    private final void m8248q() {
        mo2667m().mo11016a(0, null, new C1953a());
        f5763z = false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f5764u) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    String str = "signInAccount";
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(str);
                    if (signInAccount == null || signInAccount.mo6511d() == null) {
                        String str2 = "errorCode";
                        if (intent.hasExtra(str2)) {
                            int intExtra = intent.getIntExtra(str2, 8);
                            if (intExtra == 13) {
                                intExtra = 12501;
                            }
                            m8247b(intExtra);
                            return;
                        }
                    } else {
                        GoogleSignInAccount d = signInAccount.mo6511d();
                        C1968o a = C1968o.m8292a(this);
                        GoogleSignInOptions e = this.f5765v.mo6527e();
                        C3862b.m15606a(d);
                        a.mo6561a(e, d);
                        intent.removeExtra(str);
                        intent.putExtra("googleSignInAccount", d);
                        this.f5766w = true;
                        this.f5767x = i2;
                        this.f5768y = intent;
                        m8248q();
                        return;
                    }
                }
                m8247b(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        C3862b.m15606a(action);
        String str = action;
        if ("com.google.android.gms.auth.NO_IMPL".equals(str)) {
            m8247b(12500);
            return;
        }
        String str2 = "com.google.android.gms.auth.GOOGLE_SIGN_IN";
        String str3 = "AuthSignInClient";
        if (str.equals(str2) || str.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String str4 = "config";
            Bundle bundleExtra = intent.getBundleExtra(str4);
            C3862b.m15606a(bundleExtra);
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable(str4);
            if (signInConfiguration == null) {
                Log.e(str3, "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f5765v = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.f5766w = z;
                if (z) {
                    this.f5767x = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    C3862b.m15606a(intent2);
                    this.f5768y = intent2;
                    m8248q();
                }
            } else if (f5763z) {
                setResult(0);
                m8247b(12502);
            } else {
                f5763z = true;
                Intent intent3 = new Intent(str);
                intent3.setPackage(str.equals(str2) ? "com.google.android.gms" : getPackageName());
                intent3.putExtra(str4, this.f5765v);
                try {
                    startActivityForResult(intent3, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.f5764u = true;
                    Log.w(str3, "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    m8247b(17);
                }
            }
        } else {
            String str5 = "Unknown action: ";
            String valueOf = String.valueOf(intent.getAction());
            Log.e(str3, valueOf.length() != 0 ? str5.concat(valueOf) : new String(str5));
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f5766w);
        if (this.f5766w) {
            bundle.putInt("signInResultCode", this.f5767x);
            bundle.putParcelable("signInResultData", this.f5768y);
        }
    }
}
