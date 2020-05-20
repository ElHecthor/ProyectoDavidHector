package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import p071f.p097h.p103h.C3276a;
import p071f.p097h.p106k.C3306f;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.p189m.C4417a;
import p147g.p156d.p157a.p185c.p202y.C4456a;
import p147g.p156d.p157a.p185c.p202y.C4456a.C4457a;
import p147g.p156d.p157a.p185c.p202y.C4460d;
import p147g.p156d.p157a.p185c.p202y.C4464f;

/* renamed from: com.google.android.material.internal.a */
public final class C2699a {

    /* renamed from: V */
    private static final boolean f7814V = (VERSION.SDK_INT < 18);

    /* renamed from: W */
    private static final Paint f7815W;

    /* renamed from: A */
    private boolean f7816A;

    /* renamed from: B */
    private Bitmap f7817B;

    /* renamed from: C */
    private Paint f7818C;

    /* renamed from: D */
    private float f7819D;

    /* renamed from: E */
    private float f7820E;

    /* renamed from: F */
    private float f7821F;

    /* renamed from: G */
    private float f7822G;

    /* renamed from: H */
    private int[] f7823H;

    /* renamed from: I */
    private boolean f7824I;

    /* renamed from: J */
    private final TextPaint f7825J;

    /* renamed from: K */
    private final TextPaint f7826K;

    /* renamed from: L */
    private TimeInterpolator f7827L;

    /* renamed from: M */
    private TimeInterpolator f7828M;

    /* renamed from: N */
    private float f7829N;

    /* renamed from: O */
    private float f7830O;

    /* renamed from: P */
    private float f7831P;

    /* renamed from: Q */
    private ColorStateList f7832Q;

    /* renamed from: R */
    private float f7833R;

    /* renamed from: S */
    private float f7834S;

    /* renamed from: T */
    private float f7835T;

    /* renamed from: U */
    private ColorStateList f7836U;

    /* renamed from: a */
    private final View f7837a;

    /* renamed from: b */
    private boolean f7838b;

    /* renamed from: c */
    private float f7839c;

    /* renamed from: d */
    private final Rect f7840d;

    /* renamed from: e */
    private final Rect f7841e;

    /* renamed from: f */
    private final RectF f7842f;

    /* renamed from: g */
    private int f7843g = 16;

    /* renamed from: h */
    private int f7844h = 16;

    /* renamed from: i */
    private float f7845i = 15.0f;

    /* renamed from: j */
    private float f7846j = 15.0f;

    /* renamed from: k */
    private ColorStateList f7847k;

    /* renamed from: l */
    private ColorStateList f7848l;

    /* renamed from: m */
    private float f7849m;

    /* renamed from: n */
    private float f7850n;

    /* renamed from: o */
    private float f7851o;

    /* renamed from: p */
    private float f7852p;

    /* renamed from: q */
    private float f7853q;

    /* renamed from: r */
    private float f7854r;

    /* renamed from: s */
    private Typeface f7855s;

    /* renamed from: t */
    private Typeface f7856t;

    /* renamed from: u */
    private Typeface f7857u;

    /* renamed from: v */
    private C4456a f7858v;

    /* renamed from: w */
    private C4456a f7859w;

    /* renamed from: x */
    private CharSequence f7860x;

    /* renamed from: y */
    private CharSequence f7861y;

    /* renamed from: z */
    private boolean f7862z;

    /* renamed from: com.google.android.material.internal.a$a */
    class C2700a implements C4457a {
        C2700a() {
        }

        /* renamed from: a */
        public void mo8965a(Typeface typeface) {
            C2699a.this.mo8946a(typeface);
        }
    }

    static {
        Paint paint = null;
        f7815W = paint;
        if (paint != null) {
            paint.setAntiAlias(true);
            f7815W.setColor(-65281);
        }
    }

    public C2699a(View view) {
        this.f7837a = view;
        this.f7825J = new TextPaint(129);
        this.f7826K = new TextPaint(this.f7825J);
        this.f7841e = new Rect();
        this.f7840d = new Rect();
        this.f7842f = new RectF();
    }

