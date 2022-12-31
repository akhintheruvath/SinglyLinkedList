public class Runner {
    public static void main(String[] args) {
        LinkedListImplementation li = new LinkedListImplementation();
        li.addAtBeginning(10);
        li.append(20);
        li.append(30);
        li.append(40);
        li.append(50);
        li.addAtPosition(6, 60);
        li.display();
        li.reverse();
        li.display();
        System.out.println("Length of the linked list is " + li.length());
    }
}