package com.bumptech.glide.load.p013q.p014d;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.p007o.p008a0.C0916b;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p071f.p118l.p119a.C3442a;

/* renamed from: com.bumptech.glide.load.q.d.q */
public final class C1169q implements ImageHeaderParser {
    /* renamed from: a */
    public int mo4611a(InputStream inputStream, C0916b bVar) {
        int a = new C3442a(inputStream).mo10983a("Orientation", 1);
        if (a == 0) {
            return -1;
        }
        return a;
    }

    /* renamed from: a */
    public ImageType mo4612a(InputStream inputStream) {
        return ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public ImageType mo4613a(ByteBuffer byteBuffer) {
        return ImageType.UNKNOWN;
    }
}
