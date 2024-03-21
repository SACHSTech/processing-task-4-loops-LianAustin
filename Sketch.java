import processing.core.PApplet;

public class Sketch extends PApplet {


  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /**
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

	// A 10x10 grid that scales with the window size (top left)
  int intRows = 10;
  int intCols = 10;
  int intWidth = width / (intCols * 2);
  int intHeight = height / (intRows * 2);

  for (int i = 0; i < intRows; i++) {
    for (int j = 0; j < intCols; j++) {
      stroke(0,0,0);
      int intX = j * intWidth;
      int intY = i * intHeight;
      fill(255, 255, 255);
      rect(intX, intY, intWidth, intHeight);
    }
  }

  // A 5 x 5 grid of evenly spaced circles that scales with the window size (top right)
  int intCircleRows = 5;
  int intCircleCols = 5;
  int intCircleWidth = width / (intCircleCols * 2);
  int intCircleHeight = height / (intCircleRows * 2);

  for (int i = 0; i < intCircleRows; i++) {
    for (int j = 0; j < intCircleCols; j++) {
      int x = width / 2 + j * intCircleWidth + intCircleWidth / 2;
      int y = i * intCircleHeight + intCircleHeight / 2;
      fill(255, 50, 150);
      ellipse(x, y, intCircleWidth / 2, intCircleHeight / 2);
    }
  }

  // A horizontal grayscale gradient (bottom left)
    int intLineColour = 0;
    for(int intLines = 0; intLines <= width / (float) (2); intLines++){
      intLineColour = intLineColour + 1;
      stroke(intLineColour, intLineColour, intLineColour);
      line(intLines, width / (float) (2), intLines, height + (float) (10));
    }
// A 8 petal flower that uses a loop to draw the petals evenly spaced around the center of the flower (bottom right)
int intPetals = 8;
float centerX = 3 * width / 4;
float centerY = 3 * height / 4;
// Draws the petals
    for (int i = 0; i < intPetals; i++) {
      fill(220,93,52);
      pushMatrix();
      translate((float) (0.75 * width), (float) (0.75 * height));
      rotate(-i * PI / 4);
      translate((float) (width / 12), 0);
      ellipse(0, 0, (float) (width / 6), (float) (height / 22));
      popMatrix();

    }
// Draw the center of the flower
fill(38,108,45);
ellipse(centerX, centerY, 50, 50);
}
}