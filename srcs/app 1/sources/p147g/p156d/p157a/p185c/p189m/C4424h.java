package p147g.p156d.p157a.p185c.p189m;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;
import p071f.p088e.C3175g;

/* renamed from: g.d.a.c.m.h */
public class C4424h {

    /* renamed from: a */
    private final C3175g<String, C4425i> f11725a = new C3175g<>();

    /* renamed from: b */
    private final C3175g<String, PropertyValuesHolder[]> f11726b = new C3175g<>();

    /* renamed from: a */
    public static C4424h m18017a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m18019a((List<Animator>) ((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m18019a((List<Animator>) arrayList);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            Log.w("MotionSpec", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    public static C4424h m18018a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return m18017a(context, resourceId);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C4424h m18019a(List<Animator> list) {
        C4424h hVar = new C4424h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m18020a(hVar, (Animator) list.get(i));
        }
        return hVar;
    }

    /* renamed from: a */
    private static void m18020a(C4424h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.mo13171a(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.mo13170a(objectAnimator.getPropertyName(), C4425i.m18030a((ValueAnimator) objectAnimator));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Animator must be an ObjectAnimator: ");
        sb.append(animator);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private PropertyValuesHolder[] m18021a(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    /* renamed from: a */
    public long mo13168a() {
        int size = this.f11725a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C4425i iVar = (C4425i) this.f11725a.mo10274d(i);
            j = Math.max(j, iVar.mo13179a() + iVar.mo13181b());
        }
        return j;
    }

    /* renamed from: a */
    public <T> ObjectAnimator mo13169a(String str, T t, Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, mo13172a(str));
        ofPropertyValuesHolder.setProperty(property);
        mo13173b(str).mo13180a((Animator) ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    /* renamed from: a */
    public void mo13170a(String str, C4425i iVar) {
        this.f11725a.put(str, iVar);
    }

    /* renamed from: a */
    public void mo13171a(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f11726b.put(str, propertyValuesHolderArr);
    }

    /* renamed from: a */
    public PropertyValuesHolder[] mo13172a(String str) {
        if (mo13174c(str)) {
            return m18021a((PropertyValuesHolder[]) this.f11726b.get(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public C4425i mo13173b(String str) {
        if (mo13175d(str)) {
            return (C4425i) this.f11725a.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public boolean mo13174c(String str) {
        return this.f11726b.get(str) != null;
    }

    /* renamed from: d */
    public boolean mo13175d(String str) {
        return this.f11725a.get(str) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4424h)) {
            return false;
        }
        return this.f11725a.equals(((C4424h) obj).f11725a);
    }

    public int hashCode() {
        return this.f11725a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(C4424h.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.f11725a);
        sb.append("}\n");
        return sb.toString();
    }
}
