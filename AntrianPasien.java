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
        if (head == null) return null;
        Pasien a = head.data;
        head = head.next;
        if (head == null) tail = null;
        return a;
    }
