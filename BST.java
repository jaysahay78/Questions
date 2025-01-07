package com.company;

class BST {
    private static class Node{
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }

    private Node root;

    public int height (Node node){
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }
    //insertion
    public void insert(int value){
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value){
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }


    public void populate(int[] nums){
        for (int i =0; i<nums.length; i++){
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end){
        if (start >= end){
            return;
        }
        int mid = start + (end - start) / 2;

        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if (node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(this.root, "Root node : ");
    }
    private void display(Node node, String details){
        if (node == null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    public static void main(String[] args) {
        BST tree1 = new BST();
        BST tree2 = new BST();
        int[] nums1 = {1,2,3,4,5,6,7,8,9,10};
        tree1.populateSorted(nums1);
        tree1.display();
        System.out.println('\n');
        int[] nums2 = {5, 6, 7, 1, 2, 3, 4, 9, 8, 10};
        tree2.populate(nums2);
        tree2.display();
    }
}
