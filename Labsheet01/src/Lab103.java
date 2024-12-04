import javax.swing.JOptionPane;

public class Lab103 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String inputNumofMin = JOptionPane.showInputDialog("Input Time Parking (minute):");
        int numofMin = Integer.parseInt(inputNumofMin);
        int hours = numofMin / 60;
        int minutes = numofMin % 60;

        double totalHour = 50.0;
        double totalMin = 0.25;
        double totalPay = (hours * totalHour) + (minutes * totalMin);

        String message = "You parking "+hours+" Hour "+minutes+" Minute."+
        "\nAmount to be paid is "+totalPay+" baht.";

        JOptionPane.showMessageDialog(null,message);



    }

}