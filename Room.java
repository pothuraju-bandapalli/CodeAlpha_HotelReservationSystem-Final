package hotelreservation;

public class Room {
	
	private int roomId;
	
	private String roomType;
	
	private double price;
	
	private boolean isAvailable;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Room(int roomId, String roomType, double price, boolean isAvailable) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.price = price;
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomType=" + roomType + ", price=" + price + ", isAvailable=" + isAvailable
				+ "]";
	}
	

}
