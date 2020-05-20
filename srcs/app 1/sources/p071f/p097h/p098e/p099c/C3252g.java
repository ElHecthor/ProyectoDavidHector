package p071f.p097h.p098e.p099c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: f.h.e.c.g */
public class C3252g {
    /* renamed from: a */
    public static float m13328a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m13336a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m13329a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m13336a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: a */
    public static ColorStateList m13330a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme, String str, int i) {
        if (!m13336a(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 != 2) {
            return (i2 < 28 || i2 > 31) ? C3238a.m13276a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : m13331a(typedValue);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to resolve attribute at index ");
        sb.append(i);
        sb.append(": ");
        sb.append(typedValue);
        throw new UnsupportedOperationException(sb.toString());
    }

    /* renamed from: a */
    private static ColorStateList m13331a(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: a */
    public static TypedArray m13332a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static C3239b m13333a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme, String str, int i, int i2) {
        if (m13336a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C3239b.m13284b(typedValue.data);
            }
            C3239b b = C3239b.m13285b(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (b != null) {
                return b;
            }
        }
        return C3239b.m13284b(i2);
    }

    /* renamed from: a */
    public static String m13334a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m13336a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: a */
    public static boolean m13335a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m13336a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static boolean m13336a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: b */
    public static int m13337b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m13336a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: b */
    public static TypedValue m13338b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m13336a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    /* renamed from: c */
    public static int m13339c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m13336a(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }
}
