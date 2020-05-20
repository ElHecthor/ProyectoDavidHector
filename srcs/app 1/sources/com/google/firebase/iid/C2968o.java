package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.firebase.iid.o */
final class C2968o {

    /* renamed from: a */
    private final Messenger f8520a;

    /* renamed from: b */
    private final C2983v0 f8521b;

    C2968o(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f8520a = new Messenger(iBinder);
            this.f8521b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f8521b = new C2983v0(iBinder);
            this.f8520a = null;
        } else {
            String str = "Invalid interface descriptor: ";
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9683a(Message message) {
        Messenger messenger = this.f8520a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C2983v0 v0Var = this.f8521b;
        if (v0Var != null) {
            v0Var.mo9697a(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
