package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C2082d;
import com.google.android.gms.common.api.C1981a.C1985d;
import com.google.android.gms.common.api.C2001f.C2002a;
import com.google.android.gms.common.api.C2001f.C2003b;
import com.google.android.gms.common.internal.C2095c.C2098c;
import com.google.android.gms.common.internal.C2095c.C2100e;
import com.google.android.gms.common.internal.C2109d;
import com.google.android.gms.common.internal.C2128l;
import com.google.android.gms.common.internal.C2148s;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
public final class C1981a<O extends C1985d> {

    /* renamed from: a */
    private final C1982a<?, O> f5805a;

    /* renamed from: b */
    private final C1993g<?> f5806b;

    /* renamed from: c */
    private final String f5807c;

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class C1982a<T extends C1992f, O> extends C1991e<T, O> {
        @Deprecated
        /* renamed from: a */
        public T mo6594a(Context context, Looper looper, C2109d dVar, O o, C2002a aVar, C2003b bVar) {
            throw null;
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface C1983b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C1984c<C extends C1983b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface C1985d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface C1986a extends C1988c, C1989d {
            /* renamed from: i */
            Account mo6595i();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface C1987b extends C1988c {
            /* renamed from: d */
            GoogleSignInAccount mo6596d();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        public interface C1988c extends C1985d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d */
        public interface C1989d extends C1985d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$e */
        public interface C1990e extends C1988c, C1989d {
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class C1991e<T extends C1983b, O> {
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface C1992f extends C1983b {
        /* renamed from: a */
        void mo6597a(C2098c cVar);

        /* renamed from: a */
        void mo6598a(C2100e eVar);

        /* renamed from: a */
        void mo6599a(C2128l lVar, Set<Scope> set);

        /* renamed from: a */
        boolean mo6600a();

        /* renamed from: b */
        Set<Scope> mo6601b();

        /* renamed from: d */
        boolean mo6602d();

        /* renamed from: e */
        int mo6556e();

        /* renamed from: f */
        boolean mo6603f();

        /* renamed from: g */
        C2082d[] mo6604g();

        /* renamed from: h */
        String mo6605h();

        /* renamed from: i */
        void mo6606i();

        /* renamed from: k */
        boolean mo6607k();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C1993g<C extends C1992f> extends C1984c<C> {
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    public interface C1994h<T extends IInterface> extends C1983b {
        /* renamed from: a */
        T mo6608a(IBinder iBinder);

        /* renamed from: a */
        void mo6609a(int i, T t);

        /* renamed from: c */
        String mo6610c();

        /* renamed from: l */
        String mo6611l();
    }

    public <C extends C1992f> C1981a(String str, C1982a<C, O> aVar, C1993g<C> gVar) {
        C2148s.m8835a(aVar, (Object) "Cannot construct an Api with a null ClientBuilder");
        C2148s.m8835a(gVar, (Object) "Cannot construct an Api with a null ClientKey");
        this.f5807c = str;
        this.f5805a = aVar;
        this.f5806b = gVar;
    }

    /* renamed from: a */
    public final C1984c<?> mo6591a() {
        C1993g<?> gVar = this.f5806b;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: b */
    public final String mo6592b() {
        return this.f5807c;
    }

    /* renamed from: c */
    public final C1982a<?, O> mo6593c() {
        C2148s.m8846b(this.f5805a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f5805a;
    }
}
