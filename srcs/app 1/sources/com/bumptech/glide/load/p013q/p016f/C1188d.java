package com.bumptech.glide.load.p013q.p016f;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0875k;
import com.bumptech.glide.load.p007o.C1020v;
import java.util.List;

/* renamed from: com.bumptech.glide.load.q.f.d */
public class C1188d implements C0875k<Uri, Drawable> {

    /* renamed from: a */
    private final Context f3984a;

    public C1188d(Context context) {
        this.f3984a = context.getApplicationContext();
    }

    /* renamed from: a */
    private int m5585a(Context context, Uri uri) {
        List pathSegments = uri.getPathSegments();
        String str = (String) pathSegments.get(0);
        String str2 = (String) pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, uri.getAuthority());
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to find resource id for: ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private int m5586a(Uri uri) {
        try {
            return Integer.parseInt((String) uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized Uri format: ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    private Context m5587a(Uri uri, String str) {
        if (str.equals(this.f3984a.getPackageName())) {
            return this.f3984a;
        }
        try {
            return this.f3984a.createPackageContext(str, 0);
        } catch (NameNotFoundException e) {
            if (str.contains(this.f3984a.getPackageName())) {
                return this.f3984a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to obtain context or unrecognized Uri format for: ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    /* renamed from: b */
    private int m5588b(Context context, Uri uri) {
        List pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m5585a(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m5586a(uri);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized Uri format: ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public C1020v<Drawable> mo4631a(Uri uri, int i, int i2, C0873i iVar) {
        Context a = m5587a(uri, uri.getAuthority());
        return C1187c.m5581a(C1185a.m5576a(this.f3984a, a, m5588b(a, uri)));
    }

    /* renamed from: a */
    public boolean mo4632a(Uri uri, C0873i iVar) {
        return uri.getScheme().equals("android.resource");
    }
}
