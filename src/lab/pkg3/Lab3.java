/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3;

/**
 *
 * @author Dolan
 */
public class Lab3
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Colorado c = new BaseColorado();
        System.out.println(c.getDescription());
        System.out.println(c.getCost() + "\n");

        c = new ExtendedCab(c);
        System.out.println(c.getDescription());
        System.out.println(c.getCost() + "\n");

        c = new RearWheelDrive(c);
        System.out.println(c.getDescription());
       System.out.println(c.getCost() + "\n");
       
        c = new ToolBox(c);
        System.out.println(c.getDescription());
       System.out.println(c.getCost() + "\n");

        c = new RoofRack(c);
        System.out.println(c.getDescription());
        System.out.println(c.getCost() + "\n");
    }
}
