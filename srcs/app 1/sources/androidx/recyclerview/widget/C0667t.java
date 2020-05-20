package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import p071f.p097h.p108m.C3323a;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c;
import p071f.p097h.p108m.p109f0.C3351d;

/* renamed from: androidx.recyclerview.widget.t */
public class C0667t extends C3323a {

    /* renamed from: d */
    final RecyclerView f2708d;

    /* renamed from: e */
    private final C0668a f2709e;

    /* renamed from: androidx.recyclerview.widget.t$a */
    public static class C0668a extends C3323a {

        /* renamed from: d */
        final C0667t f2710d;

        /* renamed from: e */
        private Map<View, C3323a> f2711e = new WeakHashMap();

        public C0668a(C0667t tVar) {
            this.f2710d = tVar;
        }

        /* renamed from: a */
        public C3351d mo3958a(View view) {
            C3323a aVar = (C3323a) this.f2711e.get(view);
            return aVar != null ? aVar.mo3958a(view) : super.mo3958a(view);
        }

        /* renamed from: a */
        public void mo3959a(View view, int i) {
            C3323a aVar = (C3323a) this.f2711e.get(view);
            if (aVar != null) {
                aVar.mo3959a(view, i);
            } else {
                super.mo3959a(view, i);
            }
        }

        /* renamed from: a */
        public void mo2349a(View view, C3347c cVar) {
            if (!this.f2710d.mo3957c() && this.f2710d.f2708d.getLayoutManager() != null) {
                this.f2710d.f2708d.getLayoutManager().mo3542a(view, cVar);
                C3323a aVar = (C3323a) this.f2711e.get(view);
                if (aVar != null) {
                    aVar.mo2349a(view, cVar);
                    return;
                }
            }
            super.mo2349a(view, cVar);
        }

        /* renamed from: a */
        public boolean mo2350a(View view, int i, Bundle bundle) {
            if (this.f2710d.mo3957c() || this.f2710d.f2708d.getLayoutManager() == null) {
                return super.mo2350a(view, i, bundle);
            }
            C3323a aVar = (C3323a) this.f2711e.get(view);
            if (aVar != null) {
                if (aVar.mo2350a(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo2350a(view, i, bundle)) {
                return true;
            }
            return this.f2710d.f2708d.getLayoutManager().mo3555a(view, i, bundle);
        }

        /* renamed from: a */
        public boolean mo3960a(View view, AccessibilityEvent accessibilityEvent) {
            C3323a aVar = (C3323a) this.f2711e.get(view);
            return aVar != null ? aVar.mo3960a(view, accessibilityEvent) : super.mo3960a(view, accessibilityEvent);
        }

        /* renamed from: a */
        public boolean mo3961a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C3323a aVar = (C3323a) this.f2711e.get(viewGroup);
            return aVar != null ? aVar.mo3961a(viewGroup, view, accessibilityEvent) : super.mo3961a(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: b */
        public void mo2351b(View view, AccessibilityEvent accessibilityEvent) {
            C3323a aVar = (C3323a) this.f2711e.get(view);
            if (aVar != null) {
                aVar.mo2351b(view, accessibilityEvent);
            } else {
                super.mo2351b(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C3323a mo3962c(View view) {
            return (C3323a) this.f2711e.remove(view);
        }

        /* renamed from: c */
        public void mo3963c(View view, AccessibilityEvent accessibilityEvent) {
            C3323a aVar = (C3323a) this.f2711e.get(view);
            if (aVar != null) {
                aVar.mo3963c(view, accessibilityEvent);
            } else {
                super.mo3963c(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo3964d(View view) {
            C3323a b = C3379v.m13801b(view);
            if (b != null && b != this) {
                this.f2711e.put(view, b);
            }
        }

        /* renamed from: d */
        public void mo3965d(View view, AccessibilityEvent accessibilityEvent) {
            C3323a aVar = (C3323a) this.f2711e.get(view);
            if (aVar != null) {
                aVar.mo3965d(view, accessibilityEvent);
            } else {
                super.mo3965d(view, accessibilityEvent);
            }
        }
    }

    public C0667t(RecyclerView recyclerView) {
        this.f2708d = recyclerView;
        C3323a b = mo3956b();
        this.f2709e = (b == null || !(b instanceof C0668a)) ? new C0668a(this) : (C0668a) b;
    }

    /* renamed from: a */
    public void mo2349a(View view, C3347c cVar) {
        super.mo2349a(view, cVar);
        if (!mo3957c() && this.f2708d.getLayoutManager() != null) {
            this.f2708d.getLayoutManager().mo3552a(cVar);
        }
    }

    /* renamed from: a */
    public boolean mo2350a(View view, int i, Bundle bundle) {
        if (super.mo2350a(view, i, bundle)) {
            return true;
        }
        if (mo3957c() || this.f2708d.getLayoutManager() == null) {
            return false;
        }
        return this.f2708d.getLayoutManager().mo3553a(i, bundle);
    }

    /* renamed from: b */
    public C3323a mo3956b() {
        return this.f2709e;
    }

    /* renamed from: b */
    public void mo2351b(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2351b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo3957c()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo3157a(accessibilityEvent);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo3957c() {
        return this.f2708d.hasPendingAdapterUpdates();
    }
}
