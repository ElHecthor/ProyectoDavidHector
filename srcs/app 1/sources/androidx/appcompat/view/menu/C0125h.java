package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.appcompat.app.C0065b;
import androidx.appcompat.app.C0065b.C0066a;
import androidx.appcompat.view.menu.C0137m.C0138a;
import p071f.p072a.C3099g;

/* renamed from: androidx.appcompat.view.menu.h */
class C0125h implements OnKeyListener, OnClickListener, OnDismissListener, C0138a {

    /* renamed from: f */
    private C0122g f543f;

    /* renamed from: g */
    private C0065b f544g;

    /* renamed from: h */
    C0119e f545h;

    /* renamed from: i */
    private C0138a f546i;

    public C0125h(C0122g gVar) {
        this.f543f = gVar;
    }

    /* renamed from: a */
    public void mo651a() {
        C0065b bVar = this.f544g;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* renamed from: a */
    public void mo652a(IBinder iBinder) {
        C0122g gVar = this.f543f;
        C0066a aVar = new C0066a(gVar.mo621e());
        C0119e eVar = new C0119e(aVar.mo221b(), C3099g.abc_list_menu_item_layout);
        this.f545h = eVar;
        eVar.mo517a((C0138a) this);
        this.f543f.mo586a((C0137m) this.f545h);
        aVar.mo218a(this.f545h.mo556a(), (OnClickListener) this);
        View i = gVar.mo629i();
        if (i != null) {
            aVar.mo216a(i);
        } else {
            aVar.mo215a(gVar.mo625g());
            aVar.mo219a(gVar.mo627h());
        }
        aVar.mo214a((OnKeyListener) this);
        C0065b a = aVar.mo220a();
        this.f544g = a;
        a.setOnDismissListener(this);
        LayoutParams attributes = this.f544g.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f544g.show();
    }

    /* renamed from: a */
    public void mo332a(C0122g gVar, boolean z) {
        if (z || gVar == this.f543f) {
            mo651a();
        }
        C0138a aVar = this.f546i;
        if (aVar != null) {
            aVar.mo332a(gVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo333a(C0122g gVar) {
        C0138a aVar = this.f546i;
        if (aVar != null) {
            return aVar.mo333a(gVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f543f.mo590a((MenuItem) (C0126i) this.f545h.mo556a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f545h.mo515a(this.f543f, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window = this.f544g.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                Window window2 = this.f544g.getWindow();
                if (window2 != null) {
                    View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.f543f.mo589a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f543f.performShortcut(i, keyEvent, 0);
    }
}
