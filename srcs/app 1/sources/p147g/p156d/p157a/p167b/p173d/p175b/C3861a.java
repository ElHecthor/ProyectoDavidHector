package p147g.p156d.p157a.p167b.p173d.p175b;

import android.util.Base64;
import java.util.Random;

/* renamed from: g.d.a.b.d.b.a */
public final class C3861a {

    /* renamed from: a */
    private static final Random f10780a = new Random();

    /* renamed from: a */
    public static String m15605a() {
        byte[] bArr = new byte[16];
        f10780a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
