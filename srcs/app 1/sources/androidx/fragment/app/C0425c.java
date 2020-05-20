package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

/* renamed from: androidx.fragment.app.c */
public class C0425c extends Fragment implements OnCancelListener, OnDismissListener {

    /* renamed from: b0 */
    private Handler f1947b0;

    /* renamed from: c0 */
    private Runnable f1948c0 = new C0426a();

    /* renamed from: d0 */
    private OnCancelListener f1949d0 = new C0427b();
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public OnDismissListener f1950e0 = new C0428c();

    /* renamed from: f0 */
    private int f1951f0 = 0;

    /* renamed from: g0 */
    private int f1952g0 = 0;

    /* renamed from: h0 */
    private boolean f1953h0 = true;

    /* renamed from: i0 */
    private boolean f1954i0 = true;

    /* renamed from: j0 */
    private int f1955j0 = -1;

    /* renamed from: k0 */
    private boolean f1956k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public Dialog f1957l0;

    /* renamed from: m0 */
    private boolean f1958m0;

    /* renamed from: n0 */
    private boolean f1959n0;

    /* renamed from: o0 */
    private boolean f1960o0;

    /* renamed from: androidx.fragment.app.c$a */
    class C0426a implements Runnable {
        C0426a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            C0425c.this.f1950e0.onDismiss(C0425c.this.f1957l0);
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    class C0427b implements OnCancelListener {
        C0427b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (C0425c.this.f1957l0 != null) {
                C0425c cVar = C0425c.this;
                cVar.onCancel(cVar.f1957l0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c */
    class C0428c implements OnDismissListener {
        C0428c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (C0425c.this.f1957l0 != null) {
                C0425c cVar = C0425c.this;
                cVar.onDismiss(cVar.f1957l0);
            }
        }
    }

    /* renamed from: a */
    private void m2258a(boolean z, boolean z2) {
        if (!this.f1959n0) {
            this.f1959n0 = true;
            this.f1960o0 = false;
            Dialog dialog = this.f1957l0;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.f1957l0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f1947b0.getLooper()) {
                        onDismiss(this.f1957l0);
                    } else {
                        this.f1947b0.post(this.f1948c0);
                    }
                }
            }
            this.f1958m0 = true;
            if (this.f1955j0 >= 0) {
                mo2589y().mo2755a(this.f1955j0, 1);
                this.f1955j0 = -1;
            } else {
                C0466s b = mo2589y().mo2778b();
                b.mo2632b(this);
                if (z) {
                    b.mo2629b();
                } else {
                    b.mo2618a();
                }
            }
        }
    }

    /* renamed from: Y */
    public void mo2485Y() {
        super.mo2485Y();
        Dialog dialog = this.f1957l0;
        if (dialog != null) {
            this.f1958m0 = true;
            dialog.setOnDismissListener(null);
            this.f1957l0.dismiss();
            if (!this.f1959n0) {
                onDismiss(this.f1957l0);
            }
            this.f1957l0 = null;
        }
    }

    /* renamed from: Z */
    public void mo2486Z() {
        super.mo2486Z();
        if (!this.f1960o0 && !this.f1959n0) {
            this.f1959n0 = true;
        }
    }

    /* renamed from: a */
    public void mo375a(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: a */
    public void mo2497a(Context context) {
        super.mo2497a(context);
        if (!this.f1960o0) {
            this.f1959n0 = false;
        }
    }

    /* renamed from: a */
    public void mo2649a(C0445l lVar, String str) {
        this.f1959n0 = false;
        this.f1960o0 = true;
        C0466s b = lVar.mo2778b();
        b.mo2914a((Fragment) this, str);
        b.mo2618a();
    }

    /* renamed from: b */
    public void mo2516b(Bundle bundle) {
        super.mo2516b(bundle);
        if (this.f1954i0) {
            View I = mo2469I();
            if (this.f1957l0 != null) {
                if (I != null) {
                    if (I.getParent() == null) {
                        this.f1957l0.setContentView(I);
                    } else {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                }
                C0429d f = mo2540f();
                if (f != null) {
                    this.f1957l0.setOwnerActivity(f);
                }
                this.f1957l0.setCancelable(this.f1953h0);
                this.f1957l0.setOnCancelListener(this.f1949d0);
                this.f1957l0.setOnDismissListener(this.f1950e0);
                if (bundle != null) {
                    Bundle bundle2 = bundle.getBundle("android:savedDialogState");
                    if (bundle2 != null) {
                        this.f1957l0.onRestoreInstanceState(bundle2);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2524c(Bundle bundle) {
        super.mo2524c(bundle);
        this.f1947b0 = new Handler();
        this.f1954i0 = this.f1858B == 0;
        if (bundle != null) {
            this.f1951f0 = bundle.getInt("android:style", 0);
            this.f1952g0 = bundle.getInt("android:theme", 0);
            this.f1953h0 = bundle.getBoolean("android:cancelable", true);
            this.f1954i0 = bundle.getBoolean("android:showsDialog", this.f1954i0);
            this.f1955j0 = bundle.getInt("android:backStackId", -1);
        }
    }

    /* renamed from: c0 */
    public void mo2528c0() {
        super.mo2528c0();
        Dialog dialog = this.f1957l0;
        if (dialog != null) {
            this.f1958m0 = false;
            dialog.show();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public LayoutInflater mo2529d(Bundle bundle) {
        LayoutInflater d = super.mo2529d(bundle);
        if (!this.f1954i0 || this.f1956k0) {
            return d;
        }
        try {
            this.f1956k0 = true;
            Dialog n = mo376n(bundle);
            this.f1957l0 = n;
            mo375a(n, this.f1951f0);
            this.f1956k0 = false;
            return d.cloneInContext(mo2657w0().getContext());
        } catch (Throwable th) {
            this.f1956k0 = false;
            throw th;
        }
    }

    /* renamed from: d0 */
    public void mo2534d0() {
        super.mo2534d0();
        Dialog dialog = this.f1957l0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: e */
    public void mo2536e(Bundle bundle) {
        super.mo2536e(bundle);
        Dialog dialog = this.f1957l0;
        if (dialog != null) {
            bundle.putBundle("android:savedDialogState", dialog.onSaveInstanceState());
        }
        int i = this.f1951f0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1952g0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f1953h0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f1954i0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f1955j0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: j */
    public void mo2650j(boolean z) {
        this.f1954i0 = z;
    }

    /* renamed from: n */
    public Dialog mo376n(Bundle bundle) {
        return new Dialog(mo2576p0(), mo2656v0());
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f1958m0) {
            m2258a(true, true);
        }
    }

    /* renamed from: s0 */
    public void mo2653s0() {
        m2258a(false, false);
    }

    /* renamed from: t0 */
    public void mo2654t0() {
        m2258a(true, false);
    }

    /* renamed from: u0 */
    public Dialog mo2655u0() {
        return this.f1957l0;
    }

    /* renamed from: v0 */
    public int mo2656v0() {
        return this.f1952g0;
    }

    /* renamed from: w0 */
    public final Dialog mo2657w0() {
        Dialog u0 = mo2655u0();
        if (u0 != null) {
            return u0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DialogFragment ");
        sb.append(this);
        sb.append(" does not have a Dialog.");
        throw new IllegalStateException(sb.toString());
    }
}
