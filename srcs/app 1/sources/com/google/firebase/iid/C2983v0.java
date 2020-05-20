package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

/* renamed from: com.google.firebase.iid.v0 */
public class C2983v0 implements Parcelable {
    public static final Creator<C2983v0> CREATOR = new C2981u0();

    /* renamed from: f */
    private Messenger f8544f;

    /* renamed from: g */
    private C2957j1 f8545g;

    /* renamed from: com.google.firebase.iid.v0$a */
    public static final class C2984a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (FirebaseInstanceId.m12069l()) {
                Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            }
            return C2983v0.class;
        }
    }

    public C2983v0(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.f8544f = new Messenger(iBinder);
        } else {
            this.f8545g = new C2954i1(iBinder);
        }
    }

    /* renamed from: a */
    private final IBinder m12195a() {
        Messenger messenger = this.f8544f;
        return messenger != null ? messenger.getBinder() : this.f8545g.asBinder();
    }

    /* renamed from: a */
    public final void mo9697a(Message message) {
        Messenger messenger = this.f8544f;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f8545g.mo9667a(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m12195a().equals(((C2983v0) obj).m12195a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m12195a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f8544f;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f8545g.asBinder());
    }
}
