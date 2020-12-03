package ch.hicoders.jam101.week01.ciftci;

import ch.hicoders.jam101.week01.ciftlik.*;
import static java.lang.System.*;

public class Ciftci {
    public static void main(String[] args){
        Inek firstInek = new Inek("siyah");
        Inek secondInek = new Inek("beyaz");
        Inek thirdInek = new Inek(null);
        Tavuk firstTavuk = new Tavuk("kirmizi");
        Tavuk secondTavuk = new Tavuk("yesil");
        Tavuk thirdTavuk = new Tavuk("mavi");
        Tavuk fourthTavuk = new Tavuk(null);

        out.println("Inek adi " + firstInek.inekName);
        out.println("Inek adi " + secondInek.inekName);
        out.println("Inek adi " + thirdInek.inekName);
        out.println("Tavuk adi " + firstTavuk.tavukName);
        out.println("Tavuk adi " + secondTavuk.tavukName);
        out.println("Tavuk adi " + thirdTavuk.tavukName);
        out.println("Tavuk adi " + fourthTavuk.tavukName);
        out.println("Inek adedi " + Inek.numberOfInek);
        out.println("Tavuk adedi " + Tavuk.numberOfTavuk);
    }
}