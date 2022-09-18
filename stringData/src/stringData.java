import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;


public class stringData {


    public static void main(String[] args){
        String name = "Rafael";
        String name2 ="Raffitas";
        // Aqui uso do toUpperCase para deixar o texto em maisculo
        //System.out.println(name.toUpperCase());
        // e agora para letras minisculas
        //System.out.println(name.toLowerCase());
        //para determinar o tamano do texto
        //System.out.println(name.length());
        // agora comparando os dois textos
        //System.out.println(name.equals(name2));
        //System.out.println(name.equalsIgnoreCase(name2));


        // agora outro código
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        Locale brasil = new Locale("pt","br");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil));

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >=0 && agora.getHour() <=12){
            saudacao = "bom dia";
        }else if (agora.getHour() >=12 && agora.getHour() <18){
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() <= 24) {
            saudacao ="boa noite";

        }else {
            saudacao = "olá";
        }

        System.out.printf("olá,%s hoje é %s,%s %n",name,diaSemana,saudacao.toUpperCase());
    }
}
