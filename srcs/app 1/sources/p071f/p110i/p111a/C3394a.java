package p071f.p110i.p111a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: f.i.a.a */
public abstract class C3394a extends BaseAdapter implements Filterable, C3398a {

    /* renamed from: f */
    protected boolean f9606f;

    /* renamed from: g */
    protected boolean f9607g;

    /* renamed from: h */
    protected Cursor f9608h;

    /* renamed from: i */
    protected Context f9609i;

    /* renamed from: j */
    protected int f9610j;

    /* renamed from: k */
    protected C3395a f9611k;

    /* renamed from: l */
    protected DataSetObserver f9612l;

    /* renamed from: m */
    protected C3397b f9613m;

    /* renamed from: f.i.a.a$a */
    private class C3395a extends ContentObserver {
        C3395a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C3394a.this.mo10867b();
        }
    }

    /* renamed from: f.i.a.a$b */
    private class C3396b extends DataSetObserver {
        C3396b() {
        }

        public void onChanged() {
            C3394a aVar = C3394a.this;
            aVar.f9606f = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C3394a aVar = C3394a.this;
            aVar.f9606f = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public C3394a(Context context, Cursor cursor, boolean z) {
        mo10866a(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public Cursor mo10864a() {
        return this.f9608h;
    }

    /* renamed from: a */
    public abstract View mo10865a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10866a(Context context, Cursor cursor, int i) {
        C3396b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f9607g = true;
        } else {
            this.f9607g = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f9608h = cursor;
        this.f9606f = z;
        this.f9609i = context;
        this.f9610j = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f9611k = new C3395a();
            bVar = new C3396b();
        } else {
            bVar = null;
            this.f9611k = null;
        }
        this.f9612l = bVar;
        if (z) {
            C3395a aVar = this.f9611k;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f9612l;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo1574a(Cursor cursor) {
        Cursor c = mo10868c(cursor);
        if (c != null) {
            c.close();
        }
    }

    /* renamed from: a */
    public abstract void mo1575a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public abstract View mo1576b(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: b */
    public abstract CharSequence mo1577b(Cursor cursor);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10867b() {
        if (this.f9607g) {
            Cursor cursor = this.f9608h;
            if (cursor != null && !cursor.isClosed()) {
                this.f9606f = this.f9608h.requery();
            }
        }
    }

    /* renamed from: c */
    public Cursor mo10868c(Cursor cursor) {
        Cursor cursor2 = this.f9608h;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C3395a aVar = this.f9611k;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f9612l;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f9608h = cursor;
        if (cursor != null) {
            C3395a aVar2 = this.f9611k;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f9612l;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f9610j = cursor.getColumnIndexOrThrow("_id");
            this.f9606f = true;
            notifyDataSetChanged();
        } else {
            this.f9610j = -1;
            this.f9606f = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public int getCount() {
        if (this.f9606f) {
            Cursor cursor = this.f9608h;
            if (cursor != null) {
                return cursor.getCount();
            }
        }
        return 0;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f9606f) {
            return null;
        }
        this.f9608h.moveToPosition(i);
        if (view == null) {
            view = mo10865a(this.f9609i, this.f9608h, viewGroup);
        }
        mo1575a(view, this.f9609i, this.f9608h);
        return view;
    }

    public Filter getFilter() {
        if (this.f9613m == null) {
            this.f9613m = new C3397b(this);
        }
        return this.f9613m;
    }

    public Object getItem(int i) {
        if (this.f9606f) {
            Cursor cursor = this.f9608h;
            if (cursor != null) {
                cursor.moveToPosition(i);
                return this.f9608h;
            }
        }
        return null;
    }

    public long getItemId(int i) {
        if (this.f9606f) {
            Cursor cursor = this.f9608h;
            if (cursor != null && cursor.moveToPosition(i)) {
                return this.f9608h.getLong(this.f9610j);
            }
        }
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f9606f) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f9608h.moveToPosition(i)) {
            if (view == null) {
                view = mo1576b(this.f9609i, this.f9608h, viewGroup);
            }
            mo1575a(view, this.f9609i, this.f9608h);
            return view;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("couldn't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }
}
