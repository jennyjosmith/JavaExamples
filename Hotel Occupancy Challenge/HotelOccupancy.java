
/*
This program calculates the occupancy rate for
each floor of a hotel. Input validation ensures the 	
*/

package chapter5;

// import dependencies 
import java.util.Scanner; //for object input
import java.text.*; // for text formatting

public class HotelOccupancy {
	
	public static void main(String[] args) {
	 int floors; // variable to hold floors
	 
	 int rooms = 0; // number of rooms per floor
	 int roomsOccupied = 0; // rooms occupied per floor
	 int totalRooms = 0; // total rooms in hotel
	 double totalRoomsOccupied = 0; // total rooms occupied in hotel
	 double totalVacancy = 0; // total rooms available
	 double occupancyRate = 0.0; // rooms occupied / total rooms
		
		// Create Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		// Prompt user for floor count
		System.out.print("Enter the number of floors: ");
		floors = input.nextInt();
		
		// Floors input validation
			while(floors < 1)
			{
				System.out.print("Invalid input. Enter a number of floors 1 or greater: ");
				floors = input.nextInt();
			}
		
		for(int i=0; i<floors; i++){
			// Prompt user for the number of rooms
			System.out.print("Enter the number of rooms (Floor " + (int)(i + 1) + "): ");
			rooms = input.nextInt();
			
			// Room input validation
			while(rooms < 10)
			{
				System.out.print("Invalid input. Enter a number of rooms 10 or greater \n(Floor " + (int)(i + 1) + "): ");
				rooms = input.nextInt();
			}
			
			// Prompt user for the number of rooms occupied.
			System.out.print("Enter the number of rooms occupied (Floor " + (int)(i + 1) + "): ");
			roomsOccupied = input.nextInt();
			
			// Occupied input validation
			while(roomsOccupied > rooms || roomsOccupied<0)
			{
				System.out.print("Invalid input. Enter a number of rooms occupied less than " 
									+ "or equal to the number of rooms available.\n(Floor " + (int)(i + 1) + "): ");
				roomsOccupied = input.nextInt();
			}
		
			
			// Calculate total rooms
			totalRooms += rooms;
			
			// Calculate total rooms occupied
			totalRoomsOccupied += roomsOccupied;
		}
		
		// Calculate total vacancy
		totalVacancy = totalRooms - totalRoomsOccupied; 
		
		// Calculate occupancy rate
		occupancyRate = (totalRoomsOccupied/totalRooms);
		
		// Decimal formating 
		 NumberFormat df = new DecimalFormat("#,##0.0000");
		 df.setMaximumFractionDigits(4);
		 
		
		// Display Hotel Occupancy data
		System.out.println("Total Rooms: " + totalRooms + "\nOccupied: " + (int)totalRoomsOccupied + 
							"\nVacant Rooms: " + (int)totalVacancy 
							+ "\nOccupancy Rate: " + df.format(occupancyRate*100) + "%");
	}
}

