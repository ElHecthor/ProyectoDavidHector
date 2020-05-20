package p071f.p097h.p098e.p099c;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p071f.p097h.C3235d;

/* renamed from: f.h.e.c.d */
final class C3245d {

    /* renamed from: f.h.e.c.d$a */
    static final class C3246a {

        /* renamed from: a */
        final int[] f9339a;

        /* renamed from: b */
        final float[] f9340b;

        C3246a(int i, int i2) {
            this.f9339a = new int[]{i, i2};
            this.f9340b = new float[]{0.0f, 1.0f};
        }

        C3246a(int i, int i2, int i3) {
            this.f9339a = new int[]{i, i2, i3};
            this.f9340b = new float[]{0.0f, 0.5f, 1.0f};
        }

        C3246a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f9339a = new int[size];
            this.f9340b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f9339a[i] = ((Integer) list.get(i)).intValue();
                this.f9340b[i] = ((Float) list2.get(i)).floatValue();
            }
        }
    }

    /* renamed from: a */
    private static TileMode m13311a(int i) {
        return i != 1 ? i != 2 ? TileMode.CLAMP : TileMode.MIRROR : TileMode.REPEAT;
    }

    /* renamed from: a */
    static Shader m13312a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Theme theme2 = theme;
            TypedArray a = C3252g.m13332a(resources, theme2, attributeSet, C3235d.GradientColor);
            float a2 = C3252g.m13328a(a, xmlPullParser2, "startX", C3235d.GradientColor_android_startX, 0.0f);
            float a3 = C3252g.m13328a(a, xmlPullParser2, "startY", C3235d.GradientColor_android_startY, 0.0f);
            float a4 = C3252g.m13328a(a, xmlPullParser2, "endX", C3235d.GradientColor_android_endX, 0.0f);
            float a5 = C3252g.m13328a(a, xmlPullParser2, "endY", C3235d.GradientColor_android_endY, 0.0f);
            float a6 = C3252g.m13328a(a, xmlPullParser2, "centerX", C3235d.GradientColor_android_centerX, 0.0f);
            float a7 = C3252g.m13328a(a, xmlPullParser2, "centerY", C3235d.GradientColor_android_centerY, 0.0f);
            int b = C3252g.m13337b(a, xmlPullParser2, "type", C3235d.GradientColor_android_type, 0);
            int a8 = C3252g.m13329a(a, xmlPullParser2, "startColor", C3235d.GradientColor_android_startColor, 0);
            String str = "centerColor";
            boolean a9 = C3252g.m13336a(xmlPullParser2, str);
            int a10 = C3252g.m13329a(a, xmlPullParser2, str, C3235d.GradientColor_android_centerColor, 0);
            int a11 = C3252g.m13329a(a, xmlPullParser2, "endColor", C3235d.GradientColor_android_endColor, 0);
            int b2 = C3252g.m13337b(a, xmlPullParser2, "tileMode", C3235d.GradientColor_android_tileMode, 0);
            float f = a6;
            float a12 = C3252g.m13328a(a, xmlPullParser2, "gradientRadius", C3235d.GradientColor_android_gradientRadius, 0.0f);
            a.recycle();
            C3246a a13 = m13313a(m13314b(resources, xmlPullParser, attributeSet, theme), a8, a11, a9, a10);
            if (b == 1) {
                float f2 = f;
                if (a12 > 0.0f) {
                    int[] iArr = a13.f9339a;
                    RadialGradient radialGradient = new RadialGradient(f2, a7, a12, iArr, a13.f9340b, m13311a(b2));
                    return radialGradient;
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (b != 2) {
                LinearGradient linearGradient = new LinearGradient(a2, a3, a4, a5, a13.f9339a, a13.f9340b, m13311a(b2));
                return linearGradient;
            } else {
                return new SweepGradient(f, a7, a13.f9339a, a13.f9340b);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid gradient color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
    }

    /* renamed from: a */
    private static C3246a m13313a(C3246a aVar, int i, int i2, boolean z, int i3) {
        C3246a aVar2;
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            aVar2 = new C3246a(i, i3, i2);
            return aVar2;
        }
        aVar2 = new C3246a(i, i2);
        return aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p071f.p097h.p098e.p099c.C3245d.C3246a m13314b(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x0085
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0085
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = p071f.p097h.C3235d.GradientColorItem
            android.content.res.TypedArray r3 = p071f.p097h.p098e.p099c.C3252g.m13332a(r8, r11, r10, r3)
            int r5 = p071f.p097h.C3235d.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = p071f.p097h.C3235d.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            int r5 = p071f.p097h.C3235d.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = p071f.p097h.C3235d.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x0085:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0091
            f.h.e.c.d$a r8 = new f.h.e.c.d$a
            r8.<init>(r4, r2)
            return r8
        L_0x0091:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p097h.p098e.p099c.C3245d.m13314b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):f.h.e.c.d$a");
    }
}
