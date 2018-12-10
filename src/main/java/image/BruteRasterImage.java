package image;
import javafx.scene.paint.Color;
import util.Matrices;

import java.util.List;

/**
 * Created by EDELMANN Matthieu and CHARRIN Kevin on 26/11/2018.
 */
public class BruteRasterImage extends RasterImage implements Image {





    public BruteRasterImage(Color color, int width, int height) {
        super(color,width,height);
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
        super(colors);
    }


    public void createRepresentation() {
        colors = new Color[width][height];
    }


    public void setPixelColor(Color color, int x, int y){
        colors[x][y] = color;
    }

    public Color getPixelColor(int x, int y) {
        return colors[x][y];
    }

    public void setPixelsColor(Color[][] pixels) {
        for(int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                this.colors[i][j] = pixels[i][j];
            }
        }
    }

    public void setPixelsColor(Color color) {
        for(int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                this.colors[i][j] = color;
            }
        }
    }



}
