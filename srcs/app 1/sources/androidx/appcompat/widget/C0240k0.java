package androidx.appcompat.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.appcompat.widget.k0 */
class C0240k0 {

    /* renamed from: a */
    private int f1037a = 0;

    /* renamed from: b */
    private int f1038b = 0;

    /* renamed from: c */
    private int f1039c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d */
    private int f1040d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e */
    private int f1041e = 0;

    /* renamed from: f */
    private int f1042f = 0;

    /* renamed from: g */
    private boolean f1043g = false;

    /* renamed from: h */
    private boolean f1044h = false;

    C0240k0() {
    }

    /* renamed from: a */
    public int mo1531a() {
        return this.f1043g ? this.f1037a : this.f1038b;
    }

    /* renamed from: a */
    public void mo1532a(int i, int i2) {
        this.f1044h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1041e = i;
            this.f1037a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1042f = i2;
            this.f1038b = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1533a(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1043g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f1043g = r2
            boolean r0 = r1.f1044h
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f1040d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f1041e
        L_0x0016:
            r1.f1037a = r2
            int r2 = r1.f1039c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.f1039c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f1041e
        L_0x0024:
            r1.f1037a = r2
            int r2 = r1.f1040d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f1041e
            r1.f1037a = r2
        L_0x002f:
            int r2 = r1.f1042f
        L_0x0031:
            r1.f1038b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0240k0.mo1533a(boolean):void");
    }

    /* renamed from: b */
    public int mo1534b() {
        return this.f1037a;
    }

    /* renamed from: b */
    public void mo1535b(int i, int i2) {
        this.f1039c = i;
        this.f1040d = i2;
        this.f1044h = true;
        if (this.f1043g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1037a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1038b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1037a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1038b = i2;
        }
    }

    /* renamed from: c */
    public int mo1536c() {
        return this.f1038b;
    }

    /* renamed from: d */
    public int mo1537d() {
        return this.f1043g ? this.f1038b : this.f1037a;
    }
}
