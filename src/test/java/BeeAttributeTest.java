/**
File: BeeAttributeTest.java
Author: @author
Date: Nov 24, 2018

Description: Test the bee attributes created using decorator design pattern
 */
package test.java;


import static org.junit.Assert.*;

import java.util.Objects;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.apiary.attributeDecorator.AverageBeeImpl;
import main.java.apiary.attributeDecorator.BeeRole;
import main.java.apiary.attributeDecorator.BuckfastWorkerBee;
import main.java.apiary.attributeDecorator.CarniolanWorkerBee;
import main.java.apiary.attributeDecorator.CaucasianWorkerBee;
import main.java.apiary.attributeDecorator.GermanWorkerBee;
import main.java.apiary.attributeDecorator.IBee;
import main.java.apiary.attributeDecorator.ItalianWorkerBee;
import main.java.apiary.attributeDecorator.RussianWorkerBee;
import main.java.apiary.builder.BeeType;

/**
Class: BeeAttributeTest

Description:  This call will verify each bee types is created with correct role and attributes
 */
public class BeeAttributeTest {

    private IBee averageBee;
    private IBee germanWorkerBee;
    private IBee italianWorkerBee;
    private IBee buckfastWorkerBee;
    private IBee carniolanWorkerBee;
    private IBee russianWorkerBee;
    private IBee caucasianWorkerBee;

    /**
     Method:
     Inputs: 
     Returns: @throws java.lang.Exception
     
     Description: 
     */
    @Before
    public void setUp() throws Exception {
     // create bees to verify their role, type and attributes are correct
        averageBee = new AverageBeeImpl();
        germanWorkerBee = new GermanWorkerBee(new AverageBeeImpl());
        italianWorkerBee = new ItalianWorkerBee(new AverageBeeImpl());
        buckfastWorkerBee = new BuckfastWorkerBee(new AverageBeeImpl());
        carniolanWorkerBee = new CarniolanWorkerBee(new AverageBeeImpl());
        russianWorkerBee = new RussianWorkerBee(new AverageBeeImpl());
        caucasianWorkerBee = new CaucasianWorkerBee(new AverageBeeImpl());
    }

    /**
     Method:
     Inputs: 
     Returns: @throws java.lang.Exception
     
     Description: 
     */
    @After
    public void tearDown() throws Exception {
        averageBee = null;
        germanWorkerBee = null;
        italianWorkerBee = null;
        buckfastWorkerBee = null;
        carniolanWorkerBee = null;
        russianWorkerBee = null;
        caucasianWorkerBee = null;

    }

    /**
     * 
     Method: germanWorkerBeeTest
     Inputs: 
     Returns: 
     
     Description: Check each attribute, role and type 
     */
    @Test public void germanWorkerBeeTest() {
       
       assertTrue("Gentleness is incorrect", 2 == germanWorkerBee.getGentleness());
       assertTrue("Honey production is incorrect", 3 == germanWorkerBee.getHoneyProduction());
       assertTrue("Pollination is incorrect", 2 == germanWorkerBee.getPollination());
       assertTrue("Reproduction is incorrect", 2 == germanWorkerBee.getReproduction());
       assertTrue("Wax production is incorrect", 3 == germanWorkerBee.getWaxProduction());
       assertTrue(Objects.equals(BeeType.GERMAN, germanWorkerBee.getType()));
       assertTrue(Objects.equals(BeeRole.WORKER, germanWorkerBee.getRole()));

    }
    
    /**
     * 
     Method: italianWorkerBeeTest
     Inputs: 
     Returns: 
     
     Description: Check each attribute, role and type 
     */
    @Test public void italianWorkerBeeTest() {
       
       assertTrue("Gentleness is incorrect", 3 == italianWorkerBee.getGentleness());
       assertTrue("Honey production is incorrect", 5 == italianWorkerBee.getHoneyProduction());
       assertTrue("Pollination is incorrect", 3 == italianWorkerBee.getPollination());
       assertTrue("Reproduction is incorrect", 4 == italianWorkerBee.getReproduction());
       assertTrue("Wax production is incorrect", 1 == italianWorkerBee.getWaxProduction());
       assertTrue(Objects.equals(BeeType.ITALIAN, italianWorkerBee.getType()));
       assertTrue(Objects.equals(BeeRole.WORKER, italianWorkerBee.getRole()));

    }
    
