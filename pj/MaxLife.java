package com.heroquest.pj;

public interface MaxLife {

     static int maxLife(int level, int lifeByLevel) {
         return level * lifeByLevel;
    }
}
