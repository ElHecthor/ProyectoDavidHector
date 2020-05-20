package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;

/* renamed from: com.google.android.material.datepicker.m */
class C2648m extends BaseAdapter {

    /* renamed from: j */
    static final int f7646j = C2656r.m10961d().getMaximum(4);

    /* renamed from: f */
    final C2646l f7647f;

    /* renamed from: g */
    final C2620d<?> f7648g;

    /* renamed from: h */
    C2619c f7649h;

    /* renamed from: i */
    final C2614a f7650i;

    C2648m(C2646l lVar, C2620d<?> dVar, C2614a aVar) {
        this.f7647f = lVar;
        this.f7648g = dVar;
        this.f7650i = aVar;
    }

    /* renamed from: a */
    private void m10925a(Context context) {
        if (this.f7649h == null) {
            this.f7649h = new C2619c(context);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo8669a() {
        return this.f7647f.mo8662f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo8670a(int i) {
        return mo8669a() + (i - 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo8671b() {
        return (this.f7647f.mo8662f() + this.f7647f.f7644k) - 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo8672b(int i) {
        return i % this.f7647f.f7643j == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo8673c(int i) {
        return (i + 1) % this.f7647f.f7643j == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo8674d(int i) {
        return (i - this.f7647f.mo8662f()) + 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo8675e(int i) {
        return i >= mo8669a() && i <= mo8671b();
    }

    public int getCount() {
        return this.f7647f.f7644k + mo8669a();
    }

    public Long getItem(int i) {
        if (i < this.f7647f.mo8662f() || i > mo8671b()) {
            return null;
        }
        return Long.valueOf(this.f7647f.mo8656a(mo8674d(i)));
    }

    public long getItemId(int i) {
        return (long) (i / this.f7647f.f7643j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m10925a(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p147g.p156d.p157a.p185c.C4412h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.mo8669a()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L_0x005e
            com.google.android.material.datepicker.l r2 = r5.f7647f
            int r3 = r2.f7644k
            if (r7 < r3) goto L_0x002e
            goto L_0x005e
        L_0x002e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.l r2 = r5.f7647f
            long r2 = r2.mo8656a(r7)
            com.google.android.material.datepicker.l r7 = r5.f7647f
            int r7 = r7.f7642i
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.C2646l.m10917i()
            int r4 = r4.f7642i
            if (r7 != r4) goto L_0x0050
            java.lang.String r7 = com.google.android.material.datepicker.C2621e.m10844a(r2)
            goto L_0x0054
        L_0x0050:
            java.lang.String r7 = com.google.android.material.datepicker.C2621e.m10846b(r2)
        L_0x0054:
            r0.setContentDescription(r7)
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L_0x0066
        L_0x005e:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x0066:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x006d
            return r0
        L_0x006d:
            com.google.android.material.datepicker.a r7 = r5.f7650i
            com.google.android.material.datepicker.a$c r7 = r7.mo8600a()
            long r2 = r6.longValue()
            boolean r7 = r7.mo8614d(r2)
            if (r7 == 0) goto L_0x00cc
            r0.setEnabled(r8)
            com.google.android.material.datepicker.d<?> r7 = r5.f7648g
            java.util.Collection r7 = r7.mo8624p()
            java.util.Iterator r7 = r7.iterator()
        L_0x008a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b2
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.C2656r.m10948a(r3)
            long r1 = com.google.android.material.datepicker.C2656r.m10948a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x008a
            com.google.android.material.datepicker.c r6 = r5.f7649h
            com.google.android.material.datepicker.b r6 = r6.f7567b
        L_0x00ae:
            r6.mo8616a(r0)
            return r0
        L_0x00b2:
            java.util.Calendar r7 = com.google.android.material.datepicker.C2656r.m10956b()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x00c7
            com.google.android.material.datepicker.c r6 = r5.f7649h
            com.google.android.material.datepicker.b r6 = r6.f7568c
            goto L_0x00ae
        L_0x00c7:
            com.google.android.material.datepicker.c r6 = r5.f7649h
            com.google.android.material.datepicker.b r6 = r6.f7566a
            goto L_0x00ae
        L_0x00cc:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.c r6 = r5.f7649h
            com.google.android.material.datepicker.b r6 = r6.f7572g
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C2648m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public boolean hasStableIds() {
        return true;
    }
}
