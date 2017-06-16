package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mButtonTop;
    Button mButtonBottom;
    TextView mTextView;
    int mStoryIndex = 1;
    private Destini[] mDestini = new Destini[]{
            new Destini(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new Destini(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new Destini(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
            new Destini(R.string.T4_End,R.string.Default_Ans,R.string.Default_Ans),
            new Destini(R.string.T5_End,R.string.Default_Ans,R.string.Default_Ans),
            new Destini(R.string.T6_End,R.string.Default_Ans,R.string.Default_Ans)
    };

//private TrueFalse[] mQuestionBank = new TrueFalse[] {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        if(savedInstanceState!=null){
//            mTextView.setText(savedInstanceState.getString("textViewKey"));
//            mButtonTop.setText(savedInstanceState.getString("ButtonTopKey"));
//            mButtonBottom.setText(savedInstanceState.getString("buttonBottomKey"));
//        }


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mTextView = (TextView) findViewById(R.id.storyTextView);

//        if(savedInstanceState!=null){
//            mTextView.setText(savedInstanceState.getString("textViewKey"));
//            mButtonTop.setText(savedInstanceState.getString("ButtonTopKey"));
//            mButtonBottom.setText(savedInstanceState.getString("ButtonBottomKey"));
//        }

        if(savedInstanceState!=null){
            mTextView.setText(savedInstanceState.getCharSequence("textViewKey"));
            mButtonTop.setText(savedInstanceState.getCharSequence("ButtonTopKey"));
            mButtonBottom.setText(savedInstanceState.getCharSequence("ButtonBottomKey"));
        }


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//                mTextView.setText(mDestini[2].getT_StoryID());
//                mButtonTop.setText(mDestini[2].getT_Ans1ID());
//                mButtonBottom.setText(mDestini[2].getT_Ans2ID());
//                Toast.makeText(getApplicationContext(),"T1_Ans1 is clicked",Toast.LENGTH_SHORT).show();

            if(mButtonTop.getText() == getString(mDestini[0].getT_Ans1ID())){
                mTextView.setText(mDestini[2].getT_StoryID());
                mButtonTop.setText(mDestini[2].getT_Ans1ID());
                mButtonBottom.setText(mDestini[2].getT_Ans2ID());
                Toast.makeText(getApplicationContext(),"T1_Ans1 is clicked",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(mButtonTop.getText() == getString(mDestini[2].getT_Ans1ID())){
                        mTextView.setText(mDestini[5].getT_StoryID());
                        mButtonTop.setVisibility(View.GONE);
                        mButtonBottom.setVisibility(View.GONE);
                        Toast.makeText(getApplicationContext(),"T3_Ans1 is clicked",Toast.LENGTH_SHORT).show();
                        }
                    else{
                        if (mButtonTop.getText() == getString(mDestini[1].getT_Ans1ID())){
                            mTextView.setText(mDestini[2].getT_StoryID());
                            mButtonTop.setText(mDestini[2].getT_Ans1ID());
                            mButtonBottom.setText(mDestini[2].getT_Ans2ID());
                            Toast.makeText(getApplicationContext(),"T2_Ans1 is clicked",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
//                Log.d("id of mTextView", "id =" +mTextView.getText());
//                Log.d("id of mDestini[0].get","id ="+getString(mDestini[0].getT_StoryID()));
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//                mTextView.setText(mDestini[1].getT_StoryID());
//                mButtonTop.setText(mDestini[1].getT_Ans1ID());
//                mButtonBottom.setText(mDestini[1].getT_Ans2ID());
//                Toast.makeText(getApplicationContext(),"T1_Ans1 is clicked",Toast.LENGTH_SHORT).show();
                if(mButtonBottom.getText() == getString(mDestini[0].getT_Ans2ID()) ){
                    mTextView.setText(mDestini[1].getT_StoryID());
                    mButtonTop.setText(mDestini[1].getT_Ans1ID());
                    mButtonBottom.setText(mDestini[1].getT_Ans2ID());
                    Toast.makeText(getApplicationContext(),"T1_Ans2 is clicked",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(mButtonBottom.getText() == getString(mDestini[1].getT_Ans2ID())){
                        mTextView.setText(mDestini[3].getT_StoryID());
                        mButtonTop.setVisibility(View.GONE);
                        mButtonBottom.setVisibility(View.GONE);
                        Toast.makeText(getApplicationContext(),"T2_Ans2 is clicked",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        if (mButtonBottom.getText() == getString(mDestini[2].getT_Ans2ID())){
                            mTextView.setText(mDestini[4].getT_StoryID());
                            mButtonTop.setVisibility(View.GONE);
                            mButtonBottom.setVisibility(View.GONE);
                            Toast.makeText(getApplicationContext(),"T3_Ans2 is clicked",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }

        });
    }
    @Override
    public void onSaveInstanceState(Bundle outstate){
//        super.onSaveInstanceState(outstate);
//        outstate.putString("textViewKey",mTextView.getText().toString());
//        outstate.putString("ButtonTopKey",mButtonTop.getText().toString());
//        outstate.putString("ButtonBottomKey",mButtonBottom.getText().toString());
        outstate.putCharSequence("textViewKey",mTextView.getText());
        outstate.putCharSequence("ButtonTopKey",mButtonTop.getText());
        outstate.putCharSequence("ButtonBottomKey",mButtonBottom.getText());
        super.onSaveInstanceState(outstate);
    }


}

