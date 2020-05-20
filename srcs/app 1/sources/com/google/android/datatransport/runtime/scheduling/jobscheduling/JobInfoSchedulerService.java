package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p147g.p156d.p157a.p158a.p159i.C3767l;
import p147g.p156d.p157a.p158a.p159i.C3767l.C3768a;
import p147g.p156d.p157a.p158a.p159i.C3773q;
import p147g.p156d.p157a.p158a.p159i.p166y.C3839a;

public class JobInfoSchedulerService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C3773q.m15403a(getApplicationContext());
        C3768a d = C3767l.m15386d();
        d.mo11934a(string);
        d.mo11933a(C3839a.m15581a(i));
        if (string2 != null) {
            d.mo11935a(Base64.decode(string2, 0));
        }
        C3773q.m15404b().mo11959a().mo6460a(d.mo11936a(), i2, C1923f.m8140a(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
