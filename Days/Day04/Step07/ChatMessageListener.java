interface ChatMessageListener {
    void onMessageReceived(String message, String username);

    void onBroadCastMessageReceived(String message, String username);
}