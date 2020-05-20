package p071f.p097h.p108m.p109f0;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p071f.p097h.C3234c;
import p071f.p097h.p108m.p109f0.C3355f.C3356a;
import p071f.p097h.p108m.p109f0.C3355f.C3357b;
import p071f.p097h.p108m.p109f0.C3355f.C3358c;
import p071f.p097h.p108m.p109f0.C3355f.C3359d;
import p071f.p097h.p108m.p109f0.C3355f.C3360e;
import p071f.p097h.p108m.p109f0.C3355f.C3361f;
import p071f.p097h.p108m.p109f0.C3355f.C3362g;
import p071f.p097h.p108m.p109f0.C3355f.C3363h;

/* renamed from: f.h.m.f0.c */
public class C3347c {

    /* renamed from: d */
    private static int f9552d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f9553a;

    /* renamed from: b */
    public int f9554b = -1;

    /* renamed from: c */
    private int f9555c = -1;

    /* renamed from: f.h.m.f0.c$a */
    public static class C3348a {

        /* renamed from: e */
        public static final C3348a f9556e = new C3348a(16, null);

        /* renamed from: f */
        public static final C3348a f9557f = new C3348a(4096, null);

        /* renamed from: g */
        public static final C3348a f9558g = new C3348a(8192, null);

        /* renamed from: h */
        public static final C3348a f9559h = new C3348a(262144, null);

        /* renamed from: i */
        public static final C3348a f9560i = new C3348a(524288, null);

        /* renamed from: j */
        public static final C3348a f9561j = new C3348a(1048576, null);

        /* renamed from: k */
        public static final C3348a f9562k;

        /* renamed from: l */
        public static final C3348a f9563l;

        /* renamed from: a */
        final Object f9564a;

        /* renamed from: b */
        private final int f9565b;

        /* renamed from: c */
        private final Class<? extends C3356a> f9566c;

        /* renamed from: d */
        protected final C3355f f9567d;

