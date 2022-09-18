//para saer o local do sistema tem que esxportar o locael
import java.util.Locale;

public class LocalDoSistema {
    public static void main(String[] args){
        Locale lingua = Locale.getDefault();
        System.out.println("A lingua do sistema é ");
        System.out.println(lingua.getDisplayLanguage());
    }
}
