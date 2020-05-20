package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout.C0306b;
import java.util.Arrays;
import java.util.HashMap;
import p071f.p089f.p093b.p094j.C3196e;
import p071f.p089f.p093b.p094j.C3204i;

/* renamed from: androidx.constraintlayout.widget.b */
public abstract class C0312b extends View {

    /* renamed from: f */
    protected int[] f1425f = new int[32];

    /* renamed from: g */
    protected int f1426g;

    /* renamed from: h */
    protected Context f1427h;

    /* renamed from: i */
    protected C3204i f1428i;

    /* renamed from: j */
    protected boolean f1429j = false;

    /* renamed from: k */
    protected String f1430k;

    /* renamed from: l */
    private HashMap<Integer, String> f1431l = new HashMap<>();

    public C0312b(Context context) {
        super(context);
        this.f1427h = context;
        mo1929a((AttributeSet) null);
    }

    public C0312b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1427h = context;
        mo1929a(attributeSet);
    }

    public C0312b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1427h = context;
        mo1929a(attributeSet);
    }

    /* renamed from: a */
    private int m1618a(ConstraintLayout constraintLayout, String str) {
        if (!(str == null || constraintLayout == null)) {
            Resources resources = getResources();
            if (resources == null) {
                return 0;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    String str2 = null;
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (NotFoundException unused) {
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    private void m1619a(int i) {
        int i2 = this.f1426g + 1;
        int[] iArr = this.f1425f;
        if (i2 > iArr.length) {
            this.f1425f = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1425f;
        int i3 = this.f1426g;
        iArr2[i3] = i;
        this.f1426g = i3 + 1;
    }

    /* renamed from: a */
    private void m1620a(String str) {
        if (str != null && str.length() != 0 && this.f1427h != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            int i = 0;
            if (isInEditMode() && constraintLayout != null) {
                Object a = constraintLayout.mo1962a(0, trim);
                if (a != null && (a instanceof Integer)) {
                    i = ((Integer) a).intValue();
                }
            }
            if (i == 0 && constraintLayout != null) {
                i = m1618a(constraintLayout, trim);
            }
            if (i == 0) {
                i = this.f1427h.getResources().getIdentifier(trim, "id", this.f1427h.getPackageName());
            }
            if (i != 0) {
                this.f1431l.put(Integer.valueOf(i), trim);
                m1619a(i);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find id of \"");
                sb.append(trim);
                sb.append("\"");
                Log.w("ConstraintHelper", sb.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo2000a() {
        if (this.f1428i != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C0306b) {
                ((C0306b) layoutParams).f1392m0 = (C3196e) this.f1428i;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1929a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0328j.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0328j.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1430k = string;
                    setIds(string);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2001a(ConstraintLayout constraintLayout) {
    }

    /* renamed from: a */
    public void mo1930a(C3196e eVar, boolean z) {
    }

    /* renamed from: b */
    public void mo2002b(ConstraintLayout constraintLayout) {
    }

    /* renamed from: c */
    public void mo2003c(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f1430k);
        }
        if (this.f1428i != null) {
            String str = this.f1430k;
            if (str != null) {
                setIds(str);
            }
            this.f1428i.mo10526a();
            for (int i = 0; i < this.f1426g; i++) {
                int i2 = this.f1425f[i];
                View a = constraintLayout.mo1960a(i2);
                if (a == null) {
                    String str2 = (String) this.f1431l.get(Integer.valueOf(i2));
                    int a2 = m1618a(constraintLayout, str2);
                    if (a2 != 0) {
                        this.f1425f[i] = a2;
                        this.f1431l.put(Integer.valueOf(a2), str2);
                        a = constraintLayout.mo1960a(a2);
                    }
                }
                if (a != null) {
                    this.f1428i.mo10527a(constraintLayout.mo1961a(a));
                }
            }
            this.f1428i.mo10528a(constraintLayout.f1323i);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1425f, this.f1426g);
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1429j) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f1430k = str;
        if (str != null) {
            int i = 0;
            this.f1426g = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m1620a(str.substring(i));
                    return;
                } else {
                    m1620a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1430k = null;
        this.f1426g = 0;
        for (int a : iArr) {
            m1619a(a);
        }
    }
}
