package com.facebook.p034f0.p036r;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.facebook.C1787m;
import com.facebook.p034f0.C1547g;
import com.facebook.p034f0.p036r.p037g.C1593a;
import com.facebook.p034f0.p036r.p037g.C1601f;
import com.facebook.p034f0.p038s.C1609b;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.f0.r.a */
public class C1571a {

    /* renamed from: com.facebook.f0.r.a$a */
    static class C1572a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f4874f;

        /* renamed from: g */
        final /* synthetic */ Bundle f4875g;

        C1572a(String str, Bundle bundle) {
            this.f4874f = str;
            this.f4875g = bundle;
        }

        public void run() {
            C1547g.m6885b(C1787m.m7744e()).mo5757a(this.f4874f, this.f4875g);
        }
    }

    /* renamed from: com.facebook.f0.r.a$b */
    public static class C1573b implements OnClickListener {

        /* renamed from: f */
        private C1593a f4876f;

        /* renamed from: g */
        private WeakReference<View> f4877g;

        /* renamed from: h */
        private WeakReference<View> f4878h;

        /* renamed from: i */
        private OnClickListener f4879i;

        /* renamed from: j */
        private boolean f4880j;

        private C1573b(C1593a aVar, View view, View view2) {
            this.f4880j = false;
            if (aVar != null && view != null && view2 != null) {
                this.f4879i = C1601f.m7058f(view2);
                this.f4876f = aVar;
                this.f4877g = new WeakReference<>(view2);
                this.f4878h = new WeakReference<>(view);
                this.f4880j = true;
            }
        }

        /* synthetic */ C1573b(C1593a aVar, View view, View view2, C1572a aVar2) {
            this(aVar, view, view2);
        }

        /* renamed from: a */
        public boolean mo5794a() {
            return this.f4880j;
        }

        public void onClick(View view) {
            OnClickListener onClickListener = this.f4879i;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            if (this.f4878h.get() != null && this.f4877g.get() != null) {
                C1571a.m6975c(this.f4876f, (View) this.f4878h.get(), (View) this.f4877g.get());
            }
        }
    }

    /* renamed from: com.facebook.f0.r.a$c */
    public static class C1574c implements OnItemClickListener {

        /* renamed from: f */
        private C1593a f4881f;

        /* renamed from: g */
        private WeakReference<AdapterView> f4882g;

        /* renamed from: h */
        private WeakReference<View> f4883h;

        /* renamed from: i */
        private OnItemClickListener f4884i;

        /* renamed from: j */
        private boolean f4885j;

        private C1574c(C1593a aVar, View view, AdapterView adapterView) {
            this.f4885j = false;
            if (aVar != null && view != null && adapterView != null) {
                this.f4884i = adapterView.getOnItemClickListener();
                this.f4881f = aVar;
                this.f4882g = new WeakReference<>(adapterView);
                this.f4883h = new WeakReference<>(view);
                this.f4885j = true;
            }
        }

        /* synthetic */ C1574c(C1593a aVar, View view, AdapterView adapterView, C1572a aVar2) {
            this(aVar, view, adapterView);
        }

        /* renamed from: a */
        public boolean mo5796a() {
            return this.f4885j;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            OnItemClickListener onItemClickListener = this.f4884i;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            if (this.f4883h.get() != null && this.f4882g.get() != null) {
                C1571a.m6975c(this.f4881f, (View) this.f4883h.get(), (View) this.f4882g.get());
            }
        }
    }

    /* renamed from: a */
    public static C1574c m6972a(C1593a aVar, View view, AdapterView adapterView) {
        return new C1574c(aVar, view, adapterView, null);
    }

    /* renamed from: b */
    public static C1573b m6974b(C1593a aVar, View view, View view2) {
        return new C1573b(aVar, view, view2, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m6975c(C1593a aVar, View view, View view2) {
        String b = aVar.mo5823b();
        Bundle a = C1578c.m6994a(aVar, view, view2);
        String str = "_valueToSum";
        if (a.containsKey(str)) {
            a.putDouble(str, C1609b.m7090a(a.getString(str)));
        }
        a.putString("_is_fb_codeless", "1");
        C1787m.m7751l().execute(new C1572a(b, a));
    }
}
