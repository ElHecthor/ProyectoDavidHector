package com.google.android.gms.measurement.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: com.google.android.gms.measurement.internal.x9 */
final class C2511x9 extends SSLSocket {

    /* renamed from: f */
    private final SSLSocket f7083f;

    C2511x9(C2522y9 y9Var, SSLSocket sSLSocket) {
        this.f7083f = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f7083f.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void bind(SocketAddress socketAddress) {
        this.f7083f.bind(socketAddress);
    }

    public final synchronized void close() {
        this.f7083f.close();
    }

    public final void connect(SocketAddress socketAddress) {
        this.f7083f.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int i) {
        this.f7083f.connect(socketAddress, i);
    }

    public final boolean equals(Object obj) {
        return this.f7083f.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.f7083f.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.f7083f.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f7083f.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.f7083f.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.f7083f.getInetAddress();
    }

    public final InputStream getInputStream() {
        return this.f7083f.getInputStream();
    }

    public final boolean getKeepAlive() {
        return this.f7083f.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f7083f.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f7083f.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f7083f.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.f7083f.getNeedClientAuth();
    }

    public final boolean getOOBInline() {
        return this.f7083f.getOOBInline();
    }

    public final OutputStream getOutputStream() {
        return this.f7083f.getOutputStream();
    }

    public final int getPort() {
        return this.f7083f.getPort();
    }

    public final synchronized int getReceiveBufferSize() {
        return this.f7083f.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f7083f.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() {
        return this.f7083f.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() {
        return this.f7083f.getSendBufferSize();
    }

    public final SSLSession getSession() {
        return this.f7083f.getSession();
    }

    public final int getSoLinger() {
        return this.f7083f.getSoLinger();
    }

    public final synchronized int getSoTimeout() {
        return this.f7083f.getSoTimeout();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f7083f.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.f7083f.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() {
        return this.f7083f.getTcpNoDelay();
    }

    public final int getTrafficClass() {
        return this.f7083f.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.f7083f.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.f7083f.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.f7083f.isBound();
    }

    public final boolean isClosed() {
        return this.f7083f.isClosed();
    }

    public final boolean isConnected() {
        return this.f7083f.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f7083f.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f7083f.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f7083f.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void sendUrgentData(int i) {
        this.f7083f.sendUrgentData(i);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f7083f.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f7083f.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null) {
            String str = "SSLv3";
            if (Arrays.asList(strArr).contains(str)) {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.f7083f.getEnabledProtocols()));
                if (arrayList.size() > 1) {
                    arrayList.remove(str);
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
        }
        this.f7083f.setEnabledProtocols(strArr);
    }

    public final void setKeepAlive(boolean z) {
        this.f7083f.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.f7083f.setNeedClientAuth(z);
    }

    public final void setOOBInline(boolean z) {
        this.f7083f.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f7083f.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) {
        this.f7083f.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) {
        this.f7083f.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) {
        this.f7083f.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) {
        this.f7083f.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) {
        this.f7083f.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) {
        this.f7083f.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) {
        this.f7083f.setTrafficClass(i);
    }

    public final void setUseClientMode(boolean z) {
        this.f7083f.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f7083f.setWantClientAuth(z);
    }

    public final void shutdownInput() {
        this.f7083f.shutdownInput();
    }

    public final void shutdownOutput() {
        this.f7083f.shutdownOutput();
    }

    public final void startHandshake() {
        this.f7083f.startHandshake();
    }

    public final String toString() {
        return this.f7083f.toString();
    }
}
