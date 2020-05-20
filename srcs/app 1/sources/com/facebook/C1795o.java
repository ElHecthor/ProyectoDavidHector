package com.facebook;

/* renamed from: com.facebook.o */
public class C1795o extends C1631i {
    private static final long serialVersionUID = 1;

    /* renamed from: f */
    private final C1730l f5382f;

    public C1795o(C1730l lVar, String str) {
        super(str);
        this.f5382f = lVar;
    }

    /* renamed from: a */
    public final C1730l mo6167a() {
        return this.f5382f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookServiceException: ");
        sb.append("httpResponseCode: ");
        sb.append(this.f5382f.mo6010e());
        sb.append(", facebookErrorCode: ");
        sb.append(this.f5382f.mo6005a());
        sb.append(", facebookErrorType: ");
        sb.append(this.f5382f.mo6007c());
        sb.append(", message: ");
        sb.append(this.f5382f.mo6006b());
        sb.append("}");
        return sb.toString();
    }
}
