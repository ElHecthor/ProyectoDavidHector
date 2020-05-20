package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.HashMap;
import p071f.p089f.p093b.p094j.C3196e;
import p071f.p089f.p093b.p094j.C3196e.C3198b;
import p071f.p089f.p093b.p094j.C3199f;
import p071f.p089f.p093b.p094j.C3202h;
import p071f.p089f.p093b.p094j.p095n.C3210b.C3212b;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: f */
    SparseArray<View> f1320f = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ArrayList<C0312b> f1321g = new ArrayList<>(4);

    /* renamed from: h */
    private final ArrayList<C3196e> f1322h = new ArrayList<>(100);

    /* renamed from: i */
    protected C3199f f1323i = new C3199f();

    /* renamed from: j */
    private int f1324j = 0;

    /* renamed from: k */
    private int f1325k = 0;

    /* renamed from: l */
    private int f1326l = Integer.MAX_VALUE;

    /* renamed from: m */
    private int f1327m = Integer.MAX_VALUE;

    /* renamed from: n */
    protected boolean f1328n = true;

    /* renamed from: o */
    private int f1329o = 7;

    /* renamed from: p */
    private C0316d f1330p = null;

    /* renamed from: q */
    protected C0313c f1331q = null;

    /* renamed from: r */
    private int f1332r = -1;

    /* renamed from: s */
    private HashMap<String, Integer> f1333s = new HashMap<>();

    /* renamed from: t */
    private int f1334t = -1;

    /* renamed from: u */
    private int f1335u = -1;

    /* renamed from: v */
    private SparseArray<C3196e> f1336v = new SparseArray<>();

    /* renamed from: w */
    C0308c f1337w = new C0308c(this, this);
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f1338x = 0;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f1339y = 0;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    static /* synthetic */ class C0305a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1340a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                f.f.b.j.e$b[] r0 = p071f.p089f.p093b.p094j.C3196e.C3198b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1340a = r0
                f.f.b.j.e$b r1 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1340a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.f.b.j.e$b r1 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1340a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.f.b.j.e$b r1 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1340a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.f.b.j.e$b r1 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0305a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public static class C0306b extends MarginLayoutParams {

        /* renamed from: A */
        public float f1341A = 0.5f;

        /* renamed from: B */
        public String f1342B = null;

        /* renamed from: C */
        int f1343C = 1;

        /* renamed from: D */
        public float f1344D = -1.0f;

        /* renamed from: E */
        public float f1345E = -1.0f;

        /* renamed from: F */
        public int f1346F = 0;

        /* renamed from: G */
        public int f1347G = 0;

        /* renamed from: H */
        public int f1348H = 0;

        /* renamed from: I */
        public int f1349I = 0;

        /* renamed from: J */
        public int f1350J = 0;

        /* renamed from: K */
        public int f1351K = 0;

        /* renamed from: L */
        public int f1352L = 0;

        /* renamed from: M */
        public int f1353M = 0;

        /* renamed from: N */
        public float f1354N = 1.0f;

        /* renamed from: O */
        public float f1355O = 1.0f;

        /* renamed from: P */
        public int f1356P = -1;

        /* renamed from: Q */
        public int f1357Q = -1;

        /* renamed from: R */
        public int f1358R = -1;

        /* renamed from: S */
        public boolean f1359S = false;

        /* renamed from: T */
        public boolean f1360T = false;

        /* renamed from: U */
        public String f1361U = null;

        /* renamed from: V */
        boolean f1362V = true;

        /* renamed from: W */
        boolean f1363W = true;

        /* renamed from: X */
        boolean f1364X = false;

        /* renamed from: Y */
        boolean f1365Y = false;

        /* renamed from: Z */
        boolean f1366Z = false;

        /* renamed from: a */
        public int f1367a = -1;

        /* renamed from: a0 */
        boolean f1368a0 = false;

        /* renamed from: b */
        public int f1369b = -1;

        /* renamed from: b0 */
        boolean f1370b0 = false;

        /* renamed from: c */
        public float f1371c = -1.0f;

        /* renamed from: c0 */
        int f1372c0 = -1;

        /* renamed from: d */
        public int f1373d = -1;

        /* renamed from: d0 */
        int f1374d0 = -1;

        /* renamed from: e */
        public int f1375e = -1;

        /* renamed from: e0 */
        int f1376e0 = -1;

        /* renamed from: f */
        public int f1377f = -1;

        /* renamed from: f0 */
        int f1378f0 = -1;

        /* renamed from: g */
        public int f1379g = -1;

        /* renamed from: g0 */
        int f1380g0 = -1;

        /* renamed from: h */
        public int f1381h = -1;

        /* renamed from: h0 */
        int f1382h0 = -1;

        /* renamed from: i */
        public int f1383i = -1;

        /* renamed from: i0 */
        float f1384i0 = 0.5f;

        /* renamed from: j */
        public int f1385j = -1;

        /* renamed from: j0 */
        int f1386j0;

        /* renamed from: k */
        public int f1387k = -1;

        /* renamed from: k0 */
        int f1388k0;

        /* renamed from: l */
        public int f1389l = -1;

        /* renamed from: l0 */
        float f1390l0;

        /* renamed from: m */
        public int f1391m = -1;

        /* renamed from: m0 */
        C3196e f1392m0 = new C3196e();

        /* renamed from: n */
        public int f1393n = 0;

        /* renamed from: n0 */
        public boolean f1394n0;

        /* renamed from: o */
        public float f1395o = 0.0f;

        /* renamed from: p */
        public int f1396p = -1;

        /* renamed from: q */
        public int f1397q = -1;

        /* renamed from: r */
        public int f1398r = -1;

        /* renamed from: s */
        public int f1399s = -1;

        /* renamed from: t */
        public int f1400t = -1;

        /* renamed from: u */
        public int f1401u = -1;

        /* renamed from: v */
        public int f1402v = -1;

        /* renamed from: w */
        public int f1403w = -1;

        /* renamed from: x */
        public int f1404x = -1;

        /* renamed from: y */
        public int f1405y = -1;

        /* renamed from: z */
        public float f1406z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        private static class C0307a {

            /* renamed from: a */
            public static final SparseIntArray f1407a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1407a = sparseIntArray;
                sparseIntArray.append(C0328j.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f1407a.append(C0328j.ConstraintLayout_Layout_android_orientation, 1);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                f1407a.append(C0328j.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        public C0306b(int i, int i2) {
            super(i, i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:79:0x0217, code lost:
            android.util.Log.e(r7, r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0306b(android.content.Context r11, android.util.AttributeSet r12) {
            /*
                r10 = this;
                r10.<init>(r11, r12)
                r0 = -1
                r10.f1367a = r0
                r10.f1369b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10.f1371c = r1
                r10.f1373d = r0
                r10.f1375e = r0
                r10.f1377f = r0
                r10.f1379g = r0
                r10.f1381h = r0
                r10.f1383i = r0
                r10.f1385j = r0
                r10.f1387k = r0
                r10.f1389l = r0
                r10.f1391m = r0
                r2 = 0
                r10.f1393n = r2
                r3 = 0
                r10.f1395o = r3
                r10.f1396p = r0
                r10.f1397q = r0
                r10.f1398r = r0
                r10.f1399s = r0
                r10.f1400t = r0
                r10.f1401u = r0
                r10.f1402v = r0
                r10.f1403w = r0
                r10.f1404x = r0
                r10.f1405y = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r10.f1406z = r4
                r10.f1341A = r4
                r5 = 0
                r10.f1342B = r5
                r6 = 1
                r10.f1343C = r6
                r10.f1344D = r1
                r10.f1345E = r1
                r10.f1346F = r2
                r10.f1347G = r2
                r10.f1348H = r2
                r10.f1349I = r2
                r10.f1350J = r2
                r10.f1351K = r2
                r10.f1352L = r2
                r10.f1353M = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r10.f1354N = r1
                r10.f1355O = r1
                r10.f1356P = r0
                r10.f1357Q = r0
                r10.f1358R = r0
                r10.f1359S = r2
                r10.f1360T = r2
                r10.f1361U = r5
                r10.f1362V = r6
                r10.f1363W = r6
                r10.f1364X = r2
                r10.f1365Y = r2
                r10.f1366Z = r2
                r10.f1368a0 = r2
                r10.f1370b0 = r2
                r10.f1372c0 = r0
                r10.f1374d0 = r0
                r10.f1376e0 = r0
                r10.f1378f0 = r0
                r10.f1380g0 = r0
                r10.f1382h0 = r0
                r10.f1384i0 = r4
                f.f.b.j.e r1 = new f.f.b.j.e
                r1.<init>()
                r10.f1392m0 = r1
                int[] r1 = androidx.constraintlayout.widget.C0328j.ConstraintLayout_Layout
                android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r1)
                int r12 = r11.getIndexCount()
                r1 = 0
            L_0x009a:
                if (r1 >= r12) goto L_0x03be
                int r4 = r11.getIndex(r1)
                android.util.SparseIntArray r5 = androidx.constraintlayout.widget.ConstraintLayout.C0306b.C0307a.f1407a
                int r5 = r5.get(r4)
                java.lang.String r7 = "ConstraintLayout"
                r8 = 2
                r9 = -2
                switch(r5) {
                    case 1: goto L_0x03b2;
                    case 2: goto L_0x03a1;
                    case 3: goto L_0x0398;
                    case 4: goto L_0x0383;
                    case 5: goto L_0x037a;
                    case 6: goto L_0x0371;
                    case 7: goto L_0x0368;
                    case 8: goto L_0x0357;
                    case 9: goto L_0x0346;
                    case 10: goto L_0x0334;
                    case 11: goto L_0x0322;
                    case 12: goto L_0x0310;
                    case 13: goto L_0x02fe;
                    case 14: goto L_0x02ec;
                    case 15: goto L_0x02da;
                    case 16: goto L_0x02c8;
                    case 17: goto L_0x02b6;
                    case 18: goto L_0x02a4;
                    case 19: goto L_0x0292;
                    case 20: goto L_0x0280;
                    case 21: goto L_0x0276;
                    case 22: goto L_0x026c;
                    case 23: goto L_0x0262;
                    case 24: goto L_0x0258;
                    case 25: goto L_0x024e;
                    case 26: goto L_0x0244;
                    case 27: goto L_0x023a;
                    case 28: goto L_0x0230;
                    case 29: goto L_0x0226;
                    case 30: goto L_0x021c;
                    case 31: goto L_0x020d;
                    case 32: goto L_0x0202;
                    case 33: goto L_0x01eb;
                    case 34: goto L_0x01d4;
                    case 35: goto L_0x01c4;
                    case 36: goto L_0x01ad;
                    case 37: goto L_0x0196;
                    case 38: goto L_0x0186;
                    default: goto L_0x00ad;
                }
            L_0x00ad:
                switch(r5) {
                    case 44: goto L_0x00f2;
                    case 45: goto L_0x00e8;
                    case 46: goto L_0x00de;
                    case 47: goto L_0x00d6;
                    case 48: goto L_0x00ce;
                    case 49: goto L_0x00c4;
                    case 50: goto L_0x00ba;
                    case 51: goto L_0x00b2;
                    default: goto L_0x00b0;
                }
            L_0x00b0:
                goto L_0x03ba
            L_0x00b2:
                java.lang.String r4 = r11.getString(r4)
                r10.f1361U = r4
                goto L_0x03ba
            L_0x00ba:
                int r5 = r10.f1357Q
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f1357Q = r4
                goto L_0x03ba
            L_0x00c4:
                int r5 = r10.f1356P
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f1356P = r4
                goto L_0x03ba
            L_0x00ce:
                int r4 = r11.getInt(r4, r2)
                r10.f1347G = r4
                goto L_0x03ba
            L_0x00d6:
                int r4 = r11.getInt(r4, r2)
                r10.f1346F = r4
                goto L_0x03ba
            L_0x00de:
                float r5 = r10.f1345E
                float r4 = r11.getFloat(r4, r5)
                r10.f1345E = r4
                goto L_0x03ba
            L_0x00e8:
                float r5 = r10.f1344D
                float r4 = r11.getFloat(r4, r5)
                r10.f1344D = r4
                goto L_0x03ba
            L_0x00f2:
                java.lang.String r4 = r11.getString(r4)
                r10.f1342B = r4
                r10.f1343C = r0
                if (r4 == 0) goto L_0x03ba
                int r4 = r4.length()
                java.lang.String r5 = r10.f1342B
                r7 = 44
                int r5 = r5.indexOf(r7)
                if (r5 <= 0) goto L_0x012c
                int r7 = r4 + -1
                if (r5 >= r7) goto L_0x012c
                java.lang.String r7 = r10.f1342B
                java.lang.String r7 = r7.substring(r2, r5)
                java.lang.String r8 = "W"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L_0x011f
                r10.f1343C = r2
                goto L_0x0129
            L_0x011f:
                java.lang.String r8 = "H"
                boolean r7 = r7.equalsIgnoreCase(r8)
                if (r7 == 0) goto L_0x0129
                r10.f1343C = r6
            L_0x0129:
                int r5 = r5 + 1
                goto L_0x012d
            L_0x012c:
                r5 = 0
            L_0x012d:
                java.lang.String r7 = r10.f1342B
                r8 = 58
                int r7 = r7.indexOf(r8)
                if (r7 < 0) goto L_0x0175
                int r4 = r4 + -1
                if (r7 >= r4) goto L_0x0175
                java.lang.String r4 = r10.f1342B
                java.lang.String r4 = r4.substring(r5, r7)
                java.lang.String r5 = r10.f1342B
                int r7 = r7 + 1
                java.lang.String r5 = r5.substring(r7)
                int r7 = r4.length()
                if (r7 <= 0) goto L_0x03ba
                int r7 = r5.length()
                if (r7 <= 0) goto L_0x03ba
                float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03ba }
                float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x03ba }
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03ba
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03ba
                int r7 = r10.f1343C     // Catch:{ NumberFormatException -> 0x03ba }
                if (r7 != r6) goto L_0x016f
                float r5 = r5 / r4
                java.lang.Math.abs(r5)     // Catch:{ NumberFormatException -> 0x03ba }
                goto L_0x03ba
            L_0x016f:
                float r4 = r4 / r5
                java.lang.Math.abs(r4)     // Catch:{ NumberFormatException -> 0x03ba }
                goto L_0x03ba
            L_0x0175:
                java.lang.String r4 = r10.f1342B
                java.lang.String r4 = r4.substring(r5)
                int r5 = r4.length()
                if (r5 <= 0) goto L_0x03ba
                java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03ba }
                goto L_0x03ba
            L_0x0186:
                float r5 = r10.f1355O
                float r4 = r11.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r10.f1355O = r4
                r10.f1349I = r8
                goto L_0x03ba
            L_0x0196:
                int r5 = r10.f1353M     // Catch:{ Exception -> 0x01a0 }
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x01a0 }
                r10.f1353M = r5     // Catch:{ Exception -> 0x01a0 }
                goto L_0x03ba
            L_0x01a0:
                int r5 = r10.f1353M
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L_0x03ba
                r10.f1353M = r9
                goto L_0x03ba
            L_0x01ad:
                int r5 = r10.f1351K     // Catch:{ Exception -> 0x01b7 }
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x01b7 }
                r10.f1351K = r5     // Catch:{ Exception -> 0x01b7 }
                goto L_0x03ba
            L_0x01b7:
                int r5 = r10.f1351K
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L_0x03ba
                r10.f1351K = r9
                goto L_0x03ba
            L_0x01c4:
                float r5 = r10.f1354N
                float r4 = r11.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r10.f1354N = r4
                r10.f1348H = r8
                goto L_0x03ba
            L_0x01d4:
                int r5 = r10.f1352L     // Catch:{ Exception -> 0x01de }
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x01de }
                r10.f1352L = r5     // Catch:{ Exception -> 0x01de }
                goto L_0x03ba
            L_0x01de:
                int r5 = r10.f1352L
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L_0x03ba
                r10.f1352L = r9
                goto L_0x03ba
            L_0x01eb:
                int r5 = r10.f1350J     // Catch:{ Exception -> 0x01f5 }
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x01f5 }
                r10.f1350J = r5     // Catch:{ Exception -> 0x01f5 }
                goto L_0x03ba
            L_0x01f5:
                int r5 = r10.f1350J
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L_0x03ba
                r10.f1350J = r9
                goto L_0x03ba
            L_0x0202:
                int r4 = r11.getInt(r4, r2)
                r10.f1349I = r4
                if (r4 != r6) goto L_0x03ba
                java.lang.String r4 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L_0x0217
            L_0x020d:
                int r4 = r11.getInt(r4, r2)
                r10.f1348H = r4
                if (r4 != r6) goto L_0x03ba
                java.lang.String r4 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L_0x0217:
                android.util.Log.e(r7, r4)
                goto L_0x03ba
            L_0x021c:
                float r5 = r10.f1341A
                float r4 = r11.getFloat(r4, r5)
                r10.f1341A = r4
                goto L_0x03ba
            L_0x0226:
                float r5 = r10.f1406z
                float r4 = r11.getFloat(r4, r5)
                r10.f1406z = r4
                goto L_0x03ba
            L_0x0230:
                boolean r5 = r10.f1360T
                boolean r4 = r11.getBoolean(r4, r5)
                r10.f1360T = r4
                goto L_0x03ba
            L_0x023a:
                boolean r5 = r10.f1359S
                boolean r4 = r11.getBoolean(r4, r5)
                r10.f1359S = r4
                goto L_0x03ba
            L_0x0244:
                int r5 = r10.f1405y
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f1405y = r4
                goto L_0x03ba
            L_0x024e:
                int r5 = r10.f1404x
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f1404x = r4
                goto L_0x03ba
            L_0x0258:
                int r5 = r10.f1403w
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f1403w = r4
                goto L_0x03ba
            L_0x0262:
                int r5 = r10.f1402v
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f1402v = r4
                goto L_0x03ba
            L_0x026c:
                int r5 = r10.f1401u
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f1401u = r4
                goto L_0x03ba
            L_0x0276:
                int r5 = r10.f1400t
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f1400t = r4
                goto L_0x03ba
            L_0x0280:
                int r5 = r10.f1399s
                int r5 = r11.getResourceId(r4, r5)
                r10.f1399s = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f1399s = r4
                goto L_0x03ba
            L_0x0292:
                int r5 = r10.f1398r
                int r5 = r11.getResourceId(r4, r5)
                r10.f1398r = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f1398r = r4
                goto L_0x03ba
            L_0x02a4:
                int r5 = r10.f1397q
                int r5 = r11.getResourceId(r4, r5)
                r10.f1397q = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f1397q = r4
                goto L_0x03ba
            L_0x02b6:
                int r5 = r10.f1396p
                int r5 = r11.getResourceId(r4, r5)
                r10.f1396p = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f1396p = r4
                goto L_0x03ba
            L_0x02c8:
                int r5 = r10.f1389l
                int r5 = r11.getResourceId(r4, r5)
                r10.f1389l = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f1389l = r4
                goto L_0x03ba
            L_0x02da:
                int r5 = r10.f1387k
                int r5 = r11.getResourceId(r4, r5)
                r10.f1387k = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f1387k = r4
                goto L_0x03ba
            L_0x02ec:
                int r5 = r10.f1385j
                int r5 = r11.getResourceId(r4, r5)
                r10.f1385j = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f1385j = r4
                goto L_0x03ba
            L_0x02fe:
                int r5 = r10.f1383i
                int r5 = r11.getResourceId(r4, r5)
                r10.f1383i = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f1383i = r4
                goto L_0x03ba
            L_0x0310:
                int r5 = r10.f1381h
                int r5 = r11.getResourceId(r4, r5)
                r10.f1381h = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f1381h = r4
                goto L_0x03ba
            L_0x0322:
                int r5 = r10.f1379g
                int r5 = r11.getResourceId(r4, r5)
                r10.f1379g = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f1379g = r4
                goto L_0x03ba
            L_0x0334:
                int r5 = r10.f1377f
                int r5 = r11.getResourceId(r4, r5)
                r10.f1377f = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f1377f = r4
                goto L_0x03ba
            L_0x0346:
                int r5 = r10.f1375e
                int r5 = r11.getResourceId(r4, r5)
                r10.f1375e = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f1375e = r4
                goto L_0x03ba
            L_0x0357:
                int r5 = r10.f1373d
                int r5 = r11.getResourceId(r4, r5)
                r10.f1373d = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f1373d = r4
                goto L_0x03ba
            L_0x0368:
                float r5 = r10.f1371c
                float r4 = r11.getFloat(r4, r5)
                r10.f1371c = r4
                goto L_0x03ba
            L_0x0371:
                int r5 = r10.f1369b
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f1369b = r4
                goto L_0x03ba
            L_0x037a:
                int r5 = r10.f1367a
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f1367a = r4
                goto L_0x03ba
            L_0x0383:
                float r5 = r10.f1395o
                float r4 = r11.getFloat(r4, r5)
                r5 = 1135869952(0x43b40000, float:360.0)
                float r4 = r4 % r5
                r10.f1395o = r4
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x03ba
                float r4 = r5 - r4
                float r4 = r4 % r5
                r10.f1395o = r4
                goto L_0x03ba
            L_0x0398:
                int r5 = r10.f1393n
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f1393n = r4
                goto L_0x03ba
            L_0x03a1:
                int r5 = r10.f1391m
                int r5 = r11.getResourceId(r4, r5)
                r10.f1391m = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r11.getInt(r4, r0)
                r10.f1391m = r4
                goto L_0x03ba
            L_0x03b2:
                int r5 = r10.f1358R
                int r4 = r11.getInt(r4, r5)
                r10.f1358R = r4
            L_0x03ba:
                int r1 = r1 + 1
                goto L_0x009a
            L_0x03be:
                r11.recycle()
                r10.mo1995a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0306b.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public C0306b(LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void mo1995a() {
            this.f1365Y = false;
            this.f1362V = true;
            this.f1363W = true;
            if (this.width == -2 && this.f1359S) {
                this.f1362V = false;
                if (this.f1348H == 0) {
                    this.f1348H = 1;
                }
            }
            if (this.height == -2 && this.f1360T) {
                this.f1363W = false;
                if (this.f1349I == 0) {
                    this.f1349I = 1;
                }
            }
            int i = this.width;
            if (i == 0 || i == -1) {
                this.f1362V = false;
                if (this.width == 0 && this.f1348H == 1) {
                    this.width = -2;
                    this.f1359S = true;
                }
            }
            int i2 = this.height;
            if (i2 == 0 || i2 == -1) {
                this.f1363W = false;
                if (this.height == 0 && this.f1349I == 1) {
                    this.height = -2;
                    this.f1360T = true;
                }
            }
            if (this.f1371c != -1.0f || this.f1367a != -1 || this.f1369b != -1) {
                this.f1365Y = true;
                this.f1362V = true;
                this.f1363W = true;
                if (!(this.f1392m0 instanceof C3202h)) {
                    this.f1392m0 = new C3202h();
                }
                ((C3202h) this.f1392m0).mo10525u(this.f1358R);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:74:0x00dc, code lost:
            if (r1 > 0) goto L_0x00de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x00eb, code lost:
            if (r1 > 0) goto L_0x00de;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x00f2  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x00fd  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 17
                if (r2 < r3) goto L_0x000d
                super.resolveLayoutDirection(r7)
            L_0x000d:
                r7 = -1
                r6.f1376e0 = r7
                r6.f1378f0 = r7
                r6.f1372c0 = r7
                r6.f1374d0 = r7
                r6.f1380g0 = r7
                r6.f1382h0 = r7
                int r2 = r6.f1400t
                r6.f1380g0 = r2
                int r2 = r6.f1402v
                r6.f1382h0 = r2
                float r2 = r6.f1406z
                r6.f1384i0 = r2
                int r2 = r6.f1367a
                r6.f1386j0 = r2
                int r2 = r6.f1369b
                r6.f1388k0 = r2
                float r2 = r6.f1371c
                r6.f1390l0 = r2
                int r2 = r6.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x003c
                r2 = 1
                goto L_0x003d
            L_0x003c:
                r2 = 0
            L_0x003d:
                if (r2 == 0) goto L_0x009e
                int r2 = r6.f1396p
                if (r2 == r7) goto L_0x0047
                r6.f1376e0 = r2
            L_0x0045:
                r3 = 1
                goto L_0x004e
            L_0x0047:
                int r2 = r6.f1397q
                if (r2 == r7) goto L_0x004e
                r6.f1378f0 = r2
                goto L_0x0045
            L_0x004e:
                int r2 = r6.f1398r
                if (r2 == r7) goto L_0x0055
                r6.f1374d0 = r2
                r3 = 1
            L_0x0055:
                int r2 = r6.f1399s
                if (r2 == r7) goto L_0x005c
                r6.f1372c0 = r2
                r3 = 1
            L_0x005c:
                int r2 = r6.f1404x
                if (r2 == r7) goto L_0x0062
                r6.f1382h0 = r2
            L_0x0062:
                int r2 = r6.f1405y
                if (r2 == r7) goto L_0x0068
                r6.f1380g0 = r2
            L_0x0068:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0072
                float r3 = r6.f1406z
                float r3 = r2 - r3
                r6.f1384i0 = r3
            L_0x0072:
                boolean r3 = r6.f1365Y
                if (r3 == 0) goto L_0x00c2
                int r3 = r6.f1358R
                if (r3 != r4) goto L_0x00c2
                float r3 = r6.f1371c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x008a
                float r2 = r2 - r3
                r6.f1390l0 = r2
                r6.f1386j0 = r7
                r6.f1388k0 = r7
                goto L_0x00c2
            L_0x008a:
                int r2 = r6.f1367a
                if (r2 == r7) goto L_0x0095
                r6.f1388k0 = r2
                r6.f1386j0 = r7
            L_0x0092:
                r6.f1390l0 = r4
                goto L_0x00c2
            L_0x0095:
                int r2 = r6.f1369b
                if (r2 == r7) goto L_0x00c2
                r6.f1386j0 = r2
                r6.f1388k0 = r7
                goto L_0x0092
            L_0x009e:
                int r2 = r6.f1396p
                if (r2 == r7) goto L_0x00a4
                r6.f1374d0 = r2
            L_0x00a4:
                int r2 = r6.f1397q
                if (r2 == r7) goto L_0x00aa
                r6.f1372c0 = r2
            L_0x00aa:
                int r2 = r6.f1398r
                if (r2 == r7) goto L_0x00b0
                r6.f1376e0 = r2
            L_0x00b0:
                int r2 = r6.f1399s
                if (r2 == r7) goto L_0x00b6
                r6.f1378f0 = r2
            L_0x00b6:
                int r2 = r6.f1404x
                if (r2 == r7) goto L_0x00bc
                r6.f1380g0 = r2
            L_0x00bc:
                int r2 = r6.f1405y
                if (r2 == r7) goto L_0x00c2
                r6.f1382h0 = r2
            L_0x00c2:
                int r2 = r6.f1398r
                if (r2 != r7) goto L_0x010a
                int r2 = r6.f1399s
                if (r2 != r7) goto L_0x010a
                int r2 = r6.f1397q
                if (r2 != r7) goto L_0x010a
                int r2 = r6.f1396p
                if (r2 != r7) goto L_0x010a
                int r2 = r6.f1377f
                if (r2 == r7) goto L_0x00e1
                r6.f1376e0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00ee
                if (r1 <= 0) goto L_0x00ee
            L_0x00de:
                r6.rightMargin = r1
                goto L_0x00ee
            L_0x00e1:
                int r2 = r6.f1379g
                if (r2 == r7) goto L_0x00ee
                r6.f1378f0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00ee
                if (r1 <= 0) goto L_0x00ee
                goto L_0x00de
            L_0x00ee:
                int r1 = r6.f1373d
                if (r1 == r7) goto L_0x00fd
                r6.f1372c0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x010a
                if (r0 <= 0) goto L_0x010a
            L_0x00fa:
                r6.leftMargin = r0
                goto L_0x010a
            L_0x00fd:
                int r1 = r6.f1375e
                if (r1 == r7) goto L_0x010a
                r6.f1374d0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x010a
                if (r0 <= 0) goto L_0x010a
                goto L_0x00fa
            L_0x010a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0306b.resolveLayoutDirection(int):void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    class C0308c implements C3212b {

        /* renamed from: a */
        ConstraintLayout f1408a;

        public C0308c(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
            this.f1408a = constraintLayout2;
        }

        /* renamed from: a */
        public final void mo1997a() {
            int childCount = this.f1408a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f1408a.getChildAt(i);
                if (childAt instanceof C0326h) {
                    ((C0326h) childAt).mo2037a(this.f1408a);
                }
            }
            int size = this.f1408a.f1321g.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0312b) this.f1408a.f1321g.get(i2)).mo2002b(this.f1408a);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x018c  */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x0190  */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x0199  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x019e  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x01ab  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x01b0  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x01b5  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x01bd A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x01dc  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x01e2  */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x01f8  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x01fa  */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x01ff  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x020d  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0104  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0109  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x010b  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0110  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x011c  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0127  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0132  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x014d A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0166  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0185  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo1998a(p071f.p089f.p093b.p094j.C3196e r18, p071f.p089f.p093b.p094j.p095n.C3210b.C3211a r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r18.mo10470x()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x0019
                r2.f9261e = r5
                r2.f9262f = r5
                r2.f9263g = r5
                return
            L_0x0019:
                f.f.b.j.e$b r3 = r2.f9257a
                f.f.b.j.e$b r4 = r2.f9258b
                int r6 = r2.f9259c
                int r7 = r2.f9260d
                androidx.constraintlayout.widget.ConstraintLayout r8 = r0.f1408a
                int r8 = r8.getPaddingTop()
                androidx.constraintlayout.widget.ConstraintLayout r9 = r0.f1408a
                int r9 = r9.getPaddingBottom()
                int r8 = r8 + r9
                androidx.constraintlayout.widget.ConstraintLayout r9 = r0.f1408a
                int r9 = r9.getPaddingLeft()
                androidx.constraintlayout.widget.ConstraintLayout r10 = r0.f1408a
                int r10 = r10.getPaddingRight()
                int r9 = r9 + r10
                int[] r10 = androidx.constraintlayout.widget.ConstraintLayout.C0305a.f1340a
                int r11 = r3.ordinal()
                r10 = r10[r11]
                r11 = 4
                r12 = 3
                r13 = 2
                r15 = -2
                r14 = 1
                if (r10 == r14) goto L_0x0098
                if (r10 == r13) goto L_0x008c
                if (r10 == r12) goto L_0x007b
                if (r10 == r11) goto L_0x0053
                r6 = 0
            L_0x0051:
                r9 = 0
                goto L_0x009f
            L_0x0053:
                androidx.constraintlayout.widget.ConstraintLayout r6 = r0.f1408a
                int r6 = r6.f1338x
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r15)
                int r9 = r1.f9158j
                if (r9 != r14) goto L_0x0063
                r9 = 1
                goto L_0x0064
            L_0x0063:
                r9 = 0
            L_0x0064:
                boolean r10 = r2.f9266j
                if (r10 == 0) goto L_0x0096
                if (r9 == 0) goto L_0x0076
                if (r9 == 0) goto L_0x0096
                int[] r9 = r1.f9155g
                r9 = r9[r5]
                int r10 = r18.mo10471y()
                if (r9 == r10) goto L_0x0096
            L_0x0076:
                int r6 = r18.mo10471y()
                goto L_0x0098
            L_0x007b:
                androidx.constraintlayout.widget.ConstraintLayout r6 = r0.f1408a
                int r6 = r6.f1338x
                int r10 = r18.mo10452m()
                int r9 = r9 + r10
                r10 = -1
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r10)
                goto L_0x0051
            L_0x008c:
                androidx.constraintlayout.widget.ConstraintLayout r6 = r0.f1408a
                int r6 = r6.f1338x
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r15)
            L_0x0096:
                r9 = 1
                goto L_0x009f
            L_0x0098:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                goto L_0x0051
            L_0x009f:
                int[] r10 = androidx.constraintlayout.widget.ConstraintLayout.C0305a.f1340a
                int r16 = r4.ordinal()
                r10 = r10[r16]
                if (r10 == r14) goto L_0x00f7
                if (r10 == r13) goto L_0x00eb
                if (r10 == r12) goto L_0x00da
                if (r10 == r11) goto L_0x00b2
                r7 = 0
            L_0x00b0:
                r8 = 0
                goto L_0x00fe
            L_0x00b2:
                androidx.constraintlayout.widget.ConstraintLayout r7 = r0.f1408a
                int r7 = r7.f1339y
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r15)
                int r8 = r1.f9159k
                if (r8 != r14) goto L_0x00c2
                r8 = 1
                goto L_0x00c3
            L_0x00c2:
                r8 = 0
            L_0x00c3:
                boolean r10 = r2.f9266j
                if (r10 == 0) goto L_0x00f5
                if (r8 == 0) goto L_0x00d5
                if (r8 == 0) goto L_0x00f5
                int[] r8 = r1.f9155g
                r8 = r8[r14]
                int r10 = r18.mo10444i()
                if (r8 == r10) goto L_0x00f5
            L_0x00d5:
                int r7 = r18.mo10444i()
                goto L_0x00f7
            L_0x00da:
                androidx.constraintlayout.widget.ConstraintLayout r7 = r0.f1408a
                int r7 = r7.f1339y
                int r10 = r18.mo10469w()
                int r8 = r8 + r10
                r10 = -1
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r10)
                goto L_0x00b0
            L_0x00eb:
                androidx.constraintlayout.widget.ConstraintLayout r7 = r0.f1408a
                int r7 = r7.f1339y
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r15)
            L_0x00f5:
                r8 = 1
                goto L_0x00fe
            L_0x00f7:
                r8 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
                goto L_0x00b0
            L_0x00fe:
                f.f.b.j.e$b r10 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
                if (r3 != r10) goto L_0x0104
                r10 = 1
                goto L_0x0105
            L_0x0104:
                r10 = 0
            L_0x0105:
                f.f.b.j.e$b r11 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
                if (r4 != r11) goto L_0x010b
                r11 = 1
                goto L_0x010c
            L_0x010b:
                r11 = 0
            L_0x010c:
                f.f.b.j.e$b r12 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_PARENT
                if (r4 == r12) goto L_0x0117
                f.f.b.j.e$b r12 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
                if (r4 != r12) goto L_0x0115
                goto L_0x0117
            L_0x0115:
                r4 = 0
                goto L_0x0118
            L_0x0117:
                r4 = 1
            L_0x0118:
                f.f.b.j.e$b r12 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_PARENT
                if (r3 == r12) goto L_0x0123
                f.f.b.j.e$b r12 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
                if (r3 != r12) goto L_0x0121
                goto L_0x0123
            L_0x0121:
                r3 = 0
                goto L_0x0124
            L_0x0123:
                r3 = 1
            L_0x0124:
                r12 = 0
                if (r10 == 0) goto L_0x012f
                float r13 = r1.f9131L
                int r13 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
                if (r13 <= 0) goto L_0x012f
                r13 = 1
                goto L_0x0130
            L_0x012f:
                r13 = 0
            L_0x0130:
                if (r11 == 0) goto L_0x013a
                float r15 = r1.f9131L
                int r12 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
                if (r12 <= 0) goto L_0x013a
                r12 = 1
                goto L_0x013b
            L_0x013a:
                r12 = 0
            L_0x013b:
                java.lang.Object r15 = r18.mo10437e()
                android.view.View r15 = (android.view.View) r15
                android.view.ViewGroup$LayoutParams r16 = r15.getLayoutParams()
                r14 = r16
                androidx.constraintlayout.widget.ConstraintLayout$b r14 = (androidx.constraintlayout.widget.ConstraintLayout.C0306b) r14
                boolean r5 = r2.f9266j
                if (r5 != 0) goto L_0x0162
                if (r10 == 0) goto L_0x0162
                int r5 = r1.f9158j
                if (r5 != 0) goto L_0x0162
                if (r11 == 0) goto L_0x0162
                int r5 = r1.f9159k
                if (r5 == 0) goto L_0x015a
                goto L_0x0162
            L_0x015a:
                r0 = -1
                r8 = 0
                r9 = 0
                r11 = 0
                r16 = 0
                goto L_0x01f6
            L_0x0162:
                boolean r5 = r15 instanceof androidx.constraintlayout.widget.C0329k
                if (r5 == 0) goto L_0x0174
                boolean r5 = r1 instanceof p071f.p089f.p093b.p094j.C3207l
                if (r5 == 0) goto L_0x0174
                r5 = r1
                f.f.b.j.l r5 = (p071f.p089f.p093b.p094j.C3207l) r5
                r10 = r15
                androidx.constraintlayout.widget.k r10 = (androidx.constraintlayout.widget.C0329k) r10
                r10.mo1931a(r5, r6, r7)
                goto L_0x0177
            L_0x0174:
                r15.measure(r6, r7)
            L_0x0177:
                int r5 = r15.getMeasuredWidth()
                int r10 = r15.getMeasuredHeight()
                int r11 = r15.getBaseline()
                if (r9 == 0) goto L_0x018c
                int[] r9 = r1.f9155g
                r16 = 0
                r9[r16] = r5
                goto L_0x018e
            L_0x018c:
                r16 = 0
            L_0x018e:
                if (r8 == 0) goto L_0x0195
                int[] r8 = r1.f9155g
                r9 = 1
                r8[r9] = r10
            L_0x0195:
                int r8 = r1.f9161m
                if (r8 <= 0) goto L_0x019e
                int r8 = java.lang.Math.max(r8, r5)
                goto L_0x019f
            L_0x019e:
                r8 = r5
            L_0x019f:
                int r9 = r1.f9162n
                if (r9 <= 0) goto L_0x01a7
                int r8 = java.lang.Math.min(r9, r8)
            L_0x01a7:
                int r9 = r1.f9164p
                if (r9 <= 0) goto L_0x01b0
                int r9 = java.lang.Math.max(r9, r10)
                goto L_0x01b1
            L_0x01b0:
                r9 = r10
            L_0x01b1:
                int r0 = r1.f9165q
                if (r0 <= 0) goto L_0x01b9
                int r9 = java.lang.Math.min(r0, r9)
            L_0x01b9:
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r13 == 0) goto L_0x01c7
                if (r4 == 0) goto L_0x01c7
                float r3 = r1.f9131L
                float r4 = (float) r9
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r8 = (int) r4
                goto L_0x01d1
            L_0x01c7:
                if (r12 == 0) goto L_0x01d1
                if (r3 == 0) goto L_0x01d1
                float r3 = r1.f9131L
                float r4 = (float) r8
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r9 = (int) r4
            L_0x01d1:
                if (r5 != r8) goto L_0x01d8
                if (r10 == r9) goto L_0x01d6
                goto L_0x01d8
            L_0x01d6:
                r0 = -1
                goto L_0x01f6
            L_0x01d8:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r5 == r8) goto L_0x01e0
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L_0x01e0:
                if (r10 == r9) goto L_0x01e6
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r0)
            L_0x01e6:
                r15.measure(r6, r7)
                int r8 = r15.getMeasuredWidth()
                int r9 = r15.getMeasuredHeight()
                int r11 = r15.getBaseline()
                goto L_0x01d6
            L_0x01f6:
                if (r11 == r0) goto L_0x01fa
                r0 = 1
                goto L_0x01fb
            L_0x01fa:
                r0 = 0
            L_0x01fb:
                int r3 = r2.f9259c
                if (r8 != r3) goto L_0x0206
                int r3 = r2.f9260d
                if (r9 == r3) goto L_0x0204
                goto L_0x0206
            L_0x0204:
                r5 = 0
                goto L_0x0207
            L_0x0206:
                r5 = 1
            L_0x0207:
                r2.f9265i = r5
                boolean r3 = r14.f1364X
                if (r3 == 0) goto L_0x020e
                r0 = 1
            L_0x020e:
                if (r0 == 0) goto L_0x021c
                r3 = -1
                if (r11 == r3) goto L_0x021c
                int r1 = r18.mo10427c()
                if (r1 == r11) goto L_0x021c
                r1 = 1
                r2.f9265i = r1
            L_0x021c:
                r2.f9261e = r8
                r2.f9262f = r9
                r2.f9264h = r0
                r2.f9263g = r11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0308c.mo1998a(f.f.b.j.e, f.f.b.j.n.b$a):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        m1597a((AttributeSet) null, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1597a(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1597a(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1597a(attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m1596a() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C3196e a = mo1961a(getChildAt(i));
            if (a != null) {
                a.mo10399E();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    mo1964a(0, (Object) resourceName, (Object) Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m1600c(childAt.getId()).mo10414a(resourceName);
                } catch (NotFoundException unused) {
                }
            }
        }
        if (this.f1332r != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.f1332r && (childAt2 instanceof C0322e)) {
                    this.f1330p = ((C0322e) childAt2).getConstraintSet();
                }
            }
        }
        C0316d dVar = this.f1330p;
        if (dVar != null) {
            dVar.mo2013a(this, true);
        }
        this.f1323i.mo10543I();
        int size = this.f1321g.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((C0312b) this.f1321g.get(i4)).mo2003c(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C0326h) {
                ((C0326h) childAt3).mo2038b(this);
            }
        }
        this.f1336v.clear();
        this.f1336v.put(0, this.f1323i);
        this.f1336v.put(getId(), this.f1323i);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.f1336v.put(childAt4.getId(), mo1961a(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            C3196e a2 = mo1961a(childAt5);
            if (a2 != null) {
                C0306b bVar = (C0306b) childAt5.getLayoutParams();
                this.f1323i.mo10544a(a2);
                mo1967a(isInEditMode, childAt5, a2, bVar, this.f1336v);
            }
        }
    }

    /* renamed from: a */
    private void m1597a(AttributeSet attributeSet, int i, int i2) {
        this.f1323i.mo10413a((Object) this);
        this.f1323i.mo10486a(this.f1337w);
        this.f1320f.put(getId(), this);
        this.f1330p = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0328j.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0328j.ConstraintLayout_Layout_android_minWidth) {
                    this.f1324j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1324j);
                } else if (index == C0328j.ConstraintLayout_Layout_android_minHeight) {
                    this.f1325k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1325k);
                } else if (index == C0328j.ConstraintLayout_Layout_android_maxWidth) {
                    this.f1326l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1326l);
                } else if (index == C0328j.ConstraintLayout_Layout_android_maxHeight) {
                    this.f1327m = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1327m);
                } else if (index == C0328j.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f1329o = obtainStyledAttributes.getInt(index, this.f1329o);
                } else if (index == C0328j.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo1969b(resourceId);
                        } catch (NotFoundException unused) {
                            this.f1331q = null;
                        }
                    }
                } else if (index == C0328j.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0316d dVar = new C0316d();
                        this.f1330p = dVar;
                        dVar.mo2015b(getContext(), resourceId2);
                    } catch (NotFoundException unused2) {
                        this.f1330p = null;
                    }
                    this.f1332r = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1323i.mo10492t(this.f1329o);
    }

    /* renamed from: b */
    private boolean m1599b() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.f1322h.clear();
            m1596a();
        }
        return z;
    }

    /* renamed from: c */
    private final C3196e m1600c(int i) {
        if (i == 0) {
            return this.f1323i;
        }
        View view = (View) this.f1320f.get(i);
        if (view == null) {
            view = findViewById(i);
            if (!(view == null || view == this || view.getParent() != this)) {
                onViewAdded(view);
            }
        }
        if (view == this) {
            return this.f1323i;
        }
        return view == null ? null : ((C0306b) view.getLayoutParams()).f1392m0;
    }

    /* renamed from: a */
    public View mo1960a(int i) {
        return (View) this.f1320f.get(i);
    }

    /* renamed from: a */
    public final C3196e mo1961a(View view) {
        if (view == this) {
            return this.f1323i;
        }
        return view == null ? null : ((C0306b) view.getLayoutParams()).f1392m0;
    }

    /* renamed from: a */
    public Object mo1962a(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f1333s;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.f1333s.get(str);
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1963a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int paddingLeft = i3 + getPaddingLeft() + getPaddingRight();
        int paddingTop = i4 + getPaddingTop() + getPaddingBottom();
        if (VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = ViewGroup.resolveSizeAndState(paddingTop, i2, 0) & 16777215;
            int min = Math.min(this.f1326l, ViewGroup.resolveSizeAndState(paddingLeft, i, 0) & 16777215);
            int min2 = Math.min(this.f1327m, resolveSizeAndState);
            if (z) {
                min |= 16777216;
            }
            if (z2) {
                min2 |= 16777216;
            }
            setMeasuredDimension(min, min2);
            this.f1334t = min;
            this.f1335u = min2;
            return;
        }
        setMeasuredDimension(paddingLeft, paddingTop);
        this.f1334t = paddingLeft;
        this.f1335u = paddingTop;
    }

    /* renamed from: a */
    public void mo1964a(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1333s == null) {
                this.f1333s = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1333s.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1965a(C3199f fVar, int i, int i2, int i3) {
        int i4;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i3);
        int size2 = MeasureSpec.getSize(i3);
        int paddingTop = getPaddingTop();
        int paddingBottom = paddingTop + getPaddingBottom();
        int i5 = 0;
        if (VERSION.SDK_INT >= 17) {
            int paddingStart = getPaddingStart();
            int i6 = paddingStart;
            i5 = getPaddingEnd() + paddingStart;
            i4 = i6;
        } else {
            i4 = 0;
        }
        if (i5 == 0) {
            i4 = getPaddingLeft();
            i5 = getPaddingRight() + i4;
        }
        int i7 = i4;
        int i8 = size - i5;
        int i9 = size2 - paddingBottom;
        mo1966a(fVar, mode, i8, mode2, i9);
        fVar.mo10483a(i, mode, i8, mode2, i9, this.f1334t, this.f1335u, i7, paddingTop);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1966a(C3199f fVar, int i, int i2, int i3, int i4) {
        C3198b bVar;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        C3198b bVar2 = C3198b.FIXED;
        if (i != Integer.MIN_VALUE) {
            if (i == 0) {
                bVar = C3198b.WRAP_CONTENT;
            } else if (i != 1073741824) {
                bVar = bVar2;
            } else {
                i2 = Math.min(this.f1326l, i2);
                bVar = bVar2;
            }
            i2 = 0;
        } else {
            bVar = C3198b.WRAP_CONTENT;
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 == 0) {
                bVar2 = C3198b.WRAP_CONTENT;
            } else if (i3 == 1073741824) {
                i4 = Math.min(this.f1327m, i4);
            }
            i4 = 0;
        } else {
            bVar2 = C3198b.WRAP_CONTENT;
        }
        if (!(i2 == fVar.mo10471y() && i4 == fVar.mo10444i())) {
            fVar.mo10478N();
        }
        fVar.mo10461q(0);
        fVar.mo10463r(0);
        fVar.mo10449k(this.f1326l);
        fVar.mo10447j(this.f1327m);
        fVar.mo10453m(0);
        fVar.mo10451l(0);
        fVar.mo10411a(bVar);
        fVar.mo10459p(i2);
        fVar.mo10423b(bVar2);
        fVar.mo10443h(i4);
        fVar.mo10453m(this.f1324j - paddingLeft);
        fVar.mo10451l(this.f1325k - paddingTop);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x019e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1967a(boolean r20, android.view.View r21, p071f.p089f.p093b.p094j.C3196e r22, androidx.constraintlayout.widget.ConstraintLayout.C0306b r23, android.util.SparseArray<p071f.p089f.p093b.p094j.C3196e> r24) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r23.mo1995a()
            r10 = 0
            r8.f1394n0 = r10
            int r2 = r21.getVisibility()
            r7.mo10457o(r2)
            boolean r2 = r8.f1368a0
            r11 = 1
            if (r2 == 0) goto L_0x0024
            r7.mo10426b(r11)
            r2 = 8
            r7.mo10457o(r2)
        L_0x0024:
            r7.mo10413a(r1)
            boolean r2 = r8.f1363W
            if (r2 == 0) goto L_0x002f
            boolean r2 = r8.f1362V
            if (r2 != 0) goto L_0x0034
        L_0x002f:
            java.util.ArrayList<f.f.b.j.e> r2 = r0.f1322h
            r2.add(r7)
        L_0x0034:
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.C0312b
            if (r2 == 0) goto L_0x0043
            androidx.constraintlayout.widget.b r1 = (androidx.constraintlayout.widget.C0312b) r1
            f.f.b.j.f r2 = r0.f1323i
            boolean r2 = r2.mo10480P()
            r1.mo1930a(r7, r2)
        L_0x0043:
            boolean r1 = r8.f1365Y
            r2 = 17
            r12 = -1
            if (r1 == 0) goto L_0x0076
            r1 = r7
            f.f.b.j.h r1 = (p071f.p089f.p093b.p094j.C3202h) r1
            int r3 = r8.f1386j0
            int r4 = r8.f1388k0
            float r5 = r8.f1390l0
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 >= r2) goto L_0x005d
            int r3 = r8.f1367a
            int r4 = r8.f1369b
            float r5 = r8.f1371c
        L_0x005d:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0068
            r1.mo10523e(r5)
            goto L_0x02bf
        L_0x0068:
            if (r3 == r12) goto L_0x006f
            r1.mo10378s(r3)
            goto L_0x02bf
        L_0x006f:
            if (r4 == r12) goto L_0x02bf
            r1.mo10524t(r4)
            goto L_0x02bf
        L_0x0076:
            int r1 = r8.f1372c0
            int r3 = r8.f1374d0
            int r4 = r8.f1376e0
            int r5 = r8.f1378f0
            int r6 = r8.f1380g0
            int r13 = r8.f1382h0
            float r14 = r8.f1384i0
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 >= r2) goto L_0x00be
            int r1 = r8.f1373d
            int r2 = r8.f1375e
            int r4 = r8.f1377f
            int r5 = r8.f1379g
            int r3 = r8.f1400t
            int r6 = r8.f1402v
            float r14 = r8.f1406z
            if (r1 != r12) goto L_0x00a5
            if (r2 != r12) goto L_0x00a5
            int r13 = r8.f1397q
            if (r13 == r12) goto L_0x00a0
            r1 = r13
            goto L_0x00a5
        L_0x00a0:
            int r13 = r8.f1396p
            if (r13 == r12) goto L_0x00a5
            r2 = r13
        L_0x00a5:
            if (r4 != r12) goto L_0x00b9
            if (r5 != r12) goto L_0x00b9
            int r13 = r8.f1398r
            if (r13 == r12) goto L_0x00ae
            goto L_0x00ba
        L_0x00ae:
            int r13 = r8.f1399s
            if (r13 == r12) goto L_0x00b9
            r15 = r6
            r5 = r14
            r6 = r3
            r14 = r13
            r3 = r2
            r13 = r4
            goto L_0x00c5
        L_0x00b9:
            r13 = r4
        L_0x00ba:
            r15 = r6
            r6 = r3
            r3 = r2
            goto L_0x00c0
        L_0x00be:
            r15 = r13
            r13 = r4
        L_0x00c0:
            r18 = r14
            r14 = r5
            r5 = r18
        L_0x00c5:
            int r2 = r8.f1391m
            if (r2 == r12) goto L_0x00da
            java.lang.Object r1 = r9.get(r2)
            f.f.b.j.e r1 = (p071f.p089f.p093b.p094j.C3196e) r1
            if (r1 == 0) goto L_0x0200
            float r2 = r8.f1395o
            int r3 = r8.f1393n
            r7.mo10412a(r1, r2, r3)
            goto L_0x0200
        L_0x00da:
            if (r1 == r12) goto L_0x00f6
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            f.f.b.j.e r3 = (p071f.p089f.p093b.p094j.C3196e) r3
            if (r3 == 0) goto L_0x00f3
            f.f.b.j.d$b r4 = p071f.p089f.p093b.p094j.C3193d.C3195b.LEFT
            int r2 = r8.leftMargin
            r1 = r22
            r16 = r2
            r2 = r4
            r17 = r5
            r5 = r16
            goto L_0x010b
        L_0x00f3:
            r17 = r5
            goto L_0x010e
        L_0x00f6:
            r17 = r5
            if (r3 == r12) goto L_0x010e
            java.lang.Object r1 = r9.get(r3)
            r3 = r1
            f.f.b.j.e r3 = (p071f.p089f.p093b.p094j.C3196e) r3
            if (r3 == 0) goto L_0x010e
            f.f.b.j.d$b r2 = p071f.p089f.p093b.p094j.C3193d.C3195b.LEFT
            f.f.b.j.d$b r4 = p071f.p089f.p093b.p094j.C3193d.C3195b.RIGHT
            int r5 = r8.leftMargin
            r1 = r22
        L_0x010b:
            r1.mo10409a(r2, r3, r4, r5, r6)
        L_0x010e:
            if (r13 == r12) goto L_0x0122
            java.lang.Object r1 = r9.get(r13)
            r3 = r1
            f.f.b.j.e r3 = (p071f.p089f.p093b.p094j.C3196e) r3
            if (r3 == 0) goto L_0x0138
            f.f.b.j.d$b r2 = p071f.p089f.p093b.p094j.C3193d.C3195b.RIGHT
            f.f.b.j.d$b r4 = p071f.p089f.p093b.p094j.C3193d.C3195b.LEFT
            int r5 = r8.rightMargin
            r1 = r22
            goto L_0x0134
        L_0x0122:
            if (r14 == r12) goto L_0x0138
            java.lang.Object r1 = r9.get(r14)
            r3 = r1
            f.f.b.j.e r3 = (p071f.p089f.p093b.p094j.C3196e) r3
            if (r3 == 0) goto L_0x0138
            f.f.b.j.d$b r4 = p071f.p089f.p093b.p094j.C3193d.C3195b.RIGHT
            int r5 = r8.rightMargin
            r1 = r22
            r2 = r4
        L_0x0134:
            r6 = r15
            r1.mo10409a(r2, r3, r4, r5, r6)
        L_0x0138:
            int r1 = r8.f1381h
            if (r1 == r12) goto L_0x014f
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            f.f.b.j.e r3 = (p071f.p089f.p093b.p094j.C3196e) r3
            if (r3 == 0) goto L_0x0169
            f.f.b.j.d$b r4 = p071f.p089f.p093b.p094j.C3193d.C3195b.TOP
            int r5 = r8.topMargin
            int r6 = r8.f1401u
            r1 = r22
            r2 = r4
            goto L_0x0166
        L_0x014f:
            int r1 = r8.f1383i
            if (r1 == r12) goto L_0x0169
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            f.f.b.j.e r3 = (p071f.p089f.p093b.p094j.C3196e) r3
            if (r3 == 0) goto L_0x0169
            f.f.b.j.d$b r2 = p071f.p089f.p093b.p094j.C3193d.C3195b.TOP
            f.f.b.j.d$b r4 = p071f.p089f.p093b.p094j.C3193d.C3195b.BOTTOM
            int r5 = r8.topMargin
            int r6 = r8.f1401u
            r1 = r22
        L_0x0166:
            r1.mo10409a(r2, r3, r4, r5, r6)
        L_0x0169:
            int r1 = r8.f1385j
            if (r1 == r12) goto L_0x0181
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            f.f.b.j.e r3 = (p071f.p089f.p093b.p094j.C3196e) r3
            if (r3 == 0) goto L_0x019a
            f.f.b.j.d$b r2 = p071f.p089f.p093b.p094j.C3193d.C3195b.BOTTOM
            f.f.b.j.d$b r4 = p071f.p089f.p093b.p094j.C3193d.C3195b.TOP
            int r5 = r8.bottomMargin
            int r6 = r8.f1403w
            r1 = r22
            goto L_0x0197
        L_0x0181:
            int r1 = r8.f1387k
            if (r1 == r12) goto L_0x019a
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            f.f.b.j.e r3 = (p071f.p089f.p093b.p094j.C3196e) r3
            if (r3 == 0) goto L_0x019a
            f.f.b.j.d$b r4 = p071f.p089f.p093b.p094j.C3193d.C3195b.BOTTOM
            int r5 = r8.bottomMargin
            int r6 = r8.f1403w
            r1 = r22
            r2 = r4
        L_0x0197:
            r1.mo10409a(r2, r3, r4, r5, r6)
        L_0x019a:
            int r1 = r8.f1389l
            if (r1 == r12) goto L_0x01ed
            android.util.SparseArray<android.view.View> r2 = r0.f1320f
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r8.f1389l
            java.lang.Object r2 = r9.get(r2)
            f.f.b.j.e r2 = (p071f.p089f.p093b.p094j.C3196e) r2
            if (r2 == 0) goto L_0x01ed
            if (r1 == 0) goto L_0x01ed
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0306b
            if (r3 == 0) goto L_0x01ed
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$b r1 = (androidx.constraintlayout.widget.ConstraintLayout.C0306b) r1
            r8.f1364X = r11
            r1.f1364X = r11
            f.f.b.j.d$b r3 = p071f.p089f.p093b.p094j.C3193d.C3195b.BASELINE
            f.f.b.j.d r3 = r7.mo10402a(r3)
            f.f.b.j.d$b r4 = p071f.p089f.p093b.p094j.C3193d.C3195b.BASELINE
            f.f.b.j.d r2 = r2.mo10402a(r4)
            r3.mo10386a(r2, r10, r12, r11)
            r7.mo10415a(r11)
            f.f.b.j.e r1 = r1.f1392m0
            r1.mo10415a(r11)
            f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.TOP
            f.f.b.j.d r1 = r7.mo10402a(r1)
            r1.mo10393h()
            f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.BOTTOM
            f.f.b.j.d r1 = r7.mo10402a(r1)
            r1.mo10393h()
        L_0x01ed:
            r1 = 0
            r14 = r17
            int r2 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x01f7
            r7.mo10403a(r14)
        L_0x01f7:
            float r2 = r8.f1341A
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0200
            r7.mo10429c(r2)
        L_0x0200:
            if (r20 == 0) goto L_0x0211
            int r1 = r8.f1356P
            if (r1 != r12) goto L_0x020a
            int r1 = r8.f1357Q
            if (r1 == r12) goto L_0x0211
        L_0x020a:
            int r1 = r8.f1356P
            int r2 = r8.f1357Q
            r7.mo10420b(r1, r2)
        L_0x0211:
            boolean r1 = r8.f1362V
            r2 = -2
            if (r1 != 0) goto L_0x023d
            int r1 = r8.width
            if (r1 != r12) goto L_0x0234
            f.f.b.j.e$b r1 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_PARENT
            r7.mo10411a(r1)
            f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.LEFT
            f.f.b.j.d r1 = r7.mo10402a(r1)
            int r3 = r8.leftMargin
            r1.f9105d = r3
            f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.RIGHT
            f.f.b.j.d r1 = r7.mo10402a(r1)
            int r3 = r8.rightMargin
            r1.f9105d = r3
            goto L_0x0250
        L_0x0234:
            f.f.b.j.e$b r1 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            r7.mo10411a(r1)
            r7.mo10459p(r10)
            goto L_0x0250
        L_0x023d:
            f.f.b.j.e$b r1 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            r7.mo10411a(r1)
            int r1 = r8.width
            r7.mo10459p(r1)
            int r1 = r8.width
            if (r1 != r2) goto L_0x0250
            f.f.b.j.e$b r1 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            r7.mo10411a(r1)
        L_0x0250:
            boolean r1 = r8.f1363W
            if (r1 != 0) goto L_0x027b
            int r1 = r8.height
            if (r1 != r12) goto L_0x0272
            f.f.b.j.e$b r1 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_PARENT
            r7.mo10423b(r1)
            f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.TOP
            f.f.b.j.d r1 = r7.mo10402a(r1)
            int r2 = r8.topMargin
            r1.f9105d = r2
            f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.BOTTOM
            f.f.b.j.d r1 = r7.mo10402a(r1)
            int r2 = r8.bottomMargin
            r1.f9105d = r2
            goto L_0x028e
        L_0x0272:
            f.f.b.j.e$b r1 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            r7.mo10423b(r1)
            r7.mo10443h(r10)
            goto L_0x028e
        L_0x027b:
            f.f.b.j.e$b r1 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            r7.mo10423b(r1)
            int r1 = r8.height
            r7.mo10443h(r1)
            int r1 = r8.height
            if (r1 != r2) goto L_0x028e
            f.f.b.j.e$b r1 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            r7.mo10423b(r1)
        L_0x028e:
            java.lang.String r1 = r8.f1342B
            if (r1 == 0) goto L_0x0295
            r7.mo10425b(r1)
        L_0x0295:
            float r1 = r8.f1344D
            r7.mo10419b(r1)
            float r1 = r8.f1345E
            r7.mo10435d(r1)
            int r1 = r8.f1346F
            r7.mo10445i(r1)
            int r1 = r8.f1347G
            r7.mo10455n(r1)
            int r1 = r8.f1348H
            int r2 = r8.f1350J
            int r3 = r8.f1352L
            float r4 = r8.f1354N
            r7.mo10405a(r1, r2, r3, r4)
            int r1 = r8.f1349I
            int r2 = r8.f1351K
            int r3 = r8.f1353M
            float r4 = r8.f1355O
            r7.mo10421b(r1, r2, r3, r4)
        L_0x02bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo1967a(boolean, android.view.View, f.f.b.j.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1969b(int i) {
        this.f1331q = new C0313c(getContext(), this, i);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0306b;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                            int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f = (float) i2;
                            float f2 = (float) (i2 + parseInt3);
                            Canvas canvas2 = canvas;
                            float f3 = (float) i3;
                            float f4 = f;
                            float f5 = f;
                            float f6 = f3;
                            Paint paint2 = paint;
                            float f7 = f2;
                            Paint paint3 = paint2;
                            canvas2.drawLine(f4, f6, f7, f3, paint3);
                            float f8 = (float) (i3 + parseInt4);
                            float f9 = f2;
                            float f10 = f8;
                            canvas2.drawLine(f9, f6, f7, f10, paint3);
                            float f11 = f8;
                            float f12 = f5;
                            canvas2.drawLine(f9, f11, f12, f10, paint3);
                            float f13 = f5;
                            canvas2.drawLine(f13, f11, f12, f3, paint3);
                            Paint paint4 = paint2;
                            paint4.setColor(-16711936);
                            Paint paint5 = paint4;
                            float f14 = f2;
                            Paint paint6 = paint5;
                            canvas2.drawLine(f13, f3, f14, f8, paint6);
                            canvas2.drawLine(f13, f8, f14, f3, paint6);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public C0306b generateDefaultLayoutParams() {
        return new C0306b(-2, -2);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0306b(layoutParams);
    }

    public C0306b generateLayoutParams(AttributeSet attributeSet) {
        return new C0306b(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f1327m;
    }

    public int getMaxWidth() {
        return this.f1326l;
    }

    public int getMinHeight() {
        return this.f1325k;
    }

    public int getMinWidth() {
        return this.f1324j;
    }

    public int getOptimizationLevel() {
        return this.f1323i.mo10475K();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0306b bVar = (C0306b) childAt.getLayoutParams();
            C3196e eVar = bVar.f1392m0;
            if ((childAt.getVisibility() != 8 || bVar.f1365Y || bVar.f1366Z || bVar.f1370b0 || isInEditMode) && !bVar.f1368a0) {
                int z2 = eVar.mo10472z();
                int A = eVar.mo10395A();
                int y = eVar.mo10471y() + z2;
                int i6 = eVar.mo10444i() + A;
                childAt.layout(z2, A, y, i6);
                if (childAt instanceof C0326h) {
                    View content = ((C0326h) childAt).getContent();
                    if (content != null) {
                        content.setVisibility(0);
                        content.layout(z2, A, y, i6);
                    }
                }
            }
        }
        int size = this.f1321g.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((C0312b) this.f1321g.get(i7)).mo2001a(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f1338x = i;
        this.f1339y = i2;
        if (VERSION.SDK_INT >= 17) {
            boolean z = true;
            if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
                z = false;
            }
            this.f1323i.mo10491f(z);
        }
        if (this.f1328n) {
            this.f1328n = false;
            if (m1599b()) {
                this.f1323i.mo10482R();
            }
        }
        mo1965a(this.f1323i, this.f1329o, i, i2);
        mo1963a(i, i2, this.f1323i.mo10471y(), this.f1323i.mo10444i(), this.f1323i.mo10481Q(), this.f1323i.mo10479O());
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C3196e a = mo1961a(view);
        if ((view instanceof C0325g) && !(a instanceof C3202h)) {
            C0306b bVar = (C0306b) view.getLayoutParams();
            C3202h hVar = new C3202h();
            bVar.f1392m0 = hVar;
            bVar.f1365Y = true;
            hVar.mo10525u(bVar.f1358R);
        }
        if (view instanceof C0312b) {
            C0312b bVar2 = (C0312b) view;
            bVar2.mo2000a();
            ((C0306b) view.getLayoutParams()).f1366Z = true;
            if (!this.f1321g.contains(bVar2)) {
                this.f1321g.add(bVar2);
            }
        }
        this.f1320f.put(view.getId(), view);
        this.f1328n = true;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f1320f.remove(view.getId());
        C3196e a = mo1961a(view);
        this.f1323i.mo10545c(a);
        this.f1321g.remove(view);
        this.f1322h.remove(a);
        this.f1328n = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f1328n = true;
        this.f1334t = -1;
        this.f1335u = -1;
    }

    public void setConstraintSet(C0316d dVar) {
        this.f1330p = dVar;
    }

    public void setId(int i) {
        this.f1320f.remove(getId());
        super.setId(i);
        this.f1320f.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f1327m) {
            this.f1327m = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f1326l) {
            this.f1326l = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f1325k) {
            this.f1325k = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f1324j) {
            this.f1324j = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C0324f fVar) {
        C0313c cVar = this.f1331q;
        if (cVar != null) {
            cVar.mo2008a(fVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f1329o = i;
        this.f1323i.mo10492t(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
