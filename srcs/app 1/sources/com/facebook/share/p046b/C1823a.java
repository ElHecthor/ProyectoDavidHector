package com.facebook.share.p046b;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.p046b.C1823a;
import com.facebook.share.p046b.C1824b.C1826b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.share.b.a */
public abstract class C1823a<P extends C1823a, E> implements C1830e {

    /* renamed from: f */
    private final Uri f5436f;

    /* renamed from: g */
    private final List<String> f5437g;

    /* renamed from: h */
    private final String f5438h;

    /* renamed from: i */
    private final String f5439i;

    /* renamed from: j */
    private final String f5440j;

    /* renamed from: k */
    private final C1824b f5441k;

    protected C1823a(Parcel parcel) {
        this.f5436f = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f5437g = m7895a(parcel);
        this.f5438h = parcel.readString();
        this.f5439i = parcel.readString();
        this.f5440j = parcel.readString();
        C1826b bVar = new C1826b();
        bVar.mo6258a(parcel);
        this.f5441k = bVar.mo6261a();
    }

    /* renamed from: a */
    private List<String> m7895a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public Uri mo6249a() {
        return this.f5436f;
    }

    /* renamed from: b */
    public C1824b mo6250b() {
        return this.f5441k;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5436f, 0);
        parcel.writeStringList(this.f5437g);
        parcel.writeString(this.f5438h);
        parcel.writeString(this.f5439i);
        parcel.writeString(this.f5440j);
        parcel.writeParcelable(this.f5441k, 0);
    }
}
