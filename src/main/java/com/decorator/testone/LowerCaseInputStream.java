package com.decorator.testone;

import java.io.*;

/*
 * 装饰模式，将所有文本中的大写字母转为小写
 * @date 20190119
 * @Author cy
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char )c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i =offset; i < offset+ result; i++) {
                b[i] = (byte) Character.toLowerCase( (char)b[i] );
        }
        return result;
    }

    public static void main(String[] args) {
        int c ;
        InputStream inputStream;
        try{
            inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("e:/test.txt")));
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

    }
}
