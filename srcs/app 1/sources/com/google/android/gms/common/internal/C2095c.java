package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C2078b;
import com.google.android.gms.common.C2082d;
import com.google.android.gms.common.C2087f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2132m.C2133a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import p147g.p156d.p157a.p167b.p173d.p178e.C3886h;

/* renamed from: com.google.android.gms.common.internal.c */
public abstract class C2095c<T extends IInterface> {

    /* renamed from: v */
    private static final C2082d[] f5988v = new C2082d[0];

    /* renamed from: a */
    private C2138o0 f5989a;

    /* renamed from: b */
    private final Context f5990b;

    /* renamed from: c */
    private final C2121i f5991c;

    /* renamed from: d */
    private final C2087f f5992d;

    /* renamed from: e */
    final Handler f5993e;

    /* renamed from: f */
    private final Object f5994f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f5995g;
    /* access modifiers changed from: private */
    @GuardedBy("mServiceBrokerLock")

    /* renamed from: h */
    public C2137o f5996h;

    /* renamed from: i */
    protected C2098c f5997i;
    @GuardedBy("mLock")

    /* renamed from: j */
    private T f5998j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final ArrayList<C2102g<?>> f5999k;
    @GuardedBy("mLock")

    /* renamed from: l */
    private C2105j f6000l;
    @GuardedBy("mLock")

    /* renamed from: m */
    private int f6001m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C2096a f6002n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C2097b f6003o;

    /* renamed from: p */
    private final int f6004p;

    /* renamed from: q */
    private final String f6005q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C2078b f6006r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f6007s;

    /* renamed from: t */
    private volatile C2123i0 f6008t;

