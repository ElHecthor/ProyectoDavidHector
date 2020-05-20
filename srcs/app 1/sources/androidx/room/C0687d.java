package androidx.room;

import p071f.p133t.p134a.C3545f;

/* renamed from: androidx.room.d */
public abstract class C0687d<T> extends C0736t {
    public C0687d(C0711l lVar) {
        super(lVar);
    }

    /* renamed from: a */
    public final int mo4020a(T t) {
        C3545f a = mo4126a();
        try {
            mo4021a(a, t);
            return a.executeUpdateDelete();
        } finally {
            mo4127a(a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4021a(C3545f fVar, T t);
}
