package p308k.p316w.p318j.p319a;

import java.lang.reflect.Field;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.w.j.a.g */
public final class C5892g {
    /* renamed from: a */
    private static final C5891f m22274a(C5886a aVar) {
        return (C5891f) aVar.getClass().getAnnotation(C5891f.class);
    }

    /* renamed from: a */
    private static final void m22275a(int i, int i2) {
        if (i2 > i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Debug metadata version mismatch. Expected: ");
            sb.append(i);
            sb.append(", got ");
            sb.append(i2);
            sb.append(". Please update the Kotlin standard library.");
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    /* renamed from: b */
    private static final int m22276b(C5886a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            C5942k.m22324a((Object) declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static final StackTraceElement m22277c(C5886a aVar) {
        String str;
        C5942k.m22327b(aVar, "$this$getStackTraceElementImpl");
        C5891f a = m22274a(aVar);
        if (a == null) {
            return null;
        }
        m22275a(1, a.mo15597v());
        int b = m22276b(aVar);
        int i = b < 0 ? -1 : a.mo15595l()[b];
        String a2 = C5894i.f14920c.mo15598a(aVar);
        if (a2 == null) {
            str = a.mo15593c();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append('/');
            sb.append(a.mo15593c());
            str = sb.toString();
        }
        return new StackTraceElement(str, a.mo15596m(), a.mo15594f(), i);
    }
}
