package p071f.p097h.p108m.p109f0;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f.h.m.f0.d */
public class C3351d {

    /* renamed from: a */
    private final Object f9570a;

    /* renamed from: f.h.m.f0.d$a */
    static class C3352a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C3351d f9571a;

        C3352a(C3351d dVar) {
            this.f9571a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C3347c a = this.f9571a.mo10806a(i);
            if (a == null) {
                return null;
            }
            return a.mo10799v();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List a = this.f9571a.mo10808a(str, i);
            if (a == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((C3347c) a.get(i2)).mo10799v());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f9571a.mo10809a(i, i2, bundle);
        }
    }

    /* renamed from: f.h.m.f0.d$b */
    static class C3353b extends C3352a {
        C3353b(C3351d dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C3347c b = this.f9571a.mo10810b(i);
            if (b == null) {
                return null;
            }
            return b.mo10799v();
        }
    }

    public C3351d() {
        int i = VERSION.SDK_INT;
        Object obj = i >= 19 ? new C3353b(this) : i >= 16 ? new C3352a(this) : null;
        this.f9570a = obj;
    }

    public C3351d(Object obj) {
        this.f9570a = obj;
    }

    /* renamed from: a */
    public C3347c mo10806a(int i) {
        return null;
    }

    /* renamed from: a */
    public Object mo10807a() {
        return this.f9570a;
    }

    /* renamed from: a */
    public List<C3347c> mo10808a(String str, int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo10809a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: b */
    public C3347c mo10810b(int i) {
        return null;
    }
}
