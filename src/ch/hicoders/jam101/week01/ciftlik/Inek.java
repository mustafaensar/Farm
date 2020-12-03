package ch.hicoders.jam101.week01.ciftlik;

public class Inek {
    public String inekName;
    public static int numberOfInek;

    public Inek (String inek) {
        inekName = inek;
        if (inek == null){
            inekName = "inek + inek sayisi";
        }
        numberOfInek++;
    }
}