package p147g.p156d.p157a.p158a.p159i.p162v;

import com.google.android.datatransport.runtime.backends.C1904e;
import com.google.android.datatransport.runtime.backends.C1915m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1940s;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p147g.p156d.p157a.p158a.C3745h;
import p147g.p156d.p157a.p158a.p159i.C3761h;
import p147g.p156d.p157a.p158a.p159i.C3767l;
import p147g.p156d.p157a.p158a.p159i.C3773q;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3796c;
import p147g.p156d.p157a.p158a.p159i.p164w.C3831b;

/* renamed from: g.d.a.a.i.v.c */
public class C3783c implements C3785e {

    /* renamed from: f */
    private static final Logger f10681f = Logger.getLogger(C3773q.class.getName());

    /* renamed from: a */
    private final C1940s f10682a;

    /* renamed from: b */
    private final Executor f10683b;

    /* renamed from: c */
    private final C1904e f10684c;

    /* renamed from: d */
    private final C3796c f10685d;

    /* renamed from: e */
    private final C3831b f10686e;

    public C3783c(Executor executor, C1904e eVar, C1940s sVar, C3796c cVar, C3831b bVar) {
        this.f10683b = executor;
        this.f10684c = eVar;
        this.f10682a = sVar;
        this.f10685d = cVar;
        this.f10686e = bVar;
    }

    /* renamed from: a */
    static /* synthetic */ Object m15426a(C3783c cVar, C3767l lVar, C3761h hVar) {
        cVar.f10685d.mo11983a(lVar, hVar);
        cVar.f10682a.mo6432a(lVar, 1);
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ void m15427a(C3783c cVar, C3767l lVar, C3745h hVar, C3761h hVar2) {
        try {
            C1915m a = cVar.f10684c.mo6425a(lVar.mo11928a());
            if (a == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{lVar.mo11928a()});
                f10681f.warning(format);
                hVar.mo11896a(new IllegalArgumentException(format));
                return;
            }
            cVar.f10686e.mo11999a(C3782b.m15424a(cVar, lVar, a.mo6402a(hVar2)));
            hVar.mo11896a(null);
        } catch (Exception e) {
            Logger logger = f10681f;
            StringBuilder sb = new StringBuilder();
            sb.append("Error scheduling event ");
            sb.append(e.getMessage());
            logger.warning(sb.toString());
            hVar.mo11896a(e);
        }
    }

    /* renamed from: a */
    public void mo11963a(C3767l lVar, C3761h hVar, C3745h hVar2) {
        this.f10683b.execute(C3781a.m15423a(this, lVar, hVar2, hVar));
    }
}
