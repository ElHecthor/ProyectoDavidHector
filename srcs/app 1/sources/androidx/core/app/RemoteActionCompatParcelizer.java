package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C0776a;
import androidx.versionedparcelable.C0778c;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C0776a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1616a = (IconCompat) aVar.mo4288a(remoteActionCompat.f1616a, 1);
        remoteActionCompat.f1617b = aVar.mo4290a(remoteActionCompat.f1617b, 2);
        remoteActionCompat.f1618c = aVar.mo4290a(remoteActionCompat.f1618c, 3);
        remoteActionCompat.f1619d = (PendingIntent) aVar.mo4287a(remoteActionCompat.f1619d, 4);
        remoteActionCompat.f1620e = aVar.mo4302a(remoteActionCompat.f1620e, 5);
        remoteActionCompat.f1621f = aVar.mo4302a(remoteActionCompat.f1621f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C0776a aVar) {
        aVar.mo4299a(false, false);
        aVar.mo4308b((C0778c) remoteActionCompat.f1616a, 1);
        aVar.mo4309b(remoteActionCompat.f1617b, 2);
        aVar.mo4309b(remoteActionCompat.f1618c, 3);
        aVar.mo4307b((Parcelable) remoteActionCompat.f1619d, 4);
        aVar.mo4311b(remoteActionCompat.f1620e, 5);
        aVar.mo4311b(remoteActionCompat.f1621f, 6);
    }
}
