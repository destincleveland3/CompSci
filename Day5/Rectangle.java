public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int newLength, int newWidth){
        length = newLength;
        width = newWidth;
    }
    public Rectangle(){
        length = 1;
        width = 1;
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public void setLength(int newLength) {
        length = newLength;
    }
    public void setWidth(int newWidth) {
        width = newWidth;
    }
    public int calculateArea() {
        int area = length * width;
        return area;
    }
    public int calculatePerimeter() {
    int perimeter = length + width + length + width ;
    return perimeter;
    }
    public double calculateDiagonal() {
        double hypotnuse = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        return hypotnuse;
    }

    public String toString() {
        String data = "The rectangle has length " + length + " and width " + width;
        return data;
    }

    public boolean equals(Rectangle other) {
        if (other.length == length && other.width == width) {
            return true;
        } else {
            return false;
        }
    }



}


