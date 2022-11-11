/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classtestsimple;

/**
 *
 * @author davidlangner
 */
public class Car
{
      String name;
      int gears;
      int maxVelocity;
      private int currentGear = 0;
      Car(int gears) {
          this.gears = gears;
      }
      
      void upshift()
      {
           if(currentGear < gears)
               currentGear++;
      } 
      
      public int getCurrentGear()
      {
          return currentGear;
      }
     
}
