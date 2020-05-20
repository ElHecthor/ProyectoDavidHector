package com.facebook.p034f0.p036r;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.facebook.C1631i;
import com.facebook.C1787m;
import com.facebook.internal.C1670l;
import com.facebook.internal.C1672m;
import com.facebook.internal.C1679n;
import com.facebook.internal.C1698v;
import com.facebook.p034f0.p036r.C1571a.C1573b;
import com.facebook.p034f0.p036r.C1571a.C1574c;
import com.facebook.p034f0.p036r.C1582d.C1583a;
import com.facebook.p034f0.p036r.p037g.C1593a;
import com.facebook.p034f0.p036r.p037g.C1596b;
import com.facebook.p034f0.p036r.p037g.C1597c;
import com.facebook.p034f0.p036r.p037g.C1601f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.facebook.f0.r.c */
class C1578c {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f4896f = "com.facebook.f0.r.c";

    /* renamed from: g */
    private static C1578c f4897g;

    /* renamed from: a */
    private final Handler f4898a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private Set<Activity> f4899b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    private Set<C1581c> f4900c = new HashSet();

    /* renamed from: d */
    private HashSet<String> f4901d = new HashSet<>();

    /* renamed from: e */
    private HashMap<Integer, HashSet<String>> f4902e = new HashMap<>();

    /* renamed from: com.facebook.f0.r.c$a */
    class C1579a implements Runnable {
        C1579a() {
        }

        public void run() {
            C1578c.this.m6998c();
        }
    }

    /* renamed from: com.facebook.f0.r.c$b */
    public static class C1580b {

        /* renamed from: a */
        private WeakReference<View> f4904a;

        /* renamed from: b */
        private String f4905b;

        public C1580b(View view, String str) {
            this.f4904a = new WeakReference<>(view);
            this.f4905b = str;
        }

        /* renamed from: a */
        public View mo5804a() {
            WeakReference<View> weakReference = this.f4904a;
            if (weakReference == null) {
                return null;
            }
            return (View) weakReference.get();
        }

        /* renamed from: b */
        public String mo5805b() {
            return this.f4905b;
        }
    }

    /* renamed from: com.facebook.f0.r.c$c */
    protected static class C1581c implements OnGlobalLayoutListener, OnScrollChangedListener, Runnable {

        /* renamed from: f */
        private WeakReference<View> f4906f;

        /* renamed from: g */
        private List<C1593a> f4907g;

        /* renamed from: h */
        private final Handler f4908h;

        /* renamed from: i */
        private HashSet<String> f4909i;

        /* renamed from: j */
        private final String f4910j;

        public C1581c(View view, Handler handler, HashSet<String> hashSet, String str) {
            this.f4906f = new WeakReference<>(view);
            this.f4908h = handler;
            this.f4909i = hashSet;
            this.f4910j = str;
            handler.postDelayed(this, 200);
        }

