package p071f.p112j.p113a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

/* renamed from: f.j.a.a */
public abstract class C3400a implements Parcelable {
    public static final Creator<C3400a> CREATOR = new C3402b();

    /* renamed from: g */
    public static final C3400a f9620g = new C3401a();

    /* renamed from: f */
    private final Parcelable f9621f;

    /* renamed from: f.j.a.a$a */
    static class C3401a extends C3400a {
        C3401a() {
            super((C3401a) null);
        }
    }

    /* renamed from: f.j.a.a$b */
    static class C3402b implements ClassLoaderCreator<C3400a> {
        C3402b() {
        }

        public C3400a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        public C3400a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C3400a.f9620g;
            }
            throw new IllegalStateException("superState must be null");
        }

        public C3400a[] newArray(int i) {
            return new C3400a[i];
        }
    }

    private C3400a() {
        this.f9621f = null;
    }

    protected C3400a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f9620g;
        }
        this.f9621f = readParcelable;
    }

    protected C3400a(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == f9620g) {
                parcelable = null;
            }
            this.f9621f = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ C3400a(C3401a aVar) {
        this();
    }

    /* renamed from: a */
    public final Parcelable mo10880a() {
        return this.f9621f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f9621f, i);
    }
}
