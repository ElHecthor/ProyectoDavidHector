package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.room.p004y.C0744a;
import androidx.room.p004y.C0746c;
import androidx.room.p004y.C0747d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import p071f.p133t.p134a.C3537b;
import p071f.p133t.p134a.C3538c;

/* renamed from: androidx.room.r */
class C0734r implements C3538c {

    /* renamed from: a */
    private final Context f2890a;

    /* renamed from: b */
    private final String f2891b;

    /* renamed from: c */
    private final File f2892c;

    /* renamed from: d */
    private final int f2893d;

    /* renamed from: e */
    private final C3538c f2894e;

    /* renamed from: f */
    private C0686c f2895f;

    /* renamed from: g */
    private boolean f2896g;

    C0734r(Context context, String str, File file, int i, C3538c cVar) {
        this.f2890a = context;
        this.f2891b = str;
        this.f2892c = file;
        this.f2893d = i;
        this.f2894e = cVar;
    }

    /* renamed from: a */
    private void m4031a(File file) {
        ReadableByteChannel readableByteChannel;
        if (this.f2891b != null) {
            readableByteChannel = Channels.newChannel(this.f2890a.getAssets().open(this.f2891b));
        } else if (this.f2892c != null) {
            readableByteChannel = new FileInputStream(this.f2892c).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f2890a.getCacheDir());
        createTempFile.deleteOnExit();
        C0747d.m4065a(readableByteChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create directories for ");
            sb.append(file.getAbsolutePath());
            throw new IOException(sb.toString());
        } else if (!createTempFile.renameTo(file)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to move intermediate file (");
            sb2.append(createTempFile.getAbsolutePath());
            sb2.append(") to destination (");
            sb2.append(file.getAbsolutePath());
            sb2.append(").");
            throw new IOException(sb2.toString());
        }
    }

    /* renamed from: c */
    private void m4032c() {
        String str;
        String str2 = "ROOM";
        String b = mo4124b();
        File databasePath = this.f2890a.getDatabasePath(b);
        C0686c cVar = this.f2895f;
        C0744a aVar = new C0744a(b, this.f2890a.getFilesDir(), cVar == null || cVar.f2751j);
        try {
            aVar.mo4148a();
            str = "Unable to copy database file.";
            if (!databasePath.exists()) {
                m4031a(databasePath);
                aVar.mo4149b();
            } else if (this.f2895f == null) {
                aVar.mo4149b();
            } else {
                try {
                    int a = C0746c.m4062a(databasePath);
                    if (a == this.f2893d) {
                        aVar.mo4149b();
                    } else if (this.f2895f.mo4019a(a, this.f2893d)) {
                        aVar.mo4149b();
                    } else {
                        if (this.f2890a.deleteDatabase(b)) {
                            try {
                                m4031a(databasePath);
                            } catch (IOException e) {
                                Log.w(str2, str, e);
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to delete database file (");
                            sb.append(b);
                            sb.append(") for a copy destructive migration.");
                            Log.w(str2, sb.toString());
                        }
                        aVar.mo4149b();
                    }
                } catch (IOException e2) {
                    Log.w(str2, "Unable to read database version.", e2);
                    aVar.mo4149b();
                }
            }
        } catch (IOException e3) {
            throw new RuntimeException(str, e3);
        } catch (Throwable th) {
            aVar.mo4149b();
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized C3537b mo4121a() {
        if (!this.f2896g) {
            m4032c();
            this.f2896g = true;
        }
        return this.f2894e.mo4121a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4122a(C0686c cVar) {
        this.f2895f = cVar;
    }

    /* renamed from: a */
    public void mo4123a(boolean z) {
        this.f2894e.mo4123a(z);
    }

    /* renamed from: b */
    public String mo4124b() {
        return this.f2894e.mo4124b();
    }
}
