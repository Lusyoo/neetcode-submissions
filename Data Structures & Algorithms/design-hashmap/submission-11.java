class MyHashMap {
    private Node[] list;

    private static class Node {
        int key;
        int value;
        Node next;

        Node (int key, int value) {
            this.key = key;
            this.value = value;
            next = null;
        }
    }

    public MyHashMap() {
        list = new Node[1000];
    }

    private int hash(int key) {
        return key % list.length;
    }
    
    public void put(int key, int value) {
        int index = hash(key);
        Node el = list[index];
        Node prev = null;

        if (el == null) {
            list[index] = new Node(key, value);
            return;
        }


        while (el != null) {
            if (el.key == key) {
                el.value = value;
                return;
            }
            prev = el;
            el = el.next;
        }

        prev.next = new Node(key, value);
    }
    
    public int get(int key) {
        
        int index = hash(key);
        Node el = list[index];

        while (el != null) {

            if (el.key == key) {
                return el.value;
            }

            el = el.next;
        }

        return -1;
    }
    
    public void remove(int key) {
        int index = hash(key);
        Node el = list[index];
        Node prev = null;

        while (el != null) {
            if (el.key == key) {
                
                if (prev == null) {
                    if (el.next != null) {
                        list[index] = el.next;
                        return;
                    }
                    list[index] = null;
                } else {
                    prev.next = el.next;
                }
                return;
            }

            prev = el;
            el = el.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */