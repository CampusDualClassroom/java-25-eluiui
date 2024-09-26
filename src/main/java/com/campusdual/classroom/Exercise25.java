package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Smith");
        stack.push("Montessori");
        stack.push("Peralta");
        stack.push("House");
        return stack;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()) {
            String element = stack.pop();
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Stack<String> stack = createStack();
        System.out.println("Primero: " + stack.peek()+"\n");
        printAndEmptyStack(stack);
    }
}
