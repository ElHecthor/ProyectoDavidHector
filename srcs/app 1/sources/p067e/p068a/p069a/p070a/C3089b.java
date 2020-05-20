package p067e.p068a.p069a.p070a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p067e.p068a.p069a.p070a.C3086a.C3087a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: e.a.a.a.b */
public class C3089b implements Parcelable {
    public static final Creator<C3089b> CREATOR = new C3090a();

    /* renamed from: f */
    final Handler f8752f = null;

    /* renamed from: g */
    C3086a f8753g;

    /* renamed from: e.a.a.a.b$a */
    static class C3090a implements Creator<C3089b> {
        C3090a() {
        }

        public C3089b createFromParcel(Parcel parcel) {
            return new C3089b(parcel);
        }

        public C3089b[] newArray(int i) {
            return new C3089b[i];
        }
    }

    /* renamed from: e.a.a.a.b$b */
    class C3091b extends C3087a {
        C3091b() {
        }

        /* renamed from: b */
        public void mo9907b(int i, Bundle bundle) {
            C3089b bVar = C3089b.this;
            Handler handler = bVar.f8752f;
            if (handler != null) {
                handler.post(new C3092c(i, bundle));
            } else {
                bVar.mo1a(i, bundle);
            }
        }
    }

    /* renamed from: e.a.a.a.b$c */
    class C3092c implements Runnable {

        /* renamed from: f */
        final int f8755f;

        /* renamed from: g */
        final Bundle f8756g;

        C3092c(int i, Bundle bundle) {
            this.f8755f = i;
            this.f8756g = bundle;
        }

        public void run() {
            C3089b.this.mo1a(this.f8755f, this.f8756g);
        }
    }

    C3089b(Parcel parcel) {
        this.f8753g = C3087a.m12549a(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f8753g == null) {
                this.f8753g = new C3091b();
            }
            parcel.writeStrongBinder(this.f8753g.asBinder());
        }
    }
}
