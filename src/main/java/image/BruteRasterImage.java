package image;
import javafx.scene.paint.Color;
import util.Matrices;

/**
 * Created by EDELMANN Matthieu and CHARRIN Kevin on 26/11/2018.
 */
public class BruteRasterImage implements Image {
    Color[][] colors;
    int width;
    int height;

    public BruteRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        colors = new Color[width][height];
        for(int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                colors[i][j] = color;
            }
        }
    }

    public BruteRasterImage(Color[][] colors){
        this.width = Matrices.getRowCount(colors);
        this.height = Matrices.getColumnCount(colors);
        this.colors = new Color[width][height];
        for(int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                this.colors[i][j] = colors[i][j];
            }
        }
    }
}
