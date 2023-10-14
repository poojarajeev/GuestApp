package com.project.GuestApplication.guest.controller;

import org.glassfish.jaxb.runtime.v2.runtime.unmarshaller.XsiNilLoader;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
//
//    [4:23 PM] Phadatare, Kiran A. (RIS-MUM)
//
//    int arr=[2,5,6,4,8,10,3]
//
//    index = 3
//
//
//
//            \\output = 4,6,5,2,3,10,8


    Map<Integer,String> map1 = new HashMap<>();
//ID, Name



    Map<Integer,String> map2 = new HashMap<>();
//ID, Address



map1.put(1,"Kiran");
map1.put(2,"Amol");
map1.put(3,"Vishal");



map2.put(1,"Mumbai");
map2.put(2,"Thane");
map2.put(3,"Pune");



/* OUTPUT
ID, Name, Address
--------------------
1, Kiran, Mumbai
2, Amol, Thane
3, Vishal, Pune
*/
}
