package p255io.stashteam.stashapp.data.network.request;

import p147g.p156d.p204b.p206x.C4514c;

/* renamed from: io.stashteam.stashapp.data.network.request.ChangeStatusRequest */
public final class ChangeStatusRequest {
    @C4514c("comment")
    private final String comment;
    @C4514c("completed")
    private final Boolean completed;
    @C4514c("rating")
    private final Integer rating;
    @C4514c("status")
    private final String status;

    public ChangeStatusRequest(String str, Integer num, String str2, Boolean bool) {
        this.comment = str;
        this.rating = num;
        this.status = str2;
        this.completed = bool;
    }

    public static /* synthetic */ ChangeStatusRequest copy$default(ChangeStatusRequest changeStatusRequest, String str, Integer num, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changeStatusRequest.comment;
        }
        if ((i & 2) != 0) {
            num = changeStatusRequest.rating;
        }
        if ((i & 4) != 0) {
            str2 = changeStatusRequest.status;
        }
        if ((i & 8) != 0) {
            bool = changeStatusRequest.completed;
        }
        return changeStatusRequest.copy(str, num, str2, bool);
    }

    public final String component1() {
        return this.comment;
    }

    public final Integer component2() {
        return this.rating;
    }

    public final String component3() {
        return this.status;
    }

    public final Boolean component4() {
        return this.completed;
    }

    public final ChangeStatusRequest copy(String str, Integer num, String str2, Boolean bool) {
        return new ChangeStatusRequest(str, num, str2, bool);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.completed, (java.lang.Object) r3.completed) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.data.network.request.ChangeStatusRequest
            if (r0 == 0) goto L_0x0031
            io.stashteam.stashapp.data.network.request.ChangeStatusRequest r3 = (p255io.stashteam.stashapp.data.network.request.ChangeStatusRequest) r3
            java.lang.String r0 = r2.comment
            java.lang.String r1 = r3.comment
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Integer r0 = r2.rating
            java.lang.Integer r1 = r3.rating
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.status
            java.lang.String r1 = r3.status
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Boolean r0 = r2.completed
            java.lang.Boolean r3 = r3.completed
            boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.request.ChangeStatusRequest.equals(java.lang.Object):boolean");
    }

    public final String getComment() {
        return this.comment;
    }

    public final Boolean getCompleted() {
        return this.completed;
    }

    public final Integer getRating() {
        return this.rating;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.comment;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.rating;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.status;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.completed;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeStatusRequest(comment=");
        sb.append(this.comment);
        sb.append(", rating=");
        sb.append(this.rating);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", completed=");
        sb.append(this.completed);
        sb.append(")");
        return sb.toString();
    }
}
