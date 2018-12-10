package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.util.List;

public abstract class RasterImage {
    Color[][] colors;
    int width;
    int height;
    List<Color> palette;
    int[][] indexesOfColors;

    public RasterImage(Color color, int width, int height) {
        setWidth(width);
        setHeight(height);
        createRepresentation();
        for(int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                setPixelColor(color,i,j);
            }
        }
    }

    public RasterImage(Color[][] pixels){
        width = Matrices.getRowCount(pixels);
        height = Matrices.getColumnCount(pixels);
        createRepresentation();
        setPixelsColor(pixels);
    }


        public abstract  void createRepresentation (); { }


        public int getWidth (){
            return width;
        }

        public void setWidth ( int width){
        this.width = width;
    }


        public int getHeight () {
        return height;
    }

        public void setHeight ( int height){
        this.height = height;
    }


    public abstract void setPixelColor(Color color, int x, int y);{}

    public abstract void setPixelsColor(Color[][] pixels);{}

    public abstract void setPixelsColor(Color color);

    public abstract Color getPixelColor(int x,int y);


}


