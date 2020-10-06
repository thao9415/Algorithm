public class MaxFraction {

    public int maxFraction(int[] numerators, int[] denominators) {
        int cs = 0;
        for (int i = 1; i < numerators.length; i++) {
            if (numerators[cs] * denominators[i] < numerators[i] * denominators[cs]) {
                cs = i;
            }
        }
        return cs;
    }

    public static void main(String[] args) {
        int[] tu = {1, 2, 4};
        int[] mau = {5, 2, 9};
        int cs = 0; // vị trí phân số lớn nhất

        // lần lượt so sánh phân số ở vị trí đầu tiên vs các phân số tiếp theo
        // nếu phân số tiếp theo lớn hơn => gán vị trí vào biến cs...
        for (int i = 1; i < tu.length; i++) {
            if (tu[cs] * mau[i] < tu[i] * mau[cs]) {
                cs = i;
            }
        }

        System.out.println("Phân số lớn nhất ở vị trí: " + cs);
    }
}
