package im.zego.gomovie.server.sdk.callbacks;

public interface IZegoRoomConnectionStateListener {
    void onConnected(int errorCode, String roomID);
    void onDisconnect(int errorCode,String roomID);
    void connecting(int errorCode,String roomID);
}
