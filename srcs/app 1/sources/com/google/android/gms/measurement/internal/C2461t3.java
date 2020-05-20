package com.google.android.gms.measurement.internal;

import p147g.p156d.p157a.p167b.p173d.p180g.C4075k1;

/* renamed from: com.google.android.gms.measurement.internal.t3 */
public abstract class C2461t3 extends C4075k1 implements C2428q3 {
    public C2461t3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00dc, code lost:
        r9.writeNoException();
        r9.writeTypedList(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0136, code lost:
        r9.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x013a, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7623a(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            r6 = this;
            switch(r7) {
                case 1: goto L_0x0123;
                case 2: goto L_0x010f;
                case 3: goto L_0x0003;
                case 4: goto L_0x0103;
                case 5: goto L_0x00ef;
                case 6: goto L_0x00e3;
                case 7: goto L_0x00cc;
                case 8: goto L_0x0003;
                case 9: goto L_0x00b5;
                case 10: goto L_0x009f;
                case 11: goto L_0x008b;
                case 12: goto L_0x0076;
                case 13: goto L_0x0069;
                case 14: goto L_0x0050;
                case 15: goto L_0x003a;
                case 16: goto L_0x0024;
                case 17: goto L_0x0012;
                case 18: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r7 = 0
            return r7
        L_0x0005:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.aa> r7 = com.google.android.gms.measurement.internal.C2244aa.CREATOR
            android.os.Parcelable r7 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17241a(r8, r7)
            com.google.android.gms.measurement.internal.aa r7 = (com.google.android.gms.measurement.internal.C2244aa) r7
            r6.mo7393c(r7)
            goto L_0x0136
        L_0x0012:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            java.lang.String r8 = r8.readString()
            java.util.List r7 = r6.mo7380a(r7, r10, r8)
            goto L_0x00dc
        L_0x0024:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.aa> r0 = com.google.android.gms.measurement.internal.C2244aa.CREATOR
            android.os.Parcelable r8 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17241a(r8, r0)
            com.google.android.gms.measurement.internal.aa r8 = (com.google.android.gms.measurement.internal.C2244aa) r8
            java.util.List r7 = r6.mo7379a(r7, r10, r8)
            goto L_0x00dc
        L_0x003a:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            java.lang.String r0 = r8.readString()
            boolean r8 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17245a(r8)
            java.util.List r7 = r6.mo7381a(r7, r10, r0, r8)
            goto L_0x00dc
        L_0x0050:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            boolean r0 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17245a(r8)
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.aa> r1 = com.google.android.gms.measurement.internal.C2244aa.CREATOR
            android.os.Parcelable r8 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17241a(r8, r1)
            com.google.android.gms.measurement.internal.aa r8 = (com.google.android.gms.measurement.internal.C2244aa) r8
            java.util.List r7 = r6.mo7382a(r7, r10, r0, r8)
            goto L_0x00dc
        L_0x0069:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.ma> r7 = com.google.android.gms.measurement.internal.C2388ma.CREATOR
            android.os.Parcelable r7 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17241a(r8, r7)
            com.google.android.gms.measurement.internal.ma r7 = (com.google.android.gms.measurement.internal.C2388ma) r7
            r6.mo7385a(r7)
            goto L_0x0136
        L_0x0076:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.ma> r7 = com.google.android.gms.measurement.internal.C2388ma.CREATOR
            android.os.Parcelable r7 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17241a(r8, r7)
            com.google.android.gms.measurement.internal.ma r7 = (com.google.android.gms.measurement.internal.C2388ma) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.aa> r10 = com.google.android.gms.measurement.internal.C2244aa.CREATOR
            android.os.Parcelable r8 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17241a(r8, r10)
            com.google.android.gms.measurement.internal.aa r8 = (com.google.android.gms.measurement.internal.C2244aa) r8
            r6.mo7386a(r7, r8)
            goto L_0x0136
        L_0x008b:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.aa> r7 = com.google.android.gms.measurement.internal.C2244aa.CREATOR
            android.os.Parcelable r7 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17241a(r8, r7)
            com.google.android.gms.measurement.internal.aa r7 = (com.google.android.gms.measurement.internal.C2244aa) r7
            java.lang.String r7 = r6.mo7392b(r7)
            r9.writeNoException()
            r9.writeString(r7)
            goto L_0x0139
        L_0x009f:
            long r1 = r8.readLong()
            java.lang.String r3 = r8.readString()
            java.lang.String r4 = r8.readString()
            java.lang.String r5 = r8.readString()
            r0 = r6
            r0.mo7383a(r1, r3, r4, r5)
            goto L_0x0136
        L_0x00b5:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.r> r7 = com.google.android.gms.measurement.internal.C2435r.CREATOR
            android.os.Parcelable r7 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17241a(r8, r7)
            com.google.android.gms.measurement.internal.r r7 = (com.google.android.gms.measurement.internal.C2435r) r7
            java.lang.String r8 = r8.readString()
            byte[] r7 = r6.mo7390a(r7, r8)
            r9.writeNoException()
            r9.writeByteArray(r7)
            goto L_0x0139
        L_0x00cc:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.aa> r7 = com.google.android.gms.measurement.internal.C2244aa.CREATOR
            android.os.Parcelable r7 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17241a(r8, r7)
            com.google.android.gms.measurement.internal.aa r7 = (com.google.android.gms.measurement.internal.C2244aa) r7
            boolean r8 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17245a(r8)
            java.util.List r7 = r6.mo7378a(r7, r8)
        L_0x00dc:
            r9.writeNoException()
            r9.writeTypedList(r7)
            goto L_0x0139
        L_0x00e3:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.aa> r7 = com.google.android.gms.measurement.internal.C2244aa.CREATOR
            android.os.Parcelable r7 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17241a(r8, r7)
            com.google.android.gms.measurement.internal.aa r7 = (com.google.android.gms.measurement.internal.C2244aa) r7
            r6.mo7384a(r7)
            goto L_0x0136
        L_0x00ef:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.r> r7 = com.google.android.gms.measurement.internal.C2435r.CREATOR
            android.os.Parcelable r7 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17241a(r8, r7)
            com.google.android.gms.measurement.internal.r r7 = (com.google.android.gms.measurement.internal.C2435r) r7
            java.lang.String r10 = r8.readString()
            java.lang.String r8 = r8.readString()
            r6.mo7388a(r7, r10, r8)
            goto L_0x0136
        L_0x0103:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.aa> r7 = com.google.android.gms.measurement.internal.C2244aa.CREATOR
            android.os.Parcelable r7 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17241a(r8, r7)
            com.google.android.gms.measurement.internal.aa r7 = (com.google.android.gms.measurement.internal.C2244aa) r7
            r6.mo7394d(r7)
            goto L_0x0136
        L_0x010f:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.u9> r7 = com.google.android.gms.measurement.internal.C2478u9.CREATOR
            android.os.Parcelable r7 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17241a(r8, r7)
            com.google.android.gms.measurement.internal.u9 r7 = (com.google.android.gms.measurement.internal.C2478u9) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.aa> r10 = com.google.android.gms.measurement.internal.C2244aa.CREATOR
            android.os.Parcelable r8 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17241a(r8, r10)
            com.google.android.gms.measurement.internal.aa r8 = (com.google.android.gms.measurement.internal.C2244aa) r8
            r6.mo7389a(r7, r8)
            goto L_0x0136
        L_0x0123:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.r> r7 = com.google.android.gms.measurement.internal.C2435r.CREATOR
            android.os.Parcelable r7 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17241a(r8, r7)
            com.google.android.gms.measurement.internal.r r7 = (com.google.android.gms.measurement.internal.C2435r) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.aa> r10 = com.google.android.gms.measurement.internal.C2244aa.CREATOR
            android.os.Parcelable r8 = p147g.p156d.p157a.p167b.p173d.p180g.C4229u.m17241a(r8, r10)
            com.google.android.gms.measurement.internal.aa r8 = (com.google.android.gms.measurement.internal.C2244aa) r8
            r6.mo7387a(r7, r8)
        L_0x0136:
            r9.writeNoException()
        L_0x0139:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2461t3.mo7623a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
