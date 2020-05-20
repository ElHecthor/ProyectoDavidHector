package p071f.p139v;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p071f.p139v.C3607m.C3612e;
import p071f.p139v.C3607m.C3613f;

/* renamed from: f.v.q */
public class C3620q extends C3607m {

    /* renamed from: O */
    private ArrayList<C3607m> f10167O = new ArrayList<>();

    /* renamed from: P */
    private boolean f10168P = true;

    /* renamed from: Q */
    int f10169Q;

    /* renamed from: R */
    boolean f10170R = false;

    /* renamed from: S */
    private int f10171S = 0;

    /* renamed from: f.v.q$a */
    class C3621a extends C3615n {

        /* renamed from: a */
        final /* synthetic */ C3607m f10172a;

        C3621a(C3620q qVar, C3607m mVar) {
            this.f10172a = mVar;
        }

        /* renamed from: e */
        public void mo11308e(C3607m mVar) {
            this.f10172a.mo11387t();
            mVar.mo11366b((C3613f) this);
        }
    }

    /* renamed from: f.v.q$b */
    static class C3622b extends C3615n {

        /* renamed from: a */
        C3620q f10173a;

        C3622b(C3620q qVar) {
            this.f10173a = qVar;
        }

        /* renamed from: a */
        public void mo11327a(C3607m mVar) {
            C3620q qVar = this.f10173a;
            if (!qVar.f10170R) {
                qVar.mo11389u();
                this.f10173a.f10170R = true;
            }
        }

        /* renamed from: e */
        public void mo11308e(C3607m mVar) {
            C3620q qVar = this.f10173a;
            int i = qVar.f10169Q - 1;
            qVar.f10169Q = i;
            if (i == 0) {
                qVar.f10170R = false;
                qVar.mo11368b();
            }
            mVar.mo11366b((C3613f) this);
        }
    }

    /* renamed from: b */
    private void m14734b(C3607m mVar) {
        this.f10167O.add(mVar);
        mVar.f10148w = this;
    }

    /* renamed from: w */
    private void m14735w() {
        C3622b bVar = new C3622b(this);
        Iterator it = this.f10167O.iterator();
        while (it.hasNext()) {
            ((C3607m) it.next()).mo11354a((C3613f) bVar);
        }
        this.f10169Q = this.f10167O.size();
    }

    /* renamed from: a */
    public C3607m mo11399a(int i) {
        if (i < 0 || i >= this.f10167O.size()) {
            return null;
        }
        return (C3607m) this.f10167O.get(i);
    }

