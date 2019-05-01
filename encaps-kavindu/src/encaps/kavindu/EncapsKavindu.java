/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encaps.kavindu;

/**
 *
 * @author kavindu
 */
public class EncapsKavindu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //		List<Bus> buses = new BusStation("red", 3).buses;
//		for (Bus bus : buses) {
//			System.out.println(bus.toString());
//		}
		BusStation busStation = new BusStation();
		busStation.addBus(busStation.new Bus("White"));
		busStation.addBus(busStation.new Bus("Red"));
		busStation.addBus(busStation.new Bus("Blue"));
		
		busStation.getBuses();
    }
    
}
