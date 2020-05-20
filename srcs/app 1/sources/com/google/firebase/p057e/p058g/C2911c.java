package com.google.firebase.p057e.p058g;

import com.google.firebase.p057e.C2903a;
import com.google.firebase.p057e.C2905c;
import com.google.firebase.p057e.C2907e;
import com.google.firebase.p057e.C2908f;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.firebase.e.g.c */
public final class C2911c {

    /* renamed from: c */
    private static final C2907e<String> f8394c = C2909a.m12010a();

    /* renamed from: d */
    private static final C2907e<Boolean> f8395d = C2910b.m12012a();

    /* renamed from: e */
    private static final C2913b f8396e = new C2913b(null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<Class<?>, C2905c<?>> f8397a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<Class<?>, C2907e<?>> f8398b = new HashMap();

    /* renamed from: com.google.firebase.e.g.c$a */
    class C2912a implements C2903a {
        C2912a() {
        }

        /* renamed from: a */
        public String mo9584a(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo9585a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        /* renamed from: a */
        public void mo9585a(Object obj, Writer writer) {
            C2914d dVar = new C2914d(writer, C2911c.this.f8397a, C2911c.this.f8398b);
            dVar.mo9598a(obj);
            dVar.mo9600a();
        }
    }

    /* renamed from: com.google.firebase.e.g.c$b */
    private static final class C2913b implements C2907e<Date> {

        /* renamed from: a */
        private static final DateFormat f8400a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f8400a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private C2913b() {
        }

        /* synthetic */ C2913b(C2912a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo9589a(Date date, C2908f fVar) {
            fVar.mo9590a(f8400a.format(date));
        }
    }

    public C2911c() {
        mo9594a(String.class, f8394c);
        mo9594a(Boolean.class, f8395d);
        mo9594a(Date.class, (C2907e<? super T>) f8396e);
    }

    /* renamed from: a */
    public C2903a mo9592a() {
        return new C2912a();
    }

    /* renamed from: a */
    public <T> C2911c mo9593a(Class<T> cls, C2905c<? super T> cVar) {
        if (!this.f8397a.containsKey(cls)) {
            this.f8397a.put(cls, cVar);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Encoder already registered for ");
        sb.append(cls.getName());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public <T> C2911c mo9594a(Class<T> cls, C2907e<? super T> eVar) {
        if (!this.f8398b.containsKey(cls)) {
            this.f8398b.put(cls, eVar);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Encoder already registered for ");
        sb.append(cls.getName());
        throw new IllegalArgumentException(sb.toString());
    }
}
