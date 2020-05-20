package p071f.p097h.p100f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import p071f.p088e.C3168e;
import p071f.p097h.p098e.p099c.C3240c.C3241a;
import p071f.p097h.p098e.p099c.C3240c.C3242b;
import p071f.p097h.p098e.p099c.C3240c.C3244d;
import p071f.p097h.p098e.p099c.C3248f.C3249a;
import p071f.p097h.p105j.C3283b;
import p071f.p097h.p105j.C3283b.C3289f;

@SuppressLint({"NewApi"})
/* renamed from: f.h.f.g */
public class C3262g {

    /* renamed from: a */
    private static final C3268m f9381a;

    /* renamed from: b */
    private static final C3168e<String, Typeface> f9382b = new C3168e<>(16);

    static {
        int i = VERSION.SDK_INT;
        C3268m mVar = i >= 29 ? new C3267l() : i >= 28 ? new C3266k() : i >= 26 ? new C3265j() : (i < 24 || !C3264i.m13379a()) ? VERSION.SDK_INT >= 21 ? new C3263h() : new C3268m() : new C3264i();
        f9381a = mVar;
    }

    /* renamed from: a */
    public static Typeface m13364a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f9381a.mo10607a(context, resources, i, str, i2);
        if (a != null) {
            f9382b.mo10199a(m13368a(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m13365a(Context context, Typeface typeface, int i) {
        if (context != null) {
            if (VERSION.SDK_INT < 21) {
                Typeface b = m13369b(context, typeface, i);
                if (b != null) {
                    return b;
                }
            }
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: a */
    public static Typeface m13366a(Context context, CancellationSignal cancellationSignal, C3289f[] fVarArr, int i) {
        return f9381a.mo10605a(context, cancellationSignal, fVarArr, i);
    }

    /* renamed from: a */
    public static Typeface m13367a(Context context, C3241a aVar, Resources resources, int i, int i2, C3249a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof C3244d) {
            C3244d dVar = (C3244d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.mo10597a() == 0) {
                z2 = true;
            }
            typeface = C3283b.m13454a(context, dVar.mo10598b(), aVar2, handler, z2, z ? dVar.mo10599c() : -1, i2);
        } else {
            typeface = f9381a.mo10606a(context, (C3242b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.mo10601a(typeface, handler);
                } else {
                    aVar2.mo10600a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f9382b.mo10199a(m13368a(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: a */
    private static String m13368a(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        String str = "-";
        sb.append(str);
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: b */
    private static Typeface m13369b(Context context, Typeface typeface, int i) {
        C3242b a = f9381a.mo10618a(typeface);
        if (a == null) {
            return null;
        }
        return f9381a.mo10606a(context, a, context.getResources(), i);
    }

    /* renamed from: b */
    public static Typeface m13370b(Resources resources, int i, int i2) {
        return (Typeface) f9382b.mo10203b(m13368a(resources, i, i2));
    }
}
