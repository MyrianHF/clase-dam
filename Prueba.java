

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Prueba.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Prueba
{
    private ClaseDam claseDam1;
    private Alumno alumno1;
    private Alumno alumno2;
    private Alumno alumno3;
    private Alumno alumno4;
    private Alumno alumno5;

    
    
    
    
    
    

    /**
     * Default constructor for test class Prueba
     */
    public Prueba()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        claseDam1 = new ClaseDam(20);
        alumno1 = new Alumno("Alba", "A123", 20);
        alumno2 = new Alumno("Carlos", "C123", 21);
        alumno3 = new Alumno("María", "M123", 22);
        alumno4 = new Alumno("Pepe", "P123", 23);
        alumno5 = new Alumno("Sara", "S123", 24);
        claseDam1.matricularAlumno(alumno3);
        claseDam1.matricularAlumno(alumno2);
        claseDam1.matricularAlumno(alumno1);
        claseDam1.matricularAlumno(alumno5);
        claseDam1.matricularAlumno(alumno4);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
