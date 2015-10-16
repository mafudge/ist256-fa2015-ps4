package gradecalctests;

import gradecalc.GradeCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author mafudge
 */
public class GradeCalculatorTests {
    
    public GradeCalculatorTests() {
    }

    @Test
    public void test_calcQuizExperiencePoints_expect3_whenCompleteQuizzes10() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 3;
        //act
        int actual = g.calcQuizExperiencePoints(10);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void test_calcQuizExperiencePoints_expect2_whenCompleteQuizzes9() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 2;
        //act
        int actual = g.calcQuizExperiencePoints(9);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void test_calcQuizExperiencePoints_expect2_whenCompleteQuizzes8() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 2;
        //act
        int actual = g.calcQuizExperiencePoints(8);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void test_calcQuizExperiencePoints_expect1_whenCompleteQuizzes7() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 1;
        //act
        int actual = g.calcQuizExperiencePoints(7);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void test_calcQuizExperiencePoints_expect1_whenCompleteQuizzes6() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 1;
        //act
        int actual = g.calcQuizExperiencePoints(6);
        //assert
        assertEquals(expected,actual);
    }
    
    @Test
    public void test_calcQuizExperiencePoints_expect1_whenCompleteQuizzes5() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 1;
        //act
        int actual = g.calcQuizExperiencePoints(5);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void test_calcQuizExperiencePoints_expect0_whenCompleteQuizzes4() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 0;
        //act
        int actual = g.calcQuizExperiencePoints(4);
        //assert
        assertEquals(expected,actual);
    }

        @Test
    public void test_calcQuizExperiencePoints_expect0_whenCompleteQuizzes3() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 0;
        //act
        int actual = g.calcQuizExperiencePoints(3);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void test_calcQuizExperiencePoints_expect0_whenCompleteQuizzes2() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 0;
        //act
        int actual = g.calcQuizExperiencePoints(2);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void test_calcQuizExperiencePoints_expect0_whenCompleteQuizzes1() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 0;
        //act
        int actual = g.calcQuizExperiencePoints(1);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void test_calcQuizExperiencePoints_expect0_whenCompleteQuizzes0() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 0;
        //act
        int actual = g.calcQuizExperiencePoints(0);
        //assert
        assertEquals(expected,actual);
    }
    
    @Test
    public void test_calcProblemSetExperiencePoints_expect3_whenCompleteProblemSets6() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 3;
        //act
        int actual = g.calcProblemSetExperiencePoints(6);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void test_calcProblemSetExperiencePoints_expect2_whenCompleteProblemSets5() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 2;
        //act
        int actual = g.calcProblemSetExperiencePoints(5);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void test_calcProblemSetExperiencePoints_expect2_whenCompleteProblemSets4() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 2;
        //act
        int actual = g.calcProblemSetExperiencePoints(4);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void test_calcProblemSetExperiencePoints_expect1_whenCompleteProblemSets3() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 1;
        //act
        int actual = g.calcProblemSetExperiencePoints(3);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void test_calcProblemSetExperiencePoints_expect1_whenCompleteProblemSets2() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 1;
        //act
        int actual = g.calcProblemSetExperiencePoints(2);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void test_calcProblemSetExperiencePoints_expect1_whenCompleteProblemSets1() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 1;
        //act
        int actual = g.calcProblemSetExperiencePoints(1);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void test_calcProblemSetExperiencePoints_expect0_whenCompleteProblemSets0() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 0;
        //act
        int actual = g.calcProblemSetExperiencePoints(0);
        //assert
        assertEquals(expected,actual);
    }
    
    @Test
    public void test_calcProjectExperiencePoints_expect3_whenProjectPoints3() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 3;
        //act
        int actual = g.calcProjectExperiencePoints(3);
        //assert
        assertEquals(expected,actual);        
    }
    @Test
    public void test_calcProjectExperiencePoints_expect2_whenProjectPoints2() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 2;
        //act
        int actual = g.calcProjectExperiencePoints(2);
        //assert
        assertEquals(expected,actual);        
        
    }

    @Test
    public void test_calcProjectExperiencePoints_expect1_whenProjectPoints1() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 1;
        //act
        int actual = g.calcProjectExperiencePoints(1);
        //assert
        assertEquals(expected,actual);        
        
    }

    @Test
    public void test_calcProjectExperiencePoints_expect0_whenProjectPoints0() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        int expected = 0;
        //act
        int actual = g.calcProjectExperiencePoints(0);
        //assert
        assertEquals(expected,actual);        
        
    }

    @Test
    public void test_letterGrade_expectA_whenTotalExperiencePoints9() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        String expected = "A";
        //act
        String actual = g.letterGrade(9);
        //assert
        assertEquals(expected,actual);                
    }

    @Test
    public void test_letterGrade_expectAMinus_whenTotalExperiencePoints8() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        String expected = "A-";
        //act
        String actual = g.letterGrade(8);
        //assert
        assertEquals(expected,actual);                
    }

    @Test
    public void test_letterGrade_expectBPlus_whenTotalExperiencePoints7() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        String expected = "B+";
        //act
        String actual = g.letterGrade(7);
        //assert
        assertEquals(expected,actual);                
    }
    @Test
    public void test_letterGrade_expectB_whenTotalExperiencePoints6() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        String expected = "B";
        //act
        String actual = g.letterGrade(6);
        //assert
        assertEquals(expected,actual);                
    }
    @Test
    public void test_letterGrade_expectBMinus_whenTotalExperiencePoints5() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        String expected = "B-";
        //act
        String actual = g.letterGrade(5);
        //assert
        assertEquals(expected,actual);                
    }
    @Test
    public void test_letterGrade_expectCPlus_whenTotalExperiencePoints4() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        String expected = "C+";
        //act
        String actual = g.letterGrade(4);
        //assert
        assertEquals(expected,actual);                
    }
    @Test
    public void test_letterGrade_expectC_whenTotalExperiencePoints3() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        String expected = "C";
        //act
        String actual = g.letterGrade(3);
        //assert
        assertEquals(expected,actual);                
    }
    @Test
    public void test_letterGrade_expectCMinus_whenTotalExperiencePoints2() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        String expected = "C-";
        //act
        String actual = g.letterGrade(2);
        //assert
        assertEquals(expected,actual);                
    }
    @Test
    public void test_letterGrade_expectD_whenTotalExperiencePoints1() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        String expected = "D";
        //act
        String actual = g.letterGrade(1);
        //assert
        assertEquals(expected,actual);                
    }
    @Test
    public void test_letterGrade_expectF_whenTotalExperiencePoints0() {
        //arrange
        GradeCalculator g = new GradeCalculator();
        String expected = "F";
        //act
        String actual = g.letterGrade(0);
        //assert
        assertEquals(expected,actual);                
    }

}
