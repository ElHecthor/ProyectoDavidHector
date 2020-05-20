package com.bumptech.glide.load;

import com.bumptech.glide.load.p007o.p008a0.C0916b;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: f */
        private final boolean f3367f;

        private ImageType(boolean z) {
            this.f3367f = z;
        }

        public boolean hasAlpha() {
            return this.f3367f;
        }
    }

    /* renamed from: a */
    int mo4611a(InputStream inputStream, C0916b bVar);

    /* renamed from: a */
    ImageType mo4612a(InputStream inputStream);

    /* renamed from: a */
    ImageType mo4613a(ByteBuffer byteBuffer);
}