        static {
            Class<C3358c> cls = C3358c.class;
            Class<C3357b> cls2 = C3357b.class;
            AccessibilityAction accessibilityAction = null;
            new C3348a(1, null);
            new C3348a(2, null);
            new C3348a(4, null);
            new C3348a(8, null);
            new C3348a(32, null);
            new C3348a(64, null);
            new C3348a(128, null);
            new C3348a(256, null, cls2);
            new C3348a(512, null, cls2);
            new C3348a(1024, null, cls);
            new C3348a(2048, null, cls);
            new C3348a(16384, null);
            new C3348a(32768, null);
            new C3348a(65536, null);
            new C3348a(131072, null, C3362g.class);
            new C3348a(2097152, null, C3363h.class);
            new C3348a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new C3348a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, C3360e.class);
            C3348a aVar = new C3348a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            f9562k = aVar;
            new C3348a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            C3348a aVar2 = new C3348a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            f9563l = aVar2;
            new C3348a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new C3348a(VERSION.SDK_INT >= 29 ? AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new C3348a(VERSION.SDK_INT >= 29 ? AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new C3348a(VERSION.SDK_INT >= 29 ? AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new C3348a(VERSION.SDK_INT >= 29 ? AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            new C3348a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            new C3348a(VERSION.SDK_INT >= 24 ? AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, C3361f.class);
            new C3348a(VERSION.SDK_INT >= 26 ? AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, C3359d.class);
            new C3348a(VERSION.SDK_INT >= 28 ? AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            if (VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new C3348a(accessibilityAction, 16908357, null, null, null);
        }

        public C3348a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        private C3348a(int i, CharSequence charSequence, Class<? extends C3356a> cls) {
            this(null, i, charSequence, null, cls);
        }

        C3348a(Object obj) {
            this(obj, 0, null, null, null);
        }

        C3348a(Object obj, int i, CharSequence charSequence, C3355f fVar, Class<? extends C3356a> cls) {
            this.f9565b = i;
            this.f9567d = fVar;
            if (VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityAction(i, charSequence);
            }
            this.f9564a = obj;
            this.f9566c = cls;
        }

        /* renamed from: a */
        public int mo10800a() {
            if (VERSION.SDK_INT >= 21) {
                return ((AccessibilityAction) this.f9564a).getId();
            }
            return 0;
        }

        /* renamed from: a */
        public C3348a mo10801a(CharSequence charSequence, C3355f fVar) {
            C3348a aVar = new C3348a(null, this.f9565b, charSequence, fVar, this.f9566c);
            return aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo10802a(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                f.h.m.f0.f r0 = r4.f9567d
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends f.h.m.f0.f$a> r2 = r4.f9566c
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                f.h.m.f0.f$a r1 = (p071f.p097h.p108m.p109f0.C3355f.C3356a) r1     // Catch:{ Exception -> 0x0020 }
                r1.mo10815a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends f.h.m.f0.f$a> r1 = r4.f9566c
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                f.h.m.f0.f r6 = r4.f9567d
                boolean r5 = r6.mo4398a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p071f.p097h.p108m.p109f0.C3347c.C3348a.mo10802a(android.view.View, android.os.Bundle):boolean");
        }

        /* renamed from: b */
        public CharSequence mo10803b() {
            if (VERSION.SDK_INT >= 21) {
                return ((AccessibilityAction) this.f9564a).getLabel();
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C3348a)) {
                return false;
            }
            C3348a aVar = (C3348a) obj;
            Object obj2 = this.f9564a;
            Object obj3 = aVar.f9564a;
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Object obj = this.f9564a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: f.h.m.f0.c$b */
    public static class C3349b {

        /* renamed from: a */
        final Object f9568a;

        C3349b(Object obj) {
            this.f9568a = obj;
        }

        /* renamed from: a */
        public static C3349b m13706a(int i, int i2, boolean z, int i3) {
            int i4 = VERSION.SDK_INT;
            return i4 >= 21 ? new C3349b(CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new C3349b(CollectionInfo.obtain(i, i2, z)) : new C3349b(null);
        }
    }

    /* renamed from: f.h.m.f0.c$c */
    public static class C3350c {

        /* renamed from: a */
        final Object f9569a;

        C3350c(Object obj) {
            this.f9569a = obj;
        }

        /* renamed from: a */
        public static C3350c m13707a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = VERSION.SDK_INT;
            return i5 >= 21 ? new C3350c(CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C3350c(CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C3350c(null);
        }
    }

    private C3347c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f9553a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    private int m13628a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i)).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f9552d;
        f9552d = i2 + 1;
        return i2;
    }

    /* renamed from: a */
    public static C3347c m13629a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C3347c(accessibilityNodeInfo);
    }

    /* renamed from: a */
    public static C3347c m13630a(C3347c cVar) {
        return m13629a(AccessibilityNodeInfo.obtain(cVar.f9553a));
    }

    /* renamed from: a */
    private List<Integer> m13631a(String str) {
        if (VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList integerArrayList = this.f9553a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            integerArrayList = new ArrayList();
            this.f9553a.getExtras().putIntegerArrayList(str, integerArrayList);
        }
        return integerArrayList;
    }

    /* renamed from: a */
    private void m13632a(int i, boolean z) {
        Bundle f = mo10771f();
        if (f != null) {
            String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
            int i2 = f.getInt(str, 0) & (~i);
            if (!z) {
                i = 0;
            }
            f.putInt(str, i | i2);
        }
    }

    /* renamed from: a */
    private void m13633a(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m13631a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m13631a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m13631a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m13631a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: b */
    private SparseArray<WeakReference<ClickableSpan>> m13634b(View view) {
        SparseArray<WeakReference<ClickableSpan>> c = m13635c(view);
        if (c != null) {
            return c;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C3234c.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    /* renamed from: c */
    private SparseArray<WeakReference<ClickableSpan>> m13635c(View view) {
        return (SparseArray) view.getTag(C3234c.tag_accessibility_clickable_spans);
    }

    /* renamed from: c */
    private static String m13636c(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: d */
    public static C3347c m13637d(View view) {
        return m13629a(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: d */
    private boolean m13638d(int i) {
        Bundle f = mo10771f();
        boolean z = false;
        if (f == null) {
            return false;
        }
        if ((f.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i) {
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    private void m13639e(View view) {
        SparseArray c = m13635c(view);
        if (c != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < c.size(); i++) {
                if (((WeakReference) c.valueAt(i)).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                c.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: h */
    public static ClickableSpan[] m13640h(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: w */
    private void m13641w() {
        if (VERSION.SDK_INT >= 19) {
            this.f9553a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f9553a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f9553a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f9553a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: x */
    private boolean m13642x() {
        return !m13631a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: y */
    public static C3347c m13643y() {
        return m13629a(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: a */
    public List<C3348a> mo10739a() {
        List actionList = VERSION.SDK_INT >= 21 ? this.f9553a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C3348a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo10740a(int i) {
        this.f9553a.addAction(i);
    }

    @Deprecated
    /* renamed from: a */
    public void mo10741a(Rect rect) {
        this.f9553a.getBoundsInParent(rect);
    }

    /* renamed from: a */
    public void mo10742a(View view) {
        this.f9554b = -1;
        this.f9553a.setParent(view);
    }

    /* renamed from: a */
    public void mo10743a(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            this.f9553a.addChild(view, i);
        }
    }

    /* renamed from: a */
    public void mo10744a(C3348a aVar) {
        if (VERSION.SDK_INT >= 21) {
            this.f9553a.addAction((AccessibilityAction) aVar.f9564a);
        }
    }

    /* renamed from: a */
    public void mo10745a(CharSequence charSequence) {
        this.f9553a.setClassName(charSequence);
    }

    /* renamed from: a */
    public void mo10746a(CharSequence charSequence, View view) {
        int i = VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            m13641w();
            m13639e(view);
            ClickableSpan[] h = m13640h(charSequence);
            if (h != null && h.length > 0) {
                mo10771f().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C3234c.accessibility_action_clickable_span);
                SparseArray b = m13634b(view);
                int i2 = 0;
                while (h != null && i2 < h.length) {
                    int a = m13628a(h[i2], b);
                    b.put(a, new WeakReference(h[i2]));
                    m13633a(h[i2], (Spanned) charSequence, a);
                    i2++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo10747a(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f9553a.setCollectionInfo(obj == null ? null : (CollectionInfo) ((C3349b) obj).f9568a);
        }
    }

    /* renamed from: a */
    public void mo10748a(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f9553a.setAccessibilityFocused(z);
        }
    }

    /* renamed from: a */
    public boolean mo10749a(int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return this.f9553a.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: b */
    public int mo10750b() {
        return this.f9553a.getActions();
    }

    /* renamed from: b */
    public void mo10751b(int i) {
        if (VERSION.SDK_INT >= 21) {
            this.f9553a.setMaxTextLength(i);
        }
    }

    /* renamed from: b */
    public void mo10752b(Rect rect) {
        this.f9553a.getBoundsInScreen(rect);
    }

    /* renamed from: b */
    public void mo10753b(View view, int i) {
        this.f9554b = i;
        if (VERSION.SDK_INT >= 16) {
            this.f9553a.setParent(view, i);
        }
    }

    /* renamed from: b */
    public void mo10754b(CharSequence charSequence) {
        this.f9553a.setContentDescription(charSequence);
    }

    /* renamed from: b */
    public void mo10755b(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f9553a.setCollectionItemInfo(obj == null ? null : (CollectionItemInfo) ((C3350c) obj).f9569a);
        }
    }

    /* renamed from: b */
    public void mo10756b(boolean z) {
        this.f9553a.setCheckable(z);
    }

    /* renamed from: b */
    public boolean mo10757b(C3348a aVar) {
        if (VERSION.SDK_INT >= 21) {
            return this.f9553a.removeAction((AccessibilityAction) aVar.f9564a);
        }
        return false;
    }

    /* renamed from: c */
    public int mo10758c() {
        return this.f9553a.getChildCount();
    }

    @Deprecated
    /* renamed from: c */
    public void mo10759c(Rect rect) {
        this.f9553a.setBoundsInParent(rect);
    }

    /* renamed from: c */
    public void mo10760c(View view, int i) {
        this.f9555c = i;
        if (VERSION.SDK_INT >= 16) {
            this.f9553a.setSource(view, i);
        }
    }

    /* renamed from: c */
    public void mo10761c(CharSequence charSequence) {
        if (VERSION.SDK_INT >= 21) {
            this.f9553a.setError(charSequence);
        }
    }

    /* renamed from: c */
    public void mo10762c(boolean z) {
        this.f9553a.setChecked(z);
    }

    /* renamed from: d */
    public CharSequence mo10763d() {
        return this.f9553a.getClassName();
    }

    /* renamed from: d */
    public void mo10764d(Rect rect) {
        this.f9553a.setBoundsInScreen(rect);
    }

    /* renamed from: d */
    public void mo10765d(CharSequence charSequence) {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            this.f9553a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f9553a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: d */
    public void mo10766d(boolean z) {
        this.f9553a.setClickable(z);
    }

    /* renamed from: e */
    public CharSequence mo10767e() {
        return this.f9553a.getContentDescription();
    }

    /* renamed from: e */
    public void mo10768e(CharSequence charSequence) {
        this.f9553a.setPackageName(charSequence);
    }

    /* renamed from: e */
    public void mo10769e(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f9553a.setDismissable(z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3347c)) {
            return false;
        }
        C3347c cVar = (C3347c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f9553a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f9553a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f9553a)) {
            return false;
        }
        return this.f9555c == cVar.f9555c && this.f9554b == cVar.f9554b;
    }

    /* renamed from: f */
    public Bundle mo10771f() {
        return VERSION.SDK_INT >= 19 ? this.f9553a.getExtras() : new Bundle();
    }

    /* renamed from: f */
    public void mo10772f(CharSequence charSequence) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            this.f9553a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f9553a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: f */
    public void mo10773f(boolean z) {
        this.f9553a.setEnabled(z);
    }

    /* renamed from: g */
    public CharSequence mo10774g() {
        return this.f9553a.getPackageName();
    }

    /* renamed from: g */
    public void mo10775g(CharSequence charSequence) {
        this.f9553a.setText(charSequence);
    }

    /* renamed from: g */
    public void mo10776g(boolean z) {
        this.f9553a.setFocusable(z);
    }

    /* renamed from: h */
    public CharSequence mo10777h() {
        if (!m13642x()) {
            return this.f9553a.getText();
        }
        List a = m13631a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List a2 = m13631a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List a3 = m13631a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List a4 = m13631a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f9553a.getText(), 0, this.f9553a.getText().length()));
        for (int i = 0; i < a.size(); i++) {
            spannableString.setSpan(new C3345a(((Integer) a4.get(i)).intValue(), this, mo10771f().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) a.get(i)).intValue(), ((Integer) a2.get(i)).intValue(), ((Integer) a3.get(i)).intValue());
        }
        return spannableString;
    }

    /* renamed from: h */
    public void mo10778h(boolean z) {
        this.f9553a.setFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f9553a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public String mo10780i() {
        if (VERSION.SDK_INT >= 18) {
            return this.f9553a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: i */
    public void mo10781i(boolean z) {
        if (VERSION.SDK_INT >= 28) {
            this.f9553a.setHeading(z);
        } else {
            m13632a(2, z);
        }
    }

    /* renamed from: j */
    public void mo10782j(boolean z) {
        if (VERSION.SDK_INT >= 28) {
            this.f9553a.setScreenReaderFocusable(z);
        } else {
            m13632a(1, z);
        }
    }

    /* renamed from: j */
    public boolean mo10783j() {
        return this.f9553a.isCheckable();
    }

    /* renamed from: k */
    public void mo10784k(boolean z) {
        this.f9553a.setScrollable(z);
    }

    /* renamed from: k */
    public boolean mo10785k() {
        return this.f9553a.isChecked();
    }

    /* renamed from: l */
    public void mo10786l(boolean z) {
        if (VERSION.SDK_INT >= 26) {
            this.f9553a.setShowingHintText(z);
        } else {
            m13632a(4, z);
        }
    }

    /* renamed from: l */
    public boolean mo10787l() {
        return this.f9553a.isClickable();
    }

    /* renamed from: m */
    public void mo10788m(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f9553a.setVisibleToUser(z);
        }
    }

    /* renamed from: m */
    public boolean mo10789m() {
        return this.f9553a.isEnabled();
    }

    /* renamed from: n */
    public boolean mo10790n() {
        return this.f9553a.isFocusable();
    }

    /* renamed from: o */
    public boolean mo10791o() {
        return this.f9553a.isFocused();
    }

    /* renamed from: p */
    public boolean mo10792p() {
        return this.f9553a.isLongClickable();
    }

    /* renamed from: q */
    public boolean mo10793q() {
        return this.f9553a.isPassword();
    }

    /* renamed from: r */
    public boolean mo10794r() {
        return this.f9553a.isScrollable();
    }

    /* renamed from: s */
    public boolean mo10795s() {
        return this.f9553a.isSelected();
    }

    /* renamed from: t */
    public boolean mo10796t() {
        return VERSION.SDK_INT >= 26 ? this.f9553a.isShowingHintText() : m13638d(4);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo10741a(rect);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        mo10752b(rect);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(mo10774g());
        sb.append("; className: ");
        sb.append(mo10763d());
        sb.append("; text: ");
        sb.append(mo10777h());
        sb.append("; contentDescription: ");
        sb.append(mo10767e());
        sb.append("; viewId: ");
        sb.append(mo10780i());
        sb.append("; checkable: ");
        sb.append(mo10783j());
        sb.append("; checked: ");
        sb.append(mo10785k());
        sb.append("; focusable: ");
        sb.append(mo10790n());
        sb.append("; focused: ");
        sb.append(mo10791o());
        sb.append("; selected: ");
        sb.append(mo10795s());
        sb.append("; clickable: ");
        sb.append(mo10787l());
        sb.append("; longClickable: ");
        sb.append(mo10792p());
        sb.append("; enabled: ");
        sb.append(mo10789m());
        sb.append("; password: ");
        sb.append(mo10793q());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("; scrollable: ");
        sb4.append(mo10794r());
        sb.append(sb4.toString());
        sb.append("; [");
        String str = ", ";
        if (VERSION.SDK_INT >= 21) {
            List a = mo10739a();
            for (int i = 0; i < a.size(); i++) {
                C3348a aVar = (C3348a) a.get(i);
                String c = m13636c(aVar.mo10800a());
                if (c.equals("ACTION_UNKNOWN") && aVar.mo10803b() != null) {
                    c = aVar.mo10803b().toString();
                }
                sb.append(c);
                if (i != a.size() - 1) {
                    sb.append(str);
                }
            }
        } else {
            int b = mo10750b();
            while (b != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
                b &= ~numberOfTrailingZeros;
                sb.append(m13636c(numberOfTrailingZeros));
                if (b != 0) {
                    sb.append(str);
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo10798u() {
        this.f9553a.recycle();
    }

    /* renamed from: v */
    public AccessibilityNodeInfo mo10799v() {
        return this.f9553a;
    }
}
