public class Tugas1{
    String nama;
    String NIM;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    public Tugas1(String nama, String NIM, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.NIM = NIM;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public static int nilaiUTSTertinggiDC(Tugas1[] arr, int left, int right) {
        if (left == right) {
            return arr[left].nilaiUTS;
        }
        int mid = (left + right) / 2;
        int leftMax = nilaiUTSTertinggiDC(arr, left, mid);
        int rightMax = nilaiUTSTertinggiDC(arr, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }

    public static int nilaiUTSTerendahDC(Tugas1[] arr, int left, int right) {
        if (left == right) {
            return arr[left].nilaiUTS;
        }
        int mid = (left + right) / 2;
        int leftMin = nilaiUTSTerendahDC(arr, left, mid);
        int rightMin = nilaiUTSTerendahDC(arr, mid + 1, right);
        return Math.min(leftMin, rightMin);
    }

    public static double rataRataUASBF(Tugas1[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].nilaiUAS;
        }
        return total / arr.length;
    }
}
