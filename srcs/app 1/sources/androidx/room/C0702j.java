package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C0689f.C0690a;
import androidx.room.C0692g.C0693a;
import androidx.room.C0696i.C0699c;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.room.j */
class C0702j {

    /* renamed from: a */
    final Context f2784a;

    /* renamed from: b */
    final String f2785b;

    /* renamed from: c */
    int f2786c;

    /* renamed from: d */
    final C0696i f2787d;

    /* renamed from: e */
    final C0699c f2788e;

    /* renamed from: f */
    C0692g f2789f;

    /* renamed from: g */
    final Executor f2790g;

    /* renamed from: h */
    final C0689f f2791h = new C0703a();

    /* renamed from: i */
    final AtomicBoolean f2792i = new AtomicBoolean(false);

    /* renamed from: j */
    final ServiceConnection f2793j = new C0705b();

    /* renamed from: k */
    final Runnable f2794k = new C0706c();

    /* renamed from: l */
    final Runnable f2795l = new C0707d();

    /* renamed from: androidx.room.j$a */
    class C0703a extends C0690a {

        /* renamed from: androidx.room.j$a$a */
        class C0704a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ String[] f2797f;

            C0704a(String[] strArr) {
                this.f2797f = strArr;
            }

            public void run() {
                C0702j.this.f2787d.mo4038a(this.f2797f);
            }
        }

        C0703a() {
        }

        /* renamed from: a */
        public void mo4024a(String[] strArr) {
            C0702j.this.f2790g.execute(new C0704a(strArr));
        }
    }

    /* renamed from: androidx.room.j$b */
    class C0705b implements ServiceConnection {
        C0705b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0702j.this.f2789f = C0693a.m3913a(iBinder);
            C0702j jVar = C0702j.this;
            jVar.f2790g.execute(jVar.f2794k);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C0702j jVar = C0702j.this;
            jVar.f2790g.execute(jVar.f2795l);
            C0702j.this.f2789f = null;
        }
    }

    /* renamed from: androidx.room.j$c */
    class C0706c implements Runnable {
        C0706c() {
        }

        public void run() {
            try {
                C0692g gVar = C0702j.this.f2789f;
                if (gVar != null) {
                    C0702j.this.f2786c = gVar.mo4012a(C0702j.this.f2791h, C0702j.this.f2785b);
                    C0702j.this.f2787d.mo4036a(C0702j.this.f2788e);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
            }
        }
    }

    /* renamed from: androidx.room.j$d */
    class C0707d implements Runnable {
        C0707d() {
        }

        public void run() {
            C0702j jVar = C0702j.this;
            jVar.f2787d.mo4044c(jVar.f2788e);
        }
    }

    /* renamed from: androidx.room.j$e */
    class C0708e implements Runnable {
        C0708e() {
        }

        public void run() {
            C0702j jVar = C0702j.this;
            jVar.f2787d.mo4044c(jVar.f2788e);
            try {
                C0692g gVar = C0702j.this.f2789f;
                if (gVar != null) {
                    gVar.mo4014a(C0702j.this.f2791h, C0702j.this.f2786c);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
            }
            C0702j jVar2 = C0702j.this;
            jVar2.f2784a.unbindService(jVar2.f2793j);
        }
    }

    /* renamed from: androidx.room.j$f */
    class C0709f extends C0699c {
        C0709f(String[] strArr) {
            super(strArr);
        }

        /* renamed from: a */
        public void mo4051a(Set<String> set) {
            if (!C0702j.this.f2792i.get()) {
                try {
                    C0692g gVar = C0702j.this.f2789f;
                    if (gVar != null) {
                        gVar.mo4013a(C0702j.this.f2786c, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4052a() {
            return true;
        }
    }

    C0702j(Context context, String str, C0696i iVar, Executor executor) {
        new C0708e();
        this.f2784a = context.getApplicationContext();
        this.f2785b = str;
        this.f2787d = iVar;
        this.f2790g = executor;
        this.f2788e = new C0709f((String[]) iVar.f2760a.keySet().toArray(new String[0]));
        this.f2784a.bindService(new Intent(this.f2784a, MultiInstanceInvalidationService.class), this.f2793j, 1);
    }
}
