package p378p;

import java.lang.annotation.Annotation;

/* renamed from: p.x */
final class C6669x implements C6668w {

    /* renamed from: a */
    private static final C6668w f16416a = new C6669x();

    C6669x() {
    }

    /* renamed from: a */
    static Annotation[] m25054a(Annotation[] annotationArr) {
        if (C6670y.m25069a(annotationArr, C6668w.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = f16416a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class<? extends Annotation> annotationType() {
        return C6668w.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof C6668w;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@");
        sb.append(C6668w.class.getName());
        sb.append("()");
        return sb.toString();
    }
}
