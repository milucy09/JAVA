package Tasks;

public class Task12 {
    public static void main(String[] args) {
        class Point {
            private double x;
            private double y;
            public Point(double x, double y){
                this.x = x;
                this.y = y;
            }

            public void print() {
                System.out.println("(" + x + "," + y + ")");
            }

            public void scale(){
                x = x/2;
                y = y/2;
            }
        }

        // Point p = new Point(32, 32);
        // for (int i = 0; i < 5; i++){
        //     p.scale();
        //     p.print();
        // }

        Point p = new Point(8, 4);
        p.print();
        p.scale();
        p.print();
    }
}

// public class Tasksheet124 {
//     public static void main(String[] args) {
//         Point p = new Point (32, 32);
//         for (int i = 0; i < 5; i++) {
//             p.scale();
//             p.print();
//         }
//     }
// }