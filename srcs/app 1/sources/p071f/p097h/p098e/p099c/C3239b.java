package p071f.p097h.p098e.p099c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: f.h.e.c.b */
public final class C3239b {

    /* renamed from: a */
    private final Shader f9326a;

    /* renamed from: b */
    private final ColorStateList f9327b;

    /* renamed from: c */
    private int f9328c;

    private C3239b(Shader shader, ColorStateList colorStateList, int i) {
        this.f9326a = shader;
        this.f9327b = colorStateList;
        this.f9328c = i;
    }

    /* renamed from: a */
    static C3239b m13281a(ColorStateList colorStateList) {
        return new C3239b(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: a */
    private static C3239b m13282a(Resources resources, int i, Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c == 0) {
                return m13281a(C3238a.m13278a(resources, (XmlPullParser) xml, asAttributeSet, theme));
            }
            if (c == 1) {
                return m13283a(C3245d.m13312a(resources, xml, asAttributeSet, theme));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(xml.getPositionDescription());
            sb.append(": unsupported complex color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    static C3239b m13283a(Shader shader) {
        return new C3239b(shader, null, 0);
    }

    /* renamed from: b */
    static C3239b m13284b(int i) {
        return new C3239b(null, null, i);
    }

    /* renamed from: b */
    public static C3239b m13285b(Resources resources, int i, Theme theme) {
        try {
            return m13282a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: a */
    public int mo10583a() {
        return this.f9328c;
    }

    /* renamed from: a */
    public void mo10584a(int i) {
        this.f9328c = i;
    }

    /* renamed from: a */
    public boolean mo10585a(int[] iArr) {
        if (mo10588d()) {
            ColorStateList colorStateList = this.f9327b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f9328c) {
                this.f9328c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public Shader mo10586b() {
        return this.f9326a;
    }

    /* renamed from: c */
    public boolean mo10587c() {
        return this.f9326a != null;
    }

    /* renamed from: d */
    public boolean mo10588d() {
        if (this.f9326a == null) {
            ColorStateList colorStateList = this.f9327b;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo10589e() {
        return mo10587c() || this.f9328c != 0;
    }
}
