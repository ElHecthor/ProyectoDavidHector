package p071f.p072a.p075l.p076a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0229i0;
import androidx.core.graphics.drawable.C0372b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p071f.p072a.p077m.C3121b;
import p071f.p088e.C3167d;
import p071f.p088e.C3176h;
import p071f.p097h.p098e.p099c.C3252g;
import p071f.p140w.p141a.p142a.C3637c;
import p071f.p140w.p141a.p142a.C3647i;

@SuppressLint({"RestrictedAPI"})
/* renamed from: f.a.l.a.a */
public class C3105a extends C3118d implements C0372b {

    /* renamed from: t */
    private C3108c f8765t;

    /* renamed from: u */
    private C3112g f8766u;

    /* renamed from: v */
    private int f8767v;

    /* renamed from: w */
    private int f8768w;

    /* renamed from: x */
    private boolean f8769x;

    /* renamed from: f.a.l.a.a$b */
    private static class C3107b extends C3112g {

        /* renamed from: a */
        private final Animatable f8770a;

        C3107b(Animatable animatable) {
            super();
            this.f8770a = animatable;
        }

        /* renamed from: c */
        public void mo9924c() {
            this.f8770a.start();
        }

        /* renamed from: d */
        public void mo9925d() {
            this.f8770a.stop();
        }
    }

    /* renamed from: f.a.l.a.a$c */
    static class C3108c extends C3119a {

        /* renamed from: K */
        C3167d<Long> f8771K;

        /* renamed from: L */
        C3176h<Integer> f8772L;

        C3108c(C3108c cVar, C3105a aVar, Resources resources) {
            C3176h<Integer> hVar;
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f8771K = cVar.f8771K;
                hVar = cVar.f8772L;
            } else {
                this.f8771K = new C3167d<>();
                hVar = new C3176h<>();
            }
            this.f8772L = hVar;
        }

