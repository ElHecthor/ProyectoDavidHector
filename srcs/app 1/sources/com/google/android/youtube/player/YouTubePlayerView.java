package com.google.android.youtube.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import com.google.android.youtube.player.C2813d.C2814a;
import com.google.android.youtube.player.C2813d.C2815b;
import com.google.android.youtube.player.p055e.C2816a;
import com.google.android.youtube.player.p055e.C2817b;
import com.google.android.youtube.player.p055e.C2819d;
import com.google.android.youtube.player.p055e.C2832j;
import com.google.android.youtube.player.p055e.C2842n;
import com.google.android.youtube.player.p055e.C2843o.C2844a;
import com.google.android.youtube.player.p055e.C2843o.C2845b;
import com.google.android.youtube.player.p055e.C2850r.C2851a;
import com.google.android.youtube.player.p055e.C2853t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class YouTubePlayerView extends ViewGroup implements C2815b {

    /* renamed from: f */
    private final C2807c f8234f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Set<View> f8235g;

    /* renamed from: h */
    private final C2808d f8236h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C2819d f8237i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C2842n f8238j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public View f8239k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C2832j f8240l;

    /* renamed from: m */
    private C2815b f8241m;

    /* renamed from: n */
    private Bundle f8242n;

    /* renamed from: o */
    private C2814a f8243o;

    /* renamed from: p */
    private boolean f8244p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f8245q;

    /* renamed from: com.google.android.youtube.player.YouTubePlayerView$a */
    class C2805a implements C2844a {

        /* renamed from: a */
        final /* synthetic */ Activity f8246a;

        C2805a(Activity activity) {
            this.f8246a = activity;
        }

        /* renamed from: a */
        public final void mo9422a() {
            if (!YouTubePlayerView.this.f8245q && YouTubePlayerView.this.f8238j != null) {
                YouTubePlayerView.this.f8238j.mo9502f();
            }
            YouTubePlayerView.this.f8240l.mo9467a();
            YouTubePlayerView youTubePlayerView = YouTubePlayerView.this;
            if (youTubePlayerView.indexOfChild(youTubePlayerView.f8240l) < 0) {
                YouTubePlayerView youTubePlayerView2 = YouTubePlayerView.this;
                youTubePlayerView2.addView(youTubePlayerView2.f8240l);
                YouTubePlayerView youTubePlayerView3 = YouTubePlayerView.this;
                youTubePlayerView3.removeView(youTubePlayerView3.f8239k);
            }
            YouTubePlayerView.this.f8239k = null;
            YouTubePlayerView.this.f8238j = null;
            YouTubePlayerView.this.f8237i = null;
        }

        /* renamed from: e */
        public final void mo9423e() {
            if (YouTubePlayerView.this.f8237i != null) {
                YouTubePlayerView.m11688a(YouTubePlayerView.this, this.f8246a);
            }
            YouTubePlayerView.this.f8237i = null;
        }
    }

    /* renamed from: com.google.android.youtube.player.YouTubePlayerView$b */
    class C2806b implements C2845b {
        C2806b() {
        }

        /* renamed from: a */
        public final void mo9424a(C2812c cVar) {
            YouTubePlayerView.this.m11690a(cVar);
            YouTubePlayerView.this.f8237i = null;
        }
    }

    /* renamed from: com.google.android.youtube.player.YouTubePlayerView$c */
    private final class C2807c implements OnGlobalFocusChangeListener {
        private C2807c() {
        }

        /* synthetic */ C2807c(YouTubePlayerView youTubePlayerView, byte b) {
            this();
        }

        public final void onGlobalFocusChanged(View view, View view2) {
            if (YouTubePlayerView.this.f8238j != null && YouTubePlayerView.this.f8235g.contains(view2) && !YouTubePlayerView.this.f8235g.contains(view)) {
                YouTubePlayerView.this.f8238j.mo9503g();
            }
        }
    }

    /* renamed from: com.google.android.youtube.player.YouTubePlayerView$d */
    interface C2808d {
        /* renamed from: a */
        void mo9426a(YouTubePlayerView youTubePlayerView);

        /* renamed from: a */
        void mo9427a(YouTubePlayerView youTubePlayerView, String str, C2814a aVar);
    }

    public YouTubePlayerView(Context context) {
        this(context, null);
    }

    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public YouTubePlayerView(Context context, AttributeSet attributeSet, int i) {
        if (context instanceof C2810b) {
            this(context, attributeSet, i, ((C2810b) context).mo9428a());
            return;
        }
        throw new IllegalStateException("A YouTubePlayerView can only be created with an Activity  which extends YouTubeBaseActivity as its context.");
    }

    YouTubePlayerView(Context context, AttributeSet attributeSet, int i, C2808d dVar) {
        C2817b.m11731a(context, (Object) "context cannot be null");
        super(context, attributeSet, i);
        C2817b.m11731a(dVar, (Object) "listener cannot be null");
        this.f8236h = dVar;
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        setClipToPadding(false);
        C2832j jVar = new C2832j(context);
        this.f8240l = jVar;
        requestTransparentRegion(jVar);
        addView(this.f8240l);
        this.f8235g = new HashSet();
        this.f8234f = new C2807c(this, 0);
    }

    /* renamed from: a */
    private void m11687a(View view) {
        if (!(view == this.f8240l || (this.f8238j != null && view == this.f8239k))) {
            throw new UnsupportedOperationException("No views can be added on top of the player");
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m11688a(YouTubePlayerView youTubePlayerView, Activity activity) {
        try {
            C2842n nVar = new C2842n(youTubePlayerView.f8237i, C2816a.m11726a().mo9440a(activity, youTubePlayerView.f8237i, youTubePlayerView.f8244p));
            youTubePlayerView.f8238j = nVar;
            View a = nVar.mo9490a();
            youTubePlayerView.f8239k = a;
            youTubePlayerView.addView(a);
            youTubePlayerView.removeView(youTubePlayerView.f8240l);
            youTubePlayerView.f8236h.mo9426a(youTubePlayerView);
            if (youTubePlayerView.f8243o != null) {
                boolean z = false;
                Bundle bundle = youTubePlayerView.f8242n;
                if (bundle != null) {
                    z = youTubePlayerView.f8238j.mo9495a(bundle);
                    youTubePlayerView.f8242n = null;
                }
                youTubePlayerView.f8243o.mo9438a(youTubePlayerView.f8241m, youTubePlayerView.f8238j, z);
                youTubePlayerView.f8243o = null;
            }
        } catch (C2851a e) {
            C2853t.m11845a("Error creating YouTubePlayerView", e);
            youTubePlayerView.m11690a(C2812c.INTERNAL_ERROR);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11690a(C2812c cVar) {
        this.f8238j = null;
        this.f8240l.mo9469c();
        C2814a aVar = this.f8243o;
        if (aVar != null) {
            aVar.mo9437a(this.f8241m, cVar);
            this.f8243o = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9394a() {
        C2842n nVar = this.f8238j;
        if (nVar != null) {
            nVar.mo9496b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9395a(Activity activity, C2815b bVar, String str, C2814a aVar, Bundle bundle) {
        if (this.f8238j == null && this.f8243o == null) {
            C2817b.m11731a(activity, (Object) "activity cannot be null");
            C2817b.m11731a(bVar, (Object) "provider cannot be null");
            this.f8241m = bVar;
            C2817b.m11731a(aVar, (Object) "listener cannot be null");
            this.f8243o = aVar;
            this.f8242n = bundle;
            this.f8240l.mo9468b();
            C2819d a = C2816a.m11726a().mo9439a(getContext(), str, new C2805a(activity), new C2806b());
            this.f8237i = a;
            a.mo9476a();
        }
    }

    /* renamed from: a */
    public final void mo9396a(String str, C2814a aVar) {
        C2817b.m11732a(str, (Object) "Developer key cannot be null or empty");
        this.f8236h.mo9427a(this, str, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9397a(boolean z) {
        C2842n nVar = this.f8238j;
        if (nVar != null) {
            nVar.mo9497b(z);
            mo9406b(z);
        }
    }

    public final void addFocusables(ArrayList<View> arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i);
        arrayList.addAll(arrayList2);
        this.f8235g.clear();
        this.f8235g.addAll(arrayList2);
    }

    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        ArrayList arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i, i2);
        arrayList.addAll(arrayList2);
        this.f8235g.clear();
        this.f8235g.addAll(arrayList2);
    }

    public final void addView(View view) {
        m11687a(view);
        super.addView(view);
    }

    public final void addView(View view, int i) {
        m11687a(view);
        super.addView(view, i);
    }

    public final void addView(View view, int i, int i2) {
        m11687a(view);
        super.addView(view, i, i2);
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        m11687a(view);
        super.addView(view, i, layoutParams);
    }

    public final void addView(View view, LayoutParams layoutParams) {
        m11687a(view);
        super.addView(view, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo9405b() {
        C2842n nVar = this.f8238j;
        if (nVar != null) {
            nVar.mo9499c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo9406b(boolean z) {
        this.f8245q = true;
        C2842n nVar = this.f8238j;
        if (nVar != null) {
            nVar.mo9493a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo9407c() {
        C2842n nVar = this.f8238j;
        if (nVar != null) {
            nVar.mo9500d();
        }
    }

    public final void clearChildFocus(View view) {
        if (hasFocusable()) {
            requestFocus();
        } else {
            super.clearChildFocus(view);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo9409d() {
        C2842n nVar = this.f8238j;
        if (nVar != null) {
            nVar.mo9501e();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f8238j != null) {
            if (keyEvent.getAction() == 0) {
                return this.f8238j.mo9494a(keyEvent.getKeyCode(), keyEvent) || super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 1) {
                return this.f8238j.mo9498b(keyEvent.getKeyCode(), keyEvent) || super.dispatchKeyEvent(keyEvent);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Bundle mo9411e() {
        C2842n nVar = this.f8238j;
        return nVar == null ? this.f8242n : nVar.mo9504h();
    }

    public final void focusableViewAvailable(View view) {
        super.focusableViewAvailable(view);
        this.f8235g.add(view);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.f8234f);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2842n nVar = this.f8238j;
        if (nVar != null) {
            nVar.mo9491a(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f8234f);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() > 0) {
            getChildAt(0).layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.measure(i, i2);
            setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f8235g.add(view2);
    }

    public final void setClipToPadding(boolean z) {
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
    }
}
