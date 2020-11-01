package com.tonyngeno;

import com.tonyngeno.model.Box;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        init();
    }

    static void init() {
        Box container = new Box();
        Map<Integer, Box> packingBoxes = new HashMap<>();

        System.out.println("Enter Container dimensions\n");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the container:");
        container.setLength(in.nextDouble());
        in.nextLine();
        System.out.println("Enter the width of the container:");
        container.setWidth(in.nextDouble());
        in.nextLine();
        System.out.println("Enter the height of the container:");
        container.setHeight(in.nextDouble());
        in.nextLine();

        System.out.println("\n");

        //box sizes
        boolean isEnd = true;
        do {
            in = new Scanner(System.in);
            Box box = new Box();
            System.out.println("Enter Box length:");
            box.setLength(in.nextDouble());
            in.nextLine();
            System.out.println("Enter Box width:");
            box.setWidth(in.nextDouble());
            in.nextLine();
            System.out.println("Enter Box height:");
            box.setHeight(in.nextDouble());
            in.nextLine();
            System.out.println("Enter Number of boxes of this size");

            int num = in.nextInt();
            in.nextLine();

            packingBoxes.put(num, box);

            System.out.println("Continue? y/n");
            String yN = in.nextLine();
            if (yN.toLowerCase().equalsIgnoreCase("n")) {
                isEnd = false;
            }
        } while (isEnd);

        Algorithm algorithm = new Algorithm(container, packingBoxes);
        System.out.println(algorithm.toString());
    }

}

