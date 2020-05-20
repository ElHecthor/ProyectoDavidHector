package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C0692g.C0693a;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: f */
    int f2732f = 0;

    /* renamed from: g */
    final HashMap<Integer, String> f2733g = new HashMap<>();

    /* renamed from: h */
    final RemoteCallbackList<C0689f> f2734h = new C0680a();

    /* renamed from: i */
    private final C0693a f2735i = new C0681b();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    class C0680a extends RemoteCallbackList<C0689f> {
        C0680a() {
        }

        /* renamed from: a */
        public void onCallbackDied(C0689f fVar, Object obj) {
            MultiInstanceInvalidationService.this.f2733g.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    class C0681b extends C0693a {
        C0681b() {
        }

        /* renamed from: a */
        public int mo4012a(C0689f fVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f2734h) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f2732f + 1;
                multiInstanceInvalidationService.f2732f = i;
                if (MultiInstanceInvalidationService.this.f2734h.register(fVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f2733g.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService.this.f2732f--;
                return 0;
            }
        }

        /* renamed from: a */
        public void mo4013a(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f2734h) {
                String str = (String) MultiInstanceInvalidationService.this.f2733g.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f2734h.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f2734h.getBroadcastCookie(i2)).intValue();
                        String str2 = (String) MultiInstanceInvalidationService.this.f2733g.get(Integer.valueOf(intValue));
                        if (i != intValue && str.equals(str2)) {
                            ((C0689f) MultiInstanceInvalidationService.this.f2734h.getBroadcastItem(i2)).mo4024a(strArr);
                        }
                    } catch (RemoteException e) {
                        Log.w("ROOM", "Error invoking a remote callback", e);
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f2734h.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f2734h.finishBroadcast();
            }
        }

        /* renamed from: a */
        public void mo4014a(C0689f fVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.f2734h) {
                MultiInstanceInvalidationService.this.f2734h.unregister(fVar);
                MultiInstanceInvalidationService.this.f2733g.remove(Integer.valueOf(i));
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f2735i;
    }
}
