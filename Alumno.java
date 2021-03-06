public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if (nombre.length() < 3) {
            System.out.println("Error: caracteres insuficientes en el nombre.");
        }  
        if (numeroMatricula.length() < 4) {
            System.out.println("Error: caracteres insuficientes en el n?mero de matr?cula.");
        }  
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Devuelve la edad del alumno
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Devuelve el n?mero de matr?cula del alumno
     */
    public String getNumeroMatricula() {
        return numeroMatricula;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String aDevolver = "";
        if (nombre.length() > 3 && numeroMatricula.length() > 4) {
            aDevolver = nombre.substring(0, 3) + numeroMatricula.substring(0, 4);
        }
        else if (nombre.length() < 3 && numeroMatricula.length() > 4) {
            aDevolver = nombre + numeroMatricula.substring(0, 4);
        }
        else if (nombre.length() > 3 && numeroMatricula.length() < 4) {
            aDevolver = nombre.substring(0, 3) + numeroMatricula;
        }
        else {
            aDevolver = nombre + numeroMatricula;
        }
        return aDevolver;
    }
}
