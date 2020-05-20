package androidx.room;

import p071f.p133t.p134a.C3545f;

/* renamed from: androidx.room.e */
public abstract class C0688e<T> extends C0736t {
    public C0688e(C0711l lVar) {
        super(lVar);
    }

    /* renamed from: a */
    public final long mo4022a(T t) {
        C3545f a = mo4126a();
        try {
            mo4023a(a, t);
            return a.executeInsert();
        } finally {
            mo4127a(a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4023a(C3545f fVar, T t);
}
