package p071f.p139v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p071f.p139v.C3607m.C3613f;

/* renamed from: f.v.j0 */
public abstract class C3599j0 extends C3607m {

    /* renamed from: P */
    private static final String[] f10094P = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: O */
    private int f10095O = 3;

    /* renamed from: f.v.j0$a */
    class C3600a extends C3615n {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f10096a;

        /* renamed from: b */
        final /* synthetic */ View f10097b;

        /* renamed from: c */
        final /* synthetic */ View f10098c;

        C3600a(ViewGroup viewGroup, View view, View view2) {
            this.f10096a = viewGroup;
            this.f10097b = view;
            this.f10098c = view2;
        }

        /* renamed from: c */
        public void mo11306c(C3607m mVar) {
            C3629x.m14780a(this.f10096a).mo11407b(this.f10097b);
        }

        /* renamed from: d */
        public void mo11307d(C3607m mVar) {
            if (this.f10097b.getParent() == null) {
                C3629x.m14780a(this.f10096a).mo11406a(this.f10097b);
            } else {
                C3599j0.this.cancel();
            }
        }

        /* renamed from: e */
        public void mo11308e(C3607m mVar) {
            this.f10098c.setTag(C3598j.save_overlay_view, null);
            C3629x.m14780a(this.f10096a).mo11407b(this.f10097b);
            mVar.mo11366b((C3613f) this);
        }
    }

    /* renamed from: f.v.j0$b */
    private static class C3601b extends AnimatorListenerAdapter implements C3613f, C3561a {

        /* renamed from: a */
        private final View f10100a;

        /* renamed from: b */
        private final int f10101b;

        /* renamed from: c */
        private final ViewGroup f10102c;

        /* renamed from: d */
        private final boolean f10103d;

        /* renamed from: e */
        private boolean f10104e;

        /* renamed from: f */
        boolean f10105f = false;

        C3601b(View view, int i, boolean z) {
            this.f10100a = view;
            this.f10101b = i;
            this.f10102c = (ViewGroup) view.getParent();
            this.f10103d = z;
            m14653a(true);
        }

