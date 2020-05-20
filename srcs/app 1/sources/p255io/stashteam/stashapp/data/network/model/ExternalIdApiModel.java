package p255io.stashteam.stashapp.data.network.model;

import p147g.p156d.p204b.p206x.C4514c;

/* renamed from: io.stashteam.stashapp.data.network.model.ExternalIdApiModel */
public final class ExternalIdApiModel {
    @C4514c("subject")
    private final String subject;
    @C4514c("type")
    private final String type;

    public ExternalIdApiModel(String str, String str2) {
        this.subject = str;
        this.type = str2;
    }

    public static /* synthetic */ ExternalIdApiModel copy$default(ExternalIdApiModel externalIdApiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalIdApiModel.subject;
        }
        if ((i & 2) != 0) {
            str2 = externalIdApiModel.type;
        }
        return externalIdApiModel.copy(str, str2);
    }

    public final String component1() {
        return this.subject;
    }

    public final String component2() {
        return this.type;
    }

    public final ExternalIdApiModel copy(String str, String str2) {
        return new ExternalIdApiModel(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.type, (java.lang.Object) r3.type) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.data.network.model.ExternalIdApiModel
            if (r0 == 0) goto L_0x001d
            io.stashteam.stashapp.data.network.model.ExternalIdApiModel r3 = (p255io.stashteam.stashapp.data.network.model.ExternalIdApiModel) r3
            java.lang.String r0 = r2.subject
            java.lang.String r1 = r3.subject
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.type
            java.lang.String r3 = r3.type
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
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.ExternalIdApiModel.equals(java.lang.Object):boolean");
    }

    public final String getSubject() {
        return this.subject;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.subject;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.type;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExternalIdApiModel(subject=");
        sb.append(this.subject);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(")");
        return sb.toString();
    }
}
