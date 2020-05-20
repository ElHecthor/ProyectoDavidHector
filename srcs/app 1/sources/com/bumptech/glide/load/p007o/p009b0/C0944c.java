package com.bumptech.glide.load.p007o.p009b0;

import com.bumptech.glide.p029t.C1309j;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.o.b0.c */
final class C0944c {

    /* renamed from: a */
    private final Map<String, C0945a> f3498a = new HashMap();

    /* renamed from: b */
    private final C0946b f3499b = new C0946b();

    /* renamed from: com.bumptech.glide.load.o.b0.c$a */
    private static class C0945a {

        /* renamed from: a */
        final Lock f3500a = new ReentrantLock();

        /* renamed from: b */
        int f3501b;

        C0945a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b0.c$b */
    private static class C0946b {

        /* renamed from: a */
        private final Queue<C0945a> f3502a = new ArrayDeque();

        C0946b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0945a mo4744a() {
            C0945a aVar;
            synchronized (this.f3502a) {
                aVar = (C0945a) this.f3502a.poll();
            }
            return aVar == null ? new C0945a() : aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4745a(C0945a aVar) {
            synchronized (this.f3502a) {
                if (this.f3502a.size() < 10) {
                    this.f3502a.offer(aVar);
                }
            }
        }
    }

    C0944c() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4742a(String str) {
        C0945a aVar;
        synchronized (this) {
            aVar = (C0945a) this.f3498a.get(str);
            if (aVar == null) {
                aVar = this.f3499b.mo4744a();
                this.f3498a.put(str, aVar);
            }
            aVar.f3501b++;
        }
        aVar.f3500a.lock();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4743b(String str) {
        C0945a aVar;
        synchronized (this) {
            Object obj = this.f3498a.get(str);
            C1309j.m6149a(obj);
            aVar = (C0945a) obj;
            if (aVar.f3501b >= 1) {
                int i = aVar.f3501b - 1;
                aVar.f3501b = i;
                if (i == 0) {
                    C0945a aVar2 = (C0945a) this.f3498a.remove(str);
                    if (aVar2.equals(aVar)) {
                        this.f3499b.mo4745a(aVar2);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Removed the wrong lock, expected to remove: ");
                        sb.append(aVar);
                        sb.append(", but actually removed: ");
                        sb.append(aVar2);
                        sb.append(", safeKey: ");
                        sb.append(str);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot release a lock that is not held, safeKey: ");
                sb2.append(str);
                sb2.append(", interestedThreads: ");
                sb2.append(aVar.f3501b);
                throw new IllegalStateException(sb2.toString());
            }
        }
        aVar.f3500a.unlock();
    }
}
