package image;

import javafx.scene.paint.Color;
import java.util.List;

public class VectorImage implements Image {

    List<Shape> shapes;
    int width,height;




    VectorImage(List<Shape> shapes, int width, int height){
        this.shapes = shapes;
        this.width  = width;
        this.height = height;
    }

    public Color getPixelColor(int x,int y){
        for(Shape c:shapes){
            if(c.contains(new Point(x,y))){
                return c.getColor();
            }
        }
        return  Color.WHITE;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }


    protected int setWidth(int width){
        this.width= width;
        return width;
    }

    protected int setHeight(int height){
        this.height= height;
        return height;
    }


}
