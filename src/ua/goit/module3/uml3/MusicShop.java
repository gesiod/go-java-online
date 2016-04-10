package ua.goit.module3.uml3;

import java.util.ArrayList;

public class MusicShop {

    ArrayList<MusicInstrument> musicInstruments;

    public void setMusicInstrument(ArrayList<MusicInstrument> musicInstruments) {
        this.musicInstruments = musicInstruments;
    }

    public ArrayList<MusicInstrument> getMusicInstruments() {
        return musicInstruments;
    }
}