package Level7;

import java.util.ArrayList;

public class _208PalindromeLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

        public static void main(String[] args) {
            Node first = new Node(1);
            first.next = new Node(2);
            first.next.next = new Node(2);
            first.next.next.next = new Node(1);

            ArrayList<Integer> values = new ArrayList<>();

            Node current = first;

            while (current != null) {
                values.add(current.data);
                current = current.next;
            }

            int left = 0;
            int right = values.size() - 1;
            boolean palindrome = true;

            while (left < right) {

                if (!values.get(left).equals(values.get(right))) {
                    palindrome = false;
                    break;
                }

                left++;
                right--;
            }

            System.out.println("Palindrome: " + palindrome);
        }
    }

