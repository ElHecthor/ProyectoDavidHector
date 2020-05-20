package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1924g.C1926b;
import java.util.Map;
import p147g.p156d.p157a.p158a.C3741d;
import p147g.p156d.p157a.p158a.p159i.p165x.C3833a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c */
final class C1918c extends C1924g {

    /* renamed from: a */
    private final C3833a f5650a;

    /* renamed from: b */
    private final Map<C3741d, C1926b> f5651b;

    C1918c(C3833a aVar, Map<C3741d, C1926b> map) {
        if (aVar != null) {
            this.f5650a = aVar;
            if (map != null) {
                this.f5651b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3833a mo6435a() {
        return this.f5650a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Map<C3741d, C1926b> mo6436b() {
        return this.f5651b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1924g)) {
            return false;
        }
        C1924g gVar = (C1924g) obj;
        if (!this.f5650a.equals(gVar.mo6435a()) || !this.f5651b.equals(gVar.mo6436b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f5650a.hashCode() ^ 1000003) * 1000003) ^ this.f5651b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SchedulerConfig{clock=");
        sb.append(this.f5650a);
        sb.append(", values=");
        sb.append(this.f5651b);
        sb.append("}");
        return sb.toString();
    }
}
