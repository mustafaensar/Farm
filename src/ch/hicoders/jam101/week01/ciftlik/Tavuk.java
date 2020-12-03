package ch.hicoders.jam101.week01.ciftlik;

public class Tavuk {
    public String tavukName;
    public static int numberOfTavuk;

    public Tavuk (String tavuk) {
        tavukName = tavuk;
        if (tavuk == null){
            tavukName = "tavuk + tavuk sayisi";
        }
        numberOfTavuk++;
    }
}