package hotelreservation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Reservation implements Payment {
	
	List<Room> rooms=new ArrayList<Room>();
	public Reservation() {
		
	}
	int totalAmount;
	int refund;
	public void searchRoom(Room isAvailable) {
		
		for(Room room:rooms) {
		if(isAvailable.isAvailable()) {
			System.out.println("Is availablee---Dont worry bro");
			System.out.println(room);
		}
		else {
			System.out.println("Sorry for your incovinece-- their is no rooms");
		}
	}
		
		
	}

	@Override
	public void PaymentMethod() {
		System.out.println("Payments are Available---");
		System.out.println("QR code");
		System.out.println("internet Banking.");
		System.out.println("UPI payement");
	}
	public void bookRooms(Customer customer,int totalPayment,int roomId) {
		for(Room room:rooms) {
			if(room.isAvailable()) {
			room.setAvailable(false);
			
			
			}	
		}this.totalAmount=totalPayment;
		System.out.println("Amount="+totalPayment);
		PaymentMethod();
		System.out.println("This room is succesfully reserved by  you");
		System.out.println("Payment were Successful=====");
	}
	public void cancelReservation(int roomId) {
		for(Room room:rooms) {	
              if(room.getRoomId()== roomId) {
			room.setAvailable(true);
			}
		}
		System.out.println("Reservation is cancelled Succesfully");
        System.out.println("Refund Also successfully completed");
        System.out.println("Cancelation Charges =200");
        int ref=refunAmount();
        System.out.println("Refund Amount is="+ ref);
	}
public int refunAmount() {
		
		return totalAmount-200;
	}
	
public int paymenntAmount() {
		
		return totalAmount;
	}
	
	

}
