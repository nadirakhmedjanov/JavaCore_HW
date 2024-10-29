package x_o;

public class Field {
    private int[] field;

    public Field (int[] field) {
        if (field.length != 9) {
            throw new IllegalArgumentException("Введите все 9 элементов.");
        }
        this.field = field;
    }

    public int[] getField() {
        return field;
    }
}