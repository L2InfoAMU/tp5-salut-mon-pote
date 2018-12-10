package image;
import javafx.scene.paint.Color;
import util.Matrices;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage extends RasterImage implements Image {

    /** Arguments */

    int width;
    int height;
    List<Color> palette;
    int[][] indexesOfColors;


    /** Constructeurs */

    public PaletteRasterImage(Color color, int width, int height){
        super(color,width,height);

    }


    public PaletteRasterImage(Color[][] pixels) {
        super(pixels);
        width = Matrices.getRowCount(pixels);
        height = Matrices.getColumnCount(pixels);
        createRepresentation();
        setPixelsColor(pixels);
    }


    /** Méthodes */

    public void createRepresentation(){
     this.indexesOfColors= new int[width][height];
     this.palette = new ArrayList<>();
    }

    public void setPixelColor(Color color, int x, int y)
    {
        if(! palette.contains(color))
        {
            palette.add(color);
        }
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

    public void setPixelsColor(Color color){
        for(int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                setPixelColor(color,i,j);
            }
        }
    }




}
