package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0137m.C0138a;
import androidx.appcompat.view.menu.C0139n.C0140a;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
public abstract class C0111b implements C0137m {

    /* renamed from: f */
    protected Context f449f;

    /* renamed from: g */
    protected Context f450g;

    /* renamed from: h */
    protected C0122g f451h;

    /* renamed from: i */
    protected LayoutInflater f452i;

    /* renamed from: j */
    private C0138a f453j;

    /* renamed from: k */
    private int f454k;

    /* renamed from: l */
    private int f455l;

    /* renamed from: m */
    protected C0139n f456m;

    /* renamed from: n */
    private int f457n;

    public C0111b(Context context, int i, int i2) {
        this.f449f = context;
        this.f452i = LayoutInflater.from(context);
        this.f454k = i;
        this.f455l = i2;
    }

    /* renamed from: a */
    public View mo509a(C0126i iVar, View view, ViewGroup viewGroup) {
        C0140a a = view instanceof C0140a ? (C0140a) view : mo511a(viewGroup);
        mo516a(iVar, a);
        return (View) a;
    }

    /* renamed from: a */
    public C0138a mo510a() {
        return this.f453j;
    }

    /* renamed from: a */
    public C0140a mo511a(ViewGroup viewGroup) {
        return (C0140a) this.f452i.inflate(this.f455l, viewGroup, false);
    }

    /* renamed from: a */
    public void mo512a(int i) {
        this.f457n = i;
    }

    /* renamed from: a */
    public void mo513a(Context context, C0122g gVar) {
        this.f450g = context;
        LayoutInflater.from(context);
        this.f451h = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo514a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f456m).addView(view, i);
    }

    /* renamed from: a */
    public void mo515a(C0122g gVar, boolean z) {
        C0138a aVar = this.f453j;
        if (aVar != null) {
            aVar.mo332a(gVar, z);
        }
    }

    /* renamed from: a */
    public abstract void mo516a(C0126i iVar, C0140a aVar);

    /* renamed from: a */
    public void mo517a(C0138a aVar) {
        this.f453j = aVar;
    }

    /* renamed from: a */
    public void mo518a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f456m;
        if (viewGroup != null) {
            C0122g gVar = this.f451h;
            int i = 0;
            if (gVar != null) {
                gVar.mo604b();
                ArrayList n = this.f451h.mo635n();
                int size = n.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0126i iVar = (C0126i) n.get(i3);
                    if (mo519a(i2, iVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0126i itemData = childAt instanceof C0140a ? ((C0140a) childAt).getItemData() : null;
                        View a = mo509a(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            mo514a(a, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo520a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo519a(int i, C0126i iVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo520a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public boolean mo521a(C0122g gVar, C0126i iVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo522a(C0146r rVar) {
        C0138a aVar = this.f453j;
        if (aVar != null) {
            return aVar.mo333a(rVar);
        }
        return false;
    }

    /* renamed from: b */
    public C0139n mo523b(ViewGroup viewGroup) {
        if (this.f456m == null) {
            C0139n nVar = (C0139n) this.f452i.inflate(this.f454k, viewGroup, false);
            this.f456m = nVar;
            nVar.mo438a(this.f451h);
            mo518a(true);
        }
        return this.f456m;
    }

    /* renamed from: b */
    public boolean mo524b(C0122g gVar, C0126i iVar) {
        return false;
    }

    /* renamed from: d */
    public int mo525d() {
        return this.f457n;
    }
}
