package com.londonappbrewery.destini;

/**
 * Created by houcine on 04/06/2017.
 */

public class Destini {
    private int mT_StoryID;
    private  int mT_Ans1ID;
    private  int mT_Ans2ID;

    public Destini(int T_storyID,int T_Ans1ID,int T_Ans2ID){
        mT_StoryID = T_storyID;
        mT_Ans1ID = T_Ans1ID;
        mT_Ans2ID = T_Ans2ID;
    }

    public int getT_StoryID() {
        return mT_StoryID;
    }

    public void setT_StoryID(int t_StoryID) {
        mT_StoryID = t_StoryID;
    }

    public int getT_Ans1ID() {
        return mT_Ans1ID;
    }

    public void setT_Ans1ID(int t_Ans1ID) {
        mT_Ans1ID = t_Ans1ID;
    }

    public int getT_Ans2ID() {
        return mT_Ans2ID;
    }

    public void setT_Ans2ID(int t_Ans2ID) {
        mT_Ans2ID = t_Ans2ID;
    }
}
