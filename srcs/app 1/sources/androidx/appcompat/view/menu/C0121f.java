package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0139n.C0140a;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
public class C0121f extends BaseAdapter {

    /* renamed from: f */
    C0122g f510f;

    /* renamed from: g */
    private int f511g = -1;

    /* renamed from: h */
    private boolean f512h;

    /* renamed from: i */
    private final boolean f513i;

    /* renamed from: j */
    private final LayoutInflater f514j;

    /* renamed from: k */
    private final int f515k;

    public C0121f(C0122g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f513i = z;
        this.f514j = layoutInflater;
        this.f510f = gVar;
        this.f515k = i;
        mo567a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo567a() {
        C0126i f = this.f510f.mo623f();
        if (f != null) {
            ArrayList j = this.f510f.mo631j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (((C0126i) j.get(i)) == f) {
                    this.f511g = i;
                    return;
                }
            }
        }
        this.f511g = -1;
    }

    /* renamed from: a */
    public void mo568a(boolean z) {
        this.f512h = z;
    }

    /* renamed from: b */
    public C0122g mo569b() {
        return this.f510f;
    }

    public int getCount() {
        ArrayList j = this.f513i ? this.f510f.mo631j() : this.f510f.mo635n();
        int i = this.f511g;
        int size = j.size();
        return i < 0 ? size : size - 1;
    }

    public C0126i getItem(int i) {
        ArrayList j = this.f513i ? this.f510f.mo631j() : this.f510f.mo635n();
        int i2 = this.f511g;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0126i) j.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f514j.inflate(this.f515k, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f510f.mo636o() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0140a aVar = (C0140a) view;
        if (this.f512h) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo416a(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo567a();
        super.notifyDataSetChanged();
    }
}
