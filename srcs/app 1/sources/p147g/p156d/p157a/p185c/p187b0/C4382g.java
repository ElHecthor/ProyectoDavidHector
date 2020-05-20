package p147g.p156d.p157a.p185c.p187b0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0372b;
import p071f.p097h.p107l.C3316c;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.p186a0.C4373a;
import p147g.p156d.p157a.p185c.p187b0.C4389k.C4392c;
import p147g.p156d.p157a.p185c.p187b0.C4393l.C4394a;
import p147g.p156d.p157a.p185c.p195r.C4445a;
import p147g.p156d.p157a.p185c.p198u.C4450a;

/* renamed from: g.d.a.c.b0.g */
public class C4382g extends Drawable implements C0372b, C4404n {

    /* renamed from: B */
    private static final Paint f11578B = new Paint(1);

    /* renamed from: A */
    private boolean f11579A;

    /* renamed from: f */
    private C4385c f11580f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C4403g[] f11581g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C4403g[] f11582h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f11583i;

    /* renamed from: j */
    private final Matrix f11584j;

    /* renamed from: k */
    private final Path f11585k;

    /* renamed from: l */
    private final Path f11586l;

    /* renamed from: m */
    private final RectF f11587m;

    /* renamed from: n */
    private final RectF f11588n;

    /* renamed from: o */
    private final Region f11589o;

    /* renamed from: p */
    private final Region f11590p;

    /* renamed from: q */
    private C4389k f11591q;

    /* renamed from: r */
    private final Paint f11592r;

    /* renamed from: s */
    private final Paint f11593s;

    /* renamed from: t */
    private final C4373a f11594t;

    /* renamed from: u */
    private final C4394a f11595u;

    /* renamed from: v */
    private final C4393l f11596v;

    /* renamed from: w */
    private PorterDuffColorFilter f11597w;

    /* renamed from: x */
    private PorterDuffColorFilter f11598x;

    /* renamed from: y */
    private Rect f11599y;

    /* renamed from: z */
    private final RectF f11600z;

    /* renamed from: g.d.a.c.b0.g$a */
    class C4383a implements C4394a {
        C4383a() {
        }

        /* renamed from: a */
        public void mo13093a(C4396m mVar, Matrix matrix, int i) {
            C4382g.this.f11582h[i] = mVar.mo13137a(matrix);
        }

        /* renamed from: b */
        public void mo13094b(C4396m mVar, Matrix matrix, int i) {
            C4382g.this.f11581g[i] = mVar.mo13137a(matrix);
        }
    }

    /* renamed from: g.d.a.c.b0.g$b */
    class C4384b implements C4392c {

        /* renamed from: a */
        final /* synthetic */ float f11602a;

        C4384b(C4382g gVar, float f) {
            this.f11602a = f;
        }

        /* renamed from: a */
        public C4378c mo13095a(C4378c cVar) {
            return cVar instanceof C4387i ? cVar : new C4377b(this.f11602a, cVar);
        }
    }

    /* renamed from: g.d.a.c.b0.g$c */
    static final class C4385c extends ConstantState {

        /* renamed from: a */
        public C4389k f11603a;

        /* renamed from: b */
        public C4450a f11604b;

        /* renamed from: c */
        public ColorFilter f11605c;

        /* renamed from: d */
        public ColorStateList f11606d = null;

        /* renamed from: e */
        public ColorStateList f11607e = null;

        /* renamed from: f */
        public ColorStateList f11608f = null;

        /* renamed from: g */
        public ColorStateList f11609g = null;

        /* renamed from: h */
        public Mode f11610h = Mode.SRC_IN;

        /* renamed from: i */
        public Rect f11611i = null;

        /* renamed from: j */
        public float f11612j = 1.0f;

        /* renamed from: k */
        public float f11613k = 1.0f;

        /* renamed from: l */
        public float f11614l;

        /* renamed from: m */
        public int f11615m = 255;

        /* renamed from: n */
        public float f11616n = 0.0f;

