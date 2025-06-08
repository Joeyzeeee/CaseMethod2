class RiwayatTransaksi {
    TransaksiLayanan[] data;
    int size;
    Node head, tail;

    public RiwayatTransaksi(int kapasitas) {
        data = new TransaksiLayanan[kapasitas];
        size = 0;
    }

    public void tambah(TransaksiLayanan tr) {
        if (size < data.length) {
            data[size++] = tr;
        }
    }

    public void tampilkan() {
        if (isEmpty()){
            System.out.println("Belum ada transaksi");
            return;
        }
        System.out.println("Daftar Transaksi:");
        for (int i = 0; i < size; i++) {
            data[i].tampilkan();
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}