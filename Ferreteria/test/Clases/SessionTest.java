package Clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author demo_
 */
public class SessionTest {
    
    public SessionTest() {
    }
    @BeforeEach
    public void setUp() {
        Session.getInstance().logout(); 
    }
    
    // Se ejecuta DESPUÉS de cada prueba (opcional, para limpieza)
    @AfterEach
    public void tearDown() {
        Session.getInstance().logout();
    }

    /**
     * Prueba 1: Verificar que la clase sea un Singleton real.
     * Si pido la instancia dos veces, debe ser EXACTAMENTE el mismo objeto en memoria.
     */
    @Test
    public void testSingletonInstance() {
        Session s1 = Session.getInstance();
        Session s2 = Session.getInstance();
        
        assertNotNull(s1, "La instancia no debería ser nula");
        assertSame(s1, s2, "Ambas variables deben apuntar al mismo objeto en memoria");
    }

    /**
     * Prueba 2: Verificar que el Login guarde correctamente los datos.
     */
    @Test
    public void testLogin() {
        System.out.println("Prueba de Login");
        String role = "EMPLEADO";
        int id = 5;
        String name = "Juan Pérez";
        
        Session instance = Session.getInstance();
        instance.login(role, id, name);
        
        // Verificaciones (Asserts)
        assertEquals(role, instance.getRole(), "El rol no se guardó correctamente");
        assertEquals(id, instance.getUserId(), "El ID no se guardó correctamente");
        assertEquals(name, instance.getUserName(), "El nombre no se guardó correctamente");
        assertTrue(instance.isLoggedIn(), "La sesión debería marcarse como activa (true)");
    }

    /**
     * Prueba 3: Verificar que el Logout limpie todo.
     */
    @Test
    public void testLogout() {
        System.out.println("Prueba de Logout");
        
        // 1. Primero iniciamos sesión
        Session instance = Session.getInstance();
        instance.login("CLIENTE", 10, "Maria");
        
        // 2. Luego cerramos sesión
        instance.logout();
        
        // 3. Verificamos que todo esté vacío/nulo
        assertNull(instance.getRole(), "El rol debería ser null tras logout");
        assertEquals(0, instance.getUserId(), "El ID debería ser 0 tras logout");
        assertNull(instance.getUserName(), "El nombre debería ser null tras logout");
        assertFalse(instance.isLoggedIn(), "La sesión debería marcarse como inactiva (false)");
    }
    
    /**
     * Prueba 4: Verificar cambio de usuario (sobreescritura de sesión).
     * Si hago login encima de otro login, los datos deben actualizarse.
     */
    @Test
    public void testCambioDeUsuario() {
        Session instance = Session.getInstance();
        
        // Login 1
        instance.login("Admin", 1, "Jefe");
        
        // Login 2 (sin logout previo)
        instance.login("Vendedor", 2, "Empleado");
        
        assertEquals("Vendedor", instance.getRole(), "El rol debió actualizarse");
        assertEquals(2, instance.getUserId(), "El ID debió actualizarse");
    }
}