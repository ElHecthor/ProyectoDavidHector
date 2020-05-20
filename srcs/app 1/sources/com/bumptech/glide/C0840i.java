package com.bumptech.glide;

import com.bumptech.glide.load.C0859d;
import com.bumptech.glide.load.C0875k;
import com.bumptech.glide.load.C0876l;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p005n.C0883e;
import com.bumptech.glide.load.p005n.C0883e.C0884a;
import com.bumptech.glide.load.p005n.C0885f;
import com.bumptech.glide.load.p007o.C0987i;
import com.bumptech.glide.load.p007o.C1017t;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p011p.C1069n;
import com.bumptech.glide.load.p011p.C1071o;
import com.bumptech.glide.load.p011p.C1072p;
import com.bumptech.glide.load.p013q.p019i.C1213e;
import com.bumptech.glide.load.p013q.p019i.C1214f;
import com.bumptech.glide.p024q.C1258a;
import com.bumptech.glide.p024q.C1260b;
import com.bumptech.glide.p024q.C1261c;
import com.bumptech.glide.p024q.C1262d;
import com.bumptech.glide.p024q.C1263e;
import com.bumptech.glide.p024q.C1265f;
import com.bumptech.glide.p029t.p030l.C1312a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p071f.p097h.p107l.C3318e;

/* renamed from: com.bumptech.glide.i */
public class C0840i {

    /* renamed from: a */
    private final C1072p f3316a;

    /* renamed from: b */
    private final C1258a f3317b;

    /* renamed from: c */
    private final C1263e f3318c;

    /* renamed from: d */
    private final C1265f f3319d;

    /* renamed from: e */
    private final C0885f f3320e;

    /* renamed from: f */
    private final C1214f f3321f;

    /* renamed from: g */
    private final C1260b f3322g;

    /* renamed from: h */
    private final C1262d f3323h = new C1262d();

    /* renamed from: i */
    private final C1261c f3324i = new C1261c();

    /* renamed from: j */
    private final C3318e<List<Throwable>> f3325j;

    /* renamed from: com.bumptech.glide.i$a */
    public static class C0841a extends RuntimeException {
        public C0841a(String str) {
            super(str);
        }
    }

    /* renamed from: com.bumptech.glide.i$b */
    public static final class C0842b extends C0841a {
        public C0842b() {
            super("Failed to find image header parser.");
        }
    }

    /* renamed from: com.bumptech.glide.i$c */
    public static class C0843c extends C0841a {
        public C0843c(Class<?> cls, Class<?> cls2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any ModelLoaders for model: ");
            sb.append(cls);
            sb.append(" and data: ");
            sb.append(cls2);
            super(sb.toString());
        }

        public C0843c(Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any ModelLoaders registered for model class: ");
            sb.append(obj.getClass());
            super(sb.toString());
        }

        public <M> C0843c(M m, List<C1069n<M, ?>> list) {
            StringBuilder sb = new StringBuilder();
            sb.append("Found ModelLoaders for model class: ");
            sb.append(list);
            sb.append(", but none that handle this specific model instance: ");
            sb.append(m);
            super(sb.toString());
        }
    }

    /* renamed from: com.bumptech.glide.i$d */
    public static class C0844d extends C0841a {
        public C0844d(Class<?> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find result encoder for resource class: ");
            sb.append(cls);
            sb.append(", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
            super(sb.toString());
        }
    }

    /* renamed from: com.bumptech.glide.i$e */
    public static class C0845e extends C0841a {
        public C0845e(Class<?> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find source encoder for data class: ");
            sb.append(cls);
            super(sb.toString());
        }
    }

