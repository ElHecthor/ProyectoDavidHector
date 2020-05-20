package com.bumptech.glide.load.p013q.p018h;

import android.util.Log;
import com.bumptech.glide.load.C0861f;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0875k;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p007o.p008a0.C0916b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.q.h.j */
public class C1208j implements C0875k<InputStream, C1196c> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f4034a;

    /* renamed from: b */
    private final C0875k<ByteBuffer, C1196c> f4035b;

    /* renamed from: c */
    private final C0916b f4036c;

    public C1208j(List<ImageHeaderParser> list, C0875k<ByteBuffer, C1196c> kVar, C0916b bVar) {
        this.f4034a = list;
        this.f4035b = kVar;
        this.f4036c = bVar;
    }

    /* renamed from: a */
    private static byte[] m5669a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            String str = "StreamGifDecoder";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Error reading data from stream", e);
            }
            return null;
        }
    }

    /* renamed from: a */
    public C1020v<C1196c> mo4631a(InputStream inputStream, int i, int i2, C0873i iVar) {
        byte[] a = m5669a(inputStream);
        if (a == null) {
            return null;
        }
        return this.f4035b.mo4631a(ByteBuffer.wrap(a), i, i2, iVar);
    }

    /* renamed from: a */
    public boolean mo4632a(InputStream inputStream, C0873i iVar) {
        return !((Boolean) iVar.mo4628a(C1207i.f4033b)).booleanValue() && C0861f.m4563b(this.f4034a, inputStream, this.f4036c) == ImageType.GIF;
    }
}
