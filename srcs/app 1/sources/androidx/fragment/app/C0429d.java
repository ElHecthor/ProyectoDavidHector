package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0046c;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.C0343a;
import androidx.core.app.C0343a.C0344a;
import androidx.lifecycle.C0508c0;
import androidx.lifecycle.C0510d0;
import androidx.lifecycle.C0514h;
import androidx.lifecycle.C0514h.C0515a;
import androidx.lifecycle.C0514h.C0516b;
import androidx.lifecycle.C0524o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p071f.p088e.C3176h;
import p071f.p126p.p127a.C3455a;

/* renamed from: androidx.fragment.app.d */
public class C0429d extends ComponentActivity {

    /* renamed from: l */
    final C0439g f1964l = C0439g.m2311a((C0441i<?>) new C0430a<Object>());

    /* renamed from: m */
    final C0524o f1965m = new C0524o(this);

    /* renamed from: n */
    boolean f1966n;

    /* renamed from: o */
    boolean f1967o;

    /* renamed from: p */
    boolean f1968p = true;

    /* renamed from: q */
    boolean f1969q;

    /* renamed from: r */
    boolean f1970r;

    /* renamed from: s */
    int f1971s;

    /* renamed from: t */
    C3176h<String> f1972t;

    /* renamed from: androidx.fragment.app.d$a */
    class C0430a extends C0441i<C0429d> implements C0510d0, C0046c {
        public C0430a() {
            super(C0429d.this);
        }

        /* renamed from: a */
        public View mo2593a(int i) {
            return C0429d.this.findViewById(i);
        }

        /* renamed from: a */
        public C0514h mo115a() {
            return C0429d.this.f1965m;
        }

        /* renamed from: a */
        public void mo2687a(Fragment fragment) {
            C0429d.this.mo2662a(fragment);
        }

        /* renamed from: a */
        public void mo2688a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            C0429d.this.mo2663a(fragment, intent, i, bundle);
        }

        /* renamed from: a */
        public void mo2689a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C0429d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: b */
        public OnBackPressedDispatcher mo116b() {
            return C0429d.this.mo116b();
        }

        /* renamed from: b */
        public boolean mo2690b(Fragment fragment) {
            return !C0429d.this.isFinishing();
        }

        /* renamed from: d */
        public boolean mo2594d() {
            Window window = C0429d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: h */
        public C0508c0 mo118h() {
            return C0429d.this.mo118h();
        }

        /* renamed from: i */
        public C0429d m2301i() {
            return C0429d.this;
        }

        /* renamed from: j */
        public LayoutInflater mo2692j() {
            return C0429d.this.getLayoutInflater().cloneInContext(C0429d.this);
        }

        /* renamed from: k */
        public void mo2693k() {
            C0429d.this.mo257p();
        }
    }

