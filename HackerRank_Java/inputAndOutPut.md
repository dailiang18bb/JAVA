
    https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html

必要的知识：in.nextLine();不能放在in.nextInt();代码段后面
否则in.nextLine();会读入"\n"字符，但"\n"并不会成为返回的字符
因为nextInt();接收一个整型字符,不会读取\n，nextline();读入一行文本，会读入"\n"字符，但"\n"并不会成为返回的字符

解决在nextInt();后的nextLine();会接收"\n"的问题，可以在他们中间加一个in.nextLine();语句来接收这个"\n"。

next();这个函数会扫描从有效字符起到空格，Tab，回车等结束字符之间的内容并作为String返回。
nextLine();这个函数在你输入完一些东西之后按下回车则视为输入结束，输入的内容将被作为String返回。
next();这个函数与之不同在于,next();什么都不输入直接敲回车不会返回，而nextLine()即使不输入东西直接敲回车也会返回。

____________________________________________________________________


        https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
        
        
Converters and Flags Used in TestFormat.java

| Converter | Flag | Explanation                                                                                                         |
|-----------|------|---------------------------------------------------------------------------------------------------------------------|
| d         |      | A decimal integer.                                                                                                  |
| f         |      | A float.                                                                                                            |
| n         |      | A new line character appropriate to the platform running the application. You should always use %n, rather than \n. |
| tB        |      | A date & time conversion—locale-specific full name of month.                                                        |
| td, te    |      | A date & time conversion—2-digit day of month. td has leading zeroes as needed, te does not.                        |
| ty, tY    |      | A date & time conversion—ty = 2-digit year, tY = 4-digit year.                                                      |
| tl        |      | A date & time conversion—hour in 12-hour clock.                                                                     |
| tM        |      | A date & time conversion—minutes in 2 digits, with leading zeroes as necessary.                                     |
| tp        |      | A date & time conversion—locale-specific am/pm (lower case).                                                        |
| tm        |      | A date & time conversion—months in 2 digits, with leading zeroes as necessary.                                      |
| tD        |      | A date & time conversion—date as %tm%td%ty                                                                          |
|           | 08   | Eight characters in width, with leading zeroes as necessary.                                                        |
|           | +    | Includes sign, whether positive or negative.                                                                        |
|           | ,    | Includes locale-specific grouping characters.                                                                       |
|           | -    | Left-justified..                                                                                                    |
|           | .3   | Three places after decimal point.                                                                                   |
|           | 10.3 | Ten characters in width, right justified, with three places after decimal point.                                    |


System.out.printf( "%-15s%03d %n", s1, x);

Printf is very powerful

        System.out.println(n + " x " + i + " = " + n*i);
        System.out.printf("%d x %d = %d%n",n,i,n*i);

