package hotelreservation;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Reservation reserve=new Reservation();
		
		
		List<Room>roomsList= new ArrayList<Room>();
		roomsList.add(new Room(12,"Standard",3000,true));
		roomsList.add(new Room(13,"Delux",70000,true));
		roomsList.add(new Room(14,"Standard",30000,true));
		roomsList.add(new Room(15,"Suite",10000,true));
		roomsList.add(new Room(16,"Delux",70000,true));
		 
		int choice;
		
		do {
			System.out.println("-------Hotel Reservation App Menu------");
			
			System.out.println("1.Search Rooms");
			System.out.println("2.Book Rooms");
			System.out.println("3.Cancel Preservation ");
			System.out.println("4.View Booking Details");
			System.out.println("5.Exit");
			
		System.out.println("Enter the Choice");
		choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			for(Room rooms:roomsList) {
				System.out.println(rooms);
			}
		
		break;
		
		case 2:
			System.out.println("enter customerId=");
			int cusId=sc.nextInt();
			System.out.println("Enter Custumer Name=");
			String customerName=sc.next();
			System.out.println("Enter Phone number=");
			long number=sc.nextLong();
			System.out.println("Enter Email=");
			String email=sc.next();
			
			for(Room rooms:roomsList) {
				System.out.println(rooms);
			}
			System.out.println("Enetr room Id=");
			int roomId=sc.nextInt();
			System.out.println("Enter Amount=");
			int amount=sc.nextInt();
			
			Customer customer=new Customer(cusId,customerName,number,email);
			
			reserve.bookRooms(customer, amount,roomId);
			
			break;
			
		case 3:
			
			System.out.println("Enter roomId=");
			int room=sc.nextInt();
			reserve.cancelReservation(room);
			
			break;
			
		case 4:
			reserve.PaymentMethod();
			break;
		case 5:
			System.out.println("Thank you-Visit Again----------");
			
			default :
				System.out.println("Invaild Input choice  range Between 1 to 5");
			
		}
		
						
		}while(choice<5);
		
	}

}
