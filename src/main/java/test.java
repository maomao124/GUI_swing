import javax.swing.*;
import java.awt.*;

/**
 * Project name(项目名称)：GUI之swing
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/30
 * Time(创建时间)： 13:07
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test extends JFrame
{
    public test()
    {
        setTitle("测试");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel JLabel = new JLabel("窗口");
        Container container = getContentPane();
        container.add(JLabel);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        if (args.length != 0)
        {
            test2.main(null);
        }
        else
        {
            new test();
        }
    }
}
