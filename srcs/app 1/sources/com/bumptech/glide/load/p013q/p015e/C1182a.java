package com.bumptech.glide.load.p013q.p015e;

import com.bumptech.glide.load.p005n.C0883e;
import com.bumptech.glide.load.p005n.C0883e.C0884a;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.q.e.a */
public class C1182a implements C0883e<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f3980a;

    /* renamed from: com.bumptech.glide.load.q.e.a$a */
    public static class C1183a implements C0884a<ByteBuffer> {
        /* renamed from: a */
        public C0883e<ByteBuffer> mo4649a(ByteBuffer byteBuffer) {
            return new C1182a(byteBuffer);
        }

        /* renamed from: a */
        public Class<ByteBuffer> mo4650a() {
            return ByteBuffer.class;
        }
    }

    public C1182a(ByteBuffer byteBuffer) {
        this.f3980a = byteBuffer;
    }

    /* renamed from: a */
    public ByteBuffer m5567a() {
        this.f3980a.position(0);
        return this.f3980a;
    }

    /* renamed from: b */
    public void mo4648b() {
    }
}
