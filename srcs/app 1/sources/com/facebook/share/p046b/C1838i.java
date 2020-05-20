package com.facebook.share.p046b;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.p046b.C1838i;
import com.facebook.share.p046b.C1838i.C1839a;
import java.util.Set;

/* renamed from: com.facebook.share.b.i */
public abstract class C1838i<P extends C1838i, E extends C1839a> implements C1830e {

    /* renamed from: f */
    private final Bundle f5451f;

    /* renamed from: com.facebook.share.b.i$a */
    public static abstract class C1839a<P extends C1838i, E extends C1839a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f5452a = new Bundle();

        /* renamed from: a */
        public E mo6284a(P p) {
            if (p != null) {
                this.f5452a.putAll(p.mo6278a());
            }
            return this;
        }

        /* renamed from: a */
        public E mo6285a(String str, String str2) {
            this.f5452a.putString(str, str2);
            return this;
        }
    }

    C1838i(Parcel parcel) {
        this.f5451f = parcel.readBundle(C1839a.class.getClassLoader());
    }

    protected C1838i(C1839a<P, E> aVar) {
        this.f5451f = (Bundle) aVar.f5452a.clone();
    }

    /* renamed from: a */
    public Bundle mo6278a() {
        return (Bundle) this.f5451f.clone();
    }

    /* renamed from: a */
    public Object mo6279a(String str) {
        return this.f5451f.get(str);
    }

    /* renamed from: b */
    public String mo6280b(String str) {
        return this.f5451f.getString(str);
    }

    /* renamed from: b */
    public Set<String> mo6281b() {
        return this.f5451f.keySet();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f5451f);
    }
}