    /* renamed from: u */
    protected AtomicInteger f6009u;

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public interface C2096a {
        /* renamed from: a */
        void mo6816a(int i);

        /* renamed from: c */
        void mo6817c(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public interface C2097b {
        /* renamed from: a */
        void mo6850a(C2078b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c */
    public interface C2098c {
        /* renamed from: a */
        void mo6708a(C2078b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    protected class C2099d implements C2098c {
        public C2099d() {
        }

        /* renamed from: a */
        public void mo6708a(C2078b bVar) {
            if (bVar.mo6781k()) {
                C2095c cVar = C2095c.this;
                cVar.mo6826a((C2128l) null, cVar.mo6845v());
                return;
            }
            if (C2095c.this.f6003o != null) {
                C2095c.this.f6003o.mo6850a(bVar);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$e */
    public interface C2100e {
        /* renamed from: a */
        void mo6760a();
    }

    /* renamed from: com.google.android.gms.common.internal.c$f */
    private abstract class C2101f extends C2102g<Boolean> {

        /* renamed from: d */
        private final int f6011d;

        /* renamed from: e */
        private final Bundle f6012e;

        protected C2101f(int i, Bundle bundle) {
            super(Boolean.valueOf(true));
            this.f6011d = i;
            this.f6012e = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo6851a(C2078b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo6852a(Object obj) {
            PendingIntent pendingIntent = null;
            if (((Boolean) obj) == null) {
                C2095c.this.m8660c(1, null);
                return;
            }
            int i = this.f6011d;
            if (i != 0) {
                if (i != 10) {
                    C2095c.this.m8660c(1, null);
                    Bundle bundle = this.f6012e;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                    }
                    mo6851a(new C2078b(this.f6011d, pendingIntent));
                } else {
                    C2095c.this.m8660c(1, null);
                    throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[]{getClass().getSimpleName(), C2095c.this.mo6557l(), C2095c.this.mo6555c()}));
                }
            } else if (!mo6854e()) {
                C2095c.this.m8660c(1, null);
                mo6851a(new C2078b(8, null));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo6853c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract boolean mo6854e();
    }

    /* renamed from: com.google.android.gms.common.internal.c$g */
    protected abstract class C2102g<TListener> {

        /* renamed from: a */
        private TListener f6014a;

        /* renamed from: b */
        private boolean f6015b = false;

        public C2102g(TListener tlistener) {
            this.f6014a = tlistener;
        }

        /* renamed from: a */
        public final void mo6855a() {
            synchronized (this) {
                this.f6014a = null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo6852a(TListener tlistener);

        /* renamed from: b */
        public final void mo6856b() {
            mo6855a();
            synchronized (C2095c.this.f5999k) {
                C2095c.this.f5999k.remove(this);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo6853c();

        /* renamed from: d */
        public final void mo6857d() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f6014a;
                if (this.f6015b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    mo6852a(tlistener);
                } catch (RuntimeException e) {
                    mo6853c();
                    throw e;
                }
            } else {
                mo6853c();
            }
            synchronized (this) {
                this.f6015b = true;
            }
            mo6856b();
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$h */
    final class C2103h extends C3886h {
        public C2103h(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private static void m8717a(Message message) {
            C2102g gVar = (C2102g) message.obj;
            gVar.mo6853c();
            gVar.mo6856b();
        }

        /* renamed from: b */
        private static boolean m8718b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        public final void handleMessage(Message message) {
            if (C2095c.this.f6009u.get() != message.arg1) {
                if (m8718b(message)) {
                    m8717a(message);
                }
                return;
            }
            int i = message.what;
            if ((i == 1 || i == 7 || ((i == 4 && !C2095c.this.mo6838o()) || message.what == 5)) && !C2095c.this.mo6831f()) {
                m8717a(message);
                return;
            }
            int i2 = message.what;
            PendingIntent pendingIntent = null;
            if (i2 == 4) {
                C2095c.this.f6006r = new C2078b(message.arg2);
                if (!C2095c.this.m8648C() || C2095c.this.f6007s) {
                    C2078b d = C2095c.this.f6006r != null ? C2095c.this.f6006r : new C2078b(8);
                    C2095c.this.f5997i.mo6708a(d);
                    C2095c.this.mo6822a(d);
                    return;
                }
                C2095c.this.m8660c(3, null);
            } else if (i2 == 5) {
                C2078b d2 = C2095c.this.f6006r != null ? C2095c.this.f6006r : new C2078b(8);
                C2095c.this.f5997i.mo6708a(d2);
                C2095c.this.mo6822a(d2);
            } else if (i2 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                C2078b bVar = new C2078b(message.arg2, pendingIntent);
                C2095c.this.f5997i.mo6708a(bVar);
                C2095c.this.mo6822a(bVar);
            } else if (i2 == 6) {
                C2095c.this.m8660c(5, null);
                if (C2095c.this.f6002n != null) {
                    C2095c.this.f6002n.mo6816a(message.arg2);
                }
                C2095c.this.mo6818a(message.arg2);
                C2095c.this.m8656a(5, 1, null);
            } else if (i2 == 2 && !C2095c.this.mo6827a()) {
                m8717a(message);
            } else if (m8718b(message)) {
                ((C2102g) message.obj).mo6857d();
            } else {
                int i3 = message.what;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i3);
                Log.wtf("GmsClient", sb.toString(), new Exception());
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$i */
    public static final class C2104i extends C2133a {

        /* renamed from: a */
        private C2095c f6018a;

        /* renamed from: b */
        private final int f6019b;

        public C2104i(C2095c cVar, int i) {
            this.f6018a = cVar;
            this.f6019b = i;
        }

        /* renamed from: a */
        public final void mo6859a(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        /* renamed from: a */
        public final void mo6860a(int i, IBinder iBinder, Bundle bundle) {
            C2148s.m8835a(this.f6018a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.f6018a.mo6820a(i, iBinder, bundle, this.f6019b);
            this.f6018a = null;
        }

        /* renamed from: a */
        public final void mo6861a(int i, IBinder iBinder, C2123i0 i0Var) {
            C2148s.m8835a(this.f6018a, (Object) "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C2148s.m8834a(i0Var);
            this.f6018a.m8655a(i0Var);
            mo6860a(i, iBinder, i0Var.f6072f);
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$j */
    public final class C2105j implements ServiceConnection {

        /* renamed from: a */
        private final int f6020a;

        public C2105j(int i) {
            this.f6020a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C2137o oVar;
            C2095c cVar = C2095c.this;
            if (iBinder == null) {
                cVar.m8659c(16);
                return;
            }
            synchronized (cVar.f5995g) {
                C2095c cVar2 = C2095c.this;
                if (iBinder == null) {
                    oVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    oVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C2137o)) ? new C2135n(iBinder) : (C2137o) queryLocalInterface;
                }
                cVar2.f5996h = oVar;
            }
            C2095c.this.mo6819a(0, (Bundle) null, this.f6020a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (C2095c.this.f5995g) {
                C2095c.this.f5996h = null;
            }
            Handler handler = C2095c.this.f5993e;
            handler.sendMessage(handler.obtainMessage(6, this.f6020a, 1));
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$k */
    protected final class C2106k extends C2101f {
        public C2106k(int i, Bundle bundle) {
            super(i, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo6851a(C2078b bVar) {
            if (!C2095c.this.mo6838o() || !C2095c.this.m8648C()) {
                C2095c.this.f5997i.mo6708a(bVar);
                C2095c.this.mo6822a(bVar);
                return;
            }
            C2095c.this.m8659c(16);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public final boolean mo6854e() {
            C2095c.this.f5997i.mo6708a(C2078b.f5962j);
            return true;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$l */
    protected final class C2107l extends C2101f {

        /* renamed from: g */
        private final IBinder f6023g;

        public C2107l(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f6023g = iBinder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo6851a(C2078b bVar) {
            if (C2095c.this.f6003o != null) {
                C2095c.this.f6003o.mo6850a(bVar);
            }
            C2095c.this.mo6822a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public final boolean mo6854e() {
            String str = "GmsClient";
            try {
                String interfaceDescriptor = this.f6023g.getInterfaceDescriptor();
                if (!C2095c.this.mo6555c().equals(interfaceDescriptor)) {
                    String c = C2095c.this.mo6555c();
                    StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(c);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e(str, sb.toString());
                    return false;
                }
                IInterface a = C2095c.this.mo6554a(this.f6023g);
                if (a == null || (!C2095c.this.m8656a(2, 4, a) && !C2095c.this.m8656a(3, 4, a))) {
                    return false;
                }
                C2095c.this.f6006r = null;
                Bundle r = C2095c.this.mo6841r();
                if (C2095c.this.f6002n != null) {
                    C2095c.this.f6002n.mo6817c(r);
                }
                return true;
            } catch (RemoteException unused) {
                Log.w(str, "service probably died");
                return false;
            }
        }
    }

    protected C2095c(Context context, Looper looper, int i, C2096a aVar, C2097b bVar, String str) {
        C2121i a = C2121i.m8768a(context);
        C2087f a2 = C2087f.m8630a();
        C2148s.m8834a(aVar);
        C2096a aVar2 = aVar;
        C2148s.m8834a(bVar);
        this(context, looper, a, a2, i, aVar2, bVar, str);
    }

    protected C2095c(Context context, Looper looper, C2121i iVar, C2087f fVar, int i, C2096a aVar, C2097b bVar, String str) {
        this.f5994f = new Object();
        this.f5995g = new Object();
        this.f5999k = new ArrayList<>();
        this.f6001m = 1;
        this.f6006r = null;
        this.f6007s = false;
        this.f6008t = null;
        this.f6009u = new AtomicInteger(0);
        C2148s.m8835a(context, (Object) "Context must not be null");
        this.f5990b = context;
        C2148s.m8835a(looper, (Object) "Looper must not be null");
        Looper looper2 = looper;
        C2148s.m8835a(iVar, (Object) "Supervisor must not be null");
        this.f5991c = iVar;
        C2148s.m8835a(fVar, (Object) "API availability must not be null");
        this.f5992d = fVar;
        this.f5993e = new C2103h(looper);
        this.f6004p = i;
        this.f6002n = aVar;
        this.f6003o = bVar;
        this.f6005q = str;
    }

    /* renamed from: A */
    private final String mo6885A() {
        String str = this.f6005q;
        return str == null ? this.f5990b.getClass().getName() : str;
    }

    /* renamed from: B */
    private final boolean mo6553B() {
        boolean z;
        synchronized (this.f5994f) {
            z = this.f6001m == 3;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final boolean m8648C() {
        if (this.f6007s || TextUtils.isEmpty(mo6555c()) || TextUtils.isEmpty(mo6844u())) {
            return false;
        }
        try {
            Class.forName(mo6555c());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8655a(C2123i0 i0Var) {
        this.f6008t = i0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m8656a(int i, int i2, T t) {
        synchronized (this.f5994f) {
            if (this.f6001m != i) {
                return false;
            }
            m8660c(i2, t);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m8659c(int i) {
        int i2;
        if (mo6553B()) {
            i2 = 5;
            this.f6007s = true;
        } else {
            i2 = 4;
        }
        Handler handler = this.f5993e;
        handler.sendMessage(handler.obtainMessage(i2, this.f6009u.get(), 16));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m8660c(int i, T t) {
        boolean z = false;
        if ((i == 4) == (t != null)) {
            z = true;
        }
        C2148s.m8841a(z);
        synchronized (this.f5994f) {
            this.f6001m = i;
            this.f5998j = t;
            mo6829b(i, t);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (!(this.f6000l == null || this.f5989a == null)) {
                        String d = this.f5989a.mo6931d();
                        String a = this.f5989a.mo6928a();
                        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 70 + String.valueOf(a).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(d);
                        sb.append(" on ");
                        sb.append(a);
                        Log.e("GmsClient", sb.toString());
                        this.f5991c.mo6889a(this.f5989a.mo6931d(), this.f5989a.mo6928a(), this.f5989a.mo6930c(), this.f6000l, mo6885A(), this.f5989a.mo6929b());
                        this.f6009u.incrementAndGet();
                    }
                    this.f6000l = new C2105j(this.f6009u.get());
                    C2138o0 o0Var = (this.f6001m != 3 || mo6844u() == null) ? new C2138o0(mo6847x(), mo6557l(), false, 129, mo6848y()) : new C2138o0(mo6842s().getPackageName(), mo6844u(), true, 129, false);
                    this.f5989a = o0Var;
                    if (!o0Var.mo6929b() || mo6556e() >= 17895000) {
                        if (!this.f5991c.mo6890a(new C2122a(this.f5989a.mo6931d(), this.f5989a.mo6928a(), this.f5989a.mo6930c(), this.f5989a.mo6929b()), this.f6000l, mo6885A())) {
                            String d2 = this.f5989a.mo6931d();
                            String a2 = this.f5989a.mo6928a();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(d2).length() + 34 + String.valueOf(a2).length());
                            sb2.append("unable to connect to service: ");
                            sb2.append(d2);
                            sb2.append(" on ");
                            sb2.append(a2);
                            Log.e("GmsClient", sb2.toString());
                            mo6819a(16, (Bundle) null, this.f6009u.get());
                        }
                    } else {
                        String str = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ";
                        String valueOf = String.valueOf(this.f5989a.mo6931d());
                        throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    }
                } else if (i == 4) {
                    mo6821a(t);
                }
            } else if (this.f6000l != null) {
                this.f5991c.mo6889a(this.f5989a.mo6931d(), this.f5989a.mo6928a(), this.f5989a.mo6930c(), this.f6000l, mo6885A(), this.f5989a.mo6929b());
                this.f6000l = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo6554a(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6818a(int i) {
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6819a(int i, Bundle bundle, int i2) {
        Handler handler = this.f5993e;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C2106k(i, null)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6820a(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f5993e;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C2107l(i, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6821a(T t) {
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6822a(C2078b bVar) {
        bVar.mo6775e();
        System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo6823a(C2098c cVar) {
        C2148s.m8835a(cVar, (Object) "Connection progress callbacks cannot be null.");
        this.f5997i = cVar;
        m8660c(2, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6824a(C2098c cVar, int i, PendingIntent pendingIntent) {
        C2148s.m8835a(cVar, (Object) "Connection progress callbacks cannot be null.");
        this.f5997i = cVar;
        Handler handler = this.f5993e;
        handler.sendMessage(handler.obtainMessage(3, this.f6009u.get(), i, pendingIntent));
    }

    /* renamed from: a */
    public void mo6825a(C2100e eVar) {
        eVar.mo6760a();
    }

    /* renamed from: a */
    public void mo6826a(C2128l lVar, Set<Scope> set) {
        Bundle t = mo6843t();
        C2117g gVar = new C2117g(this.f6004p);
        gVar.f6052i = this.f5990b.getPackageName();
        gVar.f6055l = t;
        if (set != null) {
            gVar.f6054k = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo6835k()) {
            gVar.f6056m = mo6839p() != null ? mo6839p() : new Account("<<default account>>", "com.google");
            if (lVar != null) {
                gVar.f6053j = lVar.asBinder();
            }
        } else if (mo6849z()) {
            gVar.f6056m = mo6839p();
        }
        gVar.f6057n = f5988v;
        gVar.f6058o = mo6840q();
        try {
            synchronized (this.f5995g) {
                if (this.f5996h != null) {
                    this.f5996h.mo6914a(new C2104i(this, this.f6009u.get()), gVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo6828b(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo6820a(8, (IBinder) null, (Bundle) null, this.f6009u.get());
        }
    }

    /* renamed from: a */
    public boolean mo6827a() {
        boolean z;
        synchronized (this.f5994f) {
            z = this.f6001m == 4;
        }
        return z;
    }

    /* renamed from: b */
    public void mo6828b(int i) {
        Handler handler = this.f5993e;
        handler.sendMessage(handler.obtainMessage(6, this.f6009u.get(), i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6829b(int i, T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo6555c();

    /* renamed from: d */
    public boolean mo6830d() {
        return true;
    }

    /* renamed from: e */
    public int mo6556e() {
        return C2087f.f5982a;
    }

    /* renamed from: f */
    public boolean mo6831f() {
        boolean z;
        synchronized (this.f5994f) {
            if (this.f6001m != 2) {
                if (this.f6001m != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: g */
    public final C2082d[] mo6832g() {
        C2123i0 i0Var = this.f6008t;
        if (i0Var == null) {
            return null;
        }
        return i0Var.f6073g;
    }

    /* renamed from: h */
    public String mo6833h() {
        if (mo6827a()) {
            C2138o0 o0Var = this.f5989a;
            if (o0Var != null) {
                return o0Var.mo6928a();
            }
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: i */
    public void mo6834i() {
        this.f6009u.incrementAndGet();
        synchronized (this.f5999k) {
            int size = this.f5999k.size();
            for (int i = 0; i < size; i++) {
                ((C2102g) this.f5999k.get(i)).mo6855a();
            }
            this.f5999k.clear();
        }
        synchronized (this.f5995g) {
            this.f5996h = null;
        }
        m8660c(1, null);
    }

    /* renamed from: k */
    public boolean mo6835k() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract String mo6557l();

    /* renamed from: m */
    public void mo6836m() {
        int a = this.f5992d.mo6797a(this.f5990b, mo6556e());
        if (a != 0) {
            m8660c(1, null);
            mo6824a((C2098c) new C2099d(), a, (PendingIntent) null);
            return;
        }
        mo6823a((C2098c) new C2099d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo6837n() {
        if (!mo6827a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo6838o() {
        return false;
    }

    /* renamed from: p */
    public Account mo6839p() {
        return null;
    }

    /* renamed from: q */
    public C2082d[] mo6840q() {
        return f5988v;
    }

    /* renamed from: r */
    public Bundle mo6841r() {
        return null;
    }

    /* renamed from: s */
    public final Context mo6842s() {
        return this.f5990b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Bundle mo6843t() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public String mo6844u() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Set<Scope> mo6845v() {
        return Collections.EMPTY_SET;
    }

    /* renamed from: w */
    public final T mo6846w() {
        T t;
        synchronized (this.f5994f) {
            if (this.f6001m != 5) {
                mo6837n();
                C2148s.m8846b(this.f5998j != null, "Client is connected but service is null");
                t = this.f5998j;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public String mo6847x() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo6848y() {
        return false;
    }

    /* renamed from: z */
    public boolean mo6849z() {
        return false;
    }
}
