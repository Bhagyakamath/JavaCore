package com.test.mavenproject1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.test.mavenproject1.p5.DbConnector;
import com.test.mavenproject1.p5.StudentDao;
import com.test.mavenproject1.p5.StudentDto;

public class AppTest {
    @Test
    public void testcase1() {
    	Assertions.assertTrue(true);
    }
    
    @Test
    public void dbcontest() {
    	try {
			Connection co=DbConnector.getConnection();
		} catch (Exception e) {
			fail();
		}
    }
    
    @Test
    public void dbtest2() {
    	try {
			List<StudentDto> l1=new StudentDao().getAllStudents();
		} catch (Exception e) {
			fail();
		}
    }
    
    @Test
    public void dbtest3() {
    	try {
			List<StudentDto> l1=new StudentDao().getAllStudents();
			if(l1.size()<0) fail();
		} catch (Exception e) {
			fail();
		}
    }
    
    @Test
    public void dbtest4() {
    	try {
    		StudentDto ob1=new StudentDto();
    		ob1.setSroll(1006);
    		StudentDto ob=new StudentDao().getById(ob1);
    	}
    	catch (Exception e) {
			fail();
		}
    }
    
    @ParameterizedTest
    @ValueSource(ints= {1001,1002,1003,1004,1005,1006,1007,1008,1009})
    public void dbtest5(int x) {
    	try {
			StudentDto ob2=new StudentDto();
			ob2.setSroll(x);
			StudentDto ob=new StudentDao().getById(ob2);
		} catch (Exception e) {
			fail();
		}
    }
    
    @ParameterizedTest
    @ValueSource(ints= {2001,2002,2003})
    public void dbtest6(int x) {
    	try {
			StudentDto ob2=new StudentDto();
			ob2.setSroll(x);
			StudentDto ob=new StudentDao().getById(ob2);
			fail();
		} catch (Exception e) {
//			fail();
		}
    }
    
    @Test
    public void dbtest7() {
    	try {
    		StudentDto ob2=new StudentDto();
    		ob2.setSroll(1006);
    		StudentDto ob=new StudentDao().getById(ob2);
    		assertEquals("Dipa", ob.getFirstname());
		} catch (Exception e) {
			fail();
		}
    }
    
}
