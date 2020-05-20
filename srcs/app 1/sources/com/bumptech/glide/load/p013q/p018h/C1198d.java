package com.bumptech.glide.load.p013q.p018h;

import android.util.Log;
import com.bumptech.glide.load.C0858c;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0876l;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.p029t.C1296a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.q.h.d */
public class C1198d implements C0876l<C1196c> {
    /* renamed from: a */
    public C0858c mo4633a(C0873i iVar) {
        return C0858c.SOURCE;
    }

    /* renamed from: a */
    public boolean mo4615a(C1020v<C1196c> vVar, File file, C0873i iVar) {
        try {
            C1296a.m6121a(((C1196c) vVar.get()).mo5092b(), file);
            return true;
        } catch (IOException e) {
            String str = "GifEncoder";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
