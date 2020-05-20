package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C2078b;
import com.google.android.gms.common.C2084e;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C2025f;

@KeepName
public class GoogleApiActivity extends Activity implements OnCancelListener {

    /* renamed from: f */
    private int f5793f = 0;

    /* renamed from: a */
    public static PendingIntent m8312a(Context context, PendingIntent pendingIntent, int i) {
        return PendingIntent.getActivity(context, 0, m8313a(context, pendingIntent, i, true), 134217728);
    }

    /* renamed from: a */
    public static Intent m8313a(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f5793f = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C2025f a = C2025f.m8431a((Context) this);
                if (i2 == -1) {
                    a.mo6687b();
                } else if (i2 == 0) {
                    a.mo6686a(new C2078b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f5793f = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f5793f = 0;
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5793f = bundle.getInt("resolution");
        }
        if (this.f5793f != 1) {
            Bundle extras = getIntent().getExtras();
            String str2 = "GoogleApiActivity";
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get("error_code");
                if (pendingIntent == null && num == null) {
                    str = "Activity started without resolution";
                } else if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        this.f5793f = 1;
                        return;
                    } catch (SendIntentException e) {
                        Log.e(str2, "Failed to launch pendingIntent", e);
                    }
                } else {
                    C2084e.m8612a().mo6809b(this, num.intValue(), 2, this);
                    this.f5793f = 1;
                }
            }
            Log.e(str2, str);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f5793f);
        super.onSaveInstanceState(bundle);
    }
}
