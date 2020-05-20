package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.s */
public class C1809s extends AbstractList<C1797q> {

    /* renamed from: l */
    private static AtomicInteger f5417l = new AtomicInteger();

    /* renamed from: f */
    private Handler f5418f;

    /* renamed from: g */
    private List<C1797q> f5419g = new ArrayList();

    /* renamed from: h */
    private int f5420h = 0;

    /* renamed from: i */
    private final String f5421i = Integer.valueOf(f5417l.incrementAndGet()).toString();

    /* renamed from: j */
    private List<C1810a> f5422j = new ArrayList();

    /* renamed from: k */
    private String f5423k;

    /* renamed from: com.facebook.s$a */
    public interface C1810a {
        /* renamed from: a */
        void mo5726a(C1809s sVar);
    }

    /* renamed from: com.facebook.s$b */
    public interface C1811b extends C1810a {
        /* renamed from: a */
        void mo6236a(C1809s sVar, long j, long j2);
    }

    public C1809s(Collection<C1797q> collection) {
        this.f5419g = new ArrayList(collection);
    }

    public C1809s(C1797q... qVarArr) {
        this.f5419g = Arrays.asList(qVarArr);
    }

    /* renamed from: a */
    public final void add(int i, C1797q qVar) {
        this.f5419g.add(i, qVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6215a(Handler handler) {
        this.f5418f = handler;
    }

    /* renamed from: a */
    public void mo6216a(C1810a aVar) {
        if (!this.f5422j.contains(aVar)) {
            this.f5422j.add(aVar);
        }
    }

    /* renamed from: a */
    public final boolean add(C1797q qVar) {
        return this.f5419g.add(qVar);
    }

    /* renamed from: b */
    public final C1797q set(int i, C1797q qVar) {
        return (C1797q) this.f5419g.set(i, qVar);
    }

    /* renamed from: c */
    public final List<C1842t> mo6221c() {
        return mo6223d();
    }

    public final void clear() {
        this.f5419g.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public List<C1842t> mo6223d() {
        return C1797q.m7769a(this);
    }

    /* renamed from: e */
    public final C1808r mo6224e() {
        return mo6225f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C1808r mo6225f() {
        return C1797q.m7784b(this);
    }

    /* renamed from: g */
    public final String mo6226g() {
        return this.f5423k;
    }

    public final C1797q get(int i) {
        return (C1797q) this.f5419g.get(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final Handler mo6228h() {
        return this.f5418f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final List<C1810a> mo6229i() {
        return this.f5422j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final String mo6230k() {
        return this.f5421i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final List<C1797q> mo6231l() {
        return this.f5419g;
    }

    /* renamed from: m */
    public int mo6232m() {
        return this.f5420h;
    }

    public final C1797q remove(int i) {
        return (C1797q) this.f5419g.remove(i);
    }

    public final int size() {
        return this.f5419g.size();
    }
}
