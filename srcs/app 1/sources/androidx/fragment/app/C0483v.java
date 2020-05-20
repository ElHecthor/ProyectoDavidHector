package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p071f.p097h.p104i.C3277a;
import p071f.p097h.p108m.C3376s;
import p071f.p097h.p108m.C3379v;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.v */
public abstract class C0483v {

    /* renamed from: androidx.fragment.app.v$a */
    class C0484a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f2159f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f2160g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f2161h;

        /* renamed from: i */
        final /* synthetic */ ArrayList f2162i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f2163j;

        C0484a(C0483v vVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2159f = i;
            this.f2160g = arrayList;
            this.f2161h = arrayList2;
            this.f2162i = arrayList3;
            this.f2163j = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f2159f; i++) {
                C3379v.m13796a((View) this.f2160g.get(i), (String) this.f2161h.get(i));
                C3379v.m13796a((View) this.f2162i.get(i), (String) this.f2163j.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.v$b */
    class C0485b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2164f;

        /* renamed from: g */
        final /* synthetic */ Map f2165g;

        C0485b(C0483v vVar, ArrayList arrayList, Map map) {
            this.f2164f = arrayList;
            this.f2165g = map;
        }

        public void run() {
            int size = this.f2164f.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2164f.get(i);
                String v = C3379v.m13835v(view);
                if (v != null) {
                    C3379v.m13796a(view, C0483v.m2621a(this.f2165g, v));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.v$c */
    class C0486c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2166f;

        /* renamed from: g */
        final /* synthetic */ Map f2167g;

        C0486c(C0483v vVar, ArrayList arrayList, Map map) {
            this.f2166f = arrayList;
            this.f2167g = map;
        }

        public void run() {
            int size = this.f2166f.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2166f.get(i);
                C3379v.m13796a(view, (String) this.f2167g.get(C3379v.m13835v(view)));
            }
        }
    }

    /* renamed from: a */
    static String m2621a(Map<String, String> map, String str) {
        for (Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: a */
    protected static void m2622a(List<View> list, View view) {
        int size = list.size();
        if (!m2624a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m2624a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    protected static boolean m2623a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    private static boolean m2624a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract Object mo2925a(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ArrayList<String> mo2959a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(C3379v.m13835v(view));
            C3379v.m13796a(view, (String) null);
        }
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2960a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2961a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String v = C3379v.m13835v(view2);
            arrayList4.add(v);
            if (v != null) {
                C3379v.m13796a(view2, (String) null);
                String str = (String) map.get(v);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C3379v.m13796a((View) arrayList2.get(i2), v);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C0484a aVar = new C0484a(this, size, arrayList2, arrayList3, arrayList, arrayList4);
        C3376s.m13761a(view, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2962a(View view, ArrayList<View> arrayList, Map<String, String> map) {
        C3376s.m13761a(view, new C0485b(this, arrayList, map));
    }

    /* renamed from: a */
    public abstract void mo2926a(ViewGroup viewGroup, Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2963a(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        C3376s.m13761a(viewGroup, new C0486c(this, arrayList, map));
    }

    /* renamed from: a */
    public void mo2927a(Fragment fragment, Object obj, C3277a aVar, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: a */
    public abstract void mo2928a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo2929a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo2930a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo2931a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo2932a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo2933a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX WARNING: type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.view.ViewGroup] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.view.View, code=null, for r5v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v2, types: [android.view.ViewGroup]
      assigns: [android.view.ViewGroup, android.view.View]
      uses: [android.view.ViewGroup, java.lang.Object, android.view.View, ?[OBJECT, ARRAY]]
      mth insns count: 17
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2964a(java.util.ArrayList<android.view.View> r4, android.view.View r5) {
        /*
            r3 = this;
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x0027
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0024
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            boolean r0 = p071f.p097h.p108m.C3389x.m13881a(r5)
            if (r0 == 0) goto L_0x0013
            goto L_0x0024
        L_0x0013:
            int r0 = r5.getChildCount()
            r1 = 0
        L_0x0018:
            if (r1 >= r0) goto L_0x0027
            android.view.View r2 = r5.getChildAt(r1)
            r3.mo2964a(r4, r2)
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0024:
            r4.add(r5)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0483v.mo2964a(java.util.ArrayList, android.view.View):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2965a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String v = C3379v.m13835v(view);
            if (v != null) {
                map.put(v, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo2965a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo2934a(Object obj);

    /* renamed from: b */
    public abstract Object mo2935b(Object obj);

    /* renamed from: b */
    public abstract Object mo2936b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo2937b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo2938b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo2939b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo2940c(Object obj);

    /* renamed from: c */
    public abstract void mo2941c(Object obj, View view);
}
