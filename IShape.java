import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
public class IShape extends AbstractPiece{

	public IShape(int r, int c, Grid g) {

		// Create the squares
		square[0] = new Square(g, r, c-1, Color.cyan, true);
		square[1] = new Square(g, r, c, Color.cyan, true);
		square[2] = new Square(g, r, c+1, Color.cyan, true);
		square[3] = new Square(g, r, c+2, Color.cyan, true);
	}
}