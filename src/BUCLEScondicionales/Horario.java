package BUCLEScondicionales;

public class Horario {
        public static void main(String[] args) {
            // Variables iniciales
            int horaEspana = 20;  // Hora en España
            int minutoEspana = 45; // Minutos en España
            String diaEspana = "Lunes"; // Día en España
            int diferenciaHoras = 8; // Diferencia fija de 8 horas
            int diferenciaMinutos = 0; // Diferencia fija de 0 minutos (puede modificarse)

            // --- Conversión de España a Japón ---
            int horaTotalJapon = horaEspana * 60 + minutoEspana + diferenciaHoras * 60 + diferenciaMinutos;
            int horaJapon = (horaTotalJapon / 60) % 24;
            int minutoJapon = horaTotalJapon % 60;
            String diaJapon = diaEspana;

            // Ajustar el día para Japón si se cruza la medianoche
            if (horaTotalJapon >= 1440) { // 1440 minutos = 24 horas
                switch (diaEspana) {
                    case "Lunes": diaJapon = "Martes"; break;
                    case "Martes": diaJapon = "Miércoles"; break;
                    case "Miércoles": diaJapon = "Jueves"; break;
                    case "Jueves": diaJapon = "Viernes"; break;
                    case "Viernes": diaJapon = "Sábado"; break;
                    case "Sábado": diaJapon = "Domingo"; break;
                    case "Domingo": diaJapon = "Lunes"; break;
                }
            }

            // Mostrar la conversión de España a Japón
            System.out.println("Hora en España: " + horaEspana + ":" + minutoEspana + ", Día: " + diaEspana);
            System.out.println("Hora en Japón: " + horaJapon + ":" + minutoJapon + ", Día: " + diaJapon);

            // --- Conversión de Japón a España ---
            int horaTotalEspana = horaJapon * 60 + minutoJapon - (diferenciaHoras * 60 + diferenciaMinutos);
            if (horaTotalEspana < 0) horaTotalEspana += 1440; // Ajustar si es negativo
            int horaEspanaConvertida = (horaTotalEspana / 60) % 24;
            int minutoEspanaConvertido = horaTotalEspana % 60;
            String diaEspanaConvertida = diaJapon;

            // Ajustar el día para España si se cruza la medianoche
            if (horaJapon - diferenciaHoras < 0) {
                switch (diaJapon) {
                    case "Lunes": diaEspanaConvertida = "Domingo"; break;
                    case "Martes": diaEspanaConvertida = "Lunes"; break;
                    case "Miércoles": diaEspanaConvertida = "Martes"; break;
                    case "Jueves": diaEspanaConvertida = "Miércoles"; break;
                    case "Viernes": diaEspanaConvertida = "Jueves"; break;
                    case "Sábado": diaEspanaConvertida = "Viernes"; break;
                    case "Domingo": diaEspanaConvertida = "Sábado"; break;
                }
            }

            // Mostrar la conversión de Japón a España
            System.out.println("\nHora en Japón: " + horaJapon + ":" + minutoJapon + ", Día: " + diaJapon);
            System.out.println("Hora en España: " + horaEspanaConvertida + ":" + minutoEspanaConvertido + ", Día: " + diaEspanaConvertida);
        }

}
