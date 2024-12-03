package com.map;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap<K, V> {
	// implementaion of HashMap

	// Node calss
	static class Node<K, V> {
		K key;
		V value;

		public Node(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	// define buckets
	private LinkedList<Node>[] buckets;

	private int size = 10;
	int count = 0; // to handle increse the size hashtable

	// HashMap Constructor
	public HashMap() {
		buckets=new LinkedList[size]; // define initital size of bucket
		for (int i = 0; i < size; i++) {
			this.buckets[i] = new LinkedList<>();
		}
	}

	private int hashFunction(K key) {
		int bucketIndex = key.hashCode();
		// it retrun also -ve val
		return Math.abs(bucketIndex) % size;
		// to handle index in bet 0 to size-1
	}

	@SuppressWarnings("unchecked")
	public void put(K key, V value) {
		int bi = hashFunction(key); // retn bucket index
		int dataIndex = serachIndexLinkList(key, bi); // dataIndex of LinkList

		if (dataIndex == -1) {
			// key not exist then create new
			buckets[bi].add(new Node(key, value));
			count++;
		} else {
			// key is exist then update the value
			Node node = buckets[bi].get(dataIndex);
			node.value = value;
		}
		double lamda = (double) count / size;
		if (lamda > 2.0) {
			// rehashing function
			reHash();
		}

	}

	private void reHash() {

		LinkedList<Node>[] oldBuckets = buckets;
		buckets = new LinkedList[2 * size];

		// create new LL for rehash
		for (int i = 0; i < 2 * size; i++) {
			buckets[i] = new LinkedList<>();
		}

//		for(int i=0;i<buckets.length;i++) {
//          LinkedList<Node<K, V>>ll=oldBuckets[i];
//			//add old buckets in new
//			for(int j=0;j<ll.size();j++) {
//				Node node=ll.get(i);
//				put(node.key,node.value);
//			}
//		}
		for (LinkedList<Node> ll : oldBuckets) {
			if (ll != null) {
				for (Node<K, V> node : ll) {
					put(node.key, node.value);
				}
			}
		}

	}

	private int serachIndexLinkList(K key, int bi) {

		LinkedList<Node> ll = buckets[bi];
		for (int i = 0; i < ll.size(); i++) {
			if (ll.get(i).key == key) // LL index found
			{
				return i;
			}
		}
		return -1; // LL index not
	}

	// all function

	public V get(K key) {
		int bi = hashFunction(key); // retn bucket index
		int dataIndex = serachIndexLinkList(key, bi); // dataIndex of LinkList

		if (dataIndex == -1) {
			// key not exist then return null
			return null;
		} else {
			// key is exist then return the value
			Node node = buckets[bi].get(dataIndex);
			return (V) node.value;
		}
	}

	public boolean containskey(K key) {
		int bi = hashFunction(key); // retn bucket index
		int dataIndex = serachIndexLinkList(key, bi); // dataIndex of LinkList

		if (dataIndex == -1) {
			// key not exist then return false
			return false;
		} else {
			// key is exist then return
			return true;
		}
	}

	public V remove(K key) {
		int bi = hashFunction(key); // retn bucket index
		int dataIndex = serachIndexLinkList(key, bi); // dataIndex of LinkList

		if (dataIndex == -1) {
			// key not exist then return null
			return null;
		} else {
			// key is exist then return the value
			Node node = buckets[bi].remove(dataIndex);

			return (V) node.value;
		}
	}

	public boolean isEmpty() {
		return count == 0; // no any
	}

	public ArrayList<K> keySet() {
		ArrayList<K> keys = new ArrayList<>();// first go bucket indet and next to last og LL till null 
		for (int bi = 0; bi < buckets.length; bi++) { // bucket index
			LinkedList<Node> ll = buckets[bi];
			for (int di = 0; di < ll.size(); di++) { // LL index
				Node node = ll.get(di);
				keys.add((K) node.key);
			}

		}
		return keys;
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer>map=new HashMap<>();
		map.put("India", 10);
		map.put("US", 8);
		map.put("Africa", 5);

		
		
		System.out.println(map.containskey("India"));
		System.out.println(map.get("US"));
	}
	
}
