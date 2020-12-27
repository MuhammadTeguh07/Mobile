package com.example.uts_mobile;

public class ExampleItem {
    private String mid;
    private int mImageResource1;
    private int mImageResource2;
    private String mText1;
    private String mText2;

    public ExampleItem(int imageResource1, int imageResource2, String text1, String text2){
        mImageResource1 = imageResource1;
        mImageResource2 = imageResource2;
        mText1 = text1;
        mText2 = text2;
    }

    public String getId(){
        return mid;
    }

    public int getmImageResource1(){
        return mImageResource1;
    }

    public int getmImageResource2(){
        return mImageResource2;
    }

    public String getmText1(){
        return mText1;
    }

    public String getmText2(){
        return mText2;
    }

}
