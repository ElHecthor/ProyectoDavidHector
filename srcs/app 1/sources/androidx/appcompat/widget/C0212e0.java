package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p071f.p072a.C3102j;

/* renamed from: androidx.appcompat.widget.e0 */
public class C0212e0 extends ViewGroup {

    /* renamed from: f */
    private boolean f937f;

    /* renamed from: g */
    private int f938g;

    /* renamed from: h */
    private int f939h;

    /* renamed from: i */
    private int f940i;

    /* renamed from: j */
    private int f941j;

    /* renamed from: k */
    private int f942k;

    /* renamed from: l */
    private float f943l;

    /* renamed from: m */
    private boolean f944m;

    /* renamed from: n */
    private int[] f945n;

    /* renamed from: o */
    private int[] f946o;

    /* renamed from: p */
    private Drawable f947p;

    /* renamed from: q */
    private int f948q;

    /* renamed from: r */
    private int f949r;

    /* renamed from: s */
    private int f950s;

    /* renamed from: t */
    private int f951t;

    /* renamed from: androidx.appcompat.widget.e0$a */
    public static class C0213a extends MarginLayoutParams {

        /* renamed from: a */
        public float f952a;

        /* renamed from: b */
        public int f953b;

        public C0213a(int i, int i2) {
            super(i, i2);
            this.f953b = -1;
            this.f952a = 0.0f;
        }

        public C0213a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f953b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3102j.LinearLayoutCompat_Layout);
            this.f952a = obtainStyledAttributes.getFloat(C3102j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f953b = obtainStyledAttributes.getInt(C3102j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public C0213a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f953b = -1;
        }
    }

    public C0212e0(Context context) {
        this(context, null);
    }

    public C0212e0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0212e0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f937f = true;
        this.f938g = -1;
        this.f939h = 0;
        this.f941j = 8388659;
        C0275t0 a = C0275t0.m1311a(context, attributeSet, C3102j.LinearLayoutCompat, i, 0);
        int d = a.mo1744d(C3102j.LinearLayoutCompat_android_orientation, -1);
        if (d >= 0) {
            setOrientation(d);
        }
        int d2 = a.mo1744d(C3102j.LinearLayoutCompat_android_gravity, -1);
        if (d2 >= 0) {
            setGravity(d2);
        }
        boolean a2 = a.mo1738a(C3102j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a2) {
            setBaselineAligned(a2);
        }
        this.f943l = a.mo1739b(C3102j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f938g = a.mo1744d(C3102j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f944m = a.mo1738a(C3102j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.mo1741b(C3102j.LinearLayoutCompat_divider));
        this.f950s = a.mo1744d(C3102j.LinearLayoutCompat_showDividers, 0);
        this.f951t = a.mo1742c(C3102j.LinearLayoutCompat_dividerPadding, 0);
        a.mo1737a();
    }

    /* renamed from: a */
    private void m1058a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: c */
    private void m1059c(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View a = mo1332a(i3);
            if (a.getVisibility() != 8) {
                C0213a aVar = (C0213a) a.getLayoutParams();
                if (aVar.height == -1) {
                    int i4 = aVar.width;
                    aVar.width = a.getMeasuredWidth();
                    measureChildWithMargins(a, i2, 0, makeMeasureSpec, 0);
                    aVar.width = i4;
                }
            }
        }
    }

