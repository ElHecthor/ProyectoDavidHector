package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import p071f.p072a.C3096d;
import p071f.p072a.C3098f;
import p071f.p072a.C3099g;
import p071f.p072a.C3101i;

/* renamed from: androidx.appcompat.widget.x0 */
class C0289x0 {

    /* renamed from: a */
    private final Context f1262a;

    /* renamed from: b */
    private final View f1263b;

    /* renamed from: c */
    private final TextView f1264c;

    /* renamed from: d */
    private final LayoutParams f1265d = new LayoutParams();

    /* renamed from: e */
    private final Rect f1266e = new Rect();

    /* renamed from: f */
    private final int[] f1267f = new int[2];

    /* renamed from: g */
    private final int[] f1268g = new int[2];

    C0289x0(Context context) {
        this.f1262a = context;
        View inflate = LayoutInflater.from(context).inflate(C3099g.abc_tooltip, null);
        this.f1263b = inflate;
        this.f1264c = (TextView) inflate.findViewById(C3098f.message);
        this.f1265d.setTitle(C0289x0.class.getSimpleName());
        this.f1265d.packageName = this.f1262a.getPackageName();
        LayoutParams layoutParams = this.f1265d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C3101i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private static View m1444a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    private void m1445a(View view, int i, int i2, boolean z, LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1262a.getResources().getDimensionPixelOffset(C3096d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1262a.getResources().getDimensionPixelOffset(C3096d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1262a.getResources().getDimensionPixelOffset(z ? C3096d.tooltip_y_offset_touch : C3096d.tooltip_y_offset_non_touch);
        View a = m1444a(view);
        if (a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a.getWindowVisibleDisplayFrame(this.f1266e);
        Rect rect = this.f1266e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1262a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1266e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a.getLocationOnScreen(this.f1268g);
        view.getLocationOnScreen(this.f1267f);
        int[] iArr = this.f1267f;
        int i5 = iArr[0];
        int[] iArr2 = this.f1268g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (a.getWidth() / 2);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        this.f1263b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1263b.getMeasuredHeight();
        int[] iArr3 = this.f1267f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i7 > this.f1266e.height() : i6 >= 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1841a() {
        if (mo1843b()) {
            ((WindowManager) this.f1262a.getSystemService("window")).removeView(this.f1263b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1842a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo1843b()) {
            mo1841a();
        }
        this.f1264c.setText(charSequence);
        m1445a(view, i, i2, z, this.f1265d);
        ((WindowManager) this.f1262a.getSystemService("window")).addView(this.f1263b, this.f1265d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo1843b() {
        return this.f1263b.getParent() != null;
    }
}
