package com.google.android.youtube.player.p055e;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.youtube.player.C2809a;
import com.google.android.youtube.player.C2812c;
import com.google.android.youtube.player.p055e.C2820e.C2821a;
import com.google.android.youtube.player.p055e.C2825g.C2826a;
import com.google.android.youtube.player.p055e.C2843o.C2844a;
import com.google.android.youtube.player.p055e.C2843o.C2845b;
import java.util.ArrayList;

/* renamed from: com.google.android.youtube.player.e.m */
public abstract class C2835m<T extends IInterface> implements C2843o {

    /* renamed from: a */
    private final Context f8280a;

    /* renamed from: b */
    final Handler f8281b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public T f8282c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ArrayList<C2844a> f8283d;

    /* renamed from: e */
    private final ArrayList<C2844a> f8284e = new ArrayList<>();

    /* renamed from: f */
    private boolean f8285f = false;

    /* renamed from: g */
    private ArrayList<C2845b> f8286g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ArrayList<C2838c<?>> f8287h = new ArrayList<>();

    /* renamed from: i */
    private ServiceConnection f8288i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f8289j = false;

    /* renamed from: com.google.android.youtube.player.e.m$a */
    static /* synthetic */ class C2836a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8290a;

        static {
            int[] iArr = new int[C2812c.values().length];
            f8290a = iArr;
            try {
                iArr[C2812c.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.google.android.youtube.player.e.m$b */
    final class C2837b extends Handler {
        C2837b() {
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 3) {
                C2835m.this.mo9477a((C2812c) message.obj);
            } else if (i == 4) {
                synchronized (C2835m.this.f8283d) {
                    if (C2835m.this.f8289j && C2835m.this.mo9479f() && C2835m.this.f8283d.contains(message.obj)) {
                        ((C2844a) message.obj).mo9423e();
                    }
                }
            } else if (i != 2 || C2835m.this.mo9479f()) {
                int i2 = message.what;
                if (i2 == 2 || i2 == 1) {
                    ((C2838c) message.obj).mo9485a();
                }
            }
        }
    }

    /* renamed from: com.google.android.youtube.player.e.m$c */
    protected abstract class C2838c<TListener> {

        /* renamed from: a */
        private TListener f8292a;

        public C2838c(C2835m mVar, TListener tlistener) {
            this.f8292a = tlistener;
            synchronized (mVar.f8287h) {
                mVar.f8287h.add(this);
            }
        }

        /* renamed from: a */
        public final void mo9485a() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f8292a;
            }
            mo9486a(tlistener);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo9486a(TListener tlistener);

        /* renamed from: b */
        public final void mo9487b() {
            synchronized (this) {
                this.f8292a = null;
            }
        }
    }

    /* renamed from: com.google.android.youtube.player.e.m$d */
    protected final class C2839d extends C2838c<Boolean> {

        /* renamed from: b */
        public final C2812c f8293b;

        /* renamed from: c */
        public final IBinder f8294c;

        public C2839d(String str, IBinder iBinder) {
            super(C2835m.this, Boolean.valueOf(true));
            this.f8293b = C2835m.m11792b(str);
            this.f8294c = iBinder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo9486a(Object obj) {
            if (((Boolean) obj) != null) {
                if (C2836a.f8290a[this.f8293b.ordinal()] != 1) {
                    C2835m.this.mo9477a(this.f8293b);
                } else {
                    try {
                        if (C2835m.this.mo9474c().equals(this.f8294c.getInterfaceDescriptor())) {
                            C2835m.this.f8282c = C2835m.this.mo9471a(this.f8294c);
                            if (C2835m.this.f8282c != null) {
                                C2835m.this.mo9480g();
                                return;
                            }
                        }
                    } catch (RemoteException unused) {
                    }
                    C2835m.this.mo9442e();
                    C2835m.this.mo9477a(C2812c.INTERNAL_ERROR);
                }
            }
        }
    }

    /* renamed from: com.google.android.youtube.player.e.m$e */
    protected final class C2840e extends C2821a {
        protected C2840e() {
        }

        /* renamed from: a */
        public final void mo9443a(String str, IBinder iBinder) {
            C2835m mVar = C2835m.this;
            Handler handler = mVar.f8281b;
            handler.sendMessage(handler.obtainMessage(1, new C2839d(str, iBinder)));
        }
    }

    /* renamed from: com.google.android.youtube.player.e.m$f */
    final class C2841f implements ServiceConnection {
        C2841f() {
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C2835m.this.mo9478b(iBinder);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            C2835m.this.f8282c = null;
            C2835m.this.mo9481h();
        }
    }

    protected C2835m(Context context, C2844a aVar, C2845b bVar) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            C2817b.m11730a(context);
            this.f8280a = context;
            ArrayList<C2844a> arrayList = new ArrayList<>();
            this.f8283d = arrayList;
            C2817b.m11730a(aVar);
            arrayList.add(aVar);
            ArrayList<C2845b> arrayList2 = new ArrayList<>();
            this.f8286g = arrayList2;
            C2817b.m11730a(bVar);
            arrayList2.add(bVar);
            this.f8281b = new C2837b();
            return;
        }
        throw new IllegalStateException("Clients must be created on the UI thread.");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C2812c m11792b(String str) {
        try {
            return C2812c.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return C2812c.UNKNOWN_ERROR;
        } catch (NullPointerException unused2) {
            return C2812c.UNKNOWN_ERROR;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void mo9442e() {
        ServiceConnection serviceConnection = this.f8288i;
        if (serviceConnection != null) {
            try {
                this.f8280a.unbindService(serviceConnection);
            } catch (IllegalArgumentException e) {
                Log.w("YouTubeClient", "Unexpected error from unbindService()", e);
            }
        }
        this.f8282c = null;
        this.f8288i = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo9471a(IBinder iBinder);

    /* renamed from: a */
    public final void mo9476a() {
        this.f8289j = true;
        C2812c a = C2809a.m11713a(this.f8280a);
        if (a != C2812c.SUCCESS) {
            Handler handler = this.f8281b;
            handler.sendMessage(handler.obtainMessage(3, a));
            return;
        }
        Intent intent = new Intent(mo9475d()).setPackage(C2854u.m11846a(this.f8280a));
        if (this.f8288i != null) {
            Log.e("YouTubeClient", "Calling connect() while still connected, missing disconnect().");
            mo9442e();
        }
        C2841f fVar = new C2841f();
        this.f8288i = fVar;
        if (!this.f8280a.bindService(intent, fVar, 129)) {
            Handler handler2 = this.f8281b;
            handler2.sendMessage(handler2.obtainMessage(3, C2812c.ERROR_CONNECTING_TO_SERVICE));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9477a(C2812c cVar) {
        this.f8281b.removeMessages(4);
        synchronized (this.f8286g) {
            ArrayList<C2845b> arrayList = this.f8286g;
            int i = 0;
            int size = arrayList.size();
            while (i < size) {
                if (this.f8289j) {
                    if (this.f8286g.contains(arrayList.get(i))) {
                        ((C2845b) arrayList.get(i)).mo9424a(cVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9472a(C2825g gVar, C2840e eVar);

    /* renamed from: b */
    public void mo9473b() {
        mo9481h();
        this.f8289j = false;
        synchronized (this.f8287h) {
            int size = this.f8287h.size();
            for (int i = 0; i < size; i++) {
                ((C2838c) this.f8287h.get(i)).mo9487b();
            }
            this.f8287h.clear();
        }
        mo9442e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9478b(IBinder iBinder) {
        try {
            mo9472a(C2826a.m11771a(iBinder), new C2840e());
        } catch (RemoteException unused) {
            Log.w("YouTubeClient", "service died");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo9474c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo9475d();

    /* renamed from: f */
    public final boolean mo9479f() {
        return this.f8282c != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo9480g() {
        synchronized (this.f8283d) {
            boolean z = true;
            C2817b.m11733a(!this.f8285f);
            this.f8281b.removeMessages(4);
            this.f8285f = true;
            if (this.f8284e.size() != 0) {
                z = false;
            }
            C2817b.m11733a(z);
            ArrayList<C2844a> arrayList = this.f8283d;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f8289j && mo9479f(); i++) {
                if (!this.f8284e.contains(arrayList.get(i))) {
                    ((C2844a) arrayList.get(i)).mo9423e();
                }
            }
            this.f8284e.clear();
            this.f8285f = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo9481h() {
        this.f8281b.removeMessages(4);
        synchronized (this.f8283d) {
            this.f8285f = true;
            ArrayList<C2844a> arrayList = this.f8283d;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f8289j; i++) {
                if (this.f8283d.contains(arrayList.get(i))) {
                    ((C2844a) arrayList.get(i)).mo9422a();
                }
            }
            this.f8285f = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo9482i() {
        if (!mo9479f()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final T mo9483j() {
        mo9482i();
        return this.f8282c;
    }
}
