package androidx.room.p004y;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import androidx.room.C0711l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import p071f.p133t.p134a.C3537b;
import p071f.p133t.p134a.C3544e;

/* renamed from: androidx.room.y.c */
public class C0746c {
    /* renamed from: a */
    public static int m4062a(File file) {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel = new FileInputStream(file).getChannel();
            fileChannel.tryLock(60, 4, true);
            fileChannel.position(60);
            if (fileChannel.read(allocate) == 4) {
                allocate.rewind();
                return allocate.getInt();
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } finally {
            if (fileChannel != null) {
                fileChannel.close();
            }
        }
    }

    /* renamed from: a */
    public static Cursor m4063a(C0711l lVar, C3544e eVar, boolean z, CancellationSignal cancellationSignal) {
        Cursor a = lVar.mo4062a(eVar, cancellationSignal);
        if (!z || !(a instanceof AbstractWindowedCursor)) {
            return a;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) a;
        int count = abstractWindowedCursor.getCount();
        return (VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? C0745b.m4061a(abstractWindowedCursor) : a;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m4064a(C3537b bVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor b = bVar.mo11223b("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (b.moveToNext()) {
            try {
                arrayList.add(b.getString(0));
            } catch (Throwable th) {
                b.close();
                throw th;
            }
        }
        b.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                StringBuilder sb = new StringBuilder();
                sb.append("DROP TRIGGER IF EXISTS ");
                sb.append(str);
                bVar.execSQL(sb.toString());
            }
        }
    }
}
