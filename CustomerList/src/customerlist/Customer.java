/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerlist;

import java.io.Serializable;

/**
 *
 * @author amey1
 */
public class Customer implements Serializable {

    int cno,cmno,cbno,camcamnt;
    String cphno;
    String cnm,caddr,cmtype,cbtype,cmonth;
    /**
     * @param args the command line arguments
     */
    Customer()
    {
        cno=cmno=cbno=camcamnt=0;
        cphno="";
        cnm=caddr=cmtype=cbtype=cmonth="";
    }
    Customer(int cno,String cphno,int cmno,int cbno,int camcamnt,String cnm,
            String caddr,String cmtype,String cbtype,String cmonth)
    {
        this.cno=cno;
        this.cphno=cphno;
        this.cmno=cmno;
        this.cbno=cbno;
        this.camcamnt=camcamnt;
        this.cnm=cnm;
        this.caddr=caddr;
        this.cmtype=cmtype;
        this.cbtype=cbtype;
        this.cmonth=cmonth;
    }
    @Override
    public String toString()
    {
        String s="Customer no :- "+cno+"\nCustomer name :- "+cnm+"\nPhone no :-"
                + " "+cphno+"\nAddress :- "+caddr+"\nno of machines :- "
                +cmno+"\nType of machine :- "+cmtype+"\nNo of batteries :- "
                +cbno+"\nType of batteries :- "+cbtype+"\nMonth of servicing :- "
                +cmonth+"\nAMC amount :- "+camcamnt;
        return s;
        
    }
}
