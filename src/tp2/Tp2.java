package tp2;
public class Tp2 {
    public static void main(String[] args) {
        Robot robot = new Robot();

        Hombre hombre = new Hombre();

        hombre.jugarConRobot(robot);  
        
        Hombre hombre2 = new Hombre();
        
        hombre2.jugarConRobot(robot);
    }
    
}
