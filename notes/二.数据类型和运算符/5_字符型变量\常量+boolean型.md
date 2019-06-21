### 字符型变量/常量  
字符型在内存中占2个字节，在Java中使用单引号来表示字符常量。例如’A’是一个字符，它与”A”是不同的，”A”表示含有一个字符的字符串。

        char 类型用来表示在Unicode编码表中的字符。Unicode编码被设计用来处理各种语言的文字，它占2个字节，可允许有65536个字符。

【示例2-16】字符型举例

char eChar = 'a'; 
char cChar ='中';

Unicode具有从0到65535之间的编码，他们通常用从’\u0000’到’\uFFFF’之间的十六进制值来表示（前缀为u表示Unicode） 

【示例2-17】字符型的十六进制值表示方法

char c = '\u0061';
        Java 语言中还允许使用转义字符 ‘\’ 来将其后的字符转变为其它的含义。常用的转义字符及其含义和Unicode值如表2-6所示。  
【示例2-18】转义字符
 
char c2 = '\n';  //代表换行符    

\b__退格（backspace）__\u0008  

\n__换行__\u000a  

\r__回车__\u000d  

\t__制表符（tab）__\u0009  

\“__双引号__\u0022  

\‘__单引号__\u0027  

\\__反斜杠__\u005c  

### 注意事项

* 以后我们学的String类，其实是字符序列(char sequence)。

课堂代码

/**
 * 测试字符类型
 * @author 高淇
 *
 */
public class TestPrimitiveDataType3 {  
    public static void main(String[] args) {  
        char  a = 'T';  
        char  b = '尚';  
        char c = '\u0061';  
        System.out.println(c);  
         
        //转义字符  
        System.out.println(""+'a'+'\n'+'b');   
        System.out.println(""+'a'+'\t'+'b');   
        System.out.println(""+'a'+'\''+'b');        //a'b   
         
         
        //String就是字符序列  
        String  d = "abc";  
         
    }
}
****
### boolean类型变量/常量  
boolean类型有两个常量值，true和false，在内存中占一位（不是一个字节），不可以使用 0 或非 0 的整数替代 true 和 false ，这点和C语言不同。  
boolean 类型用来判断逻辑条件，一般用于程序流程控制 。

【示例2-19】boolean类型

        boolean flag ;
        flag = true;   //或者flag=false;
        if(flag) {
                 // true分支
        } else {
                 //  false分支
        }


老鸟建议

Less is More！！请不要这样写：if ( flag == true )，只有新手才那么写。关键也很容易写错成if(flag=true)，这样就变成赋值flag 为true而不是判断！老鸟的写法是if ( flag )或者if ( !flag)