        /* renamed from: f */
        private static long m12574f(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo9926a(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo9981a(drawable);
            long f = m12574f(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f8771K.mo10183a(f, Long.valueOf(j2 | j));
            if (z) {
                this.f8771K.mo10183a(m12574f(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo9927a(int[] iArr, Drawable drawable, int i) {
            int a = super.mo10036a(iArr, drawable);
            this.f8772L.mo10294c(a, Integer.valueOf(i));
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo9928b(int[] iArr) {
            int a = super.mo10035a(iArr);
            return a >= 0 ? a : super.mo10035a(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo9929c(int i, int i2) {
            return (int) ((Long) this.f8771K.mo10185b(m12574f(i, i2), Long.valueOf(-1))).longValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo9930d(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.f8772L.mo10290b(i, Integer.valueOf(0))).intValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo9931d(int i, int i2) {
            return (((Long) this.f8771K.mo10185b(m12574f(i, i2), Long.valueOf(-1))).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo9932e(int i, int i2) {
            return (((Long) this.f8771K.mo10185b(m12574f(i, i2), Long.valueOf(-1))).longValue() & 8589934592L) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo9933m() {
            this.f8771K = this.f8771K.clone();
            this.f8772L = this.f8772L.clone();
        }

        public Drawable newDrawable() {
            return new C3105a(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C3105a(this, resources);
        }
    }

    /* renamed from: f.a.l.a.a$d */
    private static class C3109d extends C3112g {

        /* renamed from: a */
        private final C3637c f8773a;

        C3109d(C3637c cVar) {
            super();
            this.f8773a = cVar;
        }

        /* renamed from: c */
        public void mo9924c() {
            this.f8773a.start();
        }

        /* renamed from: d */
        public void mo9925d() {
            this.f8773a.stop();
        }
    }

    /* renamed from: f.a.l.a.a$e */
    private static class C3110e extends C3112g {

        /* renamed from: a */
        private final ObjectAnimator f8774a;

        /* renamed from: b */
        private final boolean f8775b;

        C3110e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C3111f fVar = new C3111f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.mo9938a());
            ofInt.setInterpolator(fVar);
            this.f8775b = z2;
            this.f8774a = ofInt;
        }

        /* renamed from: a */
        public boolean mo9936a() {
            return this.f8775b;
        }

        /* renamed from: b */
        public void mo9937b() {
            this.f8774a.reverse();
        }

        /* renamed from: c */
        public void mo9924c() {
            this.f8774a.start();
        }

        /* renamed from: d */
        public void mo9925d() {
            this.f8774a.cancel();
        }
    }

    /* renamed from: f.a.l.a.a$f */
    private static class C3111f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f8776a;

        /* renamed from: b */
        private int f8777b;

        /* renamed from: c */
        private int f8778c;

        C3111f(AnimationDrawable animationDrawable, boolean z) {
            mo9939a(animationDrawable, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo9938a() {
            return this.f8778c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo9939a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f8777b = numberOfFrames;
            int[] iArr = this.f8776a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f8776a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f8776a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f8778c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f8778c)) + 0.5f);
            int i2 = this.f8777b;
            int[] iArr = this.f8776a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f8778c) : 0.0f);
        }
    }

    /* renamed from: f.a.l.a.a$g */
    private static abstract class C3112g {
        private C3112g() {
        }

        /* renamed from: a */
        public boolean mo9936a() {
            return false;
        }

        /* renamed from: b */
        public void mo9937b() {
        }

        /* renamed from: c */
        public abstract void mo9924c();

        /* renamed from: d */
        public abstract void mo9925d();
    }

    static {
        Class<C3105a> cls = C3105a.class;
    }

    public C3105a() {
        this(null, null);
    }

    C3105a(C3108c cVar, Resources resources) {
        super(null);
        this.f8767v = -1;
        this.f8768w = -1;
        mo9918a((C3116c) new C3108c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: a */
    private void m12560a(TypedArray typedArray) {
        C3108c cVar = this.f8765t;
        if (VERSION.SDK_INT >= 21) {
            cVar.f8805d |= typedArray.getChangingConfigurations();
        }
        cVar.mo9990b(typedArray.getBoolean(C3121b.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f8810i));
        cVar.mo9986a(typedArray.getBoolean(C3121b.AnimatedStateListDrawableCompat_android_constantSize, cVar.f8813l));
        cVar.mo9989b(typedArray.getInt(C3121b.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.f8793A));
        cVar.mo9993c(typedArray.getInt(C3121b.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.f8794B));
        setDither(typedArray.getBoolean(C3121b.AnimatedStateListDrawableCompat_android_dither, cVar.f8825x));
    }

    /* renamed from: b */
    public static C3105a m12561b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C3105a aVar = new C3105a();
            aVar.mo9917a(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* renamed from: b */
    private boolean m12562b(int i) {
        int i2;
        C3112g gVar;
        C3112g gVar2 = this.f8766u;
        if (gVar2 == null) {
            i2 = mo9945b();
        } else if (i == this.f8767v) {
            return true;
        } else {
            if (i != this.f8768w || !gVar2.mo9936a()) {
                i2 = this.f8767v;
                gVar2.mo9925d();
            } else {
                gVar2.mo9937b();
                this.f8767v = this.f8768w;
                this.f8768w = i;
                return true;
            }
        }
        this.f8766u = null;
        this.f8768w = -1;
        this.f8767v = -1;
        C3108c cVar = this.f8765t;
        int d = cVar.mo9930d(i2);
        int d2 = cVar.mo9930d(i);
        if (!(d2 == 0 || d == 0)) {
            int c = cVar.mo9929c(d, d2);
            if (c < 0) {
                return false;
            }
            boolean e = cVar.mo9932e(d, d2);
            mo9943a(c);
            Drawable current = getCurrent();
            if (current instanceof AnimationDrawable) {
                gVar = new C3110e((AnimationDrawable) current, cVar.mo9931d(d, d2), e);
            } else if (current instanceof C3637c) {
                gVar = new C3109d((C3637c) current);
            } else if (current instanceof Animatable) {
                gVar = new C3107b((Animatable) current);
            }
            gVar.mo9924c();
            this.f8766u = gVar;
            this.f8768w = i2;
            this.f8767v = i;
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m12563c() {
        onStateChange(getState());
    }

    /* renamed from: c */
    private void m12564c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m12565d(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m12566e(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private int m12565d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        int next;
        TypedArray a = C3252g.m13332a(resources, theme, attributeSet, C3121b.AnimatedStateListDrawableItem);
        int resourceId = a.getResourceId(C3121b.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = a.getResourceId(C3121b.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable a2 = resourceId2 > 0 ? C0229i0.m1135a().mo1459a(context, resourceId2) : null;
        a.recycle();
        int[] a3 = mo10034a(attributeSet);
        String str = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
        if (a2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                a2 = xmlPullParser.getName().equals("vector") ? C3647i.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(str);
                throw new XmlPullParserException(sb.toString());
            }
        }
        if (a2 != null) {
            return this.f8765t.mo9927a(a3, a2, resourceId);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(str);
        throw new XmlPullParserException(sb2.toString());
    }

    /* renamed from: e */
    private int m12566e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        int next;
        TypedArray a = C3252g.m13332a(resources, theme, attributeSet, C3121b.AnimatedStateListDrawableTransition);
        int resourceId = a.getResourceId(C3121b.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = a.getResourceId(C3121b.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = a.getResourceId(C3121b.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable a2 = resourceId3 > 0 ? C0229i0.m1135a().mo1459a(context, resourceId3) : null;
        boolean z = a.getBoolean(C3121b.AnimatedStateListDrawableTransition_android_reversible, false);
        a.recycle();
        String str = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
        if (a2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                a2 = xmlPullParser.getName().equals("animated-vector") ? C3637c.m14797a(context, resources, xmlPullParser, attributeSet, theme) : VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(str);
                throw new XmlPullParserException(sb.toString());
            }
        }
        if (a2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(str);
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f8765t.mo9926a(resourceId, resourceId2, a2, z);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(sb3.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3108c m12569a() {
        return new C3108c(this.f8765t, this, null);
    }

    /* renamed from: a */
    public void mo9917a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        TypedArray a = C3252g.m13332a(resources, theme, attributeSet, C3121b.AnimatedStateListDrawableCompat);
        setVisible(a.getBoolean(C3121b.AnimatedStateListDrawableCompat_android_visible, true), true);
        m12560a(a);
        mo9941a(resources);
        a.recycle();
        m12564c(context, resources, xmlPullParser, attributeSet, theme);
        m12563c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9918a(C3116c cVar) {
        super.mo9918a(cVar);
        if (cVar instanceof C3108c) {
            this.f8765t = (C3108c) cVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C3112g gVar = this.f8766u;
        if (gVar != null) {
            gVar.mo9925d();
            this.f8766u = null;
            mo9943a(this.f8767v);
            this.f8767v = -1;
            this.f8768w = -1;
        }
    }

    public Drawable mutate() {
        if (!this.f8769x) {
            super.mutate();
            if (this == this) {
                this.f8765t.mo9933m();
                this.f8769x = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int b = this.f8765t.mo9928b(iArr);
        boolean z = b != mo9945b() && (m12562b(b) || mo9943a(b));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f8766u != null && (visible || z2)) {
            if (z) {
                this.f8766u.mo9924c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
