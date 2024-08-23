import java.util.Scanner;

public class FirstPhase {
    /**
     * name: registerOrganizer
     * description: Print a greeting for the organizer
     * pre-condition: name must be a string
     * post-condition: Print a greeting for the organizer
     * @param name String for print the greeting
     *  
     */
    public static void registerOrganizer(String name) {
        System.out.println("¡Bienvenido, "+name+"!");
    }
    /**
     * Name: routeSelection
     * Description: Print the route selected by the user
     * Pre-condition: routeNum must be an integer
     * Post-condition: Print the route selected by the user
     * @param routeNum int for the route selected by the user
     * 
     */
    public static void routeSelection(int routeNum) {
        if (routeNum > 3 || routeNum < 1) {
            System.out.println("¡La ruta no existe!");
            return;
        }
        String horaInicio = routeNum == 3 ? "6:40" : "7:00";
        String horaTermina = routeNum == 3 ? "4" : "3";
        String nombre = routeNum == 3 ? "de los Farallones" : routeNum == 1 ? "Ladera" : "del Oriente";
        String direccion = routeNum == 3 ? "Calle 16 - Universidad del Valle" : "Bulevar del Rio";
        String mensaje = "¡Excelente! la ruta "+nombre+" tiene  como punto de encuentro "+direccion+" iniciando a las "+horaInicio+" am, y termina a las "+horaTermina+":00 pm.";
        System.out.println(mensaje);
    }
    /**
     * Name: registerParticipants
     * Description: Sum of participants and guides
     * Pre-condition: numParticipantes and numGuias must be integers
     * Post-condition: Return the sum of participants and guides
     * @param numParticipants int for the number of participants
     * @param numGuides  int for the number of guides
     * @return totalPeople a sum of participants and guides
     */
    public static int registerParticipants(int numParticipants, int numGuides) {
        return numParticipants + numGuides;
    }
    /**
     * Name: registerWeather
     * Description: Print a message according to the weather
     * Pre-condition: temperatura and porcHumedad must be float
     * Post-condition: Print a message according to the weather
     * @param temperature float for the temperature
     * @param percentHumidity  float for the humidity
     * 
     */
    public static void registerWeather(float temperature, float percentHumidity) {
        
        if ((temperature >= 20 && temperature <= 25) && (percentHumidity >= 40 && percentHumidity <= 60)) {
            System.out.println("¡Hace un buen día para caminar por Cali!");
        }
        else {
            System.out.println("¡No Hace un buen día para caminar por Cali!");
        }
    }
    /**
     * Name: calculateBuses
     * Description: Calculate the number of buses needed
     * Pre-condition: totalPeople must be an integer
     * Post-condition: Print the number of buses needed
     * @param totalPeople int for the total of people
     * 
     */
    public static void calculateBuses(int totalPeople) {
        int cantBuses = totalPeople/25;
        if (totalPeople%25 > 0) {
            cantBuses++;
        }
        String msgBus = cantBuses + (cantBuses > 1 ? " buses" : " bus");
        System.out.println("Al ser un total de "+totalPeople+" personas que harán parte de la actividad, se necesitarán un total de: \n"+msgBus+" para llevarla a cabo de manera exitosa. ¡Nos vemos en la COP16!");
    }
    public static void main(String[] args) {
        /*
         * Scanner for the user input
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido voluntario a la aplicación de Interacción de Rutas Ecológicas COP 16 Cali - Colombia.");
        /*
         * Register ther organizer (name, cedula)
         */
        System.out.println("¿Cuál es tu nombre?");
        String name = sc.nextLine();
        System.out.println("Por favor digite su cédula");
        String cedula = sc.nextLine();
        registerOrganizer(name);
        /*
         * Register the route (Ladera, Oriente, Farallones)
         */
        System.out.println("Rutas: \n1-Ladera\n2-Del Oriente\n3-Farallones");
        System.out.println("¿Qué ruta registrarás el día de hoy?");
        int routeNum = sc.nextInt();
        routeSelection(routeNum);
        System.out.println("¿Cuántos participantes acudirán a la caminata el día de hoy?");
        int numParticipants = sc.nextInt();
        System.out.println("¿Cuántos guías acudirán a la caminata el día de hoy?");
        int numGuides = sc.nextInt();
        int totalPeople = registerParticipants(numParticipants, numGuides);
        /*
         * Register the weather (temperature, humidity)
         */
        System.out.println("Ingresar la temperatura en grados centígrados °C");
        float temperature = sc.nextFloat();
        System.out.println("Ingresar el porcentaje de humedad relativa");
        float percentHumidity = sc.nextFloat();
        registerWeather(temperature, percentHumidity);
        /*
         * Calculate the number of buses needed
         */
        calculateBuses(totalPeople);
    }
}
