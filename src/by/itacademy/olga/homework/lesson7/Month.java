package by.itacademy.olga.homework.lesson7;

public enum Month {
    JANUARY (1),
    FEBRUARY (2),
    MARCH (3),
    APRIL (4),
    MAY (5),
    JUNE (6),
    JULY (7),
    AUGUST (8),
    SEPTEMBER (9),
    OKTOBER (10),
    NOVEMBER (11),
    DECEMBER (12);

    private int number;
    Month(int number) { this.number = number; }

    String getNameByNumber(int number) {
        for (Month month : Month.values()) {
            if (month.number == number) {
                return month.name();
            }
        }
        return null;
    }

    int getNumberByName(String name) {
        for (Month month : Month.values()) {
            if (month.name().equals(name)) {
                return month.number;
            }
        }
        return 0;
    }
    public int getNumber() { return number; }
}
