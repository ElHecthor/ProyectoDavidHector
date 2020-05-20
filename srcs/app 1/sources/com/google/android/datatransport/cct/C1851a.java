package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p147g.p156d.p157a.p158a.C3739b;
import p147g.p156d.p157a.p158a.p159i.C3759f;

/* renamed from: com.google.android.datatransport.cct.a */
public final class C1851a implements C3759f {

    /* renamed from: c */
    static final String f5489c = C1897f.m8084a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d */
    static final String f5490d = C1897f.m8084a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");

    /* renamed from: e */
    private static final String f5491e = C1897f.m8084a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");

    /* renamed from: f */
    private static final Set<C3739b> f5492f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C3739b[]{C3739b.m15293a("proto"), C3739b.m15293a("json")})));

    /* renamed from: g */
    public static final C1851a f5493g = new C1851a(f5490d, f5491e);

    /* renamed from: a */
    private final String f5494a;

    /* renamed from: b */
    private final String f5495b;

    static {
        new C1851a(f5489c, null);
    }

    public C1851a(String str, String str2) {
        this.f5494a = str;
        this.f5495b = str2;
    }

    /* renamed from: a */
    public static C1851a m7951a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C1851a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    /* renamed from: a */
    public Set<C3739b> mo6309a() {
        return f5492f;
    }

    /* renamed from: b */
    public String mo6310b() {
        return "cct";
    }

    /* renamed from: c */
    public byte[] mo6311c() {
        return mo6312d();
    }

    /* renamed from: d */
    public byte[] mo6312d() {
        if (this.f5495b == null && this.f5494a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f5494a;
        objArr[2] = "\\";
        String str = this.f5495b;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: e */
    public String mo6313e() {
        return this.f5495b;
    }

    /* renamed from: f */
    public String mo6314f() {
        return this.f5494a;
    }
}
