package androidx.media;

import androidx.versionedparcelable.C0776a;

public final class AudioAttributesImplBaseParcelizer {
    public static C0550c read(C0776a aVar) {
        C0550c cVar = new C0550c();
        cVar.f2270a = aVar.mo4286a(cVar.f2270a, 1);
        cVar.f2271b = aVar.mo4286a(cVar.f2271b, 2);
        cVar.f2272c = aVar.mo4286a(cVar.f2272c, 3);
        cVar.f2273d = aVar.mo4286a(cVar.f2273d, 4);
        return cVar;
    }

    public static void write(C0550c cVar, C0776a aVar) {
        aVar.mo4299a(false, false);
        aVar.mo4306b(cVar.f2270a, 1);
        aVar.mo4306b(cVar.f2271b, 2);
        aVar.mo4306b(cVar.f2272c, 3);
        aVar.mo4306b(cVar.f2273d, 4);
    }
}
