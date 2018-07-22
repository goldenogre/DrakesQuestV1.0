package com.goldenogre.drakesquest.com.goldenogre.music;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.sound.midi.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Music {


    String battleMp3 = "battle.mp3";
    String battleVicory = "battle-victory.mid";
    String prelude = "prelude.mid";

    Media sound;
    MediaPlayer mediaPlayer;


        public void getPrelude(){
            try {
                // From file
                Sequence sequence = MidiSystem.getSequence(new File(prelude));



                // Create a sequencer for the sequence
                Sequencer sequencer = MidiSystem.getSequencer();
                sequencer.open();
                sequencer.setSequence(sequence);
                sequencer.setLoopCount(5);
                // Start playing
                sequencer.start();
            } catch (MalformedURLException e) {
            } catch (IOException e) {
            } catch (MidiUnavailableException e) {
            } catch (InvalidMidiDataException e) {
            }

        }
        public void getBattleMusic(){

            sound = new Media(new File(battleMp3).toURI().toString());
            mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();
        }
}
