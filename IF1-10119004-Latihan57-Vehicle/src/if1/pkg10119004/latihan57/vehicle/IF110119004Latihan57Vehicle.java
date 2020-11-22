/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan57.vehicle;

/**
 *
 * @author ENDOG
 */
public class IF110119004Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Bicycle bicycle = new Bicycle();
        // memasukkan data 
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);
        // menampilkan data
        System.out.println("Brand : ".concat(bicycle.getMyBrand()));
        System.out.println("Model : ".concat(bicycle.getMyModel()));
        System.out.println("Jumlah Gear : " + bicycle.getMyGearCount());
        
        System.out.println();
        
        SkateBoard skateboard = new SkateBoard();
        // memasukkan data
        skateboard.setMyBrand("Ally Skate");
        skateboard.setMyModel("Rocket");
        skateboard.setMyBoardLength(54.4);
        // menampilkan data
        System.out.println("Brand : ".concat(skateboard.getMyBrand()));
        System.out.println("Model : ".concat(skateboard.getMyModel()));
        System.out.println("Jumlah Gear : " + skateboard.getMyBoardLength());
    }
    
}
