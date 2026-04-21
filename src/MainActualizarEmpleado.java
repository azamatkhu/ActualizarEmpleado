import java.sql.*;

public class MainActualizarEmpleado {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "RIBERA",
                    "ribera"
            );

            System.out.println("Conectado!");

            Statement statement = connection.createStatement();

            String sql = "UPDATE EMPLEADO SET SALARIO = SALARIO + ?";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setDouble(1, 99999);
            ps.executeUpdate();

            System.out.println("Actualizado!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}