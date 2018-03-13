package com.feixun.hu.pt;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by ruanpeiying on 16/7/14.
 * 关卡页面
 */
public class MissionAvtivity extends Activity {
    LinearLayout mLinear_word_missionlist;
    ScrollView mScrollView_word_miss;
    RelativeLayout mRelative_words_curve;
    ArrayList<Integer> list;
    DrawingWithBezierNo mDrawingWithBezier;
    FrameLayout.LayoutParams mFrameLayoutParam;
    RelativeLayout.LayoutParams mRelativeLayoutParam,mRelativeBezier;
    LinearLayout.LayoutParams mRLinearLayoutParam;
    ArrayList<PositionXY> mListXy = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new  DrawingWithBezier(this));
        mScrollView_word_miss = (ScrollView)findViewById(R.id.scrollView_word_miss);
        mRelative_words_curve = (RelativeLayout)findViewById(R.id.relative_words_curve);
        mDrawingWithBezier = new DrawingWithBezierNo(this);

         setMissionView();
    }



    public void setMissionView(){
//        int x = ScreenUtil.dip2px(mContext,30);
//        int y = ScreenUtil.dip2px(mContext,60);
        int gg=80*3*92;
        mFrameLayoutParam = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,gg);
        mRelativeLayoutParam = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,gg);
        mRLinearLayoutParam = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,gg);
        mRelativeBezier = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,gg);
        for(int i=0;i<92;i++){
//            PositionXY positionXY = new PositionXY(x+=ScreenUtil.dip2px(mContext,50),y+=ScreenUtil.dip2px(mContext,60));
//            mListXy.add(positionXY);
            View view_item_mission;
            TextView mText_words_index;
            view_item_mission = LayoutInflater.from(this).inflate(R.layout.item_mission_view,null);
            mText_words_index = (TextView)view_item_mission.findViewById(R.id.text_words_index);
            mText_words_index.setText("第"+(i+1)+"关");
//            mLinear_word_missionlist.addView(view_item_mission);
        }
//        mLinear_word_missionlist.setLayoutParams(mRelativeLayoutParam);
//        mLinear_word_missionlist.setBackgroundColor(Color.RED);
//        mRelative_words_curve.setLayoutParams(mFrameLayoutParam);
        mRelativeBezier.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
        mDrawingWithBezier.setLayoutParams(mRelativeBezier);
        // mDrawingWithBezier.touchDown(0,0);
//        mDrawingWithBezier.setLayoutParams(mRelativeLayoutParam);
//        mScrollView_word_miss.setLayoutParams(mRLinearLayoutParam);
        mDrawingWithBezier.setBackgroundColor(Color.BLACK);
        mRelative_words_curve.addView(mDrawingWithBezier);
//        for(int h=0;h<mListXy.size();h++){
//            mDrawingWithBezier.touchMove(mListXy.get(h).getX_coordinate(),mListXy.get(h).getY_coordinate());
//        }
        float x=10,y=10;
        boolean d=true;
        for(int i=200;i>0;i--){
            if(x>=439){
                d=true;
            }
            if(x<=254){
                d=false;            }
            if(d){
                x-=5;
            }else{
                x+=5;
            }
            y+=7;
//            mDrawingWithBezier.touchMove(x , y);
        }
    }

//    @Override
//    public void onWindowFocusChanged(boolean hasFocus) {
//        super.onWindowFocusChanged(hasFocus);
//        if(hasFocus){
//            Log.e("high", mLinear_word_missionlist.getHeight() + "");
//            Log.e("high", mScrollView_word_miss.getHeight() + "");
//            Log.e("high", mDrawingWithBezier.getHeight() + "");
//        }
//    }
}
