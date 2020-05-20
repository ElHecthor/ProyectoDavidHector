package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import androidx.appcompat.view.menu.C0122g.C0124b;
import androidx.appcompat.view.menu.C0139n.C0140a;
import androidx.appcompat.widget.ActionMenuView.C0154a;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0208d0;
import androidx.appcompat.widget.C0283v0;
import p071f.p072a.C3102j;

public class ActionMenuItemView extends AppCompatTextView implements C0140a, OnClickListener, C0154a {

    /* renamed from: j */
    C0126i f398j;

    /* renamed from: k */
    private CharSequence f399k;

    /* renamed from: l */
    private Drawable f400l;

    /* renamed from: m */
    C0124b f401m;

    /* renamed from: n */
    private C0208d0 f402n;

    /* renamed from: o */
    C0109b f403o;

    /* renamed from: p */
    private boolean f404p;

    /* renamed from: q */
    private boolean f405q;

    /* renamed from: r */
    private int f406r;

    /* renamed from: s */
    private int f407s;

    /* renamed from: t */
    private int f408t;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0108a extends C0208d0 {
        public C0108a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: a */
        public C0142p mo435a() {
            C0109b bVar = ActionMenuItemView.this.f403o;
            if (bVar != null) {
                return bVar.mo437a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo436b() {
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0124b bVar = actionMenuItemView.f401m;
            if (bVar == null || !bVar.mo439a(actionMenuItemView.f398j)) {
                return false;
            }
            C0142p a = mo435a();
            return a != null && a.mo536a();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0109b {
        /* renamed from: a */
        public abstract C0142p mo437a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f404p = m516e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3102j.ActionMenuItemView, i, 0);
        this.f406r = obtainStyledAttributes.getDimensionPixelSize(C3102j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f408t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f407s = -1;
        setSaveEnabled(false);
    }

    /* renamed from: e */
    private boolean m516e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    private void m517f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f399k);
        if (this.f400l != null && (!this.f398j.mo693n() || (!this.f404p && !this.f405q))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f399k : null);
        CharSequence contentDescription = this.f398j.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f398j.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f398j.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f398j.getTitle();
            }
            C0283v0.m1404a(this, charSequence);
            return;
        }
        C0283v0.m1404a(this, tooltipText);
    }

    /* renamed from: a */
    public void mo416a(C0126i iVar, int i) {
        this.f398j = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.mo656a((C0140a) this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f402n == null) {
            this.f402n = new C0108a();
        }
    }

    /* renamed from: a */
    public boolean mo417a() {
        return mo420d();
    }

    /* renamed from: b */
    public boolean mo418b() {
        return true;
    }

    /* renamed from: c */
    public boolean mo419c() {
        return mo420d() && this.f398j.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo420d() {
        return !TextUtils.isEmpty(getText());
    }

    public C0126i getItemData() {
        return this.f398j;
    }

    public void onClick(View view) {
        C0124b bVar = this.f401m;
        if (bVar != null) {
            bVar.mo439a(this.f398j);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f404p = m516e();
        m517f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean d = mo420d();
        if (d) {
            int i3 = this.f407s;
            if (i3 >= 0) {
                super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f406r) : this.f406r;
        if (mode != 1073741824 && this.f406r > 0 && measuredWidth < min) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!d && this.f400l != null) {
            super.setPadding((getMeasuredWidth() - this.f400l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f398j.hasSubMenu()) {
            C0208d0 d0Var = this.f402n;
            if (d0Var != null && d0Var.onTouch(this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f405q != z) {
            this.f405q = z;
            C0126i iVar = this.f398j;
            if (iVar != null) {
                iVar.mo660b();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f400l = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f408t;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.f408t;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m517f();
    }

    public void setItemInvoker(C0124b bVar) {
        this.f401m = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f407s = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0109b bVar) {
        this.f403o = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f399k = charSequence;
        m517f();
    }
}
