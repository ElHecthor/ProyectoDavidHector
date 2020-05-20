package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j */
    static final Mode f1722j = Mode.SRC_IN;

    /* renamed from: a */
    public int f1723a = -1;

    /* renamed from: b */
    Object f1724b;

    /* renamed from: c */
    public byte[] f1725c = null;

    /* renamed from: d */
    public Parcelable f1726d = null;

    /* renamed from: e */
    public int f1727e = 0;

    /* renamed from: f */
    public int f1728f = 0;

    /* renamed from: g */
    public ColorStateList f1729g = null;

    /* renamed from: h */
    Mode f1730h = f1722j;

    /* renamed from: i */
    public String f1731i = null;

    public IconCompat() {
    }

    private IconCompat(int i) {
        this.f1723a = i;
    }

    /* renamed from: a */
    private static int m1884a(Icon icon) {
        String str = "Unable to get icon resource";
        String str2 = "IconCompat";
        if (VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e(str2, str, e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e(str2, str, e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e(str2, str, e3);
            return 0;
        }
    }

    /* renamed from: a */
    static Bitmap m1885a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        TileMode tileMode = TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: a */
    public static IconCompat m1886a(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1727e = i;
            if (resources != null) {
                try {
                    iconCompat.f1724b = resources.getResourceName(i);
                } catch (NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f1724b = str;
            }
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    /* renamed from: a */
    private static String m1887a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "BITMAP_MASKABLE" : "URI" : "DATA" : "RESOURCE" : "BITMAP";
    }

    /* renamed from: b */
    private static String m1888b(Icon icon) {
        String str = "Unable to get icon package";
        String str2 = "IconCompat";
        if (VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e(str2, str, e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e(str2, str, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e(str2, str, e3);
            return null;
        }
    }

    /* renamed from: c */
    private static int m1889c(Icon icon) {
        StringBuilder sb;
        String str = "Unable to get icon type ";
        String str2 = "IconCompat";
        if (VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            e = e;
            sb = new StringBuilder();
            sb.append(str);
            sb.append(icon);
            Log.e(str2, sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e2) {
            e = e2;
            sb = new StringBuilder();
            sb.append(str);
            sb.append(icon);
            Log.e(str2, sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append(str);
            sb.append(icon);
            Log.e(str2, sb.toString(), e);
            return -1;
        }
    }

    /* renamed from: a */
    public int mo2234a() {
        if (this.f1723a == -1 && VERSION.SDK_INT >= 23) {
            return m1884a((Icon) this.f1724b);
        }
        if (this.f1723a == 2) {
            return this.f1727e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResId() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public void mo2235a(boolean z) {
        this.f1731i = this.f1730h.name();
        int i = this.f1723a;
        if (i != -1) {
            if (i != 1) {
                String str = "UTF-16";
                if (i == 2) {
                    this.f1725c = ((String) this.f1724b).getBytes(Charset.forName(str));
                    return;
                } else if (i == 3) {
                    this.f1725c = (byte[]) this.f1724b;
                    return;
                } else if (i == 4) {
                    this.f1725c = this.f1724b.toString().getBytes(Charset.forName(str));
                    return;
                } else if (i != 5) {
                    return;
                }
            }
            if (z) {
                Bitmap bitmap = (Bitmap) this.f1724b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f1725c = byteArrayOutputStream.toByteArray();
                return;
            }
        } else if (z) {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
        this.f1726d = (Parcelable) this.f1724b;
    }

    /* renamed from: b */
    public String mo2236b() {
        if (this.f1723a == -1 && VERSION.SDK_INT >= 23) {
            return m1888b((Icon) this.f1724b);
        }
        if (this.f1723a == 2) {
            return ((String) this.f1724b).split(":", -1)[0];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResPackage() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public int mo2237c() {
        return (this.f1723a != -1 || VERSION.SDK_INT < 23) ? this.f1723a : m1889c((Icon) this.f1724b);
    }

    /* renamed from: d */
    public void mo2238d() {
        Parcelable parcelable;
        this.f1730h = Mode.valueOf(this.f1731i);
        int i = this.f1723a;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f1724b = this.f1725c;
                        return;
                    } else if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    }
                }
                this.f1724b = new String(this.f1725c, Charset.forName("UTF-16"));
                return;
            }
            parcelable = this.f1726d;
            if (parcelable == null) {
                byte[] bArr = this.f1725c;
                this.f1724b = bArr;
                this.f1723a = 3;
                this.f1727e = 0;
                this.f1728f = bArr.length;
                return;
            }
        } else {
            parcelable = this.f1726d;
            if (parcelable == null) {
                throw new IllegalArgumentException("Invalid icon");
            }
        }
        this.f1724b = parcelable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Icon mo2239e() {
        /*
            r3 = this;
            int r0 = r3.f1723a
            r1 = -1
            if (r0 == r1) goto L_0x006f
            r1 = 1
            if (r0 == r1) goto L_0x0056
            r1 = 2
            if (r0 == r1) goto L_0x004b
            r1 = 3
            if (r0 == r1) goto L_0x003e
            r1 = 4
            if (r0 == r1) goto L_0x0035
            r1 = 5
            if (r0 != r1) goto L_0x002d
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0023
            java.lang.Object r0 = r3.f1724b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r0)
            goto L_0x005e
        L_0x0023:
            java.lang.Object r0 = r3.f1724b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r1 = 0
            android.graphics.Bitmap r0 = m1885a(r0, r1)
            goto L_0x005a
        L_0x002d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown type"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            java.lang.Object r0 = r3.f1724b
            java.lang.String r0 = (java.lang.String) r0
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithContentUri(r0)
            goto L_0x005e
        L_0x003e:
            java.lang.Object r0 = r3.f1724b
            byte[] r0 = (byte[]) r0
            int r1 = r3.f1727e
            int r2 = r3.f1728f
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithData(r0, r1, r2)
            goto L_0x005e
        L_0x004b:
            java.lang.String r0 = r3.mo2236b()
            int r1 = r3.f1727e
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithResource(r0, r1)
            goto L_0x005e
        L_0x0056:
            java.lang.Object r0 = r3.f1724b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
        L_0x005a:
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithBitmap(r0)
        L_0x005e:
            android.content.res.ColorStateList r1 = r3.f1729g
            if (r1 == 0) goto L_0x0065
            r0.setTintList(r1)
        L_0x0065:
            android.graphics.PorterDuff$Mode r1 = r3.f1730h
            android.graphics.PorterDuff$Mode r2 = f1722j
            if (r1 == r2) goto L_0x006e
            r0.setTintMode(r1)
        L_0x006e:
            return r0
        L_0x006f:
            java.lang.Object r0 = r3.f1724b
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.mo2239e():android.graphics.drawable.Icon");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != 5) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f1723a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f1724b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f1723a
            java.lang.String r1 = m1887a(r1)
            r0.append(r1)
            int r1 = r4.f1723a
            r2 = 1
            if (r1 == r2) goto L_0x0077
            r3 = 2
            if (r1 == r3) goto L_0x004f
            r2 = 3
            if (r1 == r2) goto L_0x0039
            r2 = 4
            if (r1 == r2) goto L_0x002e
            r2 = 5
            if (r1 == r2) goto L_0x0077
            goto L_0x0097
        L_0x002e:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f1724b
            r0.append(r1)
            goto L_0x0097
        L_0x0039:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f1727e
            r0.append(r1)
            int r1 = r4.f1728f
            if (r1 == 0) goto L_0x0097
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f1728f
            goto L_0x0094
        L_0x004f:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.mo2236b()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            int r3 = r4.mo2234a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x0097
        L_0x0077:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f1724b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f1724b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x0094:
            r0.append(r1)
        L_0x0097:
            android.content.res.ColorStateList r1 = r4.f1729g
            if (r1 == 0) goto L_0x00a5
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f1729g
            r0.append(r1)
        L_0x00a5:
            android.graphics.PorterDuff$Mode r1 = r4.f1730h
            android.graphics.PorterDuff$Mode r2 = f1722j
            if (r1 == r2) goto L_0x00b5
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f1730h
            r0.append(r1)
        L_0x00b5:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
