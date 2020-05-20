package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0335f;
import java.util.HashMap;
import java.util.Map;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4372a;
import p147g.p156d.p157a.p185c.p189m.C4424h;
import p147g.p156d.p157a.p185c.p189m.C4426j;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f8233i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m11683a(View view, boolean z) {
        int i;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (VERSION.SDK_INT >= 16 && z) {
                this.f8233i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z2 = (childAt.getLayoutParams() instanceof C0335f) && (((C0335f) childAt.getLayoutParams()).mo2138d() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f8233i;
                        if (map != null && map.containsKey(childAt)) {
                            i = ((Integer) this.f8233i.get(childAt)).intValue();
                        }
                    } else {
                        if (VERSION.SDK_INT >= 16) {
                            this.f8233i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        i = 4;
                    }
                    C3379v.m13820h(childAt, i);
                }
            }
            if (!z) {
                this.f8233i = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2801e mo9385a(Context context, boolean z) {
        int i = z ? C4372a.mtrl_fab_transformation_sheet_expand_spec : C4372a.mtrl_fab_transformation_sheet_collapse_spec;
        C2801e eVar = new C2801e();
        eVar.f8227a = C4424h.m18017a(context, i);
        eVar.f8228b = new C4426j(17, 0.0f, 0.0f);
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9380a(View view, View view2, boolean z, boolean z2) {
        m11683a(view2, z);
        return super.mo9380a(view, view2, z, z2);
    }
}
