package p147g.p156d.p157a.p167b.p172c;

import android.os.IBinder;
import android.os.IInterface;
import p147g.p156d.p157a.p167b.p173d.p178e.C3879a;
import p147g.p156d.p157a.p167b.p173d.p178e.C3880b;

/* renamed from: g.d.a.b.c.a */
public interface C3851a extends IInterface {

    /* renamed from: g.d.a.b.c.a$a */
    public static abstract class C3852a extends C3879a implements C3851a {

        /* renamed from: g.d.a.b.c.a$a$a */
        public static class C3853a extends C3880b implements C3851a {
            C3853a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C3852a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static C3851a m15591a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof C3851a ? (C3851a) queryLocalInterface : new C3853a(iBinder);
        }
    }
}
