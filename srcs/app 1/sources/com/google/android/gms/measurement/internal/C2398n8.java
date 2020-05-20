package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.n8 */
final class C2398n8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ ComponentName f6724f;

    /* renamed from: g */
    private final /* synthetic */ C2374l8 f6725g;

    C2398n8(C2374l8 l8Var, ComponentName componentName) {
        this.f6725g = l8Var;
        this.f6724f = componentName;
    }

    public final void run() {
        this.f6725g.f6651c.m9933a(this.f6724f);
    }
}
