package ooppractical;

public class boxprogram1 {
    double width;
    double height;
    double depth;
}

class boxprogram1 {
    public static void main(String args[]) {
        boxprogram1 mybox = new boxprogram1();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is " + vol);
    }
}