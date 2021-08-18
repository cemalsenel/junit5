package junit5Tutorials;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class J01Assertions {

    @Test
    @DisplayName("Testing length")
    void testToAssert(){
        int actual = "abcdefg".length();
        int expected = 6;

        //1. assertEquals() => beklenen ile gerçekleşenden farklı değil ise test başarılı
        //assertEquals(expected, actual, "Test cannot pass.");
        //assertEquals(3, "abc".length(), "Test cannot pass."); => inline

        //2.assertNotEquals() => beklenen ile gerçekleşenden farklı ise test başarılı
        //assertNotEquals(expected, actual, "Not: Değerler eşit olmamalıydı");

        //3. assertTrue()
        //assertTrue(actual == expected, "True: Değerler eşit çıkmadı");

        //4.assertFalse()
        //assertFalse(expected == actual, "False: Değerler eşit çıktı");
    }

    @Test
    void testToConvertUpper(){
        String actual = "abcd".toUpperCase();
        String excepted = "ABCD";

        //assertEquals(excepted, actual, "Equal: Eşit değil.");

        //assertTrue(actual.equals(excepted), "True: Eşit değil");

        //assertNull() : parametre Null ise test başarılı sayılır
        //assertNull(actual,"Null: String Null değil");

        //assertNull() : parametre Null değil ise test başarılı sayılır
        //assertNotNull(actual, "Not Null: String Null");
    }

    @Test
    void testToContain(){

        boolean actual = "abcd".contains("hi");
        boolean expected = false;

        //assertEquals(expected, actual, "String 'hi' içeriyor fakat içermemeliydi");
    }

    @Test
    @DisplayName("split metodu ile  String dizi testi")
    void testWithArrays(){
            String str = "JUnit5 ile Unit test yapalim";
            String actual[] = str.split(" ");
            String expected[] = {"JUnit5", "ile", "Unit", "test", "yapalim"};

            //assertArrayEquals()
        //diziler birbirine eşit ise test başarılı
        assertArrayEquals(expected, actual, "Diziler birbirine eşit çıkmadı");

    }
}
