package com.google.firebase.installations;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: com.google.firebase.installations.n */
public class C3012n {

    /* renamed from: a */
    private static final byte f8601a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f8602b = Byte.parseByte("00001111", 2);

    /* renamed from: a */
    private static String m12268a(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: a */
    private static byte[] m12269a(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String mo9735a() {
        byte[] a = m12269a(UUID.randomUUID(), new byte[17]);
        a[16] = a[0];
        a[0] = (byte) ((f8602b & a[0]) | f8601a);
        return m12268a(a);
    }
}
