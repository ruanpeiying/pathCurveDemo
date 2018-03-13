package com.feixun.hu.pt;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity
{
    MySurfaceView view,view3;
    View viewItem;
    Button btn;
    RelativeLayout relative_words_curve;
    FrameLayout.LayoutParams mFrameLayoutParam;
    RelativeLayout.LayoutParams mRelativeLayoutParam,mRelativeBezier;
    RelativeLayout.LayoutParams mRLinearLayoutParam;
    LinearLayout linear_word_missionlist;
    ScrollView scrollView;
    Context mContext;
    RelativeLayout l1;
    int tag=10;
    int tag2=tag*100*3;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mContext = this;
//     view= new MySurfaceView(mContext);
//        setContentView(view);
//
        setContentView(R.layout.activity_word);
        u2();

    }

    private  View getRootView(Activity context)
    {
        return ((ViewGroup)context.findViewById(android.R.id.content)).getChildAt(0);
    }
    public void u2(){
//        view  = new DrawingWithBezierNo(this);
//setContentView(R.layout.activity_word);
//        RelativeLayout re =(RelativeLayout) findViewById(R.id.re);
////
////        linear_word_missionlist = (LinearLayout)findViewById(R.id.li);
////
//        linear_word_missionlist = new LinearLayout(this);
//        linear_word_missionlist.setOrientation(LinearLayout.VERTICAL);
//        mRelativeLayoutParam = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ScreenUtil.dip2px(mContext,tag2));
//        mRelativeLayoutParam.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
//        linear_word_missionlist.setLayoutParams(mRelativeLayoutParam);
//        mRelativeBezier = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ScreenUtil.dip2px(mContext,tag2));
//        mRelativeBezier.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
//        view.setLayoutParams(mRelativeBezier);
//        re.addView(view);
//        re.addView(linear_word_missionlist);
        setView2();

    }
    public void u1(){
//        view =new DrawingWithBezierNo(this);
//        view3 =new DrawingWithBezierNo(this);
//        scrollView = new ScrollView(this);
//        mContext = this;
////        mFrameLayoutParam = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT
////        );
//        setContentView(R.layout.activity_word_mission);
//        btn = new Button(this);
//        btn.setText("click");
//        relative_words_curve = (RelativeLayout)findViewById(R.id.relative_words_curve);
////        relative_words_curve.setLayoutParams(mFrameLayoutParam);
//        mRelativeLayoutParam = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ScreenUtil.dip2px(mContext,80));
//        mRLinearLayoutParam = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ScreenUtil.dip2px(mContext,80)*tag);
//        mRLinearLayoutParam.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
//        mRelativeBezier = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ScreenUtil.dip2px(mContext,80*tag));
//        mRelativeBezier.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
//        mRelativeLayoutParam.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
//        view.setLayoutParams(mRelativeBezier);
////        view3.setLayoutParams(mRelativeBezier);
//        view3.setBackgroundColor(Color.RED);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setView();
//
//            }
//        });
//        relative_words_curve.addView(view);
////        relative_words_curve.addView(view3);
//        linear_word_missionlist = new LinearLayout(this);
//        linear_word_missionlist.setOrientation(LinearLayout.VERTICAL);
//        linear_word_missionlist.setLayoutParams(mRLinearLayoutParam);
////        relative_words_curve.addView(linear_word_missionlist);
////        scrollView.setLayoutParams(mRelativeBezier);
//        btn.setLayoutParams(mRelativeLayoutParam);
//        relative_words_curve.addView(linear_word_missionlist);
//        relative_words_curve.addView(btn);
    }
    @Override
    protected void onResume() {
        super.onResume();
        ViewGroup v = (ViewGroup)getRootView((Activity)mContext);
        ScrollView s =(ScrollView) v.getChildAt(0);
        System.gc();
    }
    public void setView(){
//        Integer x1=ScreenUtil.getScreenWidth(this)/2,y=0;
//        List<PositionXY> listXy = new ArrayList<>();
//        List<PositionXY> listXy2 = new ArrayList<>();
//        PositionXY xy;
//        ArrayList<Integer> list = new ArrayList<>();
//        // f=15 29
//        int f=9;
//        for(int i=0;i<17;i++){
//            list.add(f-=1);
//        }
//        ArrayList<Integer> list2 = list;
//        ArrayList<Integer> list3 = new ArrayList<>();
//        for(int i=list.size()-1;i>=0;i--){
//            list2.add(list.get(i));
//        }
//
//        for(int i=list2.size()-1;i>=0;i--){
//            x1-=list2.get(i);
//            list3.add(x1);
//        }
//        view.touchMove(x1,0);
//        while (true){
//            if(y>=(ScreenUtil.dip2px(mContext,tag2)))
//                break;
//            for(int i=0; i < list3.size(); i++){
//                if(y>=(ScreenUtil.dip2px(mContext,tag2)))
//                    break;
//                y += 15;
//                int py=y;
////                if(py >=0) {
////                    py=0;
////                }else if(py<= -(ScreenUtil.dip2px(mContext,1350) - ScreenUtil.getScreenHeight(this))) {
////                    py = -(ScreenUtil.dip2px(mContext,1350) - ScreenUtil.getScreenHeight(this));
////                }
//
////                if (py >= 320) {
////                    if (py >= 10 && py <= 20) {
////                        y -= 15;
////                    } else {
////                        py += 15;
////                    }
////                } else {
////                    py += 15;
////                }
//
////                y+ (i * 15);
//                view.touchMove(list3.get(i), y);
//                xy = new PositionXY(list3.get(i),y);
//                listXy.add(xy);
//
//            }
//        }
//        Log.e("highX",x1+"");
//        Log.e("highY",y+"");
////        while (true){
////            if(y>=(ScreenUtil.dip2px(mContext,80)*tag*2))
////                break;
////            for(int i=0; i < list3.size(); i++){
////                if(y>=(ScreenUtil.dip2px(mContext,80)*tag*2))
////                    break;
////                view3.touchMove(list3.get(i),y+=15);
////                xy = new PositionXY(list3.get(i),y);
////                listXy.add(xy);
////
////            }
////}
//        int guanqia = listXy.size()/tag;
//        for(int i=1;i<tag+1;i++){
//            if((guanqia*tag)>=listXy.size())
//                break;
//            listXy.add(listXy.get(guanqia * tag));
//            View viewItem2 = LayoutInflater.from(mContext).inflate(R.layout.item_mission_view,null);
//            LinearLayout.LayoutParams test;
//            test = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ScreenUtil.dip2px(mContext,80));
//            test.setMargins((ScreenUtil.getScreenWidth(this)-listXy.get(guanqia * i).getX_coordinate()-100),0,0,0);
//            viewItem2.setLayoutParams(test);
//            linear_word_missionlist.addView(viewItem2);
//        }
//        Log.e("high", listXy2.size() + "");
    }
    public void setView2(){
        float x1=ScreenUtil.getScreenWidth(this)/2,y=0;
        final List<PositionXY> listXy = new ArrayList<>();
        final List<PositionXY> listXy2 = new ArrayList<>();
        PositionXY xy;
        ArrayList<Integer> list = new ArrayList<>();
        int f=9;
        for(int i=0;i<17;i++){
            list.add(f-=1);
        }
        ArrayList<Integer> list2 = list;
        ArrayList<Float> list3 = new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            list2.add(list.get(i));
        }

        for(int i=list2.size()-1;i>=0;i--){
            x1-=list2.get(i);
            list3.add(x1);
        }
