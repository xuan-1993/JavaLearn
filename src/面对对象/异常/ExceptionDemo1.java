package 面对对象.异常;

import java.io.FileInputStream;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        
        //编译时异常
        try{
            //FileNotFoundException
            FileInputStream f1=new FileInputStream("abc.txt");
        }catch (Exception e){
            System.out.println(e);
        }
        //int char=1;
        
        //运行是异常
        //
    }
}
