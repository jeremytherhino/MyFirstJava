class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Node<Integer> node = new Node<Integer>(5);
        node.setNext(new Node<Integer>(1));
        System.out.println("My Node:" + node);
    }
}