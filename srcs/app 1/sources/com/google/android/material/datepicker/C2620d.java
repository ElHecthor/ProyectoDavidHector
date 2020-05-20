package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import p071f.p097h.p107l.C3317d;

/* renamed from: com.google.android.material.datepicker.d */
public interface C2620d<S> extends Parcelable {
    /* renamed from: a */
    View mo8618a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, C2614a aVar, C2652o<S> oVar);

    /* renamed from: a */
    String mo8619a(Context context);

    /* renamed from: b */
    int mo8620b(Context context);

    /* renamed from: g */
    void mo8621g(long j);

    /* renamed from: l */
    Collection<C3317d<Long, Long>> mo8622l();

    /* renamed from: o */
    boolean mo8623o();

    /* renamed from: p */
    Collection<Long> mo8624p();

    /* renamed from: q */
    S mo8625q();
}
