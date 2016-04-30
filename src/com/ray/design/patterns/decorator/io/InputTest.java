package com.ray.design.patterns.decorator.io;

import java.io.*;

/**
 * IO装饰者
 * Created by dangdang on 4/30/16.
 */
public class InputTest {

    public static void main(String args[]) {
        int c;
        try {
            LowerCaseInputStream in = new LowerCaseInputStream(new BufferedInputStream(
                    new FileInputStream("/Users/dangdang/Documents/workspace/JavaWorkspace/head_first_design_patterns/src/com/ray/design/patterns/decorator/io/test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
