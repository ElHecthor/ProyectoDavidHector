package p071f.p140w.p141a.p142a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p071f.p097h.p098e.p099c.C3252g;
import p071f.p097h.p100f.C3259f;
import p071f.p097h.p100f.C3259f.C3261b;

/* renamed from: f.w.a.a.e */
public class C3642e {

    /* renamed from: f.w.a.a.e$a */
    private static class C3643a implements TypeEvaluator<C3261b[]> {

        /* renamed from: a */
        private C3261b[] f10220a;

        C3643a() {
        }

        /* renamed from: a */
        public C3261b[] evaluate(float f, C3261b[] bVarArr, C3261b[] bVarArr2) {
            if (C3259f.m13352a(bVarArr, bVarArr2)) {
                if (!C3259f.m13352a(this.f10220a, bVarArr)) {
                    this.f10220a = C3259f.m13355a(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.f10220a[i].mo10604a(bVarArr[i], bVarArr2[i], f);
                }
                return this.f10220a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static int m14803a(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C3252g.m13332a(resources, theme, attributeSet, C3634a.f10206j);
        int i = 0;
        TypedValue b = C3252g.m13338b(a, xmlPullParser, "value", 0);
        if ((b != null) && m14820a(b.type)) {
            i = 3;
        }
        a.recycle();
        return i;
    }

    /* renamed from: a */
    private static int m14804a(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = true;
        boolean z2 = peekValue != null;
        int i3 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z = false;
        }
        return ((!z2 || !m14820a(i3)) && (!z || !m14820a(z ? peekValue2.type : 0))) ? 0 : 3;
    }

    /* renamed from: a */
    public static Animator m14805a(Context context, int i) {
        return VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i) : m14806a(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: a */
    public static Animator m14806a(Context context, Resources resources, Theme theme, int i) {
        return m14807a(context, resources, theme, i, 1.0f);
    }

    /* renamed from: a */
    public static Animator m14807a(Context context, Resources resources, Theme theme, int i, float f) {
        String str = "Can't load animation resource ID #0x";
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser animation = resources.getAnimation(i);
            Animator a = m14808a(context, resources, theme, (XmlPullParser) animation, f);
            if (animation != null) {
                animation.close();
            }
            return a;
        } catch (XmlPullParserException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(Integer.toHexString(i));
            NotFoundException notFoundException = new NotFoundException(sb.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(Integer.toHexString(i));
            NotFoundException notFoundException2 = new NotFoundException(sb2.toString());
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static Animator m14808a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, float f) {
        return m14809a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v0, types: [android.animation.AnimatorSet] */
    /* JADX WARNING: type inference failed for: r5v0, types: [android.animation.AnimatorSet] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v10, types: [android.animation.ValueAnimator] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v13, types: [android.animation.ObjectAnimator] */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x000e, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2
      assigns: []
      uses: []
      mth insns count: 108
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator m14809a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            int r12 = r21.getDepth()
            r0 = 0
            r13 = r0
        L_0x000e:
            int r1 = r21.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L_0x001c
            int r2 = r21.getDepth()
            if (r2 <= r12) goto L_0x00dd
        L_0x001c:
            r2 = 1
            if (r1 == r2) goto L_0x00dd
            r3 = 2
            if (r1 == r3) goto L_0x0023
            goto L_0x000e
        L_0x0023:
            java.lang.String r1 = r21.getName()
            java.lang.String r3 = "objectAnimator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0043
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r25
            r5 = r21
            android.animation.ObjectAnimator r0 = m14812a(r0, r1, r2, r3, r4, r5)
        L_0x003f:
            r3 = r18
            goto L_0x00b2
        L_0x0043:
            java.lang.String r3 = "animator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x005d
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r25
            r6 = r21
            android.animation.ValueAnimator r0 = m14815a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x003f
        L_0x005d:
            java.lang.String r3 = "set"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0093
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = p071f.p140w.p141a.p142a.C3634a.f10204h
            r7 = r22
            android.content.res.TypedArray r6 = p071f.p097h.p098e.p099c.C3252g.m13332a(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            int r16 = p071f.p097h.p098e.p099c.C3252g.m13337b(r6, r10, r0, r14, r14)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r15
            r17 = r6
            r6 = r16
            r7 = r25
            m14809a(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r3 = r18
            r0 = r15
            goto L_0x00b2
        L_0x0093:
            java.lang.String r3 = "propertyValuesHolder"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r21)
            r3 = r18
            android.animation.PropertyValuesHolder[] r1 = m14821a(r3, r8, r9, r10, r1)
            if (r1 == 0) goto L_0x00b1
            boolean r4 = r0 instanceof android.animation.ValueAnimator
            if (r4 == 0) goto L_0x00b1
            r4 = r0
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            r4.setValues(r1)
        L_0x00b1:
            r14 = 1
        L_0x00b2:
            if (r11 == 0) goto L_0x000e
            if (r14 != 0) goto L_0x000e
            if (r13 != 0) goto L_0x00bd
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x00bd:
            r13.add(r0)
            goto L_0x000e
        L_0x00c2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown animator name: "
            r1.append(r2)
            java.lang.String r2 = r21.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            if (r11 == 0) goto L_0x0106
            if (r13 == 0) goto L_0x0106
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
        L_0x00eb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00fd
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r14 + 1
            r1[r14] = r3
            r14 = r4
            goto L_0x00eb
        L_0x00fd:
            if (r24 != 0) goto L_0x0103
            r11.playTogether(r1)
            goto L_0x0106
        L_0x0103:
            r11.playSequentially(r1)
        L_0x0106:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p140w.p141a.p142a.C3642e.m14809a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: a */
    private static Keyframe m14810a(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: a */
    private static Keyframe m14811a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        TypedArray a = C3252g.m13332a(resources, theme, attributeSet, C3634a.f10206j);
        float a2 = C3252g.m13328a(a, xmlPullParser, "fraction", 3, -1.0f);
        String str = "value";
        TypedValue b = C3252g.m13338b(a, xmlPullParser, str, 0);
        boolean z = b != null;
        if (i == 4) {
            i = (!z || !m14820a(b.type)) ? 0 : 3;
        }
        Keyframe keyframe = z ? i != 0 ? (i == 1 || i == 3) ? Keyframe.ofInt(a2, C3252g.m13337b(a, xmlPullParser, str, 0, 0)) : null : Keyframe.ofFloat(a2, C3252g.m13328a(a, xmlPullParser, str, 0, 0.0f)) : i == 0 ? Keyframe.ofFloat(a2) : Keyframe.ofInt(a2);
        int c = C3252g.m13339c(a, xmlPullParser, "interpolator", 1, 0);
        if (c > 0) {
            keyframe.setInterpolator(C3641d.m14801a(context, c));
        }
        a.recycle();
        return keyframe;
    }

    /* renamed from: a */
    private static ObjectAnimator m14812a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m14815a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder m14813a(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) {
        /*
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r12.next()
            r3 = 3
            if (r2 == r3) goto L_0x0040
            r4 = 1
            if (r2 == r4) goto L_0x0040
            java.lang.String r2 = r12.getName()
            java.lang.String r3 = "keyframe"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0002
            r2 = 4
            if (r14 != r2) goto L_0x0023
            android.util.AttributeSet r14 = android.util.Xml.asAttributeSet(r12)
            int r14 = m14803a(r10, r11, r14, r12)
        L_0x0023:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r12)
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r14
            r7 = r12
            android.animation.Keyframe r2 = m14811a(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x003c
            if (r1 != 0) goto L_0x0039
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0039:
            r1.add(r2)
        L_0x003c:
            r12.next()
            goto L_0x0002
        L_0x0040:
            if (r1 == 0) goto L_0x00e9
            int r9 = r1.size()
            if (r9 <= 0) goto L_0x00e9
            r10 = 0
            java.lang.Object r11 = r1.get(r10)
            android.animation.Keyframe r11 = (android.animation.Keyframe) r11
            int r12 = r9 + -1
            java.lang.Object r12 = r1.get(r12)
            android.animation.Keyframe r12 = (android.animation.Keyframe) r12
            float r0 = r12.getFraction()
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0077
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x006a
            r12.setFraction(r2)
            goto L_0x0077
        L_0x006a:
            int r0 = r1.size()
            android.animation.Keyframe r12 = m14810a(r12, r2)
            r1.add(r0, r12)
            int r9 = r9 + 1
        L_0x0077:
            float r12 = r11.getFraction()
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0090
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x0087
            r11.setFraction(r4)
            goto L_0x0090
        L_0x0087:
            android.animation.Keyframe r11 = m14810a(r11, r4)
            r1.add(r10, r11)
            int r9 = r9 + 1
        L_0x0090:
            android.animation.Keyframe[] r11 = new android.animation.Keyframe[r9]
            r1.toArray(r11)
        L_0x0095:
            if (r10 >= r9) goto L_0x00dc
            r12 = r11[r10]
            float r0 = r12.getFraction()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d9
            if (r10 != 0) goto L_0x00a7
            r12.setFraction(r4)
            goto L_0x00d9
        L_0x00a7:
            int r0 = r9 + -1
            if (r10 != r0) goto L_0x00af
            r12.setFraction(r2)
            goto L_0x00d9
        L_0x00af:
            int r12 = r10 + 1
            r1 = r10
        L_0x00b2:
            if (r12 >= r0) goto L_0x00c5
            r5 = r11[r12]
            float r5 = r5.getFraction()
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 < 0) goto L_0x00bf
            goto L_0x00c5
        L_0x00bf:
            int r1 = r12 + 1
            r8 = r1
            r1 = r12
            r12 = r8
            goto L_0x00b2
        L_0x00c5:
            int r12 = r1 + 1
            r12 = r11[r12]
            float r12 = r12.getFraction()
            int r0 = r10 + -1
            r0 = r11[r0]
            float r0 = r0.getFraction()
            float r12 = r12 - r0
            m14819a(r11, r12, r10, r1)
        L_0x00d9:
            int r10 = r10 + 1
            goto L_0x0095
        L_0x00dc:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r11)
            if (r14 != r3) goto L_0x00e9
            f.w.a.a.f r9 = p071f.p140w.p141a.p142a.C3644f.m14823a()
            r0.setEvaluator(r9)
        L_0x00e9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p140w.p141a.p142a.C3642e.m14813a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    /* renamed from: a */
    private static PropertyValuesHolder m14814a(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((!z || !m14820a(i4)) && (!z2 || !m14820a(i5))) ? 0 : 3;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder3 = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C3261b[] a = C3259f.m13354a(string);
            C3261b[] a2 = C3259f.m13354a(string2);
            if (a == null && a2 == null) {
                return null;
            }
            if (a != null) {
                C3643a aVar = new C3643a();
                if (a2 == null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, new Object[]{a});
                } else if (C3259f.m13352a(a, a2)) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, new Object[]{a, a2});
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" Can't morph from ");
                    sb.append(string);
                    sb.append(" to ");
                    sb.append(string2);
                    throw new InflateException(sb.toString());
                }
                return propertyValuesHolder2;
            } else if (a2 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new C3643a(), new Object[]{a2});
            }
        } else {
            TypeEvaluator a3 = i == 3 ? C3644f.m14823a() : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f)});
                    } else {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{dimension});
                    }
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f)});
                }
                propertyValuesHolder3 = propertyValuesHolder;
            } else if (z) {
                int i6 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m14820a(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    int i7 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m14820a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, new int[]{i6, i7});
                } else {
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, new int[]{i6});
                }
            } else if (z2) {
                int i8 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m14820a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, new int[]{i8});
            }
            if (propertyValuesHolder3 == null || a3 == null) {
                return propertyValuesHolder3;
            }
            propertyValuesHolder3.setEvaluator(a3);
            return propertyValuesHolder3;
        }
    }

    /* renamed from: a */
    private static ValueAnimator m14815a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a = C3252g.m13332a(resources, theme, attributeSet, C3634a.f10203g);
        TypedArray a2 = C3252g.m13332a(resources, theme, attributeSet, C3634a.f10207k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m14817a(valueAnimator, a, a2, f, xmlPullParser);
        int c = C3252g.m13339c(a, xmlPullParser, "interpolator", 0, 0);
        if (c > 0) {
            valueAnimator.setInterpolator(C3641d.m14801a(context, c));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: a */
    private static void m14816a(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String a = C3252g.m13334a(typedArray, xmlPullParser, "pathData", 1);
        if (a != null) {
            String a2 = C3252g.m13334a(typedArray, xmlPullParser, "propertyXName", 2);
            String a3 = C3252g.m13334a(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (a2 == null && a3 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(typedArray.getPositionDescription());
                sb.append(" propertyXName or propertyYName is needed for PathData");
                throw new InflateException(sb.toString());
            }
            m14818a(C3259f.m13356b(a), objectAnimator, f * 0.5f, a2, a3);
            return;
        }
        objectAnimator.setPropertyName(C3252g.m13334a(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: a */
    private static void m14817a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long b = (long) C3252g.m13337b(typedArray, xmlPullParser, "duration", 1, 300);
        long b2 = (long) C3252g.m13337b(typedArray, xmlPullParser, "startOffset", 2, 0);
        int b3 = C3252g.m13337b(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C3252g.m13336a(xmlPullParser, "valueFrom") && C3252g.m13336a(xmlPullParser, "valueTo")) {
            if (b3 == 4) {
                b3 = m14804a(typedArray, 5, 6);
            }
            PropertyValuesHolder a = m14814a(typedArray, b3, 5, 6, "");
            if (a != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{a});
            }
        }
        valueAnimator.setDuration(b);
        valueAnimator.setStartDelay(b2);
        valueAnimator.setRepeatCount(C3252g.m13337b(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C3252g.m13337b(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m14816a(valueAnimator, typedArray2, b3, f, xmlPullParser);
        }
    }

    /* renamed from: a */
    private static void m14818a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / ((float) (min - 1));
        int i = 0;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str3 != null ? PropertyValuesHolder.ofFloat(str3, fArr) : null;
        if (str4 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
        } else if (propertyValuesHolder == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat});
        } else {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
        }
    }

    /* renamed from: a */
    private static void m14819a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    private static boolean m14820a(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] m14821a(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) {
        /*
            r6 = r20
            r7 = 0
            r8 = r7
        L_0x0004:
            int r0 = r20.getEventType()
            r9 = 0
            r1 = 3
            if (r0 == r1) goto L_0x006a
            r10 = 1
            if (r0 == r10) goto L_0x006a
            r2 = 2
            if (r0 == r2) goto L_0x0016
        L_0x0012:
            r20.next()
            goto L_0x0004
        L_0x0016:
            java.lang.String r0 = r20.getName()
            java.lang.String r3 = "propertyValuesHolder"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0063
            int[] r0 = p071f.p140w.p141a.p142a.C3634a.f10205i
            r11 = r18
            r12 = r19
            r13 = r21
            android.content.res.TypedArray r14 = p071f.p097h.p098e.p099c.C3252g.m13332a(r11, r12, r13, r0)
            java.lang.String r0 = "propertyName"
            java.lang.String r15 = p071f.p097h.p098e.p099c.C3252g.m13334a(r14, r6, r0, r1)
            r0 = 4
            java.lang.String r1 = "valueType"
            int r5 = p071f.p097h.p098e.p099c.C3252g.m13337b(r14, r6, r1, r2, r0)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r15
            r16 = r5
            android.animation.PropertyValuesHolder r0 = m14813a(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0052
            r1 = r16
            android.animation.PropertyValuesHolder r0 = m14814a(r14, r1, r9, r10, r15)
        L_0x0052:
            if (r0 == 0) goto L_0x005f
            if (r8 != 0) goto L_0x005c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8 = r1
        L_0x005c:
            r8.add(r0)
        L_0x005f:
            r14.recycle()
            goto L_0x0012
        L_0x0063:
            r11 = r18
            r12 = r19
            r13 = r21
            goto L_0x0012
        L_0x006a:
            if (r8 == 0) goto L_0x007f
            int r0 = r8.size()
            android.animation.PropertyValuesHolder[] r7 = new android.animation.PropertyValuesHolder[r0]
        L_0x0072:
            if (r9 >= r0) goto L_0x007f
            java.lang.Object r1 = r8.get(r9)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r7[r9] = r1
            int r9 = r9 + 1
            goto L_0x0072
        L_0x007f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p140w.p141a.p142a.C3642e.m14821a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }
}
