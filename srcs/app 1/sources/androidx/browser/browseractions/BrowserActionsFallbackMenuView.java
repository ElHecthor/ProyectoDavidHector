package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import p071f.p085c.C3152a;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: f */
    private final int f1272f = getResources().getDimensionPixelOffset(C3152a.browser_actions_context_menu_min_padding);

    /* renamed from: g */
    private final int f1273g = getResources().getDimensionPixelOffset(C3152a.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1272f * 2), this.f1273g), 1073741824), i2);
    }
}
