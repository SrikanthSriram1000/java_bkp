package com.test.proxydesignpattren;
import java.rmi.*;
 
public interface ReportGenerator extends Remote{
 
    public String generateDailyReport() throws RemoteException;
 
}