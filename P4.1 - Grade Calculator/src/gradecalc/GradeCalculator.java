package gradecalc;

/** P4.1 - GradeCalculator.Java
 * @author  [Name-And-Email-Here]
 */

public class GradeCalculator {
        
    public GradeCalculator() { }
       
    /**
     * This calculates the appropriate number of quiz experience points ) 
     * (0-3 based on the number of complete quizzes (0-10) as covered on the 
     * course syllabus.
     * @param completeQuizzes the number of complete quizzes (0-10)
     * @return number of quiz experience points, an int between 0 and 3
     */
    public int calcQuizExperiencePoints(int completeQuizzes) {
        //TODO: write code here
        return -1;
    }    
    
    /**
     * This calculates the appropriate number of problem set experience points 
     * (0-3) based on the number of complete problem sets (0-6) as covered on the
     * course syllabus.
     * @param completeProblemSets the number of complete problem sets (0-6)
     * @return number of problem set experience points int between 0 and 3
     */
    public int calcProblemSetExperiencePoints(int completeProblemSets) {
        // TODO: write code here
        return -1;
    }
         
    /**
     * This calculates the appropriate number of project experience points 
     * (0-3) based on the number of complete project components.
     * @param projectPoints the number of project experience points (0-3)
     * @return number of project points int between 0 and 3
     */
    public int calcProjectExperiencePoints(int projectPoints) {
        //TODO: write code here
        return -1;
    }
    
    /**
     * Calculates the current letter grade A, A-, B+ ,etc from the total 
     * number of experience points as per the course syllabus.
     * @param totalExperiencePoints the total number of experience points (0-9)
     * @return Letter grade representation as a string.
     */
    public String letterGrade(int totalExperiencePoints) 
    {
        // TODO: Write code here
        return "ERROR";
    }
}
