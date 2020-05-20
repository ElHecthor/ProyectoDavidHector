package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p071f.p072a.C3093a;
import p071f.p072a.C3098f;
import p071f.p072a.C3099g;
import p071f.p072a.C3102j;
import p071f.p072a.p079o.C3124b;
import p071f.p097h.p108m.C3379v;

public class ActionBarContextView extends C0187a {

    /* renamed from: n */
    private CharSequence f640n;

    /* renamed from: o */
    private CharSequence f641o;

    /* renamed from: p */
    private View f642p;

    /* renamed from: q */
    private View f643q;

    /* renamed from: r */
    private LinearLayout f644r;

    /* renamed from: s */
    private TextView f645s;

    /* renamed from: t */
    private TextView f646t;

    /* renamed from: u */
    private int f647u;

    /* renamed from: v */
    private int f648v;

    /* renamed from: w */
    private boolean f649w;

    /* renamed from: x */
    private int f650x;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class C0148a implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C3124b f651f;

        C0148a(ActionBarContextView actionBarContextView, C3124b bVar) {
            this.f651f = bVar;
        }

        public void onClick(View view) {
            this.f651f.mo401a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3093a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0275t0 a = C0275t0.m1311a(context, attributeSet, C3102j.ActionMode, i, 0);
        C3379v.m13787a((View) this, a.mo1741b(C3102j.ActionMode_background));
        this.f647u = a.mo1750g(C3102j.ActionMode_titleTextStyle, 0);
        this.f648v = a.mo1750g(C3102j.ActionMode_subtitleTextStyle, 0);
        this.f860j = a.mo1748f(C3102j.ActionMode_height, 0);
        this.f650x = a.mo1750g(C3102j.ActionMode_closeItemLayout, C3099g.abc_action_mode_close_item_material);
        a.mo1737a();
    }

    /* renamed from: e */
    private void m795e() {
        if (this.f644r == null) {
            LayoutInflater.from(getContext()).inflate(C3099g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f644r = linearLayout;
            this.f645s = (TextView) linearLayout.findViewById(C3098f.action_bar_title);
            this.f646t = (TextView) this.f644r.findViewById(C3098f.action_bar_subtitle);
            if (this.f647u != 0) {
                this.f645s.setTextAppearance(getContext(), this.f647u);
            }
            if (this.f648v != 0) {
                this.f646t.setTextAppearance(getContext(), this.f648v);
            }
        }
        this.f645s.setText(this.f640n);
        this.f646t.setText(this.f641o);
        boolean z = !TextUtils.isEmpty(this.f640n);
        boolean z2 = !TextUtils.isEmpty(this.f641o);
        int i = 0;
        this.f646t.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f644r;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f644r.getParent() == null) {
            addView(this.f644r);
        }
    }

    /* renamed from: a */
    public void mo863a() {
        if (this.f642p == null) {
            mo866c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo864a(p071f.p072a.p079o.C3124b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f642p
            if (r0 != 0) goto L_0x0019
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f650x
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f642p = r0
        L_0x0015:
            r3.addView(r0)
            goto L_0x0022
        L_0x0019:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0022
            android.view.View r0 = r3.f642p
            goto L_0x0015
        L_0x0022:
            android.view.View r0 = r3.f642p
            int r1 = p071f.p072a.C3098f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo409c()
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.C0122g) r4
            androidx.appcompat.widget.c r0 = r3.f859i
            if (r0 == 0) goto L_0x003f
            r0.mo1293b()
        L_0x003f:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f859i = r0
            r1 = 1
            r0.mo1295c(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f859i
            android.content.Context r2 = r3.f857g
            r4.mo587a(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f859i
            androidx.appcompat.view.menu.n r4 = r4.mo523b(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f858h = r4
            r1 = 0
            p071f.p097h.p108m.C3379v.m13787a(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f858h
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.mo864a(f.a.o.b):void");
    }

    /* renamed from: b */
    public boolean mo865b() {
        return this.f649w;
    }

    /* renamed from: c */
    public void mo866c() {
        removeAllViews();
        this.f643q = null;
        this.f858h = null;
    }

    /* renamed from: d */
    public boolean mo867d() {
        C0195c cVar = this.f859i;
        if (cVar != null) {
            return cVar.mo1300k();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f641o;
    }

    public CharSequence getTitle() {
        return this.f640n;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0195c cVar = this.f859i;
        if (cVar != null) {
            cVar.mo1296e();
            this.f859i.mo1297h();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f640n);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a = C0293z0.m1487a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f642p;
        if (!(view == null || view.getVisibility() == 8)) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f642p.getLayoutParams();
            int i5 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = C0187a.m965a(paddingRight, i5, a);
            paddingRight = C0187a.m965a(a2 + mo1254a(this.f642p, a2, paddingTop, paddingTop2, a), i6, a);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f644r;
        if (!(linearLayout == null || this.f643q != null || linearLayout.getVisibility() == 8)) {
            i7 += mo1254a(this.f644r, i7, paddingTop, paddingTop2, a);
        }
        int i8 = i7;
        View view2 = this.f643q;
        if (view2 != null) {
            mo1254a(view2, i8, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f858h;
        if (actionMenuView != null) {
            mo1254a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(ActionBarContextView.class.getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (MeasureSpec.getMode(i2) != 0) {
            int size = MeasureSpec.getSize(i);
            int i4 = this.f860j;
            if (i4 <= 0) {
                i4 = MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, RecyclerView.UNDEFINED_DURATION);
            View view = this.f642p;
            if (view != null) {
                int a = mo1253a(view, paddingLeft, makeMeasureSpec, 0);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f642p.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f858h;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo1253a(this.f858h, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f644r;
            if (linearLayout != null && this.f643q == null) {
                if (this.f649w) {
                    this.f644r.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f644r.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f644r.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo1253a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f643q;
            if (view2 != null) {
                LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : RecyclerView.UNDEFINED_DURATION;
                int i7 = layoutParams.width;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = RecyclerView.UNDEFINED_DURATION;
                }
                int i8 = layoutParams.height;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f643q.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i6), MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f860j <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ActionBarContextView.class.getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public void setContentHeight(int i) {
        this.f860j = i;
    }

    public void setCustomView(View view) {
        View view2 = this.f643q;
        if (view2 != null) {
            removeView(view2);
        }
        this.f643q = view;
        if (view != null) {
            LinearLayout linearLayout = this.f644r;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.f644r = null;
            }
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f641o = charSequence;
        m795e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f640n = charSequence;
        m795e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f649w) {
            requestLayout();
        }
        this.f649w = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
