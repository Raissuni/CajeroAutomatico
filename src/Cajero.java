import javax.swing.JOptionPane;
import java.awt.*;

public class Cajero {
    static Cuenta cliente=new Cuenta();
    public static void main(String[] args) {
        int opcion = 0;
        boolean seguir = false;
      

        do {
            do {

                seguir = false;
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(
                            "1-Saldo\n" +
                                    "2-Impisición\n" +
                                    " 3-Reintegro\n" +
                                    " 4-Salir"));
                    seguir = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ha introducido un valor incorrecto.");

                }

            } while (!seguir);


            switch (opcion) {
                case 1:
                    obtenerSaldo();
                    break;
                case 2:
                    ingresar(solicitaCantidad());
                    break;
                case 3:
                    extraer(solicitaCantidad());
                    break;
                case 4:

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta, seleccione una opción.");
            }
        } while (opcion != 4);


    }

    public static double solicitaCantidad() {
        double cantidad=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce una cantidad"));
        return cantidad;
    }

    public static void ingresar(double cantidad) {
        
        cliente.setSaldo(cliente.getSaldo()+cantidad);

    }

    public static void extraer(double cantidad) {
        cliente.setSaldo(cliente.getSaldo()-cantidad);
    }

    public static void obtenerSaldo() {
        cliente.getSaldo();
        JOptionPane.showMessageDialog(null, "Su saldo es de: "+cliente.getSaldo()+" euros");
    }

}