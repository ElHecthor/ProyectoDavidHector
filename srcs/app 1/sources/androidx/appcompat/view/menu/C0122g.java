package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p071f.p097h.p098e.C3236a;
import p071f.p097h.p101g.p102a.C3273a;
import p071f.p097h.p108m.C3388w;

/* renamed from: androidx.appcompat.view.menu.g */
public class C0122g implements C3273a {

    /* renamed from: A */
    private static final int[] f516A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f517a;

    /* renamed from: b */
    private final Resources f518b;

    /* renamed from: c */
    private boolean f519c;

    /* renamed from: d */
    private boolean f520d;

    /* renamed from: e */
    private C0123a f521e;

    /* renamed from: f */
    private ArrayList<C0126i> f522f;

    /* renamed from: g */
    private ArrayList<C0126i> f523g;

    /* renamed from: h */
    private boolean f524h;

    /* renamed from: i */
    private ArrayList<C0126i> f525i;

    /* renamed from: j */
    private ArrayList<C0126i> f526j;

    /* renamed from: k */
    private boolean f527k;

    /* renamed from: l */
    private int f528l = 0;

    /* renamed from: m */
    private ContextMenuInfo f529m;

    /* renamed from: n */
    CharSequence f530n;

    /* renamed from: o */
    Drawable f531o;

    /* renamed from: p */
    View f532p;

    /* renamed from: q */
    private boolean f533q = false;

    /* renamed from: r */
    private boolean f534r = false;

    /* renamed from: s */
    private boolean f535s = false;

    /* renamed from: t */
    private boolean f536t = false;

    /* renamed from: u */
    private boolean f537u = false;

    /* renamed from: v */
    private ArrayList<C0126i> f538v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<C0137m>> f539w = new CopyOnWriteArrayList<>();

    /* renamed from: x */
    private C0126i f540x;

    /* renamed from: y */
    private boolean f541y = false;

    /* renamed from: z */
    private boolean f542z;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    public interface C0123a {
        /* renamed from: a */
        void mo297a(C0122g gVar);

        /* renamed from: a */
        boolean mo300a(C0122g gVar, MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    public interface C0124b {
        /* renamed from: a */
        boolean mo439a(C0126i iVar);
    }

    public C0122g(Context context) {
        this.f517a = context;
        this.f518b = context.getResources();
        this.f522f = new ArrayList<>();
        this.f523g = new ArrayList<>();
        this.f524h = true;
        this.f525i = new ArrayList<>();
        this.f526j = new ArrayList<>();
        this.f527k = true;
        m616e(true);
    }

    /* renamed from: a */
    private static int m609a(ArrayList<C0126i> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0126i) arrayList.get(size)).mo662c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private C0126i m610a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        C0126i iVar = new C0126i(this, i, i2, i3, i4, charSequence, i5);
        return iVar;
    }

