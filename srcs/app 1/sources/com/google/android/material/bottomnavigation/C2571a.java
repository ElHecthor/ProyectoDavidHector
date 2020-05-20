package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0126i;
import androidx.appcompat.view.menu.C0139n.C0140a;
import androidx.appcompat.widget.C0283v0;
import androidx.core.graphics.drawable.C0371a;
import androidx.core.widget.C0391i;
import p071f.p097h.p098e.C3236a;
import p071f.p097h.p108m.C3323a;
import p071f.p097h.p108m.C3377t;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c;
import p071f.p097h.p108m.p109f0.C3347c.C3348a;
import p071f.p097h.p108m.p109f0.C3347c.C3350c;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4409e;
import p147g.p156d.p157a.p185c.C4410f;
import p147g.p156d.p157a.p185c.C4412h;
import p147g.p156d.p157a.p185c.p190n.C4428a;
import p147g.p156d.p157a.p185c.p190n.C4431b;

/* renamed from: com.google.android.material.bottomnavigation.a */
public class C2571a extends FrameLayout implements C0140a {

    /* renamed from: u */
    private static final int[] f7267u = {16842912};

    /* renamed from: f */
    private final int f7268f;

    /* renamed from: g */
    private float f7269g;

    /* renamed from: h */
    private float f7270h;

    /* renamed from: i */
    private float f7271i;

    /* renamed from: j */
    private int f7272j;

    /* renamed from: k */
    private boolean f7273k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ImageView f7274l;

    /* renamed from: m */
    private final TextView f7275m;

    /* renamed from: n */
    private final TextView f7276n;

    /* renamed from: o */
    private int f7277o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C0126i f7278p;

    /* renamed from: q */
    private ColorStateList f7279q;

    /* renamed from: r */
    private Drawable f7280r;

    /* renamed from: s */
    private Drawable f7281s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C4428a f7282t;

    /* renamed from: com.google.android.material.bottomnavigation.a$a */
    class C2572a implements OnLayoutChangeListener {
        C2572a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (C2571a.this.f7274l.getVisibility() == 0) {
                C2571a aVar = C2571a.this;
                aVar.m10420d(aVar.f7274l);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.a$b */
    class C2573b extends C3323a {
        C2573b() {
        }

        /* renamed from: a */
        public void mo2349a(View view, C3347c cVar) {
            super.mo2349a(view, cVar);
            if (C2571a.this.f7282t != null && C2571a.this.f7282t.isVisible()) {
                CharSequence title = C2571a.this.f7278p.getTitle();
                if (!TextUtils.isEmpty(C2571a.this.f7278p.getContentDescription())) {
                    title = C2571a.this.f7278p.getContentDescription();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(title);
                sb.append(", ");
                sb.append(C2571a.this.f7282t.mo13192b());
                cVar.mo10754b((CharSequence) sb.toString());
            }
            cVar.mo10755b((Object) C3350c.m13707a(0, 1, C2571a.this.getItemPosition(), 1, false, C2571a.this.isSelected()));
            if (C2571a.this.isSelected()) {
                cVar.mo10766d(false);
                cVar.mo10757b(C3348a.f9556e);
            }
        }
    }

    public C2571a(Context context) {
        this(context, null);
    }

    public C2571a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2571a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7277o = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(C4412h.design_bottom_navigation_item, this, true);
        setBackgroundResource(C4409e.design_bottom_navigation_item_background);
        this.f7268f = resources.getDimensionPixelSize(C4408d.design_bottom_navigation_margin);
        this.f7274l = (ImageView) findViewById(C4410f.icon);
        this.f7275m = (TextView) findViewById(C4410f.smallLabel);
        this.f7276n = (TextView) findViewById(C4410f.largeLabel);
        C3379v.m13820h(this.f7275m, 2);
        C3379v.m13820h(this.f7276n, 2);
        setFocusable(true);
        m10411a(this.f7275m.getTextSize(), this.f7276n.getTextSize());
        ImageView imageView = this.f7274l;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C2572a());
        }
        C3379v.m13788a((View) this, (C3323a) new C2573b());
    }

