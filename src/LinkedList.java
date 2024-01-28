public class LinkedList {
    private Node head;
    private Integer length;

    public LinkedList() {
        head = null;
        length = 0;
    }

    private class Node {
        public Node next;
        public Integer data;

        public Node(Integer data) {
            this.next = null;
            this.data = data;
        }
    }

    public void add(Integer data) {
        Node newNode = new Node(data);
        ++length;

        if(null == head) {
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removeFirstOccurrance(Integer data) {

        Node current = head;
        Node previous = null;

        while(null != current) {
            if(current.data == data) {
                --length;
                System.out.println(String.format("Removing %d", data));
                // Remove at head
                if (null == previous) {
                    head = current.next;
                    return;
                } else {
                    previous.next = current.next;
                    return;
                }
            } else {
                previous = current;
                current = current.next;
            }
        }
        System.out.println("Nothing removed");
    }

    // Iterative
    // Removes all occurences with matching data field
    public void removeAllOccurances(Integer data) {

        // Holds number of removed occurances for output
        Integer removed = 0;

        Node current = head;
        Node previous = null;
        while(null != current) {
            if(current.data == data) {
                ++removed;
                --length;
                System.out.println(String.format("Removing %d", data));
                // Remove at head
                if (null == previous) {
                    head = current.next;
                    current = null;
                } else {
                    previous.next = current.next;
                    previous = current;
                    current = current.next;
                }

            } else {
                previous = current;
                current = current.next;
            }
        }

        if(removed > 0) {
            System.out.println(String.format("%d %ss removed", removed, data));
        } else {
            System.out.println("Nothing removed");
        }
    }

    public void print() {
        if(null == head) {
            System.out.println("List is empty");
        }

        Node current = head;
        while(null != current) {
            if(null == current.next)
                System.out.print(current.data + "\n");
            else
                System.out.print(current.data + ", ");
            current = current.next;
        }
    }
}