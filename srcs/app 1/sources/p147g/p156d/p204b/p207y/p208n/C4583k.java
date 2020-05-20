package p147g.p156d.p204b.p207y.p208n;

import java.sql.Time;
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

/* renamed from: g.d.b.y.n.k */
public final class C4583k extends C4509v<Time> {

    /* renamed from: b */
    public static final C4511w f12032b = new C4584a();

    /* renamed from: a */
    private final DateFormat f12033a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: g.d.b.y.n.k$a */
    static class C4584a implements C4511w {
        C4584a() {
        }

        /* renamed from: a */
        public <T> C4509v<T> mo13393a(C4485f fVar, C4632a<T> aVar) {
            if (aVar.mo13529a() == Time.class) {
                return new C4583k();
            }
            return null;
        }
    }

    /* renamed from: a */
    public synchronized Time m18537a(C4470a aVar) {
        if (aVar.mo13307w() == C4472b.NULL) {
            aVar.mo13305u();
            return null;
        }
        try {
            return new Time(this.f12033a.parse(aVar.mo13306v()).getTime());
        } catch (ParseException e) {
            throw new C4505t((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized void mo13285a(C4473c cVar, Time time) {
        cVar.mo13322e(time == null ? null : this.f12033a.format(time));
    }
}
