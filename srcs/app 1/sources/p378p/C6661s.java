package p378p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p308k.p316w.C5866d;
import p337m.C6445s;
import p337m.C6445s.C6446a;
import p337m.C6448t;
import p337m.C6455v;
import p337m.C6457w.C6460c;
import p337m.C6467z;
import p337m.C6467z.C6468a;
import p378p.p379a0.C6576a;
import p378p.p379a0.C6577b;
import p378p.p379a0.C6578c;
import p378p.p379a0.C6579d;
import p378p.p379a0.C6580e;
import p378p.p379a0.C6581f;
import p378p.p379a0.C6582g;
import p378p.p379a0.C6583h;
import p378p.p379a0.C6584i;
import p378p.p379a0.C6585j;
import p378p.p379a0.C6586k;
import p378p.p379a0.C6587l;
import p378p.p379a0.C6588m;
import p378p.p379a0.C6589n;
import p378p.p379a0.C6590o;
import p378p.p379a0.C6591p;
import p378p.p379a0.C6592q;
import p378p.p379a0.C6593r;
import p378p.p379a0.C6594s;

/* renamed from: p.s */
final class C6661s {

    /* renamed from: a */
    private final Method f16360a;

    /* renamed from: b */
    private final C6448t f16361b;

    /* renamed from: c */
    final String f16362c;
    @Nullable

    /* renamed from: d */
    private final String f16363d;
    @Nullable

    /* renamed from: e */
    private final C6445s f16364e;
    @Nullable

    /* renamed from: f */
    private final C6455v f16365f;

    /* renamed from: g */
    private final boolean f16366g;

    /* renamed from: h */
    private final boolean f16367h;

    /* renamed from: i */
    private final boolean f16368i;

    /* renamed from: j */
    private final C6642p<?>[] f16369j;

    /* renamed from: k */
    final boolean f16370k;

    /* renamed from: p.s$a */
    static final class C6662a {

        /* renamed from: x */
        private static final Pattern f16371x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        private static final Pattern f16372y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        final C6664u f16373a;

        /* renamed from: b */
        final Method f16374b;

        /* renamed from: c */
        final Annotation[] f16375c;

        /* renamed from: d */
        final Annotation[][] f16376d;

        /* renamed from: e */
        final Type[] f16377e;

        /* renamed from: f */
        boolean f16378f;

        /* renamed from: g */
        boolean f16379g;

        /* renamed from: h */
        boolean f16380h;

        /* renamed from: i */
        boolean f16381i;

        /* renamed from: j */
        boolean f16382j;

        /* renamed from: k */
        boolean f16383k;

        /* renamed from: l */
        boolean f16384l;

        /* renamed from: m */
        boolean f16385m;
        @Nullable

        /* renamed from: n */
        String f16386n;

        /* renamed from: o */
        boolean f16387o;

        /* renamed from: p */
        boolean f16388p;

        /* renamed from: q */
        boolean f16389q;
        @Nullable

        /* renamed from: r */
        String f16390r;
        @Nullable

        /* renamed from: s */
        C6445s f16391s;
        @Nullable

        /* renamed from: t */
        C6455v f16392t;
        @Nullable

        /* renamed from: u */
        Set<String> f16393u;
        @Nullable

        /* renamed from: v */
        C6642p<?>[] f16394v;

        /* renamed from: w */
        boolean f16395w;

