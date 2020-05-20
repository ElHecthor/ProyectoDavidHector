package p147g.p156d.p157a.p167b.p173d.p180g;

import p147g.p156d.p157a.p167b.p173d.p180g.C3944c3;
import p147g.p156d.p157a.p167b.p173d.p180g.C3982e3;

/* renamed from: g.d.a.b.d.g.e3 */
public abstract class C3982e3<MessageType extends C3944c3<MessageType, BuilderType>, BuilderType extends C3982e3<MessageType, BuilderType>> implements C3969d6 {
    /* renamed from: a */
    public final /* synthetic */ C3969d6 mo12343a(C3985e6 e6Var) {
        if (mo12488d().getClass().isInstance(e6Var)) {
            return mo12385a((MessageType) (C3944c3) e6Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: a */
    public final /* synthetic */ C3969d6 mo12344a(byte[] bArr) {
        mo12386a(bArr, 0, bArr.length);
        return this;
    }

    /* renamed from: a */
    public final /* synthetic */ C3969d6 mo12345a(byte[] bArr, C3999f4 f4Var) {
        mo12387a(bArr, 0, bArr.length, f4Var);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo12385a(MessageType messagetype);

    /* renamed from: a */
    public abstract BuilderType mo12386a(byte[] bArr, int i, int i2);

    /* renamed from: a */
    public abstract BuilderType mo12387a(byte[] bArr, int i, int i2, C3999f4 f4Var);
}
