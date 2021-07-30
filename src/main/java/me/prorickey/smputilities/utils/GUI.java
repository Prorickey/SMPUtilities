package me.prorickey.smputilities.utils;

import java.util.ArrayList;

public class GUI {

    public static ArrayList formatLore(String input, Integer length) {
        String[] split = input.split(" ");
        ArrayList output = new ArrayList();
        output.add("");
        for(var i = 0; i < split.length; i++) {
            int finalI = i;
            boolean c = false;
            for(var b = 0; b < output.size(); b++) {
                String a = output.get(b).toString();
                if(CharColor
                    StringBuilder builder = new StringBuilder();
                    builder.append(a);
                    builder.append(split[finalI]);
                    builder.append(" ");
                    a = builder.toString();
                    output.set(b, a);
                    c = true;
                }
            }

            if(!c) {
                output.add("");
                i--;
            }

        }

        return output;

    }

}
