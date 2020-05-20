package com.appyvet.materialrangebar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;

public class RangeBar extends View {

    /* renamed from: A */
    private String f3150A = "";

    /* renamed from: B */
    private float f3151B = 12.0f;

    /* renamed from: C */
    private int f3152C = -12627531;

    /* renamed from: D */
    private int f3153D;

    /* renamed from: E */
    private int f3154E;

    /* renamed from: F */
    private int f3155F = -12627531;

    /* renamed from: G */
    private float f3156G = 0.0f;

    /* renamed from: H */
    private float f3157H = 5.0f;

    /* renamed from: I */
    private float f3158I = 8.0f;

    /* renamed from: J */
    private float f3159J = 24.0f;

    /* renamed from: K */
    private boolean f3160K = true;

    /* renamed from: L */
    private final DisplayMetrics f3161L;

    /* renamed from: M */
    private int f3162M;

    /* renamed from: N */
    private int f3163N;

    /* renamed from: O */
    private int f3164O;

    /* renamed from: P */
    private C0827d f3165P;

    /* renamed from: Q */
    private C0827d f3166Q;

    /* renamed from: R */
    private C0824a f3167R;

    /* renamed from: S */
    private C0825b f3168S;

    /* renamed from: T */
    private C0821d f3169T;

    /* renamed from: U */
    private C0822e f3170U;

    /* renamed from: V */
    private HashMap<Float, String> f3171V;

    /* renamed from: W */
    private int f3172W;

    /* renamed from: a0 */
    private int f3173a0;

    /* renamed from: b0 */
    private boolean f3174b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public float f3175c0;

    /* renamed from: d0 */
    private float f3176d0;

    /* renamed from: e0 */
    private int f3177e0;

    /* renamed from: f */
    private float f3178f = 1.0f;

    /* renamed from: f0 */
    private ArrayList<Integer> f3179f0;

    /* renamed from: g */
    private float f3180g = 0.0f;

    /* renamed from: g0 */
    private int f3181g0;

    /* renamed from: h */
    private float f3182h = 5.0f;

    /* renamed from: h0 */
    private int f3183h0;

    /* renamed from: i */
    private float f3184i = 1.0f;

    /* renamed from: i0 */
    private ArrayList<Integer> f3185i0;

    /* renamed from: j */
    private float f3186j = 2.0f;

    /* renamed from: j0 */
    private int f3187j0;

    /* renamed from: k */
    private boolean f3188k = false;

    /* renamed from: k0 */
    private int f3189k0;

    /* renamed from: l */
    private int f3190l = -3355444;

    /* renamed from: l0 */
    private int f3191l0;

    /* renamed from: m */
    private int f3192m = -12627531;

    /* renamed from: m0 */
    private int f3193m0;

    /* renamed from: n */
    private int f3194n = -1;

    /* renamed from: n0 */
    private int f3195n0;

    /* renamed from: o */
    private float f3196o = 4.0f;

    /* renamed from: o0 */
    private int f3197o0;

    /* renamed from: p */
    private ArrayList<Integer> f3198p = new ArrayList<>();

    /* renamed from: p0 */
    private float f3199p0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f3200q = 12.0f;

    /* renamed from: q0 */
    private float f3201q0;

    /* renamed from: r */
    private int f3202r = -16777216;

    /* renamed from: r0 */
    private C0826c f3203r0;

    /* renamed from: s */
    private ArrayList<Integer> f3204s = new ArrayList<>();

    /* renamed from: s0 */
    private boolean f3205s0;

    /* renamed from: t */
    private int f3206t = -3355444;

    /* renamed from: t0 */
    private boolean f3207t0;

    /* renamed from: u */
    private int f3208u = -16777216;

    /* renamed from: u0 */
    private boolean f3209u0;

    /* renamed from: v */
    private int f3210v;

    /* renamed from: v0 */
    private boolean f3211v0;

    /* renamed from: w */
    private int f3212w;

    /* renamed from: w0 */
    private boolean f3213w0;

    /* renamed from: x */
    private float f3214x = 4.0f;

    /* renamed from: x0 */
    private C0823f f3215x0;

    /* renamed from: y */
    private CharSequence[] f3216y;

    /* renamed from: z */
    private CharSequence[] f3217z;

    /* renamed from: com.appyvet.materialrangebar.RangeBar$a */
    class C0818a implements C0823f {
        C0818a(RangeBar rangeBar) {
        }

        /* renamed from: a */
        public String mo4481a(String str) {
            return str.length() > 4 ? str.substring(0, 4) : str;
        }
    }

    /* renamed from: com.appyvet.materialrangebar.RangeBar$b */
    class C0819b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C0827d f3218a;

