package p255io.stashteam.stashapp.p269e.p280c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import io.stashteam.games.tracker.stashapp.R;
import java.io.Serializable;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.c.f */
public final class C5297f implements Serializable {

    /* renamed from: f */
    private final long f13867f;

    /* renamed from: g */
    private final String f13868g;

    /* renamed from: h */
    private final String f13869h;

    /* renamed from: i */
    private final int f13870i;

    /* renamed from: j */
    private final boolean f13871j;

    /* renamed from: k */
    private final String f13872k;

    public C5297f(long j, String str, String str2, int i, boolean z, String str3) {
        C5942k.m22327b(str, "title");
        this.f13867f = j;
        this.f13868g = str;
        this.f13869h = str2;
        this.f13870i = i;
        this.f13871j = z;
        this.f13872k = str3;
    }

    public /* synthetic */ C5297f(long j, String str, String str2, int i, boolean z, String str3, int i2, C5938g gVar) {
        this(j, str, str2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : str3);
    }

    /* renamed from: a */
    public final int mo14898a(int i) {
        String str = this.f13872k;
        if (str == null) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: a */
    public final String mo14899a() {
        return this.f13872k;
    }

    /* renamed from: a */
    public final String mo14900a(Context context) {
        String str;
        String str2;
        C5942k.m22327b(context, "context");
        if (this.f13870i == 0) {
            str = context.getString(R.string.lists_no_games);
            str2 = "context.getString(R.string.lists_no_games)";
        } else {
            Resources resources = context.getResources();
            int i = this.f13870i;
            str = resources.getQuantityString(R.plurals.games_count, i, new Object[]{Integer.valueOf(i)});
            str2 = "context.resources.getQua…, gamesCount, gamesCount)";
        }
        C5942k.m22324a((Object) str, str2);
        return str;
    }

    /* renamed from: b */
    public final String mo14901b() {
        return this.f13869h;
    }

    /* renamed from: c */
    public final int mo14902c() {
        return this.f13870i;
    }

    /* renamed from: d */
    public final long mo14903d() {
        return this.f13867f;
    }

    /* renamed from: e */
    public final String mo14904e() {
        return this.f13868g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r5.f13872k, (java.lang.Object) r6.f13872k) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x003d
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.p269e.p280c.C5297f
            if (r0 == 0) goto L_0x003b
            io.stashteam.stashapp.e.c.f r6 = (p255io.stashteam.stashapp.p269e.p280c.C5297f) r6
            long r0 = r5.f13867f
            long r2 = r6.f13867f
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x003b
            java.lang.String r0 = r5.f13868g
            java.lang.String r1 = r6.f13868g
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r5.f13869h
            java.lang.String r1 = r6.f13869h
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x003b
            int r0 = r5.f13870i
            int r1 = r6.f13870i
            if (r0 != r1) goto L_0x003b
            boolean r0 = r5.f13871j
            boolean r1 = r6.f13871j
            if (r0 != r1) goto L_0x003b
            java.lang.String r0 = r5.f13872k
            java.lang.String r6 = r6.f13872k
            boolean r6 = p308k.p323z.p325d.C5942k.m22326a(r0, r6)
            if (r6 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r6 = 0
            return r6
        L_0x003d:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p280c.C5297f.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo14906f() {
        return this.f13871j;
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13867f) * 31;
        String str = this.f13868g;
        int i = 0;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13869h;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f13870i) * 31;
        boolean z = this.f13871j;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str3 = this.f13872k;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomList(id=");
        sb.append(this.f13867f);
        sb.append(", title=");
        sb.append(this.f13868g);
        sb.append(", description=");
        sb.append(this.f13869h);
        sb.append(", gamesCount=");
        sb.append(this.f13870i);
        sb.append(", isClosed=");
        sb.append(this.f13871j);
        sb.append(", colorHex=");
        sb.append(this.f13872k);
        sb.append(")");
        return sb.toString();
    }
}
