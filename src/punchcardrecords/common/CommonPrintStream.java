/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punchcardrecords.common;

import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.SwingUtilities;
import javax.swing.text.JTextComponent;

/**
 * 自定义打印控制类,将系统控制台的信息打印到指定的组件中
 * @author qiuyu
 */
public class CommonPrintStream extends PrintStream{
    
    private JTextComponent text;
    private StringBuffer sb = new StringBuffer();

    public CommonPrintStream(OutputStream out, JTextComponent text) {
        super(out);
        this.text = text;
    }

    @Override
    public void write(byte[] buf, int off, int len) {
        final String message = new String(buf, off, len);   
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                sb.append(message).append("\n");
                text.setText(sb.toString());
            }
        });
    }
    
    public void clear(){
        this.sb = new StringBuffer();
    }

    public JTextComponent getText() {
        return text;
    }

    public void setText(JTextComponent text) {
        this.text = text;
    }

    public StringBuffer getSb() {
        return sb;
    }

    public void setSb(StringBuffer sb) {
        this.sb = sb;
    }
    
}
