package Proxy;

import java.util.ArrayList;

public class Test
{

   public static void main(String[] args)
   {
      ArrayList<Song> songs=new ArrayList<>();
      Song song1=new ProxySong("Song 1");
      Song song2=new ProxySong("Song 2");
      songs.add(song1);
      songs.add(song2);
     songs.get(0).play();
     songs.get(1).play();
     songs.get(0).play();
     songs.get(1).play();
     songs.get(0).play();
   }

}
