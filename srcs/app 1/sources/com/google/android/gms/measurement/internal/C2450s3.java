package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p147g.p156d.p157a.p167b.p173d.p180g.C3907a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4229u;

/* renamed from: com.google.android.gms.measurement.internal.s3 */
public final class C2450s3 extends C3907a implements C2428q3 {
    C2450s3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: a */
    public final List<C2478u9> mo7378a(C2244aa aaVar, boolean z) {
        Parcel t = mo12053t();
        C4229u.m17243a(t, (Parcelable) aaVar);
        C4229u.m17244a(t, z);
        Parcel a = mo12050a(7, t);
        ArrayList createTypedArrayList = a.createTypedArrayList(C2478u9.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<C2388ma> mo7379a(String str, String str2, C2244aa aaVar) {
        Parcel t = mo12053t();
        t.writeString(str);
        t.writeString(str2);
        C4229u.m17243a(t, (Parcelable) aaVar);
        Parcel a = mo12050a(16, t);
        ArrayList createTypedArrayList = a.createTypedArrayList(C2388ma.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<C2388ma> mo7380a(String str, String str2, String str3) {
        Parcel t = mo12053t();
        t.writeString(str);
        t.writeString(str2);
        t.writeString(str3);
        Parcel a = mo12050a(17, t);
        ArrayList createTypedArrayList = a.createTypedArrayList(C2388ma.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<C2478u9> mo7381a(String str, String str2, String str3, boolean z) {
        Parcel t = mo12053t();
        t.writeString(str);
        t.writeString(str2);
        t.writeString(str3);
        C4229u.m17244a(t, z);
        Parcel a = mo12050a(15, t);
        ArrayList createTypedArrayList = a.createTypedArrayList(C2478u9.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<C2478u9> mo7382a(String str, String str2, boolean z, C2244aa aaVar) {
        Parcel t = mo12053t();
        t.writeString(str);
        t.writeString(str2);
        C4229u.m17244a(t, z);
        C4229u.m17243a(t, (Parcelable) aaVar);
        Parcel a = mo12050a(14, t);
        ArrayList createTypedArrayList = a.createTypedArrayList(C2478u9.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final void mo7383a(long j, String str, String str2, String str3) {
        Parcel t = mo12053t();
        t.writeLong(j);
        t.writeString(str);
        t.writeString(str2);
        t.writeString(str3);
        mo12052b(10, t);
    }

    /* renamed from: a */
    public final void mo7384a(C2244aa aaVar) {
        Parcel t = mo12053t();
        C4229u.m17243a(t, (Parcelable) aaVar);
        mo12052b(6, t);
    }

    /* renamed from: a */
    public final void mo7385a(C2388ma maVar) {
        Parcel t = mo12053t();
        C4229u.m17243a(t, (Parcelable) maVar);
        mo12052b(13, t);
    }

    /* renamed from: a */
    public final void mo7386a(C2388ma maVar, C2244aa aaVar) {
        Parcel t = mo12053t();
        C4229u.m17243a(t, (Parcelable) maVar);
        C4229u.m17243a(t, (Parcelable) aaVar);
        mo12052b(12, t);
    }

    /* renamed from: a */
    public final void mo7387a(C2435r rVar, C2244aa aaVar) {
        Parcel t = mo12053t();
        C4229u.m17243a(t, (Parcelable) rVar);
        C4229u.m17243a(t, (Parcelable) aaVar);
        mo12052b(1, t);
    }

    /* renamed from: a */
    public final void mo7388a(C2435r rVar, String str, String str2) {
        Parcel t = mo12053t();
        C4229u.m17243a(t, (Parcelable) rVar);
        t.writeString(str);
        t.writeString(str2);
        mo12052b(5, t);
    }

    /* renamed from: a */
    public final void mo7389a(C2478u9 u9Var, C2244aa aaVar) {
        Parcel t = mo12053t();
        C4229u.m17243a(t, (Parcelable) u9Var);
        C4229u.m17243a(t, (Parcelable) aaVar);
        mo12052b(2, t);
    }

    /* renamed from: a */
    public final byte[] mo7390a(C2435r rVar, String str) {
        Parcel t = mo12053t();
        C4229u.m17243a(t, (Parcelable) rVar);
        t.writeString(str);
        Parcel a = mo12050a(9, t);
        byte[] createByteArray = a.createByteArray();
        a.recycle();
        return createByteArray;
    }

    /* renamed from: b */
    public final String mo7392b(C2244aa aaVar) {
        Parcel t = mo12053t();
        C4229u.m17243a(t, (Parcelable) aaVar);
        Parcel a = mo12050a(11, t);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo7393c(C2244aa aaVar) {
        Parcel t = mo12053t();
        C4229u.m17243a(t, (Parcelable) aaVar);
        mo12052b(18, t);
    }

    /* renamed from: d */
    public final void mo7394d(C2244aa aaVar) {
        Parcel t = mo12053t();
        C4229u.m17243a(t, (Parcelable) aaVar);
        mo12052b(4, t);
    }
}
