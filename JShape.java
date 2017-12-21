import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
public class JShape extends AbstractPiece{

	public JShape(int r, int c, Grid g) {

		// Create the squares
		square[0] = new Square(g, r - 1, c, Color.blue, true);
		square[1] = new Square(g, r, c, Color.blue, true);
		square[2] = new Square(g, r + 1, c, Color.blue, true);
		square[3] = new Square(g, r + 1, c - 1, Color.blue, true);
	}
}
