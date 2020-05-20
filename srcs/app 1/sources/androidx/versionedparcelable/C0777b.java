package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p071f.p088e.C3162a;

/* renamed from: androidx.versionedparcelable.b */
class C0777b extends C0776a {

    /* renamed from: d */
    private final SparseIntArray f3052d;

    /* renamed from: e */
    private final Parcel f3053e;

    /* renamed from: f */
    private final int f3054f;

    /* renamed from: g */
    private final int f3055g;

    /* renamed from: h */
    private final String f3056h;

    /* renamed from: i */
    private int f3057i;

    /* renamed from: j */
    private int f3058j;

    /* renamed from: k */
    private int f3059k;

    C0777b(Parcel parcel) {
        Parcel parcel2 = parcel;
        this(parcel2, parcel.dataPosition(), parcel.dataSize(), "", new C3162a(), new C3162a(), new C3162a());
    }

    private C0777b(Parcel parcel, int i, int i2, String str, C3162a<String, Method> aVar, C3162a<String, Method> aVar2, C3162a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f3052d = new SparseIntArray();
        this.f3057i = -1;
        this.f3058j = 0;
        this.f3059k = -1;
        this.f3053e = parcel;
        this.f3054f = i;
        this.f3055g = i2;
        this.f3058j = i;
        this.f3056h = str;
    }

    /* renamed from: a */
    public void mo4292a() {
        int i = this.f3057i;
        if (i >= 0) {
            int i2 = this.f3052d.get(i);
            int dataPosition = this.f3053e.dataPosition();
            int i3 = dataPosition - i2;
            this.f3053e.setDataPosition(i2);
            this.f3053e.writeInt(i3);
            this.f3053e.setDataPosition(dataPosition);
        }
    }

    /* renamed from: a */
    public void mo4293a(Parcelable parcelable) {
        this.f3053e.writeParcelable(parcelable, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4296a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3053e, 0);
    }

    /* renamed from: a */
    public void mo4297a(String str) {
        this.f3053e.writeString(str);
    }

    /* renamed from: a */
    public void mo4298a(boolean z) {
        this.f3053e.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo4300a(byte[] bArr) {
        if (bArr != null) {
            this.f3053e.writeInt(bArr.length);
            this.f3053e.writeByteArray(bArr);
            return;
        }
        this.f3053e.writeInt(-1);
    }

    /* renamed from: a */
    public boolean mo4301a(int i) {
        while (true) {
            boolean z = true;
            if (this.f3058j < this.f3055g) {
                int i2 = this.f3059k;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                this.f3053e.setDataPosition(this.f3058j);
                int readInt = this.f3053e.readInt();
                this.f3059k = this.f3053e.readInt();
                this.f3058j += readInt;
            } else {
                if (this.f3059k != i) {
                    z = false;
                }
                return z;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0776a mo4304b() {
        Parcel parcel = this.f3053e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3058j;
        if (i == this.f3054f) {
            i = this.f3055g;
        }
        int i2 = i;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3056h);
        sb.append("  ");
        C0777b bVar = new C0777b(parcel, dataPosition, i2, sb.toString(), this.f3049a, this.f3050b, this.f3051c);
        return bVar;
    }

    /* renamed from: b */
    public void mo4305b(int i) {
        mo4292a();
        this.f3057i = i;
        this.f3052d.put(i, this.f3053e.dataPosition());
        mo4313c(0);
        mo4313c(i);
    }

    /* renamed from: c */
    public void mo4313c(int i) {
        this.f3053e.writeInt(i);
    }

    /* renamed from: d */
    public boolean mo4315d() {
        return this.f3053e.readInt() != 0;
    }

    /* renamed from: e */
    public byte[] mo4316e() {
        int readInt = this.f3053e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f3053e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public CharSequence mo4317f() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3053e);
    }

    /* renamed from: g */
    public int mo4318g() {
        return this.f3053e.readInt();
    }

    /* renamed from: h */
    public <T extends Parcelable> T mo4319h() {
        return this.f3053e.readParcelable(C0777b.class.getClassLoader());
    }

    /* renamed from: i */
    public String mo4320i() {
        return this.f3053e.readString();
    }
}
