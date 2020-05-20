package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.C0322e.C0323a;
import androidx.constraintlayout.widget.ConstraintLayout.C0306b;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p071f.p089f.p090a.p091a.C3177a;
import p071f.p089f.p090a.p092b.C3178a;

/* renamed from: androidx.constraintlayout.widget.d */
public class C0316d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final int[] f1444d = {0, 4, 8};

    /* renamed from: e */
    private static SparseIntArray f1445e;

    /* renamed from: a */
    private HashMap<String, C0309a> f1446a = new HashMap<>();

    /* renamed from: b */
    private boolean f1447b = true;

    /* renamed from: c */
    private HashMap<Integer, C0317a> f1448c = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.d$a */
    public static class C0317a {

        /* renamed from: a */
        int f1449a;

        /* renamed from: b */
        public final C0320d f1450b = new C0320d();

        /* renamed from: c */
        public final C0319c f1451c = new C0319c();

        /* renamed from: d */
        public final C0318b f1452d = new C0318b();

        /* renamed from: e */
        public final C0321e f1453e = new C0321e();

        /* renamed from: f */
        public HashMap<String, C0309a> f1454f = new HashMap<>();

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m1643a(int i, C0306b bVar) {
            this.f1449a = i;
            C0318b bVar2 = this.f1452d;
            bVar2.f1496h = bVar.f1373d;
            bVar2.f1498i = bVar.f1375e;
            bVar2.f1500j = bVar.f1377f;
            bVar2.f1502k = bVar.f1379g;
            bVar2.f1503l = bVar.f1381h;
            bVar2.f1504m = bVar.f1383i;
            bVar2.f1505n = bVar.f1385j;
            bVar2.f1506o = bVar.f1387k;
            bVar2.f1507p = bVar.f1389l;
            bVar2.f1508q = bVar.f1396p;
            bVar2.f1509r = bVar.f1397q;
            bVar2.f1510s = bVar.f1398r;
            bVar2.f1511t = bVar.f1399s;
            bVar2.f1512u = bVar.f1406z;
            bVar2.f1513v = bVar.f1341A;
            bVar2.f1514w = bVar.f1342B;
            bVar2.f1515x = bVar.f1391m;
            bVar2.f1516y = bVar.f1393n;
            bVar2.f1517z = bVar.f1395o;
            bVar2.f1456A = bVar.f1356P;
            bVar2.f1457B = bVar.f1357Q;
            bVar2.f1458C = bVar.f1358R;
            bVar2.f1494g = bVar.f1371c;
            bVar2.f1490e = bVar.f1367a;
            bVar2.f1492f = bVar.f1369b;
            bVar2.f1486c = bVar.width;
            bVar2.f1488d = bVar.height;
            bVar2.f1459D = bVar.leftMargin;
            bVar2.f1460E = bVar.rightMargin;
            bVar2.f1461F = bVar.topMargin;
            bVar2.f1462G = bVar.bottomMargin;
            bVar2.f1471P = bVar.f1345E;
            bVar2.f1472Q = bVar.f1344D;
            bVar2.f1474S = bVar.f1347G;
            bVar2.f1473R = bVar.f1346F;
            bVar2.f1497h0 = bVar.f1359S;
            bVar2.f1499i0 = bVar.f1360T;
            bVar2.f1475T = bVar.f1348H;
            bVar2.f1476U = bVar.f1349I;
            bVar2.f1477V = bVar.f1352L;
            bVar2.f1478W = bVar.f1353M;
            bVar2.f1479X = bVar.f1350J;
            bVar2.f1480Y = bVar.f1351K;
            bVar2.f1481Z = bVar.f1354N;
            bVar2.f1483a0 = bVar.f1355O;
            bVar2.f1495g0 = bVar.f1361U;
            bVar2.f1466K = bVar.f1401u;
            bVar2.f1468M = bVar.f1403w;
            bVar2.f1465J = bVar.f1400t;
            bVar2.f1467L = bVar.f1402v;
            bVar2.f1470O = bVar.f1404x;
            bVar2.f1469N = bVar.f1405y;
            if (VERSION.SDK_INT >= 17) {
                bVar2.f1463H = bVar.getMarginEnd();
                this.f1452d.f1464I = bVar.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m1644a(int i, C0323a aVar) {
            m1643a(i, (C0306b) aVar);
            this.f1450b.f1529d = aVar.f1547o0;
            C0321e eVar = this.f1453e;
            eVar.f1533b = aVar.f1550r0;
            eVar.f1534c = aVar.f1551s0;
            eVar.f1535d = aVar.f1552t0;
            eVar.f1536e = aVar.f1553u0;
            eVar.f1537f = aVar.f1554v0;
            eVar.f1538g = aVar.f1555w0;
            eVar.f1539h = aVar.f1556x0;
            eVar.f1540i = aVar.f1557y0;
            eVar.f1541j = aVar.f1558z0;
            eVar.f1542k = aVar.f1546A0;
            eVar.f1544m = aVar.f1549q0;
            eVar.f1543l = aVar.f1548p0;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m1645a(C0312b bVar, int i, C0323a aVar) {
            m1644a(i, aVar);
            if (bVar instanceof Barrier) {
                C0318b bVar2 = this.f1452d;
                bVar2.f1489d0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f1485b0 = barrier.getType();
                this.f1452d.f1491e0 = barrier.getReferencedIds();
                this.f1452d.f1487c0 = barrier.getMargin();
            }
        }

        /* renamed from: a */
        public void mo2016a(C0306b bVar) {
            C0318b bVar2 = this.f1452d;
            bVar.f1373d = bVar2.f1496h;
            bVar.f1375e = bVar2.f1498i;
            bVar.f1377f = bVar2.f1500j;
            bVar.f1379g = bVar2.f1502k;
            bVar.f1381h = bVar2.f1503l;
            bVar.f1383i = bVar2.f1504m;
            bVar.f1385j = bVar2.f1505n;
            bVar.f1387k = bVar2.f1506o;
            bVar.f1389l = bVar2.f1507p;
            bVar.f1396p = bVar2.f1508q;
            bVar.f1397q = bVar2.f1509r;
            bVar.f1398r = bVar2.f1510s;
            bVar.f1399s = bVar2.f1511t;
            bVar.leftMargin = bVar2.f1459D;
            bVar.rightMargin = bVar2.f1460E;
            bVar.topMargin = bVar2.f1461F;
            bVar.bottomMargin = bVar2.f1462G;
            bVar.f1404x = bVar2.f1470O;
            bVar.f1405y = bVar2.f1469N;
            bVar.f1401u = bVar2.f1466K;
            bVar.f1403w = bVar2.f1468M;
            bVar.f1406z = bVar2.f1512u;
            bVar.f1341A = bVar2.f1513v;
            bVar.f1391m = bVar2.f1515x;
            bVar.f1393n = bVar2.f1516y;
            bVar.f1395o = bVar2.f1517z;
            bVar.f1342B = bVar2.f1514w;
            bVar.f1356P = bVar2.f1456A;
            bVar.f1357Q = bVar2.f1457B;
            bVar.f1345E = bVar2.f1471P;
            bVar.f1344D = bVar2.f1472Q;
            bVar.f1347G = bVar2.f1474S;
            bVar.f1346F = bVar2.f1473R;
            bVar.f1359S = bVar2.f1497h0;
            bVar.f1360T = bVar2.f1499i0;
            bVar.f1348H = bVar2.f1475T;
            bVar.f1349I = bVar2.f1476U;
            bVar.f1352L = bVar2.f1477V;
            bVar.f1353M = bVar2.f1478W;
            bVar.f1350J = bVar2.f1479X;
            bVar.f1351K = bVar2.f1480Y;
            bVar.f1354N = bVar2.f1481Z;
            bVar.f1355O = bVar2.f1483a0;
            bVar.f1358R = bVar2.f1458C;
            bVar.f1371c = bVar2.f1494g;
            bVar.f1367a = bVar2.f1490e;
            bVar.f1369b = bVar2.f1492f;
            bVar.width = bVar2.f1486c;
            bVar.height = bVar2.f1488d;
            String str = bVar2.f1495g0;
            if (str != null) {
                bVar.f1361U = str;
            }
            if (VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(this.f1452d.f1464I);
                bVar.setMarginEnd(this.f1452d.f1463H);
            }
            bVar.mo1995a();
        }

        public C0317a clone() {
            C0317a aVar = new C0317a();
            aVar.f1452d.mo2019a(this.f1452d);
            aVar.f1451c.mo2021a(this.f1451c);
            aVar.f1450b.mo2023a(this.f1450b);
            aVar.f1453e.mo2025a(this.f1453e);
            aVar.f1449a = this.f1449a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$b */
    public static class C0318b {

        /* renamed from: k0 */
        private static SparseIntArray f1455k0;

        /* renamed from: A */
        public int f1456A = -1;

        /* renamed from: B */
        public int f1457B = -1;

        /* renamed from: C */
        public int f1458C = -1;

        /* renamed from: D */
        public int f1459D = -1;

        /* renamed from: E */
        public int f1460E = -1;

        /* renamed from: F */
        public int f1461F = -1;

        /* renamed from: G */
        public int f1462G = -1;

        /* renamed from: H */
        public int f1463H = -1;

        /* renamed from: I */
        public int f1464I = -1;

        /* renamed from: J */
        public int f1465J = -1;

        /* renamed from: K */
        public int f1466K = -1;

        /* renamed from: L */
        public int f1467L = -1;

        /* renamed from: M */
        public int f1468M = -1;

        /* renamed from: N */
        public int f1469N = -1;

        /* renamed from: O */
        public int f1470O = -1;

        /* renamed from: P */
        public float f1471P = -1.0f;

        /* renamed from: Q */
        public float f1472Q = -1.0f;

        /* renamed from: R */
        public int f1473R = 0;

        /* renamed from: S */
        public int f1474S = 0;

        /* renamed from: T */
        public int f1475T = 0;

        /* renamed from: U */
        public int f1476U = 0;

        /* renamed from: V */
        public int f1477V = -1;

        /* renamed from: W */
        public int f1478W = -1;

        /* renamed from: X */
        public int f1479X = -1;

        /* renamed from: Y */
        public int f1480Y = -1;

        /* renamed from: Z */
        public float f1481Z = 1.0f;

        /* renamed from: a */
        public boolean f1482a = false;

        /* renamed from: a0 */
        public float f1483a0 = 1.0f;

        /* renamed from: b */
        public boolean f1484b = false;

        /* renamed from: b0 */
        public int f1485b0 = -1;

        /* renamed from: c */
        public int f1486c;

        /* renamed from: c0 */
        public int f1487c0 = 0;

        /* renamed from: d */
        public int f1488d;

        /* renamed from: d0 */
        public int f1489d0 = -1;

        /* renamed from: e */
        public int f1490e = -1;

        /* renamed from: e0 */
        public int[] f1491e0;

        /* renamed from: f */
        public int f1492f = -1;

        /* renamed from: f0 */
        public String f1493f0;

        /* renamed from: g */
        public float f1494g = -1.0f;

        /* renamed from: g0 */
        public String f1495g0;

        /* renamed from: h */
        public int f1496h = -1;

        /* renamed from: h0 */
        public boolean f1497h0 = false;

        /* renamed from: i */
        public int f1498i = -1;

        /* renamed from: i0 */
        public boolean f1499i0 = false;

        /* renamed from: j */
        public int f1500j = -1;

        /* renamed from: j0 */
        public boolean f1501j0 = true;

        /* renamed from: k */
        public int f1502k = -1;

        /* renamed from: l */
        public int f1503l = -1;

        /* renamed from: m */
        public int f1504m = -1;

        /* renamed from: n */
        public int f1505n = -1;

        /* renamed from: o */
        public int f1506o = -1;

        /* renamed from: p */
        public int f1507p = -1;

        /* renamed from: q */
        public int f1508q = -1;

        /* renamed from: r */
        public int f1509r = -1;

        /* renamed from: s */
        public int f1510s = -1;

        /* renamed from: t */
        public int f1511t = -1;

        /* renamed from: u */
        public float f1512u = 0.5f;

        /* renamed from: v */
        public float f1513v = 0.5f;

        /* renamed from: w */
        public String f1514w = null;

        /* renamed from: x */
        public int f1515x = -1;

        /* renamed from: y */
        public int f1516y = 0;

        /* renamed from: z */
        public float f1517z = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1455k0 = sparseIntArray;
            sparseIntArray.append(C0328j.Layout_layout_constraintLeft_toLeftOf, 24);
            f1455k0.append(C0328j.Layout_layout_constraintLeft_toRightOf, 25);
            f1455k0.append(C0328j.Layout_layout_constraintRight_toLeftOf, 28);
            f1455k0.append(C0328j.Layout_layout_constraintRight_toRightOf, 29);
            f1455k0.append(C0328j.Layout_layout_constraintTop_toTopOf, 35);
            f1455k0.append(C0328j.Layout_layout_constraintTop_toBottomOf, 34);
            f1455k0.append(C0328j.Layout_layout_constraintBottom_toTopOf, 4);
            f1455k0.append(C0328j.Layout_layout_constraintBottom_toBottomOf, 3);
            f1455k0.append(C0328j.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f1455k0.append(C0328j.Layout_layout_editor_absoluteX, 6);
            f1455k0.append(C0328j.Layout_layout_editor_absoluteY, 7);
            f1455k0.append(C0328j.Layout_layout_constraintGuide_begin, 17);
            f1455k0.append(C0328j.Layout_layout_constraintGuide_end, 18);
            f1455k0.append(C0328j.Layout_layout_constraintGuide_percent, 19);
            f1455k0.append(C0328j.Layout_android_orientation, 26);
            f1455k0.append(C0328j.Layout_layout_constraintStart_toEndOf, 31);
            f1455k0.append(C0328j.Layout_layout_constraintStart_toStartOf, 32);
            f1455k0.append(C0328j.Layout_layout_constraintEnd_toStartOf, 10);
            f1455k0.append(C0328j.Layout_layout_constraintEnd_toEndOf, 9);
            f1455k0.append(C0328j.Layout_layout_goneMarginLeft, 13);
            f1455k0.append(C0328j.Layout_layout_goneMarginTop, 16);
            f1455k0.append(C0328j.Layout_layout_goneMarginRight, 14);
            f1455k0.append(C0328j.Layout_layout_goneMarginBottom, 11);
            f1455k0.append(C0328j.Layout_layout_goneMarginStart, 15);
            f1455k0.append(C0328j.Layout_layout_goneMarginEnd, 12);
            f1455k0.append(C0328j.Layout_layout_constraintVertical_weight, 38);
            f1455k0.append(C0328j.Layout_layout_constraintHorizontal_weight, 37);
            f1455k0.append(C0328j.Layout_layout_constraintHorizontal_chainStyle, 39);
            f1455k0.append(C0328j.Layout_layout_constraintVertical_chainStyle, 40);
            f1455k0.append(C0328j.Layout_layout_constraintHorizontal_bias, 20);
            f1455k0.append(C0328j.Layout_layout_constraintVertical_bias, 36);
            f1455k0.append(C0328j.Layout_layout_constraintDimensionRatio, 5);
            f1455k0.append(C0328j.Layout_layout_constraintLeft_creator, 76);
            f1455k0.append(C0328j.Layout_layout_constraintTop_creator, 76);
            f1455k0.append(C0328j.Layout_layout_constraintRight_creator, 76);
            f1455k0.append(C0328j.Layout_layout_constraintBottom_creator, 76);
            f1455k0.append(C0328j.Layout_layout_constraintBaseline_creator, 76);
            f1455k0.append(C0328j.Layout_android_layout_marginLeft, 23);
            f1455k0.append(C0328j.Layout_android_layout_marginRight, 27);
            f1455k0.append(C0328j.Layout_android_layout_marginStart, 30);
            f1455k0.append(C0328j.Layout_android_layout_marginEnd, 8);
            f1455k0.append(C0328j.Layout_android_layout_marginTop, 33);
            f1455k0.append(C0328j.Layout_android_layout_marginBottom, 2);
            f1455k0.append(C0328j.Layout_android_layout_width, 22);
            f1455k0.append(C0328j.Layout_android_layout_height, 21);
            f1455k0.append(C0328j.Layout_layout_constraintCircle, 61);
            f1455k0.append(C0328j.Layout_layout_constraintCircleRadius, 62);
            f1455k0.append(C0328j.Layout_layout_constraintCircleAngle, 63);
            f1455k0.append(C0328j.Layout_layout_constraintWidth_percent, 69);
            f1455k0.append(C0328j.Layout_layout_constraintHeight_percent, 70);
            f1455k0.append(C0328j.Layout_chainUseRtl, 71);
            f1455k0.append(C0328j.Layout_barrierDirection, 72);
            f1455k0.append(C0328j.Layout_barrierMargin, 73);
            f1455k0.append(C0328j.Layout_constraint_referenced_ids, 74);
            f1455k0.append(C0328j.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2018a(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0328j.Layout);
            this.f1484b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f1455k0.get(index);
                if (i2 == 80) {
                    this.f1497h0 = obtainStyledAttributes.getBoolean(index, this.f1497h0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f1507p = C0316d.m1636b(obtainStyledAttributes, index, this.f1507p);
                            break;
                        case 2:
                            this.f1462G = obtainStyledAttributes.getDimensionPixelSize(index, this.f1462G);
                            break;
                        case 3:
                            this.f1506o = C0316d.m1636b(obtainStyledAttributes, index, this.f1506o);
                            break;
                        case 4:
                            this.f1505n = C0316d.m1636b(obtainStyledAttributes, index, this.f1505n);
                            break;
                        case 5:
                            this.f1514w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f1456A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1456A);
                            break;
                        case 7:
                            this.f1457B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1457B);
                            break;
                        case 8:
                            this.f1463H = obtainStyledAttributes.getDimensionPixelSize(index, this.f1463H);
                            break;
                        case 9:
                            this.f1511t = C0316d.m1636b(obtainStyledAttributes, index, this.f1511t);
                            break;
                        case 10:
                            this.f1510s = C0316d.m1636b(obtainStyledAttributes, index, this.f1510s);
                            break;
                        case 11:
                            this.f1468M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1468M);
                            break;
                        case 12:
                            this.f1469N = obtainStyledAttributes.getDimensionPixelSize(index, this.f1469N);
                            break;
                        case 13:
                            this.f1465J = obtainStyledAttributes.getDimensionPixelSize(index, this.f1465J);
                            break;
                        case 14:
                            this.f1467L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1467L);
                            break;
                        case 15:
                            this.f1470O = obtainStyledAttributes.getDimensionPixelSize(index, this.f1470O);
                            break;
                        case 16:
                            this.f1466K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1466K);
                            break;
                        case 17:
                            this.f1490e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1490e);
                            break;
                        case 18:
                            this.f1492f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1492f);
                            break;
                        case 19:
                            this.f1494g = obtainStyledAttributes.getFloat(index, this.f1494g);
                            break;
                        case 20:
                            this.f1512u = obtainStyledAttributes.getFloat(index, this.f1512u);
                            break;
                        case 21:
                            this.f1488d = obtainStyledAttributes.getLayoutDimension(index, this.f1488d);
                            break;
                        case 22:
                            this.f1486c = obtainStyledAttributes.getLayoutDimension(index, this.f1486c);
                            break;
                        case 23:
                            this.f1459D = obtainStyledAttributes.getDimensionPixelSize(index, this.f1459D);
                            break;
                        case 24:
                            this.f1496h = C0316d.m1636b(obtainStyledAttributes, index, this.f1496h);
                            break;
                        case 25:
                            this.f1498i = C0316d.m1636b(obtainStyledAttributes, index, this.f1498i);
                            break;
                        case 26:
                            this.f1458C = obtainStyledAttributes.getInt(index, this.f1458C);
                            break;
                        case 27:
                            this.f1460E = obtainStyledAttributes.getDimensionPixelSize(index, this.f1460E);
                            break;
                        case 28:
                            this.f1500j = C0316d.m1636b(obtainStyledAttributes, index, this.f1500j);
                            break;
                        case 29:
                            this.f1502k = C0316d.m1636b(obtainStyledAttributes, index, this.f1502k);
                            break;
                        case 30:
                            this.f1464I = obtainStyledAttributes.getDimensionPixelSize(index, this.f1464I);
                            break;
                        case 31:
                            this.f1508q = C0316d.m1636b(obtainStyledAttributes, index, this.f1508q);
                            break;
                        case 32:
                            this.f1509r = C0316d.m1636b(obtainStyledAttributes, index, this.f1509r);
                            break;
                        case 33:
                            this.f1461F = obtainStyledAttributes.getDimensionPixelSize(index, this.f1461F);
                            break;
                        case 34:
                            this.f1504m = C0316d.m1636b(obtainStyledAttributes, index, this.f1504m);
                            break;
                        case 35:
                            this.f1503l = C0316d.m1636b(obtainStyledAttributes, index, this.f1503l);
                            break;
                        case 36:
                            this.f1513v = obtainStyledAttributes.getFloat(index, this.f1513v);
                            break;
                        case 37:
                            this.f1472Q = obtainStyledAttributes.getFloat(index, this.f1472Q);
                            break;
                        case 38:
                            this.f1471P = obtainStyledAttributes.getFloat(index, this.f1471P);
                            break;
                        case 39:
                            this.f1473R = obtainStyledAttributes.getInt(index, this.f1473R);
                            break;
                        case 40:
                            this.f1474S = obtainStyledAttributes.getInt(index, this.f1474S);
                            break;
                        default:
                            switch (i2) {
                                case 56:
                                    this.f1477V = obtainStyledAttributes.getDimensionPixelSize(index, this.f1477V);
                                    break;
                                case 57:
                                    this.f1478W = obtainStyledAttributes.getDimensionPixelSize(index, this.f1478W);
                                    break;
                                case 58:
                                    this.f1479X = obtainStyledAttributes.getDimensionPixelSize(index, this.f1479X);
                                    break;
                                case 59:
                                    this.f1480Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1480Y);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f1515x = C0316d.m1636b(obtainStyledAttributes, index, this.f1515x);
                                            break;
                                        case 62:
                                            this.f1516y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1516y);
                                            break;
                                        case 63:
                                            this.f1517z = obtainStyledAttributes.getFloat(index, this.f1517z);
                                            break;
                                        default:
                                            String str2 = "   ";
                                            String str3 = "ConstraintSet";
                                            switch (i2) {
                                                case 69:
                                                    this.f1481Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f1483a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e(str3, "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f1485b0 = obtainStyledAttributes.getInt(index, this.f1485b0);
                                                    continue;
                                                case 73:
                                                    this.f1487c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1487c0);
                                                    continue;
                                                case 74:
                                                    this.f1493f0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f1501j0 = obtainStyledAttributes.getBoolean(index, this.f1501j0);
                                                    continue;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.f1495g0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb.append(str);
                                            sb.append(Integer.toHexString(index));
                                            sb.append(str2);
                                            sb.append(f1455k0.get(index));
                                            Log.w(str3, sb.toString());
                                            break;
                                    }
                            }
                    }
                } else {
                    this.f1499i0 = obtainStyledAttributes.getBoolean(index, this.f1499i0);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo2019a(C0318b bVar) {
            this.f1482a = bVar.f1482a;
            this.f1486c = bVar.f1486c;
            this.f1484b = bVar.f1484b;
            this.f1488d = bVar.f1488d;
            this.f1490e = bVar.f1490e;
            this.f1492f = bVar.f1492f;
            this.f1494g = bVar.f1494g;
            this.f1496h = bVar.f1496h;
            this.f1498i = bVar.f1498i;
            this.f1500j = bVar.f1500j;
            this.f1502k = bVar.f1502k;
            this.f1503l = bVar.f1503l;
            this.f1504m = bVar.f1504m;
            this.f1505n = bVar.f1505n;
            this.f1506o = bVar.f1506o;
            this.f1507p = bVar.f1507p;
            this.f1508q = bVar.f1508q;
            this.f1509r = bVar.f1509r;
            this.f1510s = bVar.f1510s;
            this.f1511t = bVar.f1511t;
            this.f1512u = bVar.f1512u;
            this.f1513v = bVar.f1513v;
            this.f1514w = bVar.f1514w;
            this.f1515x = bVar.f1515x;
            this.f1516y = bVar.f1516y;
            this.f1517z = bVar.f1517z;
            this.f1456A = bVar.f1456A;
            this.f1457B = bVar.f1457B;
            this.f1458C = bVar.f1458C;
            this.f1459D = bVar.f1459D;
            this.f1460E = bVar.f1460E;
            this.f1461F = bVar.f1461F;
            this.f1462G = bVar.f1462G;
            this.f1463H = bVar.f1463H;
            this.f1464I = bVar.f1464I;
            this.f1465J = bVar.f1465J;
            this.f1466K = bVar.f1466K;
            this.f1467L = bVar.f1467L;
            this.f1468M = bVar.f1468M;
            this.f1469N = bVar.f1469N;
            this.f1470O = bVar.f1470O;
            this.f1471P = bVar.f1471P;
            this.f1472Q = bVar.f1472Q;
            this.f1473R = bVar.f1473R;
            this.f1474S = bVar.f1474S;
            this.f1475T = bVar.f1475T;
            this.f1476U = bVar.f1476U;
            this.f1477V = bVar.f1477V;
            this.f1478W = bVar.f1478W;
            this.f1479X = bVar.f1479X;
            this.f1480Y = bVar.f1480Y;
            this.f1481Z = bVar.f1481Z;
            this.f1483a0 = bVar.f1483a0;
            this.f1485b0 = bVar.f1485b0;
            this.f1487c0 = bVar.f1487c0;
            this.f1489d0 = bVar.f1489d0;
            this.f1495g0 = bVar.f1495g0;
            int[] iArr = bVar.f1491e0;
            if (iArr != null) {
                this.f1491e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f1491e0 = null;
            }
            this.f1493f0 = bVar.f1493f0;
            this.f1497h0 = bVar.f1497h0;
            this.f1499i0 = bVar.f1499i0;
            this.f1501j0 = bVar.f1501j0;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$c */
    public static class C0319c {

        /* renamed from: h */
        private static SparseIntArray f1518h;

        /* renamed from: a */
        public boolean f1519a = false;

        /* renamed from: b */
        public int f1520b = -1;

        /* renamed from: c */
        public String f1521c = null;

        /* renamed from: d */
        public int f1522d = -1;

        /* renamed from: e */
        public int f1523e = 0;

        /* renamed from: f */
        public float f1524f = Float.NaN;

        /* renamed from: g */
        public float f1525g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1518h = sparseIntArray;
            sparseIntArray.append(C0328j.Motion_motionPathRotate, 1);
            f1518h.append(C0328j.Motion_pathMotionArc, 2);
            f1518h.append(C0328j.Motion_transitionEasing, 3);
            f1518h.append(C0328j.Motion_drawPath, 4);
            f1518h.append(C0328j.Motion_animate_relativeTo, 5);
            f1518h.append(C0328j.Motion_motionStagger, 6);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2020a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0328j.Motion);
            this.f1519a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1518h.get(index)) {
                    case 1:
                        this.f1525g = obtainStyledAttributes.getFloat(index, this.f1525g);
                        break;
                    case 2:
                        this.f1522d = obtainStyledAttributes.getInt(index, this.f1522d);
                        break;
                    case 3:
                        this.f1521c = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : C3177a.f8998b[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f1523e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1520b = C0316d.m1636b(obtainStyledAttributes, index, this.f1520b);
                        break;
                    case 6:
                        this.f1524f = obtainStyledAttributes.getFloat(index, this.f1524f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo2021a(C0319c cVar) {
            this.f1519a = cVar.f1519a;
            this.f1520b = cVar.f1520b;
            this.f1521c = cVar.f1521c;
            this.f1522d = cVar.f1522d;
            this.f1523e = cVar.f1523e;
            this.f1525g = cVar.f1525g;
            this.f1524f = cVar.f1524f;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d */
    public static class C0320d {

        /* renamed from: a */
        public boolean f1526a = false;

        /* renamed from: b */
        public int f1527b = 0;

        /* renamed from: c */
        public int f1528c = 0;

        /* renamed from: d */
        public float f1529d = 1.0f;

        /* renamed from: e */
        public float f1530e = Float.NaN;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2022a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0328j.PropertySet);
            this.f1526a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0328j.PropertySet_android_alpha) {
                    this.f1529d = obtainStyledAttributes.getFloat(index, this.f1529d);
                } else if (index == C0328j.PropertySet_android_visibility) {
                    this.f1527b = obtainStyledAttributes.getInt(index, this.f1527b);
                    this.f1527b = C0316d.f1444d[this.f1527b];
                } else if (index == C0328j.PropertySet_visibilityMode) {
                    this.f1528c = obtainStyledAttributes.getInt(index, this.f1528c);
                } else if (index == C0328j.PropertySet_motionProgress) {
                    this.f1530e = obtainStyledAttributes.getFloat(index, this.f1530e);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo2023a(C0320d dVar) {
            this.f1526a = dVar.f1526a;
            this.f1527b = dVar.f1527b;
            this.f1529d = dVar.f1529d;
            this.f1530e = dVar.f1530e;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$e */
    public static class C0321e {

        /* renamed from: n */
        private static SparseIntArray f1531n;

        /* renamed from: a */
        public boolean f1532a;

        /* renamed from: b */
        public float f1533b = 0.0f;

        /* renamed from: c */
        public float f1534c = 0.0f;

        /* renamed from: d */
        public float f1535d = 0.0f;

        /* renamed from: e */
        public float f1536e = 1.0f;

        /* renamed from: f */
        public float f1537f = 1.0f;

        /* renamed from: g */
        public float f1538g = Float.NaN;

        /* renamed from: h */
        public float f1539h = Float.NaN;

        /* renamed from: i */
        public float f1540i = 0.0f;

        /* renamed from: j */
        public float f1541j = 0.0f;

        /* renamed from: k */
        public float f1542k = 0.0f;

        /* renamed from: l */
        public boolean f1543l = false;

        /* renamed from: m */
        public float f1544m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1531n = sparseIntArray;
            sparseIntArray.append(C0328j.Transform_android_rotation, 1);
            f1531n.append(C0328j.Transform_android_rotationX, 2);
            f1531n.append(C0328j.Transform_android_rotationY, 3);
            f1531n.append(C0328j.Transform_android_scaleX, 4);
            f1531n.append(C0328j.Transform_android_scaleY, 5);
            f1531n.append(C0328j.Transform_android_transformPivotX, 6);
            f1531n.append(C0328j.Transform_android_transformPivotY, 7);
            f1531n.append(C0328j.Transform_android_translationX, 8);
            f1531n.append(C0328j.Transform_android_translationY, 9);
            f1531n.append(C0328j.Transform_android_translationZ, 10);
            f1531n.append(C0328j.Transform_android_elevation, 11);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2024a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0328j.Transform);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1531n.get(index)) {
                    case 1:
                        this.f1533b = obtainStyledAttributes.getFloat(index, this.f1533b);
                        break;
                    case 2:
                        this.f1534c = obtainStyledAttributes.getFloat(index, this.f1534c);
                        break;
                    case 3:
                        this.f1535d = obtainStyledAttributes.getFloat(index, this.f1535d);
                        break;
                    case 4:
                        this.f1536e = obtainStyledAttributes.getFloat(index, this.f1536e);
                        break;
                    case 5:
                        this.f1537f = obtainStyledAttributes.getFloat(index, this.f1537f);
                        break;
                    case 6:
                        this.f1538g = obtainStyledAttributes.getFloat(index, this.f1538g);
                        break;
                    case 7:
                        this.f1539h = obtainStyledAttributes.getFloat(index, this.f1539h);
                        break;
                    case 8:
                        this.f1540i = obtainStyledAttributes.getDimension(index, this.f1540i);
                        break;
                    case 9:
                        this.f1541j = obtainStyledAttributes.getDimension(index, this.f1541j);
                        break;
                    case 10:
                        if (VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f1542k = obtainStyledAttributes.getDimension(index, this.f1542k);
                            break;
                        }
                    case 11:
                        if (VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f1543l = true;
                            this.f1544m = obtainStyledAttributes.getDimension(index, this.f1544m);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo2025a(C0321e eVar) {
            this.f1533b = eVar.f1533b;
            this.f1534c = eVar.f1534c;
            this.f1535d = eVar.f1535d;
            this.f1536e = eVar.f1536e;
            this.f1537f = eVar.f1537f;
            this.f1538g = eVar.f1538g;
            this.f1539h = eVar.f1539h;
            this.f1540i = eVar.f1540i;
            this.f1541j = eVar.f1541j;
            this.f1542k = eVar.f1542k;
            this.f1543l = eVar.f1543l;
            this.f1544m = eVar.f1544m;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1445e = sparseIntArray;
        sparseIntArray.append(C0328j.Constraint_layout_constraintLeft_toLeftOf, 25);
        f1445e.append(C0328j.Constraint_layout_constraintLeft_toRightOf, 26);
        f1445e.append(C0328j.Constraint_layout_constraintRight_toLeftOf, 29);
        f1445e.append(C0328j.Constraint_layout_constraintRight_toRightOf, 30);
        f1445e.append(C0328j.Constraint_layout_constraintTop_toTopOf, 36);
        f1445e.append(C0328j.Constraint_layout_constraintTop_toBottomOf, 35);
        f1445e.append(C0328j.Constraint_layout_constraintBottom_toTopOf, 4);
        f1445e.append(C0328j.Constraint_layout_constraintBottom_toBottomOf, 3);
        f1445e.append(C0328j.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f1445e.append(C0328j.Constraint_layout_editor_absoluteX, 6);
        f1445e.append(C0328j.Constraint_layout_editor_absoluteY, 7);
        f1445e.append(C0328j.Constraint_layout_constraintGuide_begin, 17);
        f1445e.append(C0328j.Constraint_layout_constraintGuide_end, 18);
        f1445e.append(C0328j.Constraint_layout_constraintGuide_percent, 19);
        f1445e.append(C0328j.Constraint_android_orientation, 27);
        f1445e.append(C0328j.Constraint_layout_constraintStart_toEndOf, 32);
        f1445e.append(C0328j.Constraint_layout_constraintStart_toStartOf, 33);
        f1445e.append(C0328j.Constraint_layout_constraintEnd_toStartOf, 10);
        f1445e.append(C0328j.Constraint_layout_constraintEnd_toEndOf, 9);
        f1445e.append(C0328j.Constraint_layout_goneMarginLeft, 13);
        f1445e.append(C0328j.Constraint_layout_goneMarginTop, 16);
        f1445e.append(C0328j.Constraint_layout_goneMarginRight, 14);
        f1445e.append(C0328j.Constraint_layout_goneMarginBottom, 11);
        f1445e.append(C0328j.Constraint_layout_goneMarginStart, 15);
        f1445e.append(C0328j.Constraint_layout_goneMarginEnd, 12);
        f1445e.append(C0328j.Constraint_layout_constraintVertical_weight, 40);
        f1445e.append(C0328j.Constraint_layout_constraintHorizontal_weight, 39);
        f1445e.append(C0328j.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f1445e.append(C0328j.Constraint_layout_constraintVertical_chainStyle, 42);
        f1445e.append(C0328j.Constraint_layout_constraintHorizontal_bias, 20);
        f1445e.append(C0328j.Constraint_layout_constraintVertical_bias, 37);
        f1445e.append(C0328j.Constraint_layout_constraintDimensionRatio, 5);
        f1445e.append(C0328j.Constraint_layout_constraintLeft_creator, 82);
        f1445e.append(C0328j.Constraint_layout_constraintTop_creator, 82);
        f1445e.append(C0328j.Constraint_layout_constraintRight_creator, 82);
        f1445e.append(C0328j.Constraint_layout_constraintBottom_creator, 82);
        f1445e.append(C0328j.Constraint_layout_constraintBaseline_creator, 82);
        f1445e.append(C0328j.Constraint_android_layout_marginLeft, 24);
        f1445e.append(C0328j.Constraint_android_layout_marginRight, 28);
        f1445e.append(C0328j.Constraint_android_layout_marginStart, 31);
        f1445e.append(C0328j.Constraint_android_layout_marginEnd, 8);
        f1445e.append(C0328j.Constraint_android_layout_marginTop, 34);
        f1445e.append(C0328j.Constraint_android_layout_marginBottom, 2);
        f1445e.append(C0328j.Constraint_android_layout_width, 23);
        f1445e.append(C0328j.Constraint_android_layout_height, 21);
        f1445e.append(C0328j.Constraint_android_visibility, 22);
        f1445e.append(C0328j.Constraint_android_alpha, 43);
        f1445e.append(C0328j.Constraint_android_elevation, 44);
        f1445e.append(C0328j.Constraint_android_rotationX, 45);
        f1445e.append(C0328j.Constraint_android_rotationY, 46);
        f1445e.append(C0328j.Constraint_android_rotation, 60);
        f1445e.append(C0328j.Constraint_android_scaleX, 47);
        f1445e.append(C0328j.Constraint_android_scaleY, 48);
        f1445e.append(C0328j.Constraint_android_transformPivotX, 49);
        f1445e.append(C0328j.Constraint_android_transformPivotY, 50);
        f1445e.append(C0328j.Constraint_android_translationX, 51);
        f1445e.append(C0328j.Constraint_android_translationY, 52);
        f1445e.append(C0328j.Constraint_android_translationZ, 53);
        f1445e.append(C0328j.Constraint_layout_constraintWidth_default, 54);
        f1445e.append(C0328j.Constraint_layout_constraintHeight_default, 55);
        f1445e.append(C0328j.Constraint_layout_constraintWidth_max, 56);
        f1445e.append(C0328j.Constraint_layout_constraintHeight_max, 57);
        f1445e.append(C0328j.Constraint_layout_constraintWidth_min, 58);
        f1445e.append(C0328j.Constraint_layout_constraintHeight_min, 59);
        f1445e.append(C0328j.Constraint_layout_constraintCircle, 61);
        f1445e.append(C0328j.Constraint_layout_constraintCircleRadius, 62);
        f1445e.append(C0328j.Constraint_layout_constraintCircleAngle, 63);
        f1445e.append(C0328j.Constraint_animate_relativeTo, 64);
        f1445e.append(C0328j.Constraint_transitionEasing, 65);
        f1445e.append(C0328j.Constraint_drawPath, 66);
        f1445e.append(C0328j.Constraint_transitionPathRotate, 67);
        f1445e.append(C0328j.Constraint_motionStagger, 79);
        f1445e.append(C0328j.Constraint_android_id, 38);
        f1445e.append(C0328j.Constraint_progress, 68);
        f1445e.append(C0328j.Constraint_layout_constraintWidth_percent, 69);
        f1445e.append(C0328j.Constraint_layout_constraintHeight_percent, 70);
        f1445e.append(C0328j.Constraint_chainUseRtl, 71);
        f1445e.append(C0328j.Constraint_barrierDirection, 72);
        f1445e.append(C0328j.Constraint_barrierMargin, 73);
        f1445e.append(C0328j.Constraint_constraint_referenced_ids, 74);
        f1445e.append(C0328j.Constraint_barrierAllowsGoneWidgets, 75);
        f1445e.append(C0328j.Constraint_pathMotionArc, 76);
        f1445e.append(C0328j.Constraint_layout_constraintTag, 77);
        f1445e.append(C0328j.Constraint_visibilityMode, 78);
        f1445e.append(C0328j.Constraint_layout_constrainedWidth, 80);
        f1445e.append(C0328j.Constraint_layout_constrainedHeight, 81);
    }

    /* renamed from: a */
    private C0317a m1632a(Context context, AttributeSet attributeSet) {
        C0317a aVar = new C0317a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0328j.Constraint);
        m1633a(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: a */
    private void m1633a(Context context, C0317a aVar, TypedArray typedArray) {
        C0319c cVar;
        String str;
        StringBuilder sb;
        String str2;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != C0328j.Constraint_android_id) {
                aVar.f1451c.f1519a = true;
                aVar.f1452d.f1484b = true;
                aVar.f1450b.f1526a = true;
                aVar.f1453e.f1532a = true;
            }
            String str3 = "   ";
            String str4 = "ConstraintSet";
            switch (f1445e.get(index)) {
                case 1:
                    C0318b bVar = aVar.f1452d;
                    bVar.f1507p = m1636b(typedArray, index, bVar.f1507p);
                    continue;
                case 2:
                    C0318b bVar2 = aVar.f1452d;
                    bVar2.f1462G = typedArray.getDimensionPixelSize(index, bVar2.f1462G);
                    continue;
                case 3:
                    C0318b bVar3 = aVar.f1452d;
                    bVar3.f1506o = m1636b(typedArray, index, bVar3.f1506o);
                    continue;
                case 4:
                    C0318b bVar4 = aVar.f1452d;
                    bVar4.f1505n = m1636b(typedArray, index, bVar4.f1505n);
                    continue;
                case 5:
                    aVar.f1452d.f1514w = typedArray.getString(index);
                    continue;
                case 6:
                    C0318b bVar5 = aVar.f1452d;
                    bVar5.f1456A = typedArray.getDimensionPixelOffset(index, bVar5.f1456A);
                    continue;
                case 7:
                    C0318b bVar6 = aVar.f1452d;
                    bVar6.f1457B = typedArray.getDimensionPixelOffset(index, bVar6.f1457B);
                    continue;
                case 8:
                    C0318b bVar7 = aVar.f1452d;
                    bVar7.f1463H = typedArray.getDimensionPixelSize(index, bVar7.f1463H);
                    continue;
                case 9:
                    C0318b bVar8 = aVar.f1452d;
                    bVar8.f1511t = m1636b(typedArray, index, bVar8.f1511t);
                    continue;
                case 10:
                    C0318b bVar9 = aVar.f1452d;
                    bVar9.f1510s = m1636b(typedArray, index, bVar9.f1510s);
                    continue;
                case 11:
                    C0318b bVar10 = aVar.f1452d;
                    bVar10.f1468M = typedArray.getDimensionPixelSize(index, bVar10.f1468M);
                    continue;
                case 12:
                    C0318b bVar11 = aVar.f1452d;
                    bVar11.f1469N = typedArray.getDimensionPixelSize(index, bVar11.f1469N);
                    continue;
                case 13:
                    C0318b bVar12 = aVar.f1452d;
                    bVar12.f1465J = typedArray.getDimensionPixelSize(index, bVar12.f1465J);
                    continue;
                case 14:
                    C0318b bVar13 = aVar.f1452d;
                    bVar13.f1467L = typedArray.getDimensionPixelSize(index, bVar13.f1467L);
                    continue;
                case 15:
                    C0318b bVar14 = aVar.f1452d;
                    bVar14.f1470O = typedArray.getDimensionPixelSize(index, bVar14.f1470O);
                    continue;
                case 16:
                    C0318b bVar15 = aVar.f1452d;
                    bVar15.f1466K = typedArray.getDimensionPixelSize(index, bVar15.f1466K);
                    continue;
                case 17:
                    C0318b bVar16 = aVar.f1452d;
                    bVar16.f1490e = typedArray.getDimensionPixelOffset(index, bVar16.f1490e);
                    continue;
                case 18:
                    C0318b bVar17 = aVar.f1452d;
                    bVar17.f1492f = typedArray.getDimensionPixelOffset(index, bVar17.f1492f);
                    continue;
                case 19:
                    C0318b bVar18 = aVar.f1452d;
                    bVar18.f1494g = typedArray.getFloat(index, bVar18.f1494g);
                    continue;
                case 20:
                    C0318b bVar19 = aVar.f1452d;
                    bVar19.f1512u = typedArray.getFloat(index, bVar19.f1512u);
                    continue;
                case 21:
                    C0318b bVar20 = aVar.f1452d;
                    bVar20.f1488d = typedArray.getLayoutDimension(index, bVar20.f1488d);
                    continue;
                case 22:
                    C0320d dVar = aVar.f1450b;
                    dVar.f1527b = typedArray.getInt(index, dVar.f1527b);
                    C0320d dVar2 = aVar.f1450b;
                    dVar2.f1527b = f1444d[dVar2.f1527b];
                    continue;
                case 23:
                    C0318b bVar21 = aVar.f1452d;
                    bVar21.f1486c = typedArray.getLayoutDimension(index, bVar21.f1486c);
                    continue;
                case 24:
                    C0318b bVar22 = aVar.f1452d;
                    bVar22.f1459D = typedArray.getDimensionPixelSize(index, bVar22.f1459D);
                    continue;
                case 25:
                    C0318b bVar23 = aVar.f1452d;
                    bVar23.f1496h = m1636b(typedArray, index, bVar23.f1496h);
                    continue;
                case 26:
                    C0318b bVar24 = aVar.f1452d;
                    bVar24.f1498i = m1636b(typedArray, index, bVar24.f1498i);
                    continue;
                case 27:
                    C0318b bVar25 = aVar.f1452d;
                    bVar25.f1458C = typedArray.getInt(index, bVar25.f1458C);
                    continue;
                case 28:
                    C0318b bVar26 = aVar.f1452d;
                    bVar26.f1460E = typedArray.getDimensionPixelSize(index, bVar26.f1460E);
                    continue;
                case 29:
                    C0318b bVar27 = aVar.f1452d;
                    bVar27.f1500j = m1636b(typedArray, index, bVar27.f1500j);
                    continue;
                case 30:
                    C0318b bVar28 = aVar.f1452d;
                    bVar28.f1502k = m1636b(typedArray, index, bVar28.f1502k);
                    continue;
                case 31:
                    C0318b bVar29 = aVar.f1452d;
                    bVar29.f1464I = typedArray.getDimensionPixelSize(index, bVar29.f1464I);
                    continue;
                case 32:
                    C0318b bVar30 = aVar.f1452d;
                    bVar30.f1508q = m1636b(typedArray, index, bVar30.f1508q);
                    continue;
                case 33:
                    C0318b bVar31 = aVar.f1452d;
                    bVar31.f1509r = m1636b(typedArray, index, bVar31.f1509r);
                    continue;
                case 34:
                    C0318b bVar32 = aVar.f1452d;
                    bVar32.f1461F = typedArray.getDimensionPixelSize(index, bVar32.f1461F);
                    continue;
                case 35:
                    C0318b bVar33 = aVar.f1452d;
                    bVar33.f1504m = m1636b(typedArray, index, bVar33.f1504m);
                    continue;
                case 36:
                    C0318b bVar34 = aVar.f1452d;
                    bVar34.f1503l = m1636b(typedArray, index, bVar34.f1503l);
                    continue;
                case 37:
                    C0318b bVar35 = aVar.f1452d;
                    bVar35.f1513v = typedArray.getFloat(index, bVar35.f1513v);
                    continue;
                case 38:
                    aVar.f1449a = typedArray.getResourceId(index, aVar.f1449a);
                    continue;
                case 39:
                    C0318b bVar36 = aVar.f1452d;
                    bVar36.f1472Q = typedArray.getFloat(index, bVar36.f1472Q);
                    continue;
                case 40:
                    C0318b bVar37 = aVar.f1452d;
                    bVar37.f1471P = typedArray.getFloat(index, bVar37.f1471P);
                    continue;
                case 41:
                    C0318b bVar38 = aVar.f1452d;
                    bVar38.f1473R = typedArray.getInt(index, bVar38.f1473R);
                    continue;
                case 42:
                    C0318b bVar39 = aVar.f1452d;
                    bVar39.f1474S = typedArray.getInt(index, bVar39.f1474S);
                    continue;
                case 43:
                    C0320d dVar3 = aVar.f1450b;
                    dVar3.f1529d = typedArray.getFloat(index, dVar3.f1529d);
                    continue;
                case 44:
                    if (VERSION.SDK_INT >= 21) {
                        C0321e eVar = aVar.f1453e;
                        eVar.f1543l = true;
                        eVar.f1544m = typedArray.getDimension(index, eVar.f1544m);
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    C0321e eVar2 = aVar.f1453e;
                    eVar2.f1534c = typedArray.getFloat(index, eVar2.f1534c);
                    continue;
                case 46:
                    C0321e eVar3 = aVar.f1453e;
                    eVar3.f1535d = typedArray.getFloat(index, eVar3.f1535d);
                    continue;
                case 47:
                    C0321e eVar4 = aVar.f1453e;
                    eVar4.f1536e = typedArray.getFloat(index, eVar4.f1536e);
                    continue;
                case 48:
                    C0321e eVar5 = aVar.f1453e;
                    eVar5.f1537f = typedArray.getFloat(index, eVar5.f1537f);
                    continue;
                case 49:
                    C0321e eVar6 = aVar.f1453e;
                    eVar6.f1538g = typedArray.getFloat(index, eVar6.f1538g);
                    continue;
                case 50:
                    C0321e eVar7 = aVar.f1453e;
                    eVar7.f1539h = typedArray.getFloat(index, eVar7.f1539h);
                    continue;
                case 51:
                    C0321e eVar8 = aVar.f1453e;
                    eVar8.f1540i = typedArray.getDimension(index, eVar8.f1540i);
                    continue;
                case 52:
                    C0321e eVar9 = aVar.f1453e;
                    eVar9.f1541j = typedArray.getDimension(index, eVar9.f1541j);
                    continue;
                case 53:
                    if (VERSION.SDK_INT >= 21) {
                        C0321e eVar10 = aVar.f1453e;
                        eVar10.f1542k = typedArray.getDimension(index, eVar10.f1542k);
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    C0318b bVar40 = aVar.f1452d;
                    bVar40.f1477V = typedArray.getDimensionPixelSize(index, bVar40.f1477V);
                    continue;
                case 57:
                    C0318b bVar41 = aVar.f1452d;
                    bVar41.f1478W = typedArray.getDimensionPixelSize(index, bVar41.f1478W);
                    continue;
                case 58:
                    C0318b bVar42 = aVar.f1452d;
                    bVar42.f1479X = typedArray.getDimensionPixelSize(index, bVar42.f1479X);
                    continue;
                case 59:
                    C0318b bVar43 = aVar.f1452d;
                    bVar43.f1480Y = typedArray.getDimensionPixelSize(index, bVar43.f1480Y);
                    continue;
                case 60:
                    C0321e eVar11 = aVar.f1453e;
                    eVar11.f1533b = typedArray.getFloat(index, eVar11.f1533b);
                    continue;
                case 61:
                    C0318b bVar44 = aVar.f1452d;
                    bVar44.f1515x = m1636b(typedArray, index, bVar44.f1515x);
                    continue;
                case 62:
                    C0318b bVar45 = aVar.f1452d;
                    bVar45.f1516y = typedArray.getDimensionPixelSize(index, bVar45.f1516y);
                    continue;
                case 63:
                    C0318b bVar46 = aVar.f1452d;
                    bVar46.f1517z = typedArray.getFloat(index, bVar46.f1517z);
                    continue;
                case 64:
                    C0319c cVar2 = aVar.f1451c;
                    cVar2.f1520b = m1636b(typedArray, index, cVar2.f1520b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f1451c;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.f1451c;
                        str = C3177a.f8998b[typedArray.getInteger(index, 0)];
                    }
                    cVar.f1521c = str;
                    continue;
                case 66:
                    aVar.f1451c.f1523e = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    C0319c cVar3 = aVar.f1451c;
                    cVar3.f1525g = typedArray.getFloat(index, cVar3.f1525g);
                    continue;
                case 68:
                    C0320d dVar4 = aVar.f1450b;
                    dVar4.f1530e = typedArray.getFloat(index, dVar4.f1530e);
                    continue;
                case 69:
                    aVar.f1452d.f1481Z = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f1452d.f1483a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e(str4, "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    C0318b bVar47 = aVar.f1452d;
                    bVar47.f1485b0 = typedArray.getInt(index, bVar47.f1485b0);
                    continue;
                case 73:
                    C0318b bVar48 = aVar.f1452d;
                    bVar48.f1487c0 = typedArray.getDimensionPixelSize(index, bVar48.f1487c0);
                    continue;
                case 74:
                    aVar.f1452d.f1493f0 = typedArray.getString(index);
                    continue;
                case 75:
                    C0318b bVar49 = aVar.f1452d;
                    bVar49.f1501j0 = typedArray.getBoolean(index, bVar49.f1501j0);
                    continue;
                case 76:
                    C0319c cVar4 = aVar.f1451c;
                    cVar4.f1522d = typedArray.getInt(index, cVar4.f1522d);
                    continue;
                case 77:
                    aVar.f1452d.f1495g0 = typedArray.getString(index);
                    continue;
                case 78:
                    C0320d dVar5 = aVar.f1450b;
                    dVar5.f1528c = typedArray.getInt(index, dVar5.f1528c);
                    continue;
                case 79:
                    C0319c cVar5 = aVar.f1451c;
                    cVar5.f1524f = typedArray.getFloat(index, cVar5.f1524f);
                    continue;
                case 80:
                    C0318b bVar50 = aVar.f1452d;
                    bVar50.f1497h0 = typedArray.getBoolean(index, bVar50.f1497h0);
                    continue;
                case 81:
                    C0318b bVar51 = aVar.f1452d;
                    bVar51.f1499i0 = typedArray.getBoolean(index, bVar51.f1499i0);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append(str3);
            sb.append(f1445e.get(index));
            Log.w(str4, sb.toString());
        }
    }

    /* renamed from: a */
    private int[] m1635a(View view, String str) {
        int i;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0327i.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                Object a = ((ConstraintLayout) view.getParent()).mo1962a(0, trim);
                if (a != null && (a instanceof Integer)) {
                    i = ((Integer) a).intValue();
                }
            }
            int i4 = i3 + 1;
            iArr[i3] = i;
            i2++;
            i3 = i4;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m1636b(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: a */
    public void mo2010a(Context context, int i) {
        mo2012a((ConstraintLayout) LayoutInflater.from(context).inflate(i, null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x017b, code lost:
        continue;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2011a(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x018a
            if (r0 == 0) goto L_0x0178
            java.lang.String r4 = "Constraint"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x0036
            if (r0 == r5) goto L_0x0015
            goto L_0x017b
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r3.equals(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x017b
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.d$a> r0 = r9.f1448c     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r3 = r2.f1449a     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2 = r1
            goto L_0x017b
        L_0x0036:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r7 = -1
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            switch(r8) {
                case -2025855158: goto L_0x0086;
                case -1984451626: goto L_0x007c;
                case -1269513683: goto L_0x0073;
                case -1238332596: goto L_0x0069;
                case -71750448: goto L_0x005f;
                case 1331510167: goto L_0x0055;
                case 1791837707: goto L_0x004b;
                case 1803088381: goto L_0x0043;
                default: goto L_0x0042;
            }     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0042:
            goto L_0x0090
        L_0x0043:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 0
            goto L_0x0091
        L_0x004b:
            java.lang.String r4 = "CustomAttribute"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 7
            goto L_0x0091
        L_0x0055:
            java.lang.String r4 = "Barrier"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 2
            goto L_0x0091
        L_0x005f:
            java.lang.String r4 = "Guideline"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 1
            goto L_0x0091
        L_0x0069:
            java.lang.String r4 = "Transform"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 4
            goto L_0x0091
        L_0x0073:
            java.lang.String r4 = "PropertySet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            goto L_0x0091
        L_0x007c:
            java.lang.String r4 = "Motion"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 6
            goto L_0x0091
        L_0x0086:
            java.lang.String r4 = "Layout"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 5
            goto L_0x0091
        L_0x0090:
            r5 = -1
        L_0x0091:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r5) {
                case 0: goto L_0x016e;
                case 1: goto L_0x015d;
                case 2: goto L_0x0150;
                case 3: goto L_0x012b;
                case 4: goto L_0x0106;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00ba;
                case 7: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x017b
        L_0x0098:
            if (r2 == 0) goto L_0x00a1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r0 = r2.f1454f     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.C0309a.m1615a(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00a1:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x00ba:
            if (r2 == 0) goto L_0x00c7
            androidx.constraintlayout.widget.d$c r0 = r2.f1451c     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2020a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00c7:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x00e0:
            if (r2 == 0) goto L_0x00ed
            androidx.constraintlayout.widget.d$b r0 = r2.f1452d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2018a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00ed:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0106:
            if (r2 == 0) goto L_0x0112
            androidx.constraintlayout.widget.d$e r0 = r2.f1453e     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2024a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x0112:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x012b:
            if (r2 == 0) goto L_0x0137
            androidx.constraintlayout.widget.d$d r0 = r2.f1450b     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2022a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x0137:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0150:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$a r0 = r9.m1632a(r10, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$b r2 = r0.f1452d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2.f1489d0 = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x0176
        L_0x015d:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$a r0 = r9.m1632a(r10, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$b r2 = r0.f1452d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2.f1482a = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$b r2 = r0.f1452d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2.f1484b = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x0176
        L_0x016e:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$a r0 = r9.m1632a(r10, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0176:
            r2 = r0
            goto L_0x017b
        L_0x0178:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x017b:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x0006
        L_0x0181:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x018a
        L_0x0186:
            r10 = move-exception
            r10.printStackTrace()
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0316d.mo2011a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: a */
    public void mo2012a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1448c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0306b bVar = (C0306b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1447b || id != -1) {
                if (!this.f1448c.containsKey(Integer.valueOf(id))) {
                    this.f1448c.put(Integer.valueOf(id), new C0317a());
                }
                C0317a aVar = (C0317a) this.f1448c.get(Integer.valueOf(id));
                aVar.f1454f = C0309a.m1614a(this.f1446a, childAt);
                aVar.m1643a(id, bVar);
                aVar.f1450b.f1527b = childAt.getVisibility();
                if (VERSION.SDK_INT >= 17) {
                    aVar.f1450b.f1529d = childAt.getAlpha();
                    aVar.f1453e.f1533b = childAt.getRotation();
                    aVar.f1453e.f1534c = childAt.getRotationX();
                    aVar.f1453e.f1535d = childAt.getRotationY();
                    aVar.f1453e.f1536e = childAt.getScaleX();
                    aVar.f1453e.f1537f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        C0321e eVar = aVar.f1453e;
                        eVar.f1538g = pivotX;
                        eVar.f1539h = pivotY;
                    }
                    aVar.f1453e.f1540i = childAt.getTranslationX();
                    aVar.f1453e.f1541j = childAt.getTranslationY();
                    if (VERSION.SDK_INT >= 21) {
                        aVar.f1453e.f1542k = childAt.getTranslationZ();
                        C0321e eVar2 = aVar.f1453e;
                        if (eVar2.f1543l) {
                            eVar2.f1544m = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f1452d.f1501j0 = barrier.mo1953b();
                    aVar.f1452d.f1491e0 = barrier.getReferencedIds();
                    aVar.f1452d.f1485b0 = barrier.getType();
                    aVar.f1452d.f1487c0 = barrier.getMargin();
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2013a(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1448c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            String str = "ConstraintSet";
            if (!this.f1448c.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(C3178a.m12862a(childAt));
                Log.w(str, sb.toString());
            } else if (this.f1447b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f1448c.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0317a aVar = (C0317a) this.f1448c.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.f1452d.f1489d0 = 1;
                    }
                    int i2 = aVar.f1452d.f1489d0;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.f1452d.f1485b0);
                        barrier.setMargin(aVar.f1452d.f1487c0);
                        barrier.setAllowsGoneWidget(aVar.f1452d.f1501j0);
                        C0318b bVar = aVar.f1452d;
                        int[] iArr = bVar.f1491e0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str2 = bVar.f1493f0;
                            if (str2 != null) {
                                bVar.f1491e0 = m1635a((View) barrier, str2);
                                barrier.setReferencedIds(aVar.f1452d.f1491e0);
                            }
                        }
                    }
                    C0306b bVar2 = (C0306b) childAt.getLayoutParams();
                    bVar2.mo1995a();
                    aVar.mo2016a(bVar2);
                    if (z) {
                        C0309a.m1616a(childAt, aVar.f1454f);
                    }
                    childAt.setLayoutParams(bVar2);
                    C0320d dVar = aVar.f1450b;
                    if (dVar.f1528c == 0) {
                        childAt.setVisibility(dVar.f1527b);
                    }
                    if (VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(aVar.f1450b.f1529d);
                        childAt.setRotation(aVar.f1453e.f1533b);
                        childAt.setRotationX(aVar.f1453e.f1534c);
                        childAt.setRotationY(aVar.f1453e.f1535d);
                        childAt.setScaleX(aVar.f1453e.f1536e);
                        childAt.setScaleY(aVar.f1453e.f1537f);
                        if (!Float.isNaN(aVar.f1453e.f1538g)) {
                            childAt.setPivotX(aVar.f1453e.f1538g);
                        }
                        if (!Float.isNaN(aVar.f1453e.f1539h)) {
                            childAt.setPivotY(aVar.f1453e.f1539h);
                        }
                        childAt.setTranslationX(aVar.f1453e.f1540i);
                        childAt.setTranslationY(aVar.f1453e.f1541j);
                        if (VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(aVar.f1453e.f1542k);
                            C0321e eVar = aVar.f1453e;
                            if (eVar.f1543l) {
                                childAt.setElevation(eVar.f1544m);
                            }
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("WARNING NO CONSTRAINTS for view ");
                    sb2.append(id);
                    Log.v(str, sb2.toString());
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0317a aVar2 = (C0317a) this.f1448c.get(num);
            int i3 = aVar2.f1452d.f1489d0;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                C0318b bVar3 = aVar2.f1452d;
                int[] iArr2 = bVar3.f1491e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str3 = bVar3.f1493f0;
                    if (str3 != null) {
                        bVar3.f1491e0 = m1635a((View) barrier2, str3);
                        barrier2.setReferencedIds(aVar2.f1452d.f1491e0);
                    }
                }
                barrier2.setType(aVar2.f1452d.f1485b0);
                barrier2.setMargin(aVar2.f1452d.f1487c0);
                C0306b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.mo2000a();
                aVar2.mo2016a(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.f1452d.f1482a) {
                C0325g gVar = new C0325g(constraintLayout.getContext());
                gVar.setId(num.intValue());
                C0306b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.mo2016a(generateDefaultLayoutParams2);
                constraintLayout.addView(gVar, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: a */
    public void mo2014a(C0322e eVar) {
        int childCount = eVar.getChildCount();
        this.f1448c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = eVar.getChildAt(i);
            C0323a aVar = (C0323a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1447b || id != -1) {
                if (!this.f1448c.containsKey(Integer.valueOf(id))) {
                    this.f1448c.put(Integer.valueOf(id), new C0317a());
                }
                C0317a aVar2 = (C0317a) this.f1448c.get(Integer.valueOf(id));
                if (childAt instanceof C0312b) {
                    aVar2.m1645a((C0312b) childAt, id, aVar);
                }
                aVar2.m1644a(id, aVar);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: b */
    public void mo2015b(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0317a a = m1632a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a.f1452d.f1482a = true;
                    }
                    this.f1448c.put(Integer.valueOf(a.f1449a), a);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
