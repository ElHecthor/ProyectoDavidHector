package p308k.p314u;

/* renamed from: k.u.e */
class C5826e {
    /* renamed from: a */
    public static final void m22099a(int i, int i2) {
        if (i > i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("toIndex (");
            sb.append(i);
            sb.append(") is greater than size (");
            sb.append(i2);
            sb.append(").");
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }
}
