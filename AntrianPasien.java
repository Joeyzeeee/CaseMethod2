class AntrianPasien {
    Node head, tail;

    public void tambah(Pasien a) {
        Node baru = new Node(a);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
    }

    public Pasien layani() {
        if (head == null)
            return null;
        Pasien a = head.data;
        head = head.next;
        if (head == null)
            tail = null;
        return a;
    }

    public void tampilkan() {
         if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return;
        }
        System.out.println("Antrian Pasien:");
        Node temp = head;
        while (temp != null) {
            temp.data.tampilkanInformasi();
            temp = temp.next;
        }
    }

    public int sisa() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
