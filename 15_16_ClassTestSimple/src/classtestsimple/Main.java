/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classtestsimple;

/**
 *
 * @author davidlangner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instantiate Car object
        Car car1 = new Car(5);
        car1.upshift();
        car1.upshift();
        
        //get current Gear and prin it out
        System.out.println("Current gear: " + car1.getCurrentGear());
        //shift up and print out the gear again
        car1.upshift();
        car1.upshift();
        System.out.println("Current gear: " + car1.getCurrentGear());
        
        InAndOut test = new InAndOut();
        //get input
        test.input();
        //print out the input afterwards
        test.output();
        
        //instant. new factorial object
        Factorial fact = new Factorial();
        //call factorial method and print it out
        System.out.println("Factorial is: " + fact.factorial(3));
    }
}