    /* renamed from: d */
    private void m1060d(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View a = mo1332a(i3);
            if (a.getVisibility() != 8) {
                C0213a aVar = (C0213a) a.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = a.getMeasuredHeight();
                    measureChildWithMargins(a, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1330a(View view) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1331a(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo1332a(int i) {
        return getChildAt(i);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03a3, code lost:
        if (r8 > 0) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ae, code lost:
        if (r8 < 0) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03b0, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b1, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & -16777216);
        r0 = r23;
        r3 = r24;
     */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01d0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1333a(int r38, int r39) {
        /*
            r37 = this;
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = 0
            r7.f942k = r10
            int r11 = r37.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r38)
            int r13 = android.view.View.MeasureSpec.getMode(r39)
            int[] r0 = r7.f945n
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.f946o
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.f945n = r0
            int[] r0 = new int[r14]
            r7.f946o = r0
        L_0x0026:
            int[] r15 = r7.f945n
            int[] r6 = r7.f946o
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f937f
            boolean r3 = r7.f944m
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = 1
            goto L_0x004e
        L_0x004c:
            r19 = 0
        L_0x004e:
            r20 = 0
            r0 = 0
            r1 = 0
            r14 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 1
            r27 = 0
        L_0x0061:
            r28 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x01f9
            android.view.View r6 = r7.mo1332a(r1)
            if (r6 != 0) goto L_0x007f
            int r5 = r7.f942k
            int r6 = r7.mo1344c(r1)
            int r5 = r5 + r6
            r7.f942k = r5
        L_0x0076:
            r2 = r1
            r32 = r3
            r36 = r4
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x01e8
        L_0x007f:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L_0x008b
            int r5 = r7.mo1331a(r6, r1)
            int r1 = r1 + r5
            goto L_0x0076
        L_0x008b:
            boolean r5 = r7.mo1343b(r1)
            if (r5 == 0) goto L_0x0098
            int r5 = r7.f942k
            int r10 = r7.f948q
            int r5 = r5 + r10
            r7.f942k = r5
        L_0x0098:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            androidx.appcompat.widget.e0$a r10 = (androidx.appcompat.widget.C0212e0.C0213a) r10
            float r5 = r10.f952a
            float r31 = r0 + r5
            if (r12 != r2) goto L_0x00e8
            int r0 = r10.width
            if (r0 != 0) goto L_0x00e8
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e8
            int r0 = r7.f942k
            if (r19 == 0) goto L_0x00b8
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            goto L_0x00c2
        L_0x00b8:
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
        L_0x00c2:
            r7.f942k = r0
            if (r4 == 0) goto L_0x00d9
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r30 = -2
            goto L_0x0162
        L_0x00d9:
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r1 = 1073741824(0x40000000, float:2.0)
            r24 = 1
            r30 = -2
            goto L_0x0164
        L_0x00e8:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00f7
            float r0 = r10.f952a
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f7
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x00fa
        L_0x00f7:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00fa:
            int r0 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0103
            int r0 = r7.f942k
            r29 = r0
            goto L_0x0105
        L_0x0103:
            r29 = 0
        L_0x0105:
            r33 = 0
            r0 = r37
            r34 = r1
            r1 = r6
            r35 = r2
            r2 = r34
            r32 = r3
            r3 = r38
            r36 = r4
            r4 = r29
            r9 = -1
            r29 = -2
            r5 = r39
            r29 = r6
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -2
            r6 = r33
            r0.mo1337a(r1, r2, r3, r4, r5, r6)
            r0 = r35
            if (r0 == r9) goto L_0x012e
            r10.width = r0
        L_0x012e:
            int r0 = r29.getMeasuredWidth()
            if (r19 == 0) goto L_0x0145
            int r1 = r7.f942k
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r29
            int r4 = r7.mo1338b(r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            goto L_0x015a
        L_0x0145:
            r3 = r29
            int r1 = r7.f942k
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.mo1338b(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
        L_0x015a:
            r7.f942k = r1
            if (r32 == 0) goto L_0x0162
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0162:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0164:
            if (r13 == r1) goto L_0x016f
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x016f
            r0 = 1
            r27 = 1
            goto L_0x0170
        L_0x016f:
            r0 = 0
        L_0x0170:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r25
            int r25 = android.view.View.combineMeasuredStates(r6, r5)
            if (r36 == 0) goto L_0x01ad
            int r5 = r3.getBaseline()
            r6 = -1
            if (r5 == r6) goto L_0x01ad
            int r6 = r10.f953b
            if (r6 >= 0) goto L_0x0193
            int r6 = r7.f941j
        L_0x0193:
            r6 = r6 & 112(0x70, float:1.57E-43)
            r9 = 4
            int r6 = r6 >> r9
            r6 = r6 & -2
            int r6 = r6 >> 1
            r9 = r15[r6]
            int r9 = java.lang.Math.max(r9, r5)
            r15[r6] = r9
            r9 = r28[r6]
            int r5 = r4 - r5
            int r5 = java.lang.Math.max(r9, r5)
            r28[r6] = r5
        L_0x01ad:
            r5 = r21
            int r21 = java.lang.Math.max(r5, r4)
            if (r26 == 0) goto L_0x01bd
            int r5 = r10.height
            r6 = -1
            if (r5 != r6) goto L_0x01bd
            r26 = 1
            goto L_0x01bf
        L_0x01bd:
            r26 = 0
        L_0x01bf:
            float r5 = r10.f952a
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x01d0
            if (r0 == 0) goto L_0x01c8
            goto L_0x01c9
        L_0x01c8:
            r2 = r4
        L_0x01c9:
            r10 = r23
            int r23 = java.lang.Math.max(r10, r2)
            goto L_0x01de
        L_0x01d0:
            r10 = r23
            if (r0 == 0) goto L_0x01d5
            goto L_0x01d6
        L_0x01d5:
            r2 = r4
        L_0x01d6:
            r4 = r22
            int r22 = java.lang.Math.max(r4, r2)
            r23 = r10
        L_0x01de:
            r10 = r34
            int r0 = r7.mo1331a(r3, r10)
            int r0 = r0 + r10
            r2 = r0
            r0 = r31
        L_0x01e8:
            int r2 = r2 + 1
            r9 = r39
            r1 = r2
            r6 = r28
            r3 = r32
            r4 = r36
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r10 = 0
            goto L_0x0061
        L_0x01f9:
            r32 = r3
            r36 = r4
            r2 = r21
            r4 = r22
            r10 = r23
            r6 = r25
            r1 = 1073741824(0x40000000, float:2.0)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -2
            int r3 = r7.f942k
            if (r3 <= 0) goto L_0x021c
            boolean r3 = r7.mo1343b(r11)
            if (r3 == 0) goto L_0x021c
            int r3 = r7.f942k
            int r1 = r7.f948q
            int r3 = r3 + r1
            r7.f942k = r3
        L_0x021c:
            r1 = r15[r18]
            r3 = -1
            if (r1 != r3) goto L_0x0233
            r1 = 0
            r5 = r15[r1]
            if (r5 != r3) goto L_0x0233
            r1 = r15[r17]
            if (r1 != r3) goto L_0x0233
            r1 = r15[r16]
            if (r1 == r3) goto L_0x022f
            goto L_0x0233
        L_0x022f:
            r1 = r2
            r23 = r6
            goto L_0x0264
        L_0x0233:
            r1 = r15[r16]
            r3 = 0
            r5 = r15[r3]
            r9 = r15[r18]
            r3 = r15[r17]
            int r3 = java.lang.Math.max(r9, r3)
            int r3 = java.lang.Math.max(r5, r3)
            int r1 = java.lang.Math.max(r1, r3)
            r3 = r28[r16]
            r5 = 0
            r9 = r28[r5]
            r5 = r28[r18]
            r23 = r6
            r6 = r28[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r3 = java.lang.Math.max(r3, r5)
            int r1 = r1 + r3
            int r1 = java.lang.Math.max(r2, r1)
        L_0x0264:
            if (r32 == 0) goto L_0x02c5
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r2) goto L_0x026c
            if (r12 != 0) goto L_0x02c5
        L_0x026c:
            r2 = 0
            r7.f942k = r2
            r2 = 0
        L_0x0270:
            if (r2 >= r11) goto L_0x02c5
            android.view.View r3 = r7.mo1332a(r2)
            if (r3 != 0) goto L_0x0282
            int r3 = r7.f942k
            int r5 = r7.mo1344c(r2)
            int r3 = r3 + r5
            r7.f942k = r3
            goto L_0x028f
        L_0x0282:
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0292
            int r3 = r7.mo1331a(r3, r2)
            int r2 = r2 + r3
        L_0x028f:
            r22 = r1
            goto L_0x02c0
        L_0x0292:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.appcompat.widget.e0$a r5 = (androidx.appcompat.widget.C0212e0.C0213a) r5
            int r6 = r7.f942k
            if (r19 == 0) goto L_0x02ab
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r3 = r7.mo1338b(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            r7.f942k = r6
            goto L_0x028f
        L_0x02ab:
            int r9 = r6 + r14
            r22 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.mo1338b(r3)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.f942k = r1
        L_0x02c0:
            int r2 = r2 + 1
            r1 = r22
            goto L_0x0270
        L_0x02c5:
            r22 = r1
            int r1 = r7.f942k
            int r2 = r37.getPaddingLeft()
            int r3 = r37.getPaddingRight()
            int r2 = r2 + r3
            int r1 = r1 + r2
            r7.f942k = r1
            int r2 = r37.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r2)
            r2 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r2)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            int r3 = r7.f942k
            int r2 = r2 - r3
            if (r24 != 0) goto L_0x0336
            if (r2 == 0) goto L_0x02f2
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x02f2
            goto L_0x0336
        L_0x02f2:
            int r0 = java.lang.Math.max(r4, r10)
            if (r32 == 0) goto L_0x032e
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x032e
            r10 = 0
        L_0x02fd:
            if (r10 >= r11) goto L_0x032e
            android.view.View r2 = r7.mo1332a(r10)
            if (r2 == 0) goto L_0x032b
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x030e
            goto L_0x032b
        L_0x030e:
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            androidx.appcompat.widget.e0$a r4 = (androidx.appcompat.widget.C0212e0.C0213a) r4
            float r4 = r4.f952a
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 <= 0) goto L_0x032b
            r4 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r4)
            int r6 = r2.getMeasuredHeight()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            r2.measure(r5, r6)
        L_0x032b:
            int r10 = r10 + 1
            goto L_0x02fd
        L_0x032e:
            r2 = r39
            r25 = r11
            r3 = r22
            goto L_0x04c5
        L_0x0336:
            float r5 = r7.f943l
            int r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x033d
            r0 = r5
        L_0x033d:
            r5 = -1
            r15[r16] = r5
            r15[r17] = r5
            r15[r18] = r5
            r6 = 0
            r15[r6] = r5
            r28[r16] = r5
            r28[r17] = r5
            r28[r18] = r5
            r28[r6] = r5
            r7.f942k = r6
            r6 = r4
            r9 = r23
            r4 = -1
            r10 = 0
        L_0x0356:
            if (r10 >= r11) goto L_0x046c
            android.view.View r14 = r7.mo1332a(r10)
            if (r14 == 0) goto L_0x045d
            int r5 = r14.getVisibility()
            r3 = 8
            if (r5 != r3) goto L_0x0368
            goto L_0x045d
        L_0x0368:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            androidx.appcompat.widget.e0$a r5 = (androidx.appcompat.widget.C0212e0.C0213a) r5
            float r3 = r5.f952a
            int r23 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x03c8
            float r8 = (float) r2
            float r8 = r8 * r3
            float r8 = r8 / r0
            int r8 = (int) r8
            float r0 = r0 - r3
            int r2 = r2 - r8
            int r3 = r37.getPaddingTop()
            int r23 = r37.getPaddingBottom()
            int r3 = r3 + r23
            r23 = r0
            int r0 = r5.topMargin
            int r3 = r3 + r0
            int r0 = r5.bottomMargin
            int r3 = r3 + r0
            int r0 = r5.height
            r24 = r2
            r25 = r11
            r11 = -1
            r2 = r39
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r0)
            int r3 = r5.width
            if (r3 != 0) goto L_0x03a6
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x03a3
            goto L_0x03a8
        L_0x03a3:
            if (r8 <= 0) goto L_0x03b0
            goto L_0x03b1
        L_0x03a6:
            r3 = 1073741824(0x40000000, float:2.0)
        L_0x03a8:
            int r29 = r14.getMeasuredWidth()
            int r8 = r29 + r8
            if (r8 >= 0) goto L_0x03b1
        L_0x03b0:
            r8 = 0
        L_0x03b1:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r3)
            r14.measure(r8, r0)
            int r0 = r14.getMeasuredState()
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r3
            int r9 = android.view.View.combineMeasuredStates(r9, r0)
            r0 = r23
            r3 = r24
            goto L_0x03ce
        L_0x03c8:
            r3 = r2
            r25 = r11
            r11 = -1
            r2 = r39
        L_0x03ce:
            int r8 = r7.f942k
            if (r19 == 0) goto L_0x03eb
            int r23 = r14.getMeasuredWidth()
            int r11 = r5.leftMargin
            int r23 = r23 + r11
            int r11 = r5.rightMargin
            int r23 = r23 + r11
            int r11 = r7.mo1338b(r14)
            int r23 = r23 + r11
            int r8 = r8 + r23
            r7.f942k = r8
            r23 = r0
            goto L_0x0403
        L_0x03eb:
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r23 = r0
            int r0 = r5.leftMargin
            int r11 = r11 + r0
            int r0 = r5.rightMargin
            int r11 = r11 + r0
            int r0 = r7.mo1338b(r14)
            int r11 = r11 + r0
            int r0 = java.lang.Math.max(r8, r11)
            r7.f942k = r0
        L_0x0403:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 == r0) goto L_0x040e
            int r0 = r5.height
            r8 = -1
            if (r0 != r8) goto L_0x040e
            r0 = 1
            goto L_0x040f
        L_0x040e:
            r0 = 0
        L_0x040f:
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r4 = java.lang.Math.max(r4, r11)
            if (r0 == 0) goto L_0x0420
            goto L_0x0421
        L_0x0420:
            r8 = r11
        L_0x0421:
            int r0 = java.lang.Math.max(r6, r8)
            if (r26 == 0) goto L_0x042e
            int r6 = r5.height
            r8 = -1
            if (r6 != r8) goto L_0x042f
            r6 = 1
            goto L_0x0430
        L_0x042e:
            r8 = -1
        L_0x042f:
            r6 = 0
        L_0x0430:
            if (r36 == 0) goto L_0x0457
            int r14 = r14.getBaseline()
            if (r14 == r8) goto L_0x0457
            int r5 = r5.f953b
            if (r5 >= 0) goto L_0x043e
            int r5 = r7.f941j
        L_0x043e:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r8 = 4
            int r5 = r5 >> r8
            r5 = r5 & -2
            int r5 = r5 >> 1
            r8 = r15[r5]
            int r8 = java.lang.Math.max(r8, r14)
            r15[r5] = r8
            r8 = r28[r5]
            int r11 = r11 - r14
            int r8 = java.lang.Math.max(r8, r11)
            r28[r5] = r8
        L_0x0457:
            r26 = r6
            r6 = r0
            r0 = r23
            goto L_0x0462
        L_0x045d:
            r3 = r2
            r25 = r11
            r2 = r39
        L_0x0462:
            int r10 = r10 + 1
            r8 = r38
            r2 = r3
            r11 = r25
            r5 = -1
            goto L_0x0356
        L_0x046c:
            r2 = r39
            r25 = r11
            int r0 = r7.f942k
            int r3 = r37.getPaddingLeft()
            int r5 = r37.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            r7.f942k = r0
            r0 = r15[r18]
            r3 = -1
            if (r0 != r3) goto L_0x0493
            r0 = 0
            r5 = r15[r0]
            if (r5 != r3) goto L_0x0493
            r0 = r15[r17]
            if (r0 != r3) goto L_0x0493
            r0 = r15[r16]
            if (r0 == r3) goto L_0x0491
            goto L_0x0493
        L_0x0491:
            r0 = r4
            goto L_0x04c1
        L_0x0493:
            r0 = r15[r16]
            r3 = 0
            r5 = r15[r3]
            r8 = r15[r18]
            r10 = r15[r17]
            int r8 = java.lang.Math.max(r8, r10)
            int r5 = java.lang.Math.max(r5, r8)
            int r0 = java.lang.Math.max(r0, r5)
            r5 = r28[r16]
            r3 = r28[r3]
            r8 = r28[r18]
            r10 = r28[r17]
            int r8 = java.lang.Math.max(r8, r10)
            int r3 = java.lang.Math.max(r3, r8)
            int r3 = java.lang.Math.max(r5, r3)
            int r0 = r0 + r3
            int r0 = java.lang.Math.max(r4, r0)
        L_0x04c1:
            r3 = r0
            r0 = r6
            r23 = r9
        L_0x04c5:
            if (r26 != 0) goto L_0x04cc
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L_0x04cc
            goto L_0x04cd
        L_0x04cc:
            r0 = r3
        L_0x04cd:
            int r3 = r37.getPaddingTop()
            int r4 = r37.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r3)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r23 & r3
            r1 = r1 | r3
            int r3 = r23 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r2, r3)
            r7.setMeasuredDimension(r1, r0)
            if (r27 == 0) goto L_0x04f6
            r0 = r38
            r1 = r25
            r7.m1059c(r1, r0)
        L_0x04f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0212e0.mo1333a(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1334a(int r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r6 = r24
            boolean r0 = androidx.appcompat.widget.C0293z0.m1487a(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.f941j
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r1
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.f937f
            int[] r13 = r6.f945n
            int[] r14 = r6.f946o
            int r1 = p071f.p097h.p108m.C3379v.m13829p(r24)
            int r1 = p071f.p097h.p108m.C3339d.m13606a(r2, r1)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L_0x004b
            r2 = 5
            if (r1 == r2) goto L_0x003f
            int r1 = r24.getPaddingLeft()
            goto L_0x0056
        L_0x003f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.f942k
            int r1 = r1 - r2
            goto L_0x0056
        L_0x004b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.f942k
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L_0x0056:
            r2 = 0
            if (r0 == 0) goto L_0x0060
            int r0 = r10 + -1
            r16 = r0
            r17 = -1
            goto L_0x0064
        L_0x0060:
            r16 = 0
            r17 = 1
        L_0x0064:
            r3 = 0
        L_0x0065:
            if (r3 >= r10) goto L_0x013f
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.mo1332a(r2)
            if (r0 != 0) goto L_0x0078
            int r0 = r6.mo1344c(r2)
            int r1 = r1 + r0
            goto L_0x0129
        L_0x0078:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x0127
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            androidx.appcompat.widget.e0$a r4 = (androidx.appcompat.widget.C0212e0.C0213a) r4
            r18 = r3
            if (r12 == 0) goto L_0x00a0
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00a2
            int r10 = r0.getBaseline()
            goto L_0x00a3
        L_0x00a0:
            r19 = r10
        L_0x00a2:
            r10 = -1
        L_0x00a3:
            int r3 = r4.f953b
            if (r3 >= 0) goto L_0x00a8
            r3 = r11
        L_0x00a8:
            r3 = r3 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r3 == r11) goto L_0x00e3
            r11 = 48
            if (r3 == r11) goto L_0x00d1
            r11 = 80
            if (r3 == r11) goto L_0x00bb
            r3 = r7
            r11 = -1
            goto L_0x00e0
        L_0x00bb:
            int r3 = r8 - r5
            int r11 = r4.bottomMargin
            int r3 = r3 - r11
            r11 = -1
            if (r10 == r11) goto L_0x00e0
            int r21 = r0.getMeasuredHeight()
            int r21 = r21 - r10
            r10 = 2
            r22 = r14[r10]
            int r22 = r22 - r21
            int r3 = r3 - r22
            goto L_0x00e0
        L_0x00d1:
            r11 = -1
            int r3 = r4.topMargin
            int r3 = r3 + r7
            if (r10 == r11) goto L_0x00e0
            r21 = 1
            r22 = r13[r21]
            int r22 = r22 - r10
            int r3 = r3 + r22
            goto L_0x00f1
        L_0x00e0:
            r21 = 1
            goto L_0x00f1
        L_0x00e3:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x00f1:
            boolean r10 = r6.mo1343b(r2)
            if (r10 == 0) goto L_0x00fa
            int r10 = r6.f948q
            int r1 = r1 + r10
        L_0x00fa:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.mo1330a(r0)
            int r22 = r10 + r1
            r1 = r0
            r0 = r24
            r25 = r1
            r11 = r2
            r2 = r22
            r22 = r7
            r23 = -1
            r7 = r4
            r4 = r15
            r0.m1058a(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.mo1338b(r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.mo1331a(r0, r11)
            int r3 = r18 + r0
            r1 = r10
            goto L_0x0133
        L_0x0127:
            r18 = r3
        L_0x0129:
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
            r23 = -1
        L_0x0133:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r7 = r22
            r5 = 1
            r15 = 2
            goto L_0x0065
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0212e0.mo1334a(int, int, int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1335a(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int virtualChildCount = getVirtualChildCount();
        boolean a = C0293z0.m1487a(this);
        for (int i4 = 0; i4 < virtualChildCount; i4++) {
            View a2 = mo1332a(i4);
            if (!(a2 == null || a2.getVisibility() == 8 || !mo1343b(i4))) {
                C0213a aVar = (C0213a) a2.getLayoutParams();
                mo1342b(canvas, a ? a2.getRight() + aVar.rightMargin : (a2.getLeft() - aVar.leftMargin) - this.f948q);
            }
        }
        if (mo1343b(virtualChildCount)) {
            View a3 = mo1332a(virtualChildCount - 1);
            if (a3 != null) {
                C0213a aVar2 = (C0213a) a3.getLayoutParams();
                if (a) {
                    i3 = a3.getLeft();
                    i2 = aVar2.leftMargin;
                } else {
                    i = a3.getRight() + aVar2.rightMargin;
                    mo1342b(canvas, i);
                }
            } else if (a) {
                i = getPaddingLeft();
                mo1342b(canvas, i);
            } else {
                i3 = getWidth();
                i2 = getPaddingRight();
            }
            i = (i3 - i2) - this.f948q;
            mo1342b(canvas, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1336a(Canvas canvas, int i) {
        this.f947p.setBounds(getPaddingLeft() + this.f951t, i, (getWidth() - getPaddingRight()) - this.f951t, this.f949r + i);
        this.f947p.draw(canvas);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1337a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo1338b(View view) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02d0, code lost:
        if (r15 > 0) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02db, code lost:
        if (r15 < 0) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02dd, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02de, code lost:
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & -256);
        r0 = r18;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x031b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1339b(int r34, int r35) {
        /*
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = 0
            r7.f942k = r10
            int r11 = r33.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = android.view.View.MeasureSpec.getMode(r35)
            int r14 = r7.f938g
            boolean r15 = r7.f944m
            r16 = 0
            r17 = 1
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r18 = 0
            r19 = 1
            r20 = 0
        L_0x002a:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L_0x0199
            android.view.View r4 = r7.mo1332a(r6)
            if (r4 != 0) goto L_0x0047
            int r4 = r7.f942k
            int r10 = r7.mo1344c(r6)
            int r4 = r4 + r10
            r7.f942k = r4
            r26 = r11
            r24 = r13
            r4 = r22
            goto L_0x018d
        L_0x0047:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L_0x005e
            int r1 = r7.mo1331a(r4, r6)
            int r6 = r6 + r1
            r26 = r11
            r4 = r22
            r1 = r24
            r24 = r13
            goto L_0x018d
        L_0x005e:
            boolean r1 = r7.mo1343b(r6)
            if (r1 == 0) goto L_0x006b
            int r1 = r7.f942k
            int r10 = r7.f949r
            int r1 = r1 + r10
            r7.f942k = r1
        L_0x006b:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            androidx.appcompat.widget.e0$a r10 = (androidx.appcompat.widget.C0212e0.C0213a) r10
            float r1 = r10.f952a
            float r25 = r0 + r1
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 != r0) goto L_0x00a5
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a5
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a5
            int r0 = r7.f942k
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.f942k = r0
            r0 = r3
            r3 = r4
            r31 = r5
            r8 = r24
            r29 = r26
            r18 = 1
            r26 = r11
            r24 = r13
            r13 = r22
            r11 = r6
            goto L_0x0115
        L_0x00a5:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00b6
            float r0 = r10.f952a
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b6
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00b8
        L_0x00b6:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b8:
            r27 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c3
            int r0 = r7.f942k
            r23 = r0
            goto L_0x00c5
        L_0x00c3:
            r23 = 0
        L_0x00c5:
            r28 = 1073741824(0x40000000, float:2.0)
            r0 = r33
            r8 = r24
            r1 = r4
            r30 = r2
            r29 = r26
            r2 = r6
            r9 = r3
            r3 = r34
            r26 = r11
            r24 = r13
            r13 = r22
            r11 = 1073741824(0x40000000, float:2.0)
            r22 = r4
            r4 = r27
            r31 = r5
            r5 = r35
            r11 = r6
            r6 = r23
            r0.mo1337a(r1, r2, r3, r4, r5, r6)
            r0 = r30
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00f2
            r10.height = r0
        L_0x00f2:
            int r0 = r22.getMeasuredHeight()
            int r1 = r7.f942k
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r22
            int r4 = r7.mo1338b(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f942k = r1
            if (r15 == 0) goto L_0x0114
            int r0 = java.lang.Math.max(r0, r9)
            goto L_0x0115
        L_0x0114:
            r0 = r9
        L_0x0115:
            if (r14 < 0) goto L_0x011f
            int r6 = r11 + 1
            if (r14 != r6) goto L_0x011f
            int r1 = r7.f942k
            r7.f939h = r1
        L_0x011f:
            if (r11 >= r14) goto L_0x0130
            float r1 = r10.f952a
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x0128
            goto L_0x0130
        L_0x0128:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0130:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x013d
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L_0x013d
            r1 = 1
            r20 = 1
            goto L_0x013e
        L_0x013d:
            r1 = 0
        L_0x013e:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r29
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L_0x0160
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L_0x0160
            r19 = 1
            goto L_0x0162
        L_0x0160:
            r19 = 0
        L_0x0162:
            float r8 = r10.f952a
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x0173
            if (r1 == 0) goto L_0x016b
            goto L_0x016c
        L_0x016b:
            r2 = r4
        L_0x016c:
            int r4 = java.lang.Math.max(r13, r2)
            r1 = r31
            goto L_0x017e
        L_0x0173:
            if (r1 == 0) goto L_0x0176
            goto L_0x0177
        L_0x0176:
            r2 = r4
        L_0x0177:
            r1 = r31
            int r1 = java.lang.Math.max(r1, r2)
            r4 = r13
        L_0x017e:
            int r2 = r7.mo1331a(r3, r11)
            int r2 = r2 + r11
            r3 = r0
            r0 = r25
            r32 = r5
            r5 = r1
            r1 = r6
            r6 = r2
            r2 = r32
        L_0x018d:
            int r6 = r6 + 1
            r8 = r34
            r9 = r35
            r13 = r24
            r11 = r26
            goto L_0x002a
        L_0x0199:
            r8 = r1
            r9 = r3
            r1 = r5
            r26 = r11
            r24 = r13
            r13 = r22
            r5 = r2
            int r2 = r7.f942k
            if (r2 <= 0) goto L_0x01b7
            r2 = r26
            boolean r3 = r7.mo1343b(r2)
            if (r3 == 0) goto L_0x01b9
            int r3 = r7.f942k
            int r4 = r7.f949r
            int r3 = r3 + r4
            r7.f942k = r3
            goto L_0x01b9
        L_0x01b7:
            r2 = r26
        L_0x01b9:
            r3 = r24
            if (r15 == 0) goto L_0x0207
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x01c3
            if (r3 != 0) goto L_0x0207
        L_0x01c3:
            r4 = 0
            r7.f942k = r4
            r4 = 0
        L_0x01c7:
            if (r4 >= r2) goto L_0x0207
            android.view.View r6 = r7.mo1332a(r4)
            if (r6 != 0) goto L_0x01d9
            int r6 = r7.f942k
            int r11 = r7.mo1344c(r4)
            int r6 = r6 + r11
        L_0x01d6:
            r7.f942k = r6
            goto L_0x0202
        L_0x01d9:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L_0x01e5
            int r6 = r7.mo1331a(r6, r4)
            int r4 = r4 + r6
            goto L_0x0202
        L_0x01e5:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            androidx.appcompat.widget.e0$a r11 = (androidx.appcompat.widget.C0212e0.C0213a) r11
            int r14 = r7.f942k
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.mo1338b(r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            goto L_0x01d6
        L_0x0202:
            int r4 = r4 + 1
            r10 = 8
            goto L_0x01c7
        L_0x0207:
            int r4 = r7.f942k
            int r6 = r33.getPaddingTop()
            int r10 = r33.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.f942k = r4
            int r6 = r33.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = r35
            r10 = r9
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.f942k
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x0276
            if (r9 == 0) goto L_0x0235
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x0235
            goto L_0x0276
        L_0x0235:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L_0x0271
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x0271
            r1 = 0
        L_0x0240:
            if (r1 >= r2) goto L_0x0271
            android.view.View r3 = r7.mo1332a(r1)
            if (r3 == 0) goto L_0x026e
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x0251
            goto L_0x026e
        L_0x0251:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            androidx.appcompat.widget.e0$a r9 = (androidx.appcompat.widget.C0212e0.C0213a) r9
            float r9 = r9.f952a
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x026e
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L_0x026e:
            int r1 = r1 + 1
            goto L_0x0240
        L_0x0271:
            r11 = r34
            r1 = r8
            goto L_0x0360
        L_0x0276:
            float r10 = r7.f943l
            int r11 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x027d
            r0 = r10
        L_0x027d:
            r10 = 0
            r7.f942k = r10
            r11 = r9
            r9 = r1
            r1 = r8
            r8 = 0
        L_0x0284:
            if (r8 >= r2) goto L_0x034f
            android.view.View r13 = r7.mo1332a(r8)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x0298
            r21 = r11
            r11 = r34
            goto L_0x0348
        L_0x0298:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.appcompat.widget.e0$a r14 = (androidx.appcompat.widget.C0212e0.C0213a) r14
            float r10 = r14.f952a
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x02f2
            float r15 = (float) r11
            float r15 = r15 * r10
            float r15 = r15 / r0
            int r15 = (int) r15
            float r0 = r0 - r10
            int r11 = r11 - r15
            int r10 = r33.getPaddingLeft()
            int r18 = r33.getPaddingRight()
            int r10 = r10 + r18
            r18 = r0
            int r0 = r14.leftMargin
            int r10 = r10 + r0
            int r0 = r14.rightMargin
            int r10 = r10 + r0
            int r0 = r14.width
            r21 = r11
            r11 = r34
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r11, r10, r0)
            int r10 = r14.height
            if (r10 != 0) goto L_0x02d3
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L_0x02d0
            goto L_0x02d5
        L_0x02d0:
            if (r15 <= 0) goto L_0x02dd
            goto L_0x02de
        L_0x02d3:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x02d5:
            int r23 = r13.getMeasuredHeight()
            int r15 = r23 + r15
            if (r15 >= 0) goto L_0x02de
        L_0x02dd:
            r15 = 0
        L_0x02de:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r0, r15)
            int r0 = r13.getMeasuredState()
            r0 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r1 = android.view.View.combineMeasuredStates(r1, r0)
            r0 = r18
            goto L_0x02f7
        L_0x02f2:
            r10 = r11
            r11 = r34
            r21 = r10
        L_0x02f7:
            int r10 = r14.leftMargin
            int r15 = r14.rightMargin
            int r10 = r10 + r15
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r10
            int r5 = java.lang.Math.max(r5, r15)
            r18 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x0314
            int r0 = r14.width
            r23 = r1
            r1 = -1
            if (r0 != r1) goto L_0x0317
            r0 = 1
            goto L_0x0318
        L_0x0314:
            r23 = r1
            r1 = -1
        L_0x0317:
            r0 = 0
        L_0x0318:
            if (r0 == 0) goto L_0x031b
            goto L_0x031c
        L_0x031b:
            r10 = r15
        L_0x031c:
            int r0 = java.lang.Math.max(r9, r10)
            if (r19 == 0) goto L_0x0328
            int r9 = r14.width
            if (r9 != r1) goto L_0x0328
            r9 = 1
            goto L_0x0329
        L_0x0328:
            r9 = 0
        L_0x0329:
            int r10 = r7.f942k
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r10
            int r1 = r14.topMargin
            int r15 = r15 + r1
            int r1 = r14.bottomMargin
            int r15 = r15 + r1
            int r1 = r7.mo1338b(r13)
            int r15 = r15 + r1
            int r1 = java.lang.Math.max(r10, r15)
            r7.f942k = r1
            r19 = r9
            r1 = r23
            r9 = r0
            r0 = r18
        L_0x0348:
            int r8 = r8 + 1
            r11 = r21
            r10 = 0
            goto L_0x0284
        L_0x034f:
            r11 = r34
            int r0 = r7.f942k
            int r3 = r33.getPaddingTop()
            int r8 = r33.getPaddingBottom()
            int r3 = r3 + r8
            int r0 = r0 + r3
            r7.f942k = r0
            r0 = r9
        L_0x0360:
            if (r19 != 0) goto L_0x0367
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x0367
            goto L_0x0368
        L_0x0367:
            r0 = r5
        L_0x0368:
            int r3 = r33.getPaddingLeft()
            int r5 = r33.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L_0x0386
            r7.m1060d(r2, r6)
        L_0x0386:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0212e0.mo1339b(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1340b(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f941j
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L_0x003b
            r0 = 80
            if (r1 == r0) goto L_0x002f
            int r0 = r17.getPaddingTop()
            goto L_0x0047
        L_0x002f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f942k
            int r0 = r0 - r1
            goto L_0x0047
        L_0x003b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f942k
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L_0x0047:
            r1 = 0
            r12 = 0
        L_0x0049:
            if (r12 >= r10) goto L_0x00c6
            android.view.View r13 = r6.mo1332a(r12)
            r14 = 1
            if (r13 != 0) goto L_0x0059
            int r1 = r6.mo1344c(r12)
            int r0 = r0 + r1
            goto L_0x00c3
        L_0x0059:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto L_0x00c3
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.e0$a r5 = (androidx.appcompat.widget.C0212e0.C0213a) r5
            int r1 = r5.f953b
            if (r1 >= 0) goto L_0x0075
            r1 = r11
        L_0x0075:
            int r2 = p071f.p097h.p108m.C3379v.m13829p(r17)
            int r1 = p071f.p097h.p108m.C3339d.m13606a(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L_0x008b
            r2 = 5
            if (r1 == r2) goto L_0x0088
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L_0x0096
        L_0x0088:
            int r1 = r8 - r4
            goto L_0x0093
        L_0x008b:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L_0x0093:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
        L_0x0096:
            r2 = r1
            boolean r1 = r6.mo1343b(r12)
            if (r1 == 0) goto L_0x00a0
            int r1 = r6.f949r
            int r0 = r0 + r1
        L_0x00a0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.mo1330a(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m1058a(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.mo1338b(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.mo1331a(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        L_0x00c3:
            r1 = 1
            int r12 = r12 + r1
            goto L_0x0049
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0212e0.mo1340b(int, int, int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1341b(Canvas canvas) {
        int i;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View a = mo1332a(i2);
            if (!(a == null || a.getVisibility() == 8 || !mo1343b(i2))) {
                mo1336a(canvas, (a.getTop() - ((C0213a) a.getLayoutParams()).topMargin) - this.f949r);
            }
        }
        if (mo1343b(virtualChildCount)) {
            View a2 = mo1332a(virtualChildCount - 1);
            if (a2 == null) {
                i = (getHeight() - getPaddingBottom()) - this.f949r;
            } else {
                i = a2.getBottom() + ((C0213a) a2.getLayoutParams()).bottomMargin;
            }
            mo1336a(canvas, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1342b(Canvas canvas, int i) {
        this.f947p.setBounds(i, getPaddingTop() + this.f951t, this.f948q + i, (getHeight() - getPaddingBottom()) - this.f951t);
        this.f947p.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1343b(int i) {
        boolean z = false;
        if (i == 0) {
            if ((this.f950s & 1) != 0) {
                z = true;
            }
            return z;
        } else if (i == getChildCount()) {
            if ((this.f950s & 4) != 0) {
                z = true;
            }
            return z;
        } else {
            if ((this.f950s & 2) != 0) {
                int i2 = i - 1;
                while (true) {
                    if (i2 < 0) {
                        break;
                    } else if (getChildAt(i2).getVisibility() != 8) {
                        z = true;
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            return z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo1344c(int i) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0213a;
    }

    /* access modifiers changed from: protected */
    public C0213a generateDefaultLayoutParams() {
        int i = this.f940i;
        if (i == 0) {
            return new C0213a(-2, -2);
        }
        if (i == 1) {
            return new C0213a(-1, -2);
        }
        return null;
    }

    public C0213a generateLayoutParams(AttributeSet attributeSet) {
        return new C0213a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0213a generateLayoutParams(LayoutParams layoutParams) {
        return new C0213a(layoutParams);
    }

    public int getBaseline() {
        if (this.f938g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.f938g;
        if (childCount > i) {
            View childAt = getChildAt(i);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i2 = this.f939h;
                if (this.f940i == 1) {
                    int i3 = this.f941j & 112;
                    if (i3 != 48) {
                        if (i3 == 16) {
                            i2 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f942k) / 2;
                        } else if (i3 == 80) {
                            i2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f942k;
                        }
                    }
                }
                return i2 + ((C0213a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f938g == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f938g;
    }

    public Drawable getDividerDrawable() {
        return this.f947p;
    }

    public int getDividerPadding() {
        return this.f951t;
    }

    public int getDividerWidth() {
        return this.f948q;
    }

    public int getGravity() {
        return this.f941j;
    }

    public int getOrientation() {
        return this.f940i;
    }

    public int getShowDividers() {
        return this.f950s;
    }

    /* access modifiers changed from: 0000 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f943l;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f947p != null) {
            if (this.f940i == 1) {
                mo1341b(canvas);
            } else {
                mo1335a(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f940i == 1) {
            mo1340b(i, i2, i3, i4);
        } else {
            mo1334a(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f940i == 1) {
            mo1339b(i, i2);
        } else {
            mo1333a(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f937f = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder sb = new StringBuilder();
            sb.append("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f938g = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f947p) {
            this.f947p = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f948q = drawable.getIntrinsicWidth();
                this.f949r = drawable.getIntrinsicHeight();
            } else {
                this.f948q = 0;
                this.f949r = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f951t = i;
    }

    public void setGravity(int i) {
        if (this.f941j != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f941j = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f941j;
        if ((8388615 & i3) != i2) {
            this.f941j = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f944m = z;
    }

    public void setOrientation(int i) {
        if (this.f940i != i) {
            this.f940i = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f950s) {
            requestLayout();
        }
        this.f950s = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f941j;
        if ((i3 & 112) != i2) {
            this.f941j = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f943l = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}