        /* renamed from: o */
        public float f11617o = 0.0f;

        /* renamed from: p */
        public float f11618p = 0.0f;

        /* renamed from: q */
        public int f11619q = 0;

        /* renamed from: r */
        public int f11620r = 0;

        /* renamed from: s */
        public int f11621s = 0;

        /* renamed from: t */
        public int f11622t = 0;

        /* renamed from: u */
        public boolean f11623u = false;

        /* renamed from: v */
        public Style f11624v = Style.FILL_AND_STROKE;

        public C4385c(C4385c cVar) {
            this.f11603a = cVar.f11603a;
            this.f11604b = cVar.f11604b;
            this.f11614l = cVar.f11614l;
            this.f11605c = cVar.f11605c;
            this.f11606d = cVar.f11606d;
            this.f11607e = cVar.f11607e;
            this.f11610h = cVar.f11610h;
            this.f11609g = cVar.f11609g;
            this.f11615m = cVar.f11615m;
            this.f11612j = cVar.f11612j;
            this.f11621s = cVar.f11621s;
            this.f11619q = cVar.f11619q;
            this.f11623u = cVar.f11623u;
            this.f11613k = cVar.f11613k;
            this.f11616n = cVar.f11616n;
            this.f11617o = cVar.f11617o;
            this.f11618p = cVar.f11618p;
            this.f11620r = cVar.f11620r;
            this.f11622t = cVar.f11622t;
            this.f11608f = cVar.f11608f;
            this.f11624v = cVar.f11624v;
            if (cVar.f11611i != null) {
                this.f11611i = new Rect(cVar.f11611i);
            }
        }

        public C4385c(C4389k kVar, C4450a aVar) {
            this.f11603a = kVar;
            this.f11604b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            C4382g gVar = new C4382g(this, null);
            gVar.f11583i = true;
            return gVar;
        }
    }

    public C4382g() {
        this(new C4389k());
    }

