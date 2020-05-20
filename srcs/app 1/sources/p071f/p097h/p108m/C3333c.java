package p071f.p097h.p108m;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: f.h.m.c */
public final class C3333c {

    /* renamed from: a */
    private final C3334a f9515a;

    /* renamed from: f.h.m.c$a */
    interface C3334a {
        /* renamed from: a */
        boolean mo10725a(MotionEvent motionEvent);
    }

    /* renamed from: f.h.m.c$b */
    static class C3335b implements C3334a {

        /* renamed from: v */
        private static final int f9516v = ViewConfiguration.getLongPressTimeout();

        /* renamed from: w */
        private static final int f9517w = ViewConfiguration.getTapTimeout();

        /* renamed from: x */
        private static final int f9518x = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a */
        private int f9519a;

        /* renamed from: b */
        private int f9520b;

        /* renamed from: c */
        private int f9521c;

        /* renamed from: d */
        private int f9522d;

        /* renamed from: e */
        private final Handler f9523e;

        /* renamed from: f */
        final OnGestureListener f9524f;

        /* renamed from: g */
        OnDoubleTapListener f9525g;

        /* renamed from: h */
        boolean f9526h;

        /* renamed from: i */
        boolean f9527i;

        /* renamed from: j */
        private boolean f9528j;

        /* renamed from: k */
        private boolean f9529k;

        /* renamed from: l */
        private boolean f9530l;

        /* renamed from: m */
        MotionEvent f9531m;

        /* renamed from: n */
        private MotionEvent f9532n;

        /* renamed from: o */
        private boolean f9533o;

        /* renamed from: p */
        private float f9534p;

        /* renamed from: q */
        private float f9535q;

        /* renamed from: r */
        private float f9536r;

        /* renamed from: s */
        private float f9537s;

        /* renamed from: t */
        private boolean f9538t;

        /* renamed from: u */
        private VelocityTracker f9539u;

        /* renamed from: f.h.m.c$b$a */
        private class C3336a extends Handler {
            C3336a() {
            }

            C3336a(Handler handler) {
                super(handler.getLooper());
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    C3335b bVar = C3335b.this;
                    bVar.f9524f.onShowPress(bVar.f9531m);
                } else if (i == 2) {
                    C3335b.this.mo10726a();
                } else if (i == 3) {
                    C3335b bVar2 = C3335b.this;
                    OnDoubleTapListener onDoubleTapListener = bVar2.f9525g;
                    if (onDoubleTapListener == null) {
                        return;
                    }
                    if (!bVar2.f9526h) {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.f9531m);
                    } else {
                        bVar2.f9527i = true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown message ");
                    sb.append(message);
                    throw new RuntimeException(sb.toString());
                }
            }
        }

