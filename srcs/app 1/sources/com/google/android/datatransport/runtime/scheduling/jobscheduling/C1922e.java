package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p147g.p156d.p157a.p158a.p159i.C3767l;
import p147g.p156d.p157a.p158a.p159i.p160t.C3777a;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3796c;
import p147g.p156d.p157a.p158a.p159i.p166y.C3839a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.e */
public class C1922e implements C1940s {

    /* renamed from: a */
    private final Context f5658a;

    /* renamed from: b */
    private final C3796c f5659b;

    /* renamed from: c */
    private final C1924g f5660c;

    public C1922e(Context context, C3796c cVar, C1924g gVar) {
        this.f5658a = context;
        this.f5659b = cVar;
        this.f5660c = gVar;
    }

    /* renamed from: a */
    private boolean m8137a(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo6450a(C3767l lVar) {
        Adler32 adler32 = new Adler32();
        String str = "UTF-8";
        adler32.update(this.f5658a.getPackageName().getBytes(Charset.forName(str)));
        adler32.update(lVar.mo11928a().getBytes(Charset.forName(str)));
        adler32.update(ByteBuffer.allocate(4).putInt(C3839a.m15580a(lVar.mo11930c())).array());
        if (lVar.mo11929b() != null) {
            adler32.update(lVar.mo11929b());
        }
        return (int) adler32.getValue();
    }

    /* renamed from: a */
    public void mo6432a(C3767l lVar, int i) {
        ComponentName componentName = new ComponentName(this.f5658a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f5658a.getSystemService("jobscheduler");
        int a = mo6450a(lVar);
        String str = "JobInfoScheduler";
        if (m8137a(jobScheduler, a, i)) {
            C3777a.m15416a(str, "Upload for context %s is already scheduled. Returning...", (Object) lVar);
            return;
        }
        long b = this.f5659b.mo11987b(lVar);
        C1924g gVar = this.f5660c;
        Builder builder = new Builder(a, componentName);
        gVar.mo6453a(builder, lVar.mo11930c(), b, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", lVar.mo11928a());
        persistableBundle.putInt("priority", C3839a.m15580a(lVar.mo11930c()));
        if (lVar.mo11929b() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(lVar.mo11929b(), 0));
        }
        builder.setExtras(persistableBundle);
        C3777a.m15418a(str, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", lVar, Integer.valueOf(a), Long.valueOf(this.f5660c.mo6452a(lVar.mo11930c(), b, i)), Long.valueOf(b), Integer.valueOf(i));
        jobScheduler.schedule(builder.build());
    }
}
