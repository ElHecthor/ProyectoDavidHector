package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import androidx.fragment.app.C0425c;
import androidx.fragment.app.C0445l;
import com.google.android.gms.common.internal.C2148s;

/* renamed from: com.google.android.gms.common.l */
public class C2167l extends C0425c {

    /* renamed from: p0 */
    private Dialog f6127p0 = null;

    /* renamed from: q0 */
    private OnCancelListener f6128q0 = null;

    /* renamed from: a */
    public static C2167l m8919a(Dialog dialog, OnCancelListener onCancelListener) {
        C2167l lVar = new C2167l();
        C2148s.m8835a(dialog, (Object) "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        lVar.f6127p0 = dialog2;
        if (onCancelListener != null) {
            lVar.f6128q0 = onCancelListener;
        }
        return lVar;
    }

    /* renamed from: a */
    public void mo2649a(C0445l lVar, String str) {
        super.mo2649a(lVar, str);
    }

    /* renamed from: n */
    public Dialog mo376n(Bundle bundle) {
        if (this.f6127p0 == null) {
            mo2650j(false);
        }
        return this.f6127p0;
    }

    public void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.f6128q0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
