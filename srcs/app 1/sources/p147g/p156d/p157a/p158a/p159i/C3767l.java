package p147g.p156d.p157a.p158a.p159i;

import android.util.Base64;
import p147g.p156d.p157a.p158a.C3741d;

/* renamed from: g.d.a.a.i.l */
public abstract class C3767l {

    /* renamed from: g.d.a.a.i.l$a */
    public static abstract class C3768a {
        /* renamed from: a */
        public abstract C3768a mo11933a(C3741d dVar);

        /* renamed from: a */
        public abstract C3768a mo11934a(String str);

        /* renamed from: a */
        public abstract C3768a mo11935a(byte[] bArr);

        /* renamed from: a */
        public abstract C3767l mo11936a();
    }

    /* renamed from: d */
    public static C3768a m15386d() {
        C3754b bVar = new C3754b();
        bVar.mo11933a(C3741d.DEFAULT);
        return bVar;
    }

    /* renamed from: a */
    public C3767l mo11955a(C3741d dVar) {
        C3768a d = m15386d();
        d.mo11934a(mo11928a());
        d.mo11933a(dVar);
        d.mo11935a(mo11929b());
        return d.mo11936a();
    }

    /* renamed from: a */
    public abstract String mo11928a();

    /* renamed from: b */
    public abstract byte[] mo11929b();

    /* renamed from: c */
    public abstract C3741d mo11930c();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo11928a();
        objArr[1] = mo11930c();
        objArr[2] = mo11929b() == null ? "" : Base64.encodeToString(mo11929b(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
