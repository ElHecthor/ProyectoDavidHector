package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.C0832c.C0833a;
import com.bumptech.glide.load.p007o.C0995k;
import com.bumptech.glide.load.p007o.p008a0.C0916b;
import com.bumptech.glide.p025r.C1272e;
import com.bumptech.glide.p025r.C1273f;
import com.bumptech.glide.p025r.p026j.C1283f;
import com.bumptech.glide.p025r.p026j.C1286i;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.e */
public class C0836e extends ContextWrapper {

    /* renamed from: k */
    static final C0855l<?, ?> f3296k = new C0831b();

    /* renamed from: a */
    private final C0916b f3297a;

    /* renamed from: b */
    private final C0840i f3298b;

    /* renamed from: c */
    private final C1283f f3299c;

    /* renamed from: d */
    private final C0833a f3300d;

    /* renamed from: e */
    private final List<C1272e<Object>> f3301e;

    /* renamed from: f */
    private final Map<Class<?>, C0855l<?, ?>> f3302f;

    /* renamed from: g */
    private final C0995k f3303g;

    /* renamed from: h */
    private final boolean f3304h;

    /* renamed from: i */
    private final int f3305i;

    /* renamed from: j */
    private C1273f f3306j;

    public C0836e(Context context, C0916b bVar, C0840i iVar, C1283f fVar, C0833a aVar, Map<Class<?>, C0855l<?, ?>> map, List<C1272e<Object>> list, C0995k kVar, boolean z, int i) {
        super(context.getApplicationContext());
        this.f3297a = bVar;
        this.f3298b = iVar;
        this.f3299c = fVar;
        this.f3300d = aVar;
        this.f3301e = list;
        this.f3302f = map;
        this.f3303g = kVar;
        this.f3304h = z;
        this.f3305i = i;
    }

    /* renamed from: a */
    public <T> C0855l<?, T> mo4534a(Class<T> cls) {
        C0855l<?, T> lVar = (C0855l) this.f3302f.get(cls);
        if (lVar == null) {
            for (Entry entry : this.f3302f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (C0855l) entry.getValue();
                }
            }
        }
        return lVar == null ? f3296k : lVar;
    }

    /* renamed from: a */
    public C0916b mo4535a() {
        return this.f3297a;
    }

    /* renamed from: a */
    public <X> C1286i<ImageView, X> mo4536a(ImageView imageView, Class<X> cls) {
        return this.f3299c.mo5327a(imageView, cls);
    }

    /* renamed from: b */
    public List<C1272e<Object>> mo4537b() {
        return this.f3301e;
    }

    /* renamed from: c */
    public synchronized C1273f mo4538c() {
        if (this.f3306j == null) {
            this.f3306j = (C1273f) this.f3300d.mo4530a().mo5252I();
        }
        return this.f3306j;
    }

    /* renamed from: d */
    public C0995k mo4539d() {
        return this.f3303g;
    }

    /* renamed from: e */
    public int mo4540e() {
        return this.f3305i;
    }

    /* renamed from: f */
    public C0840i mo4541f() {
        return this.f3298b;
    }

    /* renamed from: g */
    public boolean mo4542g() {
        return this.f3304h;
    }
}
