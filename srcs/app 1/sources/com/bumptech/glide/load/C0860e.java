package com.bumptech.glide.load;

import java.io.IOException;

/* renamed from: com.bumptech.glide.load.e */
public final class C0860e extends IOException {
    private static final long serialVersionUID = 1;

    public C0860e(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Http request failed with status code: ");
        sb.append(i);
        this(sb.toString(), i);
    }

    public C0860e(String str) {
        this(str, -1);
    }

    public C0860e(String str, int i) {
        this(str, i, null);
    }

    public C0860e(String str, int i, Throwable th) {
        super(str, th);
    }
}
