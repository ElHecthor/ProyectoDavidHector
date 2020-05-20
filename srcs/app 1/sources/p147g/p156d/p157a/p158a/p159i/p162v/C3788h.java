package p147g.p156d.p157a.p158a.p159i.p162v;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1916a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1922e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1924g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1940s;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3796c;
import p147g.p156d.p157a.p158a.p159i.p165x.C3833a;

/* renamed from: g.d.a.a.i.v.h */
public abstract class C3788h {
    /* renamed from: a */
    static C1940s m15434a(Context context, C3796c cVar, C1924g gVar, C3833a aVar) {
        return VERSION.SDK_INT >= 21 ? new C1922e(context, cVar, gVar) : new C1916a(context, cVar, aVar, gVar);
    }
}
