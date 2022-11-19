package list;

import java.util.LinkedList;

public class List02 {
    public static void main(String[] args) {
        //add method
        linkedListAdd();
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        //remove method
        linkedLIstRemove();
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        //check empty or not
        linkedListEmpty();
    }

    //determine the linkedlist is empty or not
    private static void linkedListEmpty() {
        //if the linkedlist is not empty, delete its first element
        LinkedList<String> strings = new LinkedList<>();
        if (!strings.isEmpty()) {
            // adding code starting
        	
            // Remove the first element from the list.
            strings.pop();
        	
        	// adding code ending
        }
        System.out.println("It is empty..");
    }

    //LinkedList remove method
    private static void linkedLIstRemove() {
        //1.removeFirst()
        //2.removeLast()
        //3.pop()
        //4.remove()
        LinkedList<String> strings = new LinkedList<>();
        strings.add("James");
        strings.add("Monica");
        strings.add("Leslie");
        strings.push("The first");
        strings.push("The first");
        System.out.println(strings);
        System.out.println("-------------------------------");
        
        //pop removeFirst remove the first element
        // adding code starting
        
        // Remove the first element using pop().
        strings.pop();

        // Remove the first element using removeFirst().
        strings.removeFirst();

        // Print the list and a spacer line.
        System.out.println(strings);
        System.out.println("-------------------------------");
        
        // adding code ending
        
        //removeLast remove the last element
        // adding code starting
        
        // Add "The last" to the end of the list.
        strings.addLast("The last");

        // Print the list and a spacer line.
        System.out.println(strings);
        System.out.println("-------------------------------");

        // Remove the last element of the list.
        strings.removeLast();
        
        // Print the list and a spacer line.
        System.out.println(strings);
        System.out.println("-------------------------------");
        
        // adding code ending

    }

    //LinkedList add method
    private static void linkedListAdd() {
        //1.addFirst: add an element at the beginning
        //2.addLast: add an element at the end
        //3.push: add an element on the top of a stack
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers);
        System.out.println("-------------------------------");
        System.out.println("add an element at the end:");
        // adding code starting
        
        // Add 33 and 3333 to the end of the list and print the list.
        integers.addLast(33);
        integers.addLast(3333);
        System.out.println(integers);

        // Print messages relevant to adding elements to the beginning of the list.
        System.out.println("-------------------------------");
        System.out.println("add an element at the beginning");

        // Add 333 to the beginning of the list and print the list.
        integers.addFirst(333);
        System.out.println(integers);

        // Add 33333 to the beginning of the list and print the list.
        integers.push(33333);
        System.out.println(integers);
        
        // Print a line to the screen.
        System.out.println("-------------------------------");
        
        // adding code ending

    }
}

