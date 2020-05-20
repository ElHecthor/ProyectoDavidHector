package com.bumptech.glide.load.p013q.p014d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import com.bumptech.glide.p029t.C1309j;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.q.d.b0 */
public final class C1125b0 {

    /* renamed from: a */
    private static final Paint f3894a = new Paint(6);

    /* renamed from: b */
    private static final Paint f3895b = new Paint(7);

    /* renamed from: c */
    private static final Paint f3896c;

    /* renamed from: d */
    private static final Set<String> f3897d;

    /* renamed from: e */
    private static final Lock f3898e;

    /* renamed from: com.bumptech.glide.load.q.d.b0$a */
    class C1126a implements C1127b {

        /* renamed from: a */
        final /* synthetic */ int f3899a;

        C1126a(int i) {
            this.f3899a = i;
        }

        /* renamed from: a */
        public void mo5008a(Canvas canvas, Paint paint, RectF rectF) {
            int i = this.f3899a;
            canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.b0$b */
    private interface C1127b {
        /* renamed from: a */
        void mo5008a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* renamed from: com.bumptech.glide.load.q.d.b0$c */
    private static final class C1128c implements Lock {
        C1128c() {
        }

        public void lock() {
        }

        public void lockInterruptibly() {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j, TimeUnit timeUnit) {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f3897d = hashSet;
        f3898e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new C1128c();
        Paint paint = new Paint(7);
        f3896c = paint;
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
    }

    /* renamed from: a */
    public static int m5373a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    private static Config m5374a(Bitmap bitmap) {
        return (VERSION.SDK_INT < 26 || !Config.RGBA_F16.equals(bitmap.getConfig())) ? Config.ARGB_8888 : Config.RGBA_F16;
    }

    /* renamed from: a */
    private static Bitmap m5375a(C0921e eVar, Bitmap bitmap) {
        Config a = m5374a(bitmap);
        if (a.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap a2 = eVar.mo4710a(bitmap.getWidth(), bitmap.getHeight(), a);
        new Canvas(a2).drawBitmap(bitmap, 0.0f, 0.0f, null);
        return a2;
    }

    /* renamed from: a */
    public static Bitmap m5376a(C0921e eVar, Bitmap bitmap, int i) {
        if (!m5387b(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m5380a(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap a = eVar.mo4710a(Math.round(rectF.width()), Math.round(rectF.height()), m5384b(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        a.setHasAlpha(bitmap.hasAlpha());
        m5382a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: a */
    public static Bitmap m5377a(C0921e eVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap a = eVar.mo4710a(i, i2, m5384b(bitmap));
        m5381a(bitmap, a);
        m5382a(bitmap, a, matrix);
        return a;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static Bitmap m5378a(C0921e eVar, Bitmap bitmap, C1127b bVar) {
        Config a = m5374a(bitmap);
        Bitmap a2 = m5375a(eVar, bitmap);
        Bitmap a3 = eVar.mo4710a(a2.getWidth(), a2.getHeight(), a);
        a3.setHasAlpha(true);
        TileMode tileMode = TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(a2, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) a3.getWidth(), (float) a3.getHeight());
        f3898e.lock();
        try {
            Canvas canvas = new Canvas(a3);
            canvas.drawColor(0, Mode.CLEAR);
            bVar.mo5008a(canvas, paint, rectF);
            m5383a(canvas);
            f3898e.unlock();
            if (!a2.equals(bitmap)) {
                eVar.mo4713a(a2);
            }
            return a3;
        } catch (Throwable th) {
            f3898e.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public static Lock m5379a() {
        return f3898e;
    }

    /* renamed from: a */
    static void m5380a(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
        matrix.postScale(-1.0f, 1.0f);
    }

    /* renamed from: a */
    public static void m5381a(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    /* renamed from: a */
    private static void m5382a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f3898e.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f3894a);
            m5383a(canvas);
        } finally {
            f3898e.unlock();
        }
    }

    /* renamed from: a */
    private static void m5383a(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: b */
    private static Config m5384b(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888;
    }

    /* renamed from: b */
    public static Bitmap m5385b(C0921e eVar, Bitmap bitmap, int i) {
        C1309j.m6153a(i > 0, "roundingRadius must be greater than 0.");
        return m5378a(eVar, bitmap, (C1127b) new C1126a(i));
    }

    /* renamed from: b */
    public static Bitmap m5386b(C0921e eVar, Bitmap bitmap, int i, int i2) {
        String str = "TransformationUtils";
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "requested target size too big for input, fit centering instead");
            }
            return m5389d(eVar, bitmap, i, i2);
        }
        if (Log.isLoggable(str, 2)) {
            Log.v(str, "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    /* renamed from: b */
    public static boolean m5387b(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public static Bitmap m5388c(C0921e eVar, Bitmap bitmap, int i, int i2) {
        int min = Math.min(i, i2);
        float f = (float) min;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap a = m5375a(eVar, bitmap);
        Bitmap a2 = eVar.mo4710a(min, min, m5374a(bitmap));
        a2.setHasAlpha(true);
        f3898e.lock();
        try {
            Canvas canvas = new Canvas(a2);
            canvas.drawCircle(f2, f2, f2, f3895b);
            canvas.drawBitmap(a, null, rectF, f3896c);
            m5383a(canvas);
            f3898e.unlock();
            if (!a.equals(bitmap)) {
                eVar.mo4713a(a);
            }
            return a2;
        } catch (Throwable th) {
            f3898e.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    public static Bitmap m5389d(C0921e eVar, Bitmap bitmap, int i, int i2) {
        String str = "TransformationUtils";
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap a = eVar.mo4710a((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m5384b(bitmap));
        m5381a(bitmap, a);
        if (Log.isLoggable(str, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("request: ");
            sb.append(i);
            String str2 = "x";
            sb.append(str2);
            sb.append(i2);
            Log.v(str, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append(str2);
            sb2.append(bitmap.getHeight());
            Log.v(str, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toReuse: ");
            sb3.append(a.getWidth());
            sb3.append(str2);
            sb3.append(a.getHeight());
            Log.v(str, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("minPct:   ");
            sb4.append(min);
            Log.v(str, sb4.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m5382a(bitmap, a, matrix);
        return a;
    }
}
