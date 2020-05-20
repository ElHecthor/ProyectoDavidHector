package com.bumptech.glide.load.p007o;

import com.bumptech.glide.load.C0859d;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p007o.p009b0.C0940a.C0942b;
import java.io.File;

/* renamed from: com.bumptech.glide.load.o.e */
class C0974e<DataType> implements C0942b {

    /* renamed from: a */
    private final C0859d<DataType> f3559a;

    /* renamed from: b */
    private final DataType f3560b;

    /* renamed from: c */
    private final C0873i f3561c;

    C0974e(C0859d<DataType> dVar, DataType datatype, C0873i iVar) {
        this.f3559a = dVar;
        this.f3560b = datatype;
        this.f3561c = iVar;
    }

    /* renamed from: a */
    public boolean mo4741a(File file) {
        return this.f3559a.mo4615a(this.f3560b, file, this.f3561c);
    }
}
