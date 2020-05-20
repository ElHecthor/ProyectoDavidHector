package com.facebook.p034f0.p036r;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.f0.r.f */
class C1591f implements SensorEventListener {

    /* renamed from: a */
    private C1592a f4929a;

    /* renamed from: com.facebook.f0.r.f$a */
    public interface C1592a {
        /* renamed from: a */
        void mo5798a();
    }

    C1591f() {
    }

    /* renamed from: a */
    public void mo5819a(C1592a aVar) {
        this.f4929a = aVar;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f4929a != null) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            double d = (double) (f / 9.80665f);
            double d2 = (double) (fArr[1] / 9.80665f);
            double d3 = (double) (fArr[2] / 9.80665f);
            if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.299999952316284d) {
                this.f4929a.mo5798a();
            }
        }
    }
}
