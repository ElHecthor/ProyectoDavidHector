package p147g.p156d.p157a.p167b.p173d.p180g;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p147g.p156d.p157a.p167b.p173d.p180g.C3944c3;
import p147g.p156d.p157a.p167b.p173d.p180g.C3982e3;

/* renamed from: g.d.a.b.d.g.c3 */
public abstract class C3944c3<MessageType extends C3944c3<MessageType, BuilderType>, BuilderType extends C3982e3<MessageType, BuilderType>> implements C3985e6 {
    protected int zza = 0;

    /* renamed from: a */
    protected static <T> void m16008a(Iterable<T> iterable, List<? super T> list) {
        C4248v4.m17304a(iterable);
        String str = " is null.";
        String str2 = "Element at index ";
        if (iterable instanceof C4094l5) {
            List b = ((C4094l5) iterable).mo12623b();
            C4094l5 l5Var = (C4094l5) list;
            int size = list.size();
            for (Object next : b) {
                if (next == null) {
                    int size2 = l5Var.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append(str2);
                    sb.append(size2);
                    sb.append(str);
                    String sb2 = sb.toString();
                    for (int size3 = l5Var.size() - 1; size3 >= size; size3--) {
                        l5Var.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof C4092l3) {
                    l5Var.mo12621a((C4092l3) next);
                } else {
                    l5Var.add((String) next);
                }
            }
        } else if (iterable instanceof C4182r6) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    int size5 = list.size() - size4;
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append(str2);
                    sb3.append(size5);
                    sb3.append(str);
                    String sb4 = sb3.toString();
                    for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12243a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final C4092l3 mo12244e() {
        try {
            C4213t3 e = C4092l3.m16742e(mo12434j());
            mo12432a(e.mo12809b());
            return e.mo12808a();
        } catch (IOException e2) {
            String str = "ByteString";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + str.length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* renamed from: g */
    public final byte[] mo12245g() {
        try {
            byte[] bArr = new byte[mo12434j()];
            C3945c4 a = C3945c4.m16016a(bArr);
            mo12432a(a);
            a.mo12267b();
            return bArr;
        } catch (IOException e) {
            String str = "byte array";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + str.length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo12246h() {
        throw new UnsupportedOperationException();
    }
}