    /* renamed from: a */
    private static float m11198a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C4417a.m18005a(f, f2, f3);
    }

    /* renamed from: a */
    private float m11199a(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) - (mo8937a() / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            return this.f7862z ? (float) this.f7841e.left : ((float) this.f7841e.right) - mo8937a();
        }
        return this.f7862z ? ((float) this.f7841e.right) - mo8937a() : (float) this.f7841e.left;
    }

    /* renamed from: a */
    private static int m11200a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private void m11201a(TextPaint textPaint) {
        textPaint.setTextSize(this.f7846j);
        textPaint.setTypeface(this.f7855s);
    }

    /* renamed from: a */
    private static boolean m11202a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: a */
    private static boolean m11203a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: b */
    private float m11204b(RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) + (mo8937a() / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            return this.f7862z ? rectF.left + mo8937a() : (float) this.f7841e.right;
        }
        return this.f7862z ? (float) this.f7841e.right : rectF.left + mo8937a();
    }

    /* renamed from: b */
    private void m11205b(TextPaint textPaint) {
        textPaint.setTextSize(this.f7845i);
        textPaint.setTypeface(this.f7856t);
    }

    /* renamed from: b */
    private boolean m11206b(CharSequence charSequence) {
        boolean z = true;
        if (C3379v.m13829p(this.f7837a) != 1) {
            z = false;
        }
        return (z ? C3306f.f9483d : C3306f.f9482c).mo10689a(charSequence, 0, charSequence.length());
    }

    /* renamed from: c */
    private int m11207c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f7823H;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: c */
    private void m11208c(float f) {
        int i;
        TextPaint textPaint;
        m11212e(f);
        this.f7853q = m11198a(this.f7851o, this.f7852p, f, this.f7827L);
        this.f7854r = m11198a(this.f7849m, this.f7850n, f, this.f7827L);
        m11213f(m11198a(this.f7845i, this.f7846j, f, this.f7828M));
        if (this.f7848l != this.f7847k) {
            textPaint = this.f7825J;
            i = m11200a(m11218n(), mo8959d(), f);
        } else {
            textPaint = this.f7825J;
            i = mo8959d();
        }
        textPaint.setColor(i);
        this.f7825J.setShadowLayer(m11198a(this.f7833R, this.f7829N, f, (TimeInterpolator) null), m11198a(this.f7834S, this.f7830O, f, (TimeInterpolator) null), m11198a(this.f7835T, this.f7831P, f, (TimeInterpolator) null), m11200a(m11207c(this.f7836U), m11207c(this.f7832Q), f));
        C3379v.m13772H(this.f7837a);
    }

    /* renamed from: c */
    private boolean m11209c(Typeface typeface) {
        C4456a aVar = this.f7859w;
        if (aVar != null) {
            aVar.mo13265a();
        }
        if (this.f7855s == typeface) {
            return false;
        }
        this.f7855s = typeface;
        return true;
    }

    /* renamed from: d */
    private void m11210d(float f) {
        float f2;
        boolean z;
        boolean z2;
        if (this.f7860x != null) {
            float width = (float) this.f7841e.width();
            float width2 = (float) this.f7840d.width();
            boolean z3 = true;
            if (m11202a(f, this.f7846j)) {
                f2 = this.f7846j;
                this.f7821F = 1.0f;
                Typeface typeface = this.f7857u;
                Typeface typeface2 = this.f7855s;
                if (typeface != typeface2) {
                    this.f7857u = typeface2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                float f3 = this.f7845i;
                Typeface typeface3 = this.f7857u;
                Typeface typeface4 = this.f7856t;
                if (typeface3 != typeface4) {
                    this.f7857u = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m11202a(f, this.f7845i)) {
                    this.f7821F = 1.0f;
                } else {
                    this.f7821F = f / this.f7845i;
                }
                float f4 = this.f7846j / this.f7845i;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
                f2 = f3;
                z = z2;
            }
            if (width > 0.0f) {
                z = this.f7822G != f2 || this.f7824I || z;
                this.f7822G = f2;
                this.f7824I = false;
            }
            if (this.f7861y == null || z) {
                this.f7825J.setTextSize(this.f7822G);
                this.f7825J.setTypeface(this.f7857u);
                TextPaint textPaint = this.f7825J;
                if (this.f7821F == 1.0f) {
                    z3 = false;
                }
                textPaint.setLinearText(z3);
                CharSequence ellipsize = TextUtils.ellipsize(this.f7860x, this.f7825J, width, TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f7861y)) {
                    this.f7861y = ellipsize;
                    this.f7862z = m11206b(ellipsize);
                }
            }
        }
    }

    /* renamed from: d */
    private boolean m11211d(Typeface typeface) {
        C4456a aVar = this.f7858v;
        if (aVar != null) {
            aVar.mo13265a();
        }
        if (this.f7856t == typeface) {
            return false;
        }
        this.f7856t = typeface;
        return true;
    }

    /* renamed from: e */
    private void m11212e(float f) {
        this.f7842f.left = m11198a((float) this.f7840d.left, (float) this.f7841e.left, f, this.f7827L);
        this.f7842f.top = m11198a(this.f7849m, this.f7850n, f, this.f7827L);
        this.f7842f.right = m11198a((float) this.f7840d.right, (float) this.f7841e.right, f, this.f7827L);
        this.f7842f.bottom = m11198a((float) this.f7840d.bottom, (float) this.f7841e.bottom, f, this.f7827L);
    }

    /* renamed from: f */
    private void m11213f(float f) {
        m11210d(f);
        boolean z = f7814V && this.f7821F != 1.0f;
        this.f7816A = z;
        if (z) {
            m11217m();
        }
        C3379v.m13772H(this.f7837a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ea  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11214j() {
        /*
            r11 = this;
            float r0 = r11.f7822G
            float r1 = r11.f7846j
            r11.m11210d(r1)
            java.lang.CharSequence r1 = r11.f7861y
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0018
            android.text.TextPaint r4 = r11.f7825J
            int r5 = r1.length()
            float r1 = r4.measureText(r1, r2, r5)
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            int r4 = r11.f7844h
            boolean r5 = r11.f7862z
            int r4 = p071f.p097h.p108m.C3339d.m13606a(r4, r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 80
            r7 = 48
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L_0x0053
            if (r5 == r6) goto L_0x004d
            android.text.TextPaint r5 = r11.f7825J
            float r5 = r5.descent()
            android.text.TextPaint r9 = r11.f7825J
            float r9 = r9.ascent()
            float r5 = r5 - r9
            float r5 = r5 / r8
            android.text.TextPaint r9 = r11.f7825J
            float r9 = r9.descent()
            float r5 = r5 - r9
            android.graphics.Rect r9 = r11.f7841e
            int r9 = r9.centerY()
            float r9 = (float) r9
            float r9 = r9 + r5
            r11.f7850n = r9
            goto L_0x0061
        L_0x004d:
            android.graphics.Rect r5 = r11.f7841e
            int r5 = r5.bottom
            float r5 = (float) r5
            goto L_0x005f
        L_0x0053:
            android.graphics.Rect r5 = r11.f7841e
            int r5 = r5.top
            float r5 = (float) r5
            android.text.TextPaint r9 = r11.f7825J
            float r9 = r9.ascent()
            float r5 = r5 - r9
        L_0x005f:
            r11.f7850n = r5
        L_0x0061:
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r9 = 5
            r10 = 1
            if (r4 == r10) goto L_0x0079
            if (r4 == r9) goto L_0x0073
            android.graphics.Rect r1 = r11.f7841e
            int r1 = r1.left
            float r1 = (float) r1
            r11.f7852p = r1
            goto L_0x0084
        L_0x0073:
            android.graphics.Rect r4 = r11.f7841e
            int r4 = r4.right
            float r4 = (float) r4
            goto L_0x0081
        L_0x0079:
            android.graphics.Rect r4 = r11.f7841e
            int r4 = r4.centerX()
            float r4 = (float) r4
            float r1 = r1 / r8
        L_0x0081:
            float r4 = r4 - r1
            r11.f7852p = r4
        L_0x0084:
            float r1 = r11.f7845i
            r11.m11210d(r1)
            java.lang.CharSequence r1 = r11.f7861y
            if (r1 == 0) goto L_0x0097
            android.text.TextPaint r3 = r11.f7825J
            int r4 = r1.length()
            float r3 = r3.measureText(r1, r2, r4)
        L_0x0097:
            int r1 = r11.f7843g
            boolean r2 = r11.f7862z
            int r1 = p071f.p097h.p108m.C3339d.m13606a(r1, r2)
            r2 = r1 & 112(0x70, float:1.57E-43)
            if (r2 == r7) goto L_0x00cb
            if (r2 == r6) goto L_0x00c5
            android.text.TextPaint r2 = r11.f7825J
            float r2 = r2.descent()
            android.text.TextPaint r4 = r11.f7825J
            float r4 = r4.ascent()
            float r2 = r2 - r4
            float r2 = r2 / r8
            android.text.TextPaint r4 = r11.f7825J
            float r4 = r4.descent()
            float r2 = r2 - r4
            android.graphics.Rect r4 = r11.f7840d
            int r4 = r4.centerY()
            float r4 = (float) r4
            float r4 = r4 + r2
            r11.f7849m = r4
            goto L_0x00d9
        L_0x00c5:
            android.graphics.Rect r2 = r11.f7840d
            int r2 = r2.bottom
            float r2 = (float) r2
            goto L_0x00d7
        L_0x00cb:
            android.graphics.Rect r2 = r11.f7840d
            int r2 = r2.top
            float r2 = (float) r2
            android.text.TextPaint r4 = r11.f7825J
            float r4 = r4.ascent()
            float r2 = r2 - r4
        L_0x00d7:
            r11.f7849m = r2
        L_0x00d9:
            r1 = r1 & r5
            if (r1 == r10) goto L_0x00ea
            if (r1 == r9) goto L_0x00e4
            android.graphics.Rect r1 = r11.f7840d
            int r1 = r1.left
            float r1 = (float) r1
            goto L_0x00f3
        L_0x00e4:
            android.graphics.Rect r1 = r11.f7840d
            int r1 = r1.right
            float r1 = (float) r1
            goto L_0x00f2
        L_0x00ea:
            android.graphics.Rect r1 = r11.f7840d
            int r1 = r1.centerX()
            float r1 = (float) r1
            float r3 = r3 / r8
        L_0x00f2:
            float r1 = r1 - r3
        L_0x00f3:
            r11.f7851o = r1
            r11.m11216l()
            r11.m11213f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C2699a.m11214j():void");
    }

    /* renamed from: k */
    private void m11215k() {
        m11208c(this.f7839c);
    }

    /* renamed from: l */
    private void m11216l() {
        Bitmap bitmap = this.f7817B;
        if (bitmap != null) {
            bitmap.recycle();
            this.f7817B = null;
        }
    }

    /* renamed from: m */
    private void m11217m() {
        if (this.f7817B == null && !this.f7840d.isEmpty() && !TextUtils.isEmpty(this.f7861y)) {
            m11208c(0.0f);
            this.f7819D = this.f7825J.ascent();
            this.f7820E = this.f7825J.descent();
            TextPaint textPaint = this.f7825J;
            CharSequence charSequence = this.f7861y;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.f7820E - this.f7819D);
            if (round > 0 && round2 > 0) {
                this.f7817B = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f7817B);
                CharSequence charSequence2 = this.f7861y;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.f7825J.descent(), this.f7825J);
                if (this.f7818C == null) {
                    this.f7818C = new Paint(3);
                }
            }
        }
    }

    /* renamed from: n */
    private int m11218n() {
        return m11207c(this.f7847k);
    }

    /* renamed from: a */
    public float mo8937a() {
        if (this.f7860x == null) {
            return 0.0f;
        }
        m11201a(this.f7826K);
        TextPaint textPaint = this.f7826K;
        CharSequence charSequence = this.f7860x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: a */
    public void mo8938a(float f) {
        if (this.f7845i != f) {
            this.f7845i = f;
            mo8964i();
        }
    }

    /* renamed from: a */
    public void mo8939a(int i) {
        C4460d dVar = new C4460d(this.f7837a.getContext(), i);
        ColorStateList colorStateList = dVar.f11803b;
        if (colorStateList != null) {
            this.f7848l = colorStateList;
        }
        float f = dVar.f11802a;
        if (f != 0.0f) {
            this.f7846j = f;
        }
        ColorStateList colorStateList2 = dVar.f11807f;
        if (colorStateList2 != null) {
            this.f7832Q = colorStateList2;
        }
        this.f7830O = dVar.f11808g;
        this.f7831P = dVar.f11809h;
        this.f7829N = dVar.f11810i;
        C4456a aVar = this.f7859w;
        if (aVar != null) {
            aVar.mo13265a();
        }
        this.f7859w = new C4456a(new C2700a(), dVar.mo13266a());
        dVar.mo13269a(this.f7837a.getContext(), (C4464f) this.f7859w);
        mo8964i();
    }

    /* renamed from: a */
    public void mo8940a(int i, int i2, int i3, int i4) {
        if (!m11203a(this.f7841e, i, i2, i3, i4)) {
            this.f7841e.set(i, i2, i3, i4);
            this.f7824I = true;
            mo8963h();
        }
    }

    /* renamed from: a */
    public void mo8941a(TimeInterpolator timeInterpolator) {
        this.f7827L = timeInterpolator;
        mo8964i();
    }

    /* renamed from: a */
    public void mo8942a(ColorStateList colorStateList) {
        if (this.f7848l != colorStateList) {
            this.f7848l = colorStateList;
            mo8964i();
        }
    }

    /* renamed from: a */
    public void mo8943a(Canvas canvas) {
        float f;
        int save = canvas.save();
        if (this.f7861y != null && this.f7838b) {
            float f2 = this.f7853q;
            float f3 = this.f7854r;
            boolean z = this.f7816A && this.f7817B != null;
            if (z) {
                f = this.f7819D * this.f7821F;
            } else {
                f = this.f7825J.ascent() * this.f7821F;
                this.f7825J.descent();
            }
            if (z) {
                f3 += f;
            }
            float f4 = f3;
            float f5 = this.f7821F;
            if (f5 != 1.0f) {
                canvas.scale(f5, f5, f2, f4);
            }
            if (z) {
                canvas.drawBitmap(this.f7817B, f2, f4, this.f7818C);
            } else {
                CharSequence charSequence = this.f7861y;
                canvas.drawText(charSequence, 0, charSequence.length(), f2, f4, this.f7825J);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    public void mo8944a(Rect rect) {
        mo8940a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: a */
    public void mo8945a(RectF rectF, int i, int i2) {
        this.f7862z = m11206b(this.f7860x);
        rectF.left = m11199a(i, i2);
        rectF.top = (float) this.f7841e.top;
        rectF.right = m11204b(rectF, i, i2);
        rectF.bottom = ((float) this.f7841e.top) + mo8957c();
    }

    /* renamed from: a */
    public void mo8946a(Typeface typeface) {
        if (m11209c(typeface)) {
            mo8964i();
        }
    }

    /* renamed from: a */
    public void mo8947a(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f7860x, charSequence)) {
            this.f7860x = charSequence;
            this.f7861y = null;
            m11216l();
            mo8964i();
        }
    }

    /* renamed from: a */
    public final boolean mo8948a(int[] iArr) {
        this.f7823H = iArr;
        if (!mo8962g()) {
            return false;
        }
        mo8964i();
        return true;
    }

    /* renamed from: b */
    public ColorStateList mo8949b() {
        return this.f7848l;
    }

    /* renamed from: b */
    public void mo8950b(float f) {
        float a = C3276a.m13437a(f, 0.0f, 1.0f);
        if (a != this.f7839c) {
            this.f7839c = a;
            m11215k();
        }
    }

    /* renamed from: b */
    public void mo8951b(int i) {
        if ((8388615 & i) == 0) {
            i |= 8388611;
        }
        if (this.f7844h != i) {
            this.f7844h = i;
            mo8964i();
        }
    }

    /* renamed from: b */
    public void mo8952b(int i, int i2, int i3, int i4) {
        if (!m11203a(this.f7840d, i, i2, i3, i4)) {
            this.f7840d.set(i, i2, i3, i4);
            this.f7824I = true;
            mo8963h();
        }
    }

    /* renamed from: b */
    public void mo8953b(TimeInterpolator timeInterpolator) {
        this.f7828M = timeInterpolator;
        mo8964i();
    }

    /* renamed from: b */
    public void mo8954b(ColorStateList colorStateList) {
        if (this.f7847k != colorStateList) {
            this.f7847k = colorStateList;
            mo8964i();
        }
    }

    /* renamed from: b */
    public void mo8955b(Rect rect) {
        mo8952b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: b */
    public void mo8956b(Typeface typeface) {
        boolean c = m11209c(typeface);
        boolean d = m11211d(typeface);
        if (c || d) {
            mo8964i();
        }
    }

    /* renamed from: c */
    public float mo8957c() {
        m11201a(this.f7826K);
        return -this.f7826K.ascent();
    }

    /* renamed from: c */
    public void mo8958c(int i) {
        if ((8388615 & i) == 0) {
            i |= 8388611;
        }
        if (this.f7843g != i) {
            this.f7843g = i;
            mo8964i();
        }
    }

    /* renamed from: d */
    public int mo8959d() {
        return m11207c(this.f7848l);
    }

    /* renamed from: e */
    public float mo8960e() {
        m11205b(this.f7826K);
        return -this.f7826K.ascent();
    }

    /* renamed from: f */
    public float mo8961f() {
        return this.f7839c;
    }

    /* renamed from: g */
    public final boolean mo8962g() {
        ColorStateList colorStateList = this.f7848l;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.f7847k;
            if (colorStateList2 == null || !colorStateList2.isStateful()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo8963h() {
        this.f7838b = this.f7841e.width() > 0 && this.f7841e.height() > 0 && this.f7840d.width() > 0 && this.f7840d.height() > 0;
    }

    /* renamed from: i */
    public void mo8964i() {
        if (this.f7837a.getHeight() > 0 && this.f7837a.getWidth() > 0) {
            m11214j();
            m11215k();
        }
    }
}
