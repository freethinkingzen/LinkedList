public class Main {
    public static void main(String[] args) {

        final String hr = "====================================";
        // Empty List
        System.out.println("ATTEMPT TO REMOVE FROM EMPTY LIST\n" + hr);
        LinkedList list1 = new LinkedList();
        list1.removeAllOccurances(1);
        System.out.print("RESULT: ");
        list1.print();
        System.out.println("EXPECTED: List is empty");

        // Remove match at head and add new node to test
        System.out.println("\nREMOVE MATCH AT HEAD, ADD NODE TO TEST POINTER\n" + hr);
        LinkedList list2 = new LinkedList();
        list2.add(1);
        System.out.print("RESULT: ");
        list2.print();
        System.out.println("EXPECTED: 1");
        list2.removeAllOccurances(1);
        System.out.print("RESULT: ");
        list2.print();
        System.out.println("EXPECTED: List is empty");
        list2.add(2);
        System.out.print("RESULT: ");
        list2.print();
        System.out.println("EXPECTED: 2");

        // Remove match at tail and add new node to test
        System.out.println("\nREMOVE MATCH AT TAIL, ADD NODE TO TEST POINTER\n" + hr);
        LinkedList list3 = new LinkedList();
        list3.add(1);
        list3.add(2);
        System.out.print("RESULT: ");
        list3.print();
        System.out.println("EXPECTED: 1, 2");
        list3.removeAllOccurances(2);
        System.out.print("RESULT: ");
        list3.print();
        System.out.println("EXPECTED: 1");
        list3.add(3);
        System.out.print("RESULT: ");
        list3.print();
        System.out.println("EXPECTED: 1, 3");

        // 

    }
}