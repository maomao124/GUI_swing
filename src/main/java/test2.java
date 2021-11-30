import javax.swing.*;
import java.awt.*;

/**
 * Project name(项目名称)：GUI之swing
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/30
 * Time(创建时间)： 13:16
 * Version(版本): 1.0
 * Description(描述)：
 * JPanel类的常用方法
 * 方法名及返回值类型	说明
 * Component add(Component comp)	将指定的组件追加到此容器的尾部
 * void remove(Component comp)	从容器中移除指定的组件
 * void setFont(Font f)	设置容器的字体
 * void setLayout(LayoutManager mgr)	设置容器的布局管理器
 * void setBackground(Color c)	设置组件的背景色
 */

public class test2
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("测试2");
        jFrame.setBounds(200, 200, 1280, 720);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("O(∩_∩)O哈哈~");
        Font font = new Font("123", 4, 35);
        jLabel.setFont(font);
        jPanel.setBackground(Color.cyan);
        jPanel.add(jLabel);
        //jFrame.add(jLabel);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
