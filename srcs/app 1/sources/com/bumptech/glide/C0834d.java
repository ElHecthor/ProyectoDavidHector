package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.C0832c.C0833a;
import com.bumptech.glide.load.p007o.C0995k;
import com.bumptech.glide.load.p007o.p008a0.C0916b;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import com.bumptech.glide.load.p007o.p008a0.C0922f;
import com.bumptech.glide.load.p007o.p008a0.C0927j;
import com.bumptech.glide.load.p007o.p008a0.C0930k;
import com.bumptech.glide.load.p007o.p009b0.C0940a.C0941a;
import com.bumptech.glide.load.p007o.p009b0.C0950f;
import com.bumptech.glide.load.p007o.p009b0.C0952g;
import com.bumptech.glide.load.p007o.p009b0.C0953h;
import com.bumptech.glide.load.p007o.p009b0.C0955i;
import com.bumptech.glide.load.p007o.p009b0.C0955i.C0956a;
import com.bumptech.glide.load.p007o.p010c0.C0963a;
import com.bumptech.glide.p022o.C1236d;
import com.bumptech.glide.p022o.C1239f;
import com.bumptech.glide.p022o.C1246l;
import com.bumptech.glide.p022o.C1246l.C1248b;
import com.bumptech.glide.p025r.C1272e;
import com.bumptech.glide.p025r.C1273f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p071f.p088e.C3162a;

/* renamed from: com.bumptech.glide.d */
public final class C0834d {

    /* renamed from: a */
    private final Map<Class<?>, C0855l<?, ?>> f3278a = new C3162a();

    /* renamed from: b */
    private C0995k f3279b;

    /* renamed from: c */
    private C0921e f3280c;

    /* renamed from: d */
    private C0916b f3281d;

    /* renamed from: e */
    private C0953h f3282e;

    /* renamed from: f */
    private C0963a f3283f;

    /* renamed from: g */
    private C0963a f3284g;

    /* renamed from: h */
    private C0941a f3285h;

    /* renamed from: i */
    private C0955i f3286i;

    /* renamed from: j */
    private C1236d f3287j;

    /* renamed from: k */
    private int f3288k = 4;

    /* renamed from: l */
    private C0833a f3289l = new C0835a(this);

    /* renamed from: m */
    private C1248b f3290m;

    /* renamed from: n */
    private C0963a f3291n;

    /* renamed from: o */
    private boolean f3292o;

    /* renamed from: p */
    private List<C1272e<Object>> f3293p;

    /* renamed from: q */
    private boolean f3294q;

    /* renamed from: r */
    private boolean f3295r;

    /* renamed from: com.bumptech.glide.d$a */
    class C0835a implements C0833a {
        C0835a(C0834d dVar) {
        }

        /* renamed from: a */
        public C1273f mo4530a() {
            return new C1273f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0832c mo4531a(Context context) {
        Context context2 = context;
        if (this.f3283f == null) {
            this.f3283f = C0963a.m4874g();
        }
        if (this.f3284g == null) {
            this.f3284g = C0963a.m4872e();
        }
        if (this.f3291n == null) {
            this.f3291n = C0963a.m4870c();
        }
        if (this.f3286i == null) {
            this.f3286i = new C0956a(context2).mo4760a();
        }
        if (this.f3287j == null) {
            this.f3287j = new C1239f();
        }
        if (this.f3280c == null) {
            int b = this.f3286i.mo4758b();
            if (b > 0) {
                this.f3280c = new C0930k((long) b);
            } else {
                this.f3280c = new C0922f();
            }
        }
        if (this.f3281d == null) {
            this.f3281d = new C0927j(this.f3286i.mo4757a());
        }
        if (this.f3282e == null) {
            this.f3282e = new C0952g((long) this.f3286i.mo4759c());
        }
        if (this.f3285h == null) {
            this.f3285h = new C0950f(context2);
        }
        if (this.f3279b == null) {
            C0995k kVar = new C0995k(this.f3282e, this.f3285h, this.f3284g, this.f3283f, C0963a.m4875h(), this.f3291n, this.f3292o);
            this.f3279b = kVar;
        }
        List<C1272e<Object>> list = this.f3293p;
        this.f3293p = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        C0832c cVar = new C0832c(context, this.f3279b, this.f3282e, this.f3280c, this.f3281d, new C1246l(this.f3290m), this.f3287j, this.f3288k, this.f3289l, this.f3278a, this.f3293p, this.f3294q, this.f3295r);
        return cVar;
    }

    /* renamed from: a */
    public C0834d mo4532a(C0941a aVar) {
        this.f3285h = aVar;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4533a(C1248b bVar) {
        this.f3290m = bVar;
    }
}
