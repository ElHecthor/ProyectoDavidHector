package p071f.p133t.p134a;

/* renamed from: f.t.a.a */
public final class C3536a implements C3544e {

    /* renamed from: f */
    private final String f10008f;

    /* renamed from: g */
    private final Object[] f10009g;

    public C3536a(String str) {
        this(str, null);
    }

    public C3536a(String str, Object[] objArr) {
        this.f10008f = str;
        this.f10009g = objArr;
    }

    /* renamed from: a */
    private static void m14475a(C3543d dVar, int i, Object obj) {
        long j;
        int byteValue;
        double doubleValue;
        if (obj == null) {
            dVar.bindNull(i);
        } else if (obj instanceof byte[]) {
            dVar.bindBlob(i, (byte[]) obj);
        } else {
            if (obj instanceof Float) {
                doubleValue = (double) ((Float) obj).floatValue();
            } else if (obj instanceof Double) {
                doubleValue = ((Double) obj).doubleValue();
            } else {
                if (obj instanceof Long) {
                    j = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        byteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        byteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        byteValue = ((Byte) obj).byteValue();
                    } else if (obj instanceof String) {
                        dVar.bindString(i, (String) obj);
                        return;
                    } else if (obj instanceof Boolean) {
                        j = ((Boolean) obj).booleanValue() ? 1 : 0;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot bind ");
                        sb.append(obj);
                        sb.append(" at index ");
                        sb.append(i);
                        sb.append(" Supported types: null, byte[], float, double, long, int, short, byte,");
                        sb.append(" string");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    j = (long) byteValue;
                }
                dVar.bindLong(i, j);
                return;
            }
            dVar.bindDouble(i, doubleValue);
        }
    }

    /* renamed from: a */
    public static void m14476a(C3543d dVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                m14475a(dVar, i, obj);
            }
        }
    }

    /* renamed from: a */
    public String mo4105a() {
        return this.f10008f;
    }

    /* renamed from: a */
    public void mo4107a(C3543d dVar) {
        m14476a(dVar, this.f10009g);
    }

    /* renamed from: d */
    public int mo4115d() {
        Object[] objArr = this.f10009g;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }
}
