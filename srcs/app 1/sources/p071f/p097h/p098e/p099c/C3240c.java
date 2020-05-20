package p071f.p097h.p098e.p099c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p071f.p097h.C3235d;
import p071f.p097h.p105j.C3282a;

/* renamed from: f.h.e.c.c */
public class C3240c {

    /* renamed from: f.h.e.c.c$a */
    public interface C3241a {
    }

    /* renamed from: f.h.e.c.c$b */
    public static final class C3242b implements C3241a {

        /* renamed from: a */
        private final C3243c[] f9329a;

        public C3242b(C3243c[] cVarArr) {
            this.f9329a = cVarArr;
        }

        /* renamed from: a */
        public C3243c[] mo10590a() {
            return this.f9329a;
        }
    }

    /* renamed from: f.h.e.c.c$c */
    public static final class C3243c {

        /* renamed from: a */
        private final String f9330a;

        /* renamed from: b */
        private int f9331b;

        /* renamed from: c */
        private boolean f9332c;

        /* renamed from: d */
        private String f9333d;

        /* renamed from: e */
        private int f9334e;

        /* renamed from: f */
        private int f9335f;

        public C3243c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f9330a = str;
            this.f9331b = i;
            this.f9332c = z;
            this.f9333d = str2;
            this.f9334e = i2;
            this.f9335f = i3;
        }

        /* renamed from: a */
        public String mo10591a() {
            return this.f9330a;
        }

        /* renamed from: b */
        public int mo10592b() {
            return this.f9335f;
        }

        /* renamed from: c */
        public int mo10593c() {
            return this.f9334e;
        }

        /* renamed from: d */
        public String mo10594d() {
            return this.f9333d;
        }

        /* renamed from: e */
        public int mo10595e() {
            return this.f9331b;
        }

        /* renamed from: f */
        public boolean mo10596f() {
            return this.f9332c;
        }
    }

    /* renamed from: f.h.e.c.c$d */
    public static final class C3244d implements C3241a {

        /* renamed from: a */
        private final C3282a f9336a;

        /* renamed from: b */
        private final int f9337b;

        /* renamed from: c */
        private final int f9338c;

        public C3244d(C3282a aVar, int i, int i2) {
            this.f9336a = aVar;
            this.f9338c = i;
            this.f9337b = i2;
        }

        /* renamed from: a */
        public int mo10597a() {
            return this.f9338c;
        }

        /* renamed from: b */
        public C3282a mo10598b() {
            return this.f9336a;
        }

        /* renamed from: c */
        public int mo10599c() {
            return this.f9337b;
        }
    }

    /* renamed from: a */
    private static int m13293a(TypedArray typedArray, int i) {
        if (VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: a */
    public static C3241a m13294a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m13298b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    public static List<List<byte[]>> m13295a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m13293a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m13296a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m13296a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    private static List<byte[]> m13296a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m13297a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: b */
    private static C3241a m13298b(XmlPullParser xmlPullParser, Resources resources) {
        String str = "font-family";
        xmlPullParser.require(2, null, str);
        if (xmlPullParser.getName().equals(str)) {
            return m13299c(xmlPullParser, resources);
        }
        m13297a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static C3241a m13299c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C3235d.FontFamily);
        String string = obtainAttributes.getString(C3235d.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C3235d.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C3235d.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C3235d.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C3235d.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C3235d.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m13300d(xmlPullParser, resources));
                    } else {
                        m13297a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C3242b((C3243c[]) arrayList.toArray(new C3243c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m13297a(xmlPullParser);
        }
        return new C3244d(new C3282a(string, string2, string3, m13295a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: d */
    private static C3243c m13300d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C3235d.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C3235d.FontFamilyFont_fontWeight) ? C3235d.FontFamilyFont_fontWeight : C3235d.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C3235d.FontFamilyFont_fontStyle) ? C3235d.FontFamilyFont_fontStyle : C3235d.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(C3235d.FontFamilyFont_ttcIndex) ? C3235d.FontFamilyFont_ttcIndex : C3235d.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C3235d.FontFamilyFont_fontVariationSettings) ? C3235d.FontFamilyFont_fontVariationSettings : C3235d.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C3235d.FontFamilyFont_font) ? C3235d.FontFamilyFont_font : C3235d.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m13297a(xmlPullParser);
        }
        C3243c cVar = new C3243c(string2, i, z, string, i3, resourceId);
        return cVar;
    }
}
