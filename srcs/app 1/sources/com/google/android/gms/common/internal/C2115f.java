package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.C2034i;

/* renamed from: com.google.android.gms.common.internal.f */
public abstract class C2115f implements OnClickListener {
    /* renamed from: a */
    public static C2115f m8754a(Activity activity, Intent intent, int i) {
        return new C2164z(intent, activity, i);
    }

    /* renamed from: a */
    public static C2115f m8755a(Fragment fragment, Intent intent, int i) {
        return new C2163y(intent, fragment, i);
    }

    /* renamed from: a */
    public static C2115f m8756a(C2034i iVar, Intent intent, int i) {
        return new C2092a0(intent, iVar, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6815a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo6815a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
