package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p071f.p072a.C3102j;

/* renamed from: androidx.appcompat.widget.w */
class C0284w {

    /* renamed from: k */
    private static final RectF f1235k = new RectF();

    /* renamed from: l */
    private static ConcurrentHashMap<String, Method> f1236l = new ConcurrentHashMap<>();

    /* renamed from: m */
    private static ConcurrentHashMap<String, Field> f1237m = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1238a = 0;

    /* renamed from: b */
    private boolean f1239b = false;

    /* renamed from: c */
    private float f1240c = -1.0f;

    /* renamed from: d */
    private float f1241d = -1.0f;

    /* renamed from: e */
    private float f1242e = -1.0f;

    /* renamed from: f */
    private int[] f1243f = new int[0];

    /* renamed from: g */
    private boolean f1244g = false;

    /* renamed from: h */
    private TextPaint f1245h;

    /* renamed from: i */
    private final TextView f1246i;

    /* renamed from: j */
    private final Context f1247j;

    C0284w(TextView textView) {
        this.f1246i = textView;
        this.f1247j = textView.getContext();
    }

    /* renamed from: a */
    private int m1405a(RectF rectF) {
        int length = this.f1243f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m1412a(this.f1243f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1243f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: a */
    private StaticLayout m1406a(CharSequence charSequence, Alignment alignment, int i) {
        float floatValue = ((Float) m1407a((Object) this.f1246i, "mSpacingMult", (T) Float.valueOf(1.0f))).floatValue();
        float floatValue2 = ((Float) m1407a((Object) this.f1246i, "mSpacingAdd", (T) Float.valueOf(0.0f))).floatValue();
        boolean booleanValue = ((Boolean) m1407a((Object) this.f1246i, "mIncludePad", (T) Boolean.valueOf(true))).booleanValue();
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f1245h, i, alignment, floatValue, floatValue2, booleanValue);
        return staticLayout;
    }

    /* renamed from: a */
    private static <T> T m1407a(Object obj, String str, T t) {
        try {
            Field a = m1408a(str);
            return a == null ? t : a.get(obj);
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return t;
        }
    }

    /* renamed from: a */
    private static Field m1408a(String str) {
        try {
            Field field = (Field) f1237m.get(str);
            if (field == null) {
                field = TextView.class.getDeclaredField(str);
                if (field != null) {
                    field.setAccessible(true);
                    f1237m.put(str, field);
                }
            }
            return field;
        } catch (NoSuchFieldException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    private void m1409a(float f) {
        if (f != this.f1246i.getPaint().getTextSize()) {
            this.f1246i.getPaint().setTextSize(f);
            boolean isInLayout = VERSION.SDK_INT >= 18 ? this.f1246i.isInLayout() : false;
            if (this.f1246i.getLayout() != null) {
                this.f1239b = false;
                try {
                    Method b = m1417b("nullLayouts");
                    if (b != null) {
                        b.invoke(this.f1246i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f1246i.requestLayout();
                } else {
                    this.f1246i.forceLayout();
                }
                this.f1246i.invalidate();
            }
        }
    }

    /* renamed from: a */
    private void m1410a(float f, float f2, float f3) {
        String str = "px) is less or equal to (0px)";
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum auto-size text size (");
            sb.append(f);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > 0.0f) {
            this.f1238a = 1;
            this.f1241d = f;
            this.f1242e = f2;
            this.f1240c = f3;
            this.f1244g = false;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append(str);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: a */
    private void m1411a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1243f = m1413a(iArr);
            m1420j();
        }
    }

    /* renamed from: a */
    private boolean m1412a(int i, RectF rectF) {
        CharSequence text = this.f1246i.getText();
        TransformationMethod transformationMethod = this.f1246i.getTransformationMethod();
        if (transformationMethod != null) {
            CharSequence transformation = transformationMethod.getTransformation(text, this.f1246i);
            if (transformation != null) {
                text = transformation;
            }
        }
        int maxLines = VERSION.SDK_INT >= 16 ? this.f1246i.getMaxLines() : -1;
        mo1821a(i);
        StaticLayout a = mo1819a(text, (Alignment) m1416b((Object) this.f1246i, "getLayoutAlignment", (T) Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) && ((float) a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    private int[] m1413a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: b */
    private StaticLayout m1414b(CharSequence charSequence, Alignment alignment, int i) {
        CharSequence charSequence2 = charSequence;
        StaticLayout staticLayout = new StaticLayout(charSequence2, this.f1245h, i, alignment, this.f1246i.getLineSpacingMultiplier(), this.f1246i.getLineSpacingExtra(), this.f1246i.getIncludeFontPadding());
        return staticLayout;
    }

    /* renamed from: b */
    private StaticLayout m1415b(CharSequence charSequence, Alignment alignment, int i, int i2) {
        Builder obtain = Builder.obtain(charSequence, 0, charSequence.length(), this.f1245h, i);
        Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1246i.getLineSpacingExtra(), this.f1246i.getLineSpacingMultiplier()).setIncludePad(this.f1246i.getIncludeFontPadding()).setBreakStrategy(this.f1246i.getBreakStrategy()).setHyphenationFrequency(this.f1246i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            obtain.setTextDirection(VERSION.SDK_INT >= 29 ? this.f1246i.getTextDirectionHeuristic() : (TextDirectionHeuristic) m1416b((Object) this.f1246i, "getTextDirectionHeuristic", (T) TextDirectionHeuristics.FIRSTSTRONG_LTR));
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: b */
    private static <T> T m1416b(Object obj, String str, T t) {
        try {
            return m1417b(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            String str2 = "ACTVAutoSizeHelper";
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w(str2, sb.toString(), e);
            return t;
        }
    }

    /* renamed from: b */
    private static Method m1417b(String str) {
        try {
            Method method = (Method) f1236l.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    f1236l.put(str, method);
                }
            }
            return method;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: h */
    private void m1418h() {
        this.f1238a = 0;
        this.f1241d = -1.0f;
        this.f1242e = -1.0f;
        this.f1240c = -1.0f;
        this.f1243f = new int[0];
        this.f1239b = false;
    }

    /* renamed from: i */
    private boolean m1419i() {
        if (!m1421k() || this.f1238a != 1) {
            this.f1239b = false;
        } else {
            if (!this.f1244g || this.f1243f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1242e - this.f1241d) / this.f1240c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1241d + (((float) i) * this.f1240c));
                }
                this.f1243f = m1413a(iArr);
            }
            this.f1239b = true;
        }
        return this.f1239b;
    }

    /* renamed from: j */
    private boolean m1420j() {
        int length = this.f1243f.length;
        boolean z = length > 0;
        this.f1244g = z;
        if (z) {
            this.f1238a = 1;
            int[] iArr = this.f1243f;
            this.f1241d = (float) iArr[0];
            this.f1242e = (float) iArr[length - 1];
            this.f1240c = -1.0f;
        }
        return this.f1244g;
    }

    /* renamed from: k */
    private boolean m1421k() {
        return !(this.f1246i instanceof C0239k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public StaticLayout mo1819a(CharSequence charSequence, Alignment alignment, int i, int i2) {
        int i3 = VERSION.SDK_INT;
        return i3 >= 23 ? m1415b(charSequence, alignment, i, i2) : i3 >= 16 ? m1414b(charSequence, alignment, i) : m1406a(charSequence, alignment, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1820a() {
        if (mo1832g()) {
            if (this.f1239b) {
                if (this.f1246i.getMeasuredHeight() > 0 && this.f1246i.getMeasuredWidth() > 0) {
                    int measuredWidth = VERSION.SDK_INT >= 29 ? this.f1246i.isHorizontallyScrollable() : ((Boolean) m1416b((Object) this.f1246i, "getHorizontallyScrolling", (T) Boolean.valueOf(false))).booleanValue() ? 1048576 : (this.f1246i.getMeasuredWidth() - this.f1246i.getTotalPaddingLeft()) - this.f1246i.getTotalPaddingRight();
                    int height = (this.f1246i.getHeight() - this.f1246i.getCompoundPaddingBottom()) - this.f1246i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (f1235k) {
                            f1235k.setEmpty();
                            f1235k.right = (float) measuredWidth;
                            f1235k.bottom = (float) height;
                            float a = (float) m1405a(f1235k);
                            if (a != this.f1246i.getTextSize()) {
                                mo1822a(0, a);
                            }
                        }
                    }
                }
                return;
            }
            this.f1239b = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1821a(int i) {
        TextPaint textPaint = this.f1245h;
        if (textPaint == null) {
            this.f1245h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1245h.set(this.f1246i.getPaint());
        this.f1245h.setTextSize((float) i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1822a(int i, float f) {
        Context context = this.f1247j;
        m1409a(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1823a(int i, int i2, int i3, int i4) {
        if (m1421k()) {
            DisplayMetrics displayMetrics = this.f1247j.getResources().getDisplayMetrics();
            m1410a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m1419i()) {
                mo1820a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1824a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1247j.obtainStyledAttributes(attributeSet, C3102j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C3102j.AppCompatTextView_autoSizeTextType)) {
            this.f1238a = obtainStyledAttributes.getInt(C3102j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C3102j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C3102j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C3102j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C3102j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C3102j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C3102j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C3102j.AppCompatTextView_autoSizePresetSizes)) {
            int resourceId = obtainStyledAttributes.getResourceId(C3102j.AppCompatTextView_autoSizePresetSizes, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                m1411a(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!m1421k()) {
            this.f1238a = 0;
        } else if (this.f1238a == 1) {
            if (!this.f1244g) {
                DisplayMetrics displayMetrics = this.f1247j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1410a(dimension2, dimension3, dimension);
            }
            m1419i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1825a(int[] iArr, int i) {
        if (m1421k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1247j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f1243f = m1413a(iArr2);
                if (!m1420j()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.f1244g = false;
            }
            if (m1419i()) {
                mo1820a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo1826b() {
        return Math.round(this.f1242e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1827b(int i) {
        if (!m1421k()) {
            return;
        }
        if (i == 0) {
            m1418h();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f1247j.getResources().getDisplayMetrics();
            m1410a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1419i()) {
                mo1820a();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown auto-size text type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo1828c() {
        return Math.round(this.f1241d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo1829d() {
        return Math.round(this.f1240c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int[] mo1830e() {
        return this.f1243f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo1831f() {
        return this.f1238a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo1832g() {
        return m1421k() && this.f1238a != 0;
    }
}
