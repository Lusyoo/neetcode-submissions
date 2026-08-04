class MyHashSet {
    private final Node[] arr = new Node[10000];

    private static class Node {
        int value;
        Node next;

        Node (int value) {
            this.value = value;
            next = null;
        }
    }

    public MyHashSet() {
        
    }

    private int getIndex(int key) {
        return key % arr.length;
    }
    
    public void add(int key) {
        int index = getIndex(key);
        Node val = arr[index];

        if (val == null) {
            arr[index] = new Node(key);
            return;
        }

        while (true) {
            if (val.value == key) return;
            if (val.next == null) break;

            val = val.next;
        }

        val.next = new Node(key);
     
    }
    
    public void remove(int key) {
        int index = getIndex(key);
        Node val = arr[index];
        Node prev = null;

        while (val != null) {

            if (val.value == key) {

                if (prev == null) {
                    arr[index] = val.next;
                } else {
                    prev.next = val.next;
                }

                return;
            }

            prev = val;
            val = val.next;
        }
    }
    
    public boolean contains(int key) {
        int index = getIndex(key);
        Node val = arr[index];

        while (val != null) {
            if (val.value == key) return true;        
            val = val.next;
        }

        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */