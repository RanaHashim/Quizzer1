/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.ArrayList;
import javax.swing.JRadioButton;
/**
 *
 * @author Hashim Ali Khan
 */
 //class for storing quiz 
    public class data implements java.io.Serializable{
      public String dtitle;
      public String ddescription;
      public int qno;
      public String ques;
      public String optA;
      public String optB;
      public String optC;
      public String optD;
      public String qtype;
      public Boolean r1;
      public Boolean r2;
      public Boolean r3;
      public Boolean r4;
      
      
      public data(){
      }  
    }

