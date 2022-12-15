package daw.programacion.notas;

public class Notas {
    public String notaEnTexto(double nota) {
        String notaTexto;
        if (nota < 0 || nota > 10) {
            notaTexto = "La nota no puede ser superior a 10 ni inferior a 0";
        } else if (nota < 5) {
            notaTexto = "Suspenso";
        } else if (nota < 7) {
            notaTexto = "Aprobado";
        } else if (nota < 9) {
            notaTexto = "Notable";
        } else if (nota < 10) {
            notaTexto = "Sobresaliente";
        } else {
            notaTexto = "Matricula de Honor";
        }
        return notaTexto;
    }
}
