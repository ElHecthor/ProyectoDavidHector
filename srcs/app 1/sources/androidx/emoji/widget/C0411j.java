package androidx.emoji.widget;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p071f.p097h.p107l.C3321h;
import p071f.p115k.p117c.C3434d;

/* renamed from: androidx.emoji.widget.j */
public final class C0411j extends SpannableStringBuilder {

    /* renamed from: f */
    private final Class<?> f1852f;

    /* renamed from: g */
    private final List<C0412a> f1853g = new ArrayList();

    /* renamed from: androidx.emoji.widget.j$a */
    private static class C0412a implements TextWatcher, SpanWatcher {

        /* renamed from: f */
        final Object f1854f;

        /* renamed from: g */
        private final AtomicInteger f1855g = new AtomicInteger(0);

        C0412a(Object obj) {
            this.f1854f = obj;
        }

        /* renamed from: a */
        private boolean m2092a(Object obj) {
            return obj instanceof C3434d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2453a() {
            this.f1855g.incrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f1854f).afterTextChanged(editable);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo2455b() {
            this.f1855g.decrementAndGet();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f1854f).beforeTextChanged(charSequence, i, i2, i3);
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f1855g.get() <= 0 || !m2092a(obj)) {
                ((SpanWatcher) this.f1854f).onSpanAdded(spannable, obj, i, i2);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            if (this.f1855g.get() <= 0 || !m2092a(obj)) {
                ((SpanWatcher) this.f1854f).onSpanChanged(spannable, obj, i, i2, i3, i4);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f1855g.get() <= 0 || !m2092a(obj)) {
                ((SpanWatcher) this.f1854f).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f1854f).onTextChanged(charSequence, i, i2, i3);
        }
    }

    C0411j(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        C3321h.m13544a(cls, (Object) "watcherClass cannot be null");
        this.f1852f = cls;
    }

    C0411j(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        C3321h.m13544a(cls, (Object) "watcherClass cannot be null");
        this.f1852f = cls;
    }

    /* renamed from: a */
    private C0412a m2083a(Object obj) {
        for (int i = 0; i < this.f1853g.size(); i++) {
            C0412a aVar = (C0412a) this.f1853g.get(i);
            if (aVar.f1854f == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    static C0411j m2084a(Class<?> cls, CharSequence charSequence) {
        return new C0411j(cls, charSequence);
    }

    /* renamed from: a */
    private boolean m2085a(Class<?> cls) {
        return this.f1852f == cls;
    }

    /* renamed from: b */
    private boolean m2086b(Object obj) {
        return obj != null && m2085a(obj.getClass());
    }

    /* renamed from: c */
    private void m2087c() {
        for (int i = 0; i < this.f1853g.size(); i++) {
            ((C0412a) this.f1853g.get(i)).mo2453a();
        }
    }

    /* renamed from: d */
    private void m2088d() {
        for (int i = 0; i < this.f1853g.size(); i++) {
            ((C0412a) this.f1853g.get(i)).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: e */
    private void m2089e() {
        for (int i = 0; i < this.f1853g.size(); i++) {
            ((C0412a) this.f1853g.get(i)).mo2455b();
        }
    }

    /* renamed from: a */
    public void mo2434a() {
        m2087c();
    }

    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    /* renamed from: b */
    public void mo2439b() {
        m2089e();
        m2088d();
    }

    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public int getSpanEnd(Object obj) {
        if (m2086b(obj)) {
            Object a = m2083a(obj);
            if (a != null) {
                obj = a;
            }
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        if (m2086b(obj)) {
            Object a = m2083a(obj);
            if (a != null) {
                obj = a;
            }
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        if (m2086b(obj)) {
            Object a = m2083a(obj);
            if (a != null) {
                obj = a;
            }
        }
        return super.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!m2085a(cls)) {
            return super.getSpans(i, i2, cls);
        }
        C0412a[] aVarArr = (C0412a[]) super.getSpans(i, i2, C0412a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            tArr[i3] = aVarArr[i3].f1854f;
        }
        return tArr;
    }

    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class, code=java.lang.Class<androidx.emoji.widget.j$a>, for r4v0, types: [java.lang.Class] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int nextSpanTransition(int r2, int r3, java.lang.Class<androidx.emoji.widget.C0411j.C0412a> r4) {
        /*
            r1 = this;
            boolean r0 = r1.m2085a(r4)
            if (r0 == 0) goto L_0x0008
            java.lang.Class<androidx.emoji.widget.j$a> r4 = androidx.emoji.widget.C0411j.C0412a.class
        L_0x0008:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji.widget.C0411j.nextSpanTransition(int, int, java.lang.Class):int");
    }

    public void removeSpan(Object obj) {
        Object obj2;
        if (m2086b(obj)) {
            obj2 = m2083a(obj);
            if (obj2 != null) {
                obj = obj2;
            }
        } else {
            obj2 = null;
        }
        super.removeSpan(obj);
        if (obj2 != null) {
            this.f1853g.remove(obj2);
        }
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m2087c();
        super.replace(i, i2, charSequence);
        m2089e();
        return this;
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m2087c();
        super.replace(i, i2, charSequence, i3, i4);
        m2089e();
        return this;
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (m2086b(obj)) {
            Object aVar = new C0412a(obj);
            this.f1853g.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public CharSequence subSequence(int i, int i2) {
        return new C0411j(this.f1852f, this, i, i2);
    }
}
