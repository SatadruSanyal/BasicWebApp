package com.develogical;

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
        return "";
    }
}
