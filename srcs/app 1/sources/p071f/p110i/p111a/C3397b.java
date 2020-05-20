package p071f.p110i.p111a;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: f.i.a.b */
class C3397b extends Filter {

    /* renamed from: a */
    C3398a f9616a;

    /* renamed from: f.i.a.b$a */
    interface C3398a {
        /* renamed from: a */
        Cursor mo10864a();

        /* renamed from: a */
        Cursor mo1571a(CharSequence charSequence);

        /* renamed from: a */
        void mo1574a(Cursor cursor);

        /* renamed from: b */
        CharSequence mo1577b(Cursor cursor);
    }

    C3397b(C3398a aVar) {
        this.f9616a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f9616a.mo1577b((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f9616a.mo1571a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
        } else {
            filterResults.count = 0;
            a = null;
        }
        filterResults.values = a;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a = this.f9616a.mo10864a();
        Object obj = filterResults.values;
        if (obj != null && obj != a) {
            this.f9616a.mo1574a((Cursor) obj);
        }
    }
}
