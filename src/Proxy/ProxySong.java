package Proxy;

import java.util.ArrayList;

public class ProxySong implements Song{
private ArrayList<Song> songs;
   private RealSong realSong;
   private String fileName;

   public ProxySong(String fileName){
      this.fileName = fileName;
   }
   public void addSong(Song song){
      songs.add(song);
   }
public Song getSong(int index){
   return songs.get(index);
}
   @Override
   public void play() {
      if(realSong == null){
         realSong = new RealSong(fileName);
      }
      realSong.play();
   }
}