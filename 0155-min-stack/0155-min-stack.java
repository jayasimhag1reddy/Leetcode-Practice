class MinStack {
    Node head;
    public MinStack() {
        head=null;
    }
    
    public void push(int val) {
        if(head==null){
            Node node=new Node(val,val);
            head=node;
        }
        else{
            int min=Math.min(val,head.min);
            Node node=new Node(val,min);
            head.next=node;
            node.prev=head;
            head=node;
        }
    }
    
    public void pop() {
        head=head.prev;
        // head.next=null;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}
class Node{
    int val;
    int min;
    Node next;
    Node prev;
    public Node(int val,int min){
        this.min=min;
        this.val=val;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */