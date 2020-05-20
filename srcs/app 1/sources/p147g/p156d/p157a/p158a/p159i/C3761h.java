package p147g.p156d.p157a.p158a.p159i;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g.d.a.a.i.h */
public abstract class C3761h {

    /* renamed from: g.d.a.a.i.h$a */
    public static abstract class C3762a {
        /* renamed from: a */
        public abstract C3762a mo11906a(long j);

        /* renamed from: a */
        public abstract C3762a mo11907a(C3760g gVar);

        /* renamed from: a */
        public abstract C3762a mo11908a(Integer num);

        /* renamed from: a */
        public abstract C3762a mo11909a(String str);

        /* renamed from: a */
        public final C3762a mo11951a(String str, int i) {
            mo11913b().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public final C3762a mo11952a(String str, long j) {
            mo11913b().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: a */
        public final C3762a mo11953a(String str, String str2) {
            mo11913b().put(str, str2);
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract C3762a mo11910a(Map<String, String> map);

        /* renamed from: a */
        public abstract C3761h mo11911a();

        /* renamed from: b */
        public abstract C3762a mo11912b(long j);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract Map<String, String> mo11913b();
    }

    /* renamed from: i */
    public static C3762a m15347i() {
        C3748b bVar = new C3748b();
        bVar.mo11910a((Map<String, String>) new HashMap<String,String>());
        return bVar;
    }

    /* renamed from: a */
    public final String mo11946a(String str) {
        String str2 = (String) mo11897a().get(str);
        return str2 == null ? "" : str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Map<String, String> mo11897a();

    /* renamed from: b */
    public final int mo11947b(String str) {
        String str2 = (String) mo11897a().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: b */
    public abstract Integer mo11898b();

    /* renamed from: c */
    public final long mo11948c(String str) {
        String str2 = (String) mo11897a().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: c */
    public abstract C3760g mo11899c();

    /* renamed from: d */
    public abstract long mo11900d();

    /* renamed from: e */
    public final Map<String, String> mo11949e() {
        return Collections.unmodifiableMap(mo11897a());
    }

    /* renamed from: f */
    public abstract String mo11902f();

    /* renamed from: g */
    public abstract long mo11903g();

    /* renamed from: h */
    public C3762a mo11950h() {
        C3748b bVar = new C3748b();
        bVar.mo11909a(mo11902f());
        bVar.mo11908a(mo11898b());
        bVar.mo11907a(mo11899c());
        bVar.mo11906a(mo11900d());
        bVar.mo11912b(mo11903g());
        bVar.mo11910a((Map<String, String>) new HashMap<String,String>(mo11897a()));
        return bVar;
    }
}
