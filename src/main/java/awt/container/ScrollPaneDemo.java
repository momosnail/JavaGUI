package awt.container;

import java.awt.*;

/**
 * 程序明明向 ScrollPane 容器中添加了 一个文本框和一个按钮，但只能看到 一个按钮，却看不到文本框 ，这是为什么 呢?
 * 这是因为ScrollPane 使用 BorderLayout 布局管理器的缘故，而 BorderLayout 导致了该容器中只有一个组件被显示出来 。
 */
public class ScrollPaneDemo {
    public static void main(String[] args) {
        // 1.创建Frame窗口对象
        Frame frame=new Frame("这里测试ScrollPane");

        // 2.创建ScrollPane对象，并且指定默认有滚动条
        ScrollPane scrollPane=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);

        // 3.往ScrollPane中添加组件
        scrollPane.add(new TextField("这是测试文本"));
        scrollPane.add(new Button("这是测试按钮"));

        // 4.把ScrollPane添加到Frame中
        frame.add(scrollPane);

        // 5.设置Frame到位置大小
        frame.setBounds(30,30,500,300);

        // 6.设置Frame可见
        frame.setVisible(true);

    }
}