//        view.touchMove(x1,0.0);
        while (true){
            if(y>tag2)
                break;
            for(int i=0; i < list3.size(); i++){
                if(y>tag2)
                    break;
                y += 20;
                view.touchMove(list3.get(i), y);
                xy = new PositionXY(list3.get(i),y);
                listXy.add(xy);

            }
        }
//        for(int g=0;g<tag2/20;g++){
//            xy = new PositionXY(list3.get(i),y);
//
//            listXy.add(xy);
//        }
//        int space = 300/20;
//
//        for(int i=1;i<tag+1;i++){
//            int pyl = listXy.get(space * i - 1 - 2).getX_coordinate()-ScreenUtil.dip2px(mContext, 25);
//            View viewItem2 = LayoutInflater.from(this).inflate(R.layout.item_mission_view,null);
//            ImageView viewd = (ImageView)viewItem2.findViewById(R.id.img_words_missio_item);
//            RelativeLayout.LayoutParams test;
//            test = new RelativeLayout.LayoutParams(ScreenUtil.dip2px(this,50),ScreenUtil.dip2px(mContext,50));
//            LinearLayout.LayoutParams test2;
//            test2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ScreenUtil.dip2px(mContext,100));
//            test.setMargins(pyl, 0, 0, 0);
//            test.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM,RelativeLayout.TRUE);
//            viewd.setLayoutParams(test);
//            viewItem2.setLayoutParams(test2);
//            linear_word_missionlist.addView(viewItem2);
//        }
//        Log.e("listXySize",listXy+"");
//
//        final int lastyy=0;
//        scrollView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                if(event.getAction()==MotionEvent.ACTION_MOVE){
//                    listXy2.clear();
//                    int yy = scrollView.getScrollY();
//
//                    Log.e("scroll",yy+"");
//                    if(yy==0&&lastyy==0){
//                        return false;
//                    }else
//                    {
//                        if(yy>0&&yy!=lastyy){
//                            for(int i=yy;i<yy+ScreenUtil.getScreenHeight(mContext)-1;i++){
//                                if(i==7200)
//                                    break;
//                                PositionXY xy=listXy.get(i);
////                                xy.setX_coordinate(xy.getX_coordinate()-yy);
//                                xy.setY_coordinate(xy.getY_coordinate()-yy);
//                                listXy2.add(listXy.get(i));
//
//                            }
//                            view.mPath.reset();
//                            for(int h=0;h<listXy2.size();h++){
//                                view.touchMove(listXy2.get(h).getX_coordinate(),listXy2.get(h).getY_coordinate());
//                            }
//
//                        }
//                    }
//                }
//                return false;
//            }
//        });
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
//        Log.e("high", view.getHeight() + "");
//        Log.e("highscrollView",scrollView.getHeight()+"");
    }

}