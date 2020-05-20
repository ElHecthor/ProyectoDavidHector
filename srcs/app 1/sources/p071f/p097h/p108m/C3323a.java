package p071f.p097h.p108m;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p071f.p097h.C3234c;
import p071f.p097h.p108m.p109f0.C3347c;
import p071f.p097h.p108m.p109f0.C3347c.C3348a;
import p071f.p097h.p108m.p109f0.C3351d;

/* renamed from: f.h.m.a */
public class C3323a {

    /* renamed from: c */
    private static final AccessibilityDelegate f9500c = new AccessibilityDelegate();

    /* renamed from: a */
    private final AccessibilityDelegate f9501a;

    /* renamed from: b */
    private final AccessibilityDelegate f9502b;

    /* renamed from: f.h.m.a$a */
    static final class C3324a extends AccessibilityDelegate {

        /* renamed from: a */
        final C3323a f9503a;

        C3324a(C3323a aVar) {
            this.f9503a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f9503a.mo3960a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C3351d a = this.f9503a.mo3958a(view);
            if (a != null) {
                return (AccessibilityNodeProvider) a.mo10807a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f9503a.mo2351b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C3347c a = C3347c.m13629a(accessibilityNodeInfo);
            a.mo10782j(C3379v.m13771G(view));
            a.mo10781i(C3379v.m13766B(view));
            a.mo10772f(C3379v.m13815f(view));
            this.f9503a.mo2349a(view, a);
            a.mo10746a(accessibilityNodeInfo.getText(), view);
            List b = C3323a.m13556b(view);
            for (int i = 0; i < b.size(); i++) {
                a.mo10744a((C3348a) b.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f9503a.mo3963c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f9503a.mo3961a(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f9503a.mo2350a(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f9503a.mo3959a(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f9503a.mo3965d(view, accessibilityEvent);
        }
    }

    public C3323a() {
        this(f9500c);
    }

    public C3323a(AccessibilityDelegate accessibilityDelegate) {
        this.f9501a = accessibilityDelegate;
        this.f9502b = new C3324a(this);
    }

    /* renamed from: a */
    private boolean m13554a(int i, View view) {
        SparseArray sparseArray = (SparseArray) view.getTag(C3234c.tag_accessibility_clickable_spans);
        if (sparseArray != null) {
            WeakReference weakReference = (WeakReference) sparseArray.get(i);
            if (weakReference != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (m13555a(clickableSpan, view)) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m13555a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] h = C3347c.m13640h(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (h != null && i < h.length) {
                if (clickableSpan.equals(h[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: b */
    static List<C3348a> m13556b(View view) {
        List<C3348a> list = (List) view.getTag(C3234c.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public AccessibilityDelegate mo10698a() {
        return this.f9502b;
    }

    /* renamed from: a */
    public C3351d mo3958a(View view) {
        if (VERSION.SDK_INT >= 16) {
            AccessibilityNodeProvider accessibilityNodeProvider = this.f9501a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new C3351d(accessibilityNodeProvider);
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo3959a(View view, int i) {
        this.f9501a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public void mo2349a(View view, C3347c cVar) {
        this.f9501a.onInitializeAccessibilityNodeInfo(view, cVar.mo10799v());
    }

    /* renamed from: a */
    public boolean mo2350a(View view, int i, Bundle bundle) {
        List b = m13556b(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= b.size()) {
                break;
            }
            C3348a aVar = (C3348a) b.get(i2);
            if (aVar.mo10800a() == i) {
                z = aVar.mo10802a(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && VERSION.SDK_INT >= 16) {
            z = this.f9501a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != C3234c.accessibility_action_clickable_span) ? z : m13554a(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: a */
    public boolean mo3960a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f9501a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo3961a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f9501a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo2351b(View view, AccessibilityEvent accessibilityEvent) {
        this.f9501a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo3963c(View view, AccessibilityEvent accessibilityEvent) {
        this.f9501a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo3965d(View view, AccessibilityEvent accessibilityEvent) {
        this.f9501a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
