package com.zph.weibo360panorama;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zph.glpanorama.GLPanorama;


/**
 * Created by 張鵬輝 on 2017/8/29.
 *
 * E-mail: 1344670918@qq.com
 *
 * CSDN: http://blog.csdn.net/QingTianGG
 *
 * 有问题欢迎随时来找我共同解决
 */

public class MainActivity extends AppCompatActivity {
    private GLPanorama mGLPanorama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGLPanorama= (GLPanorama) findViewById(R.id.mgl);
        //传入全景图片
        mGLPanorama.setGLPanorama(R.drawable.imggugong);
    }


}
