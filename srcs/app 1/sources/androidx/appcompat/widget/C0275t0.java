package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p097h.p098e.p099c.C3248f;
import p071f.p097h.p098e.p099c.C3248f.C3249a;

/* renamed from: androidx.appcompat.widget.t0 */
public class C0275t0 {

    /* renamed from: a */
    private final Context f1190a;

    /* renamed from: b */
    private final TypedArray f1191b;

    /* renamed from: c */
    private TypedValue f1192c;

    private C0275t0(Context context, TypedArray typedArray) {
        this.f1190a = context;
        this.f1191b = typedArray;
    }

    /* renamed from: a */
    public static C0275t0 m1309a(Context context, int i, int[] iArr) {
        return new C0275t0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C0275t0 m1310a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0275t0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0275t0 m1311a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0275t0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public float mo1733a(int i, float f) {
        return this.f1191b.getDimension(i, f);
    }

    /* renamed from: a */
    public int mo1734a(int i, int i2) {
        return this.f1191b.getColor(i, i2);
    }

    /* renamed from: a */
    public ColorStateList mo1735a(int i) {
        if (this.f1191b.hasValue(i)) {
            int resourceId = this.f1191b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList b = C3103a.m12556b(this.f1190a, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return this.f1191b.getColorStateList(i);
    }

    /* renamed from: a */
    public Typeface mo1736a(int i, int i2, C3249a aVar) {
        int resourceId = this.f1191b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1192c == null) {
            this.f1192c = new TypedValue();
        }
        return C3248f.m13319a(this.f1190a, resourceId, this.f1192c, i2, aVar);
    }

    /* renamed from: a */
    public void mo1737a() {
        this.f1191b.recycle();
    }

    /* renamed from: a */
    public boolean mo1738a(int i, boolean z) {
        return this.f1191b.getBoolean(i, z);
    }

    /* renamed from: b */
    public float mo1739b(int i, float f) {
        return this.f1191b.getFloat(i, f);
    }

    /* renamed from: b */
    public int mo1740b(int i, int i2) {
        return this.f1191b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: b */
    public Drawable mo1741b(int i) {
        if (this.f1191b.hasValue(i)) {
            int resourceId = this.f1191b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C3103a.m12557c(this.f1190a, resourceId);
            }
        }
        return this.f1191b.getDrawable(i);
    }

    /* renamed from: c */
    public int mo1742c(int i, int i2) {
        return this.f1191b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: c */
    public Drawable mo1743c(int i) {
        if (this.f1191b.hasValue(i)) {
            int resourceId = this.f1191b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0236j.m1169b().mo1475a(this.f1190a, resourceId, true);
            }
        }
        return null;
    }

    /* renamed from: d */
    public int mo1744d(int i, int i2) {
        return this.f1191b.getInt(i, i2);
    }

    /* renamed from: d */
    public String mo1745d(int i) {
        return this.f1191b.getString(i);
    }

    /* renamed from: e */
    public int mo1746e(int i, int i2) {
        return this.f1191b.getInteger(i, i2);
    }

    /* renamed from: e */
    public CharSequence mo1747e(int i) {
        return this.f1191b.getText(i);
    }

    /* renamed from: f */
    public int mo1748f(int i, int i2) {
        return this.f1191b.getLayoutDimension(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] mo1749f(int i) {
        return this.f1191b.getTextArray(i);
    }

    /* renamed from: g */
    public int mo1750g(int i, int i2) {
        return this.f1191b.getResourceId(i, i2);
    }

    /* renamed from: g */
    public boolean mo1751g(int i) {
        return this.f1191b.hasValue(i);
    }
}
