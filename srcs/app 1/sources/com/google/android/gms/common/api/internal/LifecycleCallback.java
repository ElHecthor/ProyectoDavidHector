package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {

    /* renamed from: f */
    protected final C2034i f5838f;

    protected LifecycleCallback(C2034i iVar) {
        this.f5838f = iVar;
    }

    /* renamed from: a */
    public static C2034i m8384a(Activity activity) {
        return m8385a(new C2032h(activity));
    }

    /* renamed from: a */
    protected static C2034i m8385a(C2032h hVar) {
        if (hVar.mo6720c()) {
            return C2020c1.m8408a(hVar.mo6719b());
        }
        if (hVar.mo6721d()) {
            return C2069z0.m8586a(hVar.mo6718a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static C2034i getChimeraLifecycleFragmentImpl(C2032h hVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public Activity mo6641a() {
        return this.f5838f.mo6673d();
    }

    /* renamed from: a */
    public void mo6642a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo6643a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo6644a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public void mo6645b() {
    }

    /* renamed from: b */
    public void mo6646b(Bundle bundle) {
    }

    /* renamed from: c */
    public void mo6647c() {
    }

    /* renamed from: d */
    public void mo6648d() {
    }

    /* renamed from: e */
    public void mo6649e() {
    }
}
