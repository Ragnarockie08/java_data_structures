package hash_table;

public class HashNode<K, V> {

    private K key;
    private V value;

    HashNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public String toString(){

        return String.format("%s=%d", this.getKey(), this.getValue());
    }

}
