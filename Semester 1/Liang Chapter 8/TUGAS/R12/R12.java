/*
================================
Nama  : Muchamad Lutfi Maftuh
NIM   : 19537141023
Kelas : I.1
================================
*/

public class R12 implements RecitationInterface {
	Object PictureLibrary = null;
	int width = 0;
	int height = 0;
	int[][] data;

	public R12(){
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

	// Negates a black and white image
	public void negateImage() {
    PictureLibrary pict = new PictureLibrary();
		int maxval = pict.MAXVAL;
    for (int y = 0; y < height; y++)
                for (int x = 0; x < width; x++)
                    data[y][x] = maxval - data[y][x];
	}

	// Increases the contrast in an image
	public void increaseContrast() {
    PictureLibrary pict = new PictureLibrary();
    int maxval = pict.MAXVAL;
    int value = 0;
    for (int y = 0; y < height; y++) 
                for (int x = 0; x < width; x++) {
                  value = data[y][x];
                  if (0 <= value && value <= 127) {
                    value -= 16;
                  }
                  if (128 <= value && value <= maxval) {
                    value += 16;
                    }
                  if (value <= 0)
                      value = 255;
                  if (value >= 255)
                      value = 0;
                  data[y][x] = value;
                  }
	}

	// Decreases the contrast in an image 
	public void decreaseContrast() {
    PictureLibrary pict = new PictureLibrary();
    int maxval = pict.MAXVAL;
    int value = 0;
    for (int y = 0; y < height; y++) 
                for (int x = 0; x < width; x++) {
                  value = data[y][x];
                  if (0 <= value && value <= 127) {
                    value += 16;
                  }
                  if (128 <= value && value <= maxval) {
                    value -= 16;
                    }
                  if (value <= 0)
                      value = 255;
                  if (value >= 255)
                      value = 0;
                  data[y][x] = value;
                  }
	}
}