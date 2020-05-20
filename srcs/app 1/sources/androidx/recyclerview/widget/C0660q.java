package androidx.recyclerview.widget;

import java.util.List;

/* renamed from: androidx.recyclerview.widget.q */
class C0660q {

    /* renamed from: a */
    final C0661a f2701a;

    /* renamed from: androidx.recyclerview.widget.q$a */
    interface C0661a {
        /* renamed from: a */
        C0611b mo3790a(int i, int i2, int i3, Object obj);

        /* renamed from: a */
        void mo3792a(C0611b bVar);
    }

    C0660q(C0661a aVar) {
        this.f2701a = aVar;
    }

    /* renamed from: a */
    private void m3726a(List<C0611b> list, int i, int i2) {
        C0611b bVar = (C0611b) list.get(i);
        C0611b bVar2 = (C0611b) list.get(i2);
        int i3 = bVar2.f2513a;
        if (i3 == 1) {
            m3728c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            mo3937a(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            mo3938b(list, i, bVar, i2, bVar2);
        }
    }

    /* renamed from: b */
    private int m3727b(List<C0611b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((C0611b) list.get(size)).f2513a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m3728c(List<C0611b> list, int i, C0611b bVar, int i2, C0611b bVar2) {
        int i3 = bVar.f2516d < bVar2.f2514b ? -1 : 0;
        if (bVar.f2514b < bVar2.f2514b) {
            i3++;
        }
        int i4 = bVar2.f2514b;
        int i5 = bVar.f2514b;
        if (i4 <= i5) {
            bVar.f2514b = i5 + bVar2.f2516d;
        }
        int i6 = bVar2.f2514b;
        int i7 = bVar.f2516d;
        if (i6 <= i7) {
            bVar.f2516d = i7 + bVar2.f2516d;
        }
        bVar2.f2514b += i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3936a(List<C0611b> list) {
        while (true) {
            int b = m3727b(list);
            if (b != -1) {
                m3726a(list, b, b + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009e, code lost:
        if (r0 > r14.f2514b) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c8, code lost:
        if (r0 >= r14.f2514b) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3937a(java.util.List<androidx.recyclerview.widget.C0609a.C0611b> r10, int r11, androidx.recyclerview.widget.C0609a.C0611b r12, int r13, androidx.recyclerview.widget.C0609a.C0611b r14) {
        /*
            r9 = this;
            int r0 = r12.f2514b
            int r1 = r12.f2516d
            r2 = 0
            r3 = 1
            int r4 = r14.f2514b
            if (r0 >= r1) goto L_0x0015
            if (r4 != r0) goto L_0x0013
            int r4 = r14.f2516d
            int r1 = r1 - r0
            if (r4 != r1) goto L_0x0013
            r0 = 0
            goto L_0x001f
        L_0x0013:
            r0 = 0
            goto L_0x0022
        L_0x0015:
            int r5 = r1 + 1
            if (r4 != r5) goto L_0x0021
            int r4 = r14.f2516d
            int r0 = r0 - r1
            if (r4 != r0) goto L_0x0021
            r0 = 1
        L_0x001f:
            r2 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            int r1 = r12.f2516d
            int r4 = r14.f2514b
            r5 = 2
            if (r1 >= r4) goto L_0x002d
            int r4 = r4 - r3
            r14.f2514b = r4
            goto L_0x0046
        L_0x002d:
            int r6 = r14.f2516d
            int r4 = r4 + r6
            if (r1 >= r4) goto L_0x0046
            int r6 = r6 - r3
            r14.f2516d = r6
            r12.f2513a = r5
            r12.f2516d = r3
            int r11 = r14.f2516d
            if (r11 != 0) goto L_0x0045
            r10.remove(r13)
            androidx.recyclerview.widget.q$a r10 = r9.f2701a
            r10.mo3792a(r14)
        L_0x0045:
            return
        L_0x0046:
            int r1 = r12.f2514b
            int r4 = r14.f2514b
            r6 = 0
            if (r1 > r4) goto L_0x0051
            int r4 = r4 + r3
            r14.f2514b = r4
            goto L_0x0067
        L_0x0051:
            int r7 = r14.f2516d
            int r8 = r4 + r7
            if (r1 >= r8) goto L_0x0067
            int r4 = r4 + r7
            int r4 = r4 - r1
            androidx.recyclerview.widget.q$a r7 = r9.f2701a
            int r1 = r1 + r3
            androidx.recyclerview.widget.a$b r6 = r7.mo3790a(r5, r1, r4, r6)
            int r1 = r12.f2514b
            int r3 = r14.f2514b
            int r1 = r1 - r3
            r14.f2516d = r1
        L_0x0067:
            if (r2 == 0) goto L_0x0075
            r10.set(r11, r14)
            r10.remove(r13)
            androidx.recyclerview.widget.q$a r10 = r9.f2701a
            r10.mo3792a(r12)
            return
        L_0x0075:
            if (r0 == 0) goto L_0x00a1
            if (r6 == 0) goto L_0x008f
            int r0 = r12.f2514b
            int r1 = r6.f2514b
            if (r0 <= r1) goto L_0x0084
            int r1 = r6.f2516d
            int r0 = r0 - r1
            r12.f2514b = r0
        L_0x0084:
            int r0 = r12.f2516d
            int r1 = r6.f2514b
            if (r0 <= r1) goto L_0x008f
            int r1 = r6.f2516d
            int r0 = r0 - r1
            r12.f2516d = r0
        L_0x008f:
            int r0 = r12.f2514b
            int r1 = r14.f2514b
            if (r0 <= r1) goto L_0x009a
            int r1 = r14.f2516d
            int r0 = r0 - r1
            r12.f2514b = r0
        L_0x009a:
            int r0 = r12.f2516d
            int r1 = r14.f2514b
            if (r0 <= r1) goto L_0x00cf
            goto L_0x00ca
        L_0x00a1:
            if (r6 == 0) goto L_0x00b9
            int r0 = r12.f2514b
            int r1 = r6.f2514b
            if (r0 < r1) goto L_0x00ae
            int r1 = r6.f2516d
            int r0 = r0 - r1
            r12.f2514b = r0
        L_0x00ae:
            int r0 = r12.f2516d
            int r1 = r6.f2514b
            if (r0 < r1) goto L_0x00b9
            int r1 = r6.f2516d
            int r0 = r0 - r1
            r12.f2516d = r0
        L_0x00b9:
            int r0 = r12.f2514b
            int r1 = r14.f2514b
            if (r0 < r1) goto L_0x00c4
            int r1 = r14.f2516d
            int r0 = r0 - r1
            r12.f2514b = r0
        L_0x00c4:
            int r0 = r12.f2516d
            int r1 = r14.f2514b
            if (r0 < r1) goto L_0x00cf
        L_0x00ca:
            int r1 = r14.f2516d
            int r0 = r0 - r1
            r12.f2516d = r0
        L_0x00cf:
            r10.set(r11, r14)
            int r14 = r12.f2514b
            int r0 = r12.f2516d
            if (r14 == r0) goto L_0x00dc
            r10.set(r13, r12)
            goto L_0x00df
        L_0x00dc:
            r10.remove(r13)
        L_0x00df:
            if (r6 == 0) goto L_0x00e4
            r10.add(r11, r6)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0660q.mo3937a(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3938b(java.util.List<androidx.recyclerview.widget.C0609a.C0611b> r9, int r10, androidx.recyclerview.widget.C0609a.C0611b r11, int r12, androidx.recyclerview.widget.C0609a.C0611b r13) {
        /*
            r8 = this;
            int r0 = r11.f2516d
            int r1 = r13.f2514b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r4
            r13.f2514b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f2516d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r4
            r13.f2516d = r5
            androidx.recyclerview.widget.q$a r0 = r8.f2701a
            int r1 = r11.f2514b
            java.lang.Object r5 = r13.f2515c
            androidx.recyclerview.widget.a$b r0 = r0.mo3790a(r2, r1, r4, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            int r1 = r11.f2514b
            int r5 = r13.f2514b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r4
            r13.f2514b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f2516d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.q$a r3 = r8.f2701a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f2515c
            androidx.recyclerview.widget.a$b r3 = r3.mo3790a(r2, r1, r5, r4)
            int r1 = r13.f2516d
            int r1 = r1 - r5
            r13.f2516d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f2516d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.q$a r11 = r8.f2701a
            r11.mo3792a(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            r9.add(r10, r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0660q.mo3938b(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
