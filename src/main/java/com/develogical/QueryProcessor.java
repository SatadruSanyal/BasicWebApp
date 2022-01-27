package com.develogical;

import java.util.Arrays;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("imperial")) {
            return "Imperial College is a university in London.";
        }

        if (query.toLowerCase().contains("dimsum")) {
            return "Dim sum is a large range of small Chinese dishes that are traditionally " +
                    "enjoyed in restaurants for brunch. Most dim sum dishes originated in " +
                    "China and are commonly associated with Cantonese cuisine, although dim sum " +
                    "dishes also exist in other Chinese cuisines.";
        }

        if (query.toLowerCase().contains("america")) {
            return "The United States of America is a country in the North American Continent.";
        }

        if (query.toLowerCase().contains("canada")) {
            return "Canada is the north most country in the North American Continent.";
        }

        if (query.toLowerCase().contains("your name")) {
            return "PingPong";
        }

        if (query.toLowerCase().contains("plus")) {
            String q = query.replaceAll("[A-Z|a-z]","");
            String[] nums =  q.split(" ");

            Integer sum = 0;
            for (String n : nums) {
                if (!n.equals("")) {
                    sum+= Integer.parseInt(n);
                }

            }
            String s = sum.toString();

            return s;
        }

        if (query.toLowerCase().contains("multiplied")) {
            String q = query.replaceAll("[A-Z|a-z]","");
            String[] nums =  q.split(" ");

            Long sum = 1l;
            for (String n : nums) {
                if (!n.equals("")) {
                    sum*= Long.parseLong(n);
                }

            }
            String s = sum.toString();

            return s;
        }

        if (query.toLowerCase().contains("largest")) {
            String q = query.replaceAll("[A-Z|a-z]","");
            String[] nums =  q.split(":");
            nums = nums[1].split(" ");

            Integer largest = 0;
            for (String n : nums) {
                if (!n.equals("")) {
                    largest = Math.max(largest, Integer.parseInt(n));
                }

            }
            return largest.toString();

        }

        if (query.toLowerCase().contains("who played james bond in the film dr no")) {
            return "Sean Connery";

        }

        if (query.toLowerCase().contains("what colour is a banana")) {
            return "yellow";

        }

        if (query.toLowerCase().contains("square and a cube")) {
            String q = query.replaceAll("[A-Z|a-z]","");
            String[] nums =  q.split(":");
            nums = nums[1].split(",");

            for (String n : nums) {
                if (!n.equals("")) {
                    int num = Integer.parseInt(n);
                    if (Math.sqrt(num)% 1 == 0 && Math.cbrt(num) % 1 == 0) {
                        return n;
                    }
                }

            }
            return "";

        }

        if (query.toLowerCase().contains("theresa may")) {

            return "2016";


        return "";
    }
}
