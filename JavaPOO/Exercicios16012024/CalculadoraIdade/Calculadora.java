package Exercicios16012024.CalculadoraIdade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date hoje = new Date();

        System.out.println("Digite a data de nascimento ex: dd/MM/aaaa");
        String strDate = sc.next();

        System.out.println("Agora, digite a hora de nascimento ex: HH:mm:ss");
        String strTime = sc.next();

        try {
          String strDateTime = strDate + " " + strTime;
            
          Date inputDate = dateFormat.parse(strDateTime);

          long durationMillis = hoje.getTime() - inputDate.getTime();
            Duration dur = Duration.ofMillis(durationMillis);

           long anos = dur.toDays() / 365;
            long meses = (dur.toDays() % 365) / 30;
            long dias = dur.toDays() % 30;
            long horas = dur.toHours() % 24;

            System.out.println("Idade: " + anos + " anos, " + meses + " meses, " + dias + " dias e " + horas + " horas.");

        } catch (ParseException e) {
            System.out.println("Formato de data ou hora inválido. Use dd/MM/yyyy HH:mm:ss.");
        }

        sc.close();
    }
}
