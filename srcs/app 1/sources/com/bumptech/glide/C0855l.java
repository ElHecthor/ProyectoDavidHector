package com.bumptech.glide;

import com.bumptech.glide.C0855l;
import com.bumptech.glide.p025r.p027k.C1289a;
import com.bumptech.glide.p025r.p027k.C1293c;

/* renamed from: com.bumptech.glide.l */
public abstract class C0855l<CHILD extends C0855l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: f */
    private C1293c<? super TranscodeType> f3366f = C1289a.m6110a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C1293c<? super TranscodeType> mo4609b() {
        return this.f3366f;
    }

    public final CHILD clone() {
        try {
            return (C0855l) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
