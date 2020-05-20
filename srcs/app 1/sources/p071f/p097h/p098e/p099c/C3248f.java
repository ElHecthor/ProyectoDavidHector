package p071f.p097h.p098e.p099c;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import p071f.p097h.p107l.C3321h;

/* renamed from: f.h.e.c.f */
public final class C3248f {

    /* renamed from: f.h.e.c.f$a */
    public static abstract class C3249a {

        /* renamed from: f.h.e.c.f$a$a */
        class C3250a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Typeface f9341f;

            C3250a(Typeface typeface) {
                this.f9341f = typeface;
            }

            public void run() {
                C3249a.this.mo1817a(this.f9341f);
            }
        }

        /* renamed from: f.h.e.c.f$a$b */
        class C3251b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f9343f;

            C3251b(int i) {
                this.f9343f = i;
            }

            public void run() {
                C3249a.this.mo1816a(this.f9343f);
            }
        }

        /* renamed from: a */
        public abstract void mo1816a(int i);

        /* renamed from: a */
        public final void mo10600a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C3251b(i));
        }

        /* renamed from: a */
        public abstract void mo1817a(Typeface typeface);

        /* renamed from: a */
        public final void mo10601a(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C3250a(typeface));
        }
    }

    /* renamed from: a */
    public static Typeface m13318a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m13320a(context, i, new TypedValue(), 0, null, null, false);
    }

    /* renamed from: a */
    public static Typeface m13319a(Context context, int i, TypedValue typedValue, int i2, C3249a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m13320a(context, i, typedValue, i2, aVar, null, true);
    }

    /* renamed from: a */
    private static Typeface m13320a(Context context, int i, TypedValue typedValue, int i2, C3249a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = m13321a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (a != null || aVar != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Font resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new NotFoundException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m13321a(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, p071f.p097h.p098e.p099c.C3248f.C3249a r20, android.os.Handler r21, boolean r22) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x009a
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = 0
            r14 = -3
            if (r1 != 0) goto L_0x0026
            if (r9 == 0) goto L_0x0025
            r9.mo10600a(r14, r10)
        L_0x0025:
            return r13
        L_0x0026:
            android.graphics.Typeface r1 = p071f.p097h.p100f.C3262g.m13370b(r0, r4, r5)
            if (r1 == 0) goto L_0x0032
            if (r9 == 0) goto L_0x0031
            r9.mo10601a(r1, r10)
        L_0x0031:
            return r1
        L_0x0032:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            if (r1 == 0) goto L_0x0065
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            f.h.e.c.c$a r2 = p071f.p097h.p098e.p099c.C3240c.m13294a(r1, r0)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            if (r2 != 0) goto L_0x0053
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0052
            r9.mo10600a(r14, r10)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
        L_0x0052:
            return r13
        L_0x0053:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p071f.p097h.p100f.C3262g.m13367a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            return r0
        L_0x0065:
            r1 = r15
            android.graphics.Typeface r0 = p071f.p097h.p100f.C3262g.m13364a(r15, r0, r4, r12, r5)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0072
            r9.mo10601a(r0, r10)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            goto L_0x0075
        L_0x0072:
            r9.mo10600a(r14, r10)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
        L_0x0075:
            return r0
        L_0x0076:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L_0x0087
        L_0x007f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L_0x0087:
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            if (r9 == 0) goto L_0x0099
            r9.mo10600a(r14, r10)
        L_0x0099:
            return r13
        L_0x009a:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p097h.p098e.p099c.C3248f.m13321a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, f.h.e.c.f$a, android.os.Handler, boolean):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static Drawable m13322a(Resources resources, int i, Theme theme) {
        return VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    /* renamed from: a */
    public static void m13323a(Context context, int i, C3249a aVar, Handler handler) {
        C3321h.m13543a(aVar);
        if (context.isRestricted()) {
            aVar.mo10600a(-4, handler);
            return;
        }
        m13320a(context, i, new TypedValue(), 0, aVar, handler, false);
    }
}
