package p147g.p156d.p157a.p167b.p173d.p180g;

import android.net.Uri;
import p071f.p088e.C3162a;

/* renamed from: g.d.a.b.d.g.c2 */
public final class C3943c2 {

    /* renamed from: a */
    private static final C3162a<String, Uri> f10842a = new C3162a<>();

    /* renamed from: a */
    public static synchronized Uri m16007a(String str) {
        Uri uri;
        synchronized (C3943c2.class) {
            uri = (Uri) f10842a.get(str);
            if (uri == null) {
                String str2 = "content://com.google.android.gms.phenotype/";
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                f10842a.put(str, uri);
            }
        }
        return uri;
    }
}
