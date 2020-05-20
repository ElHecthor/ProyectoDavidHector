package com.appyvet.materialrangebar;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Shader.TileMode;
import java.util.ArrayList;

/* renamed from: com.appyvet.materialrangebar.b */
public class C0825b {

    /* renamed from: a */
    private final int[] f3240a;

    /* renamed from: b */
    private final float[] f3241b;

    /* renamed from: c */
    private final Paint f3242c = new Paint();

    /* renamed from: d */
    private final float f3243d;

    public C0825b(float f, float f2, ArrayList<Integer> arrayList) {
        if (arrayList.size() == 1) {
            arrayList.add(arrayList.get(0));
        }
        this.f3240a = new int[arrayList.size()];
        this.f3241b = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f3240a[i] = ((Integer) arrayList.get(i)).intValue();
            this.f3241b[i] = ((float) i) / ((float) (arrayList.size() - 1));
        }
        this.f3242c.setStrokeWidth(f2);
        this.f3242c.setStrokeCap(Cap.ROUND);
        this.f3242c.setAntiAlias(true);
        this.f3243d = f;
    }

    /* renamed from: a */
    private LinearGradient m4424a(float f, float f2, float f3) {
        LinearGradient linearGradient = new LinearGradient(f, f3, f2, f3, this.f3240a, this.f3241b, TileMode.REPEAT);
        return linearGradient;
    }

    /* renamed from: a */
    public void mo4495a(Canvas canvas, float f, C0827d dVar) {
        this.f3242c.setShader(m4424a(0.0f, (float) canvas.getWidth(), this.f3243d));
        canvas.drawLine(f, this.f3243d, dVar.getX(), this.f3243d, this.f3242c);
    }

    /* renamed from: a */
    public void mo4496a(Canvas canvas, C0827d dVar, C0827d dVar2) {
        this.f3242c.setShader(m4424a(0.0f, (float) canvas.getWidth(), this.f3243d));
        canvas.drawLine(dVar.getX(), this.f3243d, dVar2.getX(), this.f3243d, this.f3242c);
    }
}
