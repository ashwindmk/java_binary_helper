public class BinaryHelper {
    public String getBinary(int i) {
        return itoa(i, 2);
    }

    private String itoa(int i, int base) {
        if (i == 0) return "0";

        boolean neg = false;
        if (i < 0) {
            i = -i;
            neg = true;
        }

        String s = "";
        while (i > 0) {
            s = (i % base) + s;
            i = i / base;
        }

        if (neg) {
            return "-" + s;
        } else {
            return s;
        }
    }
}
