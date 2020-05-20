package p147g.p156d.p157a.p185c.p188c0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import p071f.p088e.C3175g;
import p071f.p112j.p113a.C3400a;

/* renamed from: g.d.a.c.c0.a */
public class C4406a extends C3400a {
    public static final Creator<C4406a> CREATOR = new C4407a();

    /* renamed from: h */
    public final C3175g<String, Bundle> f11692h;

    /* renamed from: g.d.a.c.c0.a$a */
    static class C4407a implements ClassLoaderCreator<C4406a> {
        C4407a() {
        }

        public C4406a createFromParcel(Parcel parcel) {
            return new C4406a(parcel, null, null);
        }

        public C4406a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C4406a(parcel, classLoader, null);
        }

        public C4406a[] newArray(int i) {
            return new C4406a[i];
        }
    }

    private C4406a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f11692h = new C3175g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f11692h.put(strArr[i], bundleArr[i]);
        }
    }

    /* synthetic */ C4406a(Parcel parcel, ClassLoader classLoader, C4407a aVar) {
        this(parcel, classLoader);
    }

    public C4406a(Parcelable parcelable) {
        super(parcelable);
        this.f11692h = new C3175g<>();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtendableSavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" states=");
        sb.append(this.f11692h);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f11692h.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = (String) this.f11692h.mo10271b(i2);
            bundleArr[i2] = (Bundle) this.f11692h.mo10274d(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
