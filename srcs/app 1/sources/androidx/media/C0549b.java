package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* renamed from: androidx.media.b */
class C0549b implements C0548a {

    /* renamed from: a */
    AudioAttributes f2268a;

    /* renamed from: b */
    int f2269b = -1;

    C0549b() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0549b)) {
            return false;
        }
        return this.f2268a.equals(((C0549b) obj).f2268a);
    }

    public int hashCode() {
        return this.f2268a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioAttributesCompat: audioattributes=");
        sb.append(this.f2268a);
        return sb.toString();
    }
}