    public C4382g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C4389k.m17885a(context, attributeSet, i, i2).mo13120a());
    }

    private C4382g(C4385c cVar) {
        this.f11581g = new C4403g[4];
        this.f11582h = new C4403g[4];
        this.f11584j = new Matrix();
        this.f11585k = new Path();
        this.f11586l = new Path();
        this.f11587m = new RectF();
        this.f11588n = new RectF();
        this.f11589o = new Region();
        this.f11590p = new Region();
        this.f11592r = new Paint(1);
        this.f11593s = new Paint(1);
        this.f11594t = new C4373a();
        this.f11596v = new C4393l();
        this.f11600z = new RectF();
        this.f11579A = true;
        this.f11580f = cVar;
        this.f11593s.setStyle(Style.STROKE);
        this.f11592r.setStyle(Style.FILL);
        f11578B.setColor(-1);
        f11578B.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        mo8475B();
        mo8512a(getState());
        this.f11595u = new C4383a();
    }

    /* synthetic */ C4382g(C4385c cVar, C4383a aVar) {
        this(cVar);
    }

    public C4382g(C4389k kVar) {
        this(new C4385c(kVar, null));
    }

    /* renamed from: A */
    private boolean mo8473A() {
        return VERSION.SDK_INT < 21 || (!mo13092s() && !this.f11585k.isConvex() && VERSION.SDK_INT < 29);
    }

    /* renamed from: B */
    private boolean mo8475B() {
        PorterDuffColorFilter porterDuffColorFilter = this.f11597w;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f11598x;
        C4385c cVar = this.f11580f;
        this.f11597w = m17813a(cVar.f11609g, cVar.f11610h, this.f11592r, true);
        C4385c cVar2 = this.f11580f;
        this.f11598x = m17813a(cVar2.f11608f, cVar2.f11610h, this.f11593s, false);
        C4385c cVar3 = this.f11580f;
        if (cVar3.f11623u) {
            this.f11594t.mo13042a(cVar3.f11609g.getColorForState(getState(), 0));
        }
        return !C3316c.m13532a(porterDuffColorFilter, this.f11597w) || !C3316c.m13532a(porterDuffColorFilter2, this.f11598x);
    }

    /* renamed from: C */
    private void mo8477C() {
        float q = mo13090q();
        this.f11580f.f11620r = (int) Math.ceil((double) (0.75f * q));
        this.f11580f.f11621s = (int) Math.ceil((double) (q * 0.25f));
        mo8475B();
        mo8590z();
    }

    /* renamed from: a */
    private static int m17812a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: a */
    private PorterDuffColorFilter m17813a(ColorStateList colorStateList, Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? m17815a(paint, z) : m17814a(colorStateList, mode, z);
    }

    /* renamed from: a */
    private PorterDuffColorFilter m17814a(ColorStateList colorStateList, Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo8519c(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: a */
    private PorterDuffColorFilter m17815a(Paint paint, boolean z) {
        if (z) {
            int color = paint.getColor();
            int c = mo8519c(color);
            if (c != color) {
                return new PorterDuffColorFilter(c, Mode.SRC_IN);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C4382g m17816a(Context context, float f) {
        int a = C4445a.m18119a(context, C4375b.colorSurface, C4382g.class.getSimpleName());
        C4382g gVar = new C4382g();
        gVar.mo13058a(context);
        gVar.mo13059a(ColorStateList.valueOf(a));
        gVar.mo13064b(f);
        return gVar;
    }

    /* renamed from: a */
    private void m17817a(Canvas canvas) {
        if (this.f11580f.f11621s != 0) {
            canvas.drawPath(this.f11585k, this.f11594t.mo13041a());
        }
        for (int i = 0; i < 4; i++) {
            this.f11581g[i].mo13149a(this.f11594t, this.f11580f.f11620r, canvas);
            this.f11582h[i].mo13149a(this.f11594t, this.f11580f.f11620r, canvas);
        }
        if (this.f11579A) {
            int i2 = mo13079i();
            int j = mo13081j();
            canvas.translate((float) (-i2), (float) (-j));
            canvas.drawPath(this.f11585k, f11578B);
            canvas.translate((float) i2, (float) j);
        }
    }

    /* renamed from: a */
    private void m17818a(Canvas canvas, Paint paint, Path path, C4389k kVar, RectF rectF) {
        if (kVar.mo13103a(rectF)) {
            float a = kVar.mo13114l().mo13045a(rectF);
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean mo8512a(int[] r5) {
        /*
            r4 = this;
            g.d.a.c.b0.g$c r0 = r4.f11580f
            android.content.res.ColorStateList r0 = r0.f11606d
            r1 = 1
            if (r0 == 0) goto L_0x001e
            android.graphics.Paint r0 = r4.f11592r
            int r0 = r0.getColor()
            g.d.a.c.b0.g$c r2 = r4.f11580f
            android.content.res.ColorStateList r2 = r2.f11606d
            int r2 = r2.getColorForState(r5, r0)
            if (r0 == r2) goto L_0x001e
            android.graphics.Paint r0 = r4.f11592r
            r0.setColor(r2)
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            g.d.a.c.b0.g$c r2 = r4.f11580f
            android.content.res.ColorStateList r2 = r2.f11607e
            if (r2 == 0) goto L_0x003b
            android.graphics.Paint r2 = r4.f11593s
            int r2 = r2.getColor()
            g.d.a.c.b0.g$c r3 = r4.f11580f
            android.content.res.ColorStateList r3 = r3.f11607e
            int r5 = r3.getColorForState(r5, r2)
            if (r2 == r5) goto L_0x003b
            android.graphics.Paint r0 = r4.f11593s
            r0.setColor(r5)
            goto L_0x003c
        L_0x003b:
            r1 = r0
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p185c.p187b0.C4382g.mo8512a(int[]):boolean");
    }

    /* renamed from: b */
    private void m17822b(Canvas canvas) {
        m17818a(canvas, this.f11592r, this.f11585k, this.f11580f.f11603a, mo13069d());
    }

    /* renamed from: b */
    private void m17823b(RectF rectF, Path path) {
        mo13061a(rectF, path);
        if (this.f11580f.f11612j != 1.0f) {
            this.f11584j.reset();
            Matrix matrix = this.f11584j;
            float f = this.f11580f.f11612j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f11584j);
        }
        path.computeBounds(this.f11600z, true);
    }

    /* renamed from: c */
    private int mo8519c(int i) {
        float q = mo13090q() + mo13078h();
        C4450a aVar = this.f11580f.f11604b;
        return aVar != null ? aVar.mo13257b(i, q) : i;
    }

    /* renamed from: c */
    private void m17826c(Canvas canvas) {
        m17818a(canvas, this.f11593s, this.f11586l, this.f11591q, mo8579u());
    }

    /* renamed from: d */
    private void m17827d(Canvas canvas) {
        if (mo8584w()) {
            canvas.save();
            m17828e(canvas);
            if (!this.f11579A) {
                m17817a(canvas);
            } else {
                int width = (int) (this.f11600z.width() - ((float) getBounds().width()));
                int height = (int) (this.f11600z.height() - ((float) getBounds().height()));
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.f11600z.width()) + (this.f11580f.f11620r * 2) + width, ((int) this.f11600z.height()) + (this.f11580f.f11620r * 2) + height, Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f = (float) ((getBounds().left - this.f11580f.f11620r) - width);
                float f2 = (float) ((getBounds().top - this.f11580f.f11620r) - height);
                canvas2.translate(-f, -f2);
                m17817a(canvas2);
                canvas.drawBitmap(createBitmap, f, f2, null);
                createBitmap.recycle();
            }
            canvas.restore();
        }
    }

    /* renamed from: e */
    private void m17828e(Canvas canvas) {
        int i = mo13079i();
        int j = mo13081j();
        if (VERSION.SDK_INT < 21 && this.f11579A) {
            Rect clipBounds = canvas.getClipBounds();
            int i2 = this.f11580f.f11620r;
            clipBounds.inset(-i2, -i2);
            clipBounds.offset(i, j);
            canvas.clipRect(clipBounds, Op.REPLACE);
        }
        canvas.translate((float) i, (float) j);
    }

    /* renamed from: t */
    private void mo8577t() {
        C4389k a = mo13083l().mo13102a((C4392c) new C4384b(this, -mo8582v()));
        this.f11591q = a;
        this.f11596v.mo13134a(a, this.f11580f.f11613k, mo8579u(), this.f11586l);
    }

    /* renamed from: u */
    private RectF mo8579u() {
        this.f11588n.set(mo13069d());
        float v = mo8582v();
        this.f11588n.inset(v, v);
        return this.f11588n;
    }

    /* renamed from: v */
    private float mo8582v() {
        if (mo8588y()) {
            return this.f11593s.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: w */
    private boolean mo8584w() {
        C4385c cVar = this.f11580f;
        int i = cVar.f11619q;
        return i != 1 && cVar.f11620r > 0 && (i == 2 || mo8473A());
    }

    /* renamed from: x */
    private boolean mo8586x() {
        Style style = this.f11580f.f11624v;
        return style == Style.FILL_AND_STROKE || style == Style.FILL;
    }

    /* renamed from: y */
    private boolean mo8588y() {
        Style style = this.f11580f.f11624v;
        return (style == Style.FILL_AND_STROKE || style == Style.STROKE) && this.f11593s.getStrokeWidth() > 0.0f;
    }

    /* renamed from: z */
    private void mo8590z() {
        super.invalidateSelf();
    }

    /* renamed from: a */
    public void mo13053a(float f) {
        setShapeAppearanceModel(this.f11580f.f11603a.mo13101a(f));
    }

    /* renamed from: a */
    public void mo13054a(float f, int i) {
        mo13072e(f);
        mo13066b(ColorStateList.valueOf(i));
    }

    /* renamed from: a */
    public void mo13055a(float f, ColorStateList colorStateList) {
        mo13072e(f);
        mo13066b(colorStateList);
    }

    /* renamed from: a */
    public void mo13056a(int i) {
        this.f11594t.mo13042a(i);
        this.f11580f.f11623u = false;
        mo8590z();
    }

    /* renamed from: a */
    public void mo13057a(int i, int i2, int i3, int i4) {
        C4385c cVar = this.f11580f;
        if (cVar.f11611i == null) {
            cVar.f11611i = new Rect();
        }
        this.f11580f.f11611i.set(i, i2, i3, i4);
        this.f11599y = this.f11580f.f11611i;
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo13058a(Context context) {
        this.f11580f.f11604b = new C4450a(context);
        mo8477C();
    }

    /* renamed from: a */
    public void mo13059a(ColorStateList colorStateList) {
        C4385c cVar = this.f11580f;
        if (cVar.f11606d != colorStateList) {
            cVar.f11606d = colorStateList;
            onStateChange(getState());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13060a(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m17818a(canvas, paint, path, this.f11580f.f11603a, rectF);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13061a(RectF rectF, Path path) {
        C4393l lVar = this.f11596v;
        C4385c cVar = this.f11580f;
        C4389k kVar = cVar.f11603a;
        float f = cVar.f11613k;
        lVar.mo13135a(kVar, f, rectF, this.f11595u, path);
    }

    /* renamed from: a */
    public void mo13062a(boolean z) {
        this.f11579A = z;
    }

    /* renamed from: b */
    public float mo13063b() {
        return this.f11580f.f11603a.mo13105c().mo13045a(mo13069d());
    }

    /* renamed from: b */
    public void mo13064b(float f) {
        C4385c cVar = this.f11580f;
        if (cVar.f11617o != f) {
            cVar.f11617o = f;
            mo8477C();
        }
    }

    /* renamed from: b */
    public void mo13065b(int i) {
        C4385c cVar = this.f11580f;
        if (cVar.f11622t != i) {
            cVar.f11622t = i;
            mo8590z();
        }
    }

    /* renamed from: b */
    public void mo13066b(ColorStateList colorStateList) {
        C4385c cVar = this.f11580f;
        if (cVar.f11607e != colorStateList) {
            cVar.f11607e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: c */
    public float mo13067c() {
        return this.f11580f.f11603a.mo13107e().mo13045a(mo13069d());
    }

    /* renamed from: c */
    public void mo13068c(float f) {
        C4385c cVar = this.f11580f;
        if (cVar.f11613k != f) {
            cVar.f11613k = f;
            this.f11583i = true;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public RectF mo13069d() {
        this.f11587m.set(getBounds());
        return this.f11587m;
    }

    /* renamed from: d */
    public void mo13070d(float f) {
        C4385c cVar = this.f11580f;
        if (cVar.f11616n != f) {
            cVar.f11616n = f;
            mo8477C();
        }
    }

    public void draw(Canvas canvas) {
        this.f11592r.setColorFilter(this.f11597w);
        int alpha = this.f11592r.getAlpha();
        this.f11592r.setAlpha(m17812a(alpha, this.f11580f.f11615m));
        this.f11593s.setColorFilter(this.f11598x);
        this.f11593s.setStrokeWidth(this.f11580f.f11614l);
        int alpha2 = this.f11593s.getAlpha();
        this.f11593s.setAlpha(m17812a(alpha2, this.f11580f.f11615m));
        if (this.f11583i) {
            mo8577t();
            m17823b(mo13069d(), this.f11585k);
            this.f11583i = false;
        }
        m17827d(canvas);
        if (mo8586x()) {
            m17822b(canvas);
        }
        if (mo8588y()) {
            m17826c(canvas);
        }
        this.f11592r.setAlpha(alpha);
        this.f11593s.setAlpha(alpha2);
    }

    /* renamed from: e */
    public float mo13071e() {
        return this.f11580f.f11617o;
    }

    /* renamed from: e */
    public void mo13072e(float f) {
        this.f11580f.f11614l = f;
        invalidateSelf();
    }

    /* renamed from: f */
    public ColorStateList mo13073f() {
        return this.f11580f.f11606d;
    }

    /* renamed from: g */
    public float mo13074g() {
        return this.f11580f.f11613k;
    }

    public ConstantState getConstantState() {
        return this.f11580f;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f11580f.f11619q != 2) {
            if (mo13092s()) {
                outline.setRoundRect(getBounds(), mo13086n());
                return;
            }
            m17823b(mo13069d(), this.f11585k);
            if (this.f11585k.isConvex() || VERSION.SDK_INT >= 29) {
                outline.setConvexPath(this.f11585k);
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f11599y;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f11589o.set(getBounds());
        m17823b(mo13069d(), this.f11585k);
        this.f11590p.setPath(this.f11585k, this.f11589o);
        this.f11589o.op(this.f11590p, Op.DIFFERENCE);
        return this.f11589o;
    }

    /* renamed from: h */
    public float mo13078h() {
        return this.f11580f.f11616n;
    }

    /* renamed from: i */
    public int mo13079i() {
        C4385c cVar = this.f11580f;
        return (int) (((double) cVar.f11621s) * Math.sin(Math.toRadians((double) cVar.f11622t)));
    }

    public void invalidateSelf() {
        this.f11583i = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.f11580f.f11609g;
            if (colorStateList == null || !colorStateList.isStateful()) {
                ColorStateList colorStateList2 = this.f11580f.f11608f;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.f11580f.f11607e;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        ColorStateList colorStateList4 = this.f11580f.f11606d;
                        if (colorStateList4 == null || !colorStateList4.isStateful()) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: j */
    public int mo13081j() {
        C4385c cVar = this.f11580f;
        return (int) (((double) cVar.f11621s) * Math.cos(Math.toRadians((double) cVar.f11622t)));
    }

    /* renamed from: k */
    public int mo13082k() {
        return this.f11580f.f11620r;
    }

    /* renamed from: l */
    public C4389k mo13083l() {
        return this.f11580f.f11603a;
    }

    /* renamed from: m */
    public ColorStateList mo13084m() {
        return this.f11580f.f11609g;
    }

    public Drawable mutate() {
        this.f11580f = new C4385c(this.f11580f);
        return this;
    }

    /* renamed from: n */
    public float mo13086n() {
        return this.f11580f.f11603a.mo13112j().mo13045a(mo13069d());
    }

    /* renamed from: o */
    public float mo13087o() {
        return this.f11580f.f11603a.mo13114l().mo13045a(mo13069d());
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f11583i = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = mo8512a(iArr) || mo8475B();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public float mo13089p() {
        return this.f11580f.f11618p;
    }

    /* renamed from: q */
    public float mo13090q() {
        return mo13071e() + mo13089p();
    }

    /* renamed from: r */
    public boolean mo13091r() {
        C4450a aVar = this.f11580f.f11604b;
        return aVar != null && aVar.mo13256a();
    }

    /* renamed from: s */
    public boolean mo13092s() {
        return this.f11580f.f11603a.mo13103a(mo13069d());
    }

    public void setAlpha(int i) {
        C4385c cVar = this.f11580f;
        if (cVar.f11615m != i) {
            cVar.f11615m = i;
            mo8590z();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f11580f.f11605c = colorFilter;
        mo8590z();
    }

    public void setShapeAppearanceModel(C4389k kVar) {
        this.f11580f.f11603a = kVar;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f11580f.f11609g = colorStateList;
        mo8475B();
        mo8590z();
    }

    public void setTintMode(Mode mode) {
        C4385c cVar = this.f11580f;
        if (cVar.f11610h != mode) {
            cVar.f11610h = mode;
            mo8475B();
            mo8590z();
        }
    }
}
