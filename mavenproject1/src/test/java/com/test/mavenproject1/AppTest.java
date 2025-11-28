package com.test.mavenproject1;

import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
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
    	
    }
}
