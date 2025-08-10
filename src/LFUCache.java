import java.util.HashMap;

public class LFUCache {
    final int capacity;
    int curSize;
    int minFreq;
    HashMap<Integer, DllNode> cache = new HashMap<>();
    HashMap<Integer, DoubleLinkedList> freqMap = new HashMap<>();

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.curSize = 0;
        this.minFreq = 0;
        this.cache = new HashMap<>();
        this.freqMap = new HashMap<>();
    }

    public int get(int key) {
        DllNode node = cache.get(key);
        if(node == null) return -1;

        updateNode(node);
        return node.val;
    }


    public void put(int key, int value) {
        if(capacity == 0) return;

        if(cache.containsKey(key)){
            DllNode node = cache.get(key);
            node.val = value;
            updateNode(node);
        }
        else{
            if(curSize == capacity){
                DoubleLinkedList list = freqMap.get(minFreq);
                cache.remove(list.tail.prev.key);
                freqMap.get(minFreq).removeNode(list.tail.prev);
                curSize--;
            }
            curSize++;
            minFreq = 1;
            DoubleLinkedList list = new DoubleLinkedList();
            if(freqMap.containsKey(minFreq)){
                list = freqMap.get(minFreq);
            }
            DllNode node = new DllNode(key, value);
            list.addNode(node);
            cache.put(node.key, node);
            freqMap.put(minFreq, list);
        }
    }

    public void updateNode(DllNode node){
        int freq = node.count;
        DoubleLinkedList list = freqMap.get(node.count);
        list.removeNode(node);

        if(freq == minFreq && list.size == 0){
            minFreq++;
        }

        node.count++;
        DoubleLinkedList newList = freqMap.getOrDefault(node.count, new DoubleLinkedList());
        newList.addNode(node);
        freqMap.put(node.count, newList);

    }

    class DllNode{
        DllNode prev, next;
        int key, val, count;

        public DllNode(int key, int val){
            this.key = key;
            this.val = val;
            this.count = 1;
        }
    }

    class DoubleLinkedList{
        int size;
        DllNode head;
        DllNode tail;

        public DoubleLinkedList(){
            this.size = 0;
            this.head = new DllNode(0,0);
            this.tail = new DllNode(0,0);
            head.next = tail;
            tail.prev = head;
        }

        public void addNode(DllNode node){
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
            node.prev = head;
            size++;
        }

        public void removeNode(DllNode node){
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */