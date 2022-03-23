package awt.container;

import java.awt.*;

public class BorderLayoutDemo2 {
    public static void main(String[] args) {
        Frame frame=new Frame("这里测试BorderLayout");

        // 1.给frame设置BorderLayout布局管理器
        frame.setLayout(new BorderLayout(30,10));

        // 2.往frame的指定区域添加组件
        frame.add(new Button("北侧按钮"),BorderLayout.NORTH);
        frame.add(new Button("南侧按钮"),BorderLayout.SOUTH);

        /*frame.add(new Button("中间按钮"),BorderLayout.CENTER);
        frame.add(new TextField("测试文本框")); //会覆盖Center区域的Button*/

        Panel panel=new Panel(); //Panel的默认布局管理器是FlowLayout
        panel.add(new Button("button"));
        panel.add(new TextField("textField"));

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
