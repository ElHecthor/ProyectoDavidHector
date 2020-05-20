package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.C0061a.C0064c;
import androidx.appcompat.widget.C0212e0.C0213a;
import p071f.p072a.C3093a;
import p071f.p072a.p079o.C3123a;

/* renamed from: androidx.appcompat.widget.l0 */
public class C0242l0 extends HorizontalScrollView implements OnItemSelectedListener {

    /* renamed from: f */
    Runnable f1045f;

    /* renamed from: g */
    private C0245c f1046g;

    /* renamed from: h */
    C0212e0 f1047h;

    /* renamed from: i */
    private Spinner f1048i;

    /* renamed from: j */
    private boolean f1049j;

    /* renamed from: k */
    int f1050k;

    /* renamed from: l */
    int f1051l;

    /* renamed from: m */
    private int f1052m;

    /* renamed from: n */
    private int f1053n;

    /* renamed from: androidx.appcompat.widget.l0$a */
    class C0243a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f1054f;

        C0243a(View view) {
            this.f1054f = view;
        }

        public void run() {
            C0242l0.this.smoothScrollTo(this.f1054f.getLeft() - ((C0242l0.this.getWidth() - this.f1054f.getWidth()) / 2), 0);
            C0242l0.this.f1045f = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$b */
    private class C0244b extends BaseAdapter {
        C0244b() {
        }

        public int getCount() {
            return C0242l0.this.f1047h.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0246d) C0242l0.this.f1047h.getChildAt(i)).mo1555a();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0242l0.this.mo1538a((C0064c) getItem(i), true);
            }
            ((C0246d) view).mo1556a((C0064c) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$c */
    private class C0245c implements OnClickListener {
        C0245c() {
        }

        public void onClick(View view) {
            ((C0246d) view).mo1555a().mo206e();
            int childCount = C0242l0.this.f1047h.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0242l0.this.f1047h.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$d */
    private class C0246d extends LinearLayout {

        /* renamed from: f */
        private final int[] f1058f;

        /* renamed from: g */
        private C0064c f1059g;

        /* renamed from: h */
        private TextView f1060h;

        /* renamed from: i */
        private ImageView f1061i;

        /* renamed from: j */
        private View f1062j;

        public C0246d(Context context, C0064c cVar, boolean z) {
            super(context, null, C3093a.actionBarTabStyle);
            int[] iArr = {16842964};
            this.f1058f = iArr;
            this.f1059g = cVar;
            C0275t0 a = C0275t0.m1311a(context, null, iArr, C3093a.actionBarTabStyle, 0);
            if (a.mo1751g(0)) {
                setBackgroundDrawable(a.mo1741b(0));
            }
            a.mo1737a();
            if (z) {
                setGravity(8388627);
            }
            mo1557b();
        }

        /* renamed from: a */
        public C0064c mo1555a() {
            return this.f1059g;
        }

        /* renamed from: a */
        public void mo1556a(C0064c cVar) {
            this.f1059g = cVar;
            mo1557b();
        }

        /* renamed from: b */
        public void mo1557b() {
            C0064c cVar = this.f1059g;
            View b = cVar.mo203b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1062j = b;
                TextView textView = this.f1060h;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1061i;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1061i.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1062j;
            if (view != null) {
                removeView(view);
                this.f1062j = null;
            }
            Drawable c = cVar.mo204c();
            CharSequence d = cVar.mo205d();
            if (c != null) {
                if (this.f1061i == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LayoutParams layoutParams = new LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1061i = appCompatImageView;
                }
                this.f1061i.setImageDrawable(c);
                this.f1061i.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1061i;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1061i.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f1060h == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C3093a.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TruncateAt.END);
                    LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1060h = appCompatTextView;
                }
                this.f1060h.setText(d);
                this.f1060h.setVisibility(0);
            } else {
                TextView textView2 = this.f1060h;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1060h.setText(null);
                }
            }
            ImageView imageView3 = this.f1061i;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.mo202a());
            }
            if (!z) {
                charSequence = cVar.mo202a();
            }
            C0283v0.m1404a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0242l0.this.f1050k > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C0242l0.this.f1050k;
                if (measuredWidth > i3) {
                    super.onMeasure(MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: a */
    private Spinner m1195a() {
        C0263t tVar = new C0263t(getContext(), null, C3093a.actionDropDownStyle);
        tVar.setLayoutParams(new C0213a(-2, -1));
        tVar.setOnItemSelectedListener(this);
        return tVar;
    }

    /* renamed from: b */
    private boolean m1196b() {
        Spinner spinner = this.f1048i;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: c */
    private void m1197c() {
        if (!m1196b()) {
            if (this.f1048i == null) {
                this.f1048i = m1195a();
            }
            removeView(this.f1047h);
            addView(this.f1048i, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1048i.getAdapter() == null) {
                this.f1048i.setAdapter(new C0244b());
            }
            Runnable runnable = this.f1045f;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1045f = null;
            }
            this.f1048i.setSelection(this.f1053n);
        }
    }

    /* renamed from: d */
    private boolean m1198d() {
        if (!m1196b()) {
            return false;
        }
        removeView(this.f1048i);
        addView(this.f1047h, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1048i.getSelectedItemPosition());
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0246d mo1538a(C0064c cVar, boolean z) {
        C0246d dVar = new C0246d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1052m));
        } else {
            dVar.setFocusable(true);
            if (this.f1046g == null) {
                this.f1046g = new C0245c();
            }
            dVar.setOnClickListener(this.f1046g);
        }
        return dVar;
    }

    /* renamed from: a */
    public void mo1539a(int i) {
        View childAt = this.f1047h.getChildAt(i);
        Runnable runnable = this.f1045f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0243a aVar = new C0243a(childAt);
        this.f1045f = aVar;
        post(aVar);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1045f;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C3123a a = C3123a.m12641a(getContext());
        setContentHeight(a.mo10043e());
        this.f1051l = a.mo10042d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1045f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0246d) view).mo1555a().mo206e();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1047h.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f1050k = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1050k = MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f1050k, this.f1051l);
        }
        this.f1050k = i3;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f1052m, 1073741824);
        if (z2 || !this.f1049j) {
            z = false;
        }
        if (z) {
            this.f1047h.measure(0, makeMeasureSpec);
            if (this.f1047h.getMeasuredWidth() > MeasureSpec.getSize(i)) {
                m1197c();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f1053n);
                    return;
                }
            }
        }
        m1198d();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1049j = z;
    }

    public void setContentHeight(int i) {
        this.f1052m = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1053n = i;
        int childCount = this.f1047h.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1047h.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo1539a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1048i;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
