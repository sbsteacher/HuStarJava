package com.koreait.first.abst;

public abstract class Tv {
    private int channel;
    private final int MAX_CHANNEL;
    private int volume;
    private final int MAX_VOLUMN;

    public Tv(int max_channel, int max_volumn) {
        this.channel = 1;
        this.MAX_CHANNEL = max_channel;
        this.MAX_VOLUMN = max_volumn;
    }
    public abstract void turnOn();
    public abstract void turnOff();
    public final void channelUp() {
        if(channel == MAX_CHANNEL) {
            channel = 1;
            return;
        }
        channel++;

    }
    public final void channelDown() {
        if(channel == 1) {
            channel = MAX_CHANNEL;
            return;
        }
        channel--;
    }
    public final void volumeUp() {
        if(volume < MAX_VOLUMN) {
            volume++;
        }
    }
    public final void volumeDown() {
        if(volume > 0) {
            volume--;
        }
    }

    @Override
    public String toString() {
        String result = String.format("현재 채널 : %d, 볼륨 : %d", channel, volume);
        return result;
    }
}
