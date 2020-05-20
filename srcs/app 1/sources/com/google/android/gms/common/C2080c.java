package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.common.internal.C2148s;

/* renamed from: com.google.android.gms.common.c */
public class C2080c extends DialogFragment {

    /* renamed from: f */
    private Dialog f5971f = null;

    /* renamed from: g */
    private OnCancelListener f5972g = null;

    /* renamed from: a */
    public static C2080c m8606a(Dialog dialog, OnCancelListener onCancelListener) {
        C2080c cVar = new C2080c();
        C2148s.m8835a(dialog, (Object) "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        cVar.f5971f = dialog2;
        if (onCancelListener != null) {
            cVar.f5972g = onCancelListener;
        }
        return cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.f5972g;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f5971f == null) {
            setShowsDialog(false);
        }
        return this.f5971f;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
