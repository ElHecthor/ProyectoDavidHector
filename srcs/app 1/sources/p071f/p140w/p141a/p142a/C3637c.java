package p071f.p140w.p141a.p142a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0371a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p071f.p088e.C3162a;
import p071f.p097h.p098e.p099c.C3252g;

/* renamed from: f.w.a.a.c */
public class C3637c extends C3646h implements C3635b {

    /* renamed from: g */
    private C3639b f10209g;

    /* renamed from: h */
    private Context f10210h;

    /* renamed from: i */
    private ArgbEvaluator f10211i;

    /* renamed from: j */
    final Callback f10212j;

    /* renamed from: f.w.a.a.c$a */
    class C3638a implements Callback {
        C3638a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C3637c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C3637c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C3637c.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: f.w.a.a.c$b */
    private static class C3639b extends ConstantState {

        /* renamed from: a */
        int f10214a;

        /* renamed from: b */
        C3647i f10215b;

        /* renamed from: c */
        AnimatorSet f10216c;

        /* renamed from: d */
        ArrayList<Animator> f10217d;

        /* renamed from: e */
        C3162a<Animator, String> f10218e;

        public C3639b(Context context, C3639b bVar, Callback callback, Resources resources) {
            if (bVar != null) {
                this.f10214a = bVar.f10214a;
                C3647i iVar = bVar.f10215b;
                if (iVar != null) {
                    ConstantState constantState = iVar.getConstantState();
                    this.f10215b = (C3647i) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    C3647i iVar2 = this.f10215b;
                    iVar2.mutate();
                    C3647i iVar3 = iVar2;
                    this.f10215b = iVar3;
                    iVar3.setCallback(callback);
                    this.f10215b.setBounds(bVar.f10215b.getBounds());
                    this.f10215b.mo11477a(false);
                }
                ArrayList<Animator> arrayList = bVar.f10217d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f10217d = new ArrayList<>(size);
                    this.f10218e = new C3162a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) bVar.f10217d.get(i);
                        Animator clone = animator.clone();
                        String str = (String) bVar.f10218e.get(animator);
                        clone.setTarget(this.f10215b.mo11476a(str));
                        this.f10217d.add(clone);
                        this.f10218e.put(clone, str);
                    }
                    mo11448a();
                }
            }
        }

        /* renamed from: a */
        public void mo11448a() {
            if (this.f10216c == null) {
                this.f10216c = new AnimatorSet();
            }
            this.f10216c.playTogether(this.f10217d);
        }

        public int getChangingConfigurations() {
            return this.f10214a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: f.w.a.a.c$c */
    private static class C3640c extends ConstantState {

        /* renamed from: a */
        private final ConstantState f10219a;

        public C3640c(ConstantState constantState) {
            this.f10219a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f10219a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f10219a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C3637c cVar = new C3637c();
            Drawable newDrawable = this.f10219a.newDrawable();
            cVar.f10224f = newDrawable;
            newDrawable.setCallback(cVar.f10212j);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C3637c cVar = new C3637c();
            Drawable newDrawable = this.f10219a.newDrawable(resources);
            cVar.f10224f = newDrawable;
            newDrawable.setCallback(cVar.f10212j);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C3637c cVar = new C3637c();
            Drawable newDrawable = this.f10219a.newDrawable(resources, theme);
            cVar.f10224f = newDrawable;
            newDrawable.setCallback(cVar.f10212j);
            return cVar;
        }
    }

    C3637c() {
        this(null, null, null);
    }

    private C3637c(Context context) {
        this(context, null, null);
    }

    private C3637c(Context context, C3639b bVar, Resources resources) {
        this.f10211i = null;
        this.f10212j = new C3638a();
        this.f10210h = context;
        if (bVar != null) {
            this.f10209g = bVar;
        } else {
            this.f10209g = new C3639b(context, bVar, this.f10212j, resources);
        }
    }

    /* renamed from: a */
    public static C3637c m14797a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C3637c cVar = new C3637c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    /* renamed from: a */
    private void m14798a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m14798a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f10211i == null) {
                    this.f10211i = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f10211i);
            }
        }
    }

    /* renamed from: a */
    private void m14799a(String str, Animator animator) {
        animator.setTarget(this.f10209g.f10215b.mo11476a(str));
        if (VERSION.SDK_INT < 21) {
            m14798a(animator);
        }
        C3639b bVar = this.f10209g;
        if (bVar.f10217d == null) {
            bVar.f10217d = new ArrayList<>();
            this.f10209g.f10218e = new C3162a<>();
        }
        this.f10209g.f10217d.add(animator);
        this.f10209g.f10218e.put(animator, str);
    }

    public void applyTheme(Theme theme) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            C0371a.m1899a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            return C0371a.m1903a(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f10209g.f10215b.draw(canvas);
        if (this.f10209g.f10216c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f10224f;
        return drawable != null ? C0371a.m1907c(drawable) : this.f10209g.f10215b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f10224f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f10209g.f10214a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f10224f;
        return drawable != null ? C0371a.m1908d(drawable) : this.f10209g.f10215b.getColorFilter();
    }

    public ConstantState getConstantState() {
        if (this.f10224f == null || VERSION.SDK_INT < 24) {
            return null;
        }
        return new C3640c(this.f10224f.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f10224f;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f10209g.f10215b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f10224f;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f10209g.f10215b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f10224f;
        return drawable != null ? drawable.getOpacity() : this.f10209g.f10215b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            C0371a.m1900a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C3252g.m13332a(resources, theme, attributeSet, C3634a.f10201e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C3647i a = C3647i.m14830a(resources, resourceId, theme);
                        a.mo11477a(false);
                        a.setCallback(this.f10212j);
                        C3647i iVar = this.f10209g.f10215b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f10209g.f10215b = a;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C3634a.f10202f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f10210h;
                        if (context != null) {
                            m14799a(string, C3642e.m14805a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f10209g.mo11448a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f10224f;
        return drawable != null ? C0371a.m1910f(drawable) : this.f10209g.f10215b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f10224f;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f10209g.f10216c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f10224f;
        return drawable != null ? drawable.isStateful() : this.f10209g.f10215b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f10209g.f10215b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f10224f;
        return drawable != null ? drawable.setLevel(i) : this.f10209g.f10215b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f10224f;
        return drawable != null ? drawable.setState(iArr) : this.f10209g.f10215b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f10209g.f10215b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            C0371a.m1902a(drawable, z);
        } else {
            this.f10209g.f10215b.setAutoMirrored(z);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f10209g.f10215b.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            C0371a.m1906b(drawable, i);
        } else {
            this.f10209g.f10215b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            C0371a.m1898a(drawable, colorStateList);
        } else {
            this.f10209g.f10215b.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            C0371a.m1901a(drawable, mode);
        } else {
            this.f10209g.f10215b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f10209g.f10215b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f10209g.f10216c.isStarted()) {
            this.f10209g.f10216c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f10224f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f10209g.f10216c.end();
        }
    }
}
