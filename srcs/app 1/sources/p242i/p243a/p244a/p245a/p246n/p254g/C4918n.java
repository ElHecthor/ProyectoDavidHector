package p242i.p243a.p244a.p245a.p246n.p254g;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;

/* renamed from: i.a.a.a.n.g.n */
public class C4918n {

    /* renamed from: a */
    public final String f12793a;

    /* renamed from: b */
    public final int f12794b;

    /* renamed from: c */
    public final int f12795c;

    /* renamed from: d */
    public final int f12796d;

    public C4918n(String str, int i, int i2, int i3) {
        this.f12793a = str;
        this.f12794b = i;
        this.f12795c = i2;
        this.f12796d = i3;
    }

    /* renamed from: a */
    public static C4918n m19713a(Context context, String str) {
        String str2 = "Fabric";
        if (str != null) {
            try {
                int d = C4813i.m19381d(context);
                C4795l f = C4781c.m19229f();
                StringBuilder sb = new StringBuilder();
                sb.append("App icon resource ID is ");
                sb.append(d);
                f.mo13796e(str2, sb.toString());
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), d, options);
                return new C4918n(str, d, options.outWidth, options.outHeight);
            } catch (Exception e) {
                C4781c.m19229f().mo13793c(str2, "Failed to load icon", e);
            }
        }
        return null;
    }
}
