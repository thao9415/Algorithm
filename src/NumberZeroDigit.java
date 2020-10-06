public class NumberZeroDigit {

    // đếm số chữ số 0 của n giai thừa
    static long countZero(long n) {

        long count = 0;
        long k = 5;

        // bước 1: đếm số lần số 5 xuất hiện trong n!. Ta có n! = 1.2.3.4.5.6.7....n
        // cứ 5 bước xuất hiện số chia hết cho 5 1 lần như sau 5 -> 10 -> 15 -> 20 => count = n/5
        // bước 2: ta thấy 25 = 5*5, nghĩa là số 25 xuất hiện 2 lần. Tương tự 50 -> 75 -> 100...
        // có nghĩa là cần đếm thêm số lần xuất hiện số 5 tại đây. Tạm gọi là số 5 thứ 2 sẽ xuất hiện 1 lần sau 25 đơn vị
        // vì vậy count = count + n/25
        // tương tự với 5*5*5 = 125 cần tìm số lần xuất hiện của số 5 thứ 3 => count = count + n/125
        // tổng quát công thức như sau: result = tổng(n/5^i)
        while (k <= n) {
            count = count + n/k;
            k = k*5;
        }

        return count;
    }

    public static void main(String[] args) {
        long test = countZero(125);

        System.out.println(test);
    }
}
