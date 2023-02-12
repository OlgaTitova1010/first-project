package by.itacademy.olga.homework.lesson7;

public class BoxType {
    public static void main(String[] args) {
        Box obscureBoxType = new Box();
        obscureBoxType.x = 5;
        obscureBoxType.y = 4;
        obscureBoxType.z = 3;
        System.out.println(obscureBoxType.displayTypeOfBox());
    }

}
class Box {
    int x;
    int y;
    int z;
    Box() {
    }
    public String displayTypeOfBox() {
        if (x == y && x == z)
            return "This is a cube";
        else if (z == 0 || y == 0 || x == 0)
            return "This is envelope";
        else
            return "This is usual box";
    }
}
