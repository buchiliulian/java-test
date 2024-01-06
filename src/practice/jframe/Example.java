package practice.jframe;

import javax.swing.*;

public class Example {
    public static void main(String[] args) {
        new FrameWithMenu().init("Java 菜单设计");
    }

}

class FrameWithMenu extends JFrame{
    JMenuBar menubar;
    JMenu menu1,menu2,menu3,menu4,submenu11,Submenu12;
    JMenuItem menuItemOpen,menuItemFlush,menuItemPacket,menuItemClass,
                menuItemClose,menuItemSave,menuItemCut,menuItemPaste,menuItemAbout;

    void init(String s){
        setTitle(s);
        menubar = new JMenuBar();
        menu1 = new JMenu("文件");
        menu2 = new JMenu("编辑");
        menu3 = new JMenu("搜索");
        menu4 = new JMenu("帮助");

        submenu11 = new JMenu("新建");

        menuItemPacket = new JMenuItem("包");
        menuItemClass = new JMenuItem("类");
        menuItemOpen = new JMenuItem("打开");
        menuItemFlush = new JMenuItem("刷新");
        menuItemClose = new JMenuItem("关闭");
        menuItemSave = new JMenuItem("保存");
        menuItemCut = new JMenuItem("剪切");
        menuItemPaste = new JMenuItem("粘贴");
        menuItemAbout = new JMenuItem("关于");

        submenu11.add(menuItemPacket);
        submenu11.add(menuItemClass);
        menu1.add(submenu11);
        menu1.add(menuItemOpen);
        menu1.add(menuItemClose);
        menu1.add(menuItemFlush);
        menu1.add(menuItemSave);
        menu2.add(menuItemCut);
        menu2.add(menuItemPaste);
        menu4.add(menuItemAbout);

        menubar.add(menu1);
        menubar.add(menu2);
        menubar.add(menu3);
        menubar.add(menu4);

        setJMenuBar(menubar);
        setLocation(100,300);
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}
