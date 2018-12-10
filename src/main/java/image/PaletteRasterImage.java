package image;
import javafx.scene.paint.Color;
import util.Matrices;

import java.util.List;

public class PaletteRasterImage implements Image {

    /** Arguments */

    int width;
    int height;
    Color color;
    List<Color> palette;
    int[][] indexesOfColors;


    /** Constructeurs */

    public PaletteRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        indexesOfColors = new int[width][height];
        for(int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                setPixelColor(color,i,j);
            }
        }
    }


    public PaletteRasterImage(Color[][] pixels) {
        width = Matrices.getRowCount(pixels);
        height = Matrices.getColumnCount(pixels);
        pixels = new Color[width][height];
        createRepresentation();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                indexesOfColors[i][j] = palette.indexOf(pixels[i][j]);
            }
        }
    }


    /** Méthodes */

    public void createRepresentation(){
     this.indexesOfColors= new int[width][height];
    }

    public void setPixelColor(Color color, int x, int y)
    {
        indexesOfColors[x][y] = palette.indexOf(color);
    }


    public Color getPixelColor(int x, int y){
        return palette.get(indexesOfColors[x][y]);
    }

    public void setPixelsColor(Color[][] pixels) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                setPixelColor(pixels[i][j],i,j);
            }
        }
    }

    private void setPixelsColor(Color color){
        for(int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                setPixelColor(color,i,j);
            }
        }
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected void setHeight(int height) {
        this.height = height;
    }


}
