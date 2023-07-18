class LRUCache extends LinkedHashMap<Integer, Integer>{
    private int capacity;
    public LRUCache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) { return size() > capacity; }
    public void put(int key, int value) { super.put(key, value); }
    public int get(int key) { return super.getOrDefault(key, -1); }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */