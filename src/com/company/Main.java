package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("List A");
        ArrayList<Phone> arrA = new ArrayList<>(5);
        System.out.println("Enter 5 smartphone labels:");
        arrA.add(new Phone(scanner.next()));
        arrA.add(new Phone(scanner.next()));
        arrA.add(new Phone(scanner.next()));
        arrA.add(new Phone(scanner.next()));
        arrA.add(new Phone(scanner.next()));

        Iterator<Phone> iteratorA = arrA.iterator();
        System.out.println("------------------------");
        while(iteratorA.hasNext()){
            Phone phone = iteratorA.next();
            System.out.println(phone.getName());
        }

        System.out.println("------------------------");
        System.out.println("List B");
        ArrayList<Model> arrB = new ArrayList<>(5);
        System.out.println("Enter 5 smartphone's model(only numbers):");
        arrB.add(new Model(scanner.nextInt()));
        arrB.add(new Model(scanner.nextInt()));
        arrB.add(new Model(scanner.nextInt()));
        arrB.add(new Model(scanner.nextInt()));
        arrB.add(new Model(scanner.nextInt()));

        Iterator<Model> iteratorB = arrB.iterator();
        System.out.println("------------------------");
        while(iteratorB.hasNext()){
            Model model = iteratorB.next();
            System.out.println(model.getModelId());
        }

        System.out.println("------------------------");
        System.out.println("List C");
        ArrayList<?> arrC = new ArrayList<>();
        arrA.addAll(arrB);
        print();

        Object[] arrC = new Object[arrA.size()];
        arrA.toArray(arrC);
        System.out.println(Arrays.toString(arrC));
        Iterator<?> iteratorC = arrC.iterator();
        System.out.println("------------------------");
        while(iteratorC.hasNext()){
            System.out.println(iteratorC.next());
        }

    }

    public static void print(ArrayList<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
