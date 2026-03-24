package com.DSA.internalimpl.collection;

public class CustomLinkeList {
	CustomNode head;
	int index = 0;

	class CustomNode {
		Object data;
		CustomNode next;
		int nodeIndex;

		// this is for my purpose for insert1 method
		public CustomNode(Object ele) {
			data = ele;
		}

		public CustomNode(Object ele, int index) {
			data = ele;
			nodeIndex = index;
		}
	}

	public void insert(Object ele) {
		CustomNode customNode = new CustomNode(ele, index);
		if (head == null)
			head = customNode;
		else {
			CustomNode n = head;
			while (n.next != null) {

				n = n.next;
			}
			n.next = customNode;

			index++;
		}

	}

	public void insert1(Object ele) {
		CustomNode customNode = new CustomNode(ele);
		if (head == null)
			head = customNode;
		else {
			head.next = customNode;
		}
	}

	@Override
	public String toString() {
		// return "CustomLinkeList [" + head.data + ","+head.next.data+"]";
		StringBuilder builder = new StringBuilder();
		CustomNode n = head;
		builder.append("[");
		builder.append(head.data);
		while (n.next != null) {
			n = n.next;
			builder.append(", " + n.data);
		}
		builder.append("]");
		return builder.toString();
	}

	public Object get(int index) {
		CustomNode temp = head;
		while (temp.next != null) {
			if (temp.nodeIndex == index) {
				return temp.data;
			} else {
				temp = temp.next;
			}

		}
		return temp; 

	}
	/*public void insertAtParticularIndex(Object data, int indexToPlace) {
		CustomNode temp = head;
		while (temp.next != null) {
			if(temp.data==data) {
				t
			} else {
				temp = temp.next;
			}
		}
		
	}*/

}
