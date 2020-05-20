package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.C2873d;
import com.google.firebase.components.C2873d.C2875b;
import com.google.firebase.components.C2882h;
import com.google.firebase.components.C2891n;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.C3004h;
import com.google.firebase.p060g.C2921c;
import com.google.firebase.p066j.C3042g;
import com.google.firebase.p066j.C3043h;
import java.util.Arrays;
import java.util.List;
import p147g.p156d.p157a.p158a.C3739b;
import p147g.p156d.p157a.p158a.C3740c;
import p147g.p156d.p157a.p158a.C3742e;
import p147g.p156d.p157a.p158a.C3743f;
import p147g.p156d.p157a.p158a.C3744g;

@Keep
public class FirebaseMessagingRegistrar implements C2882h {

    /* renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$a */
    private static class C3044a<T> implements C3743f<T> {
        private C3044a() {
        }

        /* renamed from: a */
        public final void mo9806a(C3740c<T> cVar) {
        }
    }

    /* renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$b */
    public static class C3045b implements C3744g {
        /* renamed from: a */
        public final <T> C3743f<T> mo9807a(String str, Class<T> cls, C3739b bVar, C3742e<T, byte[]> eVar) {
            return new C3044a();
        }
    }

    @Keep
    public List<C2873d<?>> getComponents() {
        C2875b a = C2873d.m11915a(FirebaseMessaging.class);
        a.mo9547a(C2891n.m11973b(FirebaseApp.class));
        a.mo9547a(C2891n.m11973b(FirebaseInstanceId.class));
        a.mo9547a(C2891n.m11973b(C3043h.class));
        a.mo9547a(C2891n.m11973b(C2921c.class));
        a.mo9547a(C2891n.m11972a(C3744g.class));
        a.mo9547a(C2891n.m11973b(C3004h.class));
        a.mo9546a(C3071s.f8731a);
        a.mo9545a();
        return Arrays.asList(new C2873d[]{a.mo9548b(), C3042g.m12399a("fire-fcm", "20.1.7")});
    }
}
