package com.facebook;

/* renamed from: com.facebook.h */
public class C1630h extends C1631i {
    static final long serialVersionUID = 1;

    /* renamed from: f */
    private int f5022f;

    /* renamed from: g */
    private String f5023g;

    public C1630h(String str, int i, String str2) {
        super(str);
        this.f5022f = i;
        this.f5023g = str2;
    }

    /* renamed from: a */
    public int mo5867a() {
        return this.f5022f;
    }

    /* renamed from: b */
    public String mo5868b() {
        return this.f5023g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookDialogException: ");
        sb.append("errorCode: ");
        sb.append(mo5867a());
        sb.append(", message: ");
        sb.append(getMessage());
        sb.append(", url: ");
        sb.append(mo5868b());
        sb.append("}");
        return sb.toString();
    }
}
