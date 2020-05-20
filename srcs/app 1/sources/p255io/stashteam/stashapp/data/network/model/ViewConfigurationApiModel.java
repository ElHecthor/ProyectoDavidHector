package p255io.stashteam.stashapp.data.network.model;

import p147g.p156d.p204b.p206x.C4514c;

/* renamed from: io.stashteam.stashapp.data.network.model.ViewConfigurationApiModel */
public final class ViewConfigurationApiModel {
    @C4514c("itemColor")
    private final String itemColor;

    public ViewConfigurationApiModel() {
        this(null, 1, null);
    }

    public ViewConfigurationApiModel(String str) {
        this.itemColor = str;
    }

    public /* synthetic */ ViewConfigurationApiModel(String str, int i, C5938g gVar) {
        if ((i & 1) != 0) {
            str = null;
        }
        this(str);
    }

    public static /* synthetic */ ViewConfigurationApiModel copy$default(ViewConfigurationApiModel viewConfigurationApiModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewConfigurationApiModel.itemColor;
        }
        return viewConfigurationApiModel.copy(str);
    }

    public final String component1() {
        return this.itemColor;
    }

    public final ViewConfigurationApiModel copy(String str) {
        return new ViewConfigurationApiModel(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r1.itemColor, (java.lang.Object) ((p255io.stashteam.stashapp.data.network.model.ViewConfigurationApiModel) r2).itemColor) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof p255io.stashteam.stashapp.data.network.model.ViewConfigurationApiModel
            if (r0 == 0) goto L_0x0013
            io.stashteam.stashapp.data.network.model.ViewConfigurationApiModel r2 = (p255io.stashteam.stashapp.data.network.model.ViewConfigurationApiModel) r2
            java.lang.String r0 = r1.itemColor
            java.lang.String r2 = r2.itemColor
            boolean r2 = p308k.p323z.p325d.C5942k.m22326a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.ViewConfigurationApiModel.equals(java.lang.Object):boolean");
    }

    public final String getItemColor() {
        return this.itemColor;
    }

    public int hashCode() {
        String str = this.itemColor;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ViewConfigurationApiModel(itemColor=");
        sb.append(this.itemColor);
        sb.append(")");
        return sb.toString();
    }
}
