import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class Data {
    public static void main(String[] args) {
        //1
        LocalDate hoje = LocalDate.of(2025,6,9);
        LocalDate prazo = hoje.plusDays(10);
        System.out.println(prazo);

        //2
        LocalDate data = LocalDate.of(2025,6,10);
        int diasUteis = 0;

        while (diasUteis < 7) {
            data = data.plusDays(1);
            boolean fimDeSemana = data.getDayOfWeek() == DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY;
            boolean feriado = data.equals(LocalDate.of(2025,6,15));

            if (!fimDeSemana && !feriado) {
                diasUteis++;
            }
            //System.out.println(data);
        }
        System.out.println(data);

        //3
        LocalTime envio = LocalTime.of(23,0);
        LocalTime limite = LocalTime.of(22, 59);

        if (!envio.isBefore((limite))) {
            System.out.println("Entrega fora do horario.");
        } else {
            System.out.println("Tarefa enviada com sucesso.");
        }
    }
}
