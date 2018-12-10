package image;

import javafx.scene.paint.Color;

public class Rectangle implements Shape{
 public int x,y,width,height;
 Color color;

    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }





    public boolean contains(Point point){
        return this.x < x && x <= this.x + width && this.y<y && y <= this.y+height;

    }



    public Color getColor(){
        return this.color;
    }
}
