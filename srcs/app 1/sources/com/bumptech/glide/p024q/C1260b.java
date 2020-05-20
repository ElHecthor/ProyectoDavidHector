package com.bumptech.glide.p024q;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.q.b */
public final class C1260b {

    /* renamed from: a */
    private final List<ImageHeaderParser> f4169a = new ArrayList();

    /* renamed from: a */
    public synchronized List<ImageHeaderParser> mo5229a() {
        return this.f4169a;
    }

    /* renamed from: a */
    public synchronized void mo5230a(ImageHeaderParser imageHeaderParser) {
        this.f4169a.add(imageHeaderParser);
    }
}