    /* renamed from: a */
    private FrameLayout m10409a(View view) {
        ImageView imageView = this.f7274l;
        if (view != imageView || !C4431b.f11763a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    /* renamed from: a */
    private void m10411a(float f, float f2) {
        this.f7269g = f - f2;
        this.f7270h = (f2 * 1.0f) / f;
        this.f7271i = (f * 1.0f) / f2;
    }

    /* renamed from: a */
    private void m10412a(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: a */
    private void m10413a(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    private void m10416b(View view) {
        if (m10419c() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C4431b.m18088a(this.f7282t, view, m10409a(view));
        }
    }

    /* renamed from: c */
    private void m10418c(View view) {
        if (m10419c()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C4431b.m18089b(this.f7282t, view, m10409a(view));
            }
            this.f7282t = null;
        }
    }

    /* renamed from: c */
    private boolean m10419c() {
        return this.f7282t != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m10420d(View view) {
        if (m10419c()) {
            C4431b.m18090c(this.f7282t, view, m10409a(view));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8048a() {
        m10418c((View) this.f7274l);
    }

    /* renamed from: a */
    public void mo416a(C0126i iVar, int i) {
        this.f7278p = iVar;
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitle());
        setId(iVar.getItemId());
        if (!TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(iVar.getContentDescription());
        }
        C0283v0.m1404a(this, !TextUtils.isEmpty(iVar.getTooltipText()) ? iVar.getTooltipText() : iVar.getTitle());
        setVisibility(iVar.isVisible() ? 0 : 8);
    }

    /* renamed from: b */
    public boolean mo418b() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public C4428a getBadge() {
        return this.f7282t;
    }

    public C0126i getItemData() {
        return this.f7278p;
    }

    public int getItemPosition() {
        return this.f7277o;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0126i iVar = this.f7278p;
        if (iVar != null && iVar.isCheckable() && this.f7278p.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f7267u);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: 0000 */
    public void setBadge(C4428a aVar) {
        this.f7282t = aVar;
        ImageView imageView = this.f7274l;
        if (imageView != null) {
            m10416b((View) imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008a, code lost:
        if (r10 != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008c, code lost:
        m10413a(r0, r1, 49);
        m10412a(r9.f7276n, 1.0f, 1.0f, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0095, code lost:
        m10413a(r0, r1, 17);
        m10412a(r9.f7276n, 0.5f, 0.5f, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009d, code lost:
        r9.f7275m.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ab, code lost:
        if (r10 != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ae, code lost:
        if (r10 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0057, code lost:
        if (r10 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0072, code lost:
        m10413a(r9.f7274l, r9.f7268f, 49);
        r0 = r9.f7276n;
        r1 = r9.f7271i;
        m10412a(r0, r1, r1, 4);
        m10412a(r9.f7275m, 1.0f, 1.0f, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChecked(boolean r10) {
        /*
            r9 = this;
            android.widget.TextView r0 = r9.f7276n
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.f7276n
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r0 = r9.f7275m
            int r1 = r0.getWidth()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.f7275m
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            int r0 = r9.f7272j
            r1 = -1
            r3 = 17
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 0
            r6 = 49
            r7 = 4
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r0 == r1) goto L_0x00a3
            if (r0 == 0) goto L_0x0086
            r1 = 1
            if (r0 == r1) goto L_0x0057
            if (r0 == r2) goto L_0x0043
            goto L_0x00b1
        L_0x0043:
            android.widget.ImageView r0 = r9.f7274l
            int r1 = r9.f7268f
            r9.m10413a(r0, r1, r3)
            android.widget.TextView r0 = r9.f7276n
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r9.f7275m
            r0.setVisibility(r1)
            goto L_0x00b1
        L_0x0057:
            if (r10 == 0) goto L_0x0072
        L_0x0059:
            android.widget.ImageView r0 = r9.f7274l
            int r1 = r9.f7268f
            float r1 = (float) r1
            float r2 = r9.f7269g
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.m10413a(r0, r1, r6)
            android.widget.TextView r0 = r9.f7276n
            r9.m10412a(r0, r8, r8, r5)
            android.widget.TextView r0 = r9.f7275m
            float r1 = r9.f7270h
            r9.m10412a(r0, r1, r1, r7)
            goto L_0x00b1
        L_0x0072:
            android.widget.ImageView r0 = r9.f7274l
            int r1 = r9.f7268f
            r9.m10413a(r0, r1, r6)
            android.widget.TextView r0 = r9.f7276n
            float r1 = r9.f7271i
            r9.m10412a(r0, r1, r1, r7)
            android.widget.TextView r0 = r9.f7275m
            r9.m10412a(r0, r8, r8, r5)
            goto L_0x00b1
        L_0x0086:
            android.widget.ImageView r0 = r9.f7274l
            int r1 = r9.f7268f
            if (r10 == 0) goto L_0x0095
        L_0x008c:
            r9.m10413a(r0, r1, r6)
            android.widget.TextView r0 = r9.f7276n
            r9.m10412a(r0, r8, r8, r5)
            goto L_0x009d
        L_0x0095:
            r9.m10413a(r0, r1, r3)
            android.widget.TextView r0 = r9.f7276n
            r9.m10412a(r0, r4, r4, r7)
        L_0x009d:
            android.widget.TextView r0 = r9.f7275m
            r0.setVisibility(r7)
            goto L_0x00b1
        L_0x00a3:
            boolean r0 = r9.f7273k
            if (r0 == 0) goto L_0x00ae
            android.widget.ImageView r0 = r9.f7274l
            int r1 = r9.f7268f
            if (r10 == 0) goto L_0x0095
            goto L_0x008c
        L_0x00ae:
            if (r10 == 0) goto L_0x0072
            goto L_0x0059
        L_0x00b1:
            r9.refreshDrawableState()
            r9.setSelected(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomnavigation.C2571a.setChecked(boolean):void");
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f7275m.setEnabled(z);
        this.f7276n.setEnabled(z);
        this.f7274l.setEnabled(z);
        C3379v.m13793a((View) this, z ? C3377t.m13763a(getContext(), 1002) : null);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.f7280r) {
            this.f7280r = drawable;
            if (drawable != null) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0371a.m1913i(drawable).mutate();
                this.f7281s = drawable;
                ColorStateList colorStateList = this.f7279q;
                if (colorStateList != null) {
                    C0371a.m1898a(drawable, colorStateList);
                }
            }
            this.f7274l.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        LayoutParams layoutParams = (LayoutParams) this.f7274l.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f7274l.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f7279q = colorStateList;
        if (this.f7278p != null) {
            Drawable drawable = this.f7281s;
            if (drawable != null) {
                C0371a.m1898a(drawable, colorStateList);
                this.f7281s.invalidateSelf();
            }
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C3236a.m13271c(getContext(), i));
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C3379v.m13787a((View) this, drawable);
    }

    public void setItemPosition(int i) {
        this.f7277o = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f7272j != i) {
            this.f7272j = i;
            if (this.f7278p != null) {
                setChecked(this.f7278p.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f7273k != z) {
            this.f7273k = z;
            if (this.f7278p != null) {
                setChecked(this.f7278p.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        C0391i.m2039d(this.f7276n, i);
        m10411a(this.f7275m.getTextSize(), this.f7276n.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        C0391i.m2039d(this.f7275m, i);
        m10411a(this.f7275m.getTextSize(), this.f7276n.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f7275m.setTextColor(colorStateList);
            this.f7276n.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f7275m.setText(charSequence);
        this.f7276n.setText(charSequence);
        C0126i iVar = this.f7278p;
        if (iVar == null || TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C0126i iVar2 = this.f7278p;
        if (iVar2 != null && !TextUtils.isEmpty(iVar2.getTooltipText())) {
            charSequence = this.f7278p.getTooltipText();
        }
        C0283v0.m1404a(this, charSequence);
    }
}