        /* renamed from: a */
        private void m14652a() {
            if (!this.f10105f) {
                C3577c0.m14568a(this.f10100a, this.f10101b);
                ViewGroup viewGroup = this.f10102c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m14653a(false);
        }

        /* renamed from: a */
        private void m14653a(boolean z) {
            if (this.f10103d && this.f10104e != z) {
                ViewGroup viewGroup = this.f10102c;
                if (viewGroup != null) {
                    this.f10104e = z;
                    C3629x.m14782b(viewGroup, z);
                }
            }
        }

        /* renamed from: a */
        public void mo11327a(C3607m mVar) {
        }

        /* renamed from: b */
        public void mo11305b(C3607m mVar) {
        }

        /* renamed from: c */
        public void mo11306c(C3607m mVar) {
            m14653a(false);
        }

        /* renamed from: d */
        public void mo11307d(C3607m mVar) {
            m14653a(true);
        }

        /* renamed from: e */
        public void mo11308e(C3607m mVar) {
            m14652a();
            mVar.mo11366b((C3613f) this);
        }

        public void onAnimationCancel(Animator animator) {
            this.f10105f = true;
        }

        public void onAnimationEnd(Animator animator) {
            m14652a();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f10105f) {
                C3577c0.m14568a(this.f10100a, this.f10101b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f10105f) {
                C3577c0.m14568a(this.f10100a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: f.v.j0$c */
    private static class C3602c {

        /* renamed from: a */
        boolean f10106a;

        /* renamed from: b */
        boolean f10107b;

        /* renamed from: c */
        int f10108c;

        /* renamed from: d */
        int f10109d;

        /* renamed from: e */
        ViewGroup f10110e;

        /* renamed from: f */
        ViewGroup f10111f;

        C3602c() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        if (r9 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (r0.f10110e == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r0.f10108c == 0) goto L_0x0097;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p071f.p139v.C3599j0.C3602c m14637b(p071f.p139v.C3624s r8, p071f.p139v.C3624s r9) {
        /*
            r7 = this;
            f.v.j0$c r0 = new f.v.j0$c
            r0.<init>()
            r1 = 0
            r0.f10106a = r1
            r0.f10107b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f10177a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f10177a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f10108c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f10177a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f10110e = r6
            goto L_0x0037
        L_0x0033:
            r0.f10108c = r4
            r0.f10110e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f10177a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f10177a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f10109d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f10177a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f10111f = r2
            goto L_0x005e
        L_0x005a:
            r0.f10109d = r4
            r0.f10111f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0086
            if (r9 == 0) goto L_0x0086
            int r8 = r0.f10108c
            int r9 = r0.f10109d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r8 = r0.f10110e
            android.view.ViewGroup r9 = r0.f10111f
            if (r8 != r9) goto L_0x0070
            return r0
        L_0x0070:
            int r8 = r0.f10108c
            int r9 = r0.f10109d
            if (r8 == r9) goto L_0x007c
            if (r8 != 0) goto L_0x0079
            goto L_0x0097
        L_0x0079:
            if (r9 != 0) goto L_0x009a
            goto L_0x008c
        L_0x007c:
            android.view.ViewGroup r8 = r0.f10111f
            if (r8 != 0) goto L_0x0081
            goto L_0x0097
        L_0x0081:
            android.view.ViewGroup r8 = r0.f10110e
            if (r8 != 0) goto L_0x009a
            goto L_0x008c
        L_0x0086:
            if (r8 != 0) goto L_0x0091
            int r8 = r0.f10109d
            if (r8 != 0) goto L_0x0091
        L_0x008c:
            r0.f10107b = r2
        L_0x008e:
            r0.f10106a = r2
            goto L_0x009a
        L_0x0091:
            if (r9 != 0) goto L_0x009a
            int r8 = r0.f10108c
            if (r8 != 0) goto L_0x009a
        L_0x0097:
            r0.f10107b = r1
            goto L_0x008e
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p139v.C3599j0.m14637b(f.v.s, f.v.s):f.v.j0$c");
    }

    /* renamed from: d */
    private void m14638d(C3624s sVar) {
        String str = "android:visibility:visibility";
        sVar.f10177a.put(str, Integer.valueOf(sVar.f10178b.getVisibility()));
        sVar.f10177a.put("android:visibility:parent", sVar.f10178b.getParent());
        int[] iArr = new int[2];
        sVar.f10178b.getLocationOnScreen(iArr);
        sVar.f10177a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: a */
    public abstract Animator mo11319a(ViewGroup viewGroup, View view, C3624s sVar, C3624s sVar2);

    /* renamed from: a */
    public Animator mo11336a(ViewGroup viewGroup, C3624s sVar, int i, C3624s sVar2, int i2) {
        if ((this.f10095O & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f10178b.getParent();
            if (m14637b(mo11355a(view, false), mo11367b(view, false)).f10106a) {
                return null;
            }
        }
        return mo11319a(viewGroup, sVar2.f10178b, sVar, sVar2);
    }

    /* renamed from: a */
    public Animator mo8999a(ViewGroup viewGroup, C3624s sVar, C3624s sVar2) {
        C3602c b = m14637b(sVar, sVar2);
        if (!b.f10106a || (b.f10110e == null && b.f10111f == null)) {
            return null;
        }
        if (b.f10107b) {
            return mo11336a(viewGroup, sVar, b.f10108c, sVar2, b.f10109d);
        }
        return mo11339b(viewGroup, sVar, b.f10108c, sVar2, b.f10109d);
    }

    /* renamed from: a */
    public void mo11337a(int i) {
        if ((i & -4) == 0) {
            this.f10095O = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: a */
    public void mo9000a(C3624s sVar) {
        m14638d(sVar);
    }

    /* renamed from: a */
    public boolean mo11338a(C3624s sVar, C3624s sVar2) {
        boolean z = false;
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (!(sVar == null || sVar2 == null)) {
            String str = "android:visibility:visibility";
            if (sVar2.f10177a.containsKey(str) != sVar.f10177a.containsKey(str)) {
                return false;
            }
        }
        C3602c b = m14637b(sVar, sVar2);
        if (b.f10106a && (b.f10108c == 0 || b.f10109d == 0)) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public abstract Animator mo11320b(ViewGroup viewGroup, View view, C3624s sVar, C3624s sVar2);

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r10.f10120A != false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo11339b(android.view.ViewGroup r11, p071f.p139v.C3624s r12, int r13, p071f.p139v.C3624s r14, int r15) {
        /*
            r10 = this;
            int r13 = r10.f10095O
            r0 = 2
            r13 = r13 & r0
            r1 = 0
            if (r13 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r12 != 0) goto L_0x000b
            return r1
        L_0x000b:
            android.view.View r13 = r12.f10178b
            if (r14 == 0) goto L_0x0012
            android.view.View r2 = r14.f10178b
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            int r3 = p071f.p139v.C3598j.save_overlay_view
            java.lang.Object r3 = r13.getTag(r3)
            android.view.View r3 = (android.view.View) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0023
            r2 = r1
            r6 = 1
            goto L_0x0089
        L_0x0023:
            if (r2 == 0) goto L_0x0036
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != 0) goto L_0x002c
            goto L_0x0036
        L_0x002c:
            r3 = 4
            if (r15 != r3) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            if (r13 != r2) goto L_0x003b
        L_0x0032:
            r3 = r2
            r6 = 0
            r2 = r1
            goto L_0x003e
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r3 = r1
            r6 = 0
            goto L_0x003e
        L_0x003b:
            r2 = r1
            r3 = r2
            r6 = 1
        L_0x003e:
            if (r6 == 0) goto L_0x0085
            android.view.ViewParent r6 = r13.getParent()
            if (r6 != 0) goto L_0x0047
            goto L_0x0081
        L_0x0047:
            android.view.ViewParent r6 = r13.getParent()
            boolean r6 = r6 instanceof android.view.View
            if (r6 == 0) goto L_0x0085
            android.view.ViewParent r6 = r13.getParent()
            android.view.View r6 = (android.view.View) r6
            f.v.s r7 = r10.mo11367b(r6, r5)
            f.v.s r8 = r10.mo11355a(r6, r5)
            f.v.j0$c r7 = r10.m14637b(r7, r8)
            boolean r7 = r7.f10106a
            if (r7 != 0) goto L_0x006a
            android.view.View r2 = p071f.p139v.C3623r.m14770a(r11, r13, r6)
            goto L_0x0085
        L_0x006a:
            int r7 = r6.getId()
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L_0x0085
            r6 = -1
            if (r7 == r6) goto L_0x0085
            android.view.View r6 = r11.findViewById(r7)
            if (r6 == 0) goto L_0x0085
            boolean r6 = r10.f10120A
            if (r6 == 0) goto L_0x0085
        L_0x0081:
            r2 = r3
            r6 = 0
            r3 = r13
            goto L_0x0089
        L_0x0085:
            r6 = 0
            r9 = r3
            r3 = r2
            r2 = r9
        L_0x0089:
            if (r3 == 0) goto L_0x00db
            if (r6 != 0) goto L_0x00bd
            java.util.Map<java.lang.String, java.lang.Object> r15 = r12.f10177a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r15 = r15.get(r1)
            int[] r15 = (int[]) r15
            r1 = r15[r4]
            r15 = r15[r5]
            int[] r0 = new int[r0]
            r11.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r3.getLeft()
            int r1 = r1 - r2
            r3.offsetLeftAndRight(r1)
            r0 = r0[r5]
            int r15 = r15 - r0
            int r0 = r3.getTop()
            int r15 = r15 - r0
            r3.offsetTopAndBottom(r15)
            f.v.w r15 = p071f.p139v.C3629x.m14780a(r11)
            r15.mo11406a(r3)
        L_0x00bd:
            android.animation.Animator r12 = r10.mo11320b(r11, r3, r12, r14)
            if (r6 != 0) goto L_0x00da
            if (r12 != 0) goto L_0x00cd
            f.v.w r11 = p071f.p139v.C3629x.m14780a(r11)
            r11.mo11407b(r3)
            goto L_0x00da
        L_0x00cd:
            int r14 = p071f.p139v.C3598j.save_overlay_view
            r13.setTag(r14, r3)
            f.v.j0$a r14 = new f.v.j0$a
            r14.<init>(r11, r3, r13)
            r10.mo11354a(r14)
        L_0x00da:
            return r12
        L_0x00db:
            if (r2 == 0) goto L_0x00fd
            int r13 = r2.getVisibility()
            p071f.p139v.C3577c0.m14568a(r2, r4)
            android.animation.Animator r11 = r10.mo11320b(r11, r2, r12, r14)
            if (r11 == 0) goto L_0x00f9
            f.v.j0$b r12 = new f.v.j0$b
            r12.<init>(r2, r15, r5)
            r11.addListener(r12)
            p071f.p139v.C3560a.m14534a(r11, r12)
            r10.mo11354a(r12)
            goto L_0x00fc
        L_0x00f9:
            p071f.p139v.C3577c0.m14568a(r2, r13)
        L_0x00fc:
            return r11
        L_0x00fd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p139v.C3599j0.mo11339b(android.view.ViewGroup, f.v.s, int, f.v.s, int):android.animation.Animator");
    }

    /* renamed from: c */
    public void mo9001c(C3624s sVar) {
        m14638d(sVar);
    }

    /* renamed from: s */
    public String[] mo11277s() {
        return f10094P;
    }
}
