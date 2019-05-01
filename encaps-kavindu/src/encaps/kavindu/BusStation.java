/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encaps.kavindu;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kavindu
 */
class BusStation {

    List<Bus> buses;

	{
		buses = new ArrayList<>();
	}

	public BusStation(String color, int nob) {
		for (int i = 0; i < nob; i++) {
			buses.add(new Bus(color));
		}
	}
	public BusStation() {
		
	}
	public void addBus(Bus bus) {
		buses.add(bus);
	}
	public void getBuses() {
		
	/*class BusValidator{
		public void validate(String color) {
                	if("RED".equalsIgnoreCase(color)) {
				System.out.println("Valid color");
			}else {
				System.out.println("not a valid color");
			}
		}
	}*/
                //Anonymas class
		new Object(){
			public void validate(String color) {
				if("RED".equalsIgnoreCase(color)) {
					System.out.println("Valid color");
				}else {
					System.out.println("not a valid color");
				}
			}
		}.validate("Green");
		
		
		for(Bus bus:buses) {
			System.out.println(bus.toString());
		}
		//new BusValidator().validate("Green");
	}

        //inner class
	class Bus {
		String color;

		public Bus(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return color + " bus ";
		}

	}

    
}
