package com.facebook.p034f0.p035q;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.view.Window;
import android.widget.EditText;
import com.facebook.p034f0.C1558m;
import com.facebook.p034f0.p036r.p037g.C1601f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.f0.q.d */
final class C1569d implements OnGlobalFocusChangeListener {

    /* renamed from: j */
    private static final Map<Integer, C1569d> f4867j = new HashMap();

    /* renamed from: f */
    private final Set<String> f4868f = new HashSet();

    /* renamed from: g */
    private final Handler f4869g;

    /* renamed from: h */
    private WeakReference<Activity> f4870h;

    /* renamed from: i */
    private AtomicBoolean f4871i;

    /* renamed from: com.facebook.f0.q.d$a */
    class C1570a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f4872f;

        C1570a(View view) {
            this.f4872f = view;
        }

        public void run() {
            View view = this.f4872f;
            if (view instanceof EditText) {
                C1569d.this.m6971b(view);
            }
        }
    }

    static {
        Class<C1569d> cls = C1569d.class;
    }

    private C1569d(Activity activity) {
        this.f4870h = new WeakReference<>(activity);
        this.f4869g = new Handler(Looper.getMainLooper());
        this.f4871i = new AtomicBoolean(false);
    }

    /* renamed from: a */
    private View m6965a() {
        Activity activity = (Activity) this.f4870h.get();
        if (activity == null) {
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            return null;
        }
        return window.getDecorView().getRootView();
    }

    /* renamed from: a */
    static void m6966a(Activity activity) {
        C1569d dVar;
        int hashCode = activity.hashCode();
        if (!f4867j.containsKey(Integer.valueOf(hashCode))) {
            dVar = new C1569d(activity);
            f4867j.put(Integer.valueOf(activity.hashCode()), dVar);
        } else {
            dVar = (C1569d) f4867j.get(Integer.valueOf(hashCode));
        }
        dVar.m6970b();
    }

    /* renamed from: a */
    private void m6967a(View view) {
        m6969a((Runnable) new C1570a(view));
    }

    /* renamed from: a */
    private void m6969a(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f4869g.post(runnable);
        }
    }

    /* renamed from: b */
    private void m6970b() {
        if (!this.f4871i.getAndSet(true)) {
            View a = m6965a();
            if (a != null) {
                ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalFocusChangeListener(this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m6971b(View view) {
        String trim = ((EditText) view).getText().toString().trim();
        if (!trim.isEmpty() && !this.f4868f.contains(trim) && trim.length() <= 100) {
            this.f4868f.add(trim);
            HashMap hashMap = new HashMap();
            List list = null;
            ArrayList arrayList = null;
            for (C1568c cVar : C1568c.m6961d()) {
                if (C1567b.m6955a(trim, cVar.mo5790c())) {
                    if (list == null) {
                        list = C1567b.m6954a(view);
                    }
                    if (!C1567b.m6957a(list, cVar.mo5788a())) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            ViewGroup i = C1601f.m7061i(view);
                            if (i != null) {
                                for (View view2 : C1601f.m7054b(i)) {
                                    if (view != view2) {
                                        arrayList.addAll(C1567b.m6958b(view2));
                                    }
                                }
                            }
                        }
                        if (!C1567b.m6957a((List<String>) arrayList, cVar.mo5788a())) {
                        }
                    }
                    hashMap.put(cVar.mo5789b(), trim);
                }
            }
            C1558m.m6914a((Map<String, String>) hashMap);
        }
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (view != null) {
            m6967a(view);
        }
        if (view2 != null) {
            m6967a(view2);
        }
    }
}
