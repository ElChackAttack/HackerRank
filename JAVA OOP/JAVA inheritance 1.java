// Ran in Java 15

import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
         class Animal{
            void walk(){
                System.out.println("I am walking");
            }
        }
 class Bird extends Animal {
            void fly() {
                System.out.println("I am flying");
            }
            void sing() {
                System.out.println("I am singing");
            }
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Bird birdie = new Bird();
            birdie.walk();
            birdie.fly();
            birdie.sing();
        }

    }
