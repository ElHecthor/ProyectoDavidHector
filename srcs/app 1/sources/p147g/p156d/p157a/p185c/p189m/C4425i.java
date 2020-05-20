package p147g.p156d.p157a.p185c.p189m;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: g.d.a.c.m.i */
public class C4425i {

    /* renamed from: a */
    private long f11727a = 0;

    /* renamed from: b */
    private long f11728b = 300;

    /* renamed from: c */
    private TimeInterpolator f11729c = null;

    /* renamed from: d */
    private int f11730d = 0;

    /* renamed from: e */
    private int f11731e = 1;

    public C4425i(long j, long j2) {
        this.f11727a = j;
        this.f11728b = j2;
    }

    public C4425i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f11727a = j;
        this.f11728b = j2;
        this.f11729c = timeInterpolator;
    }

    /* renamed from: a */
    static C4425i m18030a(ValueAnimator valueAnimator) {
        C4425i iVar = new C4425i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m18031b(valueAnimator));
        iVar.f11730d = valueAnimator.getRepeatCount();
        iVar.f11731e = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: b */
    private static TimeInterpolator m18031b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C4417a.f11713b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C4417a.f11714c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            interpolator = C4417a.f11715d;
        }
        return interpolator;
    }

    /* renamed from: a */
    public long mo13179a() {
        return this.f11727a;
    }

    /* renamed from: a */
    public void mo13180a(Animator animator) {
        animator.setStartDelay(mo13179a());
        animator.setDuration(mo13181b());
        animator.setInterpolator(mo13182c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo13183d());
            valueAnimator.setRepeatMode(mo13184e());
        }
    }

    /* renamed from: b */
    public long mo13181b() {
        return this.f11728b;
    }

    /* renamed from: c */
    public TimeInterpolator mo13182c() {
        TimeInterpolator timeInterpolator = this.f11729c;
        return timeInterpolator != null ? timeInterpolator : C4417a.f11713b;
    }

    /* renamed from: d */
    public int mo13183d() {
        return this.f11730d;
    }

    /* renamed from: e */
    public int mo13184e() {
        return this.f11731e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4425i)) {
            return false;
        }
        C4425i iVar = (C4425i) obj;
        if (mo13179a() == iVar.mo13179a() && mo13181b() == iVar.mo13181b() && mo13183d() == iVar.mo13183d() && mo13184e() == iVar.mo13184e()) {
            return mo13182c().getClass().equals(iVar.mo13182c().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (mo13179a() ^ (mo13179a() >>> 32))) * 31) + ((int) (mo13181b() ^ (mo13181b() >>> 32)))) * 31) + mo13182c().getClass().hashCode()) * 31) + mo13183d()) * 31) + mo13184e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(C4425i.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(mo13179a());
        sb.append(" duration: ");
        sb.append(mo13181b());
        sb.append(" interpolator: ");
        sb.append(mo13182c().getClass());
        sb.append(" repeatCount: ");
        sb.append(mo13183d());
        sb.append(" repeatMode: ");
        sb.append(mo13184e());
        sb.append("}\n");
        return sb.toString();
    }
}
