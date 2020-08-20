package java_regular.data.type.collections.type.lists.stack_list.example1;

import Utils.CollectionHelper;

import java.util.Iterator;
import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("A1");
        stack.push("A2");
        stack.push("A3");
        stack.push("A4");
        CollectionHelper.printCollection(stack, "Stack");

        // Iterator for the stack
        Iterator<String> itr = stack.iterator();

        System.out.println("\n\nPop last item...");
        stack.pop();

        // Iterator for the stack
        itr = stack.iterator();
        CollectionHelper.printCollection(itr, "Stack");
    }
}