        C0819b(C0827d dVar) {
            this.f3218a = dVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RangeBar.this.f3200q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f3218a.mo4504b(RangeBar.this.f3200q, RangeBar.this.f3175c0 * valueAnimator.getAnimatedFraction());
            RangeBar.this.invalidate();
        }
    }

    /* renamed from: com.appyvet.materialrangebar.RangeBar$c */
    class C0820c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C0827d f3220a;

        C0820c(C0827d dVar) {
            this.f3220a = dVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RangeBar.this.f3200q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f3220a.mo4504b(RangeBar.this.f3200q, RangeBar.this.f3175c0 - (RangeBar.this.f3175c0 * valueAnimator.getAnimatedFraction()));
            RangeBar.this.invalidate();
        }
    }

    /* renamed from: com.appyvet.materialrangebar.RangeBar$d */
    public interface C0821d {
        /* renamed from: a */
        void mo4484a(RangeBar rangeBar);

        /* renamed from: a */
        void mo4485a(RangeBar rangeBar, int i, int i2, String str, String str2);

        /* renamed from: b */
        void mo4486b(RangeBar rangeBar);
    }

    /* renamed from: com.appyvet.materialrangebar.RangeBar$e */
    public interface C0822e {
        /* renamed from: a */
        String mo4487a(RangeBar rangeBar, int i);
    }

    /* renamed from: com.appyvet.materialrangebar.RangeBar$f */
    public interface C0823f {
        /* renamed from: a */
        String mo4481a(String str);
    }

    public RangeBar(Context context) {
        super(context);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f3161L = displayMetrics;
        this.f3162M = (int) TypedValue.applyDimension(1, 250.0f, displayMetrics);
        this.f3163N = (int) TypedValue.applyDimension(1, 75.0f, this.f3161L);
        this.f3164O = ((int) ((this.f3182h - this.f3180g) / this.f3184i)) + 1;
        this.f3174b0 = true;
        this.f3175c0 = 16.0f;
        this.f3176d0 = 24.0f;
        this.f3179f0 = new ArrayList<>();
        this.f3185i0 = new ArrayList<>();
        this.f3205s0 = true;
        this.f3207t0 = true;
        this.f3209u0 = false;
        this.f3211v0 = false;
        this.f3213w0 = false;
        this.f3215x0 = new C0818a(this);
    }

    public RangeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f3161L = displayMetrics;
        this.f3162M = (int) TypedValue.applyDimension(1, 250.0f, displayMetrics);
        this.f3163N = (int) TypedValue.applyDimension(1, 75.0f, this.f3161L);
        this.f3164O = ((int) ((this.f3182h - this.f3180g) / this.f3184i)) + 1;
        this.f3174b0 = true;
        this.f3175c0 = 16.0f;
        this.f3176d0 = 24.0f;
        this.f3179f0 = new ArrayList<>();
        this.f3185i0 = new ArrayList<>();
        this.f3205s0 = true;
        this.f3207t0 = true;
        this.f3209u0 = false;
        this.f3211v0 = false;
        this.f3213w0 = false;
        this.f3215x0 = new C0818a(this);
        m4387a(context, attributeSet);
    }

    public RangeBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f3161L = displayMetrics;
        this.f3162M = (int) TypedValue.applyDimension(1, 250.0f, displayMetrics);
        this.f3163N = (int) TypedValue.applyDimension(1, 75.0f, this.f3161L);
        this.f3164O = ((int) ((this.f3182h - this.f3180g) / this.f3184i)) + 1;
        this.f3174b0 = true;
        this.f3175c0 = 16.0f;
        this.f3176d0 = 24.0f;
        this.f3179f0 = new ArrayList<>();
        this.f3185i0 = new ArrayList<>();
        this.f3205s0 = true;
        this.f3207t0 = true;
        this.f3209u0 = false;
        this.f3211v0 = false;
        this.f3213w0 = false;
        this.f3215x0 = new C0818a(this);
        m4387a(context, attributeSet);
    }

    /* renamed from: a */
    private float m4382a(float f) {
        if (!mo4424a()) {
            return 0.0f;
        }
        float x = this.f3165P.getX();
        if (x != this.f3166Q.getX() || f >= x) {
            return Math.abs(x - f);
        }
        return 0.0f;
    }

    /* renamed from: a */
    private String m4385a(int i) {
        C0822e eVar = this.f3170U;
        if (eVar != null) {
            return eVar.mo4487a(this, i);
        }
        float f = i == this.f3164O + -1 ? this.f3182h : (((float) i) * this.f3184i) + this.f3180g;
        String str = (String) this.f3171V.get(Float.valueOf(f));
        if (str == null) {
            double d = (double) f;
            str = d == Math.ceil(d) ? String.valueOf((int) f) : String.valueOf(f);
        }
        return this.f3215x0.mo4481a(str);
    }

    /* renamed from: a */
    private ArrayList<Integer> m4386a(CharSequence[] charSequenceArr, int i) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (charSequenceArr == null || charSequenceArr.length <= 0) {
            arrayList.add(Integer.valueOf(i));
        } else {
            for (CharSequence charSequence : charSequenceArr) {
                String charSequence2 = charSequence.toString();
                if (charSequence2.length() == 4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(charSequence2);
                    sb.append("000");
                    charSequence2 = sb.toString();
                }
                arrayList.add(Integer.valueOf(Color.parseColor(charSequence2)));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m4387a(Context context, AttributeSet attributeSet) {
        if (this.f3171V == null) {
            this.f3171V = new HashMap<>();
        }
        Context context2 = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0829f.RangeBar, 0, 0);
        try {
            float f = obtainStyledAttributes.getFloat(C0829f.RangeBar_mrb_tickStart, 0.0f);
            float f2 = obtainStyledAttributes.getFloat(C0829f.RangeBar_mrb_tickEnd, 5.0f);
            float f3 = obtainStyledAttributes.getFloat(C0829f.RangeBar_mrb_tickInterval, 1.0f);
            int i = ((int) ((f2 - f) / f3)) + 1;
            if (m4395b(i)) {
                this.f3164O = i;
                this.f3180g = f;
                this.f3182h = f2;
                this.f3184i = f3;
                this.f3172W = 0;
                int i2 = i - 1;
                this.f3173a0 = i2;
                if (this.f3169T != null) {
                    this.f3169T.mo4485a(this, 0, i2, m4385a(0), m4385a(this.f3173a0));
                }
            } else {
                Log.e("RangeBar", "tickCount less than 2; invalid tickCount. XML input ignored.");
            }
            this.f3178f = obtainStyledAttributes.getDimension(C0829f.RangeBar_mrb_tickHeight, TypedValue.applyDimension(1, 1.0f, this.f3161L));
            this.f3186j = obtainStyledAttributes.getDimension(C0829f.RangeBar_mrb_barWeight, TypedValue.applyDimension(1, 2.0f, this.f3161L));
            this.f3157H = obtainStyledAttributes.getDimension(C0829f.RangeBar_mrb_selectorSize, TypedValue.applyDimension(1, 5.0f, this.f3161L));
            this.f3156G = obtainStyledAttributes.getDimension(C0829f.RangeBar_mrb_selectorBoundarySize, TypedValue.applyDimension(1, 0.0f, this.f3161L));
            this.f3196o = obtainStyledAttributes.getDimension(C0829f.RangeBar_mrb_connectingLineWeight, TypedValue.applyDimension(1, 4.0f, this.f3161L));
            this.f3151B = obtainStyledAttributes.getDimension(C0829f.RangeBar_mrb_pinRadius, TypedValue.applyDimension(1, 12.0f, this.f3161L));
            this.f3175c0 = obtainStyledAttributes.getDimension(C0829f.RangeBar_mrb_pinPadding, TypedValue.applyDimension(1, 16.0f, this.f3161L));
            this.f3176d0 = obtainStyledAttributes.getDimension(C0829f.RangeBar_mrb_rangeBarPaddingBottom, TypedValue.applyDimension(1, 24.0f, this.f3161L));
            this.f3190l = obtainStyledAttributes.getColor(C0829f.RangeBar_mrb_rangeBarColor, -3355444);
            this.f3194n = obtainStyledAttributes.getColor(C0829f.RangeBar_mrb_pinTextColor, -1);
            this.f3192m = obtainStyledAttributes.getColor(C0829f.RangeBar_mrb_pinColor, -12627531);
            this.f3181g0 = this.f3190l;
            int color = obtainStyledAttributes.getColor(C0829f.RangeBar_mrb_selectorColor, -12627531);
            this.f3152C = color;
            this.f3153D = obtainStyledAttributes.getColor(C0829f.RangeBar_mrb_leftSelectorColor, color);
            this.f3154E = obtainStyledAttributes.getColor(C0829f.RangeBar_mrb_rightSelectorColor, this.f3152C);
            int color2 = obtainStyledAttributes.getColor(C0829f.RangeBar_mrb_selectorBoundaryColor, -12627531);
            this.f3155F = color2;
            this.f3187j0 = this.f3152C;
            this.f3189k0 = this.f3153D;
            this.f3191l0 = this.f3154E;
            this.f3193m0 = color2;
            int color3 = obtainStyledAttributes.getColor(C0829f.RangeBar_mrb_tickDefaultColor, -16777216);
            this.f3202r = color3;
            this.f3183h0 = color3;
            this.f3204s = m4386a(obtainStyledAttributes.getTextArray(C0829f.RangeBar_mrb_tickColors), this.f3202r);
            this.f3185i0 = new ArrayList<>(this.f3204s);
            int color4 = obtainStyledAttributes.getColor(C0829f.RangeBar_mrb_tickLabelColor, -3355444);
            this.f3206t = color4;
            this.f3210v = color4;
            int color5 = obtainStyledAttributes.getColor(C0829f.RangeBar_mrb_tickLabelSelectedColor, -16777216);
            this.f3208u = color5;
            this.f3212w = color5;
            this.f3216y = obtainStyledAttributes.getTextArray(C0829f.RangeBar_mrb_tickBottomLabels);
            this.f3217z = obtainStyledAttributes.getTextArray(C0829f.RangeBar_mrb_tickTopLabels);
            String string = obtainStyledAttributes.getString(C0829f.RangeBar_mrb_tickDefaultLabel);
            this.f3150A = string;
            if (string == null) {
                string = "";
            }
            this.f3150A = string;
            int color6 = obtainStyledAttributes.getColor(C0829f.RangeBar_mrb_connectingLineColor, -12627531);
            this.f3177e0 = color6;
            CharSequence[] textArray = obtainStyledAttributes.getTextArray(C0829f.RangeBar_mrb_connectingLineColors);
            if (textArray == null || textArray.length <= 0) {
                this.f3198p.add(Integer.valueOf(color6));
            } else {
                for (CharSequence charSequence : textArray) {
                    String charSequence2 = charSequence.toString();
                    if (charSequence2.length() == 4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(charSequence2);
                        sb.append("000");
                        charSequence2 = sb.toString();
                    }
                    this.f3198p.add(Integer.valueOf(Color.parseColor(charSequence2)));
                }
            }
            this.f3179f0 = new ArrayList<>(this.f3198p);
            this.f3174b0 = obtainStyledAttributes.getBoolean(C0829f.RangeBar_mrb_rangeBar, true);
            this.f3207t0 = obtainStyledAttributes.getBoolean(C0829f.RangeBar_mrb_temporaryPins, true);
            this.f3188k = obtainStyledAttributes.getBoolean(C0829f.RangeBar_mrb_rangeBar_rounded, false);
            float f4 = this.f3161L.density;
            this.f3158I = obtainStyledAttributes.getDimension(C0829f.RangeBar_mrb_pinMinFont, 8.0f * f4);
            this.f3159J = obtainStyledAttributes.getDimension(C0829f.RangeBar_mrb_pinMaxFont, 24.0f * f4);
            this.f3214x = obtainStyledAttributes.getDimension(C0829f.RangeBar_mrb_tickLabelSize, f4 * 4.0f);
            this.f3174b0 = obtainStyledAttributes.getBoolean(C0829f.RangeBar_mrb_rangeBar, true);
            this.f3209u0 = obtainStyledAttributes.getBoolean(C0829f.RangeBar_mrb_onlyOnDrag, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m4388a(C0827d dVar) {
        if (this.f3160K) {
            this.f3160K = false;
        }
        if (this.f3207t0) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, this.f3151B});
            ofFloat.addUpdateListener(new C0819b(dVar));
            ofFloat.start();
        }
        dVar.mo4498a();
    }

    /* renamed from: a */
    private void m4389a(C0827d dVar, float f) {
        if (f >= this.f3167R.mo4488a() && f <= this.f3167R.mo4493b() && dVar != null) {
            dVar.setX(f);
            invalidate();
        }
    }

    /* renamed from: b */
    private float m4390b(float f) {
        return Math.abs(this.f3166Q.getX() - f);
    }

    /* renamed from: b */
    private void m4392b() {
        C0824a aVar = r1;
        C0824a aVar2 = new C0824a(getContext(), getMarginLeft(), getYPos(), getBarLength(), this.f3164O, this.f3178f, this.f3202r, this.f3204s, this.f3186j, this.f3190l, this.f3188k, this.f3206t, this.f3208u, this.f3217z, this.f3216y, this.f3150A, this.f3214x);
        this.f3167R = aVar;
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1.f3166Q.mo4502a(r2, r3) != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r1.f3166Q.mo4502a(r2, r3) != false) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4393b(float r2, float r3) {
        /*
            r1 = this;
            boolean r0 = r1.f3174b0
            if (r0 == 0) goto L_0x0028
            com.appyvet.materialrangebar.d r0 = r1.f3166Q
            boolean r0 = r0.isPressed()
            if (r0 != 0) goto L_0x0017
            com.appyvet.materialrangebar.d r0 = r1.f3165P
            boolean r0 = r0.mo4502a(r2, r3)
            if (r0 == 0) goto L_0x0017
            com.appyvet.materialrangebar.d r2 = r1.f3165P
            goto L_0x0032
        L_0x0017:
            com.appyvet.materialrangebar.d r0 = r1.f3165P
            boolean r0 = r0.isPressed()
            if (r0 != 0) goto L_0x0035
            com.appyvet.materialrangebar.d r0 = r1.f3166Q
            boolean r2 = r0.mo4502a(r2, r3)
            if (r2 == 0) goto L_0x0035
            goto L_0x0030
        L_0x0028:
            com.appyvet.materialrangebar.d r0 = r1.f3166Q
            boolean r2 = r0.mo4502a(r2, r3)
            if (r2 == 0) goto L_0x0035
        L_0x0030:
            com.appyvet.materialrangebar.d r2 = r1.f3166Q
        L_0x0032:
            r1.m4388a(r2)
        L_0x0035:
            r2 = 1
            r1.f3211v0 = r2
            com.appyvet.materialrangebar.RangeBar$d r2 = r1.f3169T
            if (r2 == 0) goto L_0x003f
            r2.mo4486b(r1)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appyvet.materialrangebar.RangeBar.m4393b(float, float):void");
    }

    /* renamed from: b */
    private void m4394b(C0827d dVar) {
        dVar.setX(this.f3167R.mo4489a(dVar));
        dVar.mo4501a(m4385a(this.f3167R.mo4494b(dVar)));
        if (this.f3207t0) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f3151B, 0.0f});
            ofFloat.addUpdateListener(new C0820c(dVar));
            ofFloat.start();
        } else {
            invalidate();
        }
        dVar.mo4503b();
    }

    /* renamed from: b */
    private boolean m4395b(int i) {
        return i > 1;
    }

    /* renamed from: b */
    private boolean m4396b(int i, int i2) {
        if (i >= 0) {
            int i3 = this.f3164O;
            if (i < i3 && i2 >= 0 && i2 < i3) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private void m4397c() {
        this.f3168S = new C0825b(getYPos(), this.f3196o, this.f3198p);
        invalidate();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4398c(float r8) {
        /*
            r7 = this;
            boolean r0 = r7.f3174b0
            if (r0 == 0) goto L_0x000f
            com.appyvet.materialrangebar.d r0 = r7.f3165P
            boolean r0 = r0.isPressed()
            if (r0 == 0) goto L_0x000f
            com.appyvet.materialrangebar.d r0 = r7.f3165P
            goto L_0x0019
        L_0x000f:
            com.appyvet.materialrangebar.d r0 = r7.f3166Q
            boolean r0 = r0.isPressed()
            if (r0 == 0) goto L_0x001c
            com.appyvet.materialrangebar.d r0 = r7.f3166Q
        L_0x0019:
            r7.m4389a(r0, r8)
        L_0x001c:
            boolean r0 = r7.f3174b0
            if (r0 == 0) goto L_0x0038
            com.appyvet.materialrangebar.d r0 = r7.f3165P
            float r0 = r0.getX()
            com.appyvet.materialrangebar.d r1 = r7.f3166Q
            float r1 = r1.getX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            com.appyvet.materialrangebar.d r0 = r7.f3165P
            com.appyvet.materialrangebar.d r1 = r7.f3166Q
            r7.f3165P = r1
            r7.f3166Q = r0
        L_0x0038:
            boolean r0 = r7.f3174b0
            r1 = 0
            if (r0 == 0) goto L_0x0046
            com.appyvet.materialrangebar.a r0 = r7.f3167R
            com.appyvet.materialrangebar.d r2 = r7.f3165P
            int r0 = r0.mo4494b(r2)
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            com.appyvet.materialrangebar.a r2 = r7.f3167R
            com.appyvet.materialrangebar.d r3 = r7.f3166Q
            int r2 = r2.mo4494b(r3)
            int r3 = r7.getPaddingLeft()
            int r4 = r7.getRight()
            int r5 = r7.getPaddingRight()
            int r4 = r4 - r5
            int r4 = r4 - r3
            float r3 = (float) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x006e
            com.appyvet.materialrangebar.d r8 = r7.f3165P
            com.appyvet.materialrangebar.a r0 = r7.f3167R
            float r0 = r0.mo4488a()
            r7.m4389a(r8, r0)
            goto L_0x0085
        L_0x006e:
            float r1 = (float) r4
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 < 0) goto L_0x0084
            int r8 = r7.getTickCount()
            int r2 = r8 + -1
            com.appyvet.materialrangebar.d r8 = r7.f3166Q
            com.appyvet.materialrangebar.a r1 = r7.f3167R
            float r1 = r1.mo4493b()
            r7.m4389a(r8, r1)
        L_0x0084:
            r1 = r0
        L_0x0085:
            int r8 = r7.f3172W
            if (r1 != r8) goto L_0x008d
            int r8 = r7.f3173a0
            if (r2 == r8) goto L_0x00bf
        L_0x008d:
            r7.f3172W = r1
            r7.f3173a0 = r2
            boolean r8 = r7.f3174b0
            if (r8 == 0) goto L_0x009e
            com.appyvet.materialrangebar.d r8 = r7.f3165P
            java.lang.String r0 = r7.m4385a(r1)
            r8.mo4501a(r0)
        L_0x009e:
            com.appyvet.materialrangebar.d r8 = r7.f3166Q
            int r0 = r7.f3173a0
            java.lang.String r0 = r7.m4385a(r0)
            r8.mo4501a(r0)
            com.appyvet.materialrangebar.RangeBar$d r1 = r7.f3169T
            if (r1 == 0) goto L_0x00bf
            int r3 = r7.f3172W
            int r4 = r7.f3173a0
            java.lang.String r5 = r7.m4385a(r3)
            int r8 = r7.f3173a0
            java.lang.String r6 = r7.m4385a(r8)
            r2 = r7
            r1.mo4485a(r2, r3, r4, r5, r6)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appyvet.materialrangebar.RangeBar.m4398c(float):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4399c(float r8, float r9) {
        /*
            r7 = this;
            boolean r9 = r7.f3174b0
            r0 = 0
            if (r9 == 0) goto L_0x0010
            com.appyvet.materialrangebar.d r9 = r7.f3165P
            boolean r9 = r9.isPressed()
            if (r9 == 0) goto L_0x0010
            com.appyvet.materialrangebar.d r8 = r7.f3165P
            goto L_0x001a
        L_0x0010:
            com.appyvet.materialrangebar.d r9 = r7.f3166Q
            boolean r9 = r9.isPressed()
            if (r9 == 0) goto L_0x001e
            com.appyvet.materialrangebar.d r8 = r7.f3166Q
        L_0x001a:
            r7.m4394b(r8)
            goto L_0x0079
        L_0x001e:
            boolean r9 = r7.f3209u0
            if (r9 != 0) goto L_0x0079
            float r9 = r7.m4382a(r8)
            float r1 = r7.m4390b(r8)
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x003a
            boolean r9 = r7.f3174b0
            if (r9 == 0) goto L_0x003a
            com.appyvet.materialrangebar.d r9 = r7.f3165P
            r9.setX(r8)
            com.appyvet.materialrangebar.d r8 = r7.f3165P
            goto L_0x0041
        L_0x003a:
            com.appyvet.materialrangebar.d r9 = r7.f3166Q
            r9.setX(r8)
            com.appyvet.materialrangebar.d r8 = r7.f3166Q
        L_0x0041:
            r7.m4394b(r8)
            boolean r8 = r7.f3174b0
            if (r8 == 0) goto L_0x0052
            com.appyvet.materialrangebar.a r8 = r7.f3167R
            com.appyvet.materialrangebar.d r9 = r7.f3165P
            int r8 = r8.mo4494b(r9)
            r3 = r8
            goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            com.appyvet.materialrangebar.a r8 = r7.f3167R
            com.appyvet.materialrangebar.d r9 = r7.f3166Q
            int r4 = r8.mo4494b(r9)
            int r8 = r7.f3172W
            if (r3 != r8) goto L_0x0063
            int r8 = r7.f3173a0
            if (r4 == r8) goto L_0x0079
        L_0x0063:
            r7.f3172W = r3
            r7.f3173a0 = r4
            com.appyvet.materialrangebar.RangeBar$d r1 = r7.f3169T
            if (r1 == 0) goto L_0x0079
            java.lang.String r5 = r7.m4385a(r3)
            int r8 = r7.f3173a0
            java.lang.String r6 = r7.m4385a(r8)
            r2 = r7
            r1.mo4485a(r2, r3, r4, r5, r6)
        L_0x0079:
            r7.f3211v0 = r0
            com.appyvet.materialrangebar.RangeBar$d r8 = r7.f3169T
            if (r8 == 0) goto L_0x0082
            r8.mo4484a(r7)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appyvet.materialrangebar.RangeBar.m4399c(float, float):void");
    }

    /* renamed from: d */
    private void m4400d() {
        Context context = getContext();
        float yPos = getYPos();
        float f = isEnabled() ? this.f3151B / this.f3161L.density : 0.0f;
        if (this.f3174b0) {
            C0827d dVar = new C0827d(context);
            this.f3165P = dVar;
            dVar.mo4499a(context, yPos, f, this.f3192m, this.f3194n, this.f3157H, this.f3153D, this.f3155F, this.f3156G, this.f3158I, this.f3159J, this.f3207t0);
        }
        C0827d dVar2 = new C0827d(context);
        this.f3166Q = dVar2;
        dVar2.mo4499a(context, yPos, f, this.f3192m, this.f3194n, this.f3157H, this.f3154E, this.f3155F, this.f3156G, this.f3158I, this.f3159J, this.f3207t0);
        float marginLeft = getMarginLeft();
        float barLength = getBarLength();
        if (this.f3174b0) {
            this.f3165P.setX(((((float) this.f3172W) / ((float) (this.f3164O - 1))) * barLength) + marginLeft);
            this.f3165P.mo4501a(m4385a(this.f3172W));
        }
        this.f3166Q.setX(marginLeft + ((((float) this.f3173a0) / ((float) (this.f3164O - 1))) * barLength));
        this.f3166Q.mo4501a(m4385a(this.f3173a0));
        invalidate();
    }

    /* renamed from: d */
    private boolean m4401d(float f, float f2) {
        float f3 = this.f3180g;
        if (f >= f3) {
            float f4 = this.f3182h;
            if (f <= f4 && f2 >= f3 && f2 <= f4) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private boolean m4402e() {
        ViewParent parent = getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
        return false;
    }

    private float getBarLength() {
        return ((float) getWidth()) - (getMarginLeft() * 2.0f);
    }

    private float getMarginLeft() {
        return Math.max(this.f3151B, this.f3157H);
    }

    private float getYPos() {
        return ((float) getHeight()) - this.f3176d0;
    }

    /* renamed from: a */
    public void mo4422a(float f, float f2) {
        if (!m4401d(f, f2)) {
            if (this.f3160K) {
                this.f3160K = false;
            }
            float f3 = this.f3180g;
            float f4 = f - f3;
            float f5 = this.f3184i;
            this.f3172W = (int) (f4 / f5);
            this.f3173a0 = (int) ((f2 - f3) / f5);
            m4400d();
            C0821d dVar = this.f3169T;
            if (dVar != null) {
                int i = this.f3172W;
                dVar.mo4485a(this, i, this.f3173a0, m4385a(i), m4385a(this.f3173a0));
            }
            C0821d dVar2 = this.f3169T;
            if (dVar2 != null) {
                dVar2.mo4484a(this);
            }
            invalidate();
            requestLayout();
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str = "Pin value left ";
        sb.append(str);
        sb.append(f);
        String str2 = ", or right ";
        sb.append(str2);
        sb.append(f2);
        String str3 = " is out of bounds. Check that it is greater than the minimum (";
        sb.append(str3);
        sb.append(this.f3180g);
        String str4 = ") and less than the maximum value (";
        sb.append(str4);
        sb.append(this.f3182h);
        String str5 = ")";
        sb.append(str5);
        Log.e("RangeBar", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(f);
        sb2.append(str2);
        sb2.append(f2);
        sb2.append(str3);
        sb2.append(this.f3180g);
        sb2.append(str4);
        sb2.append(this.f3182h);
        sb2.append(str5);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public void mo4423a(int i, int i2) {
        if (!m4396b(i, i2)) {
            if (this.f3160K) {
                this.f3160K = false;
            }
            this.f3172W = i;
            this.f3173a0 = i2;
            m4400d();
            C0821d dVar = this.f3169T;
            if (dVar != null) {
                int i3 = this.f3172W;
                dVar.mo4485a(this, i3, this.f3173a0, m4385a(i3), m4385a(this.f3173a0));
            }
            invalidate();
            requestLayout();
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str = "Pin index left ";
        sb.append(str);
        sb.append(i);
        String str2 = ", or right ";
        sb.append(str2);
        sb.append(i2);
        String str3 = " is out of bounds. Check that it is greater than the minimum (";
        sb.append(str3);
        sb.append(this.f3180g);
        String str4 = ") and less than the maximum value (";
        sb.append(str4);
        sb.append(this.f3182h);
        String str5 = ")";
        sb.append(str5);
        Log.e("RangeBar", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i);
        sb2.append(str2);
        sb2.append(i2);
        sb2.append(str3);
        sb2.append(this.f3180g);
        sb2.append(str4);
        sb2.append(this.f3182h);
        sb2.append(str5);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public boolean mo4424a() {
        return this.f3174b0;
    }

    public int getLeftIndex() {
        return this.f3172W;
    }

    public String getLeftPinValue() {
        return m4385a(this.f3172W);
    }

    public int getLeftSelectorColor() {
        return this.f3153D;
    }

    public int getRightIndex() {
        return this.f3173a0;
    }

    public String getRightPinValue() {
        return m4385a(this.f3173a0);
    }

    public int getRightSelectorColor() {
        return this.f3154E;
    }

    public CharSequence[] getTickBottomLabels() {
        return this.f3216y;
    }

    public ArrayList<Integer> getTickColors() {
        return this.f3204s;
    }

    public int getTickCount() {
        return this.f3164O;
    }

    public float getTickEnd() {
        return this.f3182h;
    }

    public double getTickInterval() {
        return (double) this.f3184i;
    }

    public float getTickStart() {
        return this.f3180g;
    }

    public CharSequence[] getTickTopLabels() {
        return this.f3217z;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3167R.mo4490a(canvas);
        if (this.f3174b0) {
            this.f3168S.mo4496a(canvas, this.f3165P, this.f3166Q);
            if (this.f3205s0) {
                this.f3167R.mo4492a(canvas, this.f3151B, this.f3166Q, this.f3165P);
            }
            this.f3165P.draw(canvas);
        } else {
            this.f3168S.mo4495a(canvas, getMarginLeft(), this.f3166Q);
            if (this.f3205s0) {
                this.f3167R.mo4491a(canvas, this.f3151B, this.f3166Q);
            }
        }
        this.f3166Q.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f3213w0 = m4402e();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == Integer.MIN_VALUE || mode == 1073741824)) {
            size = this.f3162M;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(this.f3163N, size2);
        } else if (mode2 != 1073741824) {
            size2 = this.f3163N;
        }
        setMeasuredDimension(size, size2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f3164O = bundle.getInt("TICK_COUNT");
            this.f3180g = bundle.getFloat("TICK_START");
            this.f3182h = bundle.getFloat("TICK_END");
            this.f3184i = bundle.getFloat("TICK_INTERVAL");
            this.f3202r = bundle.getInt("TICK_COLOR");
            this.f3204s = bundle.getIntegerArrayList("TICK_COLORS");
            this.f3206t = bundle.getInt("TICK_LABEL_COLOR");
            this.f3208u = bundle.getInt("TICK_LABEL_SELECTED_COLOR");
            this.f3217z = bundle.getCharSequenceArray("TICK_TOP_LABELS");
            this.f3216y = bundle.getCharSequenceArray("TICK_BOTTOM_LABELS");
            this.f3150A = bundle.getString("TICK_DEFAULT_LABEL");
            this.f3178f = bundle.getFloat("TICK_HEIGHT_DP");
            this.f3186j = bundle.getFloat("BAR_WEIGHT");
            this.f3188k = bundle.getBoolean("BAR_ROUNDED", false);
            this.f3190l = bundle.getInt("BAR_COLOR");
            this.f3157H = bundle.getFloat("CIRCLE_SIZE");
            this.f3152C = bundle.getInt("CIRCLE_COLOR");
            this.f3153D = bundle.getInt("CIRCLE_COLOR_LEFT");
            this.f3154E = bundle.getInt("CIRCLE_COLOR_RIGHT");
            this.f3155F = bundle.getInt("CIRCLE_BOUNDARY_COLOR");
            this.f3156G = bundle.getFloat("CIRCLE_BOUNDARY_WIDTH");
            this.f3196o = bundle.getFloat("CONNECTING_LINE_WEIGHT");
            this.f3198p = bundle.getIntegerArrayList("CONNECTING_LINE_COLOR");
            this.f3200q = bundle.getFloat("THUMB_RADIUS_DP");
            this.f3151B = bundle.getFloat("EXPANDED_PIN_RADIUS_DP");
            this.f3175c0 = bundle.getFloat("PIN_PADDING");
            this.f3176d0 = bundle.getFloat("BAR_PADDING_BOTTOM");
            this.f3174b0 = bundle.getBoolean("IS_RANGE_BAR");
            this.f3209u0 = bundle.getBoolean("IS_ONLY_ON_DRAG");
            this.f3207t0 = bundle.getBoolean("ARE_PINS_TEMPORARY");
            this.f3172W = bundle.getInt("LEFT_INDEX");
            this.f3173a0 = bundle.getInt("RIGHT_INDEX");
            this.f3160K = bundle.getBoolean("FIRST_SET_TICK_COUNT");
            this.f3158I = bundle.getFloat("MIN_PIN_FONT");
            this.f3159J = bundle.getFloat("MAX_PIN_FONT");
            mo4423a(this.f3172W, this.f3173a0);
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("TICK_COUNT", this.f3164O);
        bundle.putFloat("TICK_START", this.f3180g);
        bundle.putFloat("TICK_END", this.f3182h);
        bundle.putFloat("TICK_INTERVAL", this.f3184i);
        bundle.putInt("TICK_COLOR", this.f3202r);
        bundle.putIntegerArrayList("TICK_COLORS", this.f3204s);
        bundle.putInt("TICK_LABEL_COLOR", this.f3206t);
        bundle.putInt("TICK_LABEL_SELECTED_COLOR", this.f3208u);
        bundle.putCharSequenceArray("TICK_TOP_LABELS", this.f3217z);
        bundle.putCharSequenceArray("TICK_BOTTOM_LABELS", this.f3216y);
        bundle.putString("TICK_DEFAULT_LABEL", this.f3150A);
        bundle.putFloat("TICK_HEIGHT_DP", this.f3178f);
        bundle.putFloat("BAR_WEIGHT", this.f3186j);
        bundle.putBoolean("BAR_ROUNDED", this.f3188k);
        bundle.putInt("BAR_COLOR", this.f3190l);
        bundle.putFloat("CONNECTING_LINE_WEIGHT", this.f3196o);
        bundle.putIntegerArrayList("CONNECTING_LINE_COLOR", this.f3198p);
        bundle.putFloat("CIRCLE_SIZE", this.f3157H);
        bundle.putInt("CIRCLE_COLOR", this.f3152C);
        bundle.putInt("CIRCLE_COLOR_LEFT", this.f3153D);
        bundle.putInt("CIRCLE_COLOR_RIGHT", this.f3154E);
        bundle.putInt("CIRCLE_BOUNDARY_COLOR", this.f3155F);
        bundle.putFloat("CIRCLE_BOUNDARY_WIDTH", this.f3156G);
        bundle.putFloat("THUMB_RADIUS_DP", this.f3200q);
        bundle.putFloat("EXPANDED_PIN_RADIUS_DP", this.f3151B);
        bundle.putFloat("PIN_PADDING", this.f3175c0);
        bundle.putFloat("BAR_PADDING_BOTTOM", this.f3176d0);
        bundle.putBoolean("IS_RANGE_BAR", this.f3174b0);
        bundle.putBoolean("IS_ONLY_ON_DRAG", this.f3209u0);
        bundle.putBoolean("ARE_PINS_TEMPORARY", this.f3207t0);
        bundle.putInt("LEFT_INDEX", this.f3172W);
        bundle.putInt("RIGHT_INDEX", this.f3173a0);
        bundle.putBoolean("FIRST_SET_TICK_COUNT", this.f3160K);
        bundle.putFloat("MIN_PIN_FONT", this.f3158I);
        bundle.putFloat("MAX_PIN_FONT", this.f3159J);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        super.onSizeChanged(i, i2, i3, i4);
        Context context = getContext();
        float f2 = this.f3151B / this.f3161L.density;
        float f3 = ((float) i2) - this.f3176d0;
        if (this.f3174b0) {
            C0827d dVar = new C0827d(context);
            this.f3165P = dVar;
            dVar.mo4500a(this.f3203r0);
            this.f3165P.mo4499a(context, f3, f2, this.f3192m, this.f3194n, this.f3157H, this.f3153D, this.f3155F, this.f3156G, this.f3158I, this.f3159J, this.f3207t0);
        }
        C0827d dVar2 = new C0827d(context);
        this.f3166Q = dVar2;
        dVar2.mo4500a(this.f3203r0);
        Context context2 = context;
        this.f3166Q.mo4499a(context2, f3, f2, this.f3192m, this.f3194n, this.f3157H, this.f3154E, this.f3155F, this.f3156G, this.f3158I, this.f3159J, this.f3207t0);
        float max = Math.max(this.f3151B, this.f3157H);
        float f4 = ((float) i) - (2.0f * max);
        C0824a aVar = new C0824a(context2, max, f3, f4, this.f3164O, this.f3178f, this.f3202r, this.f3204s, this.f3186j, this.f3190l, this.f3188k, this.f3206t, this.f3208u, this.f3217z, this.f3216y, this.f3150A, this.f3214x);
        this.f3167R = aVar;
        if (this.f3174b0) {
            this.f3165P.setX(((((float) this.f3172W) / ((float) (this.f3164O - 1))) * f4) + max);
            this.f3165P.mo4501a(m4385a(this.f3172W));
        }
        this.f3166Q.setX(max + ((((float) this.f3173a0) / ((float) (this.f3164O - 1))) * f4));
        this.f3166Q.mo4501a(m4385a(this.f3173a0));
        int b = this.f3174b0 ? this.f3167R.mo4494b(this.f3165P) : 0;
        int b2 = this.f3167R.mo4494b(this.f3166Q);
        if (!(b == this.f3172W && b2 == this.f3173a0)) {
            C0821d dVar3 = this.f3169T;
            if (dVar3 != null) {
                int i5 = this.f3172W;
                f = f3;
                dVar3.mo4485a(this, i5, this.f3173a0, m4385a(i5), m4385a(this.f3173a0));
                this.f3168S = new C0825b(f, this.f3196o, this.f3198p);
            }
        }
        f = f3;
        this.f3168S = new C0825b(f, this.f3196o, this.f3198p);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f3195n0 = 0;
            this.f3197o0 = 0;
            this.f3199p0 = motionEvent.getX();
            this.f3201q0 = motionEvent.getY();
            if (!this.f3213w0) {
                m4393b(motionEvent.getX(), motionEvent.getY());
            }
            return true;
        } else if (action == 1) {
            if (this.f3211v0 || (motionEvent.getX() == this.f3199p0 && motionEvent.getY() == this.f3201q0)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                m4399c(motionEvent.getX(), motionEvent.getY());
            }
            return true;
        } else if (action == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f3195n0 = (int) (((float) this.f3195n0) + Math.abs(x - this.f3199p0));
            int abs = (int) (((float) this.f3197o0) + Math.abs(y - this.f3201q0));
            this.f3197o0 = abs;
            this.f3199p0 = x;
            this.f3201q0 = y;
            if (this.f3211v0) {
                m4398c(motionEvent.getX());
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f3195n0 >= this.f3197o0) {
                    return true;
                }
                if (!this.f3213w0) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            } else if (this.f3195n0 <= abs) {
                return false;
            } else {
                m4393b(motionEvent.getX(), motionEvent.getY());
                return true;
            }
        } else if (action != 3) {
            return false;
        } else {
            if (this.f3211v0 || (motionEvent.getX() == this.f3199p0 && motionEvent.getY() == this.f3201q0)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                m4399c(motionEvent.getX(), motionEvent.getY());
            }
            return true;
        }
    }

    public void setBarColor(int i) {
        this.f3190l = i;
        m4392b();
    }

    public void setBarRounded(boolean z) {
        this.f3188k = z;
        m4392b();
    }

    public void setBarWeight(float f) {
        this.f3186j = f;
        m4392b();
    }

    public void setConnectingLineColor(int i) {
        this.f3198p.clear();
        this.f3198p.add(Integer.valueOf(i));
        m4397c();
    }

    public void setConnectingLineColors(ArrayList<Integer> arrayList) {
        this.f3198p = new ArrayList<>(arrayList);
        m4397c();
    }

    public void setConnectingLineWeight(float f) {
        this.f3196o = f;
        m4397c();
    }

    public void setDrawTicks(boolean z) {
        this.f3205s0 = z;
    }

    public void setEnabled(boolean z) {
        int i;
        if (!z) {
            i = -3355444;
            this.f3190l = -3355444;
            setConnectingLineColor(-3355444);
            this.f3152C = -3355444;
            this.f3153D = -3355444;
            this.f3154E = -3355444;
            this.f3155F = -3355444;
            this.f3202r = -3355444;
            setTickColors(-3355444);
            this.f3206t = -3355444;
        } else {
            this.f3190l = this.f3181g0;
            setConnectingLineColor(this.f3177e0);
            setConnectingLineColors(this.f3179f0);
            this.f3152C = this.f3187j0;
            this.f3153D = this.f3189k0;
            this.f3154E = this.f3191l0;
            this.f3155F = this.f3193m0;
            this.f3202r = this.f3183h0;
            setTickColors(this.f3185i0);
            this.f3206t = this.f3210v;
            i = this.f3212w;
        }
        this.f3208u = i;
        super.setEnabled(z);
        m4392b();
        m4400d();
        m4397c();
    }

    public void setFormatter(C0826c cVar) {
        C0827d dVar = this.f3165P;
        if (dVar != null) {
            dVar.mo4500a(cVar);
        }
        C0827d dVar2 = this.f3166Q;
        if (dVar2 != null) {
            dVar2.mo4500a(cVar);
        }
        this.f3203r0 = cVar;
    }

    public void setLeftSelectorColor(int i) {
        this.f3153D = i;
        m4400d();
    }

    public void setOnRangeBarChangeListener(C0821d dVar) {
        this.f3169T = dVar;
    }

    public void setOnlyOnDrag(boolean z) {
        this.f3209u0 = z;
    }

    public void setPinColor(int i) {
        this.f3192m = i;
        m4400d();
    }

    public void setPinRadius(float f) {
        this.f3151B = f;
        m4400d();
    }

    public void setPinTextColor(int i) {
        this.f3194n = i;
        m4400d();
    }

    public void setPinTextFormatter(C0823f fVar) {
        this.f3215x0 = fVar;
    }

    public void setPinTextListener(C0822e eVar) {
        this.f3170U = eVar;
    }

    public void setRangeBarEnabled(boolean z) {
        this.f3174b0 = z;
        invalidate();
    }

    public void setRightSelectorColor(int i) {
        this.f3154E = i;
        m4400d();
    }

    public void setSeekPinByIndex(int i) {
        if (i < 0 || i > this.f3164O) {
            StringBuilder sb = new StringBuilder();
            String str = "Pin index ";
            sb.append(str);
            sb.append(i);
            String str2 = " is out of bounds. Check that it is greater than the minimum (";
            sb.append(str2);
            sb.append(0);
            String str3 = ") and less than the maximum value (";
            sb.append(str3);
            sb.append(this.f3164O);
            String str4 = ")";
            sb.append(str4);
            Log.e("RangeBar", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(i);
            sb2.append(str2);
            sb2.append(0);
            sb2.append(str3);
            sb2.append(this.f3164O);
            sb2.append(str4);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (this.f3160K) {
            this.f3160K = false;
        }
        this.f3173a0 = i;
        m4400d();
        C0821d dVar = this.f3169T;
        if (dVar != null) {
            int i2 = this.f3172W;
            dVar.mo4485a(this, i2, this.f3173a0, m4385a(i2), m4385a(this.f3173a0));
        }
        invalidate();
        requestLayout();
    }

    public void setSeekPinByValue(float f) {
        if (f > this.f3182h || f < this.f3180g) {
            StringBuilder sb = new StringBuilder();
            String str = "Pin value ";
            sb.append(str);
            sb.append(f);
            String str2 = " is out of bounds. Check that it is greater than the minimum (";
            sb.append(str2);
            sb.append(this.f3180g);
            String str3 = ") and less than the maximum value (";
            sb.append(str3);
            sb.append(this.f3182h);
            String str4 = ")";
            sb.append(str4);
            Log.e("RangeBar", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(f);
            sb2.append(str2);
            sb2.append(this.f3180g);
            sb2.append(str3);
            sb2.append(this.f3182h);
            sb2.append(str4);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (this.f3160K) {
            this.f3160K = false;
        }
        this.f3173a0 = (int) ((f - this.f3180g) / this.f3184i);
        m4400d();
        C0821d dVar = this.f3169T;
        if (dVar != null) {
            int i = this.f3172W;
            dVar.mo4485a(this, i, this.f3173a0, m4385a(i), m4385a(this.f3173a0));
        }
        invalidate();
        requestLayout();
    }

    public void setSelectorBoundaryColor(int i) {
        this.f3155F = i;
        m4400d();
    }

    public void setSelectorBoundarySize(int i) {
        this.f3156G = (float) i;
        m4400d();
    }

    public void setSelectorColor(int i) {
        this.f3152C = i;
        setLeftSelectorColor(i);
        setRightSelectorColor(i);
        m4400d();
    }

    public void setTemporaryPins(boolean z) {
        this.f3207t0 = z;
        invalidate();
    }

    public void setTickBottomLabels(CharSequence[] charSequenceArr) {
        this.f3216y = charSequenceArr;
        m4392b();
    }

    public void setTickColors(int i) {
        for (int i2 = 0; i2 < this.f3204s.size(); i2++) {
            this.f3204s.set(i2, Integer.valueOf(i));
        }
        m4392b();
    }

    public void setTickColors(ArrayList<Integer> arrayList) {
        this.f3204s = new ArrayList<>(arrayList);
        m4392b();
    }

    public void setTickDefaultColor(int i) {
        this.f3202r = i;
        setTickColors(i);
        m4392b();
    }

    public void setTickEnd(float f) {
        int i = ((int) ((f - this.f3180g) / this.f3184i)) + 1;
        if (m4395b(i)) {
            this.f3164O = i;
            this.f3182h = f;
            if (this.f3160K) {
                this.f3172W = 0;
                int i2 = i - 1;
                this.f3173a0 = i2;
                C0821d dVar = this.f3169T;
                if (dVar != null) {
                    dVar.mo4485a(this, 0, i2, m4385a(0), m4385a(this.f3173a0));
                }
            }
            if (m4396b(this.f3172W, this.f3173a0)) {
                this.f3172W = 0;
                int i3 = this.f3164O - 1;
                this.f3173a0 = i3;
                C0821d dVar2 = this.f3169T;
                if (dVar2 != null) {
                    dVar2.mo4485a(this, 0, i3, m4385a(0), m4385a(this.f3173a0));
                }
            }
            m4392b();
            m4400d();
            return;
        }
        String str = "tickCount less than 2; invalid tickCount.";
        Log.e("RangeBar", str);
        throw new IllegalArgumentException(str);
    }

    public void setTickHeight(float f) {
        this.f3178f = f;
        m4392b();
    }

    public void setTickInterval(float f) {
        int i = ((int) ((this.f3182h - this.f3180g) / f)) + 1;
        if (m4395b(i)) {
            this.f3164O = i;
            this.f3184i = f;
            if (this.f3160K) {
                this.f3172W = 0;
                int i2 = i - 1;
                this.f3173a0 = i2;
                C0821d dVar = this.f3169T;
                if (dVar != null) {
                    dVar.mo4485a(this, 0, i2, m4385a(0), m4385a(this.f3173a0));
                }
            }
            if (m4396b(this.f3172W, this.f3173a0)) {
                this.f3172W = 0;
                int i3 = this.f3164O - 1;
                this.f3173a0 = i3;
                C0821d dVar2 = this.f3169T;
                if (dVar2 != null) {
                    dVar2.mo4485a(this, 0, i3, m4385a(0), m4385a(this.f3173a0));
                }
            }
            m4392b();
            m4400d();
            return;
        }
        String str = "tickCount less than 2; invalid tickCount.";
        Log.e("RangeBar", str);
        throw new IllegalArgumentException(str);
    }

    public void setTickLabelColor(int i) {
        this.f3206t = i;
        m4392b();
    }

    public void setTickLabelSelectedColor(int i) {
        this.f3208u = i;
        m4392b();
    }

    public void setTickStart(float f) {
        int i = ((int) ((this.f3182h - f) / this.f3184i)) + 1;
        if (m4395b(i)) {
            this.f3164O = i;
            this.f3180g = f;
            if (this.f3160K) {
                this.f3172W = 0;
                int i2 = i - 1;
                this.f3173a0 = i2;
                C0821d dVar = this.f3169T;
                if (dVar != null) {
                    dVar.mo4485a(this, 0, i2, m4385a(0), m4385a(this.f3173a0));
                }
            }
            if (m4396b(this.f3172W, this.f3173a0)) {
                this.f3172W = 0;
                int i3 = this.f3164O - 1;
                this.f3173a0 = i3;
                C0821d dVar2 = this.f3169T;
                if (dVar2 != null) {
                    dVar2.mo4485a(this, 0, i3, m4385a(0), m4385a(this.f3173a0));
                }
            }
            m4392b();
            m4400d();
            return;
        }
        String str = "tickCount less than 2; invalid tickCount.";
        Log.e("RangeBar", str);
        throw new IllegalArgumentException(str);
    }

    public void setTickTopLabels(CharSequence[] charSequenceArr) {
        this.f3217z = charSequenceArr;
        m4392b();
    }
}
