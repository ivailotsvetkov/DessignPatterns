package Proxy;

public class RealSong implements Song {

   private String fileName;

   public RealSong(String fileName){
      this.fileName = fileName;
      loadFromDisk(fileName);
   }

   @Override
   public void play() {
      System.out.println("Playing " + fileName);
   }

   private void loadFromDisk(String fileName){
      System.out.println("Loading " + fileName);
   }
}