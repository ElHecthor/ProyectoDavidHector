package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.versionedparcelable.C0776a;

public final class AudioAttributesImplApi21Parcelizer {
    public static C0549b read(C0776a aVar) {
        C0549b bVar = new C0549b();
        bVar.f2268a = (AudioAttributes) aVar.mo4287a(bVar.f2268a, 1);
        bVar.f2269b = aVar.mo4286a(bVar.f2269b, 2);
        return bVar;
    }

    public static void write(C0549b bVar, C0776a aVar) {
        aVar.mo4299a(false, false);
        aVar.mo4307b((Parcelable) bVar.f2268a, 1);
        aVar.mo4306b(bVar.f2269b, 2);
    }
}
