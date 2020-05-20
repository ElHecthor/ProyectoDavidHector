package com.google.firebase;

import android.content.Context;
import com.google.firebase.p061h.C2924a;

/* renamed from: com.google.firebase.b */
final /* synthetic */ class C2868b implements C2924a {

    /* renamed from: a */
    private final FirebaseApp f8334a;

    /* renamed from: b */
    private final Context f8335b;

    private C2868b(FirebaseApp firebaseApp, Context context) {
        this.f8334a = firebaseApp;
        this.f8335b = context;
    }

    /* renamed from: a */
    public static C2924a m11908a(FirebaseApp firebaseApp, Context context) {
        return new C2868b(firebaseApp, context);
    }

    public Object get() {
        return FirebaseApp.m11854a(this.f8334a, this.f8335b);
    }
}
