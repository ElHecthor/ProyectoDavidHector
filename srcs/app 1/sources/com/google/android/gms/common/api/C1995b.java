package com.google.android.gms.common.api;

/* renamed from: com.google.android.gms.common.api.b */
public class C1995b extends Exception {
    public C1995b(Status status) {
        int e = status.mo6582e();
        String f = status.mo6584f() != null ? status.mo6584f() : "";
        StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 13);
        sb.append(e);
        sb.append(": ");
        sb.append(f);
        super(sb.toString());
    }
}
