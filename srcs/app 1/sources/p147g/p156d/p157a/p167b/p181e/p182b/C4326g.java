package p147g.p156d.p157a.p167b.p181e.p182b;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C2078b;
import com.google.android.gms.common.api.Status;
import p147g.p156d.p157a.p167b.p173d.p177d.C3875a;
import p147g.p156d.p157a.p167b.p173d.p177d.C3877c;

/* renamed from: g.d.a.b.e.b.g */
public abstract class C4326g extends C3875a implements C4323d {
    public C4326g() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12019a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            mo12985a((C2078b) C3877c.m15627a(parcel, C2078b.CREATOR), (C4322c) C3877c.m15627a(parcel, C4322c.CREATOR));
        } else if (i == 4) {
            mo12986d((Status) C3877c.m15627a(parcel, Status.CREATOR));
        } else if (i == 6) {
            mo12983a((Status) C3877c.m15627a(parcel, Status.CREATOR));
        } else if (i == 7) {
            mo12984a((Status) C3877c.m15627a(parcel, Status.CREATOR), (GoogleSignInAccount) C3877c.m15627a(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            mo6725a((C4331l) C3877c.m15627a(parcel, C4331l.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
