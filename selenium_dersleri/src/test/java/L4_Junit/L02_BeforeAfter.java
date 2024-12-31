package L4_Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class L02_BeforeAfter {

@BeforeClass
public static void BeforeClass(){
System.out.println("Tüm classlardan önce sadece bir kere çalışır.");
System.out.println("***********************************");

}

@Before
public void setup(){
    System.out.println("Her metoddan önce bir kez çalışır.");
}

@Test
public void test01(){
    System.out.println("Test 1 çalıştı.");
}

@Test
public void test02(){
    System.out.println("Test 2 çalıştı.");
}

@Test
public void test03(){
    System.out.println("Test 3 çalıştı.");
}

@After
public void tearDown(){
    System.out.println("Her metoddan sonra bir kez çalışır.");
}

@AfterClass
public static void finishAnnot(){
    System.out.println("Tüm classlardan sonra sadece bir kere çalışır.");
    System.out.println("***********************************");
}













}
