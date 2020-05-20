package com.bumptech.glide.load.p011p;

import android.util.Log;
import com.bumptech.glide.load.C0859d;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.p029t.C1296a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.c */
public class C1038c implements C0859d<ByteBuffer> {
    /* renamed from: a */
    public boolean mo4615a(ByteBuffer byteBuffer, File file, C0873i iVar) {
        try {
            C1296a.m6121a(byteBuffer, file);
            return true;
        } catch (IOException e) {
            String str = "ByteBufferEncoder";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to write data", e);
            }
            return false;
        }
    }
}
