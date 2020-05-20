package com.google.android.gms.common.p051p;

import android.content.Context;

/* renamed from: com.google.android.gms.common.p.c */
public class C2175c {

    /* renamed from: b */
    private static C2175c f6136b = new C2175c();

    /* renamed from: a */
    private C2174b f6137a = null;

    /* renamed from: a */
    public static C2174b m8939a(Context context) {
        return f6136b.m8940b(context);
    }

    /* renamed from: b */
    private final synchronized C2174b m8940b(Context context) {
        if (this.f6137a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f6137a = new C2174b(context);
        }
        return this.f6137a;
    }
}
