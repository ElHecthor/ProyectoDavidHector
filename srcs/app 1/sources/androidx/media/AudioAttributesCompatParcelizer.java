package androidx.media;

import androidx.versionedparcelable.C0776a;
import androidx.versionedparcelable.C0778c;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C0776a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f2267a = (C0548a) aVar.mo4288a(audioAttributesCompat.f2267a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C0776a aVar) {
        aVar.mo4299a(false, false);
        aVar.mo4308b((C0778c) audioAttributesCompat.f2267a, 1);
    }
}