    /* renamed from: a */
    private void m611a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources l = mo633l();
        if (view != null) {
            this.f532p = view;
            this.f530n = null;
            this.f531o = null;
        } else {
            if (i > 0) {
                this.f530n = l.getText(i);
            } else if (charSequence != null) {
                this.f530n = charSequence;
            }
            if (i2 > 0) {
                this.f531o = C3236a.m13271c(mo621e(), i2);
            } else if (drawable != null) {
                this.f531o = drawable;
            }
            this.f532p = null;
        }
        mo607b(false);
    }

    /* renamed from: a */
    private void m612a(int i, boolean z) {
        if (i >= 0 && i < this.f522f.size()) {
            this.f522f.remove(i);
            if (z) {
                mo607b(true);
            }
        }
    }

    /* renamed from: a */
    private boolean m613a(C0146r rVar, C0137m mVar) {
        boolean z = false;
        if (this.f539w.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z = mVar.mo522a(rVar);
        }
        Iterator it = this.f539w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0137m mVar2 = (C0137m) weakReference.get();
            if (mVar2 == null) {
                this.f539w.remove(weakReference);
            } else if (!z) {
                z = mVar2.mo522a(rVar);
            }
        }
        return z;
    }

    /* renamed from: d */
    private void m614d(boolean z) {
        if (!this.f539w.isEmpty()) {
            mo644s();
            Iterator it = this.f539w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0137m mVar = (C0137m) weakReference.get();
                if (mVar == null) {
                    this.f539w.remove(weakReference);
                } else {
                    mVar.mo518a(z);
                }
            }
            mo641r();
        }
    }

    /* renamed from: e */
    private void m615e(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f539w.isEmpty()) {
            Iterator it = this.f539w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0137m mVar = (C0137m) weakReference.get();
                if (mVar == null) {
                    this.f539w.remove(weakReference);
                } else {
                    int d = mVar.mo525d();
                    if (d > 0) {
                        Parcelable parcelable = (Parcelable) sparseParcelableArray.get(d);
                        if (parcelable != null) {
                            mVar.mo532a(parcelable);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private void m616e(boolean z) {
        boolean z2 = true;
        if (!z || this.f518b.getConfiguration().keyboard == 1 || !C3388w.m13880d(ViewConfiguration.get(this.f517a), this.f517a)) {
            z2 = false;
        }
        this.f520d = z2;
    }

    /* renamed from: f */
    private static int m617f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f516A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: f */
    private void m618f(Bundle bundle) {
        if (!this.f539w.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = this.f539w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0137m mVar = (C0137m) weakReference.get();
                if (mVar == null) {
                    this.f539w.remove(weakReference);
                } else {
                    int d = mVar.mo525d();
                    if (d > 0) {
                        Parcelable g = mVar.mo546g();
                        if (g != null) {
                            sparseArray.put(d, g);
                        }
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: a */
    public int mo575a(int i) {
        return mo576a(i, 0);
    }

    /* renamed from: a */
    public int mo576a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (((C0126i) this.f522f.get(i2)).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo577a(int i, int i2, int i3, CharSequence charSequence) {
        int f = m617f(i3);
        C0126i a = m610a(i, i2, i3, f, charSequence, this.f528l);
        ContextMenuInfo contextMenuInfo = this.f529m;
        if (contextMenuInfo != null) {
            a.mo657a(contextMenuInfo);
        }
        ArrayList<C0126i> arrayList = this.f522f;
        arrayList.add(m609a(arrayList, f), a);
        mo607b(true);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0122g mo578a(Drawable drawable) {
        m611a(0, null, 0, drawable, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0122g mo579a(View view) {
        m611a(0, null, 0, null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0122g mo580a(CharSequence charSequence) {
        m611a(0, charSequence, 0, null, null);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0126i mo581a(int i, KeyEvent keyEvent) {
        ArrayList<C0126i> arrayList = this.f538v;
        arrayList.clear();
        mo588a((List<C0126i>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0126i) arrayList.get(0);
        }
        boolean p = mo637p();
        for (int i2 = 0; i2 < size; i2++) {
            C0126i iVar = (C0126i) arrayList.get(i2);
            char alphabeticShortcut = p ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (p && alphabeticShortcut == 8 && i == 67))) {
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo582a() {
        C0123a aVar = this.f521e;
        if (aVar != null) {
            aVar.mo297a(this);
        }
    }

    /* renamed from: a */
    public void mo583a(Bundle bundle) {
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo618d());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0146r) item.getSubMenu()).mo583a(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                MenuItem findItem = findItem(i2);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo584a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f522f.size();
        mo644s();
        for (int i = 0; i < size; i++) {
            C0126i iVar = (C0126i) this.f522f.get(i);
            if (iVar.getGroupId() == groupId && iVar.mo684i() && iVar.isCheckable()) {
                iVar.mo661b(iVar == menuItem);
            }
        }
        mo641r();
    }

    /* renamed from: a */
    public void mo585a(C0123a aVar) {
        this.f521e = aVar;
    }

    /* renamed from: a */
    public void mo586a(C0137m mVar) {
        mo587a(mVar, this.f517a);
    }

    /* renamed from: a */
    public void mo587a(C0137m mVar, Context context) {
        this.f539w.add(new WeakReference(mVar));
        mVar.mo513a(context, this);
        this.f527k = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo588a(List<C0126i> list, int i, KeyEvent keyEvent) {
        boolean p = mo637p();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f522f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0126i iVar = (C0126i) this.f522f.get(i2);
                if (iVar.hasSubMenu()) {
                    ((C0122g) iVar.getSubMenu()).mo588a(list, i, keyEvent);
                }
                char alphabeticShortcut = p ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((p ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (p && alphabeticShortcut == 8 && i == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo589a(boolean z) {
        if (!this.f537u) {
            this.f537u = true;
            Iterator it = this.f539w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0137m mVar = (C0137m) weakReference.get();
                if (mVar == null) {
                    this.f539w.remove(weakReference);
                } else {
                    mVar.mo515a(this, z);
                }
            }
            this.f537u = false;
        }
    }

    /* renamed from: a */
    public boolean mo590a(MenuItem menuItem, int i) {
        return mo591a(menuItem, (C0137m) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo591a(android.view.MenuItem r7, androidx.appcompat.view.menu.C0137m r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.i r7 = (androidx.appcompat.view.menu.C0126i) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.mo669g()
            f.h.m.b r2 = r7.mo454a()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.mo768a()
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r5 = r7.mo668f()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.mo589a(r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.mo589a(r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            androidx.appcompat.view.menu.r r9 = new androidx.appcompat.view.menu.r
            android.content.Context r0 = r6.mo621e()
            r9.<init>(r0, r6, r7)
            r7.mo658a(r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.r r7 = (androidx.appcompat.view.menu.C0146r) r7
            if (r4 == 0) goto L_0x0063
            r2.mo767a(r7)
        L_0x0063:
            boolean r7 = r6.m613a(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0122g.mo591a(android.view.MenuItem, androidx.appcompat.view.menu.m, int):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo592a(C0122g gVar, MenuItem menuItem) {
        C0123a aVar = this.f521e;
        return aVar != null && aVar.mo300a(gVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo593a(C0126i iVar) {
        boolean z = false;
        if (!this.f539w.isEmpty() && this.f540x == iVar) {
            mo644s();
            Iterator it = this.f539w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0137m mVar = (C0137m) weakReference.get();
                if (mVar == null) {
                    this.f539w.remove(weakReference);
                } else {
                    z = mVar.mo521a(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo641r();
            if (z) {
                this.f540x = null;
            }
        }
        return z;
    }

    public MenuItem add(int i) {
        return mo577a(0, 0, 0, this.f518b.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo577a(i, i2, i3, this.f518b.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo577a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo577a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f517a.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            int i6 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i6 < 0 ? intent : intentArr[i6]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null) {
                int i7 = resolveInfo.specificIndex;
                if (i7 >= 0) {
                    menuItemArr[i7] = intent3;
                }
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f518b.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f518b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0126i iVar = (C0126i) mo577a(i, i2, i3, charSequence);
        C0146r rVar = new C0146r(this.f517a, this, iVar);
        iVar.mo658a(rVar);
        return rVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public int mo603b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0126i) this.f522f.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo604b() {
        ArrayList n = mo635n();
        if (this.f527k) {
            Iterator it = this.f539w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0137m mVar = (C0137m) weakReference.get();
                if (mVar == null) {
                    this.f539w.remove(weakReference);
                } else {
                    z |= mVar.mo545f();
                }
            }
            if (z) {
                this.f525i.clear();
                this.f526j.clear();
                int size = n.size();
                for (int i = 0; i < size; i++) {
                    C0126i iVar = (C0126i) n.get(i);
                    (iVar.mo682h() ? this.f525i : this.f526j).add(iVar);
                }
            } else {
                this.f525i.clear();
                this.f526j.clear();
                this.f526j.addAll(mo635n());
            }
            this.f527k = false;
        }
    }

    /* renamed from: b */
    public void mo605b(Bundle bundle) {
        m615e(bundle);
    }

    /* renamed from: b */
    public void mo606b(C0137m mVar) {
        Iterator it = this.f539w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0137m mVar2 = (C0137m) weakReference.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f539w.remove(weakReference);
            }
        }
    }

    /* renamed from: b */
    public void mo607b(boolean z) {
        if (!this.f533q) {
            if (z) {
                this.f524h = true;
                this.f527k = true;
            }
            m614d(z);
            return;
        }
        this.f534r = true;
        if (z) {
            this.f535s = true;
        }
    }

    /* renamed from: b */
    public boolean mo608b(C0126i iVar) {
        boolean z = false;
        if (this.f539w.isEmpty()) {
            return false;
        }
        mo644s();
        Iterator it = this.f539w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0137m mVar = (C0137m) weakReference.get();
            if (mVar == null) {
                this.f539w.remove(weakReference);
            } else {
                z = mVar.mo524b(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        mo641r();
        if (z) {
            this.f540x = iVar;
        }
        return z;
    }

    /* renamed from: c */
    public C0122g mo609c(int i) {
        this.f528l = i;
        return this;
    }

    /* renamed from: c */
    public ArrayList<C0126i> mo610c() {
        mo604b();
        return this.f525i;
    }

    /* renamed from: c */
    public void mo611c(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0146r) item.getSubMenu()).mo611c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo618d(), sparseArray);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo612c(C0126i iVar) {
        this.f527k = true;
        mo607b(true);
    }

    /* renamed from: c */
    public void mo613c(boolean z) {
        this.f542z = z;
    }

    public void clear() {
        C0126i iVar = this.f540x;
        if (iVar != null) {
            mo593a(iVar);
        }
        this.f522f.clear();
        mo607b(true);
    }

    public void clearHeader() {
        this.f531o = null;
        this.f530n = null;
        this.f532p = null;
        mo607b(false);
    }

    public void close() {
        mo589a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0122g mo617d(int i) {
        m611a(0, null, i, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo618d() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: d */
    public void mo619d(Bundle bundle) {
        m618f(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo620d(C0126i iVar) {
        this.f524h = true;
        mo607b(true);
    }

    /* renamed from: e */
    public Context mo621e() {
        return this.f517a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0122g mo622e(int i) {
        m611a(i, null, 0, null, null);
        return this;
    }

    /* renamed from: f */
    public C0126i mo623f() {
        return this.f540x;
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0126i iVar = (C0126i) this.f522f.get(i2);
            if (iVar.getItemId() == i) {
                return iVar;
            }
            if (iVar.hasSubMenu()) {
                MenuItem findItem = iVar.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public Drawable mo625g() {
        return this.f531o;
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f522f.get(i);
    }

    /* renamed from: h */
    public CharSequence mo627h() {
        return this.f530n;
    }

    public boolean hasVisibleItems() {
        if (this.f542z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0126i) this.f522f.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public View mo629i() {
        return this.f532p;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo581a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public ArrayList<C0126i> mo631j() {
        mo604b();
        return this.f526j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo632k() {
        return this.f536t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public Resources mo633l() {
        return this.f518b;
    }

    /* renamed from: m */
    public C0122g mo634m() {
        return this;
    }

    /* renamed from: n */
    public ArrayList<C0126i> mo635n() {
        if (!this.f524h) {
            return this.f523g;
        }
        this.f523g.clear();
        int size = this.f522f.size();
        for (int i = 0; i < size; i++) {
            C0126i iVar = (C0126i) this.f522f.get(i);
            if (iVar.isVisible()) {
                this.f523g.add(iVar);
            }
        }
        this.f524h = false;
        this.f527k = true;
        return this.f523g;
    }

    /* renamed from: o */
    public boolean mo636o() {
        return this.f541y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo637p() {
        return this.f519c;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo590a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0126i a = mo581a(i, keyEvent);
        boolean a2 = a != null ? mo590a((MenuItem) a, i2) : false;
        if ((i2 & 2) != 0) {
            mo589a(true);
        }
        return a2;
    }

    /* renamed from: q */
    public boolean mo640q() {
        return this.f520d;
    }

    /* renamed from: r */
    public void mo641r() {
        this.f533q = false;
        if (this.f534r) {
            this.f534r = false;
            mo607b(this.f535s);
        }
    }

    public void removeGroup(int i) {
        int a = mo575a(i);
        if (a >= 0) {
            int size = this.f522f.size() - a;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((C0126i) this.f522f.get(a)).getGroupId() != i) {
                    mo607b(true);
                } else {
                    m612a(a, false);
                    i2 = i3;
                }
            }
            mo607b(true);
        }
    }

    public void removeItem(int i) {
        m612a(mo603b(i), true);
    }

    /* renamed from: s */
    public void mo644s() {
        if (!this.f533q) {
            this.f533q = true;
            this.f534r = false;
            this.f535s = false;
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f522f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0126i iVar = (C0126i) this.f522f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.mo663c(z2);
                iVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f541y = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f522f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0126i iVar = (C0126i) this.f522f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f522f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0126i iVar = (C0126i) this.f522f.get(i2);
            if (iVar.getGroupId() == i && iVar.mo667e(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo607b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f519c = z;
        mo607b(false);
    }

    public int size() {
        return this.f522f.size();
    }
}
