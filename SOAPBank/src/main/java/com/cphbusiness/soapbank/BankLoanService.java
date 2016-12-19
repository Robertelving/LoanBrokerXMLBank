/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cphbusiness.soapbank;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Skroget
 */
@WebService(serviceName = "BankLoanService")
public class BankLoanService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getInterestRate")
    public double getInterestRate(@WebParam(name = "ssn") String ssn, @WebParam(name = "creditscore") int creditscore, @WebParam(name = "amount") double amount, @WebParam(name = "duration") int duration) {
        return Math.random()*20;
    }
}
