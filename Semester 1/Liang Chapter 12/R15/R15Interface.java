// R15 Assignment
// Author: Russ Wakefield
// Date:   April 1, 2017
// Class:  CS163
// Email:  waker@cs.colostate.edu
public interface R15Interface {

	/*
	 * Method - R15Init
	 * precondition - 0 <= roomType <= 2
	 * postcondition - room initialized with the correct attributes.
	 * 		Type 0 - has 1 bed and a heart monitor
	 * 		Type 1 - has 2 beds and a heart monitor
	 * 		Type 2 - has 1 bed and no heart monitor
	 */
	public void R15Init(int roomType);

	/*
	 * Method - checkRoom
	 * Precondition - this room has been initialized to its appropriate attributes
	 * Precondition - needsMonitor is set to t/f based on the need for a heart monitor
	 * Precondition - needsSingle is set to t/f based on the need for a Single Room
	 * Postcondition - returns true if the necessary equipment is available.  
	 * 			Note, if the patient does not need a heart monitor, we want to save 
	 * 			it for someone that does need it - same with the single bed.  This
	 * 			means the requirements should directly match the room.
	 */
	public boolean checkRoom(boolean needsMonitor, boolean needsSingle);

	/*
	 * Method - getRoomBeds()
	 * Precondition - this room has been initialized to its appropriate attributes
	 * Postcondition - returns the number of beds in the room.
	 */
	public int getRoomBeds();

	/*
	 * Method - setRoomBeds(int numBeds)
	 * Precondition - this room has been initialized to its appropriate attributes
	 * Postcondition - sets the number of beds in the room to numBeds. 
	 */
	public void setRoomBeds(int numBeds);


	/*
	 * Method - getRoomMonitor()
	 * Precondition - this room has been initialized to its appropriate attributes
	 * Postcondition - returns true if the room has a heart monitor, false if not.
	 */
	public boolean getRoomMonitor();

	/*
	 * Method - setRoomMonitor(boolean hasMonitor)
	 * Precondition - this room has been initialized to its appropriate attributes
	 * Postcondition - sets value of whether the room has a heart monitor appropriately.
	 */
	public void setRoomMonitor(boolean hasMonitor);

}
