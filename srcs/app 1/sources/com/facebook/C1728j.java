package com.facebook;

/* renamed from: com.facebook.j */
public class C1728j extends C1631i {

    /* renamed from: f */
    private final C1842t f5219f;

    public C1728j(C1842t tVar, String str) {
        super(str);
        this.f5219f = tVar;
    }

    public final String toString() {
        C1842t tVar = this.f5219f;
        C1730l a = tVar != null ? tVar.mo6290a() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (a != null) {
            sb.append("httpResponseCode: ");
            sb.append(a.mo6010e());
            sb.append(", facebookErrorCode: ");
            sb.append(a.mo6005a());
            sb.append(", facebookErrorType: ");
            sb.append(a.mo6007c());
            sb.append(", message: ");
            sb.append(a.mo6006b());
            sb.append("}");
        }
        return sb.toString();
    }
}
