package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: com.google.android.material.snackbar.a */
public class C2721a {

    /* renamed from: a */
    private C2728b f7904a;

    public C2721a(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.mo7953b(0.1f);
        swipeDismissBehavior.mo7950a(0.6f);
        swipeDismissBehavior.mo7951a(0);
    }

    /* renamed from: a */
    public void mo9018a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C2726e.m11303a().mo9035b(this.f7904a);
            }
        } else if (coordinatorLayout.mo2052a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C2726e.m11303a().mo9033a(this.f7904a);
        }
    }

    /* renamed from: a */
    public boolean mo9019a(View view) {
        return view instanceof C2724d;
    }
}
