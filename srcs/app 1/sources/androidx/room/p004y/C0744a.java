package androidx.room.p004y;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: androidx.room.y.a */
public class C0744a {

    /* renamed from: e */
    private static final Map<String, Lock> f2919e = new HashMap();

    /* renamed from: a */
    private final File f2920a;

    /* renamed from: b */
    private final Lock f2921b;

    /* renamed from: c */
    private final boolean f2922c;

    /* renamed from: d */
    private FileChannel f2923d;

    public C0744a(String str, File file, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".lck");
        File file2 = new File(file, sb.toString());
        this.f2920a = file2;
        this.f2921b = m4057a(file2.getAbsolutePath());
        this.f2922c = z;
    }

    /* renamed from: a */
    private static Lock m4057a(String str) {
        Lock lock;
        synchronized (f2919e) {
            lock = (Lock) f2919e.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                f2919e.put(str, lock);
            }
        }
        return lock;
    }

    /* renamed from: a */
    public void mo4148a() {
        this.f2921b.lock();
        if (this.f2922c) {
            try {
                FileChannel channel = new FileOutputStream(this.f2920a).getChannel();
                this.f2923d = channel;
                channel.lock();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to grab copy lock.", e);
            }
        }
    }

    /* renamed from: b */
    public void mo4149b() {
        FileChannel fileChannel = this.f2923d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f2921b.unlock();
    }
}