    public C0840i() {
        C3318e<List<Throwable>> b = C1312a.m6179b();
        this.f3325j = b;
        this.f3316a = new C1072p(b);
        this.f3317b = new C1258a();
        this.f3318c = new C1263e();
        this.f3319d = new C1265f();
        this.f3320e = new C0885f();
        this.f3321f = new C1214f();
        this.f3322g = new C1260b();
        mo4551a(Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
    }

    /* renamed from: c */
    private <Data, TResource, Transcode> List<C0987i<Data, TResource, Transcode>> m4479c(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f3318c.mo5239b(cls, cls2)) {
            for (Class cls5 : this.f3321f.mo5140b(cls4, cls3)) {
                C0987i iVar = new C0987i(cls, cls4, cls5, this.f3318c.mo5236a(cls, cls4), this.f3321f.mo5138a(cls4, cls5), this.f3325j);
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C0840i mo4543a(ImageHeaderParser imageHeaderParser) {
        this.f3322g.mo5230a(imageHeaderParser);
        return this;
    }

    /* renamed from: a */
    public C0840i mo4544a(C0884a<?> aVar) {
        this.f3320e.mo4652a(aVar);
        return this;
    }

    /* renamed from: a */
    public <Data> C0840i mo4545a(Class<Data> cls, C0859d<Data> dVar) {
        this.f3317b.mo5227a(cls, dVar);
        return this;
    }

    /* renamed from: a */
    public <TResource> C0840i mo4546a(Class<TResource> cls, C0876l<TResource> lVar) {
        this.f3319d.mo5242a(cls, lVar);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource> C0840i mo4547a(Class<Data> cls, Class<TResource> cls2, C0875k<Data, TResource> kVar) {
        mo4550a("legacy_append", cls, cls2, kVar);
        return this;
    }

    /* renamed from: a */
    public <Model, Data> C0840i mo4548a(Class<Model> cls, Class<Data> cls2, C1071o<Model, Data> oVar) {
        this.f3316a.mo4961a(cls, cls2, oVar);
        return this;
    }

    /* renamed from: a */
    public <TResource, Transcode> C0840i mo4549a(Class<TResource> cls, Class<Transcode> cls2, C1213e<TResource, Transcode> eVar) {
        this.f3321f.mo5139a(cls, cls2, eVar);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource> C0840i mo4550a(String str, Class<Data> cls, Class<TResource> cls2, C0875k<Data, TResource> kVar) {
        this.f3318c.mo5237a(str, kVar, cls, cls2);
        return this;
    }

    /* renamed from: a */
    public final C0840i mo4551a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f3318c.mo5238a((List<String>) arrayList);
        return this;
    }

    /* renamed from: a */
    public <X> C0876l<X> mo4552a(C1020v<X> vVar) {
        C0876l<X> a = this.f3319d.mo5241a(vVar.mo4881c());
        if (a != null) {
            return a;
        }
        throw new C0844d(vVar.mo4881c());
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C1017t<Data, TResource, Transcode> mo4553a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1017t<Data, TResource, Transcode> a = this.f3324i.mo5231a(cls, cls2, cls3);
        if (this.f3324i.mo5233a(a)) {
            return null;
        }
        if (a == null) {
            List c = m4479c(cls, cls2, cls3);
            if (c.isEmpty()) {
                a = null;
            } else {
                a = new C1017t<>(cls, cls2, cls3, c, this.f3325j);
            }
            this.f3324i.mo5232a(cls, cls2, cls3, a);
        }
        return a;
    }

    /* renamed from: a */
    public List<ImageHeaderParser> mo4554a() {
        List<ImageHeaderParser> a = this.f3322g.mo5229a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new C0842b();
    }

    /* renamed from: a */
    public <Model> List<C1069n<Model, ?>> mo4555a(Model model) {
        return this.f3316a.mo4960a(model);
    }

    /* renamed from: b */
    public <Model, Data> C0840i mo4556b(Class<Model> cls, Class<Data> cls2, C1071o<? extends Model, ? extends Data> oVar) {
        this.f3316a.mo4962b(cls, cls2, oVar);
        return this;
    }

    /* renamed from: b */
    public <X> C0883e<X> mo4557b(X x) {
        return this.f3320e.mo4651a(x);
    }

    /* renamed from: b */
    public <Model, TResource, Transcode> List<Class<?>> mo4558b(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.f3323h.mo5234a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            for (Class b : this.f3316a.mo4959a(cls)) {
                for (Class cls4 : this.f3318c.mo5239b(b, cls2)) {
                    if (!this.f3321f.mo5140b(cls4, cls3).isEmpty() && !a.contains(cls4)) {
                        a.add(cls4);
                    }
                }
            }
            this.f3323h.mo5235a(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    /* renamed from: b */
    public boolean mo4559b(C1020v<?> vVar) {
        return this.f3319d.mo5241a(vVar.mo4881c()) != null;
    }

    /* renamed from: c */
    public <X> C0859d<X> mo4560c(X x) {
        C0859d<X> a = this.f3317b.mo5226a(x.getClass());
        if (a != null) {
            return a;
        }
        throw new C0845e(x.getClass());
    }
}