        /* renamed from: a */
        private static List<View> m7005a(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List<com.facebook.p034f0.p036r.C1578c.C1580b> m7006a(com.facebook.p034f0.p036r.p037g.C1593a r8, android.view.View r9, java.util.List<com.facebook.p034f0.p036r.p037g.C1597c> r10, int r11, int r12, java.lang.String r13) {
            /*
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r13)
                java.lang.String r13 = "."
                r0.append(r13)
                java.lang.String r1 = java.lang.String.valueOf(r12)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                if (r9 != 0) goto L_0x0020
                return r1
            L_0x0020:
                int r2 = r10.size()
                r3 = 0
                if (r11 < r2) goto L_0x0030
                com.facebook.f0.r.c$b r12 = new com.facebook.f0.r.c$b
                r12.<init>(r9, r0)
            L_0x002c:
                r1.add(r12)
                goto L_0x0093
            L_0x0030:
                java.lang.Object r2 = r10.get(r11)
                com.facebook.f0.r.g.c r2 = (com.facebook.p034f0.p036r.p037g.C1597c) r2
                java.lang.String r4 = r2.f4945a
                java.lang.String r5 = ".."
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L_0x006d
                android.view.ViewParent r9 = r9.getParent()
                boolean r12 = r9 instanceof android.view.ViewGroup
                if (r12 == 0) goto L_0x006c
                android.view.ViewGroup r9 = (android.view.ViewGroup) r9
                java.util.List r9 = m7005a(r9)
                int r12 = r9.size()
                r13 = 0
            L_0x0053:
                if (r13 >= r12) goto L_0x006c
                java.lang.Object r2 = r9.get(r13)
                r3 = r2
                android.view.View r3 = (android.view.View) r3
                int r5 = r11 + 1
                r2 = r8
                r4 = r10
                r6 = r13
                r7 = r0
                java.util.List r2 = m7006a(r2, r3, r4, r5, r6, r7)
                r1.addAll(r2)
                int r13 = r13 + 1
                goto L_0x0053
            L_0x006c:
                return r1
            L_0x006d:
                java.lang.String r4 = r2.f4945a
                boolean r13 = r4.equals(r13)
                if (r13 == 0) goto L_0x007e
                com.facebook.f0.r.c$b r8 = new com.facebook.f0.r.c$b
                r8.<init>(r9, r0)
                r1.add(r8)
                return r1
            L_0x007e:
                boolean r12 = m7009a(r9, r2, r12)
                if (r12 != 0) goto L_0x0085
                return r1
            L_0x0085:
                int r12 = r10.size()
                int r12 = r12 + -1
                if (r11 != r12) goto L_0x0093
                com.facebook.f0.r.c$b r12 = new com.facebook.f0.r.c$b
                r12.<init>(r9, r0)
                goto L_0x002c
            L_0x0093:
                boolean r12 = r9 instanceof android.view.ViewGroup
                if (r12 == 0) goto L_0x00bb
                android.view.ViewGroup r9 = (android.view.ViewGroup) r9
                java.util.List r9 = m7005a(r9)
                int r12 = r9.size()
                r13 = 0
            L_0x00a2:
                if (r13 >= r12) goto L_0x00bb
                java.lang.Object r2 = r9.get(r13)
                r3 = r2
                android.view.View r3 = (android.view.View) r3
                int r5 = r11 + 1
                r2 = r8
                r4 = r10
                r6 = r13
                r7 = r0
                java.util.List r2 = m7006a(r2, r3, r4, r5, r6, r7)
                r1.addAll(r2)
                int r13 = r13 + 1
                goto L_0x00a2
            L_0x00bb:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p034f0.p036r.C1578c.C1581c.m7006a(com.facebook.f0.r.g.a, android.view.View, java.util.List, int, int, java.lang.String):java.util.List");
        }

        /* renamed from: a */
        private void m7007a() {
            if (this.f4907g != null && this.f4906f.get() != null) {
                for (int i = 0; i < this.f4907g.size(); i++) {
                    mo5806a((C1593a) this.f4907g.get(i), (View) this.f4906f.get());
                }
            }
        }

        /* renamed from: a */
        private void m7008a(C1580b bVar, View view, C1593a aVar) {
            if (aVar != null) {
                try {
                    View a = bVar.mo5804a();
                    if (a != null) {
                        View a2 = C1601f.m7049a(a);
                        if (a2 != null && C1601f.m7053a(a, a2)) {
                            m7012d(bVar, view, aVar);
                        } else if (!a.getClass().getName().startsWith("com.facebook.react")) {
                            if (!(a instanceof AdapterView)) {
                                m7010b(bVar, view, aVar);
                            } else if (a instanceof ListView) {
                                m7011c(bVar, view, aVar);
                            }
                        }
                    }
                } catch (Exception e) {
                    C1698v.m7380a(C1578c.f4896f, e);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
            if (r5.getClass().getSimpleName().equals(r7[r7.length - 1]) == false) goto L_0x0041;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m7009a(android.view.View r5, com.facebook.p034f0.p036r.p037g.C1597c r6, int r7) {
            /*
                int r0 = r6.f4946b
                r1 = 0
                r2 = -1
                if (r0 == r2) goto L_0x0009
                if (r7 == r0) goto L_0x0009
                return r1
            L_0x0009:
                java.lang.Class r7 = r5.getClass()
                java.lang.String r7 = r7.getCanonicalName()
                java.lang.String r0 = r6.f4945a
                boolean r7 = r7.equals(r0)
                r0 = 1
                if (r7 != 0) goto L_0x0042
                java.lang.String r7 = r6.f4945a
                java.lang.String r2 = ".*android\\..*"
                boolean r7 = r7.matches(r2)
                if (r7 == 0) goto L_0x0041
                java.lang.String r7 = r6.f4945a
                java.lang.String r2 = "\\."
                java.lang.String[] r7 = r7.split(r2)
                int r2 = r7.length
                if (r2 <= 0) goto L_0x0041
                int r2 = r7.length
                int r2 = r2 - r0
                r7 = r7[r2]
                java.lang.Class r2 = r5.getClass()
                java.lang.String r2 = r2.getSimpleName()
                boolean r7 = r2.equals(r7)
                if (r7 != 0) goto L_0x0042
            L_0x0041:
                return r1
            L_0x0042:
                int r7 = r6.f4952h
                com.facebook.f0.r.g.c$a r2 = com.facebook.p034f0.p036r.p037g.C1597c.C1598a.ID
                int r2 = r2.mo5826f()
                r7 = r7 & r2
                if (r7 <= 0) goto L_0x0056
                int r7 = r6.f4947c
                int r2 = r5.getId()
                if (r7 == r2) goto L_0x0056
                return r1
            L_0x0056:
                int r7 = r6.f4952h
                com.facebook.f0.r.g.c$a r2 = com.facebook.p034f0.p036r.p037g.C1597c.C1598a.TEXT
                int r2 = r2.mo5826f()
                r7 = r7 & r2
                java.lang.String r2 = ""
                if (r7 <= 0) goto L_0x007e
                java.lang.String r7 = r6.f4948d
                java.lang.String r3 = com.facebook.p034f0.p036r.p037g.C1601f.m7062j(r5)
                java.lang.String r4 = com.facebook.internal.C1698v.m7409f(r3)
                java.lang.String r4 = com.facebook.internal.C1698v.m7361a(r4, r2)
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L_0x007e
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x007e
                return r1
            L_0x007e:
                int r7 = r6.f4952h
                com.facebook.f0.r.g.c$a r3 = com.facebook.p034f0.p036r.p037g.C1597c.C1598a.DESCRIPTION
                int r3 = r3.mo5826f()
                r7 = r7 & r3
                if (r7 <= 0) goto L_0x00b0
                java.lang.String r7 = r6.f4950f
                java.lang.CharSequence r3 = r5.getContentDescription()
                if (r3 != 0) goto L_0x0093
                r3 = r2
                goto L_0x009b
            L_0x0093:
                java.lang.CharSequence r3 = r5.getContentDescription()
                java.lang.String r3 = java.lang.String.valueOf(r3)
            L_0x009b:
                java.lang.String r4 = com.facebook.internal.C1698v.m7409f(r3)
                java.lang.String r4 = com.facebook.internal.C1698v.m7361a(r4, r2)
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L_0x00b0
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x00b0
                return r1
            L_0x00b0:
                int r7 = r6.f4952h
                com.facebook.f0.r.g.c$a r3 = com.facebook.p034f0.p036r.p037g.C1597c.C1598a.HINT
                int r3 = r3.mo5826f()
                r7 = r7 & r3
                if (r7 <= 0) goto L_0x00d6
                java.lang.String r7 = r6.f4951g
                java.lang.String r3 = com.facebook.p034f0.p036r.p037g.C1601f.m7060h(r5)
                java.lang.String r4 = com.facebook.internal.C1698v.m7409f(r3)
                java.lang.String r4 = com.facebook.internal.C1698v.m7361a(r4, r2)
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L_0x00d6
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x00d6
                return r1
            L_0x00d6:
                int r7 = r6.f4952h
                com.facebook.f0.r.g.c$a r3 = com.facebook.p034f0.p036r.p037g.C1597c.C1598a.TAG
                int r3 = r3.mo5826f()
                r7 = r7 & r3
                if (r7 <= 0) goto L_0x0108
                java.lang.String r6 = r6.f4949e
                java.lang.Object r7 = r5.getTag()
                if (r7 != 0) goto L_0x00eb
                r5 = r2
                goto L_0x00f3
            L_0x00eb:
                java.lang.Object r5 = r5.getTag()
                java.lang.String r5 = java.lang.String.valueOf(r5)
            L_0x00f3:
                java.lang.String r7 = com.facebook.internal.C1698v.m7409f(r5)
                java.lang.String r7 = com.facebook.internal.C1698v.m7361a(r7, r2)
                boolean r5 = r6.equals(r5)
                if (r5 != 0) goto L_0x0108
                boolean r5 = r6.equals(r7)
                if (r5 != 0) goto L_0x0108
                return r1
            L_0x0108:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p034f0.p036r.C1578c.C1581c.m7009a(android.view.View, com.facebook.f0.r.g.c, int):boolean");
        }

        /* renamed from: b */
        private void m7010b(C1580b bVar, View view, C1593a aVar) {
            View a = bVar.mo5804a();
            if (a != null) {
                String b = bVar.mo5805b();
                OnClickListener f = C1601f.m7058f(a);
                boolean z = (f instanceof C1573b) && ((C1573b) f).mo5794a();
                if (!this.f4909i.contains(b) && !z) {
                    a.setOnClickListener(C1571a.m6974b(aVar, view, a));
                    this.f4909i.add(b);
                }
            }
        }

        /* renamed from: c */
        private void m7011c(C1580b bVar, View view, C1593a aVar) {
            AdapterView adapterView = (AdapterView) bVar.mo5804a();
            if (adapterView != null) {
                String b = bVar.mo5805b();
                OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                boolean z = (onItemClickListener instanceof C1574c) && ((C1574c) onItemClickListener).mo5796a();
                if (!this.f4909i.contains(b) && !z) {
                    adapterView.setOnItemClickListener(C1571a.m6972a(aVar, view, adapterView));
                    this.f4909i.add(b);
                }
            }
        }

        /* renamed from: d */
        private void m7012d(C1580b bVar, View view, C1593a aVar) {
            View a = bVar.mo5804a();
            if (a != null) {
                String b = bVar.mo5805b();
                OnTouchListener g = C1601f.m7059g(a);
                boolean z = (g instanceof C1583a) && ((C1583a) g).mo5810a();
                if (!this.f4909i.contains(b) && !z) {
                    a.setOnTouchListener(C1582d.m7014a(aVar, view, a));
                    this.f4909i.add(b);
                }
            }
        }

        /* renamed from: a */
        public void mo5806a(C1593a aVar, View view) {
            if (aVar != null && view != null && (TextUtils.isEmpty(aVar.mo5822a()) || aVar.mo5822a().equals(this.f4910j))) {
                List d = aVar.mo5825d();
                if (d.size() <= 25) {
                    for (C1580b a : m7006a(aVar, view, d, 0, -1, this.f4910j)) {
                        m7008a(a, view, aVar);
                    }
                }
            }
        }

        public void onGlobalLayout() {
            m7007a();
        }

        public void onScrollChanged() {
            m7007a();
        }

        public void run() {
            C1670l c = C1672m.m7268c(C1787m.m7745f());
            if (c != null && c.mo5906b()) {
                List<C1593a> a = C1593a.m7033a(c.mo5908d());
                this.f4907g = a;
                if (a != null) {
                    View view = (View) this.f4906f.get();
                    if (view != null) {
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        m7007a();
                    }
                }
            }
        }
    }

    private C1578c() {
    }

    /* renamed from: a */
    public static Bundle m6994a(C1593a aVar, View view, View view2) {
        String str;
        View view3;
        C1593a aVar2;
        Bundle bundle = new Bundle();
        if (aVar == null) {
            return bundle;
        }
        List<C1596b> c = aVar.mo5824c();
        if (c != null) {
            for (C1596b bVar : c) {
                String str2 = bVar.f4942b;
                if (str2 != null && str2.length() > 0) {
                    bundle.putString(bVar.f4941a, bVar.f4942b);
                } else if (bVar.f4943c.size() > 0) {
                    boolean equals = bVar.f4944d.equals("relative");
                    List<C1597c> list = bVar.f4943c;
                    if (equals) {
                        str = view2.getClass().getSimpleName();
                        aVar2 = aVar;
                        view3 = view2;
                    } else {
                        str = view.getClass().getSimpleName();
                        aVar2 = aVar;
                        view3 = view;
                    }
                    Iterator it = C1581c.m7006a(aVar2, view3, list, 0, -1, str).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C1580b bVar2 = (C1580b) it.next();
                        if (bVar2.mo5804a() != null) {
                            String j = C1601f.m7062j(bVar2.mo5804a());
                            if (j.length() > 0) {
                                bundle.putString(bVar.f4941a, j);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static synchronized C1578c m6997b() {
        C1578c cVar;
        synchronized (C1578c.class) {
            if (f4897g == null) {
                f4897g = new C1578c();
            }
            cVar = f4897g;
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m6998c() {
        for (Activity activity : this.f4899b) {
            if (activity != null) {
                this.f4900c.add(new C1581c(activity.getWindow().getDecorView().getRootView(), this.f4898a, this.f4901d, activity.getClass().getSimpleName()));
            }
        }
    }

    /* renamed from: d */
    private void m6999d() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m6998c();
        } else {
            this.f4898a.post(new C1579a());
        }
    }

    /* renamed from: a */
    public void mo5800a(Activity activity) {
        if (!C1679n.m7277b()) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f4899b.add(activity);
                this.f4901d.clear();
                if (this.f4902e.containsKey(Integer.valueOf(activity.hashCode()))) {
                    this.f4901d = (HashSet) this.f4902e.get(Integer.valueOf(activity.hashCode()));
                }
                m6999d();
                return;
            }
            throw new C1631i("Can't add activity to CodelessMatcher on non-UI thread");
        }
    }

    /* renamed from: b */
    public void mo5801b(Activity activity) {
        this.f4902e.remove(Integer.valueOf(activity.hashCode()));
    }

    /* renamed from: c */
    public void mo5802c(Activity activity) {
        if (!C1679n.m7277b()) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f4899b.remove(activity);
                this.f4900c.clear();
                this.f4902e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f4901d.clone());
                this.f4901d.clear();
                return;
            }
            throw new C1631i("Can't remove activity from CodelessMatcher on non-UI thread");
        }
    }
}
