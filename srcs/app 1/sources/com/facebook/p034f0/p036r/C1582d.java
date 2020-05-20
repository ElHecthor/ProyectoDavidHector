package com.facebook.p034f0.p036r;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.C1787m;
import com.facebook.p034f0.C1547g;
import com.facebook.p034f0.p036r.p037g.C1593a;
import com.facebook.p034f0.p036r.p037g.C1601f;
import com.facebook.p034f0.p038s.C1609b;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.f0.r.d */
public class C1582d {

    /* renamed from: com.facebook.f0.r.d$a */
    public static class C1583a implements OnTouchListener {

        /* renamed from: f */
        private C1593a f4911f;

        /* renamed from: g */
        private WeakReference<View> f4912g;

        /* renamed from: h */
        private WeakReference<View> f4913h;

        /* renamed from: i */
        private OnTouchListener f4914i;

        /* renamed from: j */
        private boolean f4915j = false;

        /* renamed from: com.facebook.f0.r.d$a$a */
        class C1584a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ String f4916f;

            /* renamed from: g */
            final /* synthetic */ Bundle f4917g;

            C1584a(C1583a aVar, String str, Bundle bundle) {
                this.f4916f = str;
                this.f4917g = bundle;
            }

            public void run() {
                C1547g.m6885b(C1787m.m7744e()).mo5757a(this.f4916f, this.f4917g);
            }
        }

        public C1583a(C1593a aVar, View view, View view2) {
            if (aVar != null && view != null && view2 != null) {
                this.f4914i = C1601f.m7059g(view2);
                this.f4911f = aVar;
                this.f4912g = new WeakReference<>(view2);
                this.f4913h = new WeakReference<>(view);
                this.f4915j = true;
            }
        }

        /* renamed from: b */
        private void m7015b() {
            C1593a aVar = this.f4911f;
            if (aVar != null) {
                String b = aVar.mo5823b();
                Bundle a = C1578c.m6994a(this.f4911f, (View) this.f4913h.get(), (View) this.f4912g.get());
                String str = "_valueToSum";
                if (a.containsKey(str)) {
                    a.putDouble(str, C1609b.m7090a(a.getString(str)));
                }
                a.putString("_is_fb_codeless", "1");
                C1787m.m7751l().execute(new C1584a(this, b, a));
            }
        }

        /* renamed from: a */
        public boolean mo5810a() {
            return this.f4915j;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                m7015b();
            }
            OnTouchListener onTouchListener = this.f4914i;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    /* renamed from: a */
    public static C1583a m7014a(C1593a aVar, View view, View view2) {
        return new C1583a(aVar, view, view2);
    }
}
