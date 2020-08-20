package java_regular.data.type.collections.type.lists.stack_list.example2;

import Utils.CollectionHelper;

import java.util.Stack;

public class StackMain {
    static Stack<Integer> stack = new Stack<Integer>();

    public static void main (String[] args) {
        stackPush(stack);
        stackPop(stack);
        stackPush(stack);
        stackPeek(stack);
        stackSearch(stack, 2);
        stackSearch(stack, 6);
    }

    static void stackPush(Stack<Integer> stack) {
        // push()
        for(int i = 0; i < 5; i++){
            stack.push(i);
        }
        CollectionHelper.printCollection(stack, "Stack");
    }

    static void stackPop(Stack<Integer> stack) {
        // pop()
        System.out.println("\n\nPop stack: ");
        for(int i = 0; i < stack.size(); i++) {
            Integer poppedItem = (Integer) stack.pop();
            System.out.println(poppedItem);
        }
        CollectionHelper.printCollection(stack, "\nStack");
    }

    static void stackPeek(Stack<Integer> stack) {
        // peek()
        Integer itemOnTop = (Integer) stack.peek();
        System.out.println("\n\nStack top item: " + itemOnTop);
    }

    static void stackSearch(Stack<Integer> stack, int itemToSearch) {
        // search()
        System.out.print("\nSearching item \"" +itemToSearch+ "\"...");
        Integer foundItemIndex = (Integer) stack.search(itemToSearch);

        String searchResult = (foundItemIndex == -1 ? "Element not found": "Element is found at position " + foundItemIndex);
        System.out.println("\n\t" +searchResult);
    }
}
