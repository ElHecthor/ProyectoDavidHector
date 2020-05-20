package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: k */
    private final C2721a f7899k = new C2721a(this);

    /* renamed from: a */
    public boolean mo7952a(View view) {
        return this.f7899k.mo9019a(view);
    }

    /* renamed from: a */
    public boolean mo2110a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f7899k.mo9018a(coordinatorLayout, view, motionEvent);
        return super.mo2110a(coordinatorLayout, view, motionEvent);
    }
}
