
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Osztalyzatok {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int osztalyzat;                         // változók létrehozása
        String ertek = "", velemeny = "";       // változók létrehozása
        System.out.print("Kérek egy osztályzatot: ");
        osztalyzat = Integer.parseInt(br.readLine());  //egész számmá alakítjuk
        
        switch (osztalyzat){                // a switch után a zárójelben átadjuk a változót amiben a jegyet tároljuk
            case 1: ertek = "elégtelen";    // ha az 1 akkor az ertek változónak az elégtelen értéket adjuk
            break;                          // ha teljesült hogy 1, akkor kilépünk a swichből. nem muszály de akkor lefut 
            case 2: ertek = "eléséges";     // a többi feltétel is feleslegesen
            break;                          //
            case 3: ertek = "közepes";      // ezek ugyanazt csinálják csak a többi számmal
            break;                          //
            case 4: ertek = "jó";           //
            break;                          //
            case 5: ertek = "jeles";        //              
        }
        switch (osztalyzat){                // ugyanaz mint az előző, csak más változókkal
            case 1: case 2: velemeny = "Tanulj többet!"; break;
            case 3: velemeny = "Minden ok!"; break;
            default: velemeny = "Túl sok!"; // ha az előek közül egyik sem akkor ezt az értéket veszi fel az velemeny változó
        }
        System.out.println(ertek);
        System.out.println(velemeny);
    }
}
