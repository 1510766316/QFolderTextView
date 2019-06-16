package com.example.qfoldertextview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.qfoldertextview.view.QFolderTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QFolderTextView tv1 = findViewById(R.id.tv_folder_1);
        tv1.setText("qwertyuiopasdfghjklzxcvbnm0123456789qwertyuiopasdfghjklzxcvbnm0123456789qwertyuiopasdfghjklzxcvbnm0123456789", null);
        tv1.setForbidFold(false);
        tv1.setFoldLine(2);
        tv1.setEllipsize("");
        tv1.setUnfoldText(" 展开");
        tv1.setFoldColor(Color.parseColor("#FFB9CCFF"));

        QFolderTextView tv2 = findViewById(R.id.tv_folder_2);
        tv2.setText("qwertyuiopasdfghjklzxcvbnm0123456789qwertyuiopasdfghjklzxcvbnm0123456789qwertyuiopasdfghjklzxcvbnm0123456789", null);
        tv2.setForbidFold(true);
        tv2.setFoldLine(2);
        tv2.setEllipsize("...");
        tv2.setUnfoldText(" 查看更多");
        tv2.setFoldColor(Color.parseColor("#FFB9AAFF"));
        tv2.setFolderSpanClickListener(new QFolderTextView.IFolderSpanClickListener() {
            @Override
            public void onClick(boolean isFold) {
                Toast.makeText(getApplicationContext(), "设置了不可展开", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
