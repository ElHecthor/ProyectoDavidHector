package com.google.android.gms.common.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.common.internal.p */
public class C2139p {

    /* renamed from: b */
    private static final C2124j f6097b = new C2124j("LibraryVersion", "");

    /* renamed from: c */
    private static C2139p f6098c = new C2139p();

    /* renamed from: a */
    private ConcurrentHashMap<String, String> f6099a = new ConcurrentHashMap<>();

    protected C2139p() {
    }

    /* renamed from: a */
    public static C2139p m8817a() {
        return f6098c;
    }

    /* renamed from: a */
    public String mo6932a(String str) {
        String str2 = "Failed to get app version for libraryName: ";
        String str3 = "LibraryVersion";
        C2148s.m8836a(str, (Object) "Please provide a valid libraryName");
        if (this.f6099a.containsKey(str)) {
            return (String) this.f6099a.get(str);
        }
        Properties properties = new Properties();
        String str4 = null;
        try {
            InputStream resourceAsStream = C2139p.class.getResourceAsStream(String.format("/%s.properties", new Object[]{str}));
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                str4 = properties.getProperty("version", null);
                C2124j jVar = f6097b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str4).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str4);
                jVar.mo6903b(str3, sb.toString());
            } else {
                C2124j jVar2 = f6097b;
                String valueOf = String.valueOf(str);
                jVar2.mo6904c(str3, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        } catch (IOException e) {
            C2124j jVar3 = f6097b;
            String valueOf2 = String.valueOf(str);
            jVar3.mo6901a(str3, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
        if (str4 == null) {
            f6097b.mo6900a(str3, ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
            str4 = "UNKNOWN";
        }
        this.f6099a.put(str, str4);
        return str4;
    }
}
