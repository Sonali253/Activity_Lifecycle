package com.example.myapplication;

import java.util.ArrayList;

public class BaseballGameEx {

    public void program() {
        System.out.println("Hello, World!");
        String[] args = {"5", "-2","4", "C", "D", "9","+","+"};
        //String[] args = {"5", "2", "C", "D","+"};

        int result = 0;
        //int[]records = new int[];
        ArrayList<Integer> records = new ArrayList<Integer>();
        int len = args.length;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        //System.out.println("len"+len);

        for (int i = 0; i < len; i++) {
            System.out.println("i..." + i);
            try {
                if ((Long.parseLong(args[i]) >= min) || (Long.parseLong(args[i]) <= max)) {
                    records.add(Integer.parseInt(args[i]));
                    System.out.println("records1[]- " + records);
                    //System.out.println("result1..."+result);

                    //break;
                }
            } catch (Exception e) {
                //System.out.println(" It's  a String!!");

                if (args[i].equalsIgnoreCase("C")) {
                    records.remove(records.size() - 1);
                    System.out.println("records2[]- " + records);

                    //System.out.println("result2..."+result);

                    //break;
                }

                if (args[i].equalsIgnoreCase("D")) {
                    System.out.println("len..." + len);
                    int last = records.get(records.size()-1);
                    records.add(last * 2);
                    System.out.println("records3[]- " + records);

                    //System.out.println("result3..."+result);

                    //break;
                }


                if (args[i].equalsIgnoreCase("+")) {
                    records.add(records.get(records.size()-1) + records.get(records.size() - 2));
                    System.out.println("records4[]- " + records);

                    //System.out.println("result4..."+result);

                    // break;
                }
            }


        }

            for(int i =0; i<records.size(); i++){
                result = result + records.get(i);
            }
        System.out.println("result0..." + result);

    }
}
