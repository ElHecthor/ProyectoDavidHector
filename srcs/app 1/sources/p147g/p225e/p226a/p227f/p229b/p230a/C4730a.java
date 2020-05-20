package p147g.p225e.p226a.p227f.p229b.p230a;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;

/* renamed from: g.e.a.f.b.a.a */
public final class C4730a extends SimpleOnGestureListener {

    /* renamed from: f */
    private final C5918l<MotionEvent, Boolean> f12375f;

    /* renamed from: g */
    private final C5918l<MotionEvent, Boolean> f12376g;

    public C4730a(C5918l<? super MotionEvent, Boolean> lVar, C5918l<? super MotionEvent, Boolean> lVar2) {
        this.f12375f = lVar;
        this.f12376g = lVar2;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C5942k.m22327b(motionEvent, "event");
        C5918l<MotionEvent, Boolean> lVar = this.f12376g;
        if (lVar != null) {
            Boolean bool = (Boolean) lVar.mo4090d(motionEvent);
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C5942k.m22327b(motionEvent, "event");
        C5918l<MotionEvent, Boolean> lVar = this.f12375f;
        if (lVar != null) {
            Boolean bool = (Boolean) lVar.mo4090d(motionEvent);
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }
}
