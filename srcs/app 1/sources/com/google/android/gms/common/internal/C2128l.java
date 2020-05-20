package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p147g.p156d.p157a.p167b.p173d.p178e.C3879a;
import p147g.p156d.p157a.p167b.p173d.p178e.C3880b;
import p147g.p156d.p157a.p167b.p173d.p178e.C3881c;

/* renamed from: com.google.android.gms.common.internal.l */
public interface C2128l extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.l$a */
    public static abstract class C2129a extends C3879a implements C2128l {

        /* renamed from: com.google.android.gms.common.internal.l$a$a */
        public static class C2130a extends C3880b implements C2128l {
            C2130a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            /* renamed from: i */
            public final Account mo6911i() {
                Parcel a = mo12029a(2, mo12028a());
                Account account = (Account) C3881c.m15633a(a, Account.CREATOR);
                a.recycle();
                return account;
            }
        }

        /* renamed from: a */
        public static C2128l m8785a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof C2128l ? (C2128l) queryLocalInterface : new C2130a(iBinder);
        }
    }

    /* renamed from: i */
    Account mo6911i();
}
