import java.util.Objects;

class CustomHashMap<K, V> {
    // Entry class (linked list node)
    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 16; // default size
    private Entry<K, V>[] table;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        table = new Entry[capacity];
    }

    // Hash function
    private int getIndex(K key) {
        return Math.abs(Objects.hashCode(key)) % capacity;
    }

    // PUT method
    public void put(K key, V value) {
        int index = getIndex(key);
        Entry<K, V> newEntry = new Entry<>(key, value);

        // If no entry at bucket
        if (table[index] == null) {
            table[index] = newEntry;
            return;
        }

        // If bucket already has entries (handle collision by chaining)
        Entry<K, V> current = table[index];
        Entry<K, V> prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                // Update existing key
                current.value = value;
                return;
            }
            prev = current;
            current = current.next;
        }
        prev.next = newEntry; // Add new node at end of list
    }

    // GET method
    public V get(K key) {
        int index = getIndex(key);
        Entry<K, V> current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null; // Not found
    }

    // REMOVE method
    public void remove(K key) {
        int index = getIndex(key);
        Entry<K, V> current = table[index];
        Entry<K, V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    // For debugging
    public void display() {
        for (int i = 0; i < capacity; i++) {
            Entry<K, V> current = table[i];
            if (current != null) {
                System.out.print("Bucket " + i + ": ");
                while (current != null) {
                    System.out.print("[" + current.key + "=" + current.value + "] ");
                    current = current.next;
                }
                System.out.println();
            }
        }
    }
}
