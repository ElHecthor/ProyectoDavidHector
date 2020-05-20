package p071f.p144y.p145a;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: f.y.a.a */
public abstract class C3658a {

    /* renamed from: a */
    private final DataSetObservable f10293a = new DataSetObservable();

    /* renamed from: a */
    public abstract int mo9887a();

    /* renamed from: a */
    public abstract int mo9888a(Object obj);

    /* renamed from: a */
    public CharSequence mo11569a(int i) {
        return null;
    }

    /* renamed from: a */
    public abstract Object mo9889a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public void mo11570a(DataSetObserver dataSetObserver) {
        this.f10293a.registerObserver(dataSetObserver);
    }

    /* renamed from: a */
    public void mo9890a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Deprecated
    /* renamed from: a */
    public void mo11571a(View view) {
    }

    @Deprecated
    /* renamed from: a */
    public void mo11572a(View view, int i, Object obj) {
    }

    /* renamed from: a */
    public void mo11573a(ViewGroup viewGroup) {
        mo11571a((View) viewGroup);
    }

    /* renamed from: a */
    public abstract void mo9891a(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: a */
    public abstract boolean mo9893a(View view, Object obj);

    /* renamed from: b */
    public float mo11574b(int i) {
        return 1.0f;
    }

    /* renamed from: b */
    public abstract Parcelable mo9894b();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11575b(DataSetObserver dataSetObserver) {
        synchronized (this) {
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo11576b(View view) {
    }

    /* renamed from: b */
    public void mo11577b(ViewGroup viewGroup) {
        mo11576b((View) viewGroup);
    }

    /* renamed from: b */
    public void mo11578b(ViewGroup viewGroup, int i, Object obj) {
        mo11572a((View) viewGroup, i, obj);
    }

    /* renamed from: c */
    public void mo11579c(DataSetObserver dataSetObserver) {
        this.f10293a.unregisterObserver(dataSetObserver);
    }
}
