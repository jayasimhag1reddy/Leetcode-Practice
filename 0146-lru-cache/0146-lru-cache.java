class LRUCache {
    HashMap<Integer,Node> hm;
    int count;
    int capacity;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        hm=new HashMap<>();
        count=0;
        this.capacity=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        head.prev=null;
        tail.next=null;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
            remove(hm.get(key));
            add(hm.get(key));
            return hm.get(key).val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            hm.get(key).val=value;
            remove(hm.get(key));
            add(hm.get(key));
        }
        else{
            Node node=new Node(key,value);
            hm.put(key,node);
            if(count<capacity){
                count++;
                add(node);
            }
            else{
                hm.remove(tail.prev.key);
                remove(tail.prev);
                add(node);
            }
        }
    }
    public void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void add(Node node){
        Node temp=head.next;
        head.next=node;
        node.prev=head;
        node.next=temp;
        temp.prev=node;
    }
}
class Node{
    int key;
    int val;
    Node prev;
    Node next;
    public Node(int key,int val){
        this.key=key;
        this.val=val;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */