public class Main {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        System.out.println("element 4 is " + listInteger.get(4));
        System.out.println("element 5 is " + listInteger.get(5));
        System.out.println("element 3 is " + listInteger.get(3));
        listInteger.add(7);
        System.out.println("element 7 is " + listInteger.get(6));
    }
}
