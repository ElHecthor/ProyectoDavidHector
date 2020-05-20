package com.bumptech.glide.load.p013q.p016f;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p072a.p079o.C3127d;
import p071f.p097h.p098e.C3236a;
import p071f.p097h.p098e.p099c.C3248f;

/* renamed from: com.bumptech.glide.load.q.f.a */
public final class C1185a {

    /* renamed from: a */
    private static volatile boolean f3982a = true;

    /* renamed from: a */
    public static Drawable m5575a(Context context, int i, Theme theme) {
        return m5577a(context, context, i, theme);
    }

    /* renamed from: a */
    public static Drawable m5576a(Context context, Context context2, int i) {
        return m5577a(context, context2, i, null);
    }

    /* renamed from: a */
    private static Drawable m5577a(Context context, Context context2, int i, Theme theme) {
        try {
            if (f3982a) {
                return m5579c(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f3982a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C3236a.m13271c(context2, i);
            }
            throw e;
        } catch (NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m5578b(context2, i, theme);
    }

    /* renamed from: b */
    private static Drawable m5578b(Context context, int i, Theme theme) {
        return C3248f.m13322a(context.getResources(), i, theme);
    }

    /* renamed from: c */
    private static Drawable m5579c(Context context, int i, Theme theme) {
        if (theme != null) {
            context = new C3127d(context, theme);
        }
        return C3103a.m12557c(context, i);
    }
}
