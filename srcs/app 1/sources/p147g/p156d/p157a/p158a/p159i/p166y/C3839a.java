package p147g.p156d.p157a.p158a.p159i.p166y;

import android.util.SparseArray;
import java.util.EnumMap;
import p147g.p156d.p157a.p158a.C3741d;

/* renamed from: g.d.a.a.i.y.a */
public final class C3839a {

    /* renamed from: a */
    private static SparseArray<C3741d> f10759a = new SparseArray<>();

    /* renamed from: b */
    private static EnumMap<C3741d, Integer> f10760b;

    static {
        EnumMap<C3741d, Integer> enumMap = new EnumMap<>(C3741d.class);
        f10760b = enumMap;
        enumMap.put(C3741d.DEFAULT, Integer.valueOf(0));
        f10760b.put(C3741d.VERY_LOW, Integer.valueOf(1));
        f10760b.put(C3741d.HIGHEST, Integer.valueOf(2));
        for (C3741d dVar : f10760b.keySet()) {
            f10759a.append(((Integer) f10760b.get(dVar)).intValue(), dVar);
        }
    }

    /* renamed from: a */
    public static int m15580a(C3741d dVar) {
        Integer num = (Integer) f10760b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PriorityMapping is missing known Priority value ");
        sb.append(dVar);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public static C3741d m15581a(int i) {
        C3741d dVar = (C3741d) f10759a.get(i);
        if (dVar != null) {
            return dVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown Priority for value ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
