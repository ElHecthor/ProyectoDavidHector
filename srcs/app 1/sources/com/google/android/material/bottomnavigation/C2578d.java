package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.appcompat.view.menu.C0122g;
import androidx.appcompat.view.menu.C0126i;
import androidx.appcompat.view.menu.C0137m;
import androidx.appcompat.view.menu.C0137m.C0138a;
import androidx.appcompat.view.menu.C0146r;
import com.google.android.material.internal.C2704e;
import p147g.p156d.p157a.p185c.p190n.C4431b;

/* renamed from: com.google.android.material.bottomnavigation.d */
public class C2578d implements C0137m {

    /* renamed from: f */
    private C0122g f7314f;

    /* renamed from: g */
    private C2575c f7315g;

    /* renamed from: h */
    private boolean f7316h = false;

    /* renamed from: i */
    private int f7317i;

    /* renamed from: com.google.android.material.bottomnavigation.d$a */
    static class C2579a implements Parcelable {
        public static final Creator<C2579a> CREATOR = new C2580a();

        /* renamed from: f */
        int f7318f;

        /* renamed from: g */
        C2704e f7319g;

        /* renamed from: com.google.android.material.bottomnavigation.d$a$a */
        static class C2580a implements Creator<C2579a> {
            C2580a() {
            }

            public C2579a createFromParcel(Parcel parcel) {
                return new C2579a(parcel);
            }

            public C2579a[] newArray(int i) {
                return new C2579a[i];
            }
        }

        C2579a() {
        }

        C2579a(Parcel parcel) {
            this.f7318f = parcel.readInt();
            this.f7319g = (C2704e) parcel.readParcelable(C2579a.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7318f);
            parcel.writeParcelable(this.f7319g, 0);
        }
    }

    /* renamed from: a */
    public void mo8099a(int i) {
        this.f7317i = i;
    }

    /* renamed from: a */
    public void mo513a(Context context, C0122g gVar) {
        this.f7314f = gVar;
        this.f7315g.mo438a(gVar);
    }

    /* renamed from: a */
    public void mo532a(Parcelable parcelable) {
        if (parcelable instanceof C2579a) {
            C2579a aVar = (C2579a) parcelable;
            this.f7315g.mo8071b(aVar.f7318f);
            this.f7315g.setBadgeDrawables(C4431b.m18085a(this.f7315g.getContext(), aVar.f7319g));
        }
    }

    /* renamed from: a */
    public void mo515a(C0122g gVar, boolean z) {
    }

    /* renamed from: a */
    public void mo517a(C0138a aVar) {
    }

    /* renamed from: a */
    public void mo8100a(C2575c cVar) {
        this.f7315g = cVar;
    }

    /* renamed from: a */
    public void mo518a(boolean z) {
        if (!this.f7316h) {
            if (z) {
                this.f7315g.mo8070a();
            } else {
                this.f7315g.mo8073c();
            }
        }
    }

    /* renamed from: a */
    public boolean mo521a(C0122g gVar, C0126i iVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo522a(C0146r rVar) {
        return false;
    }

    /* renamed from: b */
    public void mo8101b(boolean z) {
        this.f7316h = z;
    }

    /* renamed from: b */
    public boolean mo524b(C0122g gVar, C0126i iVar) {
        return false;
    }

    /* renamed from: d */
    public int mo525d() {
        return this.f7317i;
    }

    /* renamed from: f */
    public boolean mo545f() {
        return false;
    }

    /* renamed from: g */
    public Parcelable mo546g() {
        C2579a aVar = new C2579a();
        aVar.f7318f = this.f7315g.getSelectedItemId();
        aVar.f7319g = C4431b.m18086a(this.f7315g.getBadgeDrawables());
        return aVar;
    }
}
