import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
public class TShape extends AbstractPiece{

	public TShape(int r, int c, Grid g) {

		// Create the squares
		square[0] = new Square(g, r, c-1, Color.yellow, true);
		square[1] = new Square(g, r, c, Color.yellow, true);
		square[2] = new Square(g, r, c+1, Color.yellow, true);
		square[3] = new Square(g, r + 1, c, Color.yellow, true);
	}
}