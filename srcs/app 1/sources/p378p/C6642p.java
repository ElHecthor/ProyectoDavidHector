package p378p;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import javax.annotation.Nullable;
import p337m.C6225a0;
import p337m.C6445s;
import p337m.C6457w.C6460c;

/* renamed from: p.p */
abstract class C6642p<T> {

    /* renamed from: p.p$a */
    class C6643a extends C6642p<Iterable<T>> {
        C6643a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo17101a(C6659r rVar, @Nullable Iterable<T> iterable) {
            if (iterable != null) {
                for (T a : iterable) {
                    C6642p.this.mo17101a(rVar, a);
                }
            }
        }
    }

    /* renamed from: p.p$b */
    class C6644b extends C6642p<Object> {
        C6644b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo17101a(C6659r rVar, @Nullable Object obj) {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    C6642p.this.mo17101a(rVar, Array.get(obj, i));
                }
            }
        }
    }

    /* renamed from: p.p$c */
    static final class C6645c<T> extends C6642p<T> {

        /* renamed from: a */
        private final Method f16306a;

        /* renamed from: b */
        private final int f16307b;

        /* renamed from: c */
        private final C6614h<T, C6225a0> f16308c;

        C6645c(Method method, int i, C6614h<T, C6225a0> hVar) {
            this.f16306a = method;
            this.f16307b = i;
            this.f16308c = hVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo17101a(C6659r rVar, @Nullable T t) {
            if (t != null) {
                try {
                    rVar.mo17118a((C6225a0) this.f16308c.mo17068a(t));
                } catch (IOException e) {
                    Method method = this.f16306a;
                    int i = this.f16307b;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw C6670y.m25059a(method, e, i, sb.toString(), new Object[0]);
                }
            } else {
                throw C6670y.m25057a(this.f16306a, this.f16307b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* renamed from: p.p$d */
    static final class C6646d<T> extends C6642p<T> {

        /* renamed from: a */
        private final String f16309a;

        /* renamed from: b */
        private final C6614h<T, String> f16310b;

        /* renamed from: c */
        private final boolean f16311c;

        C6646d(String str, C6614h<T, String> hVar, boolean z) {
            this.f16309a = (String) Objects.requireNonNull(str, "name == null");
            this.f16310b = hVar;
            this.f16311c = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo17101a(C6659r rVar, @Nullable T t) {
            if (t != null) {
                String str = (String) this.f16310b.mo17068a(t);
                if (str != null) {
                    rVar.mo17117a(this.f16309a, str, this.f16311c);
                }
            }
        }
    }

    /* renamed from: p.p$e */
    static final class C6647e<T> extends C6642p<Map<String, T>> {

        /* renamed from: a */
        private final Method f16312a;

        /* renamed from: b */
        private final int f16313b;

        /* renamed from: c */
        private final C6614h<T, String> f16314c;

        /* renamed from: d */
        private final boolean f16315d;

        C6647e(Method method, int i, C6614h<T, String> hVar, boolean z) {
            this.f16312a = method;
            this.f16313b = i;
            this.f16314c = hVar;
            this.f16315d = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo17101a(C6659r rVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        String str2 = "'.";
                        if (value != null) {
                            String str3 = (String) this.f16314c.mo17068a(value);
                            if (str3 != null) {
                                rVar.mo17117a(str, str3, this.f16315d);
                            } else {
                                Method method = this.f16312a;
                                int i = this.f16313b;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Field map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.f16314c.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append(str2);
                                throw C6670y.m25057a(method, i, sb.toString(), new Object[0]);
                            }
                        } else {
                            Method method2 = this.f16312a;
                            int i2 = this.f16313b;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Field map contained null value for key '");
                            sb2.append(str);
                            sb2.append(str2);
                            throw C6670y.m25057a(method2, i2, sb2.toString(), new Object[0]);
                        }
                    } else {
                        throw C6670y.m25057a(this.f16312a, this.f16313b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C6670y.m25057a(this.f16312a, this.f16313b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: p.p$f */
    static final class C6648f<T> extends C6642p<T> {

        /* renamed from: a */
        private final String f16316a;

        /* renamed from: b */
        private final C6614h<T, String> f16317b;

        C6648f(String str, C6614h<T, String> hVar) {
            this.f16316a = (String) Objects.requireNonNull(str, "name == null");
            this.f16317b = hVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo17101a(C6659r rVar, @Nullable T t) {
            if (t != null) {
                String str = (String) this.f16317b.mo17068a(t);
                if (str != null) {
                    rVar.mo17116a(this.f16316a, str);
                }
            }
        }
    }

    /* renamed from: p.p$g */
    static final class C6649g<T> extends C6642p<T> {

        /* renamed from: a */
        private final Method f16318a;

        /* renamed from: b */
        private final int f16319b;

        /* renamed from: c */
        private final C6445s f16320c;

        /* renamed from: d */
        private final C6614h<T, C6225a0> f16321d;

        C6649g(Method method, int i, C6445s sVar, C6614h<T, C6225a0> hVar) {
            this.f16318a = method;
            this.f16319b = i;
            this.f16320c = sVar;
            this.f16321d = hVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo17101a(C6659r rVar, @Nullable T t) {
            if (t != null) {
                try {
                    rVar.mo17119a(this.f16320c, (C6225a0) this.f16321d.mo17068a(t));
                } catch (IOException e) {
                    Method method = this.f16318a;
                    int i = this.f16319b;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw C6670y.m25057a(method, i, sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: p.p$h */
    static final class C6650h<T> extends C6642p<Map<String, T>> {

        /* renamed from: a */
        private final Method f16322a;

        /* renamed from: b */
        private final int f16323b;

        /* renamed from: c */
        private final C6614h<T, C6225a0> f16324c;

        /* renamed from: d */
        private final String f16325d;

        C6650h(Method method, int i, C6614h<T, C6225a0> hVar, String str) {
            this.f16322a = method;
            this.f16323b = i;
            this.f16324c = hVar;
            this.f16325d = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo17101a(C6659r rVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("form-data; name=\"");
                            sb.append(str);
                            sb.append("\"");
                            rVar.mo17119a(C6445s.m24256a("Content-Disposition", sb.toString(), "Content-Transfer-Encoding", this.f16325d), (C6225a0) this.f16324c.mo17068a(value));
                        } else {
                            Method method = this.f16322a;
                            int i = this.f16323b;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Part map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw C6670y.m25057a(method, i, sb2.toString(), new Object[0]);
                        }
                    } else {
                        throw C6670y.m25057a(this.f16322a, this.f16323b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C6670y.m25057a(this.f16322a, this.f16323b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: p.p$i */
    static final class C6651i<T> extends C6642p<T> {

        /* renamed from: a */
        private final Method f16326a;

        /* renamed from: b */
        private final int f16327b;

        /* renamed from: c */
        private final String f16328c;

        /* renamed from: d */
        private final C6614h<T, String> f16329d;

        /* renamed from: e */
        private final boolean f16330e;

        C6651i(Method method, int i, String str, C6614h<T, String> hVar, boolean z) {
            this.f16326a = method;
            this.f16327b = i;
            this.f16328c = (String) Objects.requireNonNull(str, "name == null");
            this.f16329d = hVar;
            this.f16330e = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo17101a(C6659r rVar, @Nullable T t) {
            if (t != null) {
                rVar.mo17121b(this.f16328c, (String) this.f16329d.mo17068a(t), this.f16330e);
                return;
            }
            Method method = this.f16326a;
            int i = this.f16327b;
            StringBuilder sb = new StringBuilder();
            sb.append("Path parameter \"");
            sb.append(this.f16328c);
            sb.append("\" value must not be null.");
            throw C6670y.m25057a(method, i, sb.toString(), new Object[0]);
        }
    }

    /* renamed from: p.p$j */
    static final class C6652j<T> extends C6642p<T> {

        /* renamed from: a */
        private final String f16331a;

        /* renamed from: b */
        private final C6614h<T, String> f16332b;

        /* renamed from: c */
        private final boolean f16333c;

        C6652j(String str, C6614h<T, String> hVar, boolean z) {
            this.f16331a = (String) Objects.requireNonNull(str, "name == null");
            this.f16332b = hVar;
            this.f16333c = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo17101a(C6659r rVar, @Nullable T t) {
            if (t != null) {
                String str = (String) this.f16332b.mo17068a(t);
                if (str != null) {
                    rVar.mo17122c(this.f16331a, str, this.f16333c);
                }
            }
        }
    }

    /* renamed from: p.p$k */
    static final class C6653k<T> extends C6642p<Map<String, T>> {

        /* renamed from: a */
        private final Method f16334a;

        /* renamed from: b */
        private final int f16335b;

        /* renamed from: c */
        private final C6614h<T, String> f16336c;

        /* renamed from: d */
        private final boolean f16337d;

        C6653k(Method method, int i, C6614h<T, String> hVar, boolean z) {
            this.f16334a = method;
            this.f16335b = i;
            this.f16336c = hVar;
            this.f16337d = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo17101a(C6659r rVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        String str2 = "'.";
                        if (value != null) {
                            String str3 = (String) this.f16336c.mo17068a(value);
                            if (str3 != null) {
                                rVar.mo17122c(str, str3, this.f16337d);
                            } else {
                                Method method = this.f16334a;
                                int i = this.f16335b;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Query map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.f16336c.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append(str2);
                                throw C6670y.m25057a(method, i, sb.toString(), new Object[0]);
                            }
                        } else {
                            Method method2 = this.f16334a;
                            int i2 = this.f16335b;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Query map contained null value for key '");
                            sb2.append(str);
                            sb2.append(str2);
                            throw C6670y.m25057a(method2, i2, sb2.toString(), new Object[0]);
                        }
                    } else {
                        throw C6670y.m25057a(this.f16334a, this.f16335b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C6670y.m25057a(this.f16334a, this.f16335b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: p.p$l */
    static final class C6654l<T> extends C6642p<T> {

        /* renamed from: a */
        private final C6614h<T, String> f16338a;

        /* renamed from: b */
        private final boolean f16339b;

        C6654l(C6614h<T, String> hVar, boolean z) {
            this.f16338a = hVar;
            this.f16339b = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo17101a(C6659r rVar, @Nullable T t) {
            if (t != null) {
                rVar.mo17122c((String) this.f16338a.mo17068a(t), null, this.f16339b);
            }
        }
    }

    /* renamed from: p.p$m */
    static final class C6655m extends C6642p<C6460c> {

        /* renamed from: a */
        static final C6655m f16340a = new C6655m();

        private C6655m() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo17101a(C6659r rVar, @Nullable C6460c cVar) {
            if (cVar != null) {
                rVar.mo17120a(cVar);
            }
        }
    }

    C6642p() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C6642p<Object> mo17100a() {
        return new C6644b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo17101a(C6659r rVar, @Nullable T t);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C6642p<Iterable<T>> mo17102b() {
        return new C6643a();
    }
}