    /**
     * 
     Method: carniolanWorkerBeeTest
     Inputs: 
     Returns: 
     
     Description: Check each attribute, role and type 
     */
    @Test public void carniolanWorkerBeeTest() {
       
       assertTrue("Gentleness is incorrect", 4 == carniolanWorkerBee.getGentleness());
       assertTrue("Honey production is incorrect", 3 == carniolanWorkerBee.getHoneyProduction());
       assertTrue("Pollination is incorrect", 4 == carniolanWorkerBee.getPollination());
       assertTrue("Reproduction is incorrect", 5 == carniolanWorkerBee.getReproduction());
       assertTrue("Wax production is incorrect", 1 == carniolanWorkerBee.getWaxProduction());
       assertTrue(Objects.equals(BeeType.CARNIOLAN, carniolanWorkerBee.getType()));
       assertTrue(Objects.equals(BeeRole.WORKER, carniolanWorkerBee.getRole()));

    }
    
    /**
     * 
     Method: buckfastWorkerBeeTest
     Inputs: 
     Returns: 
     
     Description: Check each attribute, role and type 
     */
    @Test public void buckfastWorkerBeeTest() {
       
       assertTrue("Gentleness is incorrect", 2 == buckfastWorkerBee.getGentleness());
       assertTrue("Honey production is incorrect", 3 == buckfastWorkerBee.getHoneyProduction());
       assertTrue("Pollination is incorrect", 3 == buckfastWorkerBee.getPollination());
       assertTrue("Reproduction is incorrect", 2 == buckfastWorkerBee.getReproduction());
       assertTrue("Wax production is incorrect", 1 == buckfastWorkerBee.getWaxProduction());
       assertTrue(Objects.equals(BeeType.BUCKFAST, buckfastWorkerBee.getType()));
       assertTrue(Objects.equals(BeeRole.WORKER, buckfastWorkerBee.getRole()));

    }
    
    /**
     * 
     Method: russianWorkerBeeTest
     Inputs: 
     Returns: 
     
     Description: Check each attribute, role and type 
     */
    @Test public void russianWorkerBeeTest() {
       
       assertTrue("Gentleness is incorrect", 2 == russianWorkerBee.getGentleness());
       assertTrue("Honey production is incorrect", 3 == russianWorkerBee.getHoneyProduction());
       assertTrue("Pollination is incorrect", 3 == russianWorkerBee.getPollination());
       assertTrue("Reproduction is incorrect", 3 == russianWorkerBee.getReproduction());
       assertTrue("Wax production is incorrect", 3 == russianWorkerBee.getWaxProduction());
       assertTrue(Objects.equals(BeeType.RUSSIAN, russianWorkerBee.getType()));
       assertTrue(Objects.equals(BeeRole.WORKER, russianWorkerBee.getRole()));

    }
    
    /**
     * 
     Method: caucasianWorkerBeeTest
     Inputs: 
     Returns: 
     
     Description: Check each attribute, role and type 
     */
    @Test public void caucasianWorkerBeeTest() {
       
       assertTrue("Gentleness is incorrect", 5 == caucasianWorkerBee.getGentleness());
       assertTrue("Honey production is incorrect", 2 == caucasianWorkerBee.getHoneyProduction());
       assertTrue("Pollination is incorrect", 4 == caucasianWorkerBee.getPollination());
       assertTrue("Reproduction is incorrect", 1 == caucasianWorkerBee.getReproduction());
       assertTrue("Wax production is incorrect", 4 == caucasianWorkerBee.getWaxProduction());
       assertTrue(Objects.equals(BeeType.CAUCASIAN, caucasianWorkerBee.getType()));
       assertTrue(Objects.equals(BeeRole.WORKER, caucasianWorkerBee.getRole()));

    }
    
    /**
     * 
     Method: averageBeeTest
     Inputs: 
     Returns: 
     
     Description: Check each attribute, role and type 
     */
    @Test public void averageBeeTest() {
       
       assertTrue("Gentleness is incorrect", 3 == averageBee.getGentleness());
       assertTrue("Honey production is incorrect", 3 == averageBee.getHoneyProduction());
       assertTrue("Pollination is incorrect", 3 == averageBee.getPollination());
       assertTrue("Reproduction is incorrect", 3 == averageBee.getReproduction());
       assertTrue("Wax production is incorrect", 3 == averageBee.getWaxProduction());
       assertTrue(Objects.equals(BeeType.REGULAR, averageBee.getType()));
       assertTrue(Objects.equals(BeeRole.REGULAR, averageBee.getRole()));

    }


}