    /* renamed from: a */
    public C3620q m14741a(long j) {
        super.mo11351a(j);
        if (this.f10133h >= 0) {
            ArrayList<C3607m> arrayList = this.f10167O;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C3607m) this.f10167O.get(i)).mo11351a(j);
                }
            }
        }
        return this;
    }

    /* renamed from: a */
    public C3620q m14742a(TimeInterpolator timeInterpolator) {
        this.f10171S |= 1;
        ArrayList<C3607m> arrayList = this.f10167O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C3607m) this.f10167O.get(i)).mo11352a(timeInterpolator);
            }
        }
        super.mo11352a(timeInterpolator);
        return this;
    }

    /* renamed from: a */
    public C3620q m14743a(View view) {
        for (int i = 0; i < this.f10167O.size(); i++) {
            ((C3607m) this.f10167O.get(i)).mo11353a(view);
        }
        super.mo11353a(view);
        return this;
    }

    /* renamed from: a */
    public C3620q m14744a(C3613f fVar) {
        super.mo11354a(fVar);
        return this;
    }

    /* renamed from: a */
    public C3620q mo11400a(C3607m mVar) {
        m14734b(mVar);
        long j = this.f10133h;
        if (j >= 0) {
            mVar.mo11351a(j);
        }
        if ((this.f10171S & 1) != 0) {
            mVar.mo11352a(mo11377e());
        }
        if ((this.f10171S & 2) != 0) {
            mVar.mo11363a(mo11381l());
        }
        if ((this.f10171S & 4) != 0) {
            mVar.mo11361a(mo11380k());
        }
        if ((this.f10171S & 8) != 0) {
            mVar.mo11362a(mo11375d());
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo11356a(String str) {
        String a = super.mo11356a(str);
        for (int i = 0; i < this.f10167O.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n");
            C3607m mVar = (C3607m) this.f10167O.get(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(mVar.mo11356a(sb2.toString()));
            a = sb.toString();
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11359a(ViewGroup viewGroup, C3625t tVar, C3625t tVar2, ArrayList<C3624s> arrayList, ArrayList<C3624s> arrayList2) {
        long n = mo11382n();
        int size = this.f10167O.size();
        for (int i = 0; i < size; i++) {
            C3607m mVar = (C3607m) this.f10167O.get(i);
            if (n > 0 && (this.f10168P || i == 0)) {
                long n2 = mVar.mo11382n();
                if (n2 > 0) {
                    mVar.mo11365b(n2 + n);
                } else {
                    mVar.mo11365b(n);
                }
            }
            mVar.mo11359a(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public void mo11361a(C3592g gVar) {
        super.mo11361a(gVar);
        this.f10171S |= 4;
        if (this.f10167O != null) {
            for (int i = 0; i < this.f10167O.size(); i++) {
                ((C3607m) this.f10167O.get(i)).mo11361a(gVar);
            }
        }
    }

    /* renamed from: a */
    public void mo11362a(C3612e eVar) {
        super.mo11362a(eVar);
        this.f10171S |= 8;
        int size = this.f10167O.size();
        for (int i = 0; i < size; i++) {
            ((C3607m) this.f10167O.get(i)).mo11362a(eVar);
        }
    }

    /* renamed from: a */
    public void mo11363a(C3619p pVar) {
        super.mo11363a(pVar);
        this.f10171S |= 2;
        int size = this.f10167O.size();
        for (int i = 0; i < size; i++) {
            ((C3607m) this.f10167O.get(i)).mo11363a(pVar);
        }
    }

    /* renamed from: a */
    public void mo9000a(C3624s sVar) {
        if (mo11370b(sVar.f10178b)) {
            Iterator it = this.f10167O.iterator();
            while (it.hasNext()) {
                C3607m mVar = (C3607m) it.next();
                if (mVar.mo11370b(sVar.f10178b)) {
                    mVar.mo9000a(sVar);
                    sVar.f10179c.add(mVar);
                }
            }
        }
    }

    /* renamed from: b */
    public C3620q mo11401b(int i) {
        if (i == 0) {
            this.f10168P = true;
        } else if (i == 1) {
            this.f10168P = false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid parameter for TransitionSet ordering: ");
            sb.append(i);
            throw new AndroidRuntimeException(sb.toString());
        }
        return this;
    }

    /* renamed from: b */
    public C3620q m14755b(long j) {
        super.mo11365b(j);
        return this;
    }

    /* renamed from: b */
    public C3620q m14756b(C3613f fVar) {
        super.mo11366b(fVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11369b(C3624s sVar) {
        super.mo11369b(sVar);
        int size = this.f10167O.size();
        for (int i = 0; i < size; i++) {
            ((C3607m) this.f10167O.get(i)).mo11369b(sVar);
        }
    }

    /* renamed from: c */
    public void mo11372c(View view) {
        super.mo11372c(view);
        int size = this.f10167O.size();
        for (int i = 0; i < size; i++) {
            ((C3607m) this.f10167O.get(i)).mo11372c(view);
        }
    }

    /* renamed from: c */
    public void mo9001c(C3624s sVar) {
        if (mo11370b(sVar.f10178b)) {
            Iterator it = this.f10167O.iterator();
            while (it.hasNext()) {
                C3607m mVar = (C3607m) it.next();
                if (mVar.mo11370b(sVar.f10178b)) {
                    mVar.mo9001c(sVar);
                    sVar.f10179c.add(mVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        super.cancel();
        int size = this.f10167O.size();
        for (int i = 0; i < size; i++) {
            ((C3607m) this.f10167O.get(i)).cancel();
        }
    }

    public C3607m clone() {
        C3620q qVar = (C3620q) super.clone();
        qVar.f10167O = new ArrayList<>();
        int size = this.f10167O.size();
        for (int i = 0; i < size; i++) {
            qVar.m14734b(((C3607m) this.f10167O.get(i)).clone());
        }
        return qVar;
    }

    /* renamed from: d */
    public C3620q m14761d(View view) {
        for (int i = 0; i < this.f10167O.size(); i++) {
            ((C3607m) this.f10167O.get(i)).mo11376d(view);
        }
        super.mo11376d(view);
        return this;
    }

    /* renamed from: e */
    public void mo11378e(View view) {
        super.mo11378e(view);
        int size = this.f10167O.size();
        for (int i = 0; i < size; i++) {
            ((C3607m) this.f10167O.get(i)).mo11378e(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo11387t() {
        if (this.f10167O.isEmpty()) {
            mo11389u();
            mo11368b();
            return;
        }
        m14735w();
        if (!this.f10168P) {
            for (int i = 1; i < this.f10167O.size(); i++) {
                ((C3607m) this.f10167O.get(i - 1)).mo11354a((C3613f) new C3621a(this, (C3607m) this.f10167O.get(i)));
            }
            C3607m mVar = (C3607m) this.f10167O.get(0);
            if (mVar != null) {
                mVar.mo11387t();
            }
        } else {
            Iterator it = this.f10167O.iterator();
            while (it.hasNext()) {
                ((C3607m) it.next()).mo11387t();
            }
        }
    }

    /* renamed from: v */
    public int mo11402v() {
        return this.f10167O.size();
    }
}
