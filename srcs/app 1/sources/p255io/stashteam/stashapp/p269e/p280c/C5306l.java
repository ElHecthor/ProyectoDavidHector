package p255io.stashteam.stashapp.p269e.p280c;

import io.stashteam.games.tracker.stashapp.R;
import java.util.Date;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.c.l */
public final class C5306l {

    /* renamed from: a */
    private final String f13928a;

    /* renamed from: b */
    private final C5318v f13929b;

    /* renamed from: c */
    private final C5308n f13930c;

    /* renamed from: d */
    private final boolean f13931d;

    /* renamed from: e */
    private final Date f13932e;

    public C5306l(String str, C5318v vVar, C5308n nVar, boolean z, Date date) {
        C5942k.m22327b(vVar, "rating");
        C5942k.m22327b(nVar, "status");
        C5942k.m22327b(date, "date");
        this.f13928a = str;
        this.f13929b = vVar;
        this.f13930c = nVar;
        this.f13931d = z;
        this.f13932e = date;
    }

    public /* synthetic */ C5306l(String str, C5318v vVar, C5308n nVar, boolean z, Date date, int i, C5938g gVar) {
        if ((i & 1) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            vVar = C5318v.NOTHING;
        }
        C5318v vVar2 = vVar;
        boolean z2 = (i & 8) != 0 ? false : z;
        if ((i & 16) != 0) {
            date = new Date();
        }
        this(str2, vVar2, nVar, z2, date);
    }

    /* renamed from: a */
    public final String mo14959a() {
        return this.f13928a;
    }

    /* renamed from: b */
    public final boolean mo14960b() {
        return this.f13931d;
    }

    /* renamed from: c */
    public final Date mo14961c() {
        return this.f13932e;
    }

    /* renamed from: d */
    public final C5318v mo14962d() {
        return this.f13929b;
    }

    /* renamed from: e */
    public final C5308n mo14963e() {
        return this.f13930c;
    }

    /* renamed from: f */
    public final int mo14964f() {
        return this.f13931d ? R.string.common_completed : this.f13930c.mo14972g();
    }
}
