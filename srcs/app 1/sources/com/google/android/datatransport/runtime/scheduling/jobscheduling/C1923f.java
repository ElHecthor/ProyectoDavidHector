package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.f */
final /* synthetic */ class C1923f implements Runnable {

    /* renamed from: f */
    private final JobInfoSchedulerService f5661f;

    /* renamed from: g */
    private final JobParameters f5662g;

    private C1923f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f5661f = jobInfoSchedulerService;
        this.f5662g = jobParameters;
    }

    /* renamed from: a */
    public static Runnable m8140a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        return new C1923f(jobInfoSchedulerService, jobParameters);
    }

    public void run() {
        this.f5661f.jobFinished(this.f5662g, false);
    }
}
