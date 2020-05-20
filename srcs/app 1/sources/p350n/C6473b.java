package p350n;

import p308k.p313e0.C5769d;
import p308k.p323z.p325d.C5942k;

/* renamed from: n.b */
public final class C6473b {
    /* renamed from: a */
    public static final String m24469a(byte[] bArr) {
        C5942k.m22327b(bArr, "$this$toUtf8String");
        return new String(bArr, C5769d.f14834a);
    }

    /* renamed from: a */
    public static final byte[] m24470a(String str) {
        C5942k.m22327b(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(C5769d.f14834a);
        C5942k.m22324a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
