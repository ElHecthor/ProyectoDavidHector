package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.C0514h.C0516b;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
final class C0423b implements Parcelable {
    public static final Creator<C0423b> CREATOR = new C0424a();

    /* renamed from: f */
    final int[] f1933f;

    /* renamed from: g */
    final ArrayList<String> f1934g;

    /* renamed from: h */
    final int[] f1935h;

    /* renamed from: i */
    final int[] f1936i;

    /* renamed from: j */
    final int f1937j;

    /* renamed from: k */
    final String f1938k;

    /* renamed from: l */
    final int f1939l;

    /* renamed from: m */
    final int f1940m;

    /* renamed from: n */
    final CharSequence f1941n;

    /* renamed from: o */
    final int f1942o;

    /* renamed from: p */
    final CharSequence f1943p;

    /* renamed from: q */
    final ArrayList<String> f1944q;

    /* renamed from: r */
    final ArrayList<String> f1945r;

    /* renamed from: s */
    final boolean f1946s;

    /* renamed from: androidx.fragment.app.b$a */
    static class C0424a implements Creator<C0423b> {
        C0424a() {
        }

        public C0423b createFromParcel(Parcel parcel) {
            return new C0423b(parcel);
        }

        public C0423b[] newArray(int i) {
            return new C0423b[i];
        }
    }

    public C0423b(Parcel parcel) {
        this.f1933f = parcel.createIntArray();
        this.f1934g = parcel.createStringArrayList();
        this.f1935h = parcel.createIntArray();
        this.f1936i = parcel.createIntArray();
        this.f1937j = parcel.readInt();
        this.f1938k = parcel.readString();
        this.f1939l = parcel.readInt();
        this.f1940m = parcel.readInt();
        this.f1941n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1942o = parcel.readInt();
        this.f1943p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1944q = parcel.createStringArrayList();
        this.f1945r = parcel.createStringArrayList();
        this.f1946s = parcel.readInt() != 0;
    }

    public C0423b(C0422a aVar) {
        int size = aVar.f2080a.size();
        this.f1933f = new int[(size * 5)];
        if (aVar.f2086g) {
            this.f1934g = new ArrayList<>(size);
            this.f1935h = new int[size];
            this.f1936i = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0467a aVar2 = (C0467a) aVar.f2080a.get(i);
                int i3 = i2 + 1;
                this.f1933f[i2] = aVar2.f2096a;
                ArrayList<String> arrayList = this.f1934g;
                Fragment fragment = aVar2.f2097b;
                arrayList.add(fragment != null ? fragment.f1887j : null);
                int[] iArr = this.f1933f;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f2098c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f2099d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f2100e;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f2101f;
                this.f1935h[i] = aVar2.f2102g.ordinal();
                this.f1936i[i] = aVar2.f2103h.ordinal();
                i++;
                i2 = i7;
            }
            this.f1937j = aVar.f2085f;
            this.f1938k = aVar.f2087h;
            this.f1939l = aVar.f1932s;
            this.f1940m = aVar.f2088i;
            this.f1941n = aVar.f2089j;
            this.f1942o = aVar.f2090k;
            this.f1943p = aVar.f2091l;
            this.f1944q = aVar.f2092m;
            this.f1945r = aVar.f2093n;
            this.f1946s = aVar.f2094o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C0422a mo2644a(C0445l lVar) {
        C0422a aVar = new C0422a(lVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f1933f.length) {
            C0467a aVar2 = new C0467a();
            int i3 = i + 1;
            aVar2.f2096a = this.f1933f[i];
            if (C0445l.m2390d(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(aVar);
                sb.append(" op #");
                sb.append(i2);
                sb.append(" base fragment #");
                sb.append(this.f1933f[i3]);
                Log.v("FragmentManager", sb.toString());
            }
            String str = (String) this.f1934g.get(i2);
            aVar2.f2097b = str != null ? lVar.mo2754a(str) : null;
            aVar2.f2102g = C0516b.values()[this.f1935h[i2]];
            aVar2.f2103h = C0516b.values()[this.f1936i[i2]];
            int[] iArr = this.f1933f;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            aVar2.f2098c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar2.f2099d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar2.f2100e = i9;
            int i10 = i8 + 1;
            int i11 = iArr[i8];
            aVar2.f2101f = i11;
            aVar.f2081b = i5;
            aVar.f2082c = i7;
            aVar.f2083d = i9;
            aVar.f2084e = i11;
            aVar.mo2916a(aVar2);
            i2++;
            i = i10;
        }
        aVar.f2085f = this.f1937j;
        aVar.f2087h = this.f1938k;
        aVar.f1932s = this.f1939l;
        aVar.f2086g = true;
        aVar.f2088i = this.f1940m;
        aVar.f2089j = this.f1941n;
        aVar.f2090k = this.f1942o;
        aVar.f2091l = this.f1943p;
        aVar.f2092m = this.f1944q;
        aVar.f2093n = this.f1945r;
        aVar.f2094o = this.f1946s;
        aVar.mo2622a(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1933f);
        parcel.writeStringList(this.f1934g);
        parcel.writeIntArray(this.f1935h);
        parcel.writeIntArray(this.f1936i);
        parcel.writeInt(this.f1937j);
        parcel.writeString(this.f1938k);
        parcel.writeInt(this.f1939l);
        parcel.writeInt(this.f1940m);
        TextUtils.writeToParcel(this.f1941n, parcel, 0);
        parcel.writeInt(this.f1942o);
        TextUtils.writeToParcel(this.f1943p, parcel, 0);
        parcel.writeStringList(this.f1944q);
        parcel.writeStringList(this.f1945r);
        parcel.writeInt(this.f1946s ? 1 : 0);
    }
}
