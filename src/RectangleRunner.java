public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle plot1 = new Rectangle(150,200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        //Update instance Variables
        plot1.setWidth(75);
        plot2.setWidth(75);
        plot3.setWidth(75);
        plot2.setLength(75);

        int sum = plot1.calculateArea() + plot2.calculateArea() + plot3.calculateArea();
        System.out.println("These three plot require " + sum + " square feet of seed.");
    }
}