        C6662a(C6664u uVar, Method method) {
            this.f16373a = uVar;
            this.f16374b = method;
            this.f16375c = method.getAnnotations();
            this.f16377e = method.getGenericParameterTypes();
            this.f16376d = method.getParameterAnnotations();
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r1v0, types: [java.lang.Class<?>, java.lang.Class] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.Class<?> m25019a(java.lang.Class r1) {
            /*
                java.lang.Class r0 = java.lang.Boolean.TYPE
                if (r0 != r1) goto L_0x0007
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                return r1
            L_0x0007:
                java.lang.Class r0 = java.lang.Byte.TYPE
                if (r0 != r1) goto L_0x000e
                java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
                return r1
            L_0x000e:
                java.lang.Class r0 = java.lang.Character.TYPE
                if (r0 != r1) goto L_0x0015
                java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
                return r1
            L_0x0015:
                java.lang.Class r0 = java.lang.Double.TYPE
                if (r0 != r1) goto L_0x001c
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                return r1
            L_0x001c:
                java.lang.Class r0 = java.lang.Float.TYPE
                if (r0 != r1) goto L_0x0023
                java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
                return r1
            L_0x0023:
                java.lang.Class r0 = java.lang.Integer.TYPE
                if (r0 != r1) goto L_0x002a
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                return r1
            L_0x002a:
                java.lang.Class r0 = java.lang.Long.TYPE
                if (r0 != r1) goto L_0x0031
                java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
                return r1
            L_0x0031:
                java.lang.Class r0 = java.lang.Short.TYPE
                if (r0 != r1) goto L_0x0037
                java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p378p.C6661s.C6662a.m25019a(java.lang.Class):java.lang.Class");
        }

        /* renamed from: a */
        static Set<String> m25020a(String str) {
            Matcher matcher = f16371x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: a */
        private C6445s m25021a(String[] strArr) {
            C6446a aVar = new C6446a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw C6670y.m25058a(this.f16374b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.f16392t = C6455v.m24346a(trim);
                    } catch (IllegalArgumentException e) {
                        throw C6670y.m25060a(this.f16374b, (Throwable) e, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.mo16613a(substring, trim);
                }
            }
            return aVar.mo16614a();
        }

        @Nullable
        /* renamed from: a */
        private C6642p<?> m25022a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            Class<C6460c> cls2 = C6460c.class;
            if (annotation instanceof C6591p) {
                m25025a(i, type);
                if (this.f16382j) {
                    throw C6670y.m25057a(this.f16374b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f16383k) {
                    throw C6670y.m25057a(this.f16374b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f16384l) {
                    throw C6670y.m25057a(this.f16374b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f16385m) {
                    throw C6670y.m25057a(this.f16374b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f16390r != null) {
                    this.f16381i = true;
                    C6591p pVar = (C6591p) annotation;
                    String value = pVar.value();
                    m25024a(i, value);
                    int i2 = i;
                    C6651i iVar = new C6651i(this.f16374b, i2, value, this.f16373a.mo17139c(type, annotationArr), pVar.encoded());
                    return iVar;
                } else {
                    throw C6670y.m25057a(this.f16374b, i, "@Path can only be used with relative url on @%s", this.f16386n);
                }
            } else {
                String str = "<String>)";
                String str2 = " must include generic type (e.g., ";
                if (annotation instanceof C6592q) {
                    m25025a(i, type);
                    C6592q qVar = (C6592q) annotation;
                    String value2 = qVar.value();
                    boolean encoded = qVar.encoded();
                    Class b = C6670y.m25070b(type);
                    this.f16382j = true;
                    if (Iterable.class.isAssignableFrom(b)) {
                        if (type instanceof ParameterizedType) {
                            return new C6652j(value2, this.f16373a.mo17139c(C6670y.m25071b(0, (ParameterizedType) type), annotationArr), encoded).mo17102b();
                        }
                        Method method = this.f16374b;
                        StringBuilder sb = new StringBuilder();
                        sb.append(b.getSimpleName());
                        sb.append(str2);
                        sb.append(b.getSimpleName());
                        sb.append(str);
                        throw C6670y.m25057a(method, i, sb.toString(), new Object[0]);
                    } else if (!b.isArray()) {
                        return new C6652j(value2, this.f16373a.mo17139c(type, annotationArr), encoded);
                    } else {
                        return new C6652j(value2, this.f16373a.mo17139c(m25019a(b.getComponentType()), annotationArr), encoded).mo17100a();
                    }
                } else if (annotation instanceof C6594s) {
                    m25025a(i, type);
                    boolean encoded2 = ((C6594s) annotation).encoded();
                    Class b2 = C6670y.m25070b(type);
                    this.f16383k = true;
                    if (Iterable.class.isAssignableFrom(b2)) {
                        if (type instanceof ParameterizedType) {
                            return new C6654l(this.f16373a.mo17139c(C6670y.m25071b(0, (ParameterizedType) type), annotationArr), encoded2).mo17102b();
                        }
                        Method method2 = this.f16374b;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(b2.getSimpleName());
                        sb2.append(str2);
                        sb2.append(b2.getSimpleName());
                        sb2.append(str);
                        throw C6670y.m25057a(method2, i, sb2.toString(), new Object[0]);
                    } else if (!b2.isArray()) {
                        return new C6654l(this.f16373a.mo17139c(type, annotationArr), encoded2);
                    } else {
                        return new C6654l(this.f16373a.mo17139c(m25019a(b2.getComponentType()), annotationArr), encoded2).mo17100a();
                    }
                } else {
                    String str3 = "Map must include generic types (e.g., Map<String, String>)";
                    if (annotation instanceof C6593r) {
                        m25025a(i, type);
                        Class b3 = C6670y.m25070b(type);
                        this.f16384l = true;
                        if (Map.class.isAssignableFrom(b3)) {
                            Type b4 = C6670y.m25072b(type, b3, Map.class);
                            if (b4 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType = (ParameterizedType) b4;
                                Type b5 = C6670y.m25071b(0, parameterizedType);
                                if (cls == b5) {
                                    return new C6653k(this.f16374b, i, this.f16373a.mo17139c(C6670y.m25071b(1, parameterizedType), annotationArr), ((C6593r) annotation).encoded());
                                }
                                Method method3 = this.f16374b;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("@QueryMap keys must be of type String: ");
                                sb3.append(b5);
                                throw C6670y.m25057a(method3, i, sb3.toString(), new Object[0]);
                            }
                            throw C6670y.m25057a(this.f16374b, i, str3, new Object[0]);
                        }
                        throw C6670y.m25057a(this.f16374b, i, "@QueryMap parameter type must be Map.", new Object[0]);
                    } else if (annotation instanceof C6583h) {
                        m25025a(i, type);
                        String value3 = ((C6583h) annotation).value();
                        Class b6 = C6670y.m25070b(type);
                        if (Iterable.class.isAssignableFrom(b6)) {
                            if (type instanceof ParameterizedType) {
                                return new C6648f(value3, this.f16373a.mo17139c(C6670y.m25071b(0, (ParameterizedType) type), annotationArr)).mo17102b();
                            }
                            Method method4 = this.f16374b;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(b6.getSimpleName());
                            sb4.append(str2);
                            sb4.append(b6.getSimpleName());
                            sb4.append(str);
                            throw C6670y.m25057a(method4, i, sb4.toString(), new Object[0]);
                        } else if (!b6.isArray()) {
                            return new C6648f(value3, this.f16373a.mo17139c(type, annotationArr));
                        } else {
                            return new C6648f(value3, this.f16373a.mo17139c(m25019a(b6.getComponentType()), annotationArr)).mo17100a();
                        }
                    } else if (annotation instanceof C6578c) {
                        m25025a(i, type);
                        if (this.f16388p) {
                            C6578c cVar = (C6578c) annotation;
                            String value4 = cVar.value();
                            boolean encoded3 = cVar.encoded();
                            this.f16378f = true;
                            Class b7 = C6670y.m25070b(type);
                            if (Iterable.class.isAssignableFrom(b7)) {
                                if (type instanceof ParameterizedType) {
                                    return new C6646d(value4, this.f16373a.mo17139c(C6670y.m25071b(0, (ParameterizedType) type), annotationArr), encoded3).mo17102b();
                                }
                                Method method5 = this.f16374b;
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(b7.getSimpleName());
                                sb5.append(str2);
                                sb5.append(b7.getSimpleName());
                                sb5.append(str);
                                throw C6670y.m25057a(method5, i, sb5.toString(), new Object[0]);
                            } else if (!b7.isArray()) {
                                return new C6646d(value4, this.f16373a.mo17139c(type, annotationArr), encoded3);
                            } else {
                                return new C6646d(value4, this.f16373a.mo17139c(m25019a(b7.getComponentType()), annotationArr), encoded3).mo17100a();
                            }
                        } else {
                            throw C6670y.m25057a(this.f16374b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof C6579d) {
                        m25025a(i, type);
                        if (this.f16388p) {
                            Class b8 = C6670y.m25070b(type);
                            if (Map.class.isAssignableFrom(b8)) {
                                Type b9 = C6670y.m25072b(type, b8, Map.class);
                                if (b9 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType2 = (ParameterizedType) b9;
                                    Type b10 = C6670y.m25071b(0, parameterizedType2);
                                    if (cls == b10) {
                                        C6614h c = this.f16373a.mo17139c(C6670y.m25071b(1, parameterizedType2), annotationArr);
                                        this.f16378f = true;
                                        return new C6647e(this.f16374b, i, c, ((C6579d) annotation).encoded());
                                    }
                                    Method method6 = this.f16374b;
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append("@FieldMap keys must be of type String: ");
                                    sb6.append(b10);
                                    throw C6670y.m25057a(method6, i, sb6.toString(), new Object[0]);
                                }
                                throw C6670y.m25057a(this.f16374b, i, str3, new Object[0]);
                            }
                            throw C6670y.m25057a(this.f16374b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                        }
                        throw C6670y.m25057a(this.f16374b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                    } else if (annotation instanceof C6589n) {
                        m25025a(i, type);
                        if (this.f16389q) {
                            C6589n nVar = (C6589n) annotation;
                            this.f16379g = true;
                            String value5 = nVar.value();
                            Class b11 = C6670y.m25070b(type);
                            if (value5.isEmpty()) {
                                String str4 = "@Part annotation must supply a name or use MultipartBody.Part parameter type.";
                                if (Iterable.class.isAssignableFrom(b11)) {
                                    if (!(type instanceof ParameterizedType)) {
                                        Method method7 = this.f16374b;
                                        StringBuilder sb7 = new StringBuilder();
                                        sb7.append(b11.getSimpleName());
                                        sb7.append(str2);
                                        sb7.append(b11.getSimpleName());
                                        sb7.append(str);
                                        throw C6670y.m25057a(method7, i, sb7.toString(), new Object[0]);
                                    } else if (cls2.isAssignableFrom(C6670y.m25070b(C6670y.m25071b(0, (ParameterizedType) type)))) {
                                        return C6655m.f16340a.mo17102b();
                                    } else {
                                        throw C6670y.m25057a(this.f16374b, i, str4, new Object[0]);
                                    }
                                } else if (b11.isArray()) {
                                    if (cls2.isAssignableFrom(b11.getComponentType())) {
                                        return C6655m.f16340a.mo17100a();
                                    }
                                    throw C6670y.m25057a(this.f16374b, i, str4, new Object[0]);
                                } else if (cls2.isAssignableFrom(b11)) {
                                    return C6655m.f16340a;
                                } else {
                                    throw C6670y.m25057a(this.f16374b, i, str4, new Object[0]);
                                }
                            } else {
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append("form-data; name=\"");
                                sb8.append(value5);
                                sb8.append("\"");
                                C6445s a = C6445s.m24256a("Content-Disposition", sb8.toString(), "Content-Transfer-Encoding", nVar.encoding());
                                String str5 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.";
                                if (Iterable.class.isAssignableFrom(b11)) {
                                    if (type instanceof ParameterizedType) {
                                        Type b12 = C6670y.m25071b(0, (ParameterizedType) type);
                                        if (!cls2.isAssignableFrom(C6670y.m25070b(b12))) {
                                            return new C6649g(this.f16374b, i, a, this.f16373a.mo17134a(b12, annotationArr, this.f16375c)).mo17102b();
                                        }
                                        throw C6670y.m25057a(this.f16374b, i, str5, new Object[0]);
                                    }
                                    Method method8 = this.f16374b;
                                    StringBuilder sb9 = new StringBuilder();
                                    sb9.append(b11.getSimpleName());
                                    sb9.append(str2);
                                    sb9.append(b11.getSimpleName());
                                    sb9.append(str);
                                    throw C6670y.m25057a(method8, i, sb9.toString(), new Object[0]);
                                } else if (b11.isArray()) {
                                    Class a2 = m25019a(b11.getComponentType());
                                    if (!cls2.isAssignableFrom(a2)) {
                                        return new C6649g(this.f16374b, i, a, this.f16373a.mo17134a((Type) a2, annotationArr, this.f16375c)).mo17100a();
                                    }
                                    throw C6670y.m25057a(this.f16374b, i, str5, new Object[0]);
                                } else if (!cls2.isAssignableFrom(b11)) {
                                    return new C6649g(this.f16374b, i, a, this.f16373a.mo17134a(type, annotationArr, this.f16375c));
                                } else {
                                    throw C6670y.m25057a(this.f16374b, i, str5, new Object[0]);
                                }
                            }
                        } else {
                            throw C6670y.m25057a(this.f16374b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof C6590o) {
                        m25025a(i, type);
                        if (this.f16389q) {
                            this.f16379g = true;
                            Class b13 = C6670y.m25070b(type);
                            if (Map.class.isAssignableFrom(b13)) {
                                Type b14 = C6670y.m25072b(type, b13, Map.class);
                                if (b14 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType3 = (ParameterizedType) b14;
                                    Type b15 = C6670y.m25071b(0, parameterizedType3);
                                    if (cls == b15) {
                                        Type b16 = C6670y.m25071b(1, parameterizedType3);
                                        if (!cls2.isAssignableFrom(C6670y.m25070b(b16))) {
                                            return new C6650h(this.f16374b, i, this.f16373a.mo17134a(b16, annotationArr, this.f16375c), ((C6590o) annotation).encoding());
                                        }
                                        throw C6670y.m25057a(this.f16374b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                    }
                                    Method method9 = this.f16374b;
                                    StringBuilder sb10 = new StringBuilder();
                                    sb10.append("@PartMap keys must be of type String: ");
                                    sb10.append(b15);
                                    throw C6670y.m25057a(method9, i, sb10.toString(), new Object[0]);
                                }
                                throw C6670y.m25057a(this.f16374b, i, str3, new Object[0]);
                            }
                            throw C6670y.m25057a(this.f16374b, i, "@PartMap parameter type must be Map.", new Object[0]);
                        }
                        throw C6670y.m25057a(this.f16374b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    } else if (!(annotation instanceof C6576a)) {
                        return null;
                    } else {
                        m25025a(i, type);
                        if (this.f16388p || this.f16389q) {
                            throw C6670y.m25057a(this.f16374b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                        } else if (!this.f16380h) {
                            try {
                                C6614h a3 = this.f16373a.mo17134a(type, annotationArr, this.f16375c);
                                this.f16380h = true;
                                return new C6645c(this.f16374b, i, a3);
                            } catch (RuntimeException e) {
                                throw C6670y.m25059a(this.f16374b, e, i, "Unable to create @Body converter for %s", type);
                            }
                        } else {
                            throw C6670y.m25057a(this.f16374b, i, "Multiple @Body method annotations found.", new Object[0]);
                        }
                    }
                }
            }
        }

        @Nullable
        /* renamed from: a */
        private C6642p<?> m25023a(int i, Type type, @Nullable Annotation[] annotationArr, boolean z) {
            C6642p<?> pVar;
            if (annotationArr != null) {
                pVar = null;
                for (Annotation a : annotationArr) {
                    C6642p<?> a2 = m25022a(i, type, annotationArr, a);
                    if (a2 != null) {
                        if (pVar == null) {
                            pVar = a2;
                        } else {
                            throw C6670y.m25057a(this.f16374b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                pVar = null;
            }
            if (pVar != null) {
                return pVar;
            }
            if (z) {
                try {
                    if (C6670y.m25070b(type) == C5866d.class) {
                        this.f16395w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw C6670y.m25057a(this.f16374b, i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: a */
        private void m25024a(int i, String str) {
            if (!f16372y.matcher(str).matches()) {
                throw C6670y.m25057a(this.f16374b, i, "@Path parameter name must match %s. Found: %s", f16371x.pattern(), str);
            } else if (!this.f16393u.contains(str)) {
                throw C6670y.m25057a(this.f16374b, i, "URL \"%s\" does not contain \"{%s}\".", this.f16390r, str);
            }
        }

        /* renamed from: a */
        private void m25025a(int i, Type type) {
            if (C6670y.m25073c(type)) {
                throw C6670y.m25057a(this.f16374b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* renamed from: a */
        private void m25026a(String str, String str2, boolean z) {
            String str3 = this.f16386n;
            if (str3 == null) {
                this.f16386n = str;
                this.f16387o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f16371x.matcher(substring).find()) {
                            throw C6670y.m25058a(this.f16374b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f16390r = str2;
                    this.f16393u = m25020a(str2);
                    return;
                }
                return;
            }
            throw C6670y.m25058a(this.f16374b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: a */
        private void m25027a(Annotation annotation) {
            String value;
            String str;
            String value2;
            String str2;
            if (annotation instanceof C6577b) {
                value = ((C6577b) annotation).value();
                str = "DELETE";
            } else if (annotation instanceof C6580e) {
                value = ((C6580e) annotation).value();
                str = "GET";
            } else if (annotation instanceof C6581f) {
                value = ((C6581f) annotation).value();
                str = "HEAD";
            } else {
                if (annotation instanceof C6586k) {
                    value2 = ((C6586k) annotation).value();
                    str2 = "PATCH";
                } else if (annotation instanceof C6587l) {
                    value2 = ((C6587l) annotation).value();
                    str2 = "POST";
                } else if (annotation instanceof C6588m) {
                    value2 = ((C6588m) annotation).value();
                    str2 = "PUT";
                } else if (annotation instanceof C6585j) {
                    value = ((C6585j) annotation).value();
                    str = "OPTIONS";
                } else if (annotation instanceof C6582g) {
                    C6582g gVar = (C6582g) annotation;
                    m25026a(gVar.method(), gVar.path(), gVar.hasBody());
                    return;
                } else if (annotation instanceof C6584i) {
                    String[] value3 = ((C6584i) annotation).value();
                    if (value3.length != 0) {
                        this.f16391s = m25021a(value3);
                        return;
                    } else {
                        throw C6670y.m25058a(this.f16374b, "@Headers annotation is empty.", new Object[0]);
                    }
                } else {
                    return;
                }
                m25026a(str2, value2, true);
                return;
            }
            m25026a(str, value, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C6661s mo17124a() {
            for (Annotation a : this.f16375c) {
                m25027a(a);
            }
            if (this.f16386n != null) {
                if (!this.f16387o) {
                    if (this.f16389q) {
                        throw C6670y.m25058a(this.f16374b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f16388p) {
                        throw C6670y.m25058a(this.f16374b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f16376d.length;
                this.f16394v = new C6642p[length];
                int i = length - 1;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= length) {
                        break;
                    }
                    C6642p<?>[] pVarArr = this.f16394v;
                    Type type = this.f16377e[i2];
                    Annotation[] annotationArr = this.f16376d[i2];
                    if (i2 != i) {
                        z = false;
                    }
                    pVarArr[i2] = m25023a(i2, type, annotationArr, z);
                    i2++;
                }
                if (this.f16390r == null && !this.f16385m) {
                    throw C6670y.m25058a(this.f16374b, "Missing either @%s URL or @Url parameter.", this.f16386n);
                } else if (!this.f16388p && !this.f16389q && !this.f16387o && this.f16380h) {
                    throw C6670y.m25058a(this.f16374b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                } else if (this.f16388p && !this.f16378f) {
                    throw C6670y.m25058a(this.f16374b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                } else if (!this.f16389q || this.f16379g) {
                    return new C6661s(this);
                } else {
                    throw C6670y.m25058a(this.f16374b, "Multipart method must contain at least one @Part.", new Object[0]);
                }
            } else {
                throw C6670y.m25058a(this.f16374b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
    }

    C6661s(C6662a aVar) {
        this.f16360a = aVar.f16374b;
        this.f16361b = aVar.f16373a.f16401c;
        this.f16362c = aVar.f16386n;
        this.f16363d = aVar.f16390r;
        this.f16364e = aVar.f16391s;
        this.f16365f = aVar.f16392t;
        this.f16366g = aVar.f16387o;
        this.f16367h = aVar.f16388p;
        this.f16368i = aVar.f16389q;
        this.f16369j = aVar.f16394v;
        this.f16370k = aVar.f16395w;
    }

    /* renamed from: a */
    static C6661s m25017a(C6664u uVar, Method method) {
        return new C6662a(uVar, method).mo17124a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C6467z mo17123a(Object[] objArr) {
        C6642p<?>[] pVarArr = this.f16369j;
        int length = objArr.length;
        if (length == pVarArr.length) {
            C6659r rVar = new C6659r(this.f16362c, this.f16361b, this.f16363d, this.f16364e, this.f16365f, this.f16366g, this.f16367h, this.f16368i);
            if (this.f16370k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                pVarArr[i].mo17101a(rVar, objArr[i]);
            }
            C6468a a = rVar.mo17115a();
            a.mo16758a(C6625l.class, new C6625l(this.f16360a, arrayList));
            return a.mo16765a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Argument count (");
        sb.append(length);
        sb.append(") doesn't match expected count (");
        sb.append(pVarArr.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
