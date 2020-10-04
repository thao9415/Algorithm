public class SangNguyenTo {
    public static void main(String[] args) {
        int N = 1000;

        // Vì sao size lại là N + 1 mà không phải size = N
        // Lý do là vì đang để x = 2 tại index 2, x = 3 tại index 3. Vậy khi đó x = 1000 tương ứng với index = 1000 => size = 1001
        boolean[] check = new boolean[N + 1];

        // Giả sử tất cả các số  [2...N] mặc định đều là số nguyên tố
        for (int i = 2; i <= N; i++) {
            check[i] = true;
        }

        // SNT: Nếu 1 số là số nguyên tố, thì tất cả các bội cùa nó không phải số nguyên tố
        for(int i = 2; i <= N; i++) {
            if(check[i]) {// Nếu i là số nguyên tố
                //j là các bội của i j lần lượt bằng 2*i, 3*i, 4*i...cho đến x*i > N
                for (int j = 2*i; j <= N; j += i) {
                    check[j] = false; // gán cho các bội của i = false
                }
            }
        }

        // In ra các số nguyên tố kiểm tra lại nào :3
        for (int i = 2; i <= N; i++) {
            if (check[i]) {
                System.out.print(i + " ");
            }
        }


    }

}
