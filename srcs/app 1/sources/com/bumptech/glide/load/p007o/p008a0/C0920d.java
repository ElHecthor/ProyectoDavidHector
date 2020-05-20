package com.bumptech.glide.load.p007o.p008a0;

import com.bumptech.glide.load.p007o.p008a0.C0934m;
import com.bumptech.glide.p029t.C1310k;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.o.a0.d */
abstract class C0920d<T extends C0934m> {

    /* renamed from: a */
    private final Queue<T> f3460a = C1310k.m6165a(20);

    C0920d() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo4706a();

    /* renamed from: a */
    public void mo4708a(T t) {
        if (this.f3460a.size() < 20) {
            this.f3460a.offer(t);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public T mo4709b() {
        T t = (C0934m) this.f3460a.poll();
        return t == null ? mo4706a() : t;
    }
}
