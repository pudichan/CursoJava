/**
 * Clase ProgramaAlumno
 * 
 * @author Alba 
 * @version 2015
 */
public class ProgramaAlumno {

    /**
     * Metodo principal del programa.
     */
    public static void main(String[] args){
        Alumno paula = new Alumno("Paula", 18, 8.4, 3.2, true);
        System.out.println(paula.getNombre());
        System.out.println(paula.getEdad());
        System.out.println(paula.calcularNotaFinal());
    }
    
}

