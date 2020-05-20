package p147g.p156d.p204b.p207y.p208n;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p147g.p156d.p204b.C4485f;
import p147g.p156d.p204b.C4505t;
import p147g.p156d.p204b.C4509v;
import p147g.p156d.p204b.C4511w;
import p147g.p156d.p204b.p205a0.C4470a;
import p147g.p156d.p204b.p205a0.C4472b;
import p147g.p156d.p204b.p205a0.C4473c;
import p147g.p156d.p204b.p207y.C4539e;
import p147g.p156d.p204b.p207y.C4551j;
import p147g.p156d.p204b.p207y.p208n.p209o.C4628a;
import p147g.p156d.p204b.p211z.C4632a;

/* renamed from: g.d.b.y.n.c */
public final class C4565c extends C4509v<Date> {

    /* renamed from: b */
    public static final C4511w f11992b = new C4566a();

    /* renamed from: a */
    private final List<DateFormat> f11993a;

    /* renamed from: g.d.b.y.n.c$a */
    static class C4566a implements C4511w {
        C4566a() {
        }

        /* renamed from: a */
        public <T> C4509v<T> mo13393a(C4485f fVar, C4632a<T> aVar) {
            if (aVar.mo13529a() == Date.class) {
                return new C4565c();
            }
            return null;
        }
    }

    public C4565c() {
        ArrayList arrayList = new ArrayList();
        this.f11993a = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f11993a.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C4539e.m18424c()) {
            this.f11993a.add(C4551j.m18442a(2, 2));
        }
    }

    /* renamed from: a */
    private synchronized Date m18465a(String str) {
        for (DateFormat parse : this.f11993a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C4628a.m18681a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new C4505t(str, e);
        }
    }

    /* renamed from: a */
    public Date m18467a(C4470a aVar) {
        if (aVar.mo13307w() != C4472b.NULL) {
            return m18465a(aVar.mo13306v());
        }
        aVar.mo13305u();
        return null;
    }

    /* renamed from: a */
    public synchronized void mo13285a(C4473c cVar, Date date) {
        if (date == null) {
            cVar.mo13329m();
        } else {
            cVar.mo13322e(((DateFormat) this.f11993a.get(0)).format(date));
        }
    }
}
