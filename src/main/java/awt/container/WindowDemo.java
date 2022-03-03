package awt.container;

import java.awt.*;

public class WindowDemo {
    public static void main(String[] args) {
        // 1.创建创后对象
        Frame frame = new Frame("这是第一个窗口容器");

        // 2.设置窗口位置和大小
        frame.setBounds(100, 100, 500, 300);

        // 3.设置窗口可见
        frame.setVisible(true);
    }
}
