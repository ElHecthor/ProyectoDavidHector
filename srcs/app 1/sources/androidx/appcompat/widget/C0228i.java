package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0371a;
import androidx.core.widget.C0385c;

/* renamed from: androidx.appcompat.widget.i */
class C0228i {

    /* renamed from: a */
    private final CompoundButton f1008a;

    /* renamed from: b */
    private ColorStateList f1009b = null;

    /* renamed from: c */
    private Mode f1010c = null;

    /* renamed from: d */
    private boolean f1011d = false;

    /* renamed from: e */
    private boolean f1012e = false;

    /* renamed from: f */
    private boolean f1013f;

    C0228i(CompoundButton compoundButton) {
        this.f1008a = compoundButton;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1450a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C0385c.m2006a(this.f1008a);
        return a != null ? i + a.getIntrinsicWidth() : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1451a() {
        Drawable a = C0385c.m2006a(this.f1008a);
        if (a == null) {
            return;
        }
        if (this.f1011d || this.f1012e) {
            Drawable mutate = C0371a.m1913i(a).mutate();
            if (this.f1011d) {
                C0371a.m1898a(mutate, this.f1009b);
            }
            if (this.f1012e) {
                C0371a.m1901a(mutate, this.f1010c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1008a.getDrawableState());
            }
            this.f1008a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1452a(ColorStateList colorStateList) {
        this.f1009b = colorStateList;
        this.f1011d = true;
        mo1451a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1453a(Mode mode) {
        this.f1010c = mode;
        this.f1012e = true;
        mo1451a();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[SYNTHETIC, Splitter:B:12:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[Catch:{ all -> 0x0080 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1454a(android.util.AttributeSet r4, int r5) {
        /*
            r3 = this;
            android.widget.CompoundButton r0 = r3.f1008a
            android.content.Context r0 = r0.getContext()
            int[] r1 = p071f.p072a.C3102j.CompoundButton
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = p071f.p072a.C3102j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            int r5 = p071f.p072a.C3102j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            android.widget.CompoundButton r0 = r3.f1008a     // Catch:{ NotFoundException -> 0x002e }
            android.widget.CompoundButton r1 = r3.f1008a     // Catch:{ NotFoundException -> 0x002e }
            android.content.Context r1 = r1.getContext()     // Catch:{ NotFoundException -> 0x002e }
            android.graphics.drawable.Drawable r5 = p071f.p072a.p073k.p074a.C3103a.m12557c(r1, r5)     // Catch:{ NotFoundException -> 0x002e }
            r0.setButtonDrawable(r5)     // Catch:{ NotFoundException -> 0x002e }
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r5 != 0) goto L_0x0050
            int r5 = p071f.p072a.C3102j.CompoundButton_android_button     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            int r5 = p071f.p072a.C3102j.CompoundButton_android_button     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            android.widget.CompoundButton r0 = r3.f1008a     // Catch:{ all -> 0x0080 }
            android.widget.CompoundButton r1 = r3.f1008a     // Catch:{ all -> 0x0080 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0080 }
            android.graphics.drawable.Drawable r5 = p071f.p072a.p073k.p074a.C3103a.m12557c(r1, r5)     // Catch:{ all -> 0x0080 }
            r0.setButtonDrawable(r5)     // Catch:{ all -> 0x0080 }
        L_0x0050:
            int r5 = p071f.p072a.C3102j.CompoundButton_buttonTint     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0063
            android.widget.CompoundButton r5 = r3.f1008a     // Catch:{ all -> 0x0080 }
            int r0 = p071f.p072a.C3102j.CompoundButton_buttonTint     // Catch:{ all -> 0x0080 }
            android.content.res.ColorStateList r0 = r4.getColorStateList(r0)     // Catch:{ all -> 0x0080 }
            androidx.core.widget.C0385c.m2007a(r5, r0)     // Catch:{ all -> 0x0080 }
        L_0x0063:
            int r5 = p071f.p072a.C3102j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x007c
            android.widget.CompoundButton r5 = r3.f1008a     // Catch:{ all -> 0x0080 }
            int r0 = p071f.p072a.C3102j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0080 }
            r1 = -1
            int r0 = r4.getInt(r0, r1)     // Catch:{ all -> 0x0080 }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0189a0.m975a(r0, r1)     // Catch:{ all -> 0x0080 }
            androidx.core.widget.C0385c.m2008a(r5, r0)     // Catch:{ all -> 0x0080 }
        L_0x007c:
            r4.recycle()
            return
        L_0x0080:
            r5 = move-exception
            r4.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0228i.mo1454a(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo1455b() {
        return this.f1009b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo1456c() {
        return this.f1010c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1457d() {
        if (this.f1013f) {
            this.f1013f = false;
            return;
        }
        this.f1013f = true;
        mo1451a();
    }
}
