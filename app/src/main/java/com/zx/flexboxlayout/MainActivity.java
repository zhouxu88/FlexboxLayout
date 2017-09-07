package com.zx.flexboxlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.android.flexbox.FlexboxLayout;

public class MainActivity extends AppCompatActivity {

    String[] tags = {"婚姻育儿", "散文", "设计", "上班这点事儿", "影视天堂", "大学生活", "美人说", "运动和健身", "工具癖", "生活家", "程序员", "想法", "短篇小说", "美食", "教育", "心理", "奇思妙想", "美食", "摄影"};
    private FlexboxLayout flexboxLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flexboxLayout = (FlexboxLayout) findViewById(R.id.flexboxLayout);
        //动态添加子View
        for (int i = 0; i < tags.length; i++) {
            flexboxLayout.addView(getFlexboxLayoutItemView(i));
        }
    }

    //获取FlexboxLayout的子View
    private View getFlexboxLayoutItemView(int position) {
        View view = getLayoutInflater().inflate(R.layout.item_flex_box_layout, null, false);
        TextView itemTv = (TextView) view.findViewById(R.id.item_tv);
        itemTv.setText(tags[position]);
        return view;
    }
}
