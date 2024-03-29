### 语法结构：　　

        for (初始表达式; 布尔表达式; 迭代因子) {
              循环体;
        }
for循环语句是支持迭代的一种通用结构，是最有效、最灵活的循环结构。for循环在第一次反复之前要进行初始化，即执行初始表达式;随后，对布尔表达式进行判定，若判定结果为true，则执行循环体，否则，终止循环;最后在每一次反复的时候，进行某种形式的“步进”，即执行迭代因子。
***
A. 初始化部分设置循环变量的初值

B. 条件判断部分为任意布尔表达式

C. 迭代因子控制循环变量的增减
***
for循环在执行条件判定后，先执行的循环体部分，再执行步进。

for循环结构的流程图如图3-18所示。  
![image](https://github.com/Pxd123/JAVA/blob/master/notes/%E4%B8%89.%E6%8E%A7%E5%88%B6%E8%AF%AD%E5%8F%A5/for.png)  
***
### 逗号运算符
Java里能用到逗号运算符的地方屈指可数，其中一处就是for循环的控制表达式。在控制表达式的初始化和步进控制部分，我们可以使用一系列由逗号分隔的表达式，而且那些表达式均会独立执行。

【示例3-11】逗号运算符　

    public class Test11 {
        public static void main(String[] args) { 
            for(int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
                System.out.println("i= " + i + " j= " + j); 
            } 
        }
    }
***
1. 无论在初始化还是在步进部分，语句都是顺序执行的。

2. 尽管初始化部分可设置任意数量的定义，但都属于同一类型。

3. 约定:只在for语句的控制表达式中写入与循环变量初始化，条件判断和迭代因子相关的表达式。
***
初始化部分、条件判断部分和迭代因子可以为空语句，但必须以“;”分开，如示例3-12所示。

【示例3-12】无限循环

    public class Test12 {
        public static void main(String[] args) { 
            for ( ; ; ) {    // 无限循环: 相当于 while(true)
                System.out.println("北京尚学堂");
            }
        }
    }
***
###  编译器将while(true)与for(;;)看作同一回事，都指的是无限循环。

在for语句的初始化部分声明的变量，其作用域为整个for循环体，不能在循环外部使用该变量。
