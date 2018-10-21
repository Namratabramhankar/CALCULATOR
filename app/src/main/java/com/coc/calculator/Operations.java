package com.coc.calculator;

import android.util.Log;

public class Operations {
    float f1,f2;
    Operations(String x, String y)
    {
        f1 = Float.parseFloat (x);
        f2 = Float.parseFloat (y);
    }
    float add()
    {
        return (f1+f2);
    }

    float sub()
    {
        return (f1-f2);
    }
    float mul()
    {
        return (f1*f2);
    }
    float div()
    {  float res;
       if (f2==0)
           return 0;
       res=f1/f2;
       return res;
    }

}
