package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.p */
final class C0461p implements Parcelable {
    public static final Creator<C0461p> CREATOR = new C0462a();

    /* renamed from: f */
    final String f2061f;

    /* renamed from: g */
    final String f2062g;

    /* renamed from: h */
    final boolean f2063h;

    /* renamed from: i */
    final int f2064i;

    /* renamed from: j */
    final int f2065j;

    /* renamed from: k */
    final String f2066k;

    /* renamed from: l */
    final boolean f2067l;

    /* renamed from: m */
    final boolean f2068m;

    /* renamed from: n */
    final boolean f2069n;

    /* renamed from: o */
    final Bundle f2070o;

    /* renamed from: p */
    final boolean f2071p;

    /* renamed from: q */
    final int f2072q;

    /* renamed from: r */
    Bundle f2073r;

    /* renamed from: androidx.fragment.app.p$a */
    static class C0462a implements Creator<C0461p> {
        C0462a() {
        }

        public C0461p createFromParcel(Parcel parcel) {
            return new C0461p(parcel);
        }

        public C0461p[] newArray(int i) {
            return new C0461p[i];
        }
    }

    C0461p(Parcel parcel) {
        this.f2061f = parcel.readString();
        this.f2062g = parcel.readString();
        boolean z = true;
        this.f2063h = parcel.readInt() != 0;
        this.f2064i = parcel.readInt();
        this.f2065j = parcel.readInt();
        this.f2066k = parcel.readString();
        this.f2067l = parcel.readInt() != 0;
        this.f2068m = parcel.readInt() != 0;
        this.f2069n = parcel.readInt() != 0;
        this.f2070o = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.f2071p = z;
        this.f2073r = parcel.readBundle();
        this.f2072q = parcel.readInt();
    }

    C0461p(Fragment fragment) {
        this.f2061f = fragment.getClass().getName();
        this.f2062g = fragment.f1887j;
        this.f2063h = fragment.f1895r;
        this.f2064i = fragment.f1857A;
        this.f2065j = fragment.f1858B;
        this.f2066k = fragment.f1859C;
        this.f2067l = fragment.f1862F;
        this.f2068m = fragment.f1894q;
        this.f2069n = fragment.f1861E;
        this.f2070o = fragment.f1888k;
        this.f2071p = fragment.f1860D;
        this.f2072q = fragment.f1877U.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2061f);
        sb.append(" (");
        sb.append(this.f2062g);
        sb.append(")}:");
        if (this.f2063h) {
            sb.append(" fromLayout");
        }
        if (this.f2065j != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2065j));
        }
        String str = this.f2066k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2066k);
        }
        if (this.f2067l) {
            sb.append(" retainInstance");
        }
        if (this.f2068m) {
            sb.append(" removing");
        }
        if (this.f2069n) {
            sb.append(" detached");
        }
        if (this.f2071p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2061f);
        parcel.writeString(this.f2062g);
        parcel.writeInt(this.f2063h ? 1 : 0);
        parcel.writeInt(this.f2064i);
        parcel.writeInt(this.f2065j);
        parcel.writeString(this.f2066k);
        parcel.writeInt(this.f2067l ? 1 : 0);
        parcel.writeInt(this.f2068m ? 1 : 0);
        parcel.writeInt(this.f2069n ? 1 : 0);
        parcel.writeBundle(this.f2070o);
        parcel.writeInt(this.f2071p ? 1 : 0);
        parcel.writeBundle(this.f2073r);
        parcel.writeInt(this.f2072q);
    }
}
