//We need fast lookups and fast removals so hashmap
//LL instead of array because we dont need to resize
//The advantage of double linked list is that the node can remove itself without other reference 
//In addition, it takes constant time to add and remove nodes from the head or tail
//We need ordering, so we can put things in constant time and when we delete we pop it off the tail


class LRUCache {
    
    final Node head = new Node();
    final Node tail = new Node();
    int capacity;
    
    Map<Integer, Node> nodeMap;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        nodeMap = new HashMap<>();
        head.next = tail;
        tail.prev = head;
        
    }
    
    public int get(int key) {
        
        int result = -1;
        Node node = nodeMap.get(key);
        if(node != null) {
            result = node.val;
            remove(node);
            add(node);
            //remove and add just updates
        }
        
        return result;
        
    }
    
    public void put(int key, int value) {
        
        //first override if key already exists
        Node node = nodeMap.get(key);
        if(node != null) {
            remove(node);
            node.val = value;
            add(node);    
        }
        //if doesnt exist make a new one by first checking capacity
         else {
             
             if(nodeMap.size() == capacity) {
                 //remove the tail as we have reached capacity
                 nodeMap.remove(tail.prev.key);
                 remove(tail.prev); 
             }
             
             Node newNode = new Node();
             newNode.key = key;
             newNode.val = value;
             nodeMap.put(key, newNode);
             add(newNode);
             
         }
        
    }
    
    //Add to the front of the list
    public void add(Node node) {
        
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        
    }
    
    //remove from the end of the list
    public void remove(Node node) {
        
        Node nextNode = node.next;
        Node prevNode = node.prev;
        
        nextNode.prev = prevNode;
        prevNode.next = nextNode;
        
    }
    
    
    
    class Node {
        
        int key;
        int val;
        Node prev;
        Node next;
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */