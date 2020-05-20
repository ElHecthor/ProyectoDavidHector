package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0121f;
import androidx.appcompat.view.menu.C0122g;
import androidx.appcompat.view.menu.C0126i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.h0 */
public class C0226h0 extends C0215f0 implements C0224g0 {

    /* renamed from: O */
    private static Method f1002O;

    /* renamed from: N */
    private C0224g0 f1003N;

    /* renamed from: androidx.appcompat.widget.h0$a */
    public static class C0227a extends C0192b0 {

        /* renamed from: t */
        final int f1004t;

        /* renamed from: u */
        final int f1005u;

        /* renamed from: v */
        private C0224g0 f1006v;

        /* renamed from: w */
        private MenuItem f1007w;

        public C0227a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1004t = 22;
                this.f1005u = 21;
                return;
            }
            this.f1004t = 21;
            this.f1005u = 22;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            if (this.f1006v != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0121f fVar = (C0121f) adapter;
                C0126i iVar = null;
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        int i2 = pointToPosition - i;
                        if (i2 >= 0 && i2 < fVar.getCount()) {
                            iVar = fVar.getItem(i2);
                        }
                    }
                }
                MenuItem menuItem = this.f1007w;
                if (menuItem != iVar) {
                    C0122g b = fVar.mo569b();
                    if (menuItem != null) {
                        this.f1006v.mo553b(b, menuItem);
                    }
                    this.f1007w = iVar;
                    if (iVar != null) {
                        this.f1006v.mo552a(b, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1004t) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1005u) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0121f) getAdapter()).mo569b().mo589a(false);
                return true;
            }
        }

        public void setHoverListener(C0224g0 g0Var) {
            this.f1006v = g0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (VERSION.SDK_INT <= 28) {
                f1002O = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0226h0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0192b0 mo1389a(Context context, boolean z) {
        C0227a aVar = new C0227a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: a */
    public void mo552a(C0122g gVar, MenuItem menuItem) {
        C0224g0 g0Var = this.f1003N;
        if (g0Var != null) {
            g0Var.mo552a(gVar, menuItem);
        }
    }

    /* renamed from: a */
    public void mo1444a(C0224g0 g0Var) {
        this.f1003N = g0Var;
    }

    /* renamed from: a */
    public void mo1445a(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f968J.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: b */
    public void mo553b(C0122g gVar, MenuItem menuItem) {
        C0224g0 g0Var = this.f1003N;
        if (g0Var != null) {
            g0Var.mo553b(gVar, menuItem);
        }
    }

    /* renamed from: b */
    public void mo1446b(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f968J.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: c */
    public void mo1447c(boolean z) {
        if (VERSION.SDK_INT <= 28) {
            Method method = f1002O;
            if (method != null) {
                try {
                    method.invoke(this.f968J, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f968J.setTouchModal(z);
        }
    }
}
