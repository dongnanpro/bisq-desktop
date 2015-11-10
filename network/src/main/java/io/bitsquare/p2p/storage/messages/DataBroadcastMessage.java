package io.bitsquare.p2p.storage.messages;

import io.bitsquare.app.Version;
import io.bitsquare.p2p.Message;

public abstract class DataBroadcastMessage implements Message {
    private final int networkId = Version.NETWORK_ID;

    @Override
    public int networkId() {
        return networkId;
    }
}