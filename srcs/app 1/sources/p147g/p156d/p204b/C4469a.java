package p147g.p156d.p204b;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p147g.p156d.p204b.p205a0.C4470a;
import p147g.p156d.p204b.p205a0.C4472b;
import p147g.p156d.p204b.p205a0.C4473c;
import p147g.p156d.p204b.p207y.C4539e;
import p147g.p156d.p204b.p207y.C4551j;
import p147g.p156d.p204b.p207y.p208n.p209o.C4628a;

/* renamed from: g.d.b.a */
final class C4469a extends C4509v<Date> {

    /* renamed from: a */
    private final Class<? extends Date> f11835a;

    /* renamed from: b */
    private final List<DateFormat> f11836b = new ArrayList();

    public C4469a(Class<? extends Date> cls, int i, int i2) {
        m18202a(cls);
        this.f11835a = cls;
        this.f11836b.add(DateFormat.getDateTimeInstance(i, i2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f11836b.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C4539e.m18424c()) {
            this.f11836b.add(C4551j.m18442a(i, i2));
        }
    }

    C4469a(Class<? extends Date> cls, String str) {
        m18202a(cls);
        this.f11835a = cls;
        this.f11836b.add(new SimpleDateFormat(str, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f11836b.add(new SimpleDateFormat(str));
        }
    }

    /* renamed from: a */
    private static Class<? extends Date> m18202a(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Date type must be one of ");
        sb.append(Date.class);
        sb.append(", ");
        sb.append(Timestamp.class);
        sb.append(", or ");
        sb.append(java.sql.Date.class);
        sb.append(" but was ");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private Date m18203a(String str) {
        synchronized (this.f11836b) {
            for (DateFormat parse : this.f11836b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date a = C4628a.m18681a(str, new ParsePosition(0));
                return a;
            } catch (ParseException e) {
                throw new C4505t(str, e);
            }
        }
    }

    /* renamed from: a */
    public Date m18205a(C4470a aVar) {
        if (aVar.mo13307w() == C4472b.NULL) {
            aVar.mo13305u();
            return null;
        }
        Date a = m18203a(aVar.mo13306v());
        Class<? extends Date> cls = this.f11835a;
        if (cls == Date.class) {
            return a;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(a.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(a.getTime());
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void mo13285a(C4473c cVar, Date date) {
        if (date == null) {
            cVar.mo13329m();
            return;
        }
        synchronized (this.f11836b) {
            cVar.mo13322e(((DateFormat) this.f11836b.get(0)).format(date));
        }
    }

    public String toString() {
        StringBuilder sb;
        String simpleName;
        DateFormat dateFormat = (DateFormat) this.f11836b.get(0);
        String str = "DefaultDateTypeAdapter(";
        if (dateFormat instanceof SimpleDateFormat) {
            sb = new StringBuilder();
            sb.append(str);
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = new StringBuilder();
            sb.append(str);
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb.append(simpleName);
        sb.append(')');
        return sb.toString();
    }
}
