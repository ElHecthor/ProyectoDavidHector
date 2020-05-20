package p147g.p156d.p204b.p207y.p208n;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p147g.p156d.p204b.C4485f;
import p147g.p156d.p204b.C4505t;
import p147g.p156d.p204b.C4509v;
import p147g.p156d.p204b.C4511w;
import p147g.p156d.p204b.p205a0.C4470a;
import p147g.p156d.p204b.p205a0.C4472b;
import p147g.p156d.p204b.p205a0.C4473c;
import p147g.p156d.p204b.p211z.C4632a;

/* renamed from: g.d.b.y.n.j */
public final class C4581j extends C4509v<Date> {

    /* renamed from: b */
    public static final C4511w f12030b = new C4582a();

    /* renamed from: a */
    private final DateFormat f12031a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: g.d.b.y.n.j$a */
    static class C4582a implements C4511w {
        C4582a() {
        }

        /* renamed from: a */
        public <T> C4509v<T> mo13393a(C4485f fVar, C4632a<T> aVar) {
            if (aVar.mo13529a() == Date.class) {
                return new C4581j();
            }
            return null;
        }
    }

    /* renamed from: a */
    public synchronized Date m18532a(C4470a aVar) {
        if (aVar.mo13307w() == C4472b.NULL) {
            aVar.mo13305u();
            return null;
        }
        try {
            return new Date(this.f12031a.parse(aVar.mo13306v()).getTime());
        } catch (ParseException e) {
            throw new C4505t((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized void mo13285a(C4473c cVar, Date date) {
        cVar.mo13322e(date == null ? null : this.f12031a.format(date));
    }
}
