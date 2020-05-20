package p147g.p156d.p157a.p185c.p196s;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

/* renamed from: g.d.a.c.s.a */
public class C4446a implements OnTouchListener {

    /* renamed from: f */
    private final Dialog f11779f;

    /* renamed from: g */
    private final int f11780g;

    /* renamed from: h */
    private final int f11781h;

    /* renamed from: i */
    private final int f11782i;

    public C4446a(Dialog dialog, Rect rect) {
        this.f11779f = dialog;
        this.f11780g = rect.left;
        this.f11781h = rect.top;
        this.f11782i = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f11780g + findViewById.getLeft();
        int top = this.f11781h + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) (findViewById.getWidth() + left), (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(4);
        if (VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f11782i;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f11779f.onTouchEvent(obtain);
    }
}
