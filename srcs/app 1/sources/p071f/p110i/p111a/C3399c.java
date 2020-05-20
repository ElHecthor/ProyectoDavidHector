package p071f.p110i.p111a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: f.i.a.c */
public abstract class C3399c extends C3394a {

    /* renamed from: n */
    private int f9617n;

    /* renamed from: o */
    private int f9618o;

    /* renamed from: p */
    private LayoutInflater f9619p;

    @Deprecated
    public C3399c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f9618o = i;
        this.f9617n = i;
        this.f9619p = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo10865a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f9619p.inflate(this.f9618o, viewGroup, false);
    }

    /* renamed from: b */
    public View mo1576b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f9619p.inflate(this.f9617n, viewGroup, false);
    }
}
