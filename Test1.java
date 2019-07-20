/*
根据输入的日期，计算是这一年的第几天。。
详细描述：
输入某年某月某日，判断这一天是这一年的第几天？。
接口设计及说明：

*//*****************************************************************************
Description   : 数据转换
Input Param   : year 输入年份
Month 输入月份
Day 输入天

Output Param  :
Return Value  : 成功返回0，失败返回-1（如：数据错误）
*****************************************************************************//*
public static int iConverDateToDay(int year, int month, int day)
{
*//* 在这里实现功能，将结果填入输入数组中*//*
return 0;
}

*//*****************************************************************************
Description   :
Input Param   :

Output Param  :
Return Value  : 成功:返回outDay输出计算后的第几天;
失败:返回-1
*****************************************************************************//*
public static int getOutDay()
{
return 0;
}

输入描述:
输入三行，分别是年，月，日

输出描述:
成功:返回outDay输出计算后的第几天;
失败:返回-1

示例1
输入
2012

12

31
输出
366
*/
package written_test0720;

import java.util.*;
//计算日期到天数的计算
public class Test1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int y = in.nextInt();
            int m = in.nextInt();
            int d = in.nextInt();
            int[][] nums = {{1,31},{2,28},{3,31},{4,30},{5,31},{6,30},
                    {7,31},{8,31},{9,30},{10,31},{11,30},{12,31}};
            int day = 0;
            boolean flag = false;
            if((y % 100 != 0 && y%4==0 )|| y % 400==0){
                flag = true;
                day += countDay(flag,m,d,nums);
            }else{
                day += countDay(flag,m,d,nums);
            }

            System.out.println(day);
        }
    }
    public static int countDay(boolean flag,int m,int d,int[][] nums){
        int count = 0;
        for(int i = 0;i<m-1;i++){
            count += nums[i][1];
        }
        if(flag){
            count ++;
        }
        return count+d;
    }
}
