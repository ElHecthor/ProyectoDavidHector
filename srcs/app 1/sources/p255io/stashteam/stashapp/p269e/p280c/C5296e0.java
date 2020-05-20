package p255io.stashteam.stashapp.p269e.p280c;

import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.c.e0 */
public final class C5296e0 {

    /* renamed from: a */
    private final String f13865a;

    /* renamed from: b */
    private final String f13866b;

    public C5296e0(String str, String str2) {
        C5942k.m22327b(str2, "videoId");
        this.f13865a = str;
        this.f13866b = str2;
    }

    /* renamed from: a */
    public final String mo14894a() {
        return this.f13866b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.f13866b, (java.lang.Object) r3.f13866b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.p269e.p280c.C5296e0
            if (r0 == 0) goto L_0x001d
            io.stashteam.stashapp.e.c.e0 r3 = (p255io.stashteam.stashapp.p269e.p280c.C5296e0) r3
            java.lang.String r0 = r2.f13865a
            java.lang.String r1 = r3.f13865a
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f13866b
            java.lang.String r3 = r3.f13866b
            boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p280c.C5296e0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f13865a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f13866b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Video(name=");
        sb.append(this.f13865a);
        sb.append(", videoId=");
        sb.append(this.f13866b);
        sb.append(")");
        return sb.toString();
    }
}
