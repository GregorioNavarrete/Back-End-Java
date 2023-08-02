package derbyjavabd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DerbyJavaBD {
    public static void main(String[] args) {
        // Establecer la conexión a la base de datos
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/personas;create=true");
            // Crear la tabla si no existe
           //createTable(conn);
            // Menú de opciones
            Scanner scanner = new Scanner(System.in);
            int opcion = 0;
            while (opcion != 5) {
                System.out.println(".. Menú de opciones ..");
                System.out.println("1......gregar elemento");
                System.out.println("2....Mostrar elementos");
                System.out.println("3....Eliminar elemento");
                System.out.println("4...Modificar elemento");
                System.out.println("5.               Salir");
                System.out.print("Ingrese una opción: ");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        agregarElemento(conn);
                        break;
                    case 2:
                        mostrarElementos(conn);
                        break;
                    case 3:
                        eliminarElemento(conn);
                        break;
                    case 4:
                        actualizarTabla(conn);
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                        break;
                }
                System.out.println();
            }
            // Cerrar la conexión a la base de datos
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        String sql = "CREATE TABLE personas (nombre VARCHAR(45), edad INT)";
        stmt.executeUpdate(sql);
    }

    private static void agregarElemento(Connection conn) throws SQLException {
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = ingreso.next();
        System.out.print("Ingrese la edad: ");
        int edad = ingreso.nextInt();
        Statement stmt = conn.createStatement();
        // Insertar un nuevo registro en la tabla
        String sql = "INSERT INTO personas VALUES ('" + nombre + "', " + edad + ")";
        stmt.executeUpdate(sql);
        System.out.println("Datos insertados correctamente.");
        stmt.close();
        System.out.println("Elemento agregado correctamente.");
    }

    private static void mostrarElementos(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        String selectSql = "SELECT * FROM personas";
        ResultSet rs = stmt.executeQuery(selectSql);
        System.out.println("\tDatos de las personas");
        while (rs.next()) {
            int edad = rs.getInt("edad");
            String nombre = rs.getString("nombre");
            System.out.println( " Nombre: " + nombre + "  Edad: " + edad);
        }
    }

    private static void eliminarElemento(Connection conn) throws SQLException {
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = ingreso.next();
        Statement stmt = conn.createStatement();
        String deleteSql = "DELETE FROM personas WHERE nombre = '" + nombre + "'";
        int rowsAffected = stmt.executeUpdate(deleteSql);
        if (rowsAffected > 0) {
            System.out.println("Elemento eliminado correctamente.");
        } else {
            System.out.println("No se encontró ningún elemento ");
        }
    }

    private static void actualizarTabla(Connection conn) throws SQLException {
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = ingreso.next();
        System.out.print("Ingrese la edad: ");
        int edad = ingreso.nextInt();
        Statement stmt = conn.createStatement();
        // Actualizar la edad de un registro en la tabla basado en el nombre
        String sql = "UPDATE personas SET edad = " + edad + " WHERE nombre = '" + nombre + "'";
        stmt.executeUpdate(sql);
        System.out.println("Datos actualizados correctamente.");
        stmt.close();
    }
}
