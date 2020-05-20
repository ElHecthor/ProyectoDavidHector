package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import p147g.p156d.p157a.p158a.p159i.p165x.C3833a;

/* renamed from: com.google.android.datatransport.runtime.backends.c */
final class C1902c extends C1909h {

    /* renamed from: a */
    private final Context f5623a;

    /* renamed from: b */
    private final C3833a f5624b;

    /* renamed from: c */
    private final C3833a f5625c;

    /* renamed from: d */
    private final String f5626d;

    C1902c(Context context, C3833a aVar, C3833a aVar2, String str) {
        if (context != null) {
            this.f5623a = context;
            if (aVar != null) {
                this.f5624b = aVar;
                if (aVar2 != null) {
                    this.f5625c = aVar2;
                    if (str != null) {
                        this.f5626d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    /* renamed from: a */
    public Context mo6418a() {
        return this.f5623a;
    }

    /* renamed from: b */
    public String mo6419b() {
        return this.f5626d;
    }

    /* renamed from: c */
    public C3833a mo6420c() {
        return this.f5625c;
    }

    /* renamed from: d */
    public C3833a mo6421d() {
        return this.f5624b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1909h)) {
            return false;
        }
        C1909h hVar = (C1909h) obj;
        if (!this.f5623a.equals(hVar.mo6418a()) || !this.f5624b.equals(hVar.mo6421d()) || !this.f5625c.equals(hVar.mo6420c()) || !this.f5626d.equals(hVar.mo6419b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((this.f5623a.hashCode() ^ 1000003) * 1000003) ^ this.f5624b.hashCode()) * 1000003) ^ this.f5625c.hashCode()) * 1000003) ^ this.f5626d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreationContext{applicationContext=");
        sb.append(this.f5623a);
        sb.append(", wallClock=");
        sb.append(this.f5624b);
        sb.append(", monotonicClock=");
        sb.append(this.f5625c);
        sb.append(", backendName=");
        sb.append(this.f5626d);
        sb.append("}");
        return sb.toString();
    }
}
