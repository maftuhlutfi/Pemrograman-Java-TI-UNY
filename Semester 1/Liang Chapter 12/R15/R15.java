/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

class R15Room implements R15Interface {
	private int roomBeds;
	private boolean roomMonitor;

	public void R15Init(int roomType) {
		if (0 <= roomType && roomType <= 2)
			switch (roomType) {
				case 0 : roomBeds = 1; roomMonitor = true; break;
				case 1 : roomBeds = 2; roomMonitor = true; break;
				case 2 : roomBeds = 1; roomMonitor = false; break;
			}
		else
			System.out.println("Room type undefined (room type is 0, 1, 2)");
	}

	public boolean checkRoom(boolean needsMonitor, boolean needsSingle) {
		if (needsSingle == true && needsMonitor == true && roomBeds == 1 && roomMonitor == true) 
			return true;
		else if (needsSingle == false && needsMonitor == true && roomBeds == 2 && roomMonitor == true)
			return true;
		else if (needsSingle == true && needsMonitor == false && roomBeds == 1 && roomMonitor == false)
			return true;
		else
			return false;
	}
	
	public int getRoomBeds() {
		return roomBeds;
	}
	
	public void setRoomBeds(int numBeds) {
		roomBeds = numBeds;
	}
	
	public boolean getRoomMonitor() {
		return roomMonitor;
	}
	
	public void setRoomMonitor(boolean hasMonitor) {
		roomMonitor = hasMonitor; 
	}
}

/*
======
OUTPUT
======

E:\SEKOLAH\UNY\Semester 1\PEMROGRAMAN\JAVA\LIANG\Liang Chapter 12\R15>java R15Ad
mit
Does the patient need a heart monitor? y
Does the patient need a single room? y
Room 0 fits the needs

E:\SEKOLAH\UNY\Semester 1\PEMROGRAMAN\JAVA\LIANG\Liang Chapter 12\R15>java R15Ad
mit
Does the patient need a heart monitor? y
Does the patient need a single room? n
Room 1 fits the needs

E:\SEKOLAH\UNY\Semester 1\PEMROGRAMAN\JAVA\LIANG\Liang Chapter 12\R15>java R15Ad
mit
Does the patient need a heart monitor? n
Does the patient need a single room? y
Room 2 fits the needs

E:\SEKOLAH\UNY\Semester 1\PEMROGRAMAN\JAVA\LIANG\Liang Chapter 12\R15>java R15Ad
mit
Does the patient need a heart monitor? n
Does the patient need a single room? n
No rooms fit the needs
*/