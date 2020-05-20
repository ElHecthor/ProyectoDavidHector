package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.google.android.gms.common.p051p.C2175c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.common.util.a */
public class C2186a {
    /* renamed from: a */
    public static MessageDigest m8969a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m8970a(Context context, String str) {
        PackageInfo b = C2175c.m8939a(context).mo6964b(str, 64);
        Signature[] signatureArr = b.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            MessageDigest a = m8969a("SHA1");
            if (a != null) {
                return a.digest(b.signatures[0].toByteArray());
            }
        }
        return null;
    }
}
