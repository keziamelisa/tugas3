package com.example.hadu3;

import com.example.hadu3.R;
import com.example.hadu3.SujuModel;

import java.util.ArrayList;

public class SujuData { private static String[] title = new String[]{"Donghae","Leeteuk","Siwon",
        "Ryeowook","Eunhyuk","Kyuhyun","Heechul"};


    private static int[] thumbnail = new
            int[]{R.drawable.img_donghae,R.drawable.img_leeteuk,
            R.drawable.img_siwon,R.drawable.img_ryeowook,R.drawable.img_eunhyuk,R.drawable.img_kyuhyun,
            R.drawable.img_heechul};

    public static ArrayList<SujuModel> getListData(){
        SujuModel sujuModel = null;
        ArrayList<SujuModel> list = new ArrayList<>(); for (int i = 0; i <title.length; i++){ sujuModel = new SujuModel(); sujuModel.setLambang(thumbnail[i]); sujuModel.setNama(title[i]); list.add(sujuModel); }
        return list;
    }
}