        C3335b(Context context, OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f9523e = new C3336a(handler);
            } else {
                this.f9523e = new C3336a();
            }
            this.f9524f = onGestureListener;
            if (onGestureListener instanceof OnDoubleTapListener) {
                mo10727a((OnDoubleTapListener) onGestureListener);
            }
            m13596a(context);
        }

        /* renamed from: a */
        private void m13596a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f9524f != null) {
                this.f9538t = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f9521c = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f9522d = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f9519a = scaledTouchSlop * scaledTouchSlop;
                this.f9520b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        /* renamed from: a */
        private boolean m13597a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            boolean z = false;
            if (!this.f9530l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) f9518x)) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x * x) + (y * y) < this.f9520b) {
                z = true;
            }
            return z;
        }

        /* renamed from: b */
        private void m13598b() {
            this.f9523e.removeMessages(1);
            this.f9523e.removeMessages(2);
            this.f9523e.removeMessages(3);
            this.f9539u.recycle();
            this.f9539u = null;
            this.f9533o = false;
            this.f9526h = false;
            this.f9529k = false;
            this.f9530l = false;
            this.f9527i = false;
            if (this.f9528j) {
                this.f9528j = false;
            }
        }

        /* renamed from: c */
        private void m13599c() {
            this.f9523e.removeMessages(1);
            this.f9523e.removeMessages(2);
            this.f9523e.removeMessages(3);
            this.f9533o = false;
            this.f9529k = false;
            this.f9530l = false;
            this.f9527i = false;
            if (this.f9528j) {
                this.f9528j = false;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo10726a() {
            this.f9523e.removeMessages(3);
            this.f9527i = false;
            this.f9528j = true;
            this.f9524f.onLongPress(this.f9531m);
        }

        /* renamed from: a */
        public void mo10727a(OnDoubleTapListener onDoubleTapListener) {
            this.f9525g = onDoubleTapListener;
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0208  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x021f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo10725a(android.view.MotionEvent r13) {
            /*
                r12 = this;
                int r0 = r13.getAction()
                android.view.VelocityTracker r1 = r12.f9539u
                if (r1 != 0) goto L_0x000e
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r12.f9539u = r1
            L_0x000e:
                android.view.VelocityTracker r1 = r12.f9539u
                r1.addMovement(r13)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = 6
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x001c
                r4 = 1
                goto L_0x001d
            L_0x001c:
                r4 = 0
            L_0x001d:
                if (r4 == 0) goto L_0x0024
                int r5 = r13.getActionIndex()
                goto L_0x0025
            L_0x0024:
                r5 = -1
            L_0x0025:
                int r6 = r13.getPointerCount()
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
            L_0x002d:
                if (r8 >= r6) goto L_0x003f
                if (r5 != r8) goto L_0x0032
                goto L_0x003c
            L_0x0032:
                float r11 = r13.getX(r8)
                float r9 = r9 + r11
                float r11 = r13.getY(r8)
                float r10 = r10 + r11
            L_0x003c:
                int r8 = r8 + 1
                goto L_0x002d
            L_0x003f:
                if (r4 == 0) goto L_0x0044
                int r4 = r6 + -1
                goto L_0x0045
            L_0x0044:
                r4 = r6
            L_0x0045:
                float r4 = (float) r4
                float r9 = r9 / r4
                float r10 = r10 / r4
                r4 = 2
                r5 = 3
                if (r0 == 0) goto L_0x01bf
                r8 = 1000(0x3e8, float:1.401E-42)
                if (r0 == r2) goto L_0x0131
                if (r0 == r4) goto L_0x00ba
                if (r0 == r5) goto L_0x00b5
                r2 = 5
                if (r0 == r2) goto L_0x00a8
                if (r0 == r1) goto L_0x005b
                goto L_0x024e
            L_0x005b:
                r12.f9534p = r9
                r12.f9536r = r9
                r12.f9535q = r10
                r12.f9537s = r10
                android.view.VelocityTracker r0 = r12.f9539u
                int r1 = r12.f9522d
                float r1 = (float) r1
                r0.computeCurrentVelocity(r8, r1)
                int r0 = r13.getActionIndex()
                int r1 = r13.getPointerId(r0)
                android.view.VelocityTracker r2 = r12.f9539u
                float r2 = r2.getXVelocity(r1)
                android.view.VelocityTracker r4 = r12.f9539u
                float r1 = r4.getYVelocity(r1)
                r4 = 0
            L_0x0080:
                if (r4 >= r6) goto L_0x024e
                if (r4 != r0) goto L_0x0085
                goto L_0x00a5
            L_0x0085:
                int r5 = r13.getPointerId(r4)
                android.view.VelocityTracker r8 = r12.f9539u
                float r8 = r8.getXVelocity(r5)
                float r8 = r8 * r2
                android.view.VelocityTracker r9 = r12.f9539u
                float r5 = r9.getYVelocity(r5)
                float r5 = r5 * r1
                float r8 = r8 + r5
                int r5 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
                if (r5 >= 0) goto L_0x00a5
                android.view.VelocityTracker r13 = r12.f9539u
                r13.clear()
                goto L_0x024e
            L_0x00a5:
                int r4 = r4 + 1
                goto L_0x0080
            L_0x00a8:
                r12.f9534p = r9
                r12.f9536r = r9
                r12.f9535q = r10
                r12.f9537s = r10
                r12.m13599c()
                goto L_0x024e
            L_0x00b5:
                r12.m13598b()
                goto L_0x024e
            L_0x00ba:
                boolean r0 = r12.f9528j
                if (r0 == 0) goto L_0x00c0
                goto L_0x024e
            L_0x00c0:
                float r0 = r12.f9534p
                float r0 = r0 - r9
                float r1 = r12.f9535q
                float r1 = r1 - r10
                boolean r6 = r12.f9533o
                if (r6 == 0) goto L_0x00d3
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f9525g
                boolean r13 = r0.onDoubleTapEvent(r13)
                r3 = r3 | r13
                goto L_0x024e
            L_0x00d3:
                boolean r6 = r12.f9529k
                if (r6 == 0) goto L_0x0111
                float r6 = r12.f9536r
                float r6 = r9 - r6
                int r6 = (int) r6
                float r7 = r12.f9537s
                float r7 = r10 - r7
                int r7 = (int) r7
                int r6 = r6 * r6
                int r7 = r7 * r7
                int r6 = r6 + r7
                int r7 = r12.f9519a
                if (r6 <= r7) goto L_0x0108
                android.view.GestureDetector$OnGestureListener r7 = r12.f9524f
                android.view.MotionEvent r8 = r12.f9531m
                boolean r13 = r7.onScroll(r8, r13, r0, r1)
                r12.f9534p = r9
                r12.f9535q = r10
                r12.f9529k = r3
                android.os.Handler r0 = r12.f9523e
                r0.removeMessages(r5)
                android.os.Handler r0 = r12.f9523e
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.f9523e
                r0.removeMessages(r4)
                goto L_0x0109
            L_0x0108:
                r13 = 0
            L_0x0109:
                int r0 = r12.f9519a
                if (r6 <= r0) goto L_0x01bc
                r12.f9530l = r3
                goto L_0x01bc
            L_0x0111:
                float r2 = java.lang.Math.abs(r0)
                r4 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 >= 0) goto L_0x0123
                float r2 = java.lang.Math.abs(r1)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x024e
            L_0x0123:
                android.view.GestureDetector$OnGestureListener r2 = r12.f9524f
                android.view.MotionEvent r3 = r12.f9531m
                boolean r3 = r2.onScroll(r3, r13, r0, r1)
                r12.f9534p = r9
                r12.f9535q = r10
                goto L_0x024e
            L_0x0131:
                r12.f9526h = r3
                android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r13)
                boolean r1 = r12.f9533o
                if (r1 == 0) goto L_0x0143
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.f9525g
                boolean r13 = r1.onDoubleTapEvent(r13)
                r13 = r13 | r3
                goto L_0x019b
            L_0x0143:
                boolean r1 = r12.f9528j
                if (r1 == 0) goto L_0x014f
                android.os.Handler r13 = r12.f9523e
                r13.removeMessages(r5)
                r12.f9528j = r3
                goto L_0x0191
            L_0x014f:
                boolean r1 = r12.f9529k
                if (r1 == 0) goto L_0x0166
                android.view.GestureDetector$OnGestureListener r1 = r12.f9524f
                boolean r1 = r1.onSingleTapUp(r13)
                boolean r5 = r12.f9527i
                if (r5 == 0) goto L_0x0164
                android.view.GestureDetector$OnDoubleTapListener r5 = r12.f9525g
                if (r5 == 0) goto L_0x0164
                r5.onSingleTapConfirmed(r13)
            L_0x0164:
                r13 = r1
                goto L_0x019b
            L_0x0166:
                android.view.VelocityTracker r1 = r12.f9539u
                int r5 = r13.getPointerId(r3)
                int r6 = r12.f9522d
                float r6 = (float) r6
                r1.computeCurrentVelocity(r8, r6)
                float r6 = r1.getYVelocity(r5)
                float r1 = r1.getXVelocity(r5)
                float r5 = java.lang.Math.abs(r6)
                int r7 = r12.f9521c
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 > 0) goto L_0x0193
                float r5 = java.lang.Math.abs(r1)
                int r7 = r12.f9521c
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 <= 0) goto L_0x0191
                goto L_0x0193
            L_0x0191:
                r13 = 0
                goto L_0x019b
            L_0x0193:
                android.view.GestureDetector$OnGestureListener r5 = r12.f9524f
                android.view.MotionEvent r7 = r12.f9531m
                boolean r13 = r5.onFling(r7, r13, r1, r6)
            L_0x019b:
                android.view.MotionEvent r1 = r12.f9532n
                if (r1 == 0) goto L_0x01a2
                r1.recycle()
            L_0x01a2:
                r12.f9532n = r0
                android.view.VelocityTracker r0 = r12.f9539u
                if (r0 == 0) goto L_0x01ae
                r0.recycle()
                r0 = 0
                r12.f9539u = r0
            L_0x01ae:
                r12.f9533o = r3
                r12.f9527i = r3
                android.os.Handler r0 = r12.f9523e
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.f9523e
                r0.removeMessages(r4)
            L_0x01bc:
                r3 = r13
                goto L_0x024e
            L_0x01bf:
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f9525g
                if (r0 == 0) goto L_0x01fb
                android.os.Handler r0 = r12.f9523e
                boolean r0 = r0.hasMessages(r5)
                if (r0 == 0) goto L_0x01d0
                android.os.Handler r1 = r12.f9523e
                r1.removeMessages(r5)
            L_0x01d0:
                android.view.MotionEvent r1 = r12.f9531m
                if (r1 == 0) goto L_0x01f3
                android.view.MotionEvent r6 = r12.f9532n
                if (r6 == 0) goto L_0x01f3
                if (r0 == 0) goto L_0x01f3
                boolean r0 = r12.m13597a(r1, r6, r13)
                if (r0 == 0) goto L_0x01f3
                r12.f9533o = r2
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f9525g
                android.view.MotionEvent r1 = r12.f9531m
                boolean r0 = r0.onDoubleTap(r1)
                r0 = r0 | r3
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.f9525g
                boolean r1 = r1.onDoubleTapEvent(r13)
                r0 = r0 | r1
                goto L_0x01fc
            L_0x01f3:
                android.os.Handler r0 = r12.f9523e
                int r1 = f9518x
                long r6 = (long) r1
                r0.sendEmptyMessageDelayed(r5, r6)
            L_0x01fb:
                r0 = 0
            L_0x01fc:
                r12.f9534p = r9
                r12.f9536r = r9
                r12.f9535q = r10
                r12.f9537s = r10
                android.view.MotionEvent r1 = r12.f9531m
                if (r1 == 0) goto L_0x020b
                r1.recycle()
            L_0x020b:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r13)
                r12.f9531m = r1
                r12.f9529k = r2
                r12.f9530l = r2
                r12.f9526h = r2
                r12.f9528j = r3
                r12.f9527i = r3
                boolean r1 = r12.f9538t
                if (r1 == 0) goto L_0x0237
                android.os.Handler r1 = r12.f9523e
                r1.removeMessages(r4)
                android.os.Handler r1 = r12.f9523e
                android.view.MotionEvent r3 = r12.f9531m
                long r5 = r3.getDownTime()
                int r3 = f9517w
                long r7 = (long) r3
                long r5 = r5 + r7
                int r3 = f9516v
                long r7 = (long) r3
                long r5 = r5 + r7
                r1.sendEmptyMessageAtTime(r4, r5)
            L_0x0237:
                android.os.Handler r1 = r12.f9523e
                android.view.MotionEvent r3 = r12.f9531m
                long r3 = r3.getDownTime()
                int r5 = f9517w
                long r5 = (long) r5
                long r3 = r3 + r5
                r1.sendEmptyMessageAtTime(r2, r3)
                android.view.GestureDetector$OnGestureListener r1 = r12.f9524f
                boolean r13 = r1.onDown(r13)
                r3 = r0 | r13
            L_0x024e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p071f.p097h.p108m.C3333c.C3335b.mo10725a(android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: f.h.m.c$c */
    static class C3337c implements C3334a {

        /* renamed from: a */
        private final GestureDetector f9541a;

        C3337c(Context context, OnGestureListener onGestureListener, Handler handler) {
            this.f9541a = new GestureDetector(context, onGestureListener, handler);
        }

        /* renamed from: a */
        public boolean mo10725a(MotionEvent motionEvent) {
            return this.f9541a.onTouchEvent(motionEvent);
        }
    }

    public C3333c(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public C3333c(Context context, OnGestureListener onGestureListener, Handler handler) {
        this.f9515a = VERSION.SDK_INT > 17 ? new C3337c(context, onGestureListener, handler) : new C3335b(context, onGestureListener, handler);
    }

    /* renamed from: a */
    public boolean mo10724a(MotionEvent motionEvent) {
        return this.f9515a.mo10725a(motionEvent);
    }
}