    /* renamed from: a */
    static void m2278a(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: a */
    private static boolean m2279a(C0445l lVar, C0516b bVar) {
        boolean z = false;
        for (Fragment fragment : lVar.mo2814p()) {
            if (fragment != null) {
                if (fragment.mo2583t() != null) {
                    z |= m2279a(fragment.mo2565m(), bVar);
                }
                if (fragment.mo115a().mo3036a().mo3039a(C0516b.STARTED)) {
                    fragment.f1878V.mo3043b(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    private int m2280b(Fragment fragment) {
        if (this.f1972t.mo10292c() < 65534) {
            while (this.f1972t.mo10289b(this.f1971s) >= 0) {
                this.f1971s = (this.f1971s + 1) % 65534;
            }
            int i = this.f1971s;
            this.f1972t.mo10294c(i, fragment.f1887j);
            this.f1971s = (this.f1971s + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* renamed from: q */
    private void mo258q() {
        do {
        } while (m2279a(mo2666l(), C0516b.CREATED));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo2661a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1964l.mo2704a(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public void mo2662a(Fragment fragment) {
    }

    /* renamed from: a */
    public void mo2663a(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        this.f1970r = true;
        if (i == -1) {
            try {
                C0343a.m1778a(this, intent, -1, bundle);
            } finally {
                this.f1970r = false;
            }
        } else {
            m2278a(i);
            C0343a.m1778a(this, intent, ((m2280b(fragment) + 1) << 16) + (i & 65535), bundle);
            this.f1970r = false;
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public boolean mo2664a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        printWriter.print(sb2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1966n);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1967o);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1968p);
        if (getApplication() != null) {
            C3455a.m14163a(this).mo11018a(sb2, fileDescriptor, printWriter, strArr);
        }
        this.f1964l.mo2725j().mo2772a(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: l */
    public C0445l mo2666l() {
        return this.f1964l.mo2725j();
    }

    @Deprecated
    /* renamed from: m */
    public C3455a mo2667m() {
        return C3455a.m14163a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo2668n() {
        this.f1965m.mo3041a(C0515a.ON_RESUME);
        this.f1964l.mo2721f();
    }

    /* renamed from: o */
    public void mo2669o() {
        C0343a.m1779b(this);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f1964l.mo2726k();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.f1972t.mo10287a(i4);
            this.f1972t.mo10296d(i4);
            String str2 = "FragmentActivity";
            if (str == null) {
                Log.w(str2, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a = this.f1964l.mo2705a(str);
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity result no fragment exists for who: ");
                sb.append(str);
                Log.w(str2, sb.toString());
            } else {
                a.mo2492a(i & 65535, i2, intent);
            }
            return;
        }
        C0344a a2 = C0343a.m1776a();
        if (a2 == null || !a2.mo2163a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1964l.mo2726k();
        this.f1964l.mo2707a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f1964l.mo2710a((Fragment) null);
        if (bundle != null) {
            this.f1964l.mo2708a(bundle.getParcelable("android:support:fragments"));
            String str = "android:support:next_request_index";
            if (bundle.containsKey(str)) {
                this.f1971s = bundle.getInt(str);
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f1972t = new C3176h<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f1972t.mo10294c(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f1972t == null) {
            this.f1972t = new C3176h<>();
            this.f1971s = 0;
        }
        super.onCreate(bundle);
        this.f1965m.mo3041a(C0515a.ON_CREATE);
        this.f1964l.mo2714b();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f1964l.mo2712a(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo2661a(view, str, context, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = mo2661a((View) null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f1964l.mo2718c();
        this.f1965m.mo3041a(C0515a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f1964l.mo2719d();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f1964l.mo2717b(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f1964l.mo2713a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f1964l.mo2711a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f1964l.mo2726k();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f1964l.mo2709a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f1967o = false;
        this.f1964l.mo2720e();
        this.f1965m.mo3041a(C0515a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f1964l.mo2715b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo2668n();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? mo2664a(view, menu) | this.f1964l.mo2716b(menu) : super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f1964l.mo2726k();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = (String) this.f1972t.mo10287a(i3);
            this.f1972t.mo10296d(i3);
            String str2 = "FragmentActivity";
            if (str == null) {
                Log.w(str2, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a = this.f1964l.mo2705a(str);
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity result no fragment exists for who: ");
                sb.append(str);
                Log.w(str2, sb.toString());
            } else {
                a.mo2493a(i & 65535, strArr, iArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f1967o = true;
        this.f1964l.mo2726k();
        this.f1964l.mo2724i();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo258q();
        this.f1965m.mo3041a(C0515a.ON_STOP);
        Parcelable l = this.f1964l.mo2727l();
        if (l != null) {
            bundle.putParcelable("android:support:fragments", l);
        }
        if (this.f1972t.mo10292c() > 0) {
            bundle.putInt("android:support:next_request_index", this.f1971s);
            int[] iArr = new int[this.f1972t.mo10292c()];
            String[] strArr = new String[this.f1972t.mo10292c()];
            for (int i = 0; i < this.f1972t.mo10292c(); i++) {
                iArr[i] = this.f1972t.mo10293c(i);
                strArr[i] = (String) this.f1972t.mo10297e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f1968p = false;
        if (!this.f1966n) {
            this.f1966n = true;
            this.f1964l.mo2706a();
        }
        this.f1964l.mo2726k();
        this.f1964l.mo2724i();
        this.f1965m.mo3041a(C0515a.ON_START);
        this.f1964l.mo2722g();
    }

    public void onStateNotSaved() {
        this.f1964l.mo2726k();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f1968p = true;
        mo258q();
        this.f1964l.mo2723h();
        this.f1965m.mo3041a(C0515a.ON_STOP);
    }

    @Deprecated
    /* renamed from: p */
    public void mo257p() {
        invalidateOptionsMenu();
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.f1970r && i != -1) {
            m2278a(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.f1970r && i != -1) {
            m2278a(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f1969q && i != -1) {
            m2278a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f1969q && i != -1) {
            m2278a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
