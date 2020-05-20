package p308k.p323z;

import p308k.C5809q;
import p308k.p311c0.C5739b;
import p308k.p323z.p325d.C5934d;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5950s;

/* renamed from: k.z.a */
public final class C5905a {
    /* renamed from: a */
    public static final <T> Class<T> m22294a(C5739b<T> bVar) {
        C5942k.m22327b(bVar, "$this$java");
        Class<T> a = ((C5934d) bVar).mo15610a();
        if (a != null) {
            return a;
        }
        throw new C5809q("null cannot be cast to non-null type java.lang.Class<T>");
    }

    /* renamed from: a */
    public static final <T> C5739b<T> m22295a(Class<T> cls) {
        C5942k.m22327b(cls, "$this$kotlin");
        return C5950s.m22341a((Class) cls);
    }

    /* renamed from: b */
    public static final <T> Class<T> m22296b(C5739b<T> bVar) {
        C5942k.m22327b(bVar, "$this$javaObjectType");
        Class a = ((C5934d) bVar).mo15610a();
        String str = "null cannot be cast to non-null type java.lang.Class<T>";
        if (a.isPrimitive()) {
            String name = a.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            a = Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            a = Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            a = Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            a = Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            a = Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            a = Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            a = Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            a = Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            a = Short.class;
                            break;
                        }
                        break;
                }
            }
            if (a != null) {
                return a;
            }
            throw new C5809q(str);
        } else if (a != null) {
            return a;
        } else {
            throw new C5809q(str);
        }
    }
}
