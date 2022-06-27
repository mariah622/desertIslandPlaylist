import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {

    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("W.A.Y.S");
    desertIslandPlaylist.add("Tempted To Touch");
    desertIslandPlaylist.add("No More Dream");
    desertIslandPlaylist.add("Fear");
    desertIslandPlaylist.add("Magic Hour");
    desertIslandPlaylist.add("Stay Ready");

    desertIslandPlaylist.remove("Fear");

    // indices of the songs I want to switch
    int indexA = desertIslandPlaylist.indexOf("Tempted To Touch");

    int indexB = desertIslandPlaylist.indexOf("Stay Ready");

    // temp variable to store the value of song a

    String tempA = "Tempted To Touch";

    desertIslandPlaylist.set(indexA, "Stay Ready");

    desertIslandPlaylist.set(indexB, tempA); 

    System.out.println(desertIslandPlaylist);

     

    
    
  }
  
}

