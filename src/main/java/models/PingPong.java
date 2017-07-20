package models;

import java.util.ArrayList;

public class PingPong {

    public ArrayList<Object> runPingPong(int countUpTo){
        ArrayList<Object> result = new ArrayList<Object>();
        for (int i = 1; i <= countUpTo; i++){
            if (i % 3 == 0 && i % 5 == 0){
                result.add("pingpong");
            } else if (i % 3 == 0){
                result.add("ping");
            } else if (i % 5 == 0){
                result.add("pong");
            } else {
                result.add(i);
            }
        }
        return result;
    }
}
