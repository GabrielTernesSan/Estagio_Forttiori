package ApiData;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Programa {
    public static void main(String[] args) {

        System.out.println("Instant");
        Instant iNow = Instant.now();
        System.out.println(iNow);
        System.out.println("GMT");
        Instant i = Instant.ofEpochMilli(500000000000L);
        System.out.println("###### Método of ######");
        System.out.println("Instant criado");
        System.out.println(i);

        System.out.println();

        System.out.println("LocalDate");
        LocalDate ldNow = LocalDate.now();
        System.out.println(ldNow);
        ldNow.plusDays(5);
        System.out.println(ldNow);

        System.out.println("###### Método of ######");
        // Com o método "of" podemos criar um LocalDate de uma data específica
        LocalDate ldOf = LocalDate.of(2022, 6, 3);
        System.out.println(ldOf);
        // O LocalDate possui outros métodos, como o getDayOfWeek que como o próprio
        // nome já diz ele pega o dia da semana da data passada
        System.out.println("Dia da Semana: ");
        System.out.println(ldOf.getDayOfWeek());
        // O getMonth devolve um enum com o nome do mês
        System.out.println("Enum do mês: ");
        System.out.println(ldOf.getMonth());

        System.out.println();

        System.out.println("LocalTime");
        LocalTime ltNow = LocalTime.now();
        System.out.println(ltNow);

        System.out.println("###### Método of ######");
        System.out.println("Hora, minutos e segundos: ");
        LocalTime ltOf = LocalTime.of(15, 30, 15);
        System.out.println(ltOf);

        System.out.println("Hora, minutos, segundo e nanossegundos: ");
        LocalTime ltOf2 = LocalTime.of(15, 30, 15, 100000);
        System.out.println(ltOf2);

        System.out.println();

        System.out.println("LocalDateTime");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        System.out.println("###### Método of ######");
        // Combinação dos outros métodos de LocalTime e LocalDate
        System.out.println("Ano, mês, dia, Hora, minutos e segundos: ");
        LocalDateTime ldLt = LocalDateTime.of(2022, Month.JUNE, 15, 15, 45, 25);
        System.out.println(ldLt);
        System.out.println("A partir do que já existe");
        LocalDateTime ldLt2 = LocalDateTime.of(ldNow, ltNow);
        System.out.println(ldLt2);

        System.out.println();

        System.out.println("ZonedDateTime");
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZonedDateTime zdTime = ZonedDateTime.of(ldOf, ltOf, ZoneId.of("Europe/Amsterdam"));
        ZonedDateTime zdTime2 = ZonedDateTime.of(ldLt, ZoneId.of("Europe/Amsterdam"));
        System.out.println(zdTime);
        System.out.println(zdTime2);

        System.out.println();

        System.out.println("Datas e meses importantes");
        MonthDay natal = MonthDay.of(Month.DECEMBER, 25);
        YearMonth copaDoMundo2014 = YearMonth.of(2014, Month.JUNE);
        System.out.println(natal);
        System.out.println(copaDoMundo2014);

        System.out.println();

        System.out.println("Formatando datas");
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(ldNow.format(formatador)); //03/06/2022

        DateTimeFormatter formatado = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT)
                .withLocale(new Locale("en", "us"));
        System.out.println(agora.format(formatado)); //03/06/2022

        System.out.println();

        System.out.println("Period");
        LocalDate homemNaLua = LocalDate.of(1969, Month.JULY, 20);

        Period periodo = Period.between(homemNaLua, ldNow);

        System.out.println(periodo);

        System.out.printf("%s anos, %s mês e %s dias", periodo.getYears() , periodo.getMonths(), periodo.getDays());

        System.out.println();
        System.out.println();

        System.out.println("Duration");

        System.out.println("Duração de 500 segundos: ");
        Duration ofSeconds = Duration.ofSeconds(500);
        System.out.println(ofSeconds);

        System.out.println("Duração de um dia: ");
        Duration ofDay = Duration.ofDays(1);
        System.out.println(ofDay);

        System.out.println("Duração de 500 minutos");
        Duration ofMinutes = Duration.ofMinutes(500);
        System.out.println(ofMinutes);

        System.out.println("Duração entre ltNow e ltOf");
        Duration duration = Duration.between(ltNow, ltOf);
        System.out.println(duration);

        System.out.println();

        System.out.println("Outros métodos de manipulação");
        System.out.println("Somar semanas, dias, horas");
        System.out.println("Semanas (2 semanas): " + ldNow + " -> " + ldNow.plusWeeks(2));
        System.out.println("Dias (4 dias): " + ldNow + " -> " + ldNow.plusDays(4));
        System.out.println("Horas (6 horas): " + ltNow + " -> " + ltNow.plusHours(6));
        System.out.println("Segundos (30 segundos): " + ltNow + " -> " + ltNow.plusSeconds(30));

        System.out.println();

        System.out.println("Subtrair...");
        System.out.println("Semanas (2 semanas): " + ldNow + " -> " + ldNow.minusWeeks(2));
        System.out.println("Dias (4 dias): " + ldNow + " -> " + ldNow.minusDays(4));
        System.out.println("Horas (6 horas): " + ltNow + " -> " + ltNow.minusHours(6));
        System.out.println("Segundos (30 segundos): " + ltNow + " -> " + ltNow.minusSeconds(30));

    }
}
