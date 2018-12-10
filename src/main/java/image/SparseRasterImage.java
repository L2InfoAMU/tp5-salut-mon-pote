package image;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage extends RasterImage   {

    Map<Point, Color> pixelMap;

    /** Constructeurs */

    public SparseRasterImage(Color color, int width, int height) {
        super(color, width, height);
    }

    public SparseRasterImage(Color[][] pixels) {
        super(pixels);
    }

     /** Méthodes */

    public void createRepresentation() {
        pixelMap = new HashMap();
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {
        Point point = new Point(x, y);
        pixelMap.put(point, color);
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return pixelMap.getOrDefault(new Point(x,y),Color.WHITE);
    }

    public void setPixelsColor(Color[][] pixels) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                setPixelColor(pixels[i][j], i, j);
            }

        }
    }

    public void setPixelsColor(Color color) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                setPixelColor(color, i, j);
            }
        }
    }
}

