/*
================================
Nama	: Muchamad Lutfi Maftuh
NIM 	: 19537141023
Kelas	: I.1
================================
*/

public class Transforms implements ImageInterface {
	Object PictureLibrary = null;
	int width = 0;
	int height = 0;
	int[][] data;

	public Transforms(){
        //Instantiate PictureLibrary object
        PictureLibrary pict = new PictureLibrary();
    }

    // Read the image
	public void readImage(String inFile) {
		PictureLibrary pict = new PictureLibrary();
  		try {
        // Calls to readPGM or writePGM and associated code here
  			pict.readPGM(inFile);
    	} catch (Exception e) {
        System.out.println(e.getMessage());
    	}
    width = pict.getWidth();
    height = pict.getHeight();
    data = pict.getData();
	}

	// Write the image
	public void writeImage(String outFile) {
		PictureLibrary pict = new PictureLibrary();
      pict.setData(data);
  		try {
        // Calls to readPGM or writePGM and associated code here
  			pict.writePGM(outFile);
    	} catch (Exception e) {
        System.out.println(e.getMessage());
    	}
	}

	// Get image data
	public int[][] imageData() {
  		PictureLibrary pict = new PictureLibrary();
      return data;
	}

	// Decode the pixels
	public void decode() {
		PictureLibrary pict = new PictureLibrary();
		int value = 0;
    	for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                	value = data[y][x];
                	int upper = 15 - (value / 16);
                	int lower = value % 16;
                	value = (upper * 16) + lower;
                	data[y][x] = value;
                }
        }

	}

	// Swap the nibbles in each pixel
	public void swap() {
		PictureLibrary pict = new PictureLibrary();
		int value = 0;
    	for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                	value = data[y][x];
                	int upper = value & 0b11000000;
                	int middle = value & 0b00111100;
                	int lower = value & 0b00000011;
                	value = (lower << 6) | middle | (upper >> 6);
                	data[y][x] = value;
                }
        }
	}

	// Mirror the image corner to corner
	public void mirror() {
		PictureLibrary pict = new PictureLibrary();
		int[][] newdata = new int[height][width];
    	for (int y = 0, b = height - 1;y < height && b >= 0;y++ , b--) {
                for (int x = 0;x < width;x++) {
                	newdata[b][x] = data[y][x];
                }
        }
        data = newdata;
	}
	
	// Exchange two rectangles in image
	public void exchange() {
		PictureLibrary pict = new PictureLibrary();
		int[][] rect1 = new int[height][width];
		int[][] rect2 = new int[height][width];
    	for (int y = 10;y < 310;y++) {
                for (int x = 10, z = 310;x < 160 && z < 460;x++, z++) {
                	rect1[y][x] = data[y][x];
                	rect2[y][z] = data[y][z];
                }
        }
        // Input rect1 ke data
        for (int y = 10;y < 310;y++) {
        	for (int x = 10, z = 310;x < 160 && z < 460;x++, z++)
        	data[y][z] = rect1[y][x];
        }
        // Input rect2 ke data
        for (int y = 10;y < 310;y++) {
        	for (int x = 310, z = 10;x < 460 && z < 160;x++, z++)
        	data[y][z] = rect2[y][x];
        }
	}
}