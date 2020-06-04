package com.heroquest;

import com.heroquest.dungeon.Salle;
import com.heroquest.pj.CommunPeople;

import java.util.ArrayList;

public class Verify {

    public boolean verifyType(CommunPeople aventurier,
                              int position,
                              ArrayList<Salle> plateaux) {
        boolean type = false;
        if (plateaux.get(position).getReward().getPour().equals(aventurier.getType())) {
            return type = true;
        }else{
            return type = false;
        }
    }
}
