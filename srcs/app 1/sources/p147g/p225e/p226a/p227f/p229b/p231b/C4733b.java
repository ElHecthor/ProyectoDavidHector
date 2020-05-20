package p147g.p225e.p226a.p227f.p229b.p231b;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;

/* renamed from: g.e.a.f.b.b.b */
public final class C4733b {

    /* renamed from: a */
    private final int f12384a;

    /* renamed from: b */
    private float f12385b;

    /* renamed from: c */
    private float f12386c;

    /* renamed from: d */
    private boolean f12387d;

    /* renamed from: e */
    private final C5918l<C4731a, C5812t> f12388e;

    public C4733b(Context context, C5918l<? super C4731a, C5812t> lVar) {
        C5942k.m22327b(context, "context");
        C5942k.m22327b(lVar, "onDirectionDetected");
        this.f12388e = lVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C5942k.m22324a((Object) viewConfiguration, "ViewConfiguration.get(context)");
        this.f12384a = viewConfiguration.getScaledTouchSlop();
    }

    /* renamed from: a */
    private final double m19060a(float f, float f2, float f3, float f4) {
        double d = (double) 180;
        return ((((Math.atan2((double) (f2 - f4), (double) (f3 - f)) + 3.141592653589793d) * d) / 3.141592653589793d) + d) % ((double) 360);
    }

    /* renamed from: b */
    private final float m19061b(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - this.f12385b;
        float y = motionEvent.getY(0) - this.f12386c;
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    /* renamed from: b */
    private final C4731a m19062b(float f, float f2, float f3, float f4) {
        return C4731a.f12383l.mo13704a(m19060a(f, f2, f3, f4));
    }

    /* renamed from: a */
    public final void mo13705a(MotionEvent motionEvent) {
        C5942k.m22327b(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                } else if (!this.f12387d && m19061b(motionEvent) > ((float) this.f12384a)) {
                    this.f12387d = true;
                    this.f12388e.mo4090d(m19062b(this.f12385b, this.f12386c, motionEvent.getX(), motionEvent.getY()));
                    return;
                } else {
                    return;
                }
            }
            if (!this.f12387d) {
                this.f12388e.mo4090d(C4731a.NOT_DETECTED);
            }
            this.f12386c = 0.0f;
            this.f12385b = 0.0f;
            this.f12387d = false;
            return;
        }
        this.f12385b = motionEvent.getX();
        this.f12386c = motionEvent.getY();
    }
}